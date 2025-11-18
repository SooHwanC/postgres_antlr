#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
PostgreSQL PL/pgSQL을 Oracle PL/SQL로 변환하는 스크립트
structure.json을 이용하여 큰 프로시저를 논리적 블록으로 나누어 LLM에게 변환 요청
"""

import os
import json
import requests
from pathlib import Path
from typing import List, Dict, Any

# ============================================================================
# 설정 영역 - 여기를 수정하세요
# ============================================================================

# 작업 폴더 경로 (SQL 파일과 JSON 파일이 있는 폴더)
WORK_DIR = r"C:\Users\sh\Desktop\uengine_source\githubs\plsql-parser"

# SQL 파일명 (작업 폴더 내)
SQL_FILE_NAME = "plpgsql5.sql"

# Structure JSON 파일명 (작업 폴더 내)
STRUCTURE_FILE_NAME = "structure.json"

# LLM API 설정
LLM_URL = "https://your-llm-api-endpoint.com/v1/chat/completions"
LLM_API_KEY = "your-api-key-here"
LLM_MODEL = "gpt-4.1"

# 블록당 최대 라인 수 (이 값을 조정하여 LLM 요청 크기 조절)
MAX_LINES_PER_CHUNK = 200

# LLM 요청당 최대 문자 수 (이 값을 초과하면 청크를 더 작게 나눔)
MAX_CHARS_PER_REQUEST = 50000

# 주변 맥락 참고 라인 수 (청크 변환 시 이전/다음 청크에서 참고할 라인 수)
CONTEXT_LINES = 15

# API 요청 실패 시 재시도 횟수
MAX_RETRIES = 3

# ============================================================================
# 메인 로직
# ============================================================================

class PlpgsqlToOracleConverter:
    def __init__(self, work_dir: str, sql_file: str, structure_file: str):
        self.work_dir = Path(work_dir)
        self.sql_file = self.work_dir / sql_file
        self.structure_file = self.work_dir / structure_file
        self.output_dir = self.work_dir / "output"
        
        # SQL 파일 읽기
        with open(self.sql_file, 'r', encoding='utf-8') as f:
            self.sql_lines = f.readlines()
        
        # Structure JSON 읽기
        with open(self.structure_file, 'r', encoding='utf-8') as f:
            self.structure = json.load(f)
        
        # 출력 디렉토리 생성
        self.output_dir.mkdir(exist_ok=True)
        
        print(f"✓ SQL 파일 로드 완료: {len(self.sql_lines)} 라인")
        print(f"✓ Structure 파일 로드 완료")
        print(f"  - 최상위 타입: {self.structure.get('type', 'UNKNOWN')}")
        print(f"  - 자식 노드 수: {len(self.structure.get('children', []))}")
        if self.structure.get('children'):
            print(f"  - 첫 번째 자식 타입: {self.structure['children'][0].get('type', 'UNKNOWN')}")
        print(f"✓ 출력 디렉토리: {self.output_dir}")
    
    def get_sql_text(self, start_line: int, end_line: int) -> str:
        """특정 라인 범위의 SQL 텍스트를 반환 (1-based indexing)"""
        if start_line < 1 or end_line > len(self.sql_lines):
            return ""
        return ''.join(self.sql_lines[start_line-1:end_line])
    
    def split_into_chunks(self, node: Dict[str, Any], depth: int = 0) -> List[Dict[str, Any]]:
        """
        Structure를 분석하여 논리적 청크로 분할
        각 청크는 {type, startLine, endLine, text, description} 형태
        """
        chunks = []
        
        node_type = node.get('type', 'UNKNOWN')
        start_line = node.get('startLine', 0)
        end_line = node.get('endLine', 0)
        children = node.get('children', [])
        
        # 디버그: 최상위 노드 정보 출력
        if depth == 0:
            print(f"[디버그] 최상위 노드: type={node_type}, startLine={start_line}, endLine={end_line}, children={len(children)}")
        
        # 라인 수 계산
        line_count = end_line - start_line + 1
        
        # 최상위 노드는 건너뛰기 (ROOT, FILE 등)
        if node_type in ['ROOT', 'FILE']:
            if not children:
                print(f"[경고] {node_type} 노드에 children이 없습니다!")
                return chunks
            for child in children:
                chunks.extend(self.split_into_chunks(child, depth + 1))
            return chunks
        
        # 프로시저/함수 노드 (CREATE_FUNCTION, PROCEDURE 등)
        if node_type in ['CREATE_FUNCTION', 'PROCEDURE', 'CREATE_PROCEDURE', 'FUNCTION']:
            print(f"[디버그] 프로시저 발견: {node_type} (lines {start_line}-{end_line})")
            
            # SPEC 부분 처리 (SPECIFICATION, HEADER 등도 지원)
            spec_node = next((c for c in children if c.get('type') in ['SPEC', 'SPECIFICATION', 'HEADER']), None)
            if spec_node:
                chunks.append({
                    'type': 'SPEC',
                    'startLine': spec_node['startLine'],
                    'endLine': spec_node['endLine'],
                    'text': self.get_sql_text(spec_node['startLine'], spec_node['endLine']),
                    'description': 'Procedure Specification'
                })
            
            # DECLARE 부분 처리 (DECLARATIONS, VARIABLES 등도 지원)
            declare_node = next((c for c in children if c.get('type') in ['DECLARE', 'DECLARATIONS', 'VARIABLES']), None)
            if declare_node:
                chunks.append({
                    'type': 'DECLARE',
                    'startLine': declare_node['startLine'],
                    'endLine': declare_node['endLine'],
                    'text': self.get_sql_text(declare_node['startLine'], declare_node['endLine']),
                    'description': 'Variable Declarations'
                })
            
            # BEGIN 부분 처리 (BODY, BLOCK 등도 지원)
            begin_node = next((c for c in children if c.get('type') in ['BEGIN', 'BODY', 'BLOCK']), None)
            if begin_node:
                chunks.extend(self.split_begin_block(begin_node))
            else:
                # BEGIN 블록이 명시적으로 없으면 모든 자식을 BEGIN으로 처리
                print(f"[디버그] BEGIN 블록이 없어서 모든 자식을 처리합니다")
                for child in children:
                    if child.get('type') not in ['SPEC', 'SPECIFICATION', 'HEADER', 'DECLARE', 'DECLARATIONS', 'VARIABLES']:
                        chunks.extend(self.split_into_chunks(child, depth + 1))
            
            return chunks
        
        # 기타 노드 처리
        if line_count <= MAX_LINES_PER_CHUNK or line_count <= 0:
            # 작은 블록은 그대로 추가 (line_count가 0이면 startLine == endLine이므로 유효한 텍스트 확인)
            text = self.get_sql_text(start_line, end_line)
            if text.strip():  # 실제 텍스트가 있는 경우만 추가
                chunks.append({
                    'type': node_type,
                    'startLine': start_line,
                    'endLine': end_line,
                    'text': text,
                    'description': f'{node_type} block'
                })
        else:
            # 큰 블록은 자식으로 분할
            if children:
                for child in children:
                    chunks.extend(self.split_into_chunks(child, depth + 1))
            else:
                # 자식이 없는 큰 블록은 강제로 라인 단위 분할
                chunks.extend(self.split_large_block(node_type, start_line, end_line))
        
        return chunks
    
    def split_begin_block(self, begin_node: Dict[str, Any]) -> List[Dict[str, Any]]:
        """BEGIN 블록을 논리적 단위로 분할"""
        chunks = []
        children = begin_node.get('children', [])
        
        if not children:
            # 자식이 없으면 전체를 하나의 청크로
            total_lines = begin_node['endLine'] - begin_node['startLine'] + 1
            block_text = self.get_sql_text(begin_node['startLine'], begin_node['endLine'])
            
            # CTE 구문이 포함되어 있으면 절대 자르지 않음
            if total_lines > MAX_LINES_PER_CHUNK:
                if self.contains_cte(block_text):
                    print(f"[CTE 감지] BEGIN 블록 {total_lines} 라인, CTE 포함으로 분할하지 않음")
                else:
                    # CTE가 없으면 강제 분할
                    return self.split_large_block('BEGIN', begin_node['startLine'], begin_node['endLine'])
            
            return [{
                'type': 'BEGIN',
                'startLine': begin_node['startLine'],
                'endLine': begin_node['endLine'],
                'text': block_text,
                'description': 'Main BEGIN block'
            }]
        
        # 자식 노드들을 그룹화
        current_group = []
        current_lines = 0
        
        for i, child in enumerate(children):
            child_lines = child['endLine'] - child['startLine'] + 1
            
            print(f"    [디버그] Child {i+1}/{len(children)}: type={child.get('type')}, lines={child['startLine']}-{child['endLine']} ({child_lines} 라인)")
            
            # 큰 블록은 무조건 독립 처리 (50라인 이상)
            if child_lines > 50:
                print(f"    [디버그] 큰 블록 독립 처리: {child_lines} 라인")
                # 현재 그룹이 있으면 먼저 처리
                if current_group:
                    group_chunk = self.create_group_chunk(current_group, 'STATEMENTS')
                    if group_chunk:
                        group_lines = group_chunk['endLine'] - group_chunk['startLine'] + 1
                        if group_lines > MAX_LINES_PER_CHUNK:
                            # CTE 체크
                            if self.contains_cte(group_chunk['text']):
                                print(f"[CTE 감지] 그룹 {group_lines} 라인, CTE 포함으로 분할하지 않음")
                                chunks.append(group_chunk)
                            else:
                                print(f"[경고] 그룹이 너무 큽니다 ({group_lines} 라인). 강제 분할합니다.")
                                chunks.extend(self.split_large_block('STATEMENTS', group_chunk['startLine'], group_chunk['endLine']))
                        else:
                            chunks.append(group_chunk)
                    current_group = []
                    current_lines = 0
                
                # 큰 블록 처리 (재귀적으로 분할하거나 강제 분할)
                if child_lines > MAX_LINES_PER_CHUNK:
                    print(f"    [디버그] {child_lines} 라인 블록을 재귀 분할합니다")
                    chunks.extend(self.split_into_chunks(child, 1))
                else:
                    # 50~200라인 사이는 독립 청크로
                    chunks.append({
                        'type': child.get('type', 'BLOCK'),
                        'startLine': child['startLine'],
                        'endLine': child['endLine'],
                        'text': self.get_sql_text(child['startLine'], child['endLine']),
                        'description': f"{child.get('type', 'BLOCK')} block ({child_lines} lines)"
                    })
            else:
                # 작은 블록은 그룹에 추가
                current_group.append(child)
                current_lines += child_lines
                
                # 그룹이 MAX_LINES_PER_CHUNK를 넘으면 청크로 만들기
                if current_lines >= MAX_LINES_PER_CHUNK:
                    print(f"    [디버그] 그룹이 {current_lines} 라인 도달, 청크 생성")
                    group_chunk = self.create_group_chunk(current_group, 'STATEMENTS')
                    if group_chunk:
                        chunks.append(group_chunk)
                    current_group = []
                    current_lines = 0
        
        # 남은 그룹 처리
        if current_group:
            group_chunk = self.create_group_chunk(current_group, 'STATEMENTS')
            if group_chunk:
                group_lines = group_chunk['endLine'] - group_chunk['startLine'] + 1
                if group_lines > MAX_LINES_PER_CHUNK:
                    # CTE 체크
                    if self.contains_cte(group_chunk['text']):
                        print(f"[CTE 감지] 마지막 그룹 {group_lines} 라인, CTE 포함으로 분할하지 않음")
                        chunks.append(group_chunk)
                    else:
                        print(f"[경고] 마지막 그룹이 너무 큽니다 ({group_lines} 라인). 강제 분할합니다.")
                        chunks.extend(self.split_large_block('STATEMENTS', group_chunk['startLine'], group_chunk['endLine']))
                else:
                    chunks.append(group_chunk)
        
        return chunks
    
    def create_group_chunk(self, nodes: List[Dict[str, Any]], chunk_type: str) -> Dict[str, Any]:
        """여러 노드를 하나의 청크로 그룹화"""
        if not nodes:
            return None
        
        start_line = min(n['startLine'] for n in nodes)
        end_line = max(n['endLine'] for n in nodes)
        line_count = end_line - start_line + 1
        types = [n.get('type', 'UNKNOWN') for n in nodes]
        
        # 그룹이 너무 크면 경고
        if line_count > MAX_LINES_PER_CHUNK * 2:
            print(f"[경고] 큰 그룹 생성: {line_count} 라인 (노드 {len(nodes)}개)")
        
        return {
            'type': chunk_type,
            'startLine': start_line,
            'endLine': end_line,
            'text': self.get_sql_text(start_line, end_line),
            'description': f'Group of {len(nodes)} statements: {", ".join(set(types))}'
        }
    
    def split_large_block(self, block_type: str, start_line: int, end_line: int) -> List[Dict[str, Any]]:
        """큰 블록을 강제로 라인 단위로 분할 (CTE 구문은 예외)"""
        chunks = []
        
        # 전체 텍스트 가져오기
        full_text = self.get_sql_text(start_line, end_line)
        
        # CTE 구문 감지 (WITH ... INSERT/SELECT/UPDATE/DELETE)
        # CTE가 있으면 절대 자르지 않음
        if self.contains_cte(full_text):
            line_count = end_line - start_line + 1
            print(f"[CTE 감지] {line_count} 라인의 CTE 구문을 하나의 청크로 유지합니다")
            return [{
                'type': f'{block_type}_CTE',
                'startLine': start_line,
                'endLine': end_line,
                'text': full_text,
                'description': f'{block_type} with CTE (lines {start_line}-{end_line}, {line_count} lines)'
            }]
        
        # CTE가 아닌 경우 기존대로 분할
        current_start = start_line
        while current_start <= end_line:
            current_end = min(current_start + MAX_LINES_PER_CHUNK - 1, end_line)
            chunks.append({
                'type': f'{block_type}_PART',
                'startLine': current_start,
                'endLine': current_end,
                'text': self.get_sql_text(current_start, current_end),
                'description': f'{block_type} (lines {current_start}-{current_end})'
            })
            current_start = current_end + 1
        
        return chunks
    
    def contains_cte(self, text: str) -> bool:
        """텍스트에 CTE (WITH 절) 구문이 포함되어 있는지 확인"""
        import re
        
        # 대소문자 무관하게 WITH 절 패턴 찾기
        # WITH ... AS (...) ... INSERT/SELECT/UPDATE/DELETE
        text_upper = text.upper()
        
        # WITH 키워드가 있는지 확인
        if 'WITH' not in text_upper:
            return False
        
        # WITH ... INSERT/SELECT/UPDATE/DELETE 패턴 확인
        # 주석이나 문자열 내부의 WITH는 제외하기 위해 간단한 체크
        cte_pattern = r'\bWITH\s+\w+\s+AS\s*\('
        if re.search(cte_pattern, text_upper):
            # INSERT, SELECT, UPDATE, DELETE 중 하나가 WITH 이후에 있는지 확인
            with_pos = text_upper.find('WITH')
            after_with = text_upper[with_pos:]
            
            # CTE 다음에 DML 문이 있으면 진짜 CTE
            if any(keyword in after_with for keyword in ['INSERT', 'SELECT', 'UPDATE', 'DELETE', 'MERGE']):
                return True
        
        return False
    
    def call_llm(self, system_message: str, user_message: str, retry_count: int = 0) -> str:
        """LLM API 호출 (재시도 지원)"""
        headers = {
            'Authorization': f'Bearer {LLM_API_KEY}',
            'Content-Type': 'application/json'
        }
        
        data = {
            'messages': [
                {'role': 'system', 'content': system_message},
                {'role': 'user', 'content': user_message}
            ],
            'model': LLM_MODEL
        }
        
        try:
            retry_suffix = f" (재시도 {retry_count}/{MAX_RETRIES})" if retry_count > 0 else ""
            print(f"    [API] 요청 전송 중...{retry_suffix} (메시지 길이: {len(user_message)} 문자)")
            response = requests.post(LLM_URL, headers=headers, json=data, timeout=180)
            
            print(f"    [API] 응답 상태 코드: {response.status_code}")
            
            # 응답 상태 확인
            if response.status_code != 200:
                error_msg = f"HTTP {response.status_code}: {response.text[:500]}"
                print(f"    [API 오류] {error_msg}")
                
                # 재시도 가능한 에러인 경우 재시도
                if retry_count < MAX_RETRIES and response.status_code in [429, 500, 502, 503, 504]:
                    print(f"    [API] {3 * (retry_count + 1)}초 후 재시도...")
                    import time
                    time.sleep(3 * (retry_count + 1))  # 지수 백오프
                    return self.call_llm(system_message, user_message, retry_count + 1)
                
                return f"-- API ERROR: {error_msg}\n-- Original PostgreSQL Code:\n{user_message}"
            
            response.raise_for_status()
            
            # 응답이 비어있는지 확인
            if not response.text:
                print(f"    [API 오류] 응답 본문이 비어있습니다")
                
                # 재시도
                if retry_count < MAX_RETRIES:
                    print(f"    [API] 3초 후 재시도...")
                    import time
                    time.sleep(3)
                    return self.call_llm(system_message, user_message, retry_count + 1)
                
                return f"-- API ERROR: Empty response\n-- Original PostgreSQL Code:\n{user_message}"
            
            # API는 text 문자열로 직접 변환된 Oracle SQL을 반환
            print(f"    [API] 응답 받음 ({len(response.text)} 문자)")
            return response.text.strip()
                
        except requests.exceptions.Timeout:
            print(f"    [API 오류] 타임아웃 (180초 초과)")
            
            # 재시도
            if retry_count < MAX_RETRIES:
                print(f"    [API] 5초 후 재시도...")
                import time
                time.sleep(5)
                return self.call_llm(system_message, user_message, retry_count + 1)
            
            return f"-- TIMEOUT ERROR\n-- Original PostgreSQL Code:\n{user_message}"
        except requests.exceptions.RequestException as e:
            print(f"    [API 오류] 네트워크 오류: {e}")
            
            # 재시도
            if retry_count < MAX_RETRIES:
                print(f"    [API] 5초 후 재시도...")
                import time
                time.sleep(5)
                return self.call_llm(system_message, user_message, retry_count + 1)
            
            return f"-- NETWORK ERROR: {e}\n-- Original PostgreSQL Code:\n{user_message}"
        except Exception as e:
            print(f"    [API 오류] 예상치 못한 오류: {e}")
            import traceback
            traceback.print_exc()
            return f"-- ERROR: {e}\n-- Original PostgreSQL Code:\n{user_message}"
    
    def convert_chunk(self, chunk: Dict[str, Any], chunk_index: int, total_chunks: int, 
                     all_chunks: List[Dict[str, Any]] = None) -> str:
        """단일 청크를 Oracle로 변환 (주변 맥락 포함)"""
        print(f"  [{chunk_index}/{total_chunks}] 변환 중: {chunk['description']} (lines {chunk['startLine']}-{chunk['endLine']})")
        
        # 주변 맥락 수집
        prev_context = ""
        next_context = ""
        
        if all_chunks:
            # 이전 청크의 마지막 몇 줄
            if chunk_index > 1:
                prev_chunk = all_chunks[chunk_index - 2]
                prev_lines = prev_chunk['text'].split('\n')
                if len(prev_lines) > CONTEXT_LINES:
                    prev_context = '\n'.join(prev_lines[-CONTEXT_LINES:])
                else:
                    prev_context = prev_chunk['text']
            
            # 다음 청크의 첫 몇 줄
            if chunk_index < total_chunks:
                next_chunk = all_chunks[chunk_index]
                next_lines = next_chunk['text'].split('\n')
                if len(next_lines) > CONTEXT_LINES:
                    next_context = '\n'.join(next_lines[:CONTEXT_LINES])
                else:
                    next_context = next_chunk['text']
        
        # 시스템 메시지 구성
        system_message = """당신은 PostgreSQL PL/pgSQL을 Oracle PL/SQL로 변환하는 전문 데이터베이스 개발자입니다.

