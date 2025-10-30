import os
import json
import argparse
from typing import Any, Dict, List, Optional, Tuple
import sys

# Optional: OpenAI SDK (requires OPENAI_API_KEY)
try:
    from openai import OpenAI
except Exception:
    OpenAI = None  # type: ignore

# Optional: tqdm progress bar (not used in single-output mode)
try:
    from tqdm import tqdm  # noqa: F401
except Exception:
    pass
DEFAULT_API_KEY = os.getenv("OPENAI_API_KEY")

def read_file_lines(path: str) -> List[str]:
    with open(path, "r", encoding="utf-8") as f:
        return f.read().splitlines()


def load_structure(path: str) -> Dict[str, Any]:
    with open(path, "r", encoding="utf-8") as f:
        return json.load(f)


def iter_nodes(node: Dict[str, Any]) -> List[Dict[str, Any]]:
    out: List[Dict[str, Any]] = [node]
    for child in node.get("children", []):
        out.extend(iter_nodes(child))
    return out


def slice_source(lines: List[str], start_line: int, end_line: Optional[int]) -> str:
    if start_line is None:
        return ""
    if end_line is None or end_line == 0:
        end_line = start_line
    # Lines are 1-based in structure.json
    start_idx = max(0, start_line - 1)
    end_idx = min(len(lines), end_line)
    return "\n".join(lines[start_idx:end_idx])


def collect_context_for_node(node: Dict[str, Any], ancestors: List[Dict[str, Any]], full_lines: List[str]) -> str:
    # Minimal pragmatic context: nearest DECLARE section of ancestors + SPEC (function header)
    context_parts: List[str] = []
    for anc in reversed(ancestors):
        if anc.get("type") in ("SPEC", "DECLARE_SECTION"):
            context_parts.append(slice_source(full_lines, anc.get("startLine"), anc.get("endLine")))
    return "\n\n".join([p for p in context_parts if p])


DEFAULT_MAPPING_GUIDE = {
    "types": [
        ("text", "VARCHAR2(4000)"),
        ("bytea", "BLOB"),
        ("jsonb", "CLOB"),
        ("json", "CLOB"),
        ("timestamptz", "TIMESTAMP WITH TIME ZONE"),
        ("timestamp", "TIMESTAMP"),
        ("boolean", "NUMBER(1)")
    ],
    "functions": [
        ("now()", "SYSTIMESTAMP"),
        ("current_timestamp", "SYSTIMESTAMP"),
        ("coalesce", "COALESCE"),
        ("nullif", "NULLIF"),
        ("greatest", "GREATEST"),
        ("least", "LEAST"),
        ("left(", "SUBSTR( "),
        ("right(", "SUBSTR( "),
        ("substr(", "SUBSTR("),
        ("position(", "INSTR(")
    ],
    "system": [
        ("SQLERRM", "SQLERRM"),
        ("SQLSTATE", "SQLCODE"),
        ("FOUND", "SQL%FOUND")
    ],
}


