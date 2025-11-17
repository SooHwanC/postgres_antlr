"""
PostgreSQL → Oracle 프로시저 변환 프로그램

사용 전 필수 설치:
    pip install requests

사용법:
1. 아래 설정 부분을 수정하세요
2. SQL과 JSON 파일을 INPUT_FOLDER에 넣으세요  
3. python postgres_oracle_converter.py 실행
"""

import json
import requests
import time
import os
import sys
from typing import List, Dict, Any
from dataclasses import dataclass
import logging

# ==================== 여기서 설정을 수정하세요 ====================

# LLM API 설정
API_URL = "https://your-company-api.com/v1/chat/completions"
API_KEY = "your-api-key-here"
MODEL = "gpt-4.1"

# 입력 폴더 경로 (SQL과 JSON 파일이 있는 폴더)
INPUT_FOLDER = r"C:\Users\test\input"

# SQL 파일 이름 (INPUT_FOLDER 안에 있어야 함)
SQL_FILE_NAME = "input.sql"

# JSON 파일 이름 (INPUT_FOLDER 안에 있어야 함)
JSON_FILE_NAME = "structure.json"

# 고급 설정
MAX_TOKENS_PER_CHUNK = 4000  # 청크당 최대 토큰 수
RETRY_COUNT = 3              # API 실패시 재시도 횟수
RETRY_DELAY = 2              # 재시도 간격(초)

# ==============================================================

# 로깅 설정
logging.basicConfig(
    level=logging.INFO,
    format='%(asctime)s - %(levelname)s - %(message)s'
)
logger = logging.getLogger(__name__)


@dataclass
class ConversionConfig:
    """변환 설정"""
    api_url: str
    api_key: str
    model: str = "gpt-4.1"
    max_tokens_per_chunk: int = 4000
    retry_count: int = 3
    retry_delay: int = 2


class LLMClient:
    """LLM API 클라이언트"""
    
    def __init__(self, config: ConversionConfig):
        self.config = config
        
    def call_api(self, system_message: str, user_message: str) -> str:
        """LLM API 호출"""
        headers = {
            "Authorization": self.config.api_key,
            "Content-Type": "application/json"
        }
        
        payload = {
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
            "model": self.config.model
        }
        
        for attempt in range(self.config.retry_count):
            try:
                logger.info(f"API 호출 시도 {attempt + 1}/{self.config.retry_count}")
                response = requests.post(
                    self.config.api_url,
                    headers=headers,
                    json=payload,
                    timeout=120
                )
                response.raise_for_status()
                
                # 응답에서 텍스트 추출
                result = response.json()
                if isinstance(result, dict):
                    text = (result.get('text') or 
                           result.get('content') or
                           result.get('choices', [{}])[0].get('message', {}).get('content') or
                           str(result))
                else:
                    text = str(result)
                
                logger.info("API 호출 성공")
                return text
                
            except requests.exceptions.RequestException as e:
                logger.error(f"API 호출 실패: {e}")
                if attempt < self.config.retry_count - 1:
                    logger.info(f"{self.config.retry_delay}초 후 재시도...")
                    time.sleep(self.config.retry_delay)
                else:
                    raise Exception(f"API 호출 최종 실패: {e}")
        
        return ""