완벽한 변환 규칙:

[구문 구조]
1. 프로시저: CREATE OR REPLACE PROCEDURE 이름(...) IS
2. 변수 선언: IS/AS 다음에 바로 작성 (DECLARE 키워드 절대 사용 금지)
3. BEGIN-END 블록: 정확한 블록 구조 유지

[데이터 타입]
- varchar, character varying → VARCHAR2
- text → CLOB
- datetime, timestamp → DATE 또는 TIMESTAMP
- serial, bigserial → NUMBER
- boolean → NUMBER(1) 또는 BOOLEAN (Oracle 23c+)
- integer, int → NUMBER 또는 INTEGER

[타입 캐스팅]
- PostgreSQL의 ::type 캐스팅 제거 또는 CAST 함수로 변환
  예1: p_month_cd::varchar → p_month_cd (변수는 타입캐스팅 불필요)
  예2: column_name::numeric → CAST(column_name AS NUMBER)
  예3: value::varchar → TO_CHAR(value)
  예4: value::date → TO_DATE(value, format)

[함수 및 연산자]
- NOW() → SYSDATE
- CURRENT_TIMESTAMP → SYSTIMESTAMP
- CURRENT_DATE → TRUNC(SYSDATE)
- SUBSTRING(str, pos, len) → SUBSTR(str, pos, len)
- POSITION(substr IN str) → INSTR(str, substr)
- LENGTH() → LENGTH() (동일)
- COALESCE(val1, val2, ...) → NVL(val1, val2) 또는 COALESCE() (동일)
- CONCAT(str1, str2) → str1 || str2
- EXTRACT(field FROM timestamp) → EXTRACT(field FROM timestamp) (동일)
- date_part('field', date) → EXTRACT(FIELD FROM date)
- last_day(date) → LAST_DAY(date) (동일)

