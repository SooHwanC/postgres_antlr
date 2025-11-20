"""
PostgreSQL to Oracle 프로시저 변환 스크립트
AST JSON 기반 + LLM 활용 자동 변환
"""

# ============================================================================
# 설정 (여기를 수정하세요)
# ============================================================================
API_URL = "https://your-company.com/api/chat"  # LLM API URL
API_KEY = "your-api-key-here"                   # API 키
MODEL = "gpt-4.1"                               # 모델명
FOLDER_PATH = "/path/to/your/folder"           # SQL 및 JSON 파일이 있는 폴더
# ============================================================================

import json
import os
import requests
from pathlib import Path
from typing import Dict, List, Any, Tuple
from datetime import datetime


class PgToOracleConverter:
    """PostgreSQL을 Oracle로 변환하는 메인 클래스"""
    
    def __init__(self, api_url: str, api_key: str, model: str = "gpt-4.1"):
        self.api_url = api_url
        self.api_key = api_key
        self.model = model
        

    
    def call_llm(self, system_msg: str, user_msg: str) -> str:
        """LLM API 호출"""
        headers = {
            'Authorization': self.api_key,
            'Content-Type': 'application/json'
        }
        
        payload = {
            "messages": [
                {
                    "role": "system",
                    "content": system_msg
                },
                {
                    "role": "user",
                    "content": user_msg
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
            return response.text
        except Exception as e:
            print(f"⚠ LLM API 호출 실패: {e}")
            return None
    
    def extract_code_by_lines(self, source_code: str, start_line: int, end_line: int) -> str:
        """라인 번호로 코드 추출"""
        lines = source_code.split('\n')
        # 라인 번호가 0부터 시작하는지 1부터 시작하는지 확인 필요
        # 보통 AST는 1부터 시작하므로 -1 조정
        start_idx = max(0, start_line - 1) if start_line > 0 else start_line
        end_idx = end_line if end_line > 0 else end_line
        
        return '\n'.join(lines[start_idx:end_idx + 1])

    def llm_convert(self, code: str, node_type: str, context: str = "") -> str:
        """LLM을 사용한 변환"""
        
        system_msg = """당신은 PostgreSQL을 Oracle PL/SQL로 변환하는 전문가입니다.
정확하고 실행 가능한 Oracle 코드만 출력하세요.
설명이나 주석은 최소화하고, 변환된 코드만 제공하세요."""

        user_msg = f"""다음 PostgreSQL 코드를 Oracle PL/SQL로 변환해주세요.

노드 타입: {node_type}
{context}

PostgreSQL 코드:
```sql
{code}
```

변환 시 주의사항:
1. 함수명 변환: string_agg→LISTAGG, now()→SYSDATE 등
2. 데이터 타입: TEXT→VARCHAR2(4000) or CLOB, BOOLEAN→NUMBER(1)
3. 임시 테이블: CREATE TEMP TABLE → CREATE GLOBAL TEMPORARY TABLE (ON COMMIT 추가)
4. 예외 처리: RAISE NOTICE → DBMS_OUTPUT.PUT_LINE
5. 타입 캐스팅: ::text → TO_CHAR(), ::integer → TO_NUMBER()
6. 커서: RETURNS TABLE → OUT SYS_REFCURSOR
7. DROP IF EXISTS → BEGIN/EXCEPTION으로 감싸기

변환된 Oracle 코드만 출력하세요 (코드블록 마크다운 제외):"""

        result = self.call_llm(system_msg, user_msg)
        
        if result:
            # 마크다운 코드블록 제거
            result = result.replace('```sql', '').replace('```', '').strip()
            return result
        else:
            # LLM 실패 시 원본 반환
            print(f"  ⚠ LLM 변환 실패, 원본 코드 유지")
            return code
    
    
    def analyze_ast_statistics(self, ast: Dict) -> Dict[str, int]:
        """AST 구조 분석"""
        stats = {}
        
        def count_nodes(node):
            if isinstance(node, dict):
                node_type = node.get('type', '')
                if node_type:
                    stats[node_type] = stats.get(node_type, 0) + 1
                
                if 'children' in node:
                    for child in node.get('children', []):
                        count_nodes(child)
            elif isinstance(node, list):
                for item in node:
                    count_nodes(item)
        
        count_nodes(ast)
        return stats
    
    def collect_conversion_nodes(self, ast: Dict, source_code: str) -> List[Dict]:
        """변환이 필요한 노드들 수집"""
        nodes_to_convert = []
        
        def traverse(node, depth=0):
            if not isinstance(node, dict):
                return
            
            node_type = node.get('type', '')
            start_line = node.get('startLine', 0)
            end_line = node.get('endLine', 0)
            
            # 변환 대상 노드
            if node_type and start_line is not None and end_line is not None:
                # ROOT, SPEC, FILE 같은 메타 노드는 제외
                if node_type not in ['ROOT', 'SPEC', 'FILE']:
                    code = self.extract_code_by_lines(source_code, start_line, end_line)
                    
                    # 코드가 너무 크면 자식 노드로 분할
                    line_count = end_line - start_line + 1
                    
                    if line_count > 1000 and 'children' in node and node['children']:
                        # 큰 노드는 자식으로 재귀
                        if 'children' in node:
                            for child in node.get('children', []):
                                traverse(child, depth + 1)
                    else:
                        # 변환 대상으로 추가
                        nodes_to_convert.append({
                            'type': node_type,
                            'start_line': start_line,
                            'end_line': end_line,
                            'line_count': line_count,
                            'code': code,
                            'depth': depth
                        })
                        return  # 자식은 이미 포함되어 있으므로 중단
            
            # 자식 노드 순회
            if 'children' in node:
                for child in node.get('children', []):
                    traverse(child, depth + 1)
        
        traverse(ast)
        
        # 라인 번호 순으로 정렬
        nodes_to_convert.sort(key=lambda x: x['start_line'])
        
        return nodes_to_convert
    
    def merge_converted_nodes(self, nodes: List[Dict], original_code: str) -> str:
        """변환된 노드들을 하나의 Oracle 코드로 병합"""
        
        # 라인 번호로 정렬
        sorted_nodes = sorted(nodes, key=lambda x: x['start_line'])
        
        # 중복 제거 (부모-자식 관계에서 중복 발생 가능)
        unique_nodes = []
        covered_lines = set()
        
        for node in sorted_nodes:
            node_lines = set(range(node['start_line'], node['end_line'] + 1))
            # 이미 커버된 라인과 겹치지 않으면 추가
            if not node_lines.intersection(covered_lines):
                unique_nodes.append(node)
                covered_lines.update(node_lines)
        
        # Oracle 코드 조립
        oracle_parts = []
        
        for node in unique_nodes:
            oracle_parts.append(f"\n-- Lines {node['start_line']}-{node['end_line']}: {node['type']}")
            oracle_parts.append(node['converted_code'])
            oracle_parts.append("")
        
        return '\n'.join(oracle_parts)
    
    def add_oracle_header(self, code: str, stats: Dict) -> str:
        """Oracle 프로시저 헤더 추가"""
        header = f"""-- ============================================================================
-- PostgreSQL to Oracle PL/SQL 자동 변환
-- 변환 일시: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}
-- 원본 통계:
"""
        for node_type, count in sorted(stats.items()):
            header += f"--   {node_type}: {count}\n"
        
        header += """-- ============================================================================
-- 주의: 자동 변환된 코드이므로 반드시 검토 후 사용하세요!
-- 확인 필요 항목:
--   1. 데이터 타입 (TEXT, BOOLEAN 등)
--   2. 임시 테이블 ON COMMIT 옵션
--   3. 예외 처리
--   4. 커서 및 반환값
--   5. 성능 (인덱스, 실행계획)
-- ============================================================================

SET SERVEROUTPUT ON SIZE UNLIMITED;

"""
        
        footer = """

/

-- ============================================================================
-- 변환 완료
-- 다음 명령어로 컴파일 오류 확인:
--   SHOW ERRORS;
-- ============================================================================
"""
        
        return header + code + footer
    
    def convert(self, sql_file: str, ast_file: str, output_dir: str) -> str:
        """메인 변환 로직"""
        
        print("\n" + "=" * 80)
        print("PostgreSQL to Oracle 프로시저 변환 시작")
        print("=" * 80)
        
        # 1. 파일 로드
        print("\n[1/6] 파일 로드 중...")
        with open(sql_file, 'r', encoding='utf-8') as f:
            source_code = f.read()
        
        with open(ast_file, 'r', encoding='utf-8') as f:
            ast = json.load(f)
        
        total_lines = len(source_code.split('\n'))
        print(f"  ✓ SQL 파일: {sql_file}")
        print(f"  ✓ 전체 라인 수: {total_lines:,}줄")
        
        # 2. AST 분석
        print("\n[2/6] AST 구조 분석 중...")
        stats = self.analyze_ast_statistics(ast)
        print("  ✓ 노드 통계:")
        for node_type, count in sorted(stats.items()):
            print(f"     - {node_type}: {count}개")
        
        # 3. 변환 대상 노드 수집
        print("\n[3/6] 변환 대상 노드 수집 중...")
        nodes = self.collect_conversion_nodes(ast, source_code)
        print(f"  ✓ 총 {len(nodes)}개 변환 단위 생성")
        
        # 4. 노드별 변환
        print("\n[4/6] 노드별 LLM 변환 중...")
        converted_count = 0
        
        for i, node in enumerate(nodes, 1):
            node_type = node['type']
            line_range = f"{node['start_line']}-{node['end_line']}"
            line_count = node['line_count']
            
            print(f"  [{i}/{len(nodes)}] {node_type} (라인 {line_range}, {line_count}줄)")
            print(f"      → LLM 변환 중...")
            
            # 모든 노드를 LLM으로 변환
            node['converted_code'] = self.llm_convert(
                node['code'],
                node_type,
                f"라인 {line_range}, {line_count}줄"
            )
            
            converted_count += 1
        
        print(f"  ✓ {converted_count}개 노드 변환 완료")

        
        # 5. 병합
        print("\n[5/6] 변환된 코드 병합 중...")
        merged_code = self.merge_converted_nodes(nodes, source_code)
        
        # 6. 헤더 추가 및 저장
        print("\n[6/6] 최종 파일 생성 중...")
        final_code = self.add_oracle_header(merged_code, stats)
        
        # 출력 디렉토리 생성
        os.makedirs(output_dir, exist_ok=True)
        
        # 파일명 생성
        sql_filename = Path(sql_file).stem
        output_file = os.path.join(output_dir, f"{sql_filename}_oracle.sql")
        
        with open(output_file, 'w', encoding='utf-8') as f:
            f.write(final_code)
        
        output_lines = len(final_code.split('\n'))
        print(f"  ✓ 변환 완료: {output_file}")
        print(f"  ✓ 생성된 라인 수: {output_lines:,}줄")
        
        # 요약 통계
        print("\n" + "=" * 80)
        print("변환 완료 요약")
        print("=" * 80)
        print(f"원본 파일:     {sql_file}")
        print(f"원본 라인 수:  {total_lines:,}줄")
        print(f"변환 단위:     {len(nodes)}개")
        print(f"결과 파일:     {output_file}")
        print(f"결과 라인 수:  {output_lines:,}줄")
        print("=" * 80)
        print("\n⚠ 주의: 자동 변환된 코드이므로 반드시 수동 검토가 필요합니다!")
        print("  1. Oracle SQL Developer에서 컴파일 오류 확인")
        print("  2. 데이터 타입 검토 (TEXT, BOOLEAN 등)")
        print("  3. 임시 테이블 ON COMMIT 옵션 확인")
        print("  4. 테스트 케이스 실행")
        print("\n")
        
        return output_file


def main():
    """메인 실행 함수"""
    print("=" * 80)
    print("PostgreSQL to Oracle 프로시저 변환 도구")
    print("=" * 80)
    print()
    
    # 설정값 확인
    print("📋 현재 설정")
    print("-" * 80)
    print(f"API URL:    {API_URL}")
    print(f"API KEY:    {API_KEY[:10]}..." if len(API_KEY) > 10 else f"API KEY:    {API_KEY}")
    print(f"MODEL:      {MODEL}")
    print(f"FOLDER:     {FOLDER_PATH}")
    print()
    
    # 폴더 존재 확인
    if not os.path.isdir(FOLDER_PATH):
        print(f"❌ 오류: 폴더를 찾을 수 없습니다: {FOLDER_PATH}")
        print("→ 스크립트 상단의 FOLDER_PATH를 올바른 경로로 수정하세요.")
        return
    
    # 폴더 내 파일 자동 감지
    sql_files = [f for f in os.listdir(FOLDER_PATH) if f.endswith('.sql')]
    json_files = [f for f in os.listdir(FOLDER_PATH) if f.endswith('.json')]
    
    if not sql_files:
        print(f"❌ 오류: SQL 파일을 찾을 수 없습니다.")
        return
    
    if not json_files:
        print(f"❌ 오류: JSON 파일을 찾을 수 없습니다.")
        return
    
    print(f"✓ 발견된 SQL 파일: {sql_files}")
    print(f"✓ 발견된 JSON 파일: {json_files}")
    print()
    
    # 파일 선택
    if len(sql_files) == 1 and len(json_files) == 1:
        sql_file = sql_files[0]
        json_file = json_files[0]
        print(f"📄 사용할 파일:")
        print(f"   SQL:  {sql_file}")
        print(f"   JSON: {json_file}")
    else:
        print("📄 파일 선택")
        for i, f in enumerate(sql_files, 1):
            print(f"   {i}. {f}")
        sql_idx = int(input(f"SQL 파일 번호 (1-{len(sql_files)}): ")) - 1
        sql_file = sql_files[sql_idx]
        
        for i, f in enumerate(json_files, 1):
            print(f"   {i}. {f}")
        json_idx = int(input(f"JSON 파일 번호 (1-{len(json_files)}): ")) - 1
        json_file = json_files[json_idx]
    
    sql_path = os.path.join(FOLDER_PATH, sql_file)
    json_path = os.path.join(FOLDER_PATH, json_file)
    
    # 출력 디렉토리
    output_dir = os.path.join(FOLDER_PATH, "output")
    
    print()
    print("📤 출력 정보")
    print("-" * 80)
    print(f"출력 폴더: {output_dir}")
    
    print()
    confirm = input("변환을 시작하시겠습니까? (y/n): ").strip().lower()
    if confirm != 'y':
        print("변환을 취소했습니다.")
        return
    
    # 변환 실행
    try:
        converter = PgToOracleConverter(API_URL, API_KEY, MODEL)
        output_file = converter.convert(sql_path, json_path, output_dir)
        print(f"\n✅ 성공: 변환이 완료되었습니다!")
        print(f"📄 결과 파일: {output_file}")
    except Exception as e:
        print(f"\n❌ 오류 발생: {e}")
        import traceback
        traceback.print_exc()



if __name__ == '__main__':
    main()