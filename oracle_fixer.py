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
WORK_DIR = r"C:\Users\r"

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
        
        # 라인 수 계산
        line_count = end_line - start_line + 1
        
        # 최상위 노드는 건너뛰기
        if node_type == 'ROOT':
            for child in children:
                chunks.extend(self.split_into_chunks(child, depth + 1))
            return chunks
        
        # CREATE_FUNCTION은 SPEC, DECLARE, BEGIN으로 분할
        if node_type == 'CREATE_FUNCTION':
            # SPEC 부분 처리
            spec_node = next((c for c in children if c.get('type') == 'SPEC'), None)
            if spec_node:
                chunks.append({
                    'type': 'SPEC',
                    'startLine': spec_node['startLine'],
                    'endLine': spec_node['endLine'],
                    'text': self.get_sql_text(spec_node['startLine'], spec_node['endLine']),
                    'description': 'Procedure Specification'
                })
            
            # DECLARE 부분 처리
            declare_node = next((c for c in children if c.get('type') == 'DECLARE'), None)
            if declare_node:
                chunks.append({
                    'type': 'DECLARE',
                    'startLine': declare_node['startLine'],
                    'endLine': declare_node['endLine'],
                    'text': self.get_sql_text(declare_node['startLine'], declare_node['endLine']),
                    'description': 'Variable Declarations'
                })
            
            # BEGIN 부분 처리 - 이 부분이 제일 크므로 세분화
            begin_node = next((c for c in children if c.get('type') == 'BEGIN'), None)
            if begin_node:
                chunks.extend(self.split_begin_block(begin_node))
            
            return chunks
        
        # 기타 노드 처리
        if line_count <= MAX_LINES_PER_CHUNK:
            # 작은 블록은 그대로 추가
            chunks.append({
                'type': node_type,
                'startLine': start_line,
                'endLine': end_line,
                'text': self.get_sql_text(start_line, end_line),
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
            return [{
                'type': 'BEGIN',
                'startLine': begin_node['startLine'],
                'endLine': begin_node['endLine'],
                'text': self.get_sql_text(begin_node['startLine'], begin_node['endLine']),
                'description': 'Main BEGIN block'
            }]
        
        # 자식 노드들을 그룹화
        current_group = []
        current_lines = 0
        
        for i, child in enumerate(children):
            child_lines = child['endLine'] - child['startLine'] + 1
            
            # IF, LOOP, WHILE 등 큰 제어문은 독립적으로 처리
            if child.get('type') in ['IF', 'LOOP', 'WHILE', 'FOR', 'CASE'] and child_lines > MAX_LINES_PER_CHUNK / 2:
                # 현재 그룹이 있으면 먼저 처리
                if current_group:
                    chunks.append(self.create_group_chunk(current_group, 'STATEMENTS'))
                    current_group = []
                    current_lines = 0
                
                # 큰 제어문 추가 (재귀적으로 분할)
                chunks.extend(self.split_into_chunks(child, 1))
            else:
                # 그룹에 추가
                current_group.append(child)
                current_lines += child_lines
                
                # 그룹이 너무 크면 청크로 만들기
                if current_lines >= MAX_LINES_PER_CHUNK:
                    chunks.append(self.create_group_chunk(current_group, 'STATEMENTS'))
                    current_group = []
                    current_lines = 0
        
        # 남은 그룹 처리
        if current_group:
            chunks.append(self.create_group_chunk(current_group, 'STATEMENTS'))
        
        return chunks
    
    def create_group_chunk(self, nodes: List[Dict[str, Any]], chunk_type: str) -> Dict[str, Any]:
        """여러 노드를 하나의 청크로 그룹화"""
        if not nodes:
            return None
        
        start_line = min(n['startLine'] for n in nodes)
        end_line = max(n['endLine'] for n in nodes)
        types = [n.get('type', 'UNKNOWN') for n in nodes]
        
        return {
            'type': chunk_type,
            'startLine': start_line,
            'endLine': end_line,
            'text': self.get_sql_text(start_line, end_line),
            'description': f'Group of {len(nodes)} statements: {", ".join(set(types))}'
        }
    
    def split_large_block(self, block_type: str, start_line: int, end_line: int) -> List[Dict[str, Any]]:
        """큰 블록을 강제로 라인 단위로 분할"""
        chunks = []
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
    
    def call_llm(self, system_message: str, user_message: str) -> str:
        """LLM API 호출"""
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
            response = requests.post(LLM_URL, headers=headers, json=data, timeout=120)
            response.raise_for_status()
            
            # 응답에서 text 추출 (실제 API 응답 형식에 맞게 조정 필요)
            result = response.json()
            
            # 일반적인 OpenAI 호환 API 형식
            if 'choices' in result and len(result['choices']) > 0:
                return result['choices'][0]['message']['content']
            # 직접 text 반환 형식
            elif 'text' in result:
                return result['text']
            else:
                return str(result)
                
        except Exception as e:
            print(f"✗ LLM API 호출 실패: {e}")
            return f"-- ERROR: {e}\n{user_message}"
    
    def convert_chunk(self, chunk: Dict[str, Any], chunk_index: int, total_chunks: int) -> str:
        """단일 청크를 Oracle로 변환"""
        print(f"  [{chunk_index}/{total_chunks}] 변환 중: {chunk['description']} (lines {chunk['startLine']}-{chunk['endLine']})")
        
        system_message = """You are an expert database developer specializing in converting PostgreSQL PL/pgSQL to Oracle PL/SQL.

Key conversion rules:
1. Change PROCEDURE syntax from PostgreSQL to Oracle format
2. Convert data types: varchar → VARCHAR2, datetime → DATE or TIMESTAMP, etc.
3. Convert control structures: IF/LOOP/WHILE/FOR to Oracle syntax
4. Change function calls: EXTRACT() → appropriate Oracle functions, NOW() → SYSDATE, etc.
5. Convert temporary tables to Oracle global temporary tables or collections
6. Change RAISE INFO to DBMS_OUTPUT.PUT_LINE
7. Convert cursors and refcursors to Oracle syntax
8. Convert string operations: || concatenation, SUBSTRING, etc.
9. Handle exception blocks properly
10. Remove PostgreSQL-specific features like $procedure$ and replace with proper Oracle delimiters

Return ONLY the converted Oracle PL/SQL code without explanations."""

        user_message = f"""Convert the following PostgreSQL PL/pgSQL code segment to Oracle PL/SQL.
This is part {chunk_index} of {total_chunks} in a larger procedure.
Block type: {chunk['type']}
Description: {chunk['description']}

PostgreSQL Code:
{chunk['text']}

Oracle PL/SQL:"""

        return self.call_llm(system_message, user_message)
    
    def reassemble_procedure(self, converted_chunks: List[Dict[str, Any]]) -> str:
        """변환된 청크들을 하나의 Oracle 프로시저로 재조립"""
        result = []
        
        result.append("-- ============================================================================")
        result.append("-- Converted from PostgreSQL PL/pgSQL to Oracle PL/SQL")
        result.append("-- Original file: " + str(self.sql_file.name))
        result.append("-- Conversion date: " + str(Path.cwd()))
        result.append("-- ============================================================================")
        result.append("")
        
        # SPEC 부분
        spec_chunks = [c for c in converted_chunks if c['original_type'] == 'SPEC']
        if spec_chunks:
            result.append(spec_chunks[0]['converted_text'])
            result.append("")
        
        # DECLARE 부분
        declare_chunks = [c for c in converted_chunks if c['original_type'] == 'DECLARE']
        if declare_chunks:
            result.append(declare_chunks[0]['converted_text'])
            result.append("")
        
        # BEGIN 부분 및 기타
        begin_chunks = [c for c in converted_chunks if c['original_type'] not in ['SPEC', 'DECLARE']]
        if begin_chunks:
            for chunk in begin_chunks:
                result.append(chunk['converted_text'])
                result.append("")
        
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
        
        # 청크 정보 출력
        print("청크 목록:")
        for i, chunk in enumerate(chunks, 1):
            print(f"  {i}. {chunk['type']}: {chunk['description']} (lines {chunk['startLine']}-{chunk['endLine']}, {chunk['endLine']-chunk['startLine']+1} lines)")
        print()
        
        # 2단계: 각 청크를 LLM으로 변환
        print("2단계: 각 청크를 Oracle로 변환...")
        converted_chunks = []
        
        for i, chunk in enumerate(chunks, 1):
            converted_text = self.convert_chunk(chunk, i, len(chunks))
            converted_chunks.append({
                'original_type': chunk['type'],
                'original_lines': (chunk['startLine'], chunk['endLine']),
                'description': chunk['description'],
                'converted_text': converted_text
            })
        
        print(f"✓ 모든 청크 변환 완료\n")
        
        # 3단계: 재조립
        print("3단계: 변환된 청크를 하나의 프로시저로 재조립...")
        final_oracle_sql = self.reassemble_procedure(converted_chunks)
        print("✓ 재조립 완료\n")
        
        # 4단계: 저장
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
        
        print("="*80)
        print("변환 완료!")
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
    print()
    
    # 변환 실행
    try:
        converter = PlpgsqlToOracleConverter(WORK_DIR, SQL_FILE_NAME, STRUCTURE_FILE_NAME)
        output_file = converter.convert()
        
        print(f"\n✓ 성공! 변환된 파일: {output_file}")
        
    except FileNotFoundError as e:
        print(f"\n✗ 파일을 찾을 수 없습니다: {e}")
        print("  설정 영역에서 파일 경로를 확인해주세요.")
    except Exception as e:
        print(f"\n✗ 오류 발생: {e}")
        import traceback
        traceback.print_exc()


if __name__ == "__main__":
    main()