class SQLChunker:
    """SQL을 논리적 단위로 분할"""
    
    def __init__(self, sql_text: str, structure_json: Dict[str, Any]):
        self.sql_lines = sql_text.split('\n')
        self.structure = structure_json
        
    def get_sql_chunk(self, start_line: int, end_line: int) -> str:
        """지정된 라인 범위의 SQL 텍스트 추출"""
        start_idx = max(0, start_line - 1)
        end_idx = min(len(self.sql_lines), end_line)
        return '\n'.join(self.sql_lines[start_idx:end_idx])
    
    def split_into_chunks(self, max_lines_per_chunk: int = 200) -> List[Dict[str, Any]]:
        """JSON 구조를 기반으로 SQL을 논리적 단위로 분할"""
        chunks = []
        
        def process_node(node: Dict[str, Any], depth: int = 0):
            """재귀적으로 노드 처리"""
            node_type = node.get('type', 'UNKNOWN')
            start_line = node.get('startLine', 0)
            end_line = node.get('endLine', 0)
            children = node.get('children', [])
            
            # 청크로 만들 주요 단위들
            chunk_types = {
                'CREATE_FUNCTION', 'PLPGSQL_BLOCK', 'NESTED_BLOCK',
                'DECLARE_SECTION', 'IF_STATEMENT', 'LOOP_STATEMENT',
                'FOR_STATEMENT', 'WHILE_STATEMENT', 'CASE_STATEMENT'
            }
            
            line_count = end_line - start_line + 1
            
            should_chunk = (
                node_type in chunk_types and 
                start_line > 0 and 
                end_line > 0 and
                line_count > 0
            )
            
            if should_chunk:
                if line_count > max_lines_per_chunk and children:
                    for child in children:
                        process_node(child, depth + 1)
                else:
                    sql_chunk = self.get_sql_chunk(start_line, end_line)
                    if sql_chunk.strip():
                        chunks.append({
                            'type': node_type,
                            'start_line': start_line,
                            'end_line': end_line,
                            'sql': sql_chunk,
                            'structure': node,
                            'depth': depth
                        })
            else:
                for child in children:
                    process_node(child, depth + 1)
        
        # 루트부터 처리
        if isinstance(self.structure, dict):
            process_node(self.structure)
        
        # 청크가 없으면 전체를 하나의 청크로
        if not chunks:
            all_sql = '\n'.join(self.sql_lines)
            if all_sql.strip():
                chunks.append({
                    'type': 'FULL_SQL',
                    'start_line': 1,
                    'end_line': len(self.sql_lines),
                    'sql': all_sql,
                    'structure': self.structure,
                    'depth': 0
                })
        
        logger.info(f"총 {len(chunks)}개의 청크로 분할되었습니다.")
        return chunks