[Oracle 특화 함수 활용 권장]
- DECODE(expr, search1, result1, ..., default) - CASE 대신 사용 가능
- NVL(expr, replace_value) - NULL 처리
- NULLIF(expr1, expr2) - 두 값이 같으면 NULL 반환

[출력 및 로깅]
- RAISE NOTICE → DBMS_OUTPUT.PUT_LINE
- RAISE INFO → DBMS_OUTPUT.PUT_LINE
- RAISE WARNING → DBMS_OUTPUT.PUT_LINE
- RAISE EXCEPTION → RAISE_APPLICATION_ERROR(-20000, 'message')

[커서]
- refcursor → SYS_REFCURSOR
- FOR rec IN query LOOP → 동일 구문 사용 가능

[트랜잭션]
- COMMIT → COMMIT (동일, 하지만 프로시저 내 사용 주의)
- ROLLBACK → ROLLBACK (동일)

[제어 구조]
- IF condition THEN ... ELSIF ... ELSE ... END IF; (동일)
- LOOP ... END LOOP; (동일)
- WHILE condition LOOP ... END LOOP; (동일)
- FOR i IN 1..10 LOOP ... END LOOP; (동일)
- EXIT WHEN condition; (동일)

[CTE (WITH 절) 변환 규칙 - 매우 중요!]