PROMPT_TEMPLATE = """
You are an expert in translating PostgreSQL PL/pgSQL code to Oracle PL/SQL.
Convert the given code chunk to Oracle PL/SQL with equivalent behavior.

Constraints:
- Keep the same structure and side effects.
- Replace PostgreSQL-specific types/functions/system variables to Oracle equivalents.
- If GLOBAL TEMPORARY TABLE is needed, use ON COMMIT semantics.
- Keep comments. Close all blocks and end statements with semicolons.
- Output a single complete Oracle PL/SQL object when input is a function/procedure
  (CREATE OR REPLACE FUNCTION/PROCEDURE ... END; /), preserving signature and logic.
- Do NOT wrap the output in markdown fences. Output PL/SQL only.
- Prefer Oracle built-ins over custom helpers (use SUBSTR/INSTR/REGEXP_SUBSTR/REPLACE/||, etc.).
- Avoid introducing helper functions unless absolutely necessary.
- If PostgreSQL returns a set (RETURNS TABLE ...), prefer returning SYS_REFCURSOR in Oracle
  (OPEN c FOR SELECT ...; RETURN c;). Use pipelined functions only if explicitly advantageous.
- Replace PostgreSQL catalog references (pg_catalog.*, TO_REGPROC, etc.) with Oracle data dictionary
  views where meaningful (ALL_OBJECTS/ALL_PROCEDURES/ALL_ARGUMENTS). If not mappable, omit those parts
  and add a short comment indicating the omission.
 - JSON: Never parse JSON with regex. Use JSON_VALUE/JSON_QUERY/JSON_EXISTS/JSON_OBJECT/JSON_ARRAYAGG.
 - TEMP TABLE/GTT: Do not CREATE/DROP dynamically. Assume a pre-created GLOBAL TEMPORARY TABLE and only INSERT/TRUNCATE.
 - Inventory logic: Preserve aggregations over temp tables (e.g., SELECT product_id, SUM(qty) FROM tmp_lines GROUP BY product_id) and use them for UPDATE/MERGE.
 - Arrays/tags: Use JSON_ARRAYAGG (or LISTAGG only if explicitly appropriate) to build JSON arrays.
 - Paging: Use OFFSET ... FETCH (12c+) or ROWNUM/analytic functions to emulate LIMIT/OFFSET semantics.
 - Recursive CTE: Use ANSI recursive WITH (12c+) or CONNECT BY as appropriate to preserve meaning.
 - Logging JSON: Use JSON_OBJECT/JSON_MERGEPATCH instead of string concatenation.
 - Exceptions: Preserve ZERO_DIVIDE and other exception paths when present in the original logic.

MANDATORY conversion policies for this project:
- TEMP TABLE naming: In Oracle always use a single, pre-created GTT name (e.g., TMP_LINES, TMP_LOGS). Do NOT generate per-order table names. Re-initialize with TRUNCATE/DELETE only.
- Products array to JSON: When original stores product_id array as jsonb, in Oracle store as a JSON array using JSON_ARRAYAGG over rows, or JSON_OBJECT/JSON_ARRAY with SELECT if needed. Do NOT store only the first element. Do NOT use string concatenation.
- Paging loop: Preserve LIMIT/OFFSET semantics using OFFSET n ROWS FETCH NEXT m ROWS ONLY (12c+). Do not use SELECT 1 FROM dual as a placeholder.
- ZERO_DIVIDE: If original path can divide by zero, keep the actual division so ZERO_DIVIDE can occur and be handled. Do not remove the operation.
- Tags field format: Ensure the stored JSON has the same keys/array structure as the original (e.g., to_jsonb(array of product_ids) -> JSON array in Oracle). No plain strings.
- Recursive CTE and window functions: Keep the same ranking/percentile semantics (e.g., PERCENT_RANK()) and ensure results match original logic.
- Logging JSON and exception extra: Use JSON_OBJECT('level' VALUE level, ...) and when rethrowing, store SQLERRM and SQLCODE in a JSON field equivalent to SQLSTATE/SQLERRM semantics.
- Performance: Avoid row-by-row INSERT loops when a set-based INSERT SELECT is viable. Use collections/nested tables if a bridge from PL/SQL collection to SQL is required.

Mapping guide (high-level):
- Types: {type_map}
- Functions: {func_map}
- System: {sys_map}

Context (declarations/spec):
---CONTEXT START---
{context}
---CONTEXT END---

Source chunk:
---SOURCE START---
{source}
---SOURCE END---

Output only the converted Oracle PL/SQL code with no extra explanations.
""".strip()


def build_prompt(context: str, source: str, mapping: Dict[str, List[Tuple[str, str]]]) -> str:
    type_map = ", ".join([f"{a}->{b}" for a, b in mapping.get("types", [])])
    func_map = ", ".join([f"{a}->{b}" for a, b in mapping.get("functions", [])])
    sys_map = ", ".join([f"{a}->{b}" for a, b in mapping.get("system", [])])
    return PROMPT_TEMPLATE.format(context=context, source=source, type_map=type_map, func_map=func_map, sys_map=sys_map)


