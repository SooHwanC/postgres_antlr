import json
import requests
import argparse
from typing import Dict, List, Tuple
from pathlib import Path
import os


# ==================== 설정 영역 (여기를 수정하세요) ====================
API_URL = "https://your-company-api.com/chat"
API_KEY = "your-api-key-here"
MODEL = "gpt-4.1"

# JSON과 SQL 파일이 있는 폴더 경로 (이 파일과 같은 폴더를 기본값으로)
INPUT_FOLDER = r"C:\Users\sh\Desktop\test"

# 오류 JSON 파일명
ERRORS_JSON_FILE = "errors.json"

# 수정할 SQL 파일명
SQL_FILE = "procedure.sql"

# 오류 라인 주변으로 포함할 라인 수
CONTEXT_LINES = 50
# ====================================================================


class OracleProcedureFixer:
    def __init__(self, api_url: str, api_key: str, model: str = "gpt-4.1", context_lines: int = 50):
        """
        오라클 프로시저 오류 수정기 초기화
        
        Args:
            api_url: LLM API URL
            api_key: API 인증 키
            model: 사용할 모델명
            context_lines: 오류 라인 주변으로 포함할 라인 수
        """
        self.api_url = api_url
        self.api_key = api_key
        self.model = model
        self.context_lines = context_lines
    
    def parse_errors(self, errors_json: str) -> List[Dict]:
        """
        JSON 형태의 오류를 파싱
        
        Args:
            errors_json: JSON 문자열 또는 파일 경로
            
        Returns:
            오류 리스트
        """
        try:
            # JSON 파일인 경우
            if Path(errors_json).exists():
                with open(errors_json, 'r', encoding='utf-8') as f:
                    data = json.load(f)
            else:
                # JSON 문자열인 경우
                data = json.loads(errors_json)
            
            # 첫 번째 쿼리의 결과를 가져옴
            first_key = list(data.keys())[0]
            errors = data[first_key]
            
            return errors
        except Exception as e:
            print(f"오류 파싱 실패: {e}")
            return []
    
    def read_sql_file(self, sql_file_path: str) -> List[str]:
        """
        SQL 파일을 라인별로 읽기
        
        Args:
            sql_file_path: SQL 파일 경로
            
        Returns:
            SQL 파일 라인 리스트
        """
        try:
            with open(sql_file_path, 'r', encoding='utf-8') as f:
                return f.readlines()
        except Exception as e:
            print(f"SQL 파일 읽기 실패: {e}")
            return []
    
    def group_errors_by_proximity(self, errors: List[Dict], proximity: int = 100) -> List[List[Dict]]:
        """
        가까운 라인의 오류들을 그룹화
        
        Args:
            errors: 오류 리스트
            proximity: 그룹화할 라인 간격
            
        Returns:
            그룹화된 오류 리스트
        """
        if not errors:
            return []
        
        # LINE으로 정렬
        sorted_errors = sorted(errors, key=lambda x: x.get('LINE', 0))
        
        groups = []
        current_group = [sorted_errors[0]]
        
        for error in sorted_errors[1:]:
            # 현재 그룹의 마지막 오류와 비교
            last_line = current_group[-1].get('LINE', 0)
            current_line = error.get('LINE', 0)
            
            if current_line - last_line <= proximity:
                # 같은 그룹에 추가
                current_group.append(error)
            else:
                # 새 그룹 시작
                groups.append(current_group)
                current_group = [error]
        
        # 마지막 그룹 추가
        groups.append(current_group)
        
        return groups
    
    def extract_context(self, sql_lines: List[str], error_group: List[Dict]) -> Tuple[str, int, int]:
        """
        오류 그룹에 대한 컨텍스트 추출
        
        Args:
            sql_lines: SQL 파일의 모든 라인
            error_group: 오류 그룹
            
        Returns:
            (컨텍스트 코드, 시작 라인, 끝 라인) 튜플
        """
        # 그룹 내 최소/최대 라인 번호 찾기
        min_line = min(err.get('LINE', 1) for err in error_group)
        max_line = max(err.get('LINE', 1) for err in error_group)
        
        # 컨텍스트 범위 계산 (1-based index)
        start_line = max(1, min_line - self.context_lines)
        end_line = min(len(sql_lines), max_line + self.context_lines)
        
        # 컨텍스트 추출 (0-based index로 변환)
        context_lines = sql_lines[start_line - 1:end_line]
        context = ''.join(context_lines)
        
        return context, start_line, end_line
    
    def build_error_summary(self, error_group: List[Dict], base_line: int) -> str:
        """
        오류 그룹 정보를 요약 (상대 라인 번호 사용)
        
        Args:
            error_group: 오류 그룹
            base_line: 시작 라인 번호
            
        Returns:
            오류 요약 문자열
        """
        error_summary = []
        for idx, error in enumerate(error_group, 1):
            absolute_line = error.get('LINE', 'N/A')
            relative_line = absolute_line - base_line + 1 if isinstance(absolute_line, int) else 'N/A'
            position = error.get('POSITION', 'N/A')
            text = error.get('TEXT', '')
            error_summary.append(
                f"{idx}. 절대 Line {absolute_line} (표시된 코드의 Line {relative_line}), Position {position}: {text}"
            )
        
        return "\n".join(error_summary)
    
    def create_fix_prompt(self, context: str, error_group: List[Dict], start_line: int, end_line: int) -> str:
        """
        LLM에게 보낼 프롬프트 생성
        
        Args:
            context: 오류 주변 컨텍스트 코드
            error_group: 오류 그룹
            start_line: 컨텍스트 시작 라인
            end_line: 컨텍스트 끝 라인
            
        Returns:
            프롬프트 문자열
        """
        error_summary = self.build_error_summary(error_group, start_line)
        
        prompt = f"""당신은 오라클 데이터베이스와 PL/SQL 전문가입니다.
아래의 오라클 프로시저 일부에서 컴파일 오류가 발생했습니다. 오류만 정확히 수정해주세요.

## 컨텍스트 정보:
- 전체 프로시저 중 Line {start_line} ~ Line {end_line} 부분입니다.
- 아래 코드에서 Line 1은 원본 파일의 Line {start_line}에 해당합니다.

## 컴파일 오류 목록:
{error_summary}

## 해당 부분의 코드:
```sql
{context}
```

## 절대적으로 지켜야 할 규칙:
1. 오류 메시지에서 지적한 문제만 수정하세요.
2. 원본 코드를 최대한 그대로 유지하세요.
3. 절대로 주석을 추가하지 마세요 (/* TODO */, /* 수정 필요 */ 등 금지).
4. 절대로 설명 텍스트를 추가하지 마세요.
5. 추측으로 코드를 변경하지 마세요.
6. 컬럼명, 테이블명, 변수명 등 확실하지 않은 것은 원본 그대로 두세요.
7. 수정된 코드는 즉시 실행 가능해야 합니다.
8. 원본과 동일한 로직을 유지해야 합니다.

## 출력 형식:
"=== 수정된 코드 시작 ===" 이라고 쓴 후
수정된 전체 코드를 제공하고, "=== 수정된 코드 끝 ===" 으로 마무리하세요.

설명이나 사족은 절대 넣지 마세요. 코드만 제공하세요.

## 수정 예시:
잘못된 수정 (절대 금지):
```sql
SELECT 
  /* 이 부분은 실제 컬럼에 맞게 작성 필요 */
FROM table_name
```

올바른 수정:
```sql
SELECT 
  column1, column2  -- 원본에 있던 컬럼 유지
FROM table_name
```

반드시 원본 코드의 모든 컬럼, 테이블, 변수를 그대로 유지하면서 오류만 수정하세요.
"""
        return prompt
    
    def call_llm(self, prompt: str) -> str:
        """
        LLM API 호출
        
        Args:
            prompt: 프롬프트 문자열
            
        Returns:
            LLM 응답 텍스트
        """
        headers = {
            "Authorization": self.api_key,
            "Content-Type": "application/json"
        }
        
        payload = {
            "messages": [
                {
                    "role": "system",
                    "content": "당신은 오라클 데이터베이스와 PL/SQL 프로그래밍 전문가입니다. 코드의 오류를 정확하게 분석하고 최소한의 수정으로 문제를 해결할 수 있습니다."
                },
                {
                    "role": "user",
                    "content": prompt
                }
            ],
            "model": self.model
        }
        
        try:
            response = requests.post(
                self.api_url,
                headers=headers,
                json=payload,
                timeout=120
            )
            response.raise_for_status()
            
            # 응답이 text 문자열로 온다고 했으므로
            result = response.text
            return result
            
        except requests.exceptions.RequestException as e:
            print(f"LLM API 호출 실패: {e}")
            return ""
    
    def extract_fixed_code(self, llm_response: str) -> str:
        """
        LLM 응답에서 수정된 코드 추출
        
        Args:
            llm_response: LLM 응답
            
        Returns:
            수정된 SQL 코드
        """
        # 마커를 사용하여 코드 추출
        start_marker = "=== 수정된 코드 시작 ==="
        end_marker = "=== 수정된 코드 끝 ==="
        
        try:
            start_idx = llm_response.find(start_marker)
            end_idx = llm_response.find(end_marker)
            
            if start_idx != -1 and end_idx != -1:
                code = llm_response[start_idx + len(start_marker):end_idx].strip()
                # SQL 코드 블록 마커 제거
                code = code.replace("```sql", "").replace("```", "").strip()
                return code
            else:
                # 마커가 없으면 전체 응답 반환
                print("경고: 코드 마커를 찾을 수 없습니다.")
                return ""
                
        except Exception as e:
            print(f"코드 추출 실패: {e}")
            return ""
    
    def merge_fixed_code(self, original_lines: List[str], fixed_code: str, start_line: int, end_line: int) -> List[str]:
        """
        수정된 코드를 원본에 병합
        
        Args:
            original_lines: 원본 SQL 라인 리스트
            fixed_code: 수정된 코드
            start_line: 수정 시작 라인 (1-based)
            end_line: 수정 끝 라인 (1-based)
            
        Returns:
            병합된 SQL 라인 리스트
        """
        # 수정된 코드를 라인으로 분리
        fixed_lines = fixed_code.split('\n')
        
        # 마지막 라인에 개행 문자 추가 (원본 형식 유지)
        if fixed_lines:
            fixed_lines = [line + '\n' for line in fixed_lines[:-1]] + [fixed_lines[-1]]
            if not fixed_lines[-1].endswith('\n') and end_line < len(original_lines):
                fixed_lines[-1] += '\n'
        
        # 병합: 앞부분 + 수정된 부분 + 뒷부분
        merged = (
            original_lines[:start_line - 1] +  # 앞부분 (0-based index)
            fixed_lines +                       # 수정된 부분
            original_lines[end_line:]           # 뒷부분 (0-based index)
        )
        
        return merged
    
    def save_sql(self, sql_lines: List[str], output_path: str):
        """
        SQL 코드를 파일로 저장
        
        Args:
            sql_lines: SQL 라인 리스트
            output_path: 출력 파일 경로
        """
        try:
            with open(output_path, 'w', encoding='utf-8') as f:
                f.writelines(sql_lines)
            print(f"✓ 파일 저장 완료: {output_path}")
        except Exception as e:
            print(f"파일 저장 실패: {e}")
    
    def fix_procedure(self, errors_input: str, sql_file_path: str, output_folder: str = None) -> bool:
        """
        프로시저 오류 수정 메인 함수
        
        Args:
            errors_input: 오류 JSON (문자열 또는 파일 경로)
            sql_file_path: SQL 파일 경로
            output_folder: 출력 폴더 경로 (없으면 입력 파일과 같은 폴더에 output 폴더 생성)
            
        Returns:
            성공 여부
        """
        print("=" * 70)
        print("오라클 프로시저 자동 수정 시작")
        print("=" * 70)
        
        # 1. 오류 파싱
        print("\n[1/6] 컴파일 오류 파싱 중...")
        errors = self.parse_errors(errors_input)
        if not errors:
            print("오류 정보를 찾을 수 없습니다.")
            return False
        print(f"   ✓ {len(errors)}개의 오류를 발견했습니다.")
        
        # 2. SQL 파일 읽기
        print("\n[2/6] SQL 파일 읽기 중...")
        sql_lines = self.read_sql_file(sql_file_path)
        if not sql_lines:
            print("SQL 파일을 읽을 수 없습니다.")
            return False
        total_chars = sum(len(line) for line in sql_lines)
        print(f"   ✓ {len(sql_lines)}라인, 총 {total_chars:,}자의 SQL 코드를 읽었습니다.")
        
        # 3. 오류 그룹화
        print("\n[3/6] 오류 그룹화 중...")
        error_groups = self.group_errors_by_proximity(errors)
        print(f"   ✓ {len(error_groups)}개의 오류 그룹으로 분류했습니다.")
        
        # 4. 각 그룹별로 수정
        print("\n[4/6] 오류 수정 중...")
        current_lines = sql_lines.copy()
        
        for idx, error_group in enumerate(error_groups, 1):
            print(f"\n   [{idx}/{len(error_groups)}] 그룹 처리 중...")
            
            # 컨텍스트 추출
            context, start_line, end_line = self.extract_context(current_lines, error_group)
            print(f"      - Line {start_line}~{end_line} ({end_line - start_line + 1}라인, {len(context):,}자)")
            print(f"      - {len(error_group)}개 오류 포함")
            
            # 프롬프트 생성
            prompt = self.create_fix_prompt(context, error_group, start_line, end_line)
            
            # LLM 호출
            print(f"      - LLM API 호출 중...")
            llm_response = self.call_llm(prompt)
            if not llm_response:
                print(f"      ✗ API 호출 실패")
                continue
            
            # 수정된 코드 추출
            fixed_code = self.extract_fixed_code(llm_response)
            if not fixed_code:
                print(f"      ✗ 수정된 코드 추출 실패")
                continue
            
            print(f"      ✓ 수정 완료 ({len(fixed_code):,}자)")
            
            # 원본에 병합
            current_lines = self.merge_fixed_code(current_lines, fixed_code, start_line, end_line)
        
        # 5. 결과 저장
        print("\n[5/6] 수정된 파일 저장 중...")
        
        # output 폴더 경로 생성
        if output_folder is None:
            input_path = Path(sql_file_path)
            output_folder = input_path.parent / "output"
        else:
            output_folder = Path(output_folder)
        
        # output 폴더 생성
        output_folder.mkdir(exist_ok=True)
        
        # 출력 파일 경로
        original_filename = Path(sql_file_path).name
        output_path = output_folder / original_filename
        
        self.save_sql(current_lines, str(output_path))
        
        print("\n[6/6] 완료!")
        print("=" * 70)
        print(f"✓ 수정된 파일: {output_path}")
        print(f"✓ 총 {len(error_groups)}개 그룹, {len(errors)}개 오류 처리 완료")
        print("=" * 70)
        
        return True