★★★ WITH 절은 완전히 제거하고 인라인 서브쿼리로 변환하세요 ★★★

PostgreSQL 패턴:
  WITH
    A AS (SELECT ...),
    B AS (SELECT ... FROM A),
    C AS (SELECT ... FROM B)
  INSERT INTO table (...)
  SELECT ... FROM C
  LEFT JOIN A ...

Oracle 변환 (WITH 제거, 모든 CTE를 서브쿼리로):
  INSERT /*+ monitor */ INTO table (...)
  SELECT ...
  FROM (
    -- C를 인라인 서브쿼리로
    SELECT ... 
    FROM (
      -- B를 인라인 서브쿼리로
      SELECT ... 
      FROM (
        -- A를 인라인 서브쿼리로
        SELECT ...
      ) A
    ) B
  ) C
  LEFT JOIN (
    -- A를 다시 사용하는 경우도 인라인으로
    SELECT ...
  ) A ON ...

핵심 변환 규칙:
1. WITH 키워드 완전 제거
2. 모든 CTE를 FROM 절의 인라인 서브쿼리 (subquery) 로 변환
3. CTE 별칭 유지 (예: ) MAT, ) CODE, ) P 등)
4. 타입 캐스팅 제거: p_month_cd::varchar → p_month_cd
5. date_part() → EXTRACT(): date_part('day', ...) → EXTRACT(DAY FROM ...)
6. CROSS JOIN params 제거하고 변수 직접 참조
7. RIGHT JOIN → LEFT JOIN (테이블 순서 변경)
8. CTE JOIN을 상관 서브쿼리로:
   LEFT JOIN cte ON cte.id = t.id 사용: cte.value
   → (SELECT value FROM table WHERE id = t.id)

