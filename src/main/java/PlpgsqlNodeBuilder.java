import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * PL/pgSQL Parse Tree를 Node 트리로 변환하는 Visitor
 */
public class PlpgsqlNodeBuilder extends PlpgsqlParserBaseVisitor<Node> {
    
    private Node parentNode;  // PostgreSQL의 CREATE_FUNCTION 노드
    private int baseLineNumber;  // $$ 시작 라인 번호
    private CommonTokenStream tokens;
    private Node currentBlockNode;
    
    public PlpgsqlNodeBuilder(Node parentNode, int baseLineNumber, CommonTokenStream tokens) {
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
        Node blockNode = createNode("PLPGSQL_BLOCK", ctx, parentNode);
        currentBlockNode = blockNode;
        
        System.out.println("Creating PLPGSQL_BLOCK node at line " + blockNode.startLine);
        
        // Label 처리
        if (ctx.label() != null && !ctx.label().isEmpty()) {
            Node labelNode = new Node("LABEL", blockNode.startLine, blockNode);
            labelNode.endLine = blockNode.startLine;
        }
        
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
        
        return blockNode;
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
        Node varNode = createNode("VARIABLE_DECLARATION", ctx, parent);
        
        if (ctx.expression() != null) {
            Node initNode = createNode("INITIAL_VALUE", ctx.expression(), varNode);
        }
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
        for (int i = 1; i < ctx.statementList().size() - (ctx.ELSE() != null ? 1 : 0); i++) {
            Node elsifNode = new Node("ELSIF", getActualLineNumber(ctx), ifNode);
            visitStatementList(ctx.statementList(i));
        }
        
        // ELSE 절
        if (ctx.ELSE() != null) {
            Node elseNode = new Node("ELSE", getActualLineNumber(ctx), ifNode);
            visitStatementList(ctx.statementList(ctx.statementList().size() - 1));
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
    public Node visitNestedBlock(PlpgsqlParser.NestedBlockContext ctx) {
        Node nestedNode = createNode("NESTED_BLOCK", ctx, currentBlockNode);
        Node previousBlock = currentBlockNode;
        currentBlockNode = nestedNode;
        
        // DECLARE 섹션
        if (ctx.declarationList() != null) {
            // declarationList의 첫 번째와 마지막 declaration으로 범위 계산
            PlpgsqlParser.DeclarationListContext declList = ctx.declarationList();
            int declStartLine = getActualLineNumber(declList.declaration(0));
            int declEndLine = getActualLineNumber(declList.declaration(declList.declaration().size() - 1));
            
            Node declareNode = new Node("DECLARE_SECTION", declStartLine, nestedNode);
            declareNode.endLine = declEndLine;
            
            for (PlpgsqlParser.DeclarationContext declCtx : declList.declaration()) {
                visitDeclaration(declCtx, declareNode);
            }
        }
        
        // 문장들
        visitStatementList(ctx.statementList());
        
        currentBlockNode = previousBlock;
        return nestedNode;
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