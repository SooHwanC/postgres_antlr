import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CustomPostgreSQLListener extends PostgreSQLParserBaseListener {
    private TokenStream tokens;
    private Stack<Node> nodeStack = new Stack<>();
    private Node root = new Node("ROOT", 0, null);

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
        System.out.println("Enter " + statementType + " Statement Line: " + line);
    }

    private void exitStatement(String statementType, int line) {
        Node node = nodeStack.pop();
        node.endLine = line;
        System.out.println("Exit " + statementType + " Statement Line: " + line);
    }

    // CREATE FUNCTION
    @Override
    public void enterCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        enterStatement("CREATE_FUNCTION", ctx.getStart().getLine());
        
        // $$ 토큰의 실제 라인 번호 찾기
        int dollarLineNumber = findDollarStringLine(ctx);
        
        // SPEC 노드 생성 (함수 선언부: CREATE FUNCTION ... AS $$)
        int specStartLine = ctx.getStart().getLine();
        int specEndLine = dollarLineNumber > 0 ? dollarLineNumber - 1 : specStartLine;
        Node specNode = new Node("SPEC", specStartLine, nodeStack.peek());
        specNode.endLine = specEndLine;
        
        // $$ ... $$ 내용 추출 및 PL/pgSQL 파싱
        String plpgsqlCode = extractDollarQuotedString(ctx);
        if (plpgsqlCode != null && !plpgsqlCode.trim().isEmpty()) {
            System.out.println("\n=== Found PL/pgSQL Block ===");
            System.out.println(plpgsqlCode);
            System.out.println("=========================\n");
            
            // PL/pgSQL 파싱 및 노드 트리 구축
            parsePlpgsqlBlock(plpgsqlCode, dollarLineNumber);
        }
    }

    /**
     * BeginDollarStringConstant 토큰이 있는 라인 번호 찾기
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
        
        return ctx.getStart().getLine();
    }

    @Override
    public void exitCreatefunctionstmt(PostgreSQLParser.CreatefunctionstmtContext ctx) {
        exitStatement("CREATE_FUNCTION", ctx.getStop().getLine());
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
                    System.err.println("PL/pgSQL Parse Error at line " + (baseLineNumber + line - 1) 
                                     + ":" + charPositionInLine + " - " + msg);
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
            
            System.out.println("PL/pgSQL parsing successful!");
            
        } catch (Exception e) {
            System.err.println("Error parsing PL/pgSQL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // SELECT
    @Override
    public void enterSelectstmt(PostgreSQLParser.SelectstmtContext ctx) {
        enterStatement("SELECT", ctx.getStart().getLine());
    }

    @Override
    public void exitSelectstmt(PostgreSQLParser.SelectstmtContext ctx) {
        exitStatement("SELECT", ctx.getStop().getLine());
    }

    // INSERT
    @Override
    public void enterInsertstmt(PostgreSQLParser.InsertstmtContext ctx) {
        enterStatement("INSERT", ctx.getStart().getLine());
    }

    @Override
    public void exitInsertstmt(PostgreSQLParser.InsertstmtContext ctx) {
        exitStatement("INSERT", ctx.getStop().getLine());
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

    // TRANSACTION (BEGIN/COMMIT/ROLLBACK 등)
    @Override
    public void enterTransactionstmt(PostgreSQLParser.TransactionstmtContext ctx) {
        enterStatement("TRANSACTION", ctx.getStart().getLine());
    }

    @Override
    public void exitTransactionstmt(PostgreSQLParser.TransactionstmtContext ctx) {
        exitStatement("TRANSACTION", ctx.getStop().getLine());
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