예시:
PostgreSQL:
  WITH params AS (SELECT p_val AS val)
  SELECT * FROM table1 CROSS JOIN params

Oracle:
  SELECT * FROM table1  -- params 제거, p_val 직접 사용

[구분자 제거]
- $procedure$, $function$, $$, $body$ 등 모든 PostgreSQL 달러 구분자 제거

[세미콜론 규칙]
- SQL 문장 끝: 세미콜론 필수 (SELECT, INSERT, UPDATE, DELETE 등)
- 변수 선언 끝: 세미콜론 필수
- 제어 구조 키워드 뒤: 세미콜론 불필요 (IF, LOOP, BEGIN 등)
- 블록 종료: END IF;, END LOOP;, END; 형식

[중요 사항]
- 이전/다음 청크의 맥락을 참고하여 변수 참조, 블록 구조 등을 올바르게 처리
- 불완전한 문장의 경우 맥락을 보고 완성
- 변환된 Oracle PL/SQL 코드만 반환 (설명, 주석, 마크다운 불필요)
- 원본 코드의 들여쓰기와 가독성 유지

[WITH 절 처리 - 최우선 규칙]
★ PostgreSQL의 WITH ... CTE 구문을 발견하면:
  1. WITH 키워드 완전 제거
  2. 모든 CTE (Common Table Expression)를 FROM 절의 인라인 서브쿼리로 변환
  3. 예: WITH A AS (SELECT ...) SELECT * FROM A
     → SELECT * FROM (SELECT ...) A"""

        # 맥락 정보 구성
        context_info = ""
        if prev_context:
            context_info += f"\n=== 이전 부분의 마지막 {CONTEXT_LINES}줄 (참고용) ===\n{prev_context}\n"
        if next_context:
            context_info += f"\n=== 다음 부분의 첫 {CONTEXT_LINES}줄 (참고용) ===\n{next_context}\n"
        
        # 청크 타입별 특별 지시
        type_specific_instruction = ""
        
        # CTE 포함 여부 체크
        chunk_text = chunk.get('text', '')
        is_cte_chunk = 'CTE' in chunk['type'] or self.contains_cte(chunk_text)
        
        if chunk['type'] == 'SPEC':
            type_specific_instruction = """
