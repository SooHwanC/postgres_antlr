import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * PL/pgSQL Parse Tree를 Node 트리로 변환하는 Visitor
 */
public class CustomPlpgsqlVisitor extends PlpgsqlParserBaseVisitor<Node> {
    
    private Node parentNode;  // PostgreSQL의 CREATE_FUNCTION 노드
    private int baseLineNumber;  // $$ 시작 라인 번호
    private CommonTokenStream tokens;
    private Node currentBlockNode;
    
    public CustomPlpgsqlVisitor(Node parentNode, int baseLineNumber, CommonTokenStream tokens) {
        this.parentNode = parentNode;
        this.baseLineNumber = baseLineNumber;
        this.tokens = tokens;
    }
    
    /**
     * 실제 라인 번호 계산 (PL/pgSQL 내부 라인 + 베이스 라인)
     */
    private int getActualLineNumber(ParserRuleContext ctx) {
        return baseLineNumber + ctx.getStart().getLine() - 1;
    }
    
    /**
     * 노드 생성 헬퍼
     */
    private Node createNode(String type, ParserRuleContext ctx, Node parent) {
        int startLine = getActualLineNumber(ctx);
        Node node = new Node(type, startLine, parent);
        node.endLine = baseLineNumber + ctx.getStop().getLine() - 1;
        
        return node;
    }
    
    @Override
    public Node visitPlpgsqlBlock(PlpgsqlParser.PlpgsqlBlockContext ctx) {
        // PLPGSQL_BLOCK과 LABEL 노드를 만들지 않고, 직접 내용만 추가
        currentBlockNode = parentNode;
        
        // DECLARE 섹션
        if (ctx.declareSection() != null) {
            visit(ctx.declareSection());
        }
        
        // BEGIN ... END 섹션
        if (ctx.statementList() != null) {
            visitStatementList(ctx.statementList());
        }
        
        // EXCEPTION 섹션
        if (ctx.exceptionSection() != null) {
            visit(ctx.exceptionSection());
        }
        
        return null;
    }
    
    @Override
    public Node visitDeclareSection(PlpgsqlParser.DeclareSectionContext ctx) {
        Node declareNode = createNode("DECLARE_SECTION", ctx, currentBlockNode);
        
        for (PlpgsqlParser.DeclarationContext declCtx : ctx.declarationList().declaration()) {
            visitDeclaration(declCtx, declareNode);
        }
        
        return declareNode;
    }
    
    private void visitDeclaration(PlpgsqlParser.DeclarationContext ctx, Node parent) {
        // VARIABLE_DECLARATION과 INITIAL_VALUE 노드를 만들지 않음
        // 필요하면 변수명 정보만 저장하는 방식으로 변경 가능
    }
    
    @Override
    public Node visitStatementList(PlpgsqlParser.StatementListContext ctx) {
        if (ctx.statement() == null) return null;
        
        for (PlpgsqlParser.StatementContext stmtCtx : ctx.statement()) {
            visit(stmtCtx);
        }
        
        return null;
    }
    
    @Override
    public Node visitAssignmentStmt(PlpgsqlParser.AssignmentStmtContext ctx) {
        Node assignNode = createNode("ASSIGNMENT", ctx, currentBlockNode);
        return assignNode;
    }

    @Override
    public Node visitInsertStmt(PlpgsqlParser.InsertStmtContext ctx) {
        Node insertNode = createNode("INSERT", ctx, currentBlockNode);
        return insertNode;
    }

    @Override
    public Node visitUpdateStmt(PlpgsqlParser.UpdateStmtContext ctx) {
        Node updateNode = createNode("UPDATE", ctx, currentBlockNode);
        return updateNode;
    }

    @Override
    public Node visitDeleteStmt(PlpgsqlParser.DeleteStmtContext ctx) {
        Node deleteNode = createNode("DELETE", ctx, currentBlockNode);
        return deleteNode;
    }
    
    @Override
    public Node visitRaiseStmt(PlpgsqlParser.RaiseStmtContext ctx) {
        String level = "LOG";
        if (ctx.NOTICE() != null) level = "NOTICE";
        else if (ctx.WARNING() != null) level = "WARNING";
        else if (ctx.INFO() != null) level = "INFO";
        else if (ctx.DEBUG() != null) level = "DEBUG";
        else if (ctx.EXCEPTION() != null) level = "EXCEPTION";
        
        Node raiseNode = createNode("RAISE_" + level, ctx, currentBlockNode);
        return raiseNode;
    }
    
    @Override
    public Node visitReturnStmt(PlpgsqlParser.ReturnStmtContext ctx) {
        Node returnNode = createNode("RETURN", ctx, currentBlockNode);
        return returnNode;
    }
    
    @Override
    public Node visitSelectIntoStmt(PlpgsqlParser.SelectIntoStmtContext ctx) {
        Node selectNode = createNode("SELECT_INTO", ctx, currentBlockNode);
        return selectNode;
    }
    