def main():
    """
    메인 실행 함수
    
    사용법 1: 상단 설정 사용 (파일을 직접 실행)
        python oracle_fixer.py
    
    사용법 2: 명령줄 인자 사용 (개별 파라미터 지정)
        python oracle_fixer.py -e errors.json -s procedure.sql -u API_URL -k API_KEY
    """
    parser = argparse.ArgumentParser(
        description="오라클 프로시저 컴파일 오류 자동 수정 도구",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
사용 방법:

1. 상단 설정값을 수정하고 실행:
   python oracle_fixer.py

2. 명령줄 인자로 실행:
   python oracle_fixer.py -e errors.json -s procedure.sql -u API_URL -k API_KEY
        """
    )
    
    parser.add_argument('-e', '--errors',
                        help='컴파일 오류 JSON 파일명 (또는 경로)')
    parser.add_argument('-s', '--sql',
                        help='수정할 SQL 파일명 (또는 경로)')
    parser.add_argument('-u', '--url',
                        help='LLM API URL')
    parser.add_argument('-k', '--key',
                        help='LLM API 인증 키')
    parser.add_argument('-f', '--folder',
                        help='JSON과 SQL이 있는 폴더 경로')
    parser.add_argument('-m', '--model',
                        help='사용할 LLM 모델')
    parser.add_argument('-o', '--output',
                        help='출력 폴더 경로')
    parser.add_argument('-c', '--context', type=int,
                        help='오류 라인 주변으로 포함할 라인 수')
    
    args = parser.parse_args()
    
    # 명령줄 인자가 있으면 우선, 없으면 상단 설정 사용
    api_url = args.url if args.url else API_URL
    api_key = args.key if args.key else API_KEY
    model = args.model if args.model else MODEL
    context_lines = args.context if args.context else CONTEXT_LINES
    
    input_folder = args.folder if args.folder else INPUT_FOLDER
    input_folder = Path(input_folder)
    
    errors_file = args.errors if args.errors else ERRORS_JSON_FILE
    sql_file = args.sql if args.sql else SQL_FILE
    
    # 파일 경로 구성 (상대 경로면 input_folder 기준, 절대 경로면 그대로)
    errors_path = Path(errors_file)
    if not errors_path.is_absolute():
        errors_path = input_folder / errors_file
    
    sql_path = Path(sql_file)
    if not sql_path.is_absolute():
        sql_path = input_folder / sql_file
    
    output_folder = args.output if args.output else None
    
    # 설정 정보 출력
    print("\n" + "=" * 70)
    print("설정 정보")
    print("=" * 70)
    print(f"API URL: {api_url}")
    print(f"Model: {model}")
    print(f"Input Folder: {input_folder}")
    print(f"Errors File: {errors_path}")
    print(f"SQL File: {sql_path}")
    print(f"Output Folder: {output_folder if output_folder else str(input_folder / 'output')}")
    print(f"Context Lines: {context_lines}")
    print("=" * 70)
    
    # 파일 존재 확인
    if not errors_path.exists():
        print(f"\n오류: JSON 파일을 찾을 수 없습니다: {errors_path}")
        exit(1)
    
    if not sql_path.exists():
        print(f"\n오류: SQL 파일을 찾을 수 없습니다: {sql_path}")
        exit(1)
    
    # Fixer 객체 생성
    fixer = OracleProcedureFixer(
        api_url=api_url,
        api_key=api_key,
        model=model,
        context_lines=context_lines
    )
    
    # 프로시저 수정 실행
    success = fixer.fix_procedure(
        errors_input=str(errors_path),
        sql_file_path=str(sql_path),
        output_folder=output_folder
    )
    
    if not success:
        exit(1)


if __name__ == "__main__":
    main()