class PostgresToOracleConverter:
    """PostgreSQL to Oracle 변환기"""
    
    def __init__(self, config: ConversionConfig):
        self.config = config
        self.llm_client = LLMClient(config)
        
    def get_system_message(self) -> str:
        """시스템 메시지 생성"""
        return """당신은 PostgreSQL PL/pgSQL 프로시저를 Oracle PL/SQL 프로시저로 변환하는 전문가입니다.

주요 변환 규칙:
1. 데이터 타입 변환:
   - TEXT → VARCHAR2(4000)
   - SERIAL → NUMBER + SEQUENCE + TRIGGER
   - BOOLEAN → NUMBER(1) (0/1)
   - TIMESTAMP → TIMESTAMP 또는 DATE
   
2. 함수 및 문법 변환:
   - RAISE NOTICE → DBMS_OUTPUT.PUT_LINE
   - := 대입 연산자는 동일하게 사용
   - || 문자열 연결은 동일하게 사용
   - PERFORM → 단순 함수 호출로 변경
   - RETURN NEXT → PIPE ROW로 변경 (필요시)
   
3. 블록 구조:
   - $$로 감싼 함수 본문 → BEGIN...END;로 변경
   - AS $$ → AS 또는 IS로 변경
   - LANGUAGE plpgsql → 제거 (Oracle은 기본이 PL/SQL)
   
4. 예외 처리:
   - EXCEPTION WHEN ... THEN → 유사하게 유지
   - SQLSTATE → Oracle 예외 코드로 변경
   
5. 변수 선언:
   - DECLARE 섹션은 유사하지만 세미콜론 위치 주의
   
변환된 코드는 Oracle에서 실행 가능해야 하며, 문법 오류가 없어야 합니다.
주석으로 변환 내용을 설명하지 말고, 변환된 코드만 출력하세요."""

    def convert_chunk(self, chunk: Dict[str, Any]) -> str:
        """개별 청크를 변환"""
        chunk_type = chunk['type']
        sql = chunk['sql']
        
        logger.info(f"청크 변환 중: {chunk_type} (라인 {chunk['start_line']}-{chunk['end_line']})")
        
        user_message = f"""다음 PostgreSQL PL/pgSQL 코드를 Oracle PL/SQL로 변환하세요.

코드 타입: {chunk_type}

PostgreSQL 코드:
```sql
{sql}
```

변환된 Oracle PL/SQL 코드만 출력하세요. 추가 설명은 불필요합니다."""

        system_message = self.get_system_message()
        converted = self.llm_client.call_api(system_message, user_message)
        
        # 코드 블록 마커 제거
        converted = converted.strip()
        if converted.startswith('```'):
            lines = converted.split('\n')
            if lines[0].startswith('```'):
                lines = lines[1:]
            if lines and lines[-1].strip() == '```':
                lines = lines[:-1]
            converted = '\n'.join(lines)
        
        return converted
    
    def convert(self, sql_file: str, structure_file: str, output_file: str):
        """PostgreSQL 프로시저를 Oracle로 변환"""
        logger.info("변환 프로세스 시작")
        
        # 파일 읽기
        logger.info(f"SQL 파일 읽기: {sql_file}")
        with open(sql_file, 'r', encoding='utf-8') as f:
            sql_text = f.read()
        
        logger.info(f"구조 JSON 파일 읽기: {structure_file}")
        with open(structure_file, 'r', encoding='utf-8') as f:
            structure = json.load(f)
        
        # SQL 분할
        logger.info("SQL을 논리적 단위로 분할 중...")
        chunker = SQLChunker(sql_text, structure)
        chunks = chunker.split_into_chunks(max_lines_per_chunk=200)
        
        # 각 청크 변환
        converted_chunks = []
        total_chunks = len(chunks)
        
        for idx, chunk in enumerate(chunks, 1):
            logger.info(f"\n진행률: {idx}/{total_chunks}")
            try:
                converted = self.convert_chunk(chunk)
                converted_chunks.append({
                    'original': chunk,
                    'converted': converted
                })
                
                # API 호출 간 지연 (rate limit 방지)
                if idx < total_chunks:
                    time.sleep(1)
                    
            except Exception as e:
                logger.error(f"청크 변환 실패: {e}")
                converted_chunks.append({
                    'original': chunk,
                    'converted': f"-- 변환 실패:\n-- {chunk['sql']}"
                })
        
        # 변환된 청크들을 조합
        logger.info("\n변환된 청크들을 조합 중...")
        oracle_sql = self.combine_chunks(converted_chunks)
        
        # 결과 저장
        logger.info(f"결과 저장: {output_file}")
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(oracle_sql)
        
        logger.info("변환 완료!")
        
        # 통계 출력
        logger.info(f"\n=== 변환 통계 ===")
        logger.info(f"총 청크 수: {total_chunks}")
        logger.info(f"원본 라인 수: {len(sql_text.splitlines())}")
        logger.info(f"변환된 라인 수: {len(oracle_sql.splitlines())}")
    
    def combine_chunks(self, converted_chunks: List[Dict[str, Any]]) -> str:
        """변환된 청크들을 하나의 Oracle SQL로 조합"""
        # 전체 함수인 경우 단순 결합
        if len(converted_chunks) == 1:
            return converted_chunks[0]['converted']
        
        # 전체를 재조합하기 위해 LLM에 한번 더 요청
        logger.info("최종 조합을 위한 LLM 호출...")
        
        combined_text = "\n\n-- ===== 청크 구분 =====\n\n".join(
            [f"-- 청크 {i+1}: {c['original']['type']}\n{c['converted']}" 
             for i, c in enumerate(converted_chunks)]
        )
        
        system_message = """당신은 Oracle PL/SQL 전문가입니다.
여러 개의 변환된 코드 청크들이 주어집니다.
이들을 하나의 완전한 Oracle 프로시저/함수로 조합하세요.
중복된 CREATE 문이나 선언을 제거하고, 올바른 구조로 만드세요.
실행 가능한 완전한 Oracle PL/SQL 코드만 출력하세요."""

        user_message = f"""다음 Oracle PL/SQL 코드 청크들을 하나의 완전한 프로시저/함수로 조합하세요:

{combined_text}

완전한 Oracle PL/SQL 코드만 출력하세요."""

        try:
            final_code = self.llm_client.call_api(system_message, user_message)
            
            # 코드 블록 마커 제거
            final_code = final_code.strip()
            if final_code.startswith('```'):
                lines = final_code.split('\n')
                if lines[0].startswith('```'):
                    lines = lines[1:]
                if lines and lines[-1].strip() == '```':
                    lines = lines[:-1]
                final_code = '\n'.join(lines)
            
            return final_code
            
        except Exception as e:
            logger.error(f"최종 조합 실패: {e}")
            return "\n\n".join([c['converted'] for c in converted_chunks])