    @Override
    public Node visitIfStmt(PlpgsqlParser.IfStmtContext ctx) {
        Node ifNode = createNode("IF", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = ifNode;
        
        // THEN 절
        if (ctx.statementList() != null && !ctx.statementList().isEmpty()) {
            visitStatementList(ctx.statementList(0));
        }
        
        // ELSIF 절들
        int elsifCount = ctx.expression().size() - 1; // IF 하나 + ELSIF들
        for (int i = 0; i < elsifCount; i++) {
            PlpgsqlParser.StatementListContext elsifStmtList = ctx.statementList(i + 1);
            int elsifStartLine = getActualLineNumber(elsifStmtList);
            int elsifEndLine = baseLineNumber + elsifStmtList.getStop().getLine() - 1;
            
            Node elsifNode = new Node("ELSIF", elsifStartLine, ifNode);
            elsifNode.endLine = elsifEndLine;
            
            currentBlockNode = elsifNode;
            visitStatementList(elsifStmtList);
        }
        
        // ELSE 절
        if (ctx.ELSE() != null) {
            PlpgsqlParser.StatementListContext elseStmtList = ctx.statementList(ctx.statementList().size() - 1);
            int elseStartLine = getActualLineNumber(elseStmtList);
            int elseEndLine = baseLineNumber + elseStmtList.getStop().getLine() - 1;
            
            Node elseNode = new Node("ELSE", elseStartLine, ifNode);
            elseNode.endLine = elseEndLine;
            
            currentBlockNode = elseNode;
            visitStatementList(elseStmtList);
        }
        
        currentBlockNode = previousBlock;
        return ifNode;
    }
    
    @Override
    public Node visitLoopStmt(PlpgsqlParser.LoopStmtContext ctx) {
        Node loopNode = createNode("LOOP", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = loopNode;
        
        visitStatementList(ctx.statementList());
        
        currentBlockNode = previousBlock;
        return loopNode;
    }
    
    @Override
    public Node visitWhileStmt(PlpgsqlParser.WhileStmtContext ctx) {
        Node whileNode = createNode("WHILE", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = whileNode;
        
        visitStatementList(ctx.statementList());
        
        currentBlockNode = previousBlock;
        return whileNode;
    }
    
    @Override
    public Node visitForStmt(PlpgsqlParser.ForStmtContext ctx) {
        Node forNode = createNode("FOR", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = forNode;
        
        visitStatementList(ctx.statementList());
        
        currentBlockNode = previousBlock;
        return forNode;
    }

    @Override
    public Node visitForeachStmt(PlpgsqlParser.ForeachStmtContext ctx) {
        Node foreachNode = createNode("FOREACH", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = foreachNode;
        
        visitStatementList(ctx.statementList());
        
        currentBlockNode = previousBlock;
        return foreachNode;
    }

    @Override
    public Node visitExitStmt(PlpgsqlParser.ExitStmtContext ctx) {
        Node exitNode = createNode("EXIT", ctx, currentBlockNode);
        return exitNode;
    }

    @Override
    public Node visitContinueStmt(PlpgsqlParser.ContinueStmtContext ctx) {
        Node continueNode = createNode("CONTINUE", ctx, currentBlockNode);
        return continueNode;
    }

    @Override
    public Node visitSetStmt(PlpgsqlParser.SetStmtContext ctx) {
        Node setNode = createNode("SET", ctx, currentBlockNode);
        return setNode;
    }
    
    @Override
    public Node visitNestedBlock(PlpgsqlParser.NestedBlockContext ctx) {
        // NESTED_BLOCK 노드를 만들지 않고, 내용만 현재 블록에 추가
        // DECLARE 섹션
        if (ctx.declarationList() != null) {
            PlpgsqlParser.DeclarationListContext declList = ctx.declarationList();
            
            // DECLARE 키워드가 있는 라인부터 시작 (ctx는 DECLARE부터 시작)
            int declStartLine = getActualLineNumber(ctx);
            int declEndLine = getActualLineNumber(declList.declaration(declList.declaration().size() - 1));
            
            Node declareNode = new Node("DECLARE_SECTION", declStartLine, currentBlockNode);
            declareNode.endLine = declEndLine;
            
            for (PlpgsqlParser.DeclarationContext declCtx : declList.declaration()) {
                visitDeclaration(declCtx, declareNode);
            }
        }
        
        // 문장들
        visitStatementList(ctx.statementList());
        
        return null;
    }
    
    @Override
    public Node visitExceptionSection(PlpgsqlParser.ExceptionSectionContext ctx) {
        Node exceptionNode = createNode("EXCEPTION_SECTION", ctx, currentBlockNode);
        
        for (PlpgsqlParser.ExceptionHandlerContext handlerCtx : ctx.exceptionHandlerList().exceptionHandler()) {
            Node handlerNode = createNode("EXCEPTION_HANDLER", handlerCtx, exceptionNode);
            Node previousBlock = currentBlockNode;
            currentBlockNode = handlerNode;
            
            visitStatementList(handlerCtx.statementList());
            
            currentBlockNode = previousBlock;
        }
        
        return exceptionNode;
    }
}

