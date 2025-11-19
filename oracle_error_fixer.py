"""
Oracle PL/SQL 컴파일 에러 자동 수정 스크립트
LLM을 사용하여 Oracle 프로시저/함수의 컴파일 에러를 자동으로 수정합니다.
"""

import os
import json
import requests
from pathlib import Path
from typing import Dict, List, Tuple

# ==================== 설정 영역 ====================
# 여기에서 필요한 정보를 입력하세요

# 입력 폴더 경로 (SQL 파일과 JSON 에러 로그가 있는 폴더)
INPUT_FOLDER = r"data"

# LLM API 설정
LLM_API_URL = "https://your-company-api.com/v1/chat/completions"
LLM_API_KEY = "your-api-key-here"
LLM_MODEL = "gpt-4.1"

# 출력 폴더 이름 (INPUT_FOLDER 하위에 생성됨)
OUTPUT_FOLDER_NAME = "output"

# 에러 발생 라인 주변에서 추출할 코드 라인 수 (앞뒤로)
CONTEXT_LINES = 15

# 최대 재시도 횟수 (LLM 요청 실패 시)
MAX_RETRIES = 3

# LLM 요청 타임아웃 (초)
REQUEST_TIMEOUT = 120

# ==================== 설정 끝 ====================


class OracleErrorFixer:
    """Oracle 컴파일 에러를 LLM으로 수정하는 클래스"""
    
    def __init__(self, input_folder: str, api_url: str, api_key: str, model: str):
        self.input_folder = Path(input_folder)
        self.output_folder = self.input_folder / OUTPUT_FOLDER_NAME
        self.api_url = api_url
        self.api_key = api_key
        self.model = model
        
        # 출력 폴더 생성
        self.output_folder.mkdir(exist_ok=True)
        
    def find_files(self) -> Tuple[List[Path], List[Path]]:
        """입력 폴더에서 SQL 파일과 JSON 파일을 찾습니다."""
        sql_files = list(self.input_folder.glob("*.sql"))
        json_files = list(self.input_folder.glob("*.json"))
        
        print(f"✓ SQL 파일 {len(sql_files)}개 발견")
        print(f"✓ JSON 에러 로그 파일 {len(json_files)}개 발견")
        
        return sql_files, json_files
    
    def load_error_log(self, json_file: Path) -> Dict:
        """JSON 에러 로그 파일을 로드합니다."""
        try:
            with open(json_file, 'r', encoding='utf-8') as f:
                return json.load(f)
        except Exception as e:
            print(f"✗ 에러 로그 로드 실패 ({json_file.name}): {e}")
            return {}
    
    def load_sql_file(self, sql_file: Path) -> str:
        """SQL 파일을 로드합니다."""
        try:
            with open(sql_file, 'r', encoding='utf-8') as f:
                return f.read()
        except Exception as e:
            print(f"✗ SQL 파일 로드 실패 ({sql_file.name}): {e}")
            return ""
    
    def parse_errors(self, error_data: Dict) -> List[Dict]:
        """에러 로그 JSON에서 에러 정보를 추출하고 정렬합니다."""
        all_errors = []
        
        for query, errors in error_data.items():
            if isinstance(errors, list):
                all_errors.extend(errors)
        
        # LINE 번호로 정렬
        all_errors.sort(key=lambda x: x.get('LINE', 0))
        
        return all_errors
    
    def format_error_info(self, errors: List[Dict]) -> str:
        """에러 정보를 LLM이 이해하기 쉬운 형식으로 포맷팅합니다."""
        if not errors:
            return "에러 정보 없음"
        
        error_text = "컴파일 에러 목록:\n\n"
        
        for idx, error in enumerate(errors, 1):
            line = error.get('LINE', '?')
            position = error.get('POSITION', '?')
            text = error.get('TEXT', '')
            error_type = error.get('ATTRIBUTE', 'ERROR')
            
            error_text += f"{idx}. [{error_type}] Line {line}, Position {position}\n"
            error_text += f"   메시지: {text}\n\n"
        
        return error_text
    
    def extract_sql_header(self, sql_lines: List[str]) -> str:
        """프로시저/함수의 헤더와 선언부를 추출합니다."""
        header_lines = []
        in_header = False
        declare_found = False
        begin_found = False
        
        for i, line in enumerate(sql_lines):
            upper_line = line.upper().strip()
            
            # CREATE 시작 찾기
            if 'CREATE' in upper_line and ('PROCEDURE' in upper_line or 'FUNCTION' in upper_line):
                in_header = True
            
            if in_header:
                header_lines.append(f"{i+1}: {line.rstrip()}")
                
                # DECLARE 또는 AS/IS 찾기
                if 'DECLARE' in upper_line or ' AS ' in upper_line or ' IS ' in upper_line:
                    declare_found = True
                
                # BEGIN 찾으면 중단
                if 'BEGIN' in upper_line and (declare_found or len(header_lines) > 5):
                    begin_found = True
                    break
        
        return "\n".join(header_lines) if header_lines else ""
    
    def extract_error_context(self, sql_lines: List[str], line_number: int) -> str:
        """에러가 발생한 라인 주변의 코드를 추출합니다."""
        start_line = max(0, line_number - CONTEXT_LINES - 1)
        end_line = min(len(sql_lines), line_number + CONTEXT_LINES)
        
        context = []
        for i in range(start_line, end_line):
            marker = " >>> " if i == line_number - 1 else "     "
            context.append(f"{marker}{i+1}: {sql_lines[i].rstrip()}")
        
        return "\n".join(context)
    
    def create_error_contexts(self, sql_content: str, errors: List[Dict]) -> str:
        """모든 에러 위치의 코드 스니펫을 생성합니다."""
        sql_lines = sql_content.split('\n')
        
        # 헤더 추출
        header = self.extract_sql_header(sql_lines)
        
        contexts = []
        contexts.append("=== 프로시저/함수 헤더 및 선언부 ===\n")
        contexts.append(header)
        contexts.append("\n")
        
        # 각 에러 위치의 컨텍스트 추출
        for idx, error in enumerate(errors, 1):
            line_num = error.get('LINE', 0)
            if line_num == 0 or line_num > len(sql_lines):
                continue
            
            contexts.append(f"\n=== 에러 #{idx}: Line {line_num} 주변 코드 ===")
            contexts.append(f"에러: {error.get('TEXT', '')}\n")
            contexts.append(self.extract_error_context(sql_lines, line_num))
        
        return "\n".join(contexts)
    
    def create_llm_prompt(self, sql_content: str, errors: List[Dict], procedure_name: str) -> Tuple[str, str]:
        """LLM에게 전달할 시스템 메시지와 유저 메시지를 생성합니다."""
        
        # 에러 컨텍스트 생성
        error_contexts = self.create_error_contexts(sql_content, errors)
        error_info = self.format_error_info(errors)
        
        system_message = """당신은 Oracle Database 19c PL/SQL 전문가입니다.
당신의 임무는 컴파일 에러를 수정하되, 코드의 실행 결과가 변하지 않도록 하는 것입니다.

핵심 원칙:
수정 전과 후의 코드가 동일한 비즈니스 로직을 수행해야 합니다.
데이터 조회/저장/계산 결과가 달라져서는 안됩니다.

응답 형식 (순수 JSON만):
{
  "fixes": [
    {
      "start_line": 시작_라인번호,
      "end_line": 종료_라인번호,
      "original": "원본 코드",
      "fixed": "수정된 코드",
      "reason": "수정 이유"
    }
  ]
}

주의: start_line과 end_line을 정확히 지정하고, original에는 해당 범위의 원본 코드 전체를 포함하세요."""

        user_message = f"""다음은 컴파일 에러가 발생한 Oracle PL/SQL 코드입니다.

프로시저/함수 이름: {procedure_name}

{error_info}

{error_contexts}

위 에러들을 수정하되, 코드의 실행 결과는 동일하게 유지해야 합니다.
각 에러에 대한 수정 방안을 JSON 형식으로 제공해주세요."""

        return system_message, user_message
    
    def call_llm(self, system_message: str, user_message: str) -> Dict:
        """LLM API를 호출하여 수정 방안을 JSON 형식으로 받습니다."""
        
        headers = {
            "Authorization": f"Bearer {self.api_key}",
            "Content-Type": "application/json"
        }
        
        body = {
            "messages": [
                {
                    "role": "system",
                    "content": system_message
                },
                {
                    "role": "user",
                    "content": user_message
                }
            ],
            "model": self.model
        }
        
        for attempt in range(MAX_RETRIES):
            try:
                print(f"   LLM API 호출 중... (시도 {attempt + 1}/{MAX_RETRIES})")
                
                response = requests.post(
                    self.api_url,
                    headers=headers,
                    json=body,
                    timeout=REQUEST_TIMEOUT
                )
                
                response.raise_for_status()
                
                # API 응답을 텍스트로 받음
                llm_response = response.text
                
                # JSON 형식으로 파싱 시도
                return self.parse_llm_fixes(llm_response)
                    
            except requests.exceptions.Timeout:
                print(f"   ⚠ 타임아웃 발생 (시도 {attempt + 1}/{MAX_RETRIES})")
            except requests.exceptions.RequestException as e:
                print(f"   ⚠ API 요청 실패: {e} (시도 {attempt + 1}/{MAX_RETRIES})")
            except Exception as e:
                print(f"   ⚠ 예상치 못한 오류: {e} (시도 {attempt + 1}/{MAX_RETRIES})")
        
        raise Exception("LLM API 호출 실패: 최대 재시도 횟수 초과")
    
    def parse_llm_fixes(self, response: str) -> Dict:
        """LLM 응답 문자열에서 JSON을 추출하고 파싱합니다."""
        original_response = response
        
        # 1. 마크다운 코드 블록 제거
        if "```json" in response:
            # ```json 과 ``` 사이의 내용 추출
            try:
                response = response.split("```json", 1)[1].split("```", 1)[0]
            except IndexError:
                pass
        elif "```" in response:
            # ``` 와 ``` 사이의 내용 추출
            try:
                response = response.split("```", 1)[1].split("```", 1)[0]
            except IndexError:
                pass
        
        response = response.strip()
        
        # 2. JSON 파싱 시도
        try:
            fixes_data = json.loads(response)
            
            # fixes 키가 있는지 확인
            if 'fixes' in fixes_data:
                return fixes_data
            else:
                print(f"   ⚠ JSON에 'fixes' 키가 없습니다. 키 목록: {list(fixes_data.keys())}")
                return {"fixes": []}
                
        except json.JSONDecodeError as e:
            print(f"   ✗ JSON 파싱 실패: {e}")
            print(f"   응답 앞부분 (500자): {response[:500]}")
            print(f"   전체 응답 길이: {len(original_response)}자")
            
            # 3. JSON 객체를 찾아서 추출 시도 (마지막 수단)
            try:
                # { 로 시작하는 부분 찾기
                start = response.find('{')
                if start != -1:
                    # 매칭되는 } 찾기
                    bracket_count = 0
                    for i in range(start, len(response)):
                        if response[i] == '{':
                            bracket_count += 1
                        elif response[i] == '}':
                            bracket_count -= 1
                            if bracket_count == 0:
                                json_str = response[start:i+1]
                                fixes_data = json.loads(json_str)
                                if 'fixes' in fixes_data:
                                    return fixes_data
                print(f"   ✗ JSON 추출 실패")
            except (json.JSONDecodeError, KeyError, IndexError):
                pass
            
            return {"fixes": []}
    
    def apply_fixes(self, sql_content: str, fixes: List[Dict]) -> str:
        """LLM이 제안한 수정 사항을 원본 SQL에 적용합니다."""
        sql_lines = sql_content.split('\n')
        
        # 시작 라인 번호 역순으로 정렬 (뒤에서부터 수정하면 앞쪽 라인 번호가 변하지 않음)
        sorted_fixes = sorted(fixes, key=lambda x: x.get('start_line', x.get('line', 0)), reverse=True)
        
        applied_count = 0
        for fix in sorted_fixes:
            # 새 형식 (start_line, end_line) 또는 구 형식 (line) 지원
            start_line = fix.get('start_line', fix.get('line'))
            end_line = fix.get('end_line', fix.get('line'))
            original = fix.get('original', '').strip()
            fixed = fix.get('fixed', '')
            reason = fix.get('reason', '')
            
            if not start_line or start_line < 1 or start_line > len(sql_lines):
                print(f"   ⚠ 잘못된 시작 라인 번호: {start_line}")
                continue
            
            if not end_line or end_line < start_line or end_line > len(sql_lines):
                print(f"   ⚠ 잘못된 종료 라인 번호: {end_line}")
                continue
            
            # 라인 인덱스 (0-based)
            start_idx = start_line - 1
            end_idx = end_line - 1
            
            # 원본 코드 추출
            original_lines = sql_lines[start_idx:end_idx+1]
            original_text = '\n'.join([line.strip() for line in original_lines])
            
            # 원본 코드가 일치하는지 확인 (부분 매칭 허용)
            if original:
                original_normalized = ''.join(original.split()).upper()
                current_normalized = ''.join(original_text.split()).upper()
                
                if original_normalized not in current_normalized and current_normalized not in original_normalized:
                    print(f"   ⚠ Line {start_line}-{end_line}: 원본 코드 불일치")
                    print(f"     기대: {original[:50]}")
                    print(f"     실제: {original_text[:50]}")
                    
                    # 유사도 확인
                    similarity = self.calculate_similarity(original_normalized, current_normalized)
                    if similarity < 0.6:
                        print(f"     유사도 너무 낮음 ({similarity:.1%}), 스킵")
                        continue
                    else:
                        print(f"     유사도 {similarity:.1%}, 적용 시도")
            
            # 들여쓰기 유지
            indent = len(sql_lines[start_idx]) - len(sql_lines[start_idx].lstrip())
            
            # fixed 코드를 줄 단위로 분리
            if '\n' in fixed:
                fixed_lines = [' ' * indent + line.lstrip() for line in fixed.split('\n')]
            else:
                fixed_lines = [' ' * indent + fixed.lstrip()]
            
            # 원본 라인 범위 삭제하고 새 라인 삽입
            del sql_lines[start_idx:end_idx+1]
            for i, line in enumerate(fixed_lines):
                sql_lines.insert(start_idx + i, line)
            
            line_range = f"{start_line}-{end_line}" if start_line != end_line else str(start_line)
            print(f"   ✓ Line {line_range} 수정 완료: {reason[:50]}")
            applied_count += 1
        
        print(f"   총 {applied_count}/{len(fixes)}개 수정 적용")
        return '\n'.join(sql_lines)
    
    def calculate_similarity(self, str1: str, str2: str) -> float:
        """두 문자열의 유사도를 계산합니다 (0.0 ~ 1.0)."""
        if not str1 or not str2:
            return 0.0
        
        # 짧은 문자열 기준으로 매칭 문자 수 계산
        shorter = min(len(str1), len(str2))
        longer = max(len(str1), len(str2))
        
        matches = sum(c1 == c2 for c1, c2 in zip(str1, str2))
        return matches / longer if longer > 0 else 0.0
    
    def similar_enough(self, str1: str, str2: str) -> bool:
        """두 문자열이 충분히 유사한지 확인합니다."""
        # 공백 제거하고 비교
        s1 = ''.join(str1.split()).upper()
        s2 = ''.join(str2.split()).upper()
        
        # 80% 이상 일치하면 유사하다고 판단
        if not s1 or not s2:
            return False
        
        matches = sum(c1 == c2 for c1, c2 in zip(s1, s2))
        max_len = max(len(s1), len(s2))
        similarity = matches / max_len if max_len > 0 else 0
        
        return similarity >= 0.8
    
    def match_sql_with_errors(self, sql_files: List[Path], json_files: List[Path]) -> List[Tuple[Path, Path]]:
        """SQL 파일과 해당하는 에러 로그 JSON을 매칭합니다."""
        matched_pairs = []
        
        for sql_file in sql_files:
            # SQL 파일 내용에서 프로시저/함수 이름 추출 시도
            sql_content = self.load_sql_file(sql_file)
            
            # JSON 파일에서 매칭되는 것 찾기
            for json_file in json_files:
                error_data = self.load_error_log(json_file)
                
                # JSON 내의 에러에서 NAME 필드 확인
                for query, errors in error_data.items():
                    if isinstance(errors, list) and len(errors) > 0:
                        procedure_name = errors[0].get('NAME', '')
                        
                        # SQL 파일명이나 내용에 프로시저 이름이 포함되어 있는지 확인
                        if procedure_name and (
                            procedure_name.lower() in sql_file.stem.lower() or
                            procedure_name.upper() in sql_content.upper()
                        ):
                            matched_pairs.append((sql_file, json_file))
                            break
                
                if any(pair[0] == sql_file for pair in matched_pairs):
                    break
        
        # 매칭되지 않은 SQL 파일은 같은 이름의 JSON 파일과 매칭 시도
        for sql_file in sql_files:
            if not any(pair[0] == sql_file for pair in matched_pairs):
                json_file = self.input_folder / f"{sql_file.stem}.json"
                if json_file.exists():
                    matched_pairs.append((sql_file, json_file))
        
        return matched_pairs
    
    def extract_procedure_name(self, sql_content: str, error_data: Dict) -> str:
        """SQL 내용이나 에러 로그에서 프로시저/함수 이름을 추출합니다."""
        # 먼저 에러 로그에서 추출 시도
        for query, errors in error_data.items():
            if isinstance(errors, list) and len(errors) > 0:
                name = errors[0].get('NAME', '')
                if name:
                    return name
        
        # SQL 내용에서 추출 시도
        import re
        pattern = r'CREATE\s+(?:OR\s+REPLACE\s+)?(?:PROCEDURE|FUNCTION)\s+([^\s\(]+)'
        match = re.search(pattern, sql_content, re.IGNORECASE)
        if match:
            return match.group(1)
        
        return "UNKNOWN"
    
    def save_fixed_sql(self, sql_content: str, original_filename: str) -> Path:
        """수정된 SQL을 출력 폴더에 저장합니다."""
        output_file = self.output_folder / f"fixed_{original_filename}"
        
        try:
            with open(output_file, 'w', encoding='utf-8') as f:
                f.write(sql_content)
            print(f"✓ 수정된 SQL 저장 완료: {output_file.name}")
            return output_file
        except Exception as e:
            print(f"✗ 저장 실패: {e}")
            raise
    
    def process(self):
        """전체 프로세스를 실행합니다."""
        print("=" * 70)
        print("Oracle PL/SQL 컴파일 에러 자동 수정 시작")
        print("=" * 70)
        print(f"\n입력 폴더: {self.input_folder}")
        print(f"출력 폴더: {self.output_folder}\n")
        
        # 파일 찾기
        sql_files, json_files = self.find_files()
        
        if not sql_files:
            print("\n✗ SQL 파일이 없습니다.")
            return
        
        if not json_files:
            print("\n✗ JSON 에러 로그 파일이 없습니다.")
            return
        
        # SQL과 에러 로그 매칭
        print("\n파일 매칭 중...")
        matched_pairs = self.match_sql_with_errors(sql_files, json_files)
        
        if not matched_pairs:
            print("✗ 매칭되는 SQL-JSON 쌍을 찾을 수 없습니다.")
            print("   SQL 파일과 JSON 파일의 이름을 동일하게 맞춰주세요.")
            return
        
        print(f"✓ {len(matched_pairs)}개의 SQL-JSON 쌍 매칭 완료\n")
        
        # 각 쌍 처리
        success_count = 0
        fail_count = 0
        
        for idx, (sql_file, json_file) in enumerate(matched_pairs, 1):
            print(f"\n[{idx}/{len(matched_pairs)}] 처리 중: {sql_file.name}")
            print(f"   에러 로그: {json_file.name}")
            
            try:
                # SQL 로드
                sql_content = self.load_sql_file(sql_file)
                if not sql_content:
                    print(f"✗ SQL 파일이 비어있습니다. 스킵합니다.")
                    fail_count += 1
                    continue
                
                # 에러 로그 로드
                error_data = self.load_error_log(json_file)
                if not error_data:
                    print(f"✗ 에러 로그가 비어있습니다. 스킵합니다.")
                    fail_count += 1
                    continue
                
                # 에러 파싱
                errors = self.parse_errors(error_data)
                if not errors:
                    print(f"✗ 파싱된 에러가 없습니다. 스킵합니다.")
                    fail_count += 1
                    continue
                
                print(f"   총 {len(errors)}개의 컴파일 에러 발견")
                
                # 프로시저 이름 추출
                procedure_name = self.extract_procedure_name(sql_content, error_data)
                print(f"   프로시저/함수: {procedure_name}")
                
                # LLM 프롬프트 생성
                system_msg, user_msg = self.create_llm_prompt(sql_content, errors, procedure_name)
                
                # LLM 호출 - 수정 방안을 JSON으로 받음
                fixes_data = self.call_llm(system_msg, user_msg)
                
                if not fixes_data or 'fixes' not in fixes_data:
                    print(f"✗ LLM이 유효한 수정 방안을 제공하지 않았습니다.")
                    fail_count += 1
                    continue
                
                fixes = fixes_data['fixes']
                print(f"   LLM이 {len(fixes)}개의 수정 사항 제안")
                
                # 원본 SQL에 수정 사항 적용
                fixed_sql = self.apply_fixes(sql_content, fixes)
                
                # 저장
                self.save_fixed_sql(fixed_sql, sql_file.name)
                
                success_count += 1
                print(f"✓ 완료")
                
            except Exception as e:
                print(f"✗ 처리 실패: {e}")
                fail_count += 1
        
        # 결과 요약
        print("\n" + "=" * 70)
        print("처리 완료")
        print("=" * 70)
        print(f"성공: {success_count}개")
        print(f"실패: {fail_count}개")
        print(f"출력 폴더: {self.output_folder}")
        print("=" * 70)


def main():
    """메인 함수"""
    # 설정 검증
    if not Path(INPUT_FOLDER).exists():
        print(f"✗ 입력 폴더가 존재하지 않습니다: {INPUT_FOLDER}")
        print("   스크립트 상단의 INPUT_FOLDER 경로를 확인해주세요.")
        return
    
    if LLM_API_URL == "https://your-company-api.com/v1/chat/completions":
        print("⚠ 경고: LLM API URL이 기본값입니다. 올바른 URL을 입력해주세요.")
    
    if LLM_API_KEY == "your-api-key-here":
        print("⚠ 경고: LLM API 키가 기본값입니다. 올바른 키를 입력해주세요.")
    
    # 실행
    fixer = OracleErrorFixer(
        input_folder=INPUT_FOLDER,
        api_url=LLM_API_URL,
        api_key=LLM_API_KEY,
        model=LLM_MODEL
    )
    
    fixer.process()


if __name__ == "__main__":
    main()

