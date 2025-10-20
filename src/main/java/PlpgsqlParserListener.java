// Generated from PlpgsqlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlpgsqlParser}.
 */
public interface PlpgsqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#plpgsqlBlock}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsqlBlock(PlpgsqlParser.PlpgsqlBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#plpgsqlBlock}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsqlBlock(PlpgsqlParser.PlpgsqlBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PlpgsqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PlpgsqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#declareSection}.
	 * @param ctx the parse tree
	 */
	void enterDeclareSection(PlpgsqlParser.DeclareSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#declareSection}.
	 * @param ctx the parse tree
	 */
	void exitDeclareSection(PlpgsqlParser.DeclareSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(PlpgsqlParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(PlpgsqlParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PlpgsqlParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PlpgsqlParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PlpgsqlParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PlpgsqlParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(PlpgsqlParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(PlpgsqlParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlpgsqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlpgsqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(PlpgsqlParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(PlpgsqlParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void enterVariableRef(PlpgsqlParser.VariableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#variableRef}.
	 * @param ctx the parse tree
	 */
	void exitVariableRef(PlpgsqlParser.VariableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#selectIntoStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoStmt(PlpgsqlParser.SelectIntoStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#selectIntoStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoStmt(PlpgsqlParser.SelectIntoStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(PlpgsqlParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(PlpgsqlParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(PlpgsqlParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(PlpgsqlParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(PlpgsqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(PlpgsqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#tableRef}.
	 * @param ctx the parse tree
	 */
	void enterTableRef(PlpgsqlParser.TableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#tableRef}.
	 * @param ctx the parse tree
	 */
	void exitTableRef(PlpgsqlParser.TableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(PlpgsqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(PlpgsqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void enterPerformStmt(PlpgsqlParser.PerformStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#performStmt}.
	 * @param ctx the parse tree
	 */
	void exitPerformStmt(PlpgsqlParser.PerformStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStmt(PlpgsqlParser.ExecuteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#executeStmt}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStmt(PlpgsqlParser.ExecuteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(PlpgsqlParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(PlpgsqlParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(PlpgsqlParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(PlpgsqlParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PlpgsqlParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PlpgsqlParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStmt(PlpgsqlParser.UpdateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#updateStmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStmt(PlpgsqlParser.UpdateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(PlpgsqlParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(PlpgsqlParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#columnAssignment}.
	 * @param ctx the parse tree
	 */
	void enterColumnAssignment(PlpgsqlParser.ColumnAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#columnAssignment}.
	 * @param ctx the parse tree
	 */
	void exitColumnAssignment(PlpgsqlParser.ColumnAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStmt(PlpgsqlParser.DeleteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#deleteStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStmt(PlpgsqlParser.DeleteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PlpgsqlParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PlpgsqlParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(PlpgsqlParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(PlpgsqlParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void enterWhenClauseList(PlpgsqlParser.WhenClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whenClauseList}.
	 * @param ctx the parse tree
	 */
	void exitWhenClauseList(PlpgsqlParser.WhenClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(PlpgsqlParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(PlpgsqlParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoopStmt(PlpgsqlParser.LoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#loopStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoopStmt(PlpgsqlParser.LoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PlpgsqlParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PlpgsqlParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PlpgsqlParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PlpgsqlParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForeachStmt(PlpgsqlParser.ForeachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#foreachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForeachStmt(PlpgsqlParser.ForeachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(PlpgsqlParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(PlpgsqlParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PlpgsqlParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PlpgsqlParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PlpgsqlParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PlpgsqlParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(PlpgsqlParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(PlpgsqlParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#raiseOptionList}.
	 * @param ctx the parse tree
	 */
	void enterRaiseOptionList(PlpgsqlParser.RaiseOptionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#raiseOptionList}.
	 * @param ctx the parse tree
	 */
	void exitRaiseOptionList(PlpgsqlParser.RaiseOptionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#raiseOption}.
	 * @param ctx the parse tree
	 */
	void enterRaiseOption(PlpgsqlParser.RaiseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#raiseOption}.
	 * @param ctx the parse tree
	 */
	void exitRaiseOption(PlpgsqlParser.RaiseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(PlpgsqlParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(PlpgsqlParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#nullStmt}.
	 * @param ctx the parse tree
	 */
	void enterNullStmt(PlpgsqlParser.NullStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#nullStmt}.
	 * @param ctx the parse tree
	 */
	void exitNullStmt(PlpgsqlParser.NullStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedBlock(PlpgsqlParser.NestedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#nestedBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedBlock(PlpgsqlParser.NestedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exceptionSection}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSection(PlpgsqlParser.ExceptionSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exceptionSection}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSection(PlpgsqlParser.ExceptionSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exceptionHandlerList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandlerList(PlpgsqlParser.ExceptionHandlerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exceptionHandlerList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandlerList(PlpgsqlParser.ExceptionHandlerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandler(PlpgsqlParser.ExceptionHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandler(PlpgsqlParser.ExceptionHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exceptionConditionList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionConditionList(PlpgsqlParser.ExceptionConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exceptionConditionList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionConditionList(PlpgsqlParser.ExceptionConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#exceptionCondition}.
	 * @param ctx the parse tree
	 */
	void enterExceptionCondition(PlpgsqlParser.ExceptionConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#exceptionCondition}.
	 * @param ctx the parse tree
	 */
	void exitExceptionCondition(PlpgsqlParser.ExceptionConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#getDiagnosticsStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetDiagnosticsStmt(PlpgsqlParser.GetDiagnosticsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#getDiagnosticsStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetDiagnosticsStmt(PlpgsqlParser.GetDiagnosticsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#diagnosticsItemList}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsItemList(PlpgsqlParser.DiagnosticsItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#diagnosticsItemList}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsItemList(PlpgsqlParser.DiagnosticsItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#diagnosticsItem}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsItem(PlpgsqlParser.DiagnosticsItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#diagnosticsItem}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsItem(PlpgsqlParser.DiagnosticsItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#diagnosticsOption}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsOption(PlpgsqlParser.DiagnosticsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#diagnosticsOption}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsOption(PlpgsqlParser.DiagnosticsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#openCursorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursorStmt(PlpgsqlParser.OpenCursorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#openCursorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursorStmt(PlpgsqlParser.OpenCursorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#closeCursorStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursorStmt(PlpgsqlParser.CloseCursorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#closeCursorStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursorStmt(PlpgsqlParser.CloseCursorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void enterFetchStmt(PlpgsqlParser.FetchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#fetchStmt}.
	 * @param ctx the parse tree
	 */
	void exitFetchStmt(PlpgsqlParser.FetchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(PlpgsqlParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(PlpgsqlParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PlpgsqlParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PlpgsqlParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PlpgsqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PlpgsqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlpgsqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlpgsqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whenExprClauseList}.
	 * @param ctx the parse tree
	 */
	void enterWhenExprClauseList(PlpgsqlParser.WhenExprClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whenExprClauseList}.
	 * @param ctx the parse tree
	 */
	void exitWhenExprClauseList(PlpgsqlParser.WhenExprClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#whenExprClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenExprClause(PlpgsqlParser.WhenExprClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#whenExprClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenExprClause(PlpgsqlParser.WhenExprClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(PlpgsqlParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#arrayExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(PlpgsqlParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PlpgsqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PlpgsqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlpgsqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlpgsqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlpgsqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlpgsqlParser.LiteralContext ctx);
}