def openai_convert(prompt: str, model: str = "gpt-4.1-2025-04-14", api_key: Optional[str] = None) -> str:
    if OpenAI is None:
        raise RuntimeError("OpenAI SDK not available. Install 'openai' and set OPENAI_API_KEY.")
    key = (api_key or DEFAULT_API_KEY).strip()
    if not key:
        raise RuntimeError("OPENAI_API_KEY not set. Provide --api-key or set env.")
    client = OpenAI(api_key=key)
    resp = client.chat.completions.create(
        model=model,
        temperature=0,
        messages=[
            {"role": "system", "content": "You convert PostgreSQL PL/pgSQL to Oracle PL/SQL faithfully."},
            {"role": "user", "content": prompt},
        ],
    )
    return resp.choices[0].message.content or ""


def sanitize_output(s: str) -> str:
    t = s.strip()
    # Remove common markdown fences if present
    if t.startswith("```"):
        # strip starting fence line
        first_nl = t.find("\n")
        if first_nl != -1:
            t = t[first_nl+1:]
    if t.endswith("```"):
        t = t[:-3]
    return t.strip()


def traverse_with_ancestors(root: Dict[str, Any]) -> List[Tuple[Dict[str, Any], List[Dict[str, Any]]]]:
    out: List[Tuple[Dict[str, Any], List[Dict[str, Any]]]] = []

    def _rec(n: Dict[str, Any], anc: List[Dict[str, Any]]):
        out.append((n, list(anc)))
        for c in n.get("children", []):
            anc.append(n)
            _rec(c, anc)
            anc.pop()

    _rec(root, [])
    return out