이 부분은 프로시저 헤더입니다.
- CREATE OR REPLACE PROCEDURE 형식으로 변환
- 마지막에 IS 또는 AS로 끝나야 함
- $procedure$, $$ 등의 PostgreSQL 구분자는 완전히 제거"""
        elif chunk['type'] == 'DECLARE':
            type_specific_instruction = """
이 부분은 변수 선언부입니다.
- DECLARE 키워드는 절대 포함하지 마세요
- 변수 선언만 반환 (v_name TYPE; 형식)
- 각 변수 선언 끝에 세미콜론 필요"""
        elif 'BEGIN' in chunk['type'] or 'STATEMENTS' in chunk['type'] or 'CTE' in chunk['type']:
            if is_cte_chunk:
                type_specific_instruction = """
【🔥 CTE 구문 감지됨 - 최우선 변환 규칙 🔥】

이 청크는 PostgreSQL WITH ... CTE 구문을 포함하고 있습니다.
★★★ 필수: WITH 절을 완전히 제거하고 모든 CTE를 인라인 서브쿼리로 변환하세요! ★★★

변환 방법:
1. WITH 키워드 제거
2. 각 CTE (WITH A AS (...), B AS (...))를 FROM 절의 서브쿼리로 변환
3. CTE 별칭 유지 (예: ) MAT, ) CODE, ) P)
4. ::varchar, ::numeric 등 타입캐스팅 제거
5. date_part('day', date) → EXTRACT(DAY FROM date)
6. CROSS JOIN params 제거하고 변수 직접 참조
7. RIGHT JOIN → LEFT JOIN (테이블 순서 변경)

예시:
PostgreSQL:
  WITH params AS (SELECT p_val::varchar AS val FROM dual),
       result AS (SELECT * FROM table1 WHERE id = p_val)
  INSERT INTO target SELECT * FROM result CROSS JOIN params

Oracle:
  INSERT INTO target 
  SELECT * FROM (SELECT * FROM table1 WHERE id = p_val) result
  -- params CTE 제거, p_val 직접 사용"""
            else:
                type_specific_instruction = """
이 부분은 실행 블록입니다.
- 각 SQL 문 끝에 세미콜론 필요
- 블록 키워드(IF, LOOP, BEGIN 등) 뒤에는 세미콜론 불필요
- END IF;, END LOOP;, END; 형식 준수"""
        
        user_message = f"""다음 PostgreSQL PL/pgSQL 코드를 Oracle PL/SQL로 완벽하게 변환하세요.

=== 현재 변환할 부분 정보 ===
- 위치: 전체 {total_chunks}개 청크 중 {chunk_index}번째
- 블록 타입: {chunk['type']}
- 설명: {chunk['description']}
{type_specific_instruction}

{context_info}

=== 변환할 PostgreSQL 코드 ===
{chunk['text']}

