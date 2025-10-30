import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CustomPostgreSQLListener extends PostgreSQLParserBaseListener {
    private TokenStream tokens;
    private Stack<Node> nodeStack = new Stack<>();
    private Node root = new Node("ROOT", 0, null);
    private boolean insideInsert = false;  // INSERT 내부 추적
    private boolean insideExplain = false; // EXPLAIN 내부 추적
    private boolean plpgsqlLogErrors = false; // PL/pgSQL 파싱 에러 로그 출력 여부

    public Node getRoot() {
        return root;
    }

    public CustomPostgreSQLListener(TokenStream tokens) {
        this.tokens = tokens;
        nodeStack.push(root);
    }

    private void enterStatement(String statementType, int line) {
        Node currentNode = new Node(statementType, line, nodeStack.peek());
        nodeStack.push(currentNode);
        // System.out.println("Enter " + statementType + " Statement Line: " + line);
    }

    private void exitStatement(String statementType, int line) {
        Node node = nodeStack.pop();
        node.endLine = line;
        // System.out.println("Exit " + statementType + " Statement Line: " + line);
    }

    // ========== DDL (Data Definition Language) ==========

    // CREATE FUNCTION
    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        enterStatement("CREATE_FUNCTION", ctx.getStart().getLine());
        
        // $$ 토큰의 실제 라인 번호 찾기
        int dollarLineNumber = findDollarStringLine(ctx);
        
        // SPEC 노드 생성 (함수 선언부: CREATE FUNCTION ... AS $$)
        int specStartLine = ctx.getStart().getLine();
        int specEndLine = dollarLineNumber > 0 ? dollarLineNumber - 1 : ctx.getStop().getLine();
        Node specNode = new Node("SPEC", specStartLine, nodeStack.peek());
        specNode.endLine = specEndLine;
        
        // $$ ... $$ 내용 추출 및 PL/pgSQL 파싱 ($$가 있는 경우만)
        if (dollarLineNumber > 0) {
        String plpgsqlCode = extractDollarQuotedString(ctx);
        if (plpgsqlCode != null && !plpgsqlCode.trim().isEmpty()) {
            
            // PL/pgSQL 파싱 및 노드 트리 구축
            parsePlpgsqlBlock(plpgsqlCode, dollarLineNumber);
            }
        }
    }

    /**
     * BeginDollarStringConstant 토큰이 있는 라인 번호 찾기
     * @return $$ 토큰 다음 라인 번호, 없으면 -1
     */
    private int findDollarStringLine(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        int startIndex = ctx.getStart().getTokenIndex();
        int stopIndex = ctx.getStop().getTokenIndex();
        
        for (int i = startIndex; i <= stopIndex; i++) {
            Token token = tokens.get(i);
            if (token.getText().startsWith("$") && token.getText().endsWith("$")) {
                // $$ 토큰 발견, 다음 라인이 PL/pgSQL 코드 시작
                return token.getLine() + 1;
            }
        }
        
        return -1;  // $$ 토큰 없음
    }

    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        exitStatement("CREATE_FUNCTION", ctx.getStop().getLine());
    }

    // DO (익명 코드 블록)
    @Override
    public void enterDostmt(PostgreSQLParser.DostmtContext ctx) {
        enterStatement("DO", ctx.getStart().getLine());
        
        // DO 문도 $$ ... $$ 블록을 가질 수 있음
        int dollarLineNumber = findDollarStringLineForDo(ctx);
        
        // DO 문은 SPEC이 없음 (함수 선언이 아니므로)
        
        // $$ ... $$ 내용 추출 및 PL/pgSQL 파싱 ($$가 있는 경우만)
        if (dollarLineNumber > 0) {
            String plpgsqlCode = extractDollarQuotedStringForDo(ctx);
            if (plpgsqlCode != null && !plpgsqlCode.trim().isEmpty()) {
                System.out.println("\n=== Found PL/pgSQL Block in DO ===");
                System.out.println(plpgsqlCode);
                System.out.println("=========================\n");
                
                // PL/pgSQL 파싱 및 노드 트리 구축
                parsePlpgsqlBlock(plpgsqlCode, dollarLineNumber);
            }
        }
    }

    @Override
    public void exitDostmt(PostgreSQLParser.DostmtContext ctx) {
        exitStatement("DO", ctx.getStop().getLine());
    }

    /**
     * DO 문에서 $$ 토큰 찾기
     */
    private int findDollarStringLineForDo(PostgreSQLParser.DostmtContext ctx) {
        int startIndex = ctx.getStart().getTokenIndex();
        int stopIndex = ctx.getStop().getTokenIndex();
        
        for (int i = startIndex; i <= stopIndex; i++) {
            Token token = tokens.get(i);
            if (token.getText().startsWith("$") && token.getText().endsWith("$")) {
                return token.getLine() + 1;
            }
        }
        
        return -1;
    }

    /**
     * DO 문에서 $$ ... $$ 내용 추출
     */
    private String extractDollarQuotedStringForDo(PostgreSQLParser.DostmtContext ctx) {
        // dostmt_opt_item에서 sconst 찾기
        if (ctx.dostmt_opt_list() != null) {
            for (PostgreSQLParser.Dostmt_opt_itemContext optItem : ctx.dostmt_opt_list().dostmt_opt_item()) {
                if (optItem.sconst() != null) {
                    return extractFromSconst(optItem.sconst());
                }
            }
        }
        return null;
    }

    /**
     * Context에서 $$ ... $$ 사이의 내용 추출
     */
    private String extractDollarQuotedString(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        // createfunc_opt_list에서 AS func_as 찾기
        PostgreSQLParser.Createfunc_opt_listContext optList = ctx.createfunc_opt_list();
        if (optList == null) return null;
        
        for (PostgreSQLParser.Createfunc_opt_itemContext optItem : optList.createfunc_opt_item()) {
            if (optItem.AS() != null && optItem.func_as() != null) {
                // func_as -> sconst -> anysconst 탐색
                PostgreSQLParser.Func_asContext funcAs = optItem.func_as();
                if (funcAs.def != null) {
                    // def는 sconst
                    return extractFromSconst(funcAs.def);
                }
            }
        }
        
        return null;
    }

    /**
     * sconst Context에서 DollarText 추출
     */
    private String extractFromSconst(PostgreSQLParser.SconstContext sconstCtx) {
        if (sconstCtx == null || sconstCtx.anysconst() == null) return null;
        
        PostgreSQLParser.AnysconstContext anysconst = sconstCtx.anysconst();
        
        // BeginDollarStringConstant가 있는지 확인
        if (anysconst.BeginDollarStringConstant() == null) return null;
        
        // DollarText들을 모두 합치기
        StringBuilder content = new StringBuilder();
        for (TerminalNode dollarText : anysconst.DollarText()) {
            content.append(dollarText.getText());
        }
        
        return content.toString().trim();
    }

    /**
     * PL/pgSQL 코드를 파싱하고 Node 트리에 추가
     */
    private void parsePlpgsqlBlock(String plpgsqlCode, int baseLineNumber) {
        try {
            // PL/pgSQL Lexer & Parser 생성
            CharStream input = CharStreams.fromString(plpgsqlCode);
            PlpgsqlLexer lexer = new PlpgsqlLexer(input);
            CommonTokenStream plTokens = new CommonTokenStream(lexer);
            PlpgsqlParser parser = new PlpgsqlParser(plTokens);
            
            // 에러 리스너 추가
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                      int line, int charPositionInLine, String msg,
                                      RecognitionException e) {
                    if (plpgsqlLogErrors) {
                        System.err.println("PL/pgSQL Parse Error at line " + (baseLineNumber + line - 1)
                                         + ":" + charPositionInLine + " - " + msg);
                    }
                }
            });
            
            // 파싱 시작
            ParseTree tree = parser.plpgsqlBlock();
            
            // PL/pgSQL AST를 Node 트리로 변환
            CustomPlpgsqlVisitor visitor = new CustomPlpgsqlVisitor(
                nodeStack.peek(),  // 현재 CREATE_FUNCTION 노드를 부모로
                baseLineNumber,
                plTokens
            );
            visitor.visit(tree);
            
        } catch (Exception e) {
            System.err.println("Error parsing PL/pgSQL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // SET
    @Override
    public void enterVariablesetstmt(PostgreSQLParser.VariablesetstmtContext ctx) {
        enterStatement("SET", ctx.getStart().getLine());
    }

    @Override
    public void exitVariablesetstmt(PostgreSQLParser.VariablesetstmtContext ctx) {
        exitStatement("SET", ctx.getStop().getLine());
    }

    // RESET
    @Override
    public void enterVariableresetstmt(PostgreSQLParser.VariableresetstmtContext ctx) {
        enterStatement("RESET", ctx.getStart().getLine());
    }

    @Override
    public void exitVariableresetstmt(PostgreSQLParser.VariableresetstmtContext ctx) {
        exitStatement("RESET", ctx.getStop().getLine());
    }

    // DROP
    @Override
    public void enterDropstmt(PostgreSQLParser.DropstmtContext ctx) {
        enterStatement("DROP", ctx.getStart().getLine());
    }

    @Override
    public void exitDropstmt(PostgreSQLParser.DropstmtContext ctx) {
        exitStatement("DROP", ctx.getStop().getLine());
    }

    // DROP ROLE
    @Override
    public void enterDroprolestmt(PostgreSQLParser.DroprolestmtContext ctx) {
        enterStatement("DROP_ROLE", ctx.getStart().getLine());
    }

    @Override
    public void exitDroprolestmt(PostgreSQLParser.DroprolestmtContext ctx) {
        exitStatement("DROP_ROLE", ctx.getStop().getLine());
    }

    // CREATE TABLE
    @Override
    public void enterCreatestmt(PostgreSQLParser.CreatestmtContext ctx) {
        enterStatement("CREATE_TABLE", ctx.getStart().getLine());
    }

    @Override
    public void exitCreatestmt(PostgreSQLParser.CreatestmtContext ctx) {
        exitStatement("CREATE_TABLE", ctx.getStop().getLine());
    }

    // ALTER TABLE
    @Override
    public void enterAltertablestmt(PostgreSQLParser.AltertablestmtContext ctx) {
        enterStatement("ALTER_TABLE", ctx.getStart().getLine());
    }

    @Override
    public void exitAltertablestmt(PostgreSQLParser.AltertablestmtContext ctx) {
        exitStatement("ALTER_TABLE", ctx.getStop().getLine());
    }

    // ALTER ROLE
    @Override
    public void enterAlterrolestmt(PostgreSQLParser.AlterrolestmtContext ctx) {
        enterStatement("ALTER_ROLE", ctx.getStart().getLine());
    }

    @Override
    public void exitAlterrolestmt(PostgreSQLParser.AlterrolestmtContext ctx) {
        exitStatement("ALTER_ROLE", ctx.getStop().getLine());
    }

    // ALTER DATABASE
    @Override
    public void enterAlterdatabasestmt(PostgreSQLParser.AlterdatabasestmtContext ctx) {
        enterStatement("ALTER_DATABASE", ctx.getStart().getLine());
    }

    @Override
    public void exitAlterdatabasestmt(PostgreSQLParser.AlterdatabasestmtContext ctx) {
        exitStatement("ALTER_DATABASE", ctx.getStop().getLine());
    }

    // ALTER FUNCTION
    @Override
    public void enterAlterfunctionstmt(PostgreSQLParser.AlterfunctionstmtContext ctx) {
        enterStatement("ALTER_FUNCTION", ctx.getStart().getLine());
    }

    @Override
    public void exitAlterfunctionstmt(PostgreSQLParser.AlterfunctionstmtContext ctx) {
        exitStatement("ALTER_FUNCTION", ctx.getStop().getLine());
    }

    // CREATE INDEX
    @Override
    public void enterIndexstmt(PostgreSQLParser.IndexstmtContext ctx) {
        enterStatement("CREATE_INDEX", ctx.getStart().getLine());
    }

    @Override
    public void exitIndexstmt(PostgreSQLParser.IndexstmtContext ctx) {
        exitStatement("CREATE_INDEX", ctx.getStop().getLine());
    }

    // CREATE OPERATOR FAMILY
    @Override
    public void enterCreateopfamilystmt(PostgreSQLParser.CreateopfamilystmtContext ctx) {
        enterStatement("CREATE_OPERATOR_FAMILY", ctx.getStart().getLine());
    }

    @Override
    public void exitCreateopfamilystmt(PostgreSQLParser.CreateopfamilystmtContext ctx) {
        exitStatement("CREATE_OPERATOR_FAMILY", ctx.getStop().getLine());
    }

    // ALTER OPERATOR FAMILY
    @Override
    public void enterAlteropfamilystmt(PostgreSQLParser.AlteropfamilystmtContext ctx) {
        enterStatement("ALTER_OPERATOR_FAMILY", ctx.getStart().getLine());
    }

    @Override
    public void exitAlteropfamilystmt(PostgreSQLParser.AlteropfamilystmtContext ctx) {
        exitStatement("ALTER_OPERATOR_FAMILY", ctx.getStop().getLine());
    }

    // DROP OPERATOR FAMILY
    @Override
    public void enterDropopfamilystmt(PostgreSQLParser.DropopfamilystmtContext ctx) {
        enterStatement("DROP_OPERATOR_FAMILY", ctx.getStart().getLine());
    }

    @Override
    public void exitDropopfamilystmt(PostgreSQLParser.DropopfamilystmtContext ctx) {
        exitStatement("DROP_OPERATOR_FAMILY", ctx.getStop().getLine());
    }

    // CREATE OPERATOR CLASS
    @Override
    public void enterCreateopclassstmt(PostgreSQLParser.CreateopclassstmtContext ctx) {
        enterStatement("CREATE_OPERATOR_CLASS", ctx.getStart().getLine());
    }

    @Override
    public void exitCreateopclassstmt(PostgreSQLParser.CreateopclassstmtContext ctx) {
        exitStatement("CREATE_OPERATOR_CLASS", ctx.getStop().getLine());
    }

    // DROP OPERATOR CLASS
    @Override
    public void enterDropopclassstmt(PostgreSQLParser.DropopclassstmtContext ctx) {
        enterStatement("DROP_OPERATOR_CLASS", ctx.getStart().getLine());
    }

    @Override
    public void exitDropopclassstmt(PostgreSQLParser.DropopclassstmtContext ctx) {
        exitStatement("DROP_OPERATOR_CLASS", ctx.getStop().getLine());
    }

    // CREATE SCHEMA
    @Override
    public void enterCreateschemastmt(PostgreSQLParser.CreateschemastmtContext ctx) {
        enterStatement("CREATE_SCHEMA", ctx.getStart().getLine());
    }

    @Override
    public void exitCreateschemastmt(PostgreSQLParser.CreateschemastmtContext ctx) {
        exitStatement("CREATE_SCHEMA", ctx.getStop().getLine());
    }

    // CREATE SEQUENCE
    @Override
    public void enterCreateseqstmt(PostgreSQLParser.CreateseqstmtContext ctx) {
        enterStatement("CREATE_SEQUENCE", ctx.getStart().getLine());
    }

    @Override
    public void exitCreateseqstmt(PostgreSQLParser.CreateseqstmtContext ctx) {
        exitStatement("CREATE_SEQUENCE", ctx.getStop().getLine());
    }

    // CREATE TRIGGER
    @Override
    public void enterCreatetrigstmt(PostgreSQLParser.CreatetrigstmtContext ctx) {
        enterStatement("CREATE_TRIGGER", ctx.getStart().getLine());
    }

    @Override
    public void exitCreatetrigstmt(PostgreSQLParser.CreatetrigstmtContext ctx) {
        exitStatement("CREATE_TRIGGER", ctx.getStop().getLine());
    }

    // CREATE RULE
    @Override
    public void enterRulestmt(PostgreSQLParser.RulestmtContext ctx) {
        enterStatement("CREATE_RULE", ctx.getStart().getLine());
    }

    @Override
    public void exitRulestmt(PostgreSQLParser.RulestmtContext ctx) {
        exitStatement("CREATE_RULE", ctx.getStop().getLine());
    }

    // CREATE DATABASE
    @Override
    public void enterCreatedbstmt(PostgreSQLParser.CreatedbstmtContext ctx) {
        enterStatement("CREATE_DATABASE", ctx.getStart().getLine());
    }

    @Override
    public void exitCreatedbstmt(PostgreSQLParser.CreatedbstmtContext ctx) {
        exitStatement("CREATE_DATABASE", ctx.getStop().getLine());
    }

    // CREATE USER
    @Override
    public void enterCreateuserstmt(PostgreSQLParser.CreateuserstmtContext ctx) {
        enterStatement("CREATE_USER", ctx.getStart().getLine());
    }

    @Override
    public void exitCreateuserstmt(PostgreSQLParser.CreateuserstmtContext ctx) {
        exitStatement("CREATE_USER", ctx.getStop().getLine());
    }

    // CREATE ROLE
    @Override
    public void enterCreaterolestmt(PostgreSQLParser.CreaterolestmtContext ctx) {
        enterStatement("CREATE_ROLE", ctx.getStart().getLine());
    }

    @Override
    public void exitCreaterolestmt(PostgreSQLParser.CreaterolestmtContext ctx) {
        exitStatement("CREATE_ROLE", ctx.getStop().getLine());
    }

    // CREATE GROUP
    @Override
    public void enterCreategroupstmt(PostgreSQLParser.CreategroupstmtContext ctx) {
        enterStatement("CREATE_GROUP", ctx.getStart().getLine());
    }

    @Override
    public void exitCreategroupstmt(PostgreSQLParser.CreategroupstmtContext ctx) {
        exitStatement("CREATE_GROUP", ctx.getStop().getLine());
    }

    // CREATE VIEW
    @Override
    public void enterViewstmt(PostgreSQLParser.ViewstmtContext ctx) {
        enterStatement("CREATE_VIEW", ctx.getStart().getLine());
    }

    @Override
    public void exitViewstmt(PostgreSQLParser.ViewstmtContext ctx) {
        exitStatement("CREATE_VIEW", ctx.getStop().getLine());
    }

    // TRUNCATE
    @Override
    public void enterTruncatestmt(PostgreSQLParser.TruncatestmtContext ctx) {
        enterStatement("TRUNCATE", ctx.getStart().getLine());
    }

    @Override
    public void exitTruncatestmt(PostgreSQLParser.TruncatestmtContext ctx) {
        exitStatement("TRUNCATE", ctx.getStop().getLine());
    }

    // COPY
    @Override
    public void enterCopystmt(PostgreSQLParser.CopystmtContext ctx) {
        enterStatement("COPY", ctx.getStart().getLine());
    }

    @Override
    public void exitCopystmt(PostgreSQLParser.CopystmtContext ctx) {
        exitStatement("COPY", ctx.getStop().getLine());
    }

    // DEFINE (CREATE AGGREGATE, CREATE TYPE, CREATE OPERATOR 등)
    @Override
    public void enterDefinestmt(PostgreSQLParser.DefinestmtContext ctx) {
        String defineType = "DEFINE";
        String secondToken = ctx.getChild(1).getText().toUpperCase();
        
        if (secondToken.equals("AGGREGATE")) {
            defineType = "CREATE_AGGREGATE";
        } else if (secondToken.equals("OPERATOR")) {
            defineType = "CREATE_OPERATOR";
        } else if (secondToken.equals("TYPE")) {
            defineType = "CREATE_TYPE";
        }
        
        enterStatement(defineType, ctx.getStart().getLine());
    }

    @Override
    public void exitDefinestmt(PostgreSQLParser.DefinestmtContext ctx) {
        String defineType = "DEFINE";
        String secondToken = ctx.getChild(1).getText().toUpperCase();
        
        if (secondToken.equals("AGGREGATE")) {
            defineType = "CREATE_AGGREGATE";
        } else if (secondToken.equals("OPERATOR")) {
            defineType = "CREATE_OPERATOR";
        } else if (secondToken.equals("TYPE")) {
            defineType = "CREATE_TYPE";
        }
        
        exitStatement(defineType, ctx.getStop().getLine());
    }

    // RENAME (ALTER ... RENAME TO)
    @Override
    public void enterRenamestmt(PostgreSQLParser.RenamestmtContext ctx) {
        enterStatement("RENAME", ctx.getStart().getLine());
    }

    @Override
    public void exitRenamestmt(PostgreSQLParser.RenamestmtContext ctx) {
        exitStatement("RENAME", ctx.getStop().getLine());
    }

    // ALTER OWNER (ALTER ... OWNER TO)
    @Override
    public void enterAlterownerstmt(PostgreSQLParser.AlterownerstmtContext ctx) {
        enterStatement("ALTER_OWNER", ctx.getStart().getLine());
    }

    @Override
    public void exitAlterownerstmt(PostgreSQLParser.AlterownerstmtContext ctx) {
        exitStatement("ALTER_OWNER", ctx.getStop().getLine());
    }

    // ALTER SCHEMA (ALTER ... SET SCHEMA)
    @Override
    public void enterAlterobjectschemastmt(PostgreSQLParser.AlterobjectschemastmtContext ctx) {
        enterStatement("ALTER_SCHEMA", ctx.getStart().getLine());
    }

    @Override
    public void exitAlterobjectschemastmt(PostgreSQLParser.AlterobjectschemastmtContext ctx) {
        exitStatement("ALTER_SCHEMA", ctx.getStop().getLine());
    }

    // ========== DML (Data Manipulation Language) ==========

    // SELECT
    @Override
    public void enterSelectstmt(PostgreSQLParser.SelectstmtContext ctx) {
        // INSERT 내부의 VALUES를 위한 SELECT는 무시
        // EXPLAIN 내부의 SELECT는 무시 (EXPLAIN의 대상일 뿐)
        if (insideInsert || insideExplain) {
            return;
        }
        enterStatement("SELECT", ctx.getStart().getLine());
    }

    @Override
    public void exitSelectstmt(PostgreSQLParser.SelectstmtContext ctx) {
        // INSERT 내부의 VALUES를 위한 SELECT는 무시
        // EXPLAIN 내부의 SELECT는 무시
        if (insideInsert || insideExplain) {
            return;
        }
        exitStatement("SELECT", ctx.getStop().getLine());
    }

    // INSERT
    @Override
    public void enterInsertstmt(PostgreSQLParser.InsertstmtContext ctx) {
        insideInsert = true;  // INSERT 시작
        enterStatement("INSERT", ctx.getStart().getLine());
    }

    @Override
    public void exitInsertstmt(PostgreSQLParser.InsertstmtContext ctx) {
        exitStatement("INSERT", ctx.getStop().getLine());
        insideInsert = false;  // INSERT 종료
    }

    // UPDATE
    @Override
    public void enterUpdatestmt(PostgreSQLParser.UpdatestmtContext ctx) {
        enterStatement("UPDATE", ctx.getStart().getLine());
    }

    @Override
    public void exitUpdatestmt(PostgreSQLParser.UpdatestmtContext ctx) {
        exitStatement("UPDATE", ctx.getStop().getLine());
    }

    // DELETE
    @Override
    public void enterDeletestmt(PostgreSQLParser.DeletestmtContext ctx) {
        enterStatement("DELETE", ctx.getStart().getLine());
    }

    @Override
    public void exitDeletestmt(PostgreSQLParser.DeletestmtContext ctx) {
        exitStatement("DELETE", ctx.getStop().getLine());
    }

    // MERGE
    @Override
    public void enterMergestmt(PostgreSQLParser.MergestmtContext ctx) {
        enterStatement("MERGE", ctx.getStart().getLine());
    }

    @Override
    public void exitMergestmt(PostgreSQLParser.MergestmtContext ctx) {
        exitStatement("MERGE", ctx.getStop().getLine());
    }

    // MERGE - INSERT clause (WHEN NOT MATCHED THEN INSERT)
    @Override
    public void enterMerge_insert_clause(PostgreSQLParser.Merge_insert_clauseContext ctx) {
        enterStatement("MERGE_INSERT", ctx.getStart().getLine());
    }

    @Override
    public void exitMerge_insert_clause(PostgreSQLParser.Merge_insert_clauseContext ctx) {
        exitStatement("MERGE_INSERT", ctx.getStop().getLine());
    }

    // MERGE - UPDATE clause (WHEN MATCHED THEN UPDATE)
    @Override
    public void enterMerge_update_clause(PostgreSQLParser.Merge_update_clauseContext ctx) {
        enterStatement("MERGE_UPDATE", ctx.getStart().getLine());
    }

    @Override
    public void exitMerge_update_clause(PostgreSQLParser.Merge_update_clauseContext ctx) {
        exitStatement("MERGE_UPDATE", ctx.getStop().getLine());
    }

    // MERGE - DELETE clause (WHEN MATCHED THEN DELETE)
    @Override
    public void enterMerge_delete_clause(PostgreSQLParser.Merge_delete_clauseContext ctx) {
        enterStatement("MERGE_DELETE", ctx.getStart().getLine());
    }

    @Override
    public void exitMerge_delete_clause(PostgreSQLParser.Merge_delete_clauseContext ctx) {
        exitStatement("MERGE_DELETE", ctx.getStop().getLine());
    }

    // ========== DCL (Data Control Language) ==========

    // GRANT
    @Override
    public void enterGrantstmt(PostgreSQLParser.GrantstmtContext ctx) {
        enterStatement("GRANT", ctx.getStart().getLine());
    }

    @Override
    public void exitGrantstmt(PostgreSQLParser.GrantstmtContext ctx) {
        exitStatement("GRANT", ctx.getStop().getLine());
    }

    // REVOKE
    @Override
    public void enterRevokestmt(PostgreSQLParser.RevokestmtContext ctx) {
        enterStatement("REVOKE", ctx.getStart().getLine());
    }

    @Override
    public void exitRevokestmt(PostgreSQLParser.RevokestmtContext ctx) {
        exitStatement("REVOKE", ctx.getStop().getLine());
    }

    // ========== TCL (Transaction Control Language) ==========

    // TRANSACTION (BEGIN/COMMIT/ROLLBACK/SAVEPOINT 등)
    @Override
    public void enterTransactionstmt(PostgreSQLParser.TransactionstmtContext ctx) {
        // 트랜잭션 타입 구분
        String transactionType = "TRANSACTION";
        String firstToken = ctx.getStart().getText().toUpperCase();
        
        if (firstToken.equals("BEGIN") || firstToken.equals("START")) {
            transactionType = "BEGIN";
        } else if (firstToken.equals("COMMIT") || firstToken.equals("END")) {
            transactionType = "COMMIT";
        } else if (firstToken.equals("ROLLBACK") || firstToken.equals("ABORT")) {
            transactionType = "ROLLBACK";
        } else if (firstToken.equals("SAVEPOINT")) {
            transactionType = "SAVEPOINT";
        } else if (firstToken.equals("RELEASE")) {
            transactionType = "RELEASE";
        } else if (firstToken.equals("PREPARE")) {
            transactionType = "PREPARE_TRANSACTION";
        }
        
        enterStatement(transactionType, ctx.getStart().getLine());
    }

    @Override
    public void exitTransactionstmt(PostgreSQLParser.TransactionstmtContext ctx) {
        String firstToken = ctx.getStart().getText().toUpperCase();
        String transactionType = "TRANSACTION";
        
        if (firstToken.equals("BEGIN") || firstToken.equals("START")) {
            transactionType = "BEGIN";
        } else if (firstToken.equals("COMMIT") || firstToken.equals("END")) {
            transactionType = "COMMIT";
        } else if (firstToken.equals("ROLLBACK") || firstToken.equals("ABORT")) {
            transactionType = "ROLLBACK";
        } else if (firstToken.equals("SAVEPOINT")) {
            transactionType = "SAVEPOINT";
        } else if (firstToken.equals("RELEASE")) {
            transactionType = "RELEASE";
        } else if (firstToken.equals("PREPARE")) {
            transactionType = "PREPARE_TRANSACTION";
        }
        
        exitStatement(transactionType, ctx.getStop().getLine());
    }

    // ========== 기타 유틸리티 명령어 ==========

    // ANALYZE
    @Override
    public void enterAnalyzestmt(PostgreSQLParser.AnalyzestmtContext ctx) {
        enterStatement("ANALYZE", ctx.getStart().getLine());
    }

    @Override
    public void exitAnalyzestmt(PostgreSQLParser.AnalyzestmtContext ctx) {
        exitStatement("ANALYZE", ctx.getStop().getLine());
    }

    // VACUUM
    @Override
    public void enterVacuumstmt(PostgreSQLParser.VacuumstmtContext ctx) {
        enterStatement("VACUUM", ctx.getStart().getLine());
    }

    @Override
    public void exitVacuumstmt(PostgreSQLParser.VacuumstmtContext ctx) {
        exitStatement("VACUUM", ctx.getStop().getLine());
    }

    // EXPLAIN
    @Override
    public void enterExplainstmt(PostgreSQLParser.ExplainstmtContext ctx) {
        insideExplain = true;  // EXPLAIN 시작
        enterStatement("EXPLAIN", ctx.getStart().getLine());
    }

    @Override
    public void exitExplainstmt(PostgreSQLParser.ExplainstmtContext ctx) {
        exitStatement("EXPLAIN", ctx.getStop().getLine());
        insideExplain = false;  // EXPLAIN 종료
    }

    // PREPARE
    @Override
    public void enterPreparestmt(PostgreSQLParser.PreparestmtContext ctx) {
        enterStatement("PREPARE", ctx.getStart().getLine());
    }

    @Override
    public void exitPreparestmt(PostgreSQLParser.PreparestmtContext ctx) {
        exitStatement("PREPARE", ctx.getStop().getLine());
    }

    // EXECUTE
    @Override
    public void enterExecutestmt(PostgreSQLParser.ExecutestmtContext ctx) {
        enterStatement("EXECUTE", ctx.getStart().getLine());
    }

    @Override
    public void exitExecutestmt(PostgreSQLParser.ExecutestmtContext ctx) {
        exitStatement("EXECUTE", ctx.getStop().getLine());
    }

    // LOCK
    @Override
    public void enterLockstmt(PostgreSQLParser.LockstmtContext ctx) {
        enterStatement("LOCK", ctx.getStart().getLine());
    }

    @Override
    public void exitLockstmt(PostgreSQLParser.LockstmtContext ctx) {
        exitStatement("LOCK", ctx.getStop().getLine());
    }

    // REINDEX
    @Override
    public void enterReindexstmt(PostgreSQLParser.ReindexstmtContext ctx) {
        enterStatement("REINDEX", ctx.getStart().getLine());
    }

    @Override
    public void exitReindexstmt(PostgreSQLParser.ReindexstmtContext ctx) {
        exitStatement("REINDEX", ctx.getStop().getLine());
    }

    // CLUSTER
    @Override
    public void enterClusterstmt(PostgreSQLParser.ClusterstmtContext ctx) {
        enterStatement("CLUSTER", ctx.getStart().getLine());
    }

    @Override
    public void exitClusterstmt(PostgreSQLParser.ClusterstmtContext ctx) {
        exitStatement("CLUSTER", ctx.getStop().getLine());
    }

    // COMMENT
    @Override
    public void enterCommentstmt(PostgreSQLParser.CommentstmtContext ctx) {
        enterStatement("COMMENT", ctx.getStart().getLine());
    }

    @Override
    public void exitCommentstmt(PostgreSQLParser.CommentstmtContext ctx) {
        exitStatement("COMMENT", ctx.getStop().getLine());
    }

    // CASE (SQL expression)
    @Override
    public void enterCase_expr(PostgreSQLParser.Case_exprContext ctx) {
        enterStatement("CASE", ctx.getStart().getLine());
    }

    @Override
    public void exitCase_expr(PostgreSQLParser.Case_exprContext ctx) {
        exitStatement("CASE", ctx.getStop().getLine());
    }

    // 트리 구조 출력
    public void printTree(Node node, String indent) {
        System.out.println(indent + node.type + " (" + node.startLine + ", " + node.endLine + ")");
        for (Node child : node.children) {
            printTree(child, indent + "  ");
        }
    }

    public void printStructure() {
        printTree(root, "");
    }
}