def is_convert_target(node_type: str) -> bool:
    return node_type in {"CREATE_FUNCTION", "DO"}


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--source", required=True, help="Path to .sql source file")
    parser.add_argument("--structure", required=True, help="Path to structure.json produced by Java parser")
    args = parser.parse_args()
    lines = read_file_lines(args.source)
    root = load_structure(args.structure)

    mapping = DEFAULT_MAPPING_GUIDE
    pairs = traverse_with_ancestors(root)
    # Pick first top-level CREATE_FUNCTION/DO
    target: Optional[Tuple[int, Dict[str, Any], List[Dict[str, Any]]]] = None
    for i, (node, ancestors) in enumerate(pairs):
        if is_convert_target(node.get("type")):
            target = (i, node, ancestors)
            break
    if target is None:
        print("No top-level CREATE_FUNCTION/DO found in structure.json", file=sys.stderr)
        sys.exit(1)

    i, node, ancestors = target
    ntype = node.get("type")

    start_line = node.get("startLine")
    end_line = node.get("endLine")

    full_text = slice_source(lines, start_line, end_line)
    MAX_CHARS = 12000
    MAX_LINES = 400

    def prompt_for(mode: str, context: str, source: str) -> str:
        if mode == "header":
            guide = "Output ONLY the Oracle header/signature + DECLARE section (if any) + a single BEGIN line. Do not include any body statements or END."
        elif mode == "body":
            guide = "Output ONLY the translated PL/SQL statements for this region. Do not include CREATE/DECLARE/BEGIN/END."
        elif mode == "exception":
            guide = "Output ONLY the EXCEPTION handlers. Do not include the final END of the procedure/function."
        else:
            guide = "Output the translated PL/SQL for this region only."
        base = build_prompt(context, source, mapping)
        return base + "\n\nConstraints (fragment mode):\n- " + guide

    def extract_function_name(spec_text: str) -> str:
        import re
        m = re.search(r"FUNCTION\s+([a-zA-Z0-9_\.\"]+)", spec_text, flags=re.IGNORECASE)
        return m.group(1) if m else ""

    children = node.get("children", [])
    spec = next((c for c in children if c.get("type") == "SPEC"), None)
    decl = next((c for c in children if c.get("type") == "DECLARE_SECTION"), None)
    excp = next((c for c in children if c.get("type") == "EXCEPTION_SECTION"), None)

    out_parts: List[str] = []

    meta = {"mode": "", "function": node.get("type"), "start": start_line, "end": end_line, "chunks": []}

    if full_text and (len(full_text) <= MAX_CHARS and (end_line - start_line + 1) <= MAX_LINES):
        meta["mode"] = "single"
        context = collect_context_for_node(node, ancestors, lines)
        prompt = build_prompt(context, full_text, mapping)
        try:
            converted = openai_convert(prompt)
        except Exception as e:
            converted = f"-- LLM conversion failed: {e}\n-- Fallback: keep original source below\n{full_text}"
        out_parts.append(sanitize_output(converted if converted else full_text))
    else:
        meta["mode"] = "chunked"
        # Header
        header_start = spec.get("startLine") if spec else start_line
        header_end = (decl.get("endLine") if decl else (spec.get("endLine") if spec else start_line))
        header_text = slice_source(lines, header_start, header_end)
        try:
            head_conv = openai_convert(prompt_for("header", "", header_text))
        except Exception as e:
            head_conv = f"-- LLM conversion failed: {e}\n{header_text}"
        out_parts.append(sanitize_output(head_conv))
        meta["chunks"].append({"type": "header", "start": header_start, "end": header_end, "chars": len(header_text)})

        # Body chunks
        body_nodes: List[Tuple[int,int]] = []
        for c in children:
            ctype = c.get("type")
            if ctype in ("SPEC", "DECLARE_SECTION", "EXCEPTION_SECTION"):
                continue
            s = c.get("startLine"); e = c.get("endLine")
            if s and e and e >= s:
                body_nodes.append((s,e))
        body_nodes.sort()

        # Merge by thresholds
        merged: List[Tuple[int,int]] = []
        cur_s = None; cur_e = None
        for s,e in body_nodes:
            if cur_s is None:
                cur_s, cur_e = s,e
                continue
            candidate_text = slice_source(lines, cur_s, e)
            if (e - cur_s + 1) <= MAX_LINES and len(candidate_text) <= MAX_CHARS:
                cur_e = e
            else:
                merged.append((cur_s, cur_e))
                cur_s, cur_e = s,e
        if cur_s is not None:
            merged.append((cur_s, cur_e))

        base_context = ""
        if spec:
            base_context += slice_source(lines, spec.get("startLine"), spec.get("endLine")) + "\n"
        if decl:
            base_context += slice_source(lines, decl.get("startLine"), decl.get("endLine"))

        for (bs, be) in merged:
            frag = slice_source(lines, bs, be)
            try:
                body_conv = openai_convert(prompt_for("body", base_context, frag))
            except Exception as e:
                body_conv = f"-- LLM conversion failed: {e}\n{frag}"
            out_parts.append(sanitize_output(body_conv))
            meta["chunks"].append({"type": "body", "start": bs, "end": be, "chars": len(frag)})

        # Exception
        if excp:
            exc_text = slice_source(lines, excp.get("startLine"), excp.get("endLine"))
            try:
                exc_conv = openai_convert(prompt_for("exception", base_context, exc_text))
            except Exception as e:
                exc_conv = f"-- LLM conversion failed: {e}\n{exc_text}"
            out_parts.append(sanitize_output(exc_conv))
            meta["chunks"].append({"type": "exception", "start": excp.get("startLine"), "end": excp.get("endLine"), "chars": len(exc_text)})

        # Footer
        spec_text = slice_source(lines, spec.get("startLine"), spec.get("endLine")) if spec else ""
        fname = extract_function_name(spec_text)
        out_parts.append(f"END {fname};\n/" if fname else "END;\n/")

    out_sql_path = os.path.join(os.getcwd(), "oracle_output.sql")
    with open(out_sql_path, "w", encoding="utf-8") as f:
        f.write("\n\n".join([p for p in out_parts if p.strip()]))

    # Debug logs to console (no files)
    if meta["mode"] == "single":
        print(f"[convert] model=gpt-5.1-mini mode=single range={meta['start']}-{meta['end']}")
    else:
        print(f"[convert] model=gpt-5.1-mini mode=chunked range={meta['start']}-{meta['end']} chunks={len(meta['chunks'])}")
        for i, ch in enumerate(meta["chunks"], 1):
            print(f"  [chunk {i}] type={ch['type']} range={ch['start']}-{ch['end']} chars={ch['chars']}")
    print("Wrote single converted object to oracle_output.sql")


if __name__ == "__main__":
    main()