=== 변환 결과 (Oracle PL/SQL만 반환) ==="""

        # 요청 크기가 너무 크면 청크를 더 작게 나눔
        total_message_size = len(system_message) + len(user_message)
        if total_message_size > MAX_CHARS_PER_REQUEST:
            print(f"    [경고] 요청이 너무 큽니다 ({total_message_size:,} 문자 > {MAX_CHARS_PER_REQUEST:,})")
            print(f"    [경고] 청크를 더 작게 나누어 처리합니다...")
            
            # 라인 수로 반으로 나누기
            mid_line = (chunk['startLine'] + chunk['endLine']) // 2
            
            # 첫 번째 절반
            chunk1 = {
                'type': chunk['type'] + '_PART1',
                'startLine': chunk['startLine'],
                'endLine': mid_line,
                'text': self.get_sql_text(chunk['startLine'], mid_line),
                'description': chunk['description'] + ' (Part 1/2)'
            }
            
            # 두 번째 절반
            chunk2 = {
                'type': chunk['type'] + '_PART2',
                'startLine': mid_line + 1,
                'endLine': chunk['endLine'],
                'text': self.get_sql_text(mid_line + 1, chunk['endLine']),
                'description': chunk['description'] + ' (Part 2/2)'
            }
            
            # 재귀적으로 각 절반 변환
            result1 = self.convert_chunk(chunk1, chunk_index, total_chunks, all_chunks)
            result2 = self.convert_chunk(chunk2, chunk_index, total_chunks, all_chunks)
            
            return f"{result1}\n\n{result2}"

        return self.call_llm(system_message, user_message)
    
    def reassemble_procedure(self, converted_chunks: List[Dict[str, Any]]) -> str:
        """변환된 청크들을 하나의 Oracle 프로시저로 재조립"""
        result = []
        
        result.append("-- ============================================================================")
        result.append("-- Converted from PostgreSQL PL/pgSQL to Oracle PL/SQL")
        result.append("-- Original file: " + str(self.sql_file.name))
        from datetime import datetime
        result.append("-- Conversion date: " + datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
        result.append("-- Total chunks: " + str(len(converted_chunks)))
        result.append("-- ============================================================================")
        result.append("")
        
        # SPEC 부분 (프로시저 헤더)
        spec_chunks = [c for c in converted_chunks if c['original_type'] == 'SPEC']
        if spec_chunks:
            spec_text = spec_chunks[0]['converted_text'].strip()
            if spec_text:
                result.append(spec_text)
                result.append("")
        else:
            print("[경고] SPEC 청크가 없습니다. 프로시저 헤더가 누락될 수 있습니다.")
        
        # DECLARE 부분 (변수 선언)
        declare_chunks = [c for c in converted_chunks if c['original_type'] == 'DECLARE']
        if declare_chunks:
            declare_text = declare_chunks[0]['converted_text'].strip()
            if declare_text:
                result.append(declare_text)
                result.append("")
        
        # BEGIN 블록 시작
        begin_chunks = [c for c in converted_chunks if c['original_type'] not in ['SPEC', 'DECLARE']]
        if begin_chunks:
            # 첫 번째 BEGIN 청크가 BEGIN 키워드로 시작하는지 확인
            first_chunk_text = begin_chunks[0]['converted_text'].strip()
            has_begin = first_chunk_text.upper().startswith('BEGIN')
            
            if not has_begin:
                result.append("BEGIN")
                result.append("")
            
            # 모든 BEGIN 블록 추가
            for i, chunk in enumerate(begin_chunks):
                chunk_text = chunk['converted_text'].strip()
                if chunk_text:
                    # 에러 메시지가 포함된 경우 경고
                    if chunk_text.startswith('-- API ERROR') or chunk_text.startswith('-- TIMEOUT ERROR'):
                        print(f"[경고] 청크 {i+1}에서 변환 오류가 발생했습니다: {chunk['description']}")
                    
                    result.append(chunk_text)
                    result.append("")
            
            # 마지막 청크가 END로 끝나는지 확인
            last_chunk_text = begin_chunks[-1]['converted_text'].strip()
            has_end = any(last_chunk_text.upper().endswith(ending) for ending in ['END;', 'END LOOP;', 'END IF;'])
            
            if not has_end and not last_chunk_text.upper().endswith('END'):
                result.append("END;")
                result.append("")
        else:
            # BEGIN 블록이 없으면 최소한의 구조 생성
            result.append("BEGIN")
            result.append("  NULL;")
            result.append("END;")
            result.append("")
        
        # Oracle SQL*Plus 실행 명령어
        result.append("/")
        result.append("")
        
        return '\n'.join(result)
    
    def convert(self):
        """메인 변환 프로세스"""
        print("\n" + "="*80)
        print("PostgreSQL → Oracle 변환 시작")
        print("="*80 + "\n")
        
        # 1단계: 청크 분할
        print("1단계: SQL 구문 분석 및 청크 분할...")
        chunks = self.split_into_chunks(self.structure)
        print(f"✓ 총 {len(chunks)}개의 청크로 분할 완료\n")
        
        # 청크가 없거나 비정상적인 경우 경고
        if not chunks:
            print("[경고] 청크가 하나도 생성되지 않았습니다!")
            print("structure.json 파일 구조를 확인하세요.")
            print("\n현재 structure.json 구조:")
            print(json.dumps(self.structure, indent=2, ensure_ascii=False)[:500] + "...")
            return None
        
        # 청크 정보 출력
        print("청크 목록:")
        for i, chunk in enumerate(chunks, 1):
            line_count = chunk['endLine'] - chunk['startLine'] + 1
            text_preview = chunk['text'][:50].replace('\n', ' ') if chunk['text'] else '(empty)'
            print(f"  {i}. {chunk['type']}: {chunk['description']}")
            print(f"      라인: {chunk['startLine']}-{chunk['endLine']} ({line_count} lines)")
            print(f"      미리보기: {text_preview}...")
        print()
        
        # 2단계: 각 청크를 LLM으로 변환 (주변 맥락 포함)
        print("2단계: 각 청크를 Oracle로 변환 (주변 맥락 참고)...")
        converted_chunks = []
        
        import time
        start_time = time.time()
        
        for i, chunk in enumerate(chunks, 1):
            chunk_start = time.time()
            converted_text = self.convert_chunk(chunk, i, len(chunks), all_chunks=chunks)
            chunk_elapsed = time.time() - chunk_start
            
            converted_chunks.append({
                'original_type': chunk['type'],
                'original_lines': (chunk['startLine'], chunk['endLine']),
                'description': chunk['description'],
                'converted_text': converted_text
            })
            
            # 진행 상황 표시
            elapsed = time.time() - start_time
            avg_time = elapsed / i
            remaining = avg_time * (len(chunks) - i)
            
            print(f"  진행: {i}/{len(chunks)} ({i*100//len(chunks)}%) | "
                  f"경과: {elapsed:.1f}초 | "
                  f"예상 남은 시간: {remaining:.1f}초")
        
        total_elapsed = time.time() - start_time
        print(f"✓ 모든 청크 변환 완료 (총 소요 시간: {total_elapsed:.1f}초)\n")
        
        # 3단계: 재조립
        print("3단계: 변환된 청크를 하나의 프로시저로 재조립...")
        final_oracle_sql = self.reassemble_procedure(converted_chunks)
        print("✓ 재조립 완료\n")
        
        # 4단계: 결과 저장
        print("4단계: 결과 저장...")
        output_file = self.output_dir / f"{self.sql_file.stem}_oracle.sql"
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(final_oracle_sql)
        print(f"✓ 저장 완료: {output_file}\n")
        
        # 중간 결과도 저장 (디버깅용)
        debug_file = self.output_dir / f"{self.sql_file.stem}_chunks_debug.json"
        with open(debug_file, 'w', encoding='utf-8') as f:
            json.dump(converted_chunks, f, indent=2, ensure_ascii=False)
        print(f"✓ 디버그 파일 저장: {debug_file}\n")
        
        # 5단계: 변환 통계 출력
        print("="*80)
        print("변환 완료 요약")
        print("="*80)
        print(f"원본 파일: {self.sql_file.name}")
        print(f"총 라인 수: {len(self.sql_lines):,} 라인")
        print(f"총 청크 수: {len(chunks)} 개")
        
        # 에러 청크 카운트
        error_chunks = [c for c in converted_chunks 
                       if '-- API ERROR' in c['converted_text'] 
                       or '-- TIMEOUT ERROR' in c['converted_text']
                       or '-- NETWORK ERROR' in c['converted_text']]
        
        if error_chunks:
            print(f"⚠️  변환 실패 청크: {len(error_chunks)} 개")
            print("   다음 청크에서 오류가 발생했습니다:")
            for err_chunk in error_chunks:
                print(f"   - {err_chunk['description']} (라인 {err_chunk['original_lines'][0]}-{err_chunk['original_lines'][1]})")
        else:
            print(f"✓ 모든 청크 변환 성공!")
        
        print(f"\n출력 파일: {output_file}")
        print(f"파일 크기: {output_file.stat().st_size:,} bytes")
        print(f"변환 소요 시간: {total_elapsed:.1f}초")
        print("="*80)
        
        return output_file


def main():
    """메인 함수"""
    print("""
    ╔════════════════════════════════════════════════════════════════╗
    ║   PostgreSQL PL/pgSQL → Oracle PL/SQL 변환기                 ║
    ║   Structure.json 기반 지능형 청크 분할 및 LLM 변환          ║
    ╚════════════════════════════════════════════════════════════════╝
    """)
    
    # 설정 확인
    print("현재 설정:")
    print(f"  작업 디렉토리: {WORK_DIR}")
    print(f"  SQL 파일: {SQL_FILE_NAME}")
    print(f"  Structure 파일: {STRUCTURE_FILE_NAME}")
    print(f"  LLM 모델: {LLM_MODEL}")
    print(f"  청크당 최대 라인: {MAX_LINES_PER_CHUNK}")
    print(f"  맥락 참고 라인: {CONTEXT_LINES}")
    print(f"  API 재시도 횟수: {MAX_RETRIES}")
    print()
    
    # 변환 실행
    try:
        converter = PlpgsqlToOracleConverter(WORK_DIR, SQL_FILE_NAME, STRUCTURE_FILE_NAME)
        output_file = converter.convert()
        
        if output_file:
            print(f"\n✓ 성공! 변환된 파일: {output_file}")
        else:
            print(f"\n✗ 변환 실패! 위의 오류 메시지를 확인하세요.")
        
    except FileNotFoundError as e:
        print(f"\n✗ 파일을 찾을 수 없습니다: {e}")
        print("  설정 영역에서 파일 경로를 확인해주세요.")
    except Exception as e:
        print(f"\n✗ 오류 발생: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    main()