def main():
    """메인 함수"""
    print("=" * 70)
    print("PostgreSQL → Oracle 변환 프로그램")
    print("=" * 70)
    print()
    
    # 설정 검증
    if API_URL == "https://your-company-api.com/v1/chat/completions":
        print("⚠️  경고: API_URL을 설정하지 않았습니다!")
        print("파일 상단의 API_URL을 수정하세요.")
        sys.exit(1)
    
    if API_KEY == "your-api-key-here":
        print("⚠️  경고: API_KEY를 설정하지 않았습니다!")
        print("파일 상단의 API_KEY를 수정하세요.")
        sys.exit(1)
    
    # 입력 폴더 확인
    if not os.path.exists(INPUT_FOLDER):
        print(f"❌ 입력 폴더를 찾을 수 없습니다: {INPUT_FOLDER}")
        print("파일 상단의 INPUT_FOLDER 경로를 확인하세요.")
        sys.exit(1)
    
    # 파일 경로 구성
    sql_file = os.path.join(INPUT_FOLDER, SQL_FILE_NAME)
    json_file = os.path.join(INPUT_FOLDER, JSON_FILE_NAME)
    
    # 파일 존재 확인
    if not os.path.exists(sql_file):
        print(f"❌ SQL 파일을 찾을 수 없습니다: {sql_file}")
        sys.exit(1)
    
    if not os.path.exists(json_file):
        print(f"❌ JSON 파일을 찾을 수 없습니다: {json_file}")
        sys.exit(1)
    
    # 출력 폴더 생성
    output_folder = os.path.join(INPUT_FOLDER, "output")
    os.makedirs(output_folder, exist_ok=True)
    
    # 출력 파일 경로
    sql_basename = os.path.splitext(SQL_FILE_NAME)[0]
    output_file = os.path.join(output_folder, f"{sql_basename}_oracle.sql")
    
    # 설정 출력
    print("📋 설정 정보")
    print("-" * 70)
    print(f"API URL   : {API_URL}")
    print(f"모델      : {MODEL}")
    print(f"입력 폴더 : {INPUT_FOLDER}")
    print(f"SQL 파일  : {SQL_FILE_NAME}")
    print(f"JSON 파일 : {JSON_FILE_NAME}")
    print(f"출력 폴더 : {output_folder}")
    print(f"출력 파일 : {os.path.basename(output_file)}")
    print("-" * 70)
    print()
    
    # 파일 크기 확인
    sql_size = os.path.getsize(sql_file)
    sql_lines = sum(1 for _ in open(sql_file, 'r', encoding='utf-8'))
    print(f"📄 SQL 파일 정보: {sql_size:,} bytes, {sql_lines:,} 줄")
    print()
    
    # 사용자 확인
    response = input("변환을 시작하시겠습니까? (y/n): ").strip().lower()
    if response != 'y':
        print("변환이 취소되었습니다.")
        sys.exit(0)
    
    print()
    print("=" * 70)
    print("변환 시작...")
    print("=" * 70)
    print()
    
    # 설정 생성
    config = ConversionConfig(
        api_url=API_URL,
        api_key=API_KEY,
        model=MODEL,
        max_tokens_per_chunk=MAX_TOKENS_PER_CHUNK,
        retry_count=RETRY_COUNT,
        retry_delay=RETRY_DELAY
    )
    
    # 변환 실행
    try:
        converter = PostgresToOracleConverter(config)
        converter.convert(sql_file, json_file, output_file)
        
        print()
        print("=" * 70)
        print("✅ 변환 완료!")
        print("=" * 70)
        print(f"결과 파일: {output_file}")
        
        # 출력 파일 정보
        output_size = os.path.getsize(output_file)
        output_lines = sum(1 for _ in open(output_file, 'r', encoding='utf-8'))
        print(f"출력 크기: {output_size:,} bytes, {output_lines:,} 줄")
        print("=" * 70)
        
    except Exception as e:
        print()
        print("=" * 70)
        print("❌ 변환 실패!")
        print("=" * 70)
        print(f"오류: {e}")
        print()
        print("해결 방법:")
        print("1. API URL과 키가 올바른지 확인하세요")
        print("2. 네트워크 연결을 확인하세요")
        print("3. SQL과 JSON 파일이 올바른지 확인하세요")
        sys.exit(1)


if __name__ == '__main__':
    main()

