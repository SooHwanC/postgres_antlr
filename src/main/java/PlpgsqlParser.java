// Generated from PlpgsqlParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlpgsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, BEGIN=2, END=3, EXCEPTION=4, IF=5, THEN=6, ELSIF=7, ELSE=8, 
		CASE=9, WHEN=10, LOOP=11, WHILE=12, FOR=13, FOREACH=14, EXIT=15, CONTINUE=16, 
		RETURN=17, RAISE=18, NEXT=19, QUERY=20, SELECT=21, INSERT=22, UPDATE=23, 
		DELETE=24, PERFORM=25, EXECUTE=26, INTO=27, FROM=28, WHERE=29, SET=30, 
		VALUES=31, RETURNING=32, TO=33, DISTINCT=34, ALL=35, GROUP=36, HAVING=37, 
		ORDER=38, LIMIT=39, OFFSET=40, ASC=41, DESC=42, NULLS=43, FIRST=44, LAST=45, 
		WITH=46, BETWEEN=47, UNION=48, INTERSECT=49, EXCEPT=50, EXISTS=51, CAST=52, 
		EXTRACT=53, COALESCE=54, NULLIF=55, GREATEST=56, LEAST=57, COMMIT=58, 
		ROLLBACK=59, SAVEPOINT=60, START=61, TRANSACTION=62, WORK=63, INTEGER=64, 
		BIGINT=65, SMALLINT=66, NUMERIC=67, DECIMAL=68, REAL=69, DOUBLE=70, VARCHAR=71, 
		CHAR=72, TEXT=73, BOOLEAN=74, DATE=75, TIME=76, TIMESTAMP=77, TIMESTAMPTZ=78, 
		INTERVAL=79, RECORD=80, JSON=81, JSONB=82, UUID=83, BYTEA=84, MONEY=85, 
		IN=86, REVERSE=87, BY=88, ARRAY=89, SLICE=90, JOIN=91, LEFT=92, RIGHT=93, 
		INNER=94, OUTER=95, FULL=96, CROSS=97, ON=98, NOTICE=99, WARNING=100, 
		INFO=101, DEBUG=102, LOG=103, SQLSTATE=104, ERRCODE=105, MESSAGE=106, 
		DETAIL=107, HINT=108, GET=109, DIAGNOSTICS=110, STACKED=111, CURRENT=112, 
		AS=113, IS=114, NULL=115, NOT=116, AND=117, OR=118, CONSTANT=119, DEFAULT=120, 
		USING=121, STRICT=122, ZONE=123, VOLATILE=124, STABLE=125, IMMUTABLE=126, 
		LANGUAGE=127, RETURNS=128, CALLED=129, SECURITY=130, DEFINER=131, INVOKER=132, 
		ASSERT=133, OPEN=134, CLOSE=135, FETCH=136, MOVE=137, FOUND=138, CURSOR=139, 
		ALIAS=140, TRUE=141, FALSE=142, PERCENT=143, TYPE=144, ROWTYPE=145, DOLLAR=146, 
		ASSIGN=147, CONCAT=148, EQ=149, NEQ=150, LT=151, LTE=152, GT=153, GTE=154, 
		PLUS=155, MINUS=156, STAR=157, SLASH=158, PERCENT_OP=159, CARET=160, TYPECAST=161, 
		LIKE=162, ILIKE=163, SIMILAR=164, ANY=165, SOME=166, SEMI=167, COMMA=168, 
		DOT=169, LPAREN=170, RPAREN=171, LBRACK=172, RBRACK=173, LABEL_START=174, 
		LABEL_END=175, IntegerLiteral=176, NumericLiteral=177, StringLiteral=178, 
		DollarQuotedString=179, Identifier=180, QuotedIdentifier=181, LineComment=182, 
		BlockComment=183, WS=184;
	public static final int
		RULE_plpgsqlBlock = 0, RULE_label = 1, RULE_declareSection = 2, RULE_declarationList = 3, 
		RULE_declaration = 4, RULE_dataType = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_assignmentStmt = 8, RULE_variableRef = 9, RULE_selectIntoStmt = 10, 
		RULE_selectList = 11, RULE_variableList = 12, RULE_fromClause = 13, RULE_tableRef = 14, 
		RULE_joinClause = 15, RULE_joinType = 16, RULE_whereClause = 17, RULE_performStmt = 18, 
		RULE_executeStmt = 19, RULE_insertStmt = 20, RULE_columnList = 21, RULE_expressionList = 22, 
		RULE_updateStmt = 23, RULE_assignmentList = 24, RULE_columnAssignment = 25, 
		RULE_deleteStmt = 26, RULE_setStmt = 27, RULE_ifStmt = 28, RULE_caseStmt = 29, 
		RULE_whenClauseList = 30, RULE_whenClause = 31, RULE_loopStmt = 32, RULE_whileStmt = 33, 
		RULE_forStmt = 34, RULE_forQuerySource = 35, RULE_foreachStmt = 36, RULE_exitStmt = 37, 
		RULE_continueStmt = 38, RULE_returnStmt = 39, RULE_raiseStmt = 40, RULE_raiseOptionList = 41, 
		RULE_raiseOption = 42, RULE_assertStmt = 43, RULE_nullStmt = 44, RULE_commitStmt = 45, 
		RULE_rollbackStmt = 46, RULE_nestedBlock = 47, RULE_exceptionSection = 48, 
		RULE_exceptionHandlerList = 49, RULE_exceptionHandler = 50, RULE_exceptionConditionList = 51, 
		RULE_exceptionCondition = 52, RULE_getDiagnosticsStmt = 53, RULE_diagnosticsItemList = 54, 
		RULE_diagnosticsItem = 55, RULE_diagnosticsOption = 56, RULE_openCursorStmt = 57, 
		RULE_closeCursorStmt = 58, RULE_fetchStmt = 59, RULE_selectStmt = 60, 
		RULE_withClause = 61, RULE_cteList = 62, RULE_cte = 63, RULE_selectQuery = 64, 
		RULE_groupByClause = 65, RULE_havingClause = 66, RULE_orderByClause = 67, 
		RULE_orderByItem = 68, RULE_limitClause = 69, RULE_parameterList = 70, 
		RULE_parameter = 71, RULE_expression = 72, RULE_whenExprClauseList = 73, 
		RULE_whenExprClause = 74, RULE_arrayExpression = 75, RULE_functionCall = 76, 
		RULE_literal = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"plpgsqlBlock", "label", "declareSection", "declarationList", "declaration", 
			"dataType", "statementList", "statement", "assignmentStmt", "variableRef", 
			"selectIntoStmt", "selectList", "variableList", "fromClause", "tableRef", 
			"joinClause", "joinType", "whereClause", "performStmt", "executeStmt", 
			"insertStmt", "columnList", "expressionList", "updateStmt", "assignmentList", 
			"columnAssignment", "deleteStmt", "setStmt", "ifStmt", "caseStmt", "whenClauseList", 
			"whenClause", "loopStmt", "whileStmt", "forStmt", "forQuerySource", "foreachStmt", 
			"exitStmt", "continueStmt", "returnStmt", "raiseStmt", "raiseOptionList", 
			"raiseOption", "assertStmt", "nullStmt", "commitStmt", "rollbackStmt", 
			"nestedBlock", "exceptionSection", "exceptionHandlerList", "exceptionHandler", 
			"exceptionConditionList", "exceptionCondition", "getDiagnosticsStmt", 
			"diagnosticsItemList", "diagnosticsItem", "diagnosticsOption", "openCursorStmt", 
			"closeCursorStmt", "fetchStmt", "selectStmt", "withClause", "cteList", 
			"cte", "selectQuery", "groupByClause", "havingClause", "orderByClause", 
			"orderByItem", "limitClause", "parameterList", "parameter", "expression", 
			"whenExprClauseList", "whenExprClause", "arrayExpression", "functionCall", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARE'", "'BEGIN'", "'END'", "'EXCEPTION'", "'IF'", "'THEN'", 
			"'ELSIF'", "'ELSE'", "'CASE'", "'WHEN'", "'LOOP'", "'WHILE'", "'FOR'", 
			"'FOREACH'", "'EXIT'", "'CONTINUE'", "'RETURN'", "'RAISE'", "'NEXT'", 
			"'QUERY'", "'SELECT'", "'INSERT'", "'UPDATE'", "'DELETE'", "'PERFORM'", 
			"'EXECUTE'", "'INTO'", "'FROM'", "'WHERE'", "'SET'", "'VALUES'", "'RETURNING'", 
			"'TO'", "'DISTINCT'", "'ALL'", "'GROUP'", "'HAVING'", "'ORDER'", "'LIMIT'", 
			"'OFFSET'", "'ASC'", "'DESC'", "'NULLS'", "'FIRST'", "'LAST'", "'WITH'", 
			"'BETWEEN'", "'UNION'", "'INTERSECT'", "'EXCEPT'", "'EXISTS'", "'CAST'", 
			"'EXTRACT'", "'COALESCE'", "'NULLIF'", "'GREATEST'", "'LEAST'", "'COMMIT'", 
			"'ROLLBACK'", "'SAVEPOINT'", "'START'", "'TRANSACTION'", "'WORK'", null, 
			"'BIGINT'", "'SMALLINT'", "'NUMERIC'", "'DECIMAL'", "'REAL'", null, "'VARCHAR'", 
			"'CHAR'", "'TEXT'", null, "'DATE'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPTZ'", 
			"'INTERVAL'", "'RECORD'", "'JSON'", "'JSONB'", "'UUID'", "'BYTEA'", "'MONEY'", 
			"'IN'", "'REVERSE'", "'BY'", "'ARRAY'", "'SLICE'", "'JOIN'", "'LEFT'", 
			"'RIGHT'", "'INNER'", "'OUTER'", "'FULL'", "'CROSS'", "'ON'", "'NOTICE'", 
			"'WARNING'", "'INFO'", "'DEBUG'", "'LOG'", "'SQLSTATE'", "'ERRCODE'", 
			"'MESSAGE'", "'DETAIL'", "'HINT'", "'GET'", "'DIAGNOSTICS'", "'STACKED'", 
			"'CURRENT'", "'AS'", "'IS'", "'NULL'", "'NOT'", "'AND'", "'OR'", "'CONSTANT'", 
			"'DEFAULT'", "'USING'", "'STRICT'", "'ZONE'", "'VOLATILE'", "'STABLE'", 
			"'IMMUTABLE'", "'LANGUAGE'", "'RETURNS'", "'CALLED'", "'SECURITY'", "'DEFINER'", 
			"'INVOKER'", "'ASSERT'", "'OPEN'", "'CLOSE'", "'FETCH'", "'MOVE'", "'FOUND'", 
			"'CURSOR'", "'ALIAS'", "'TRUE'", "'FALSE'", null, "'TYPE'", "'ROWTYPE'", 
			"'$'", "':='", "'||'", "'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", 
			"'-'", "'*'", "'/'", null, "'^'", "'::'", "'LIKE'", "'ILIKE'", "'SIMILAR'", 
			"'ANY'", "'SOME'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", "'<<'", 
			"'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "BEGIN", "END", "EXCEPTION", "IF", "THEN", "ELSIF", 
			"ELSE", "CASE", "WHEN", "LOOP", "WHILE", "FOR", "FOREACH", "EXIT", "CONTINUE", 
			"RETURN", "RAISE", "NEXT", "QUERY", "SELECT", "INSERT", "UPDATE", "DELETE", 
			"PERFORM", "EXECUTE", "INTO", "FROM", "WHERE", "SET", "VALUES", "RETURNING", 
			"TO", "DISTINCT", "ALL", "GROUP", "HAVING", "ORDER", "LIMIT", "OFFSET", 
			"ASC", "DESC", "NULLS", "FIRST", "LAST", "WITH", "BETWEEN", "UNION", 
			"INTERSECT", "EXCEPT", "EXISTS", "CAST", "EXTRACT", "COALESCE", "NULLIF", 
			"GREATEST", "LEAST", "COMMIT", "ROLLBACK", "SAVEPOINT", "START", "TRANSACTION", 
			"WORK", "INTEGER", "BIGINT", "SMALLINT", "NUMERIC", "DECIMAL", "REAL", 
			"DOUBLE", "VARCHAR", "CHAR", "TEXT", "BOOLEAN", "DATE", "TIME", "TIMESTAMP", 
			"TIMESTAMPTZ", "INTERVAL", "RECORD", "JSON", "JSONB", "UUID", "BYTEA", 
			"MONEY", "IN", "REVERSE", "BY", "ARRAY", "SLICE", "JOIN", "LEFT", "RIGHT", 
			"INNER", "OUTER", "FULL", "CROSS", "ON", "NOTICE", "WARNING", "INFO", 
			"DEBUG", "LOG", "SQLSTATE", "ERRCODE", "MESSAGE", "DETAIL", "HINT", "GET", 
			"DIAGNOSTICS", "STACKED", "CURRENT", "AS", "IS", "NULL", "NOT", "AND", 
			"OR", "CONSTANT", "DEFAULT", "USING", "STRICT", "ZONE", "VOLATILE", "STABLE", 
			"IMMUTABLE", "LANGUAGE", "RETURNS", "CALLED", "SECURITY", "DEFINER", 
			"INVOKER", "ASSERT", "OPEN", "CLOSE", "FETCH", "MOVE", "FOUND", "CURSOR", 
			"ALIAS", "TRUE", "FALSE", "PERCENT", "TYPE", "ROWTYPE", "DOLLAR", "ASSIGN", 
			"CONCAT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT_OP", "CARET", "TYPECAST", "LIKE", "ILIKE", "SIMILAR", 
			"ANY", "SOME", "SEMI", "COMMA", "DOT", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "LABEL_START", "LABEL_END", "IntegerLiteral", "NumericLiteral", 
			"StringLiteral", "DollarQuotedString", "Identifier", "QuotedIdentifier", 
			"LineComment", "BlockComment", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PlpgsqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlpgsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlpgsqlBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PlpgsqlParser.BEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public DeclareSectionContext declareSection() {
			return getRuleContext(DeclareSectionContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public PlpgsqlBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plpgsqlBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterPlpgsqlBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitPlpgsqlBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitPlpgsqlBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlpgsqlBlockContext plpgsqlBlock() throws RecognitionException {
		PlpgsqlBlockContext _localctx = new PlpgsqlBlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plpgsqlBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(156);
				label();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(159);
				declareSection();
				}
			}

			setState(162);
			match(BEGIN);
			setState(163);
			statementList();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(164);
				exceptionSection();
				}
			}

			setState(167);
			match(END);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(168);
				label();
				}
			}

			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(171);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL_START() { return getToken(PlpgsqlParser.LABEL_START, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode LABEL_END() { return getToken(PlpgsqlParser.LABEL_END, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LABEL_START);
			setState(175);
			match(Identifier);
			setState(176);
			match(LABEL_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareSectionContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlpgsqlParser.DECLARE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclareSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDeclareSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDeclareSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDeclareSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareSectionContext declareSection() throws RecognitionException {
		DeclareSectionContext _localctx = new DeclareSectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declareSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(DECLARE);
			setState(179);
			declarationList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				declaration();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PlpgsqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PlpgsqlParser.Identifier, i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode CONSTANT() { return getToken(PlpgsqlParser.CONSTANT, 0); }
		public TerminalNode NOT() { return getToken(PlpgsqlParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public TerminalNode ASSIGN() { return getToken(PlpgsqlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PlpgsqlParser.DEFAULT, 0); }
		public TerminalNode CURSOR() { return getToken(PlpgsqlParser.CURSOR, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode IS() { return getToken(PlpgsqlParser.IS, 0); }
		public TerminalNode FOR() { return getToken(PlpgsqlParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode ALIAS() { return getToken(PlpgsqlParser.ALIAS, 0); }
		public TerminalNode DOLLAR() { return getToken(PlpgsqlParser.DOLLAR, 0); }
		public TerminalNode IntegerLiteral() { return getToken(PlpgsqlParser.IntegerLiteral, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(Identifier);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(187);
					match(CONSTANT);
					}
				}

				setState(190);
				dataType(0);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(191);
					match(NOT);
					setState(192);
					match(NULL);
					}
				}

				setState(199);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(195);
					match(ASSIGN);
					setState(196);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(197);
					match(DEFAULT);
					setState(198);
					expression(0);
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(201);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(Identifier);
				setState(204);
				match(CURSOR);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(205);
					match(LPAREN);
					setState(206);
					parameterList();
					setState(207);
					match(RPAREN);
					}
				}

				setState(211);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(212);
				selectStmt();
				setState(213);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(Identifier);
				setState(216);
				match(ALIAS);
				setState(217);
				match(FOR);
				setState(221);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(218);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(219);
					match(DOLLAR);
					setState(220);
					match(IntegerLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(223);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(PlpgsqlParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(PlpgsqlParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(PlpgsqlParser.SMALLINT, 0); }
		public TerminalNode NUMERIC() { return getToken(PlpgsqlParser.NUMERIC, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public List<TerminalNode> IntegerLiteral() { return getTokens(PlpgsqlParser.IntegerLiteral); }
		public TerminalNode IntegerLiteral(int i) {
			return getToken(PlpgsqlParser.IntegerLiteral, i);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(PlpgsqlParser.COMMA, 0); }
		public TerminalNode DECIMAL() { return getToken(PlpgsqlParser.DECIMAL, 0); }
		public TerminalNode REAL() { return getToken(PlpgsqlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(PlpgsqlParser.DOUBLE, 0); }
		public TerminalNode VARCHAR() { return getToken(PlpgsqlParser.VARCHAR, 0); }
		public TerminalNode CHAR() { return getToken(PlpgsqlParser.CHAR, 0); }
		public TerminalNode TEXT() { return getToken(PlpgsqlParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(PlpgsqlParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(PlpgsqlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(PlpgsqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PlpgsqlParser.TIMESTAMP, 0); }
		public TerminalNode WITH() { return getToken(PlpgsqlParser.WITH, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode ZONE() { return getToken(PlpgsqlParser.ZONE, 0); }
		public TerminalNode TIMESTAMPTZ() { return getToken(PlpgsqlParser.TIMESTAMPTZ, 0); }
		public TerminalNode INTERVAL() { return getToken(PlpgsqlParser.INTERVAL, 0); }
		public TerminalNode RECORD() { return getToken(PlpgsqlParser.RECORD, 0); }
		public TerminalNode JSON() { return getToken(PlpgsqlParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(PlpgsqlParser.JSONB, 0); }
		public TerminalNode UUID() { return getToken(PlpgsqlParser.UUID, 0); }
		public TerminalNode BYTEA() { return getToken(PlpgsqlParser.BYTEA, 0); }
		public TerminalNode MONEY() { return getToken(PlpgsqlParser.MONEY, 0); }
		public TerminalNode PERCENT() { return getToken(PlpgsqlParser.PERCENT, 0); }
		public TerminalNode TYPE() { return getToken(PlpgsqlParser.TYPE, 0); }
		public TerminalNode ROWTYPE() { return getToken(PlpgsqlParser.ROWTYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PlpgsqlParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PlpgsqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PlpgsqlParser.RBRACK, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		return dataType(0);
	}

	private DataTypeContext dataType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataTypeContext _localctx = new DataTypeContext(_ctx, _parentState);
		DataTypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_dataType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(227);
				match(INTEGER);
				}
				break;
			case BIGINT:
				{
				setState(228);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				{
				setState(229);
				match(SMALLINT);
				}
				break;
			case NUMERIC:
				{
				setState(230);
				match(NUMERIC);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(231);
					match(LPAREN);
					setState(232);
					match(IntegerLiteral);
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(233);
						match(COMMA);
						setState(234);
						match(IntegerLiteral);
						}
					}

					setState(237);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				{
				setState(240);
				match(DECIMAL);
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(241);
					match(LPAREN);
					setState(242);
					match(IntegerLiteral);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(243);
						match(COMMA);
						setState(244);
						match(IntegerLiteral);
						}
					}

					setState(247);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case REAL:
				{
				setState(250);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(251);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				{
				setState(252);
				match(VARCHAR);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(253);
					match(LPAREN);
					setState(254);
					match(IntegerLiteral);
					setState(255);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(258);
				match(CHAR);
				setState(262);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(259);
					match(LPAREN);
					setState(260);
					match(IntegerLiteral);
					setState(261);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(264);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(265);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(266);
				match(DATE);
				}
				break;
			case TIME:
				{
				setState(267);
				match(TIME);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(268);
					match(LPAREN);
					setState(269);
					match(IntegerLiteral);
					setState(270);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TIMESTAMP:
				{
				setState(273);
				match(TIMESTAMP);
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(274);
					match(LPAREN);
					setState(275);
					match(IntegerLiteral);
					setState(276);
					match(RPAREN);
					}
					break;
				}
				setState(282);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(279);
					match(WITH);
					setState(280);
					match(Identifier);
					setState(281);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case TIMESTAMPTZ:
				{
				setState(284);
				match(TIMESTAMPTZ);
				}
				break;
			case INTERVAL:
				{
				setState(285);
				match(INTERVAL);
				}
				break;
			case RECORD:
				{
				setState(286);
				match(RECORD);
				}
				break;
			case JSON:
				{
				setState(287);
				match(JSON);
				}
				break;
			case JSONB:
				{
				setState(288);
				match(JSONB);
				}
				break;
			case UUID:
				{
				setState(289);
				match(UUID);
				}
				break;
			case BYTEA:
				{
				setState(290);
				match(BYTEA);
				}
				break;
			case MONEY:
				{
				setState(291);
				match(MONEY);
				}
				break;
			case Identifier:
				{
				setState(292);
				match(Identifier);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(293);
					match(PERCENT);
					setState(294);
					_la = _input.LA(1);
					if ( !(_la==TYPE || _la==ROWTYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DataTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(300);
					match(ARRAY);
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(301);
						match(LBRACK);
						setState(302);
						match(RBRACK);
						}
						break;
					}
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691129661520422L) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 251658305L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 193L) != 0)) {
				{
				{
				setState(310);
				statement();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public SelectIntoStmtContext selectIntoStmt() {
			return getRuleContext(SelectIntoStmtContext.class,0);
		}
		public PerformStmtContext performStmt() {
			return getRuleContext(PerformStmtContext.class,0);
		}
		public ExecuteStmtContext executeStmt() {
			return getRuleContext(ExecuteStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public CaseStmtContext caseStmt() {
			return getRuleContext(CaseStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForeachStmtContext foreachStmt() {
			return getRuleContext(ForeachStmtContext.class,0);
		}
		public ExitStmtContext exitStmt() {
			return getRuleContext(ExitStmtContext.class,0);
		}
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public RaiseStmtContext raiseStmt() {
			return getRuleContext(RaiseStmtContext.class,0);
		}
		public AssertStmtContext assertStmt() {
			return getRuleContext(AssertStmtContext.class,0);
		}
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public NestedBlockContext nestedBlock() {
			return getRuleContext(NestedBlockContext.class,0);
		}
		public GetDiagnosticsStmtContext getDiagnosticsStmt() {
			return getRuleContext(GetDiagnosticsStmtContext.class,0);
		}
		public OpenCursorStmtContext openCursorStmt() {
			return getRuleContext(OpenCursorStmtContext.class,0);
		}
		public CloseCursorStmtContext closeCursorStmt() {
			return getRuleContext(CloseCursorStmtContext.class,0);
		}
		public FetchStmtContext fetchStmt() {
			return getRuleContext(FetchStmtContext.class,0);
		}
		public CommitStmtContext commitStmt() {
			return getRuleContext(CommitStmtContext.class,0);
		}
		public RollbackStmtContext rollbackStmt() {
			return getRuleContext(RollbackStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				selectIntoStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				performStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				executeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				insertStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(321);
				updateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(322);
				deleteStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(323);
				setStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(324);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(325);
				caseStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(326);
				loopStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(327);
				whileStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(328);
				forStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(329);
				foreachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(330);
				exitStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(331);
				continueStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(332);
				returnStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(333);
				raiseStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(334);
				assertStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(335);
				nullStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(336);
				nestedBlock();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(337);
				getDiagnosticsStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(338);
				openCursorStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(339);
				closeCursorStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(340);
				fetchStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(341);
				commitStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(342);
				rollbackStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStmtContext extends ParserRuleContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PlpgsqlParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			variableRef();
			setState(346);
			match(ASSIGN);
			setState(347);
			expression(0);
			setState(348);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableRefContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PlpgsqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PlpgsqlParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(PlpgsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PlpgsqlParser.DOT, i);
		}
		public List<TerminalNode> QuotedIdentifier() { return getTokens(PlpgsqlParser.QuotedIdentifier); }
		public TerminalNode QuotedIdentifier(int i) {
			return getToken(PlpgsqlParser.QuotedIdentifier, i);
		}
		public VariableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterVariableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitVariableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableRefContext variableRef() throws RecognitionException {
		VariableRefContext _localctx = new VariableRefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableRef);
		try {
			int _alt;
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(Identifier);
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(351);
						match(DOT);
						setState(352);
						match(Identifier);
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(QuotedIdentifier);
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						match(DOT);
						setState(360);
						match(QuotedIdentifier);
						}
						} 
					}
					setState(365);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectIntoStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PlpgsqlParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode STRICT() { return getToken(PlpgsqlParser.STRICT, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectIntoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectIntoStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSelectIntoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSelectIntoStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectIntoStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectIntoStmtContext selectIntoStmt() throws RecognitionException {
		SelectIntoStmtContext _localctx = new SelectIntoStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectIntoStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(SELECT);
			setState(369);
			selectList();
			setState(370);
			match(INTO);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(371);
				match(STRICT);
				}
			}

			setState(374);
			variableList();
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(375);
				fromClause();
				}
			}

			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(378);
				whereClause();
				}
			}

			setState(381);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PlpgsqlParser.STAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSelectList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(383);
				match(STAR);
				}
				break;
			case CASE:
			case EXISTS:
			case CAST:
			case COALESCE:
			case NULLIF:
			case GREATEST:
			case LEAST:
			case INTERVAL:
			case ARRAY:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				{
				setState(384);
				expression(0);
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(385);
					match(COMMA);
					setState(386);
					expression(0);
					}
					}
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableListContext extends ParserRuleContext {
		public List<VariableRefContext> variableRef() {
			return getRuleContexts(VariableRefContext.class);
		}
		public VariableRefContext variableRef(int i) {
			return getRuleContext(VariableRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			variableRef();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(395);
				match(COMMA);
				setState(396);
				variableRef();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PlpgsqlParser.FROM, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(FROM);
			setState(403);
			tableRef();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 111L) != 0) || _la==COMMA) {
				{
				{
				setState(404);
				joinClause();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableRefContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PlpgsqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PlpgsqlParser.Identifier, i);
		}
		public TerminalNode AS() { return getToken(PlpgsqlParser.AS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PlpgsqlParser.WITH, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TableRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterTableRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitTableRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitTableRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRefContext tableRef() throws RecognitionException {
		TableRefContext _localctx = new TableRefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tableRef);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(Identifier);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(411);
						match(AS);
						}
					}

					setState(414);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(417);
				functionCall();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(418);
					match(WITH);
					setState(419);
					match(Identifier);
					}
				}

				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(422);
						match(AS);
						}
					}

					setState(425);
					match(Identifier);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
				match(LPAREN);
				setState(429);
				selectStmt();
				setState(430);
				match(RPAREN);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(431);
						match(AS);
						}
					}

					setState(434);
					match(Identifier);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(PlpgsqlParser.COMMA, 0); }
		public TableRefContext tableRef() {
			return getRuleContext(TableRefContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(PlpgsqlParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlpgsqlParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(PlpgsqlParser.USING, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterJoinClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitJoinClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitJoinClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_joinClause);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(COMMA);
				setState(440);
				tableRef();
				}
				break;
			case JOIN:
			case LEFT:
			case RIGHT:
			case INNER:
			case FULL:
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & 55L) != 0)) {
					{
					setState(441);
					joinType();
					}
				}

				setState(444);
				match(JOIN);
				setState(445);
				tableRef();
				setState(453);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(446);
					match(ON);
					setState(447);
					expression(0);
					}
					break;
				case USING:
					{
					setState(448);
					match(USING);
					setState(449);
					match(LPAREN);
					setState(450);
					columnList();
					setState(451);
					match(RPAREN);
					}
					break;
				case LOOP:
				case WHERE:
				case RETURNING:
				case GROUP:
				case HAVING:
				case ORDER:
				case LIMIT:
				case UNION:
				case INTERSECT:
				case EXCEPT:
				case JOIN:
				case LEFT:
				case RIGHT:
				case INNER:
				case FULL:
				case CROSS:
				case SEMI:
				case COMMA:
				case RPAREN:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(PlpgsqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PlpgsqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(PlpgsqlParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(PlpgsqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PlpgsqlParser.FULL, 0); }
		public TerminalNode CROSS() { return getToken(PlpgsqlParser.CROSS, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_joinType);
		int _la;
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(LEFT);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(459);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(RIGHT);
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(463);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(FULL);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(467);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(470);
				match(CROSS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PlpgsqlParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(WHERE);
			setState(474);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PerformStmtContext extends ParserRuleContext {
		public TerminalNode PERFORM() { return getToken(PlpgsqlParser.PERFORM, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public PerformStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_performStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterPerformStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitPerformStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitPerformStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerformStmtContext performStmt() throws RecognitionException {
		PerformStmtContext _localctx = new PerformStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_performStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(PERFORM);
			setState(477);
			selectList();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(478);
				fromClause();
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(481);
				whereClause();
				}
			}

			setState(484);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExecuteStmtContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(PlpgsqlParser.EXECUTE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode USING() { return getToken(PlpgsqlParser.USING, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExecuteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExecuteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExecuteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExecuteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExecuteStmtContext executeStmt() throws RecognitionException {
		ExecuteStmtContext _localctx = new ExecuteStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_executeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(EXECUTE);
			setState(487);
			expression(0);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(488);
				match(INTO);
				setState(489);
				variableList();
				}
			}

			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(492);
				match(USING);
				setState(493);
				expressionList();
				}
			}

			setState(496);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(PlpgsqlParser.INSERT, 0); }
		public List<TerminalNode> INTO() { return getTokens(PlpgsqlParser.INTO); }
		public TerminalNode INTO(int i) {
			return getToken(PlpgsqlParser.INTO, i);
		}
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode VALUES() { return getToken(PlpgsqlParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PlpgsqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PlpgsqlParser.LPAREN, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PlpgsqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PlpgsqlParser.RPAREN, i);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(PlpgsqlParser.RETURNING, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(PlpgsqlParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterInsertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitInsertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_insertStmt);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(INSERT);
				setState(499);
				match(INTO);
				setState(500);
				match(Identifier);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(501);
					match(LPAREN);
					setState(502);
					columnList();
					setState(503);
					match(RPAREN);
					}
				}

				setState(507);
				match(VALUES);
				setState(508);
				match(LPAREN);
				setState(509);
				expressionList();
				setState(510);
				match(RPAREN);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(511);
					match(RETURNING);
					setState(512);
					expressionList();
					setState(513);
					match(INTO);
					setState(514);
					variableList();
					}
				}

				setState(518);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(INSERT);
				setState(521);
				match(INTO);
				setState(522);
				match(Identifier);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(523);
					match(LPAREN);
					setState(524);
					columnList();
					setState(525);
					match(RPAREN);
					}
				}

				setState(529);
				match(SELECT);
				setState(530);
				selectList();
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(531);
					fromClause();
					}
				}

				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(534);
					whereClause();
					}
				}

				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(537);
					groupByClause();
					}
				}

				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(540);
					havingClause();
					}
				}

				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(543);
					orderByClause();
					}
				}

				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(546);
					limitClause();
					}
				}

				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(549);
					match(RETURNING);
					setState(550);
					expressionList();
					setState(551);
					match(INTO);
					setState(552);
					variableList();
					}
				}

				setState(556);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(PlpgsqlParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PlpgsqlParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterColumnList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitColumnList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitColumnList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(Identifier);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(561);
				match(COMMA);
				setState(562);
				match(Identifier);
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			expression(0);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(569);
				match(COMMA);
				setState(570);
				expression(0);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(PlpgsqlParser.UPDATE, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode SET() { return getToken(PlpgsqlParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(PlpgsqlParser.RETURNING, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterUpdateStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitUpdateStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(UPDATE);
			setState(577);
			match(Identifier);
			setState(578);
			match(SET);
			setState(579);
			assignmentList();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(580);
				whereClause();
				}
			}

			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(583);
				match(RETURNING);
				setState(584);
				expressionList();
				setState(585);
				match(INTO);
				setState(586);
				variableList();
				}
			}

			setState(590);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<ColumnAssignmentContext> columnAssignment() {
			return getRuleContexts(ColumnAssignmentContext.class);
		}
		public ColumnAssignmentContext columnAssignment(int i) {
			return getRuleContext(ColumnAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			columnAssignment();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				columnAssignment();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnAssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode EQ() { return getToken(PlpgsqlParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColumnAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterColumnAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitColumnAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitColumnAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAssignmentContext columnAssignment() throws RecognitionException {
		ColumnAssignmentContext _localctx = new ColumnAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_columnAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(Identifier);
			setState(601);
			match(EQ);
			setState(602);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(PlpgsqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PlpgsqlParser.FROM, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(PlpgsqlParser.RETURNING, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDeleteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDeleteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(DELETE);
			setState(605);
			match(FROM);
			setState(606);
			match(Identifier);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(607);
				whereClause();
				}
			}

			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(610);
				match(RETURNING);
				setState(611);
				expressionList();
				setState(612);
				match(INTO);
				setState(613);
				variableList();
				}
			}

			setState(617);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetStmtContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(PlpgsqlParser.SET, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode TO() { return getToken(PlpgsqlParser.TO, 0); }
		public TerminalNode EQ() { return getToken(PlpgsqlParser.EQ, 0); }
		public TerminalNode FROM() { return getToken(PlpgsqlParser.FROM, 0); }
		public TerminalNode CURRENT() { return getToken(PlpgsqlParser.CURRENT, 0); }
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSetStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSetStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSetStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setStmt);
		int _la;
		try {
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(SET);
				setState(620);
				match(Identifier);
				setState(621);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(622);
				expression(0);
				setState(623);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(SET);
				setState(626);
				match(Identifier);
				setState(627);
				match(FROM);
				setState(628);
				match(CURRENT);
				setState(629);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PlpgsqlParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PlpgsqlParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(PlpgsqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(PlpgsqlParser.THEN, i);
		}
		public List<StatementListContext> statementList() {
			return getRuleContexts(StatementListContext.class);
		}
		public StatementListContext statementList(int i) {
			return getRuleContext(StatementListContext.class,i);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(PlpgsqlParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(PlpgsqlParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(PlpgsqlParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(IF);
			setState(633);
			expression(0);
			setState(634);
			match(THEN);
			setState(635);
			statementList();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(636);
				match(ELSIF);
				setState(637);
				expression(0);
				setState(638);
				match(THEN);
				setState(639);
				statementList();
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(646);
				match(ELSE);
				setState(647);
				statementList();
				}
			}

			setState(650);
			match(END);
			setState(651);
			match(IF);
			setState(652);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseStmtContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(PlpgsqlParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(PlpgsqlParser.CASE, i);
		}
		public WhenClauseListContext whenClauseList() {
			return getRuleContext(WhenClauseListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(PlpgsqlParser.ELSE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStmtContext caseStmt() throws RecognitionException {
		CaseStmtContext _localctx = new CaseStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(CASE);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276971377083286016L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -4611685812268956671L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 4033L) != 0)) {
				{
				setState(655);
				expression(0);
				}
			}

			setState(658);
			whenClauseList();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(659);
				match(ELSE);
				setState(660);
				statementList();
				}
			}

			setState(663);
			match(END);
			setState(664);
			match(CASE);
			setState(665);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseListContext extends ParserRuleContext {
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public WhenClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClauseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhenClauseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhenClauseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenClauseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseListContext whenClauseList() throws RecognitionException {
		WhenClauseListContext _localctx = new WhenClauseListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whenClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(667);
				whenClause();
				}
				}
				setState(670); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PlpgsqlParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlpgsqlParser.THEN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(WHEN);
			setState(673);
			expression(0);
			setState(674);
			match(THEN);
			setState(675);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStmtContext extends ParserRuleContext {
		public List<TerminalNode> LOOP() { return getTokens(PlpgsqlParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PlpgsqlParser.LOOP, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitLoopStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLoopStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(677);
				label();
				}
			}

			setState(680);
			match(LOOP);
			setState(681);
			statementList();
			setState(682);
			match(END);
			setState(683);
			match(LOOP);
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(684);
				label();
				}
			}

			setState(687);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PlpgsqlParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlpgsqlParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PlpgsqlParser.LOOP, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(689);
				label();
				}
			}

			setState(692);
			match(WHILE);
			setState(693);
			expression(0);
			setState(694);
			match(LOOP);
			setState(695);
			statementList();
			setState(696);
			match(END);
			setState(697);
			match(LOOP);
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(698);
				label();
				}
			}

			setState(701);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PlpgsqlParser.FOR, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode IN() { return getToken(PlpgsqlParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PlpgsqlParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PlpgsqlParser.DOT, i);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlpgsqlParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PlpgsqlParser.LOOP, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode REVERSE() { return getToken(PlpgsqlParser.REVERSE, 0); }
		public TerminalNode BY() { return getToken(PlpgsqlParser.BY, 0); }
		public ForQuerySourceContext forQuerySource() {
			return getRuleContext(ForQuerySourceContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forStmt);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(703);
					label();
					}
				}

				setState(706);
				match(FOR);
				setState(707);
				match(Identifier);
				setState(708);
				match(IN);
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(709);
					match(REVERSE);
					}
				}

				setState(712);
				expression(0);
				setState(713);
				match(DOT);
				setState(714);
				match(DOT);
				setState(715);
				expression(0);
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(716);
					match(BY);
					setState(717);
					expression(0);
					}
				}

				setState(720);
				match(LOOP);
				setState(721);
				statementList();
				setState(722);
				match(END);
				setState(723);
				match(LOOP);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(724);
					label();
					}
				}

				setState(727);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(729);
					label();
					}
				}

				setState(732);
				match(FOR);
				setState(733);
				match(Identifier);
				setState(734);
				match(IN);
				setState(735);
				forQuerySource();
				setState(736);
				match(LOOP);
				setState(737);
				statementList();
				setState(738);
				match(END);
				setState(739);
				match(LOOP);
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(740);
					label();
					}
				}

				setState(743);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForQuerySourceContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(PlpgsqlParser.EXECUTE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(PlpgsqlParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public ForQuerySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forQuerySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterForQuerySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitForQuerySource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitForQuerySource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForQuerySourceContext forQuerySource() throws RecognitionException {
		ForQuerySourceContext _localctx = new ForQuerySourceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forQuerySource);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(747);
				match(EXECUTE);
				setState(748);
				expression(0);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(SELECT);
				setState(750);
				selectList();
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(751);
					fromClause();
					}
				}

				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(754);
					whereClause();
					}
				}

				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(757);
					groupByClause();
					}
				}

				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(760);
					havingClause();
					}
				}

				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(763);
					orderByClause();
					}
				}

				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(766);
					limitClause();
					}
				}

				}
				break;
			case CASE:
			case EXISTS:
			case CAST:
			case COALESCE:
			case NULLIF:
			case GREATEST:
			case LEAST:
			case INTERVAL:
			case ARRAY:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForeachStmtContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(PlpgsqlParser.FOREACH, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode IN() { return getToken(PlpgsqlParser.IN, 0); }
		public TerminalNode ARRAY() { return getToken(PlpgsqlParser.ARRAY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> LOOP() { return getTokens(PlpgsqlParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PlpgsqlParser.LOOP, i);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SLICE() { return getToken(PlpgsqlParser.SLICE, 0); }
		public TerminalNode IntegerLiteral() { return getToken(PlpgsqlParser.IntegerLiteral, 0); }
		public ForeachStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterForeachStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitForeachStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitForeachStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachStmtContext foreachStmt() throws RecognitionException {
		ForeachStmtContext _localctx = new ForeachStmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_foreachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(772);
				label();
				}
			}

			setState(775);
			match(FOREACH);
			setState(776);
			match(Identifier);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(777);
				match(SLICE);
				setState(778);
				match(IntegerLiteral);
				}
			}

			setState(781);
			match(IN);
			setState(782);
			match(ARRAY);
			setState(783);
			expression(0);
			setState(784);
			match(LOOP);
			setState(785);
			statementList();
			setState(786);
			match(END);
			setState(787);
			match(LOOP);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(788);
				label();
				}
			}

			setState(791);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExitStmtContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(PlpgsqlParser.EXIT, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode WHEN() { return getToken(PlpgsqlParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStmtContext exitStmt() throws RecognitionException {
		ExitStmtContext _localctx = new ExitStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(EXIT);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(794);
				match(Identifier);
				}
			}

			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(797);
				match(WHEN);
				setState(798);
				expression(0);
				}
			}

			setState(801);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PlpgsqlParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode WHEN() { return getToken(PlpgsqlParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(CONTINUE);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(804);
				match(Identifier);
				}
			}

			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(807);
				match(WHEN);
				setState(808);
				expression(0);
				}
			}

			setState(811);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PlpgsqlParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(PlpgsqlParser.NEXT, 0); }
		public TerminalNode QUERY() { return getToken(PlpgsqlParser.QUERY, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode EXECUTE() { return getToken(PlpgsqlParser.EXECUTE, 0); }
		public TerminalNode USING() { return getToken(PlpgsqlParser.USING, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnStmt);
		int _la;
		try {
			setState(838);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(813);
				match(RETURN);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276971377083286016L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -4611685812268956671L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 4033L) != 0)) {
					{
					setState(814);
					expression(0);
					}
				}

				setState(817);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818);
				match(RETURN);
				setState(819);
				match(NEXT);
				setState(820);
				expression(0);
				setState(821);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				match(RETURN);
				setState(824);
				match(QUERY);
				setState(825);
				selectStmt();
				setState(826);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				match(RETURN);
				setState(829);
				match(QUERY);
				setState(830);
				match(EXECUTE);
				setState(831);
				expression(0);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(832);
					match(USING);
					setState(833);
					expressionList();
					}
				}

				setState(836);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RaiseStmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(PlpgsqlParser.RAISE, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode StringLiteral() { return getToken(PlpgsqlParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode USING() { return getToken(PlpgsqlParser.USING, 0); }
		public RaiseOptionListContext raiseOptionList() {
			return getRuleContext(RaiseOptionListContext.class,0);
		}
		public TerminalNode NOTICE() { return getToken(PlpgsqlParser.NOTICE, 0); }
		public TerminalNode WARNING() { return getToken(PlpgsqlParser.WARNING, 0); }
		public TerminalNode INFO() { return getToken(PlpgsqlParser.INFO, 0); }
		public TerminalNode DEBUG() { return getToken(PlpgsqlParser.DEBUG, 0); }
		public TerminalNode LOG() { return getToken(PlpgsqlParser.LOG, 0); }
		public TerminalNode EXCEPTION() { return getToken(PlpgsqlParser.EXCEPTION, 0); }
		public TerminalNode COMMA() { return getToken(PlpgsqlParser.COMMA, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public RaiseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterRaiseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitRaiseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitRaiseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseStmtContext raiseStmt() throws RecognitionException {
		RaiseStmtContext _localctx = new RaiseStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_raiseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(RAISE);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 31L) != 0)) {
				{
				setState(841);
				_la = _input.LA(1);
				if ( !(_la==EXCEPTION || ((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(844);
				match(StringLiteral);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(845);
					match(COMMA);
					setState(846);
					expressionList();
					}
				}

				}
				break;
			case Identifier:
				{
				setState(849);
				match(Identifier);
				}
				break;
			case USING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(854);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(852);
				match(USING);
				setState(853);
				raiseOptionList();
				}
			}

			setState(856);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RaiseOptionListContext extends ParserRuleContext {
		public List<RaiseOptionContext> raiseOption() {
			return getRuleContexts(RaiseOptionContext.class);
		}
		public RaiseOptionContext raiseOption(int i) {
			return getRuleContext(RaiseOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public RaiseOptionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseOptionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterRaiseOptionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitRaiseOptionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitRaiseOptionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseOptionListContext raiseOptionList() throws RecognitionException {
		RaiseOptionListContext _localctx = new RaiseOptionListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_raiseOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			raiseOption();
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(859);
				match(COMMA);
				setState(860);
				raiseOption();
				}
				}
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RaiseOptionContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PlpgsqlParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MESSAGE() { return getToken(PlpgsqlParser.MESSAGE, 0); }
		public TerminalNode DETAIL() { return getToken(PlpgsqlParser.DETAIL, 0); }
		public TerminalNode HINT() { return getToken(PlpgsqlParser.HINT, 0); }
		public TerminalNode ERRCODE() { return getToken(PlpgsqlParser.ERRCODE, 0); }
		public TerminalNode SQLSTATE() { return getToken(PlpgsqlParser.SQLSTATE, 0); }
		public RaiseOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterRaiseOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitRaiseOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitRaiseOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseOptionContext raiseOption() throws RecognitionException {
		RaiseOptionContext _localctx = new RaiseOptionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_raiseOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
			_la = _input.LA(1);
			if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(867);
			match(EQ);
			setState(868);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertStmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PlpgsqlParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(PlpgsqlParser.COMMA, 0); }
		public AssertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitAssertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(ASSERT);
			setState(871);
			expression(0);
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(872);
				match(COMMA);
				setState(873);
				expression(0);
				}
			}

			setState(876);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullStmtContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public NullStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterNullStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitNullStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitNullStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullStmtContext nullStmt() throws RecognitionException {
		NullStmtContext _localctx = new NullStmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(NULL);
			setState(879);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommitStmtContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(PlpgsqlParser.COMMIT, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode WORK() { return getToken(PlpgsqlParser.WORK, 0); }
		public TerminalNode TRANSACTION() { return getToken(PlpgsqlParser.TRANSACTION, 0); }
		public CommitStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCommitStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCommitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCommitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitStmtContext commitStmt() throws RecognitionException {
		CommitStmtContext _localctx = new CommitStmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_commitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(COMMIT);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(882);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==WORK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(885);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RollbackStmtContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(PlpgsqlParser.ROLLBACK, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode TO() { return getToken(PlpgsqlParser.TO, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode WORK() { return getToken(PlpgsqlParser.WORK, 0); }
		public TerminalNode TRANSACTION() { return getToken(PlpgsqlParser.TRANSACTION, 0); }
		public TerminalNode SAVEPOINT() { return getToken(PlpgsqlParser.SAVEPOINT, 0); }
		public RollbackStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterRollbackStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitRollbackStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitRollbackStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackStmtContext rollbackStmt() throws RecognitionException {
		RollbackStmtContext _localctx = new RollbackStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rollbackStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(ROLLBACK);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(888);
				_la = _input.LA(1);
				if ( !(_la==TRANSACTION || _la==WORK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(891);
				match(TO);
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(892);
					match(SAVEPOINT);
					}
				}

				setState(895);
				match(Identifier);
				}
			}

			setState(898);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedBlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(PlpgsqlParser.BEGIN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode DECLARE() { return getToken(PlpgsqlParser.DECLARE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ExceptionSectionContext exceptionSection() {
			return getRuleContext(ExceptionSectionContext.class,0);
		}
		public NestedBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterNestedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitNestedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitNestedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedBlockContext nestedBlock() throws RecognitionException {
		NestedBlockContext _localctx = new NestedBlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(900);
				label();
				}
			}

			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(903);
				match(DECLARE);
				}
			}

			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(906);
				declarationList();
				}
			}

			setState(909);
			match(BEGIN);
			setState(910);
			statementList();
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(911);
				exceptionSection();
				}
			}

			setState(914);
			match(END);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(915);
				label();
				}
			}

			setState(918);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionSectionContext extends ParserRuleContext {
		public TerminalNode EXCEPTION() { return getToken(PlpgsqlParser.EXCEPTION, 0); }
		public ExceptionHandlerListContext exceptionHandlerList() {
			return getRuleContext(ExceptionHandlerListContext.class,0);
		}
		public ExceptionSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExceptionSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExceptionSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSectionContext exceptionSection() throws RecognitionException {
		ExceptionSectionContext _localctx = new ExceptionSectionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exceptionSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(EXCEPTION);
			setState(921);
			exceptionHandlerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionHandlerListContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public ExceptionHandlerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandlerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExceptionHandlerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExceptionHandlerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionHandlerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerListContext exceptionHandlerList() throws RecognitionException {
		ExceptionHandlerListContext _localctx = new ExceptionHandlerListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_exceptionHandlerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(923);
				exceptionHandler();
				}
				}
				setState(926); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PlpgsqlParser.WHEN, 0); }
		public ExceptionConditionListContext exceptionConditionList() {
			return getRuleContext(ExceptionConditionListContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlpgsqlParser.THEN, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExceptionHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(WHEN);
			setState(929);
			exceptionConditionList();
			setState(930);
			match(THEN);
			setState(931);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionConditionListContext extends ParserRuleContext {
		public List<ExceptionConditionContext> exceptionCondition() {
			return getRuleContexts(ExceptionConditionContext.class);
		}
		public ExceptionConditionContext exceptionCondition(int i) {
			return getRuleContext(ExceptionConditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PlpgsqlParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PlpgsqlParser.OR, i);
		}
		public ExceptionConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionConditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExceptionConditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExceptionConditionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionConditionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionConditionListContext exceptionConditionList() throws RecognitionException {
		ExceptionConditionListContext _localctx = new ExceptionConditionListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exceptionConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			exceptionCondition();
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(934);
				match(OR);
				setState(935);
				exceptionCondition();
				}
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionConditionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode SQLSTATE() { return getToken(PlpgsqlParser.SQLSTATE, 0); }
		public TerminalNode StringLiteral() { return getToken(PlpgsqlParser.StringLiteral, 0); }
		public ExceptionConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExceptionCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExceptionCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionConditionContext exceptionCondition() throws RecognitionException {
		ExceptionConditionContext _localctx = new ExceptionConditionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_exceptionCondition);
		try {
			setState(944);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(Identifier);
				}
				break;
			case SQLSTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(SQLSTATE);
				setState(943);
				match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetDiagnosticsStmtContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(PlpgsqlParser.GET, 0); }
		public TerminalNode DIAGNOSTICS() { return getToken(PlpgsqlParser.DIAGNOSTICS, 0); }
		public DiagnosticsItemListContext diagnosticsItemList() {
			return getRuleContext(DiagnosticsItemListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode CURRENT() { return getToken(PlpgsqlParser.CURRENT, 0); }
		public TerminalNode STACKED() { return getToken(PlpgsqlParser.STACKED, 0); }
		public GetDiagnosticsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getDiagnosticsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterGetDiagnosticsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitGetDiagnosticsStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitGetDiagnosticsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetDiagnosticsStmtContext getDiagnosticsStmt() throws RecognitionException {
		GetDiagnosticsStmtContext _localctx = new GetDiagnosticsStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(946);
			match(GET);
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STACKED || _la==CURRENT) {
				{
				setState(947);
				_la = _input.LA(1);
				if ( !(_la==STACKED || _la==CURRENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(950);
			match(DIAGNOSTICS);
			setState(951);
			diagnosticsItemList();
			setState(952);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagnosticsItemListContext extends ParserRuleContext {
		public List<DiagnosticsItemContext> diagnosticsItem() {
			return getRuleContexts(DiagnosticsItemContext.class);
		}
		public DiagnosticsItemContext diagnosticsItem(int i) {
			return getRuleContext(DiagnosticsItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public DiagnosticsItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnosticsItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDiagnosticsItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDiagnosticsItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsItemListContext diagnosticsItemList() throws RecognitionException {
		DiagnosticsItemListContext _localctx = new DiagnosticsItemListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_diagnosticsItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			diagnosticsItem();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(955);
				match(COMMA);
				setState(956);
				diagnosticsItem();
				}
				}
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagnosticsItemContext extends ParserRuleContext {
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PlpgsqlParser.EQ, 0); }
		public DiagnosticsOptionContext diagnosticsOption() {
			return getRuleContext(DiagnosticsOptionContext.class,0);
		}
		public DiagnosticsItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnosticsItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDiagnosticsItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDiagnosticsItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsItemContext diagnosticsItem() throws RecognitionException {
		DiagnosticsItemContext _localctx = new DiagnosticsItemContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_diagnosticsItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			variableRef();
			setState(963);
			match(EQ);
			setState(964);
			diagnosticsOption();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DiagnosticsOptionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public DiagnosticsOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diagnosticsOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterDiagnosticsOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitDiagnosticsOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsOptionContext diagnosticsOption() throws RecognitionException {
		DiagnosticsOptionContext _localctx = new DiagnosticsOptionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_diagnosticsOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenCursorStmtContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(PlpgsqlParser.OPEN, 0); }
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(PlpgsqlParser.FOR, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public OpenCursorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCursorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterOpenCursorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitOpenCursorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOpenCursorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCursorStmtContext openCursorStmt() throws RecognitionException {
		OpenCursorStmtContext _localctx = new OpenCursorStmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_openCursorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(968);
			match(OPEN);
			setState(969);
			variableRef();
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(970);
				match(LPAREN);
				setState(971);
				expressionList();
				setState(972);
				match(RPAREN);
				}
			}

			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(976);
				match(FOR);
				setState(977);
				selectStmt();
				}
			}

			setState(980);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloseCursorStmtContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(PlpgsqlParser.CLOSE, 0); }
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public CloseCursorStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeCursorStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCloseCursorStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCloseCursorStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCloseCursorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCursorStmtContext closeCursorStmt() throws RecognitionException {
		CloseCursorStmtContext _localctx = new CloseCursorStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_closeCursorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			match(CLOSE);
			setState(983);
			variableRef();
			setState(984);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FetchStmtContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(PlpgsqlParser.FETCH, 0); }
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public FetchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterFetchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitFetchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitFetchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchStmtContext fetchStmt() throws RecognitionException {
		FetchStmtContext _localctx = new FetchStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fetchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(FETCH);
			setState(987);
			variableRef();
			setState(988);
			match(INTO);
			setState(989);
			variableList();
			setState(990);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStmtContext extends ParserRuleContext {
		public List<SelectQueryContext> selectQuery() {
			return getRuleContexts(SelectQueryContext.class);
		}
		public SelectQueryContext selectQuery(int i) {
			return getRuleContext(SelectQueryContext.class,i);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public List<TerminalNode> UNION() { return getTokens(PlpgsqlParser.UNION); }
		public TerminalNode UNION(int i) {
			return getToken(PlpgsqlParser.UNION, i);
		}
		public List<TerminalNode> INTERSECT() { return getTokens(PlpgsqlParser.INTERSECT); }
		public TerminalNode INTERSECT(int i) {
			return getToken(PlpgsqlParser.INTERSECT, i);
		}
		public List<TerminalNode> EXCEPT() { return getTokens(PlpgsqlParser.EXCEPT); }
		public TerminalNode EXCEPT(int i) {
			return getToken(PlpgsqlParser.EXCEPT, i);
		}
		public List<TerminalNode> ALL() { return getTokens(PlpgsqlParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(PlpgsqlParser.ALL, i);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSelectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(992);
				withClause();
				}
			}

			setState(995);
			selectQuery();
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) {
				{
				{
				setState(996);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(997);
					match(ALL);
					}
				}

				setState(1000);
				selectQuery();
				}
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PlpgsqlParser.WITH, 0); }
		public CteListContext cteList() {
			return getRuleContext(CteListContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(WITH);
			setState(1007);
			cteList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteListContext extends ParserRuleContext {
		public List<CteContext> cte() {
			return getRuleContexts(CteContext.class);
		}
		public CteContext cte(int i) {
			return getRuleContext(CteContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public CteListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cteList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCteList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCteList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCteList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteListContext cteList() throws RecognitionException {
		CteListContext _localctx = new CteListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cteList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			cte();
			setState(1014);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1010);
				match(COMMA);
				setState(1011);
				cte();
				}
				}
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode AS() { return getToken(PlpgsqlParser.AS, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PlpgsqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PlpgsqlParser.LPAREN, i);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PlpgsqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PlpgsqlParser.RPAREN, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(Identifier);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1018);
				match(LPAREN);
				setState(1019);
				columnList();
				setState(1020);
				match(RPAREN);
				}
			}

			setState(1024);
			match(AS);
			setState(1025);
			match(LPAREN);
			setState(1026);
			selectStmt();
			setState(1027);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PlpgsqlParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(PlpgsqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(PlpgsqlParser.ALL, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public TerminalNode ON() { return getToken(PlpgsqlParser.ON, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public SelectQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSelectQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSelectQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectQueryContext selectQuery() throws RecognitionException {
		SelectQueryContext _localctx = new SelectQueryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			match(SELECT);
			setState(1039);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				{
				setState(1030);
				match(DISTINCT);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1031);
					match(ON);
					setState(1032);
					match(LPAREN);
					setState(1033);
					expressionList();
					setState(1034);
					match(RPAREN);
					}
				}

				}
				break;
			case ALL:
				{
				setState(1038);
				match(ALL);
				}
				break;
			case CASE:
			case EXISTS:
			case CAST:
			case COALESCE:
			case NULLIF:
			case GREATEST:
			case LEAST:
			case INTERVAL:
			case ARRAY:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case STAR:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				break;
			default:
				break;
			}
			setState(1041);
			selectList();
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1042);
				fromClause();
				}
			}

			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1045);
				whereClause();
				}
			}

			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1048);
				groupByClause();
				}
			}

			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1051);
				havingClause();
				}
			}

			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1054);
				orderByClause();
				}
			}

			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1057);
				limitClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(PlpgsqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PlpgsqlParser.BY, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(GROUP);
			setState(1061);
			match(BY);
			setState(1062);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(PlpgsqlParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(HAVING);
			setState(1065);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PlpgsqlParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PlpgsqlParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(ORDER);
			setState(1068);
			match(BY);
			setState(1069);
			orderByItem();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1070);
				match(COMMA);
				setState(1071);
				orderByItem();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PlpgsqlParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PlpgsqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PlpgsqlParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PlpgsqlParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PlpgsqlParser.LAST, 0); }
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			expression(0);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1078);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1081);
				match(NULLS);
				setState(1082);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(PlpgsqlParser.LIMIT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(PlpgsqlParser.ALL, 0); }
		public TerminalNode OFFSET() { return getToken(PlpgsqlParser.OFFSET, 0); }
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterLimitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitLimitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(LIMIT);
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case EXISTS:
			case CAST:
			case COALESCE:
			case NULLIF:
			case GREATEST:
			case LEAST:
			case INTERVAL:
			case ARRAY:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				{
				setState(1086);
				expression(0);
				}
				break;
			case ALL:
				{
				setState(1087);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1090);
				match(OFFSET);
				setState(1091);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			parameter();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1095);
				match(COMMA);
				setState(1096);
				parameter();
				}
				}
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			match(Identifier);
			setState(1103);
			dataType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(PlpgsqlParser.INTERVAL, 0); }
		public TerminalNode StringLiteral() { return getToken(PlpgsqlParser.StringLiteral, 0); }
		public TerminalNode CAST() { return getToken(PlpgsqlParser.CAST, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(PlpgsqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode COALESCE() { return getToken(PlpgsqlParser.COALESCE, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode NULLIF() { return getToken(PlpgsqlParser.NULLIF, 0); }
		public TerminalNode COMMA() { return getToken(PlpgsqlParser.COMMA, 0); }
		public TerminalNode GREATEST() { return getToken(PlpgsqlParser.GREATEST, 0); }
		public TerminalNode LEAST() { return getToken(PlpgsqlParser.LEAST, 0); }
		public TerminalNode EXISTS() { return getToken(PlpgsqlParser.EXISTS, 0); }
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PlpgsqlParser.NOT, 0); }
		public TerminalNode CASE() { return getToken(PlpgsqlParser.CASE, 0); }
		public WhenExprClauseListContext whenExprClauseList() {
			return getRuleContext(WhenExprClauseListContext.class,0);
		}
		public TerminalNode END() { return getToken(PlpgsqlParser.END, 0); }
		public TerminalNode ELSE() { return getToken(PlpgsqlParser.ELSE, 0); }
		public ArrayExpressionContext arrayExpression() {
			return getRuleContext(ArrayExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PlpgsqlParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PlpgsqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PlpgsqlParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(PlpgsqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PlpgsqlParser.MINUS, 0); }
		public TerminalNode CONCAT() { return getToken(PlpgsqlParser.CONCAT, 0); }
		public TerminalNode EQ() { return getToken(PlpgsqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PlpgsqlParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PlpgsqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PlpgsqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PlpgsqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PlpgsqlParser.GTE, 0); }
		public TerminalNode BETWEEN() { return getToken(PlpgsqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PlpgsqlParser.AND, 0); }
		public TerminalNode LIKE() { return getToken(PlpgsqlParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(PlpgsqlParser.ILIKE, 0); }
		public TerminalNode SIMILAR() { return getToken(PlpgsqlParser.SIMILAR, 0); }
		public TerminalNode TO() { return getToken(PlpgsqlParser.TO, 0); }
		public TerminalNode OR() { return getToken(PlpgsqlParser.OR, 0); }
		public TerminalNode TYPECAST() { return getToken(PlpgsqlParser.TYPECAST, 0); }
		public TerminalNode ANY() { return getToken(PlpgsqlParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(PlpgsqlParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(PlpgsqlParser.ALL, 0); }
		public TerminalNode IS() { return getToken(PlpgsqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public TerminalNode IN() { return getToken(PlpgsqlParser.IN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 144;
		enterRecursionRule(_localctx, 144, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1106);
				literal();
				}
				break;
			case 2:
				{
				setState(1107);
				variableRef();
				}
				break;
			case 3:
				{
				setState(1108);
				functionCall();
				}
				break;
			case 4:
				{
				setState(1109);
				match(INTERVAL);
				setState(1110);
				match(StringLiteral);
				}
				break;
			case 5:
				{
				setState(1111);
				match(CAST);
				setState(1112);
				match(LPAREN);
				setState(1113);
				expression(0);
				setState(1114);
				match(AS);
				setState(1115);
				dataType(0);
				setState(1116);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(1118);
				match(COALESCE);
				setState(1119);
				match(LPAREN);
				setState(1120);
				expressionList();
				setState(1121);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(1123);
				match(NULLIF);
				setState(1124);
				match(LPAREN);
				setState(1125);
				expression(0);
				setState(1126);
				match(COMMA);
				setState(1127);
				expression(0);
				setState(1128);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(1130);
				match(GREATEST);
				setState(1131);
				match(LPAREN);
				setState(1132);
				expressionList();
				setState(1133);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(1135);
				match(LEAST);
				setState(1136);
				match(LPAREN);
				setState(1137);
				expressionList();
				setState(1138);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(1140);
				match(EXISTS);
				setState(1141);
				match(LPAREN);
				setState(1142);
				selectStmt();
				setState(1143);
				match(RPAREN);
				}
				break;
			case 11:
				{
				setState(1145);
				match(LPAREN);
				setState(1146);
				selectStmt();
				setState(1147);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(1149);
				match(LPAREN);
				setState(1150);
				expression(0);
				setState(1151);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(1153);
				match(NOT);
				setState(1154);
				expression(5);
				}
				break;
			case 14:
				{
				setState(1155);
				match(CASE);
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276971377083286016L) != 0) || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & -4611685812268956671L) != 0) || ((((_la - 170)) & ~0x3f) == 0 && ((1L << (_la - 170)) & 4033L) != 0)) {
					{
					setState(1156);
					expression(0);
					}
				}

				setState(1159);
				whenExprClauseList();
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1160);
					match(ELSE);
					setState(1161);
					expression(0);
					}
				}

				setState(1164);
				match(END);
				}
				break;
			case 15:
				{
				setState(1166);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1169);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1170);
						_la = _input.LA(1);
						if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 49153L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1171);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1172);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1173);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1174);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1175);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1176);
						match(CONCAT);
						setState(1177);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1178);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1179);
						_la = _input.LA(1);
						if ( !(((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1180);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1181);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1183);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1182);
							match(NOT);
							}
						}

						setState(1185);
						match(BETWEEN);
						setState(1186);
						expression(0);
						setState(1187);
						match(AND);
						setState(1188);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1192);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1191);
							match(NOT);
							}
						}

						setState(1194);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1195);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1196);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1197);
						match(SIMILAR);
						setState(1198);
						match(TO);
						setState(1199);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1200);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1201);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1202);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1203);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1204);
						match(TYPECAST);
						setState(1205);
						dataType(0);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1206);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1207);
						_la = _input.LA(1);
						if ( !(((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1208);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1209);
						match(LPAREN);
						setState(1212);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SELECT:
						case WITH:
							{
							setState(1210);
							selectStmt();
							}
							break;
						case CASE:
						case EXISTS:
						case CAST:
						case COALESCE:
						case NULLIF:
						case GREATEST:
						case LEAST:
						case INTERVAL:
						case ARRAY:
						case NULL:
						case NOT:
						case TRUE:
						case FALSE:
						case LPAREN:
						case IntegerLiteral:
						case NumericLiteral:
						case StringLiteral:
						case DollarQuotedString:
						case Identifier:
						case QuotedIdentifier:
							{
							setState(1211);
							expressionList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1214);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1216);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1217);
						match(IS);
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1218);
							match(NOT);
							}
						}

						setState(1221);
						match(NULL);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1222);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1224);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1223);
							match(NOT);
							}
						}

						setState(1226);
						match(IN);
						setState(1227);
						match(LPAREN);
						setState(1230);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SELECT:
						case WITH:
							{
							setState(1228);
							selectStmt();
							}
							break;
						case CASE:
						case EXISTS:
						case CAST:
						case COALESCE:
						case NULLIF:
						case GREATEST:
						case LEAST:
						case INTERVAL:
						case ARRAY:
						case NULL:
						case NOT:
						case TRUE:
						case FALSE:
						case LPAREN:
						case IntegerLiteral:
						case NumericLiteral:
						case StringLiteral:
						case DollarQuotedString:
						case Identifier:
						case QuotedIdentifier:
							{
							setState(1229);
							expressionList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1232);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(1238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenExprClauseListContext extends ParserRuleContext {
		public List<WhenExprClauseContext> whenExprClause() {
			return getRuleContexts(WhenExprClauseContext.class);
		}
		public WhenExprClauseContext whenExprClause(int i) {
			return getRuleContext(WhenExprClauseContext.class,i);
		}
		public WhenExprClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExprClauseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhenExprClauseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhenExprClauseList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenExprClauseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExprClauseListContext whenExprClauseList() throws RecognitionException {
		WhenExprClauseListContext _localctx = new WhenExprClauseListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_whenExprClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1239);
				whenExprClause();
				}
				}
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenExprClauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(PlpgsqlParser.WHEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(PlpgsqlParser.THEN, 0); }
		public WhenExprClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExprClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWhenExprClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWhenExprClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenExprClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExprClauseContext whenExprClause() throws RecognitionException {
		WhenExprClauseContext _localctx = new WhenExprClauseContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_whenExprClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			match(WHEN);
			setState(1245);
			expression(0);
			setState(1246);
			match(THEN);
			setState(1247);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExpressionContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PlpgsqlParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(PlpgsqlParser.LBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(PlpgsqlParser.RBRACK, 0); }
		public VariableRefContext variableRef() {
			return getRuleContext(VariableRefContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_arrayExpression);
		try {
			setState(1259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1249);
				match(ARRAY);
				setState(1250);
				match(LBRACK);
				setState(1251);
				expressionList();
				setState(1252);
				match(RBRACK);
				}
				break;
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				variableRef();
				setState(1255);
				match(LBRACK);
				setState(1256);
				expression(0);
				setState(1257);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PlpgsqlParser.STAR, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1261);
			match(Identifier);
			setState(1262);
			match(LPAREN);
			setState(1265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case EXISTS:
			case CAST:
			case COALESCE:
			case NULLIF:
			case GREATEST:
			case LEAST:
			case INTERVAL:
			case ARRAY:
			case NULL:
			case NOT:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				{
				setState(1263);
				expressionList();
				}
				break;
			case STAR:
				{
				setState(1264);
				match(STAR);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1267);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PlpgsqlParser.IntegerLiteral, 0); }
		public TerminalNode NumericLiteral() { return getToken(PlpgsqlParser.NumericLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PlpgsqlParser.StringLiteral, 0); }
		public TerminalNode DollarQuotedString() { return getToken(PlpgsqlParser.DollarQuotedString, 0); }
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(PlpgsqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PlpgsqlParser.FALSE, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1269);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & -2305843009012367359L) != 0) || _la==DollarQuotedString) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 72:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dataType_sempred(DataTypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 22);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b8\u04f8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0001\u0000\u0003\u0000\u009e"+
		"\b\u0000\u0001\u0000\u0003\u0000\u00a1\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u00a6\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u00aa\b\u0000\u0001\u0000\u0003\u0000\u00ad\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0004\u0003\u00b7\b\u0003\u000b\u0003\f\u0003\u00b8\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00bd\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00c2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00c8\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d2\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00de\b\u0004"+
		"\u0001\u0004\u0003\u0004\u00e1\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00ec\b\u0005\u0001\u0005\u0003\u0005\u00ef\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00f6"+
		"\b\u0005\u0001\u0005\u0003\u0005\u00f9\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0101\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0107\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0110\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0116\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u011b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0128\b\u0005\u0003\u0005\u012a\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0130\b\u0005\u0005"+
		"\u0005\u0132\b\u0005\n\u0005\f\u0005\u0135\t\u0005\u0001\u0006\u0005\u0006"+
		"\u0138\b\u0006\n\u0006\f\u0006\u013b\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u0158\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0005\t\u0162\b\t\n\t\f\t\u0165\t\t\u0001\t"+
		"\u0001\t\u0001\t\u0005\t\u016a\b\t\n\t\f\t\u016d\t\t\u0003\t\u016f\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0175\b\n\u0001\n\u0001\n\u0003"+
		"\n\u0179\b\n\u0001\n\u0003\n\u017c\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0184\b\u000b\n\u000b\f\u000b"+
		"\u0187\t\u000b\u0003\u000b\u0189\b\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u018e\b\f\n\f\f\f\u0191\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u0196\b"+
		"\r\n\r\f\r\u0199\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u019d\b\u000e"+
		"\u0001\u000e\u0003\u000e\u01a0\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u01a5\b\u000e\u0001\u000e\u0003\u000e\u01a8\b\u000e\u0001"+
		"\u000e\u0003\u000e\u01ab\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u01b1\b\u000e\u0001\u000e\u0003\u000e\u01b4\b\u000e"+
		"\u0003\u000e\u01b6\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01bb\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01c6\b\u000f"+
		"\u0003\u000f\u01c8\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u01cd\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01d1\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u01d5\b\u0010\u0001\u0010\u0003\u0010\u01d8"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01e0\b\u0012\u0001\u0012\u0003\u0012\u01e3\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01eb\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ef\b"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01fa\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0205\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0210\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u0215\b\u0014\u0001\u0014\u0003\u0014\u0218\b\u0014"+
		"\u0001\u0014\u0003\u0014\u021b\b\u0014\u0001\u0014\u0003\u0014\u021e\b"+
		"\u0014\u0001\u0014\u0003\u0014\u0221\b\u0014\u0001\u0014\u0003\u0014\u0224"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u022b\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u022f\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0234\b\u0015\n\u0015"+
		"\f\u0015\u0237\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u023c\b\u0016\n\u0016\f\u0016\u023f\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0246\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u024d\b\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0254"+
		"\b\u0018\n\u0018\f\u0018\u0257\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0261\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u0268\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0277\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0282\b\u001c\n\u001c\f\u001c\u0285"+
		"\t\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0289\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0291\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0296\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004"+
		"\u001e\u029d\b\u001e\u000b\u001e\f\u001e\u029e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u02a7\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u02ae\b \u0001 \u0001 \u0001!\u0003!\u02b3"+
		"\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02bc\b!\u0001"+
		"!\u0001!\u0001\"\u0003\"\u02c1\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u02c7\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02cf"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02d6\b\"\u0001\""+
		"\u0001\"\u0001\"\u0003\"\u02db\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02e6\b\"\u0001\"\u0001\"\u0003"+
		"\"\u02ea\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02f1\b#\u0001"+
		"#\u0003#\u02f4\b#\u0001#\u0003#\u02f7\b#\u0001#\u0003#\u02fa\b#\u0001"+
		"#\u0003#\u02fd\b#\u0001#\u0003#\u0300\b#\u0001#\u0003#\u0303\b#\u0001"+
		"$\u0003$\u0306\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u030c\b$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0316\b$\u0001$\u0001"+
		"$\u0001%\u0001%\u0003%\u031c\b%\u0001%\u0001%\u0003%\u0320\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0003&\u0326\b&\u0001&\u0001&\u0003&\u032a\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0003\'\u0330\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u0343\b\'\u0001\'\u0001\'\u0003\'\u0347"+
		"\b\'\u0001(\u0001(\u0003(\u034b\b(\u0001(\u0001(\u0001(\u0003(\u0350\b"+
		"(\u0001(\u0003(\u0353\b(\u0001(\u0001(\u0003(\u0357\b(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0005)\u035e\b)\n)\f)\u0361\t)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0003+\u036b\b+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0003-\u0374\b-\u0001-\u0001-\u0001.\u0001.\u0003"+
		".\u037a\b.\u0001.\u0001.\u0003.\u037e\b.\u0001.\u0003.\u0381\b.\u0001"+
		".\u0001.\u0001/\u0003/\u0386\b/\u0001/\u0003/\u0389\b/\u0001/\u0003/\u038c"+
		"\b/\u0001/\u0001/\u0001/\u0003/\u0391\b/\u0001/\u0001/\u0003/\u0395\b"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00011\u00041\u039d\b1\u000b1\f1"+
		"\u039e\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00053"+
		"\u03a9\b3\n3\f3\u03ac\t3\u00014\u00014\u00014\u00034\u03b1\b4\u00015\u0001"+
		"5\u00035\u03b5\b5\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0005"+
		"6\u03be\b6\n6\f6\u03c1\t6\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00039\u03cf\b9\u00019\u00019\u0003"+
		"9\u03d3\b9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001<\u0003<\u03e2\b<\u0001<\u0001<\u0001<\u0003"+
		"<\u03e7\b<\u0001<\u0005<\u03ea\b<\n<\f<\u03ed\t<\u0001=\u0001=\u0001="+
		"\u0001>\u0001>\u0001>\u0005>\u03f5\b>\n>\f>\u03f8\t>\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u03ff\b?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u040d\b@\u0001@\u0003"+
		"@\u0410\b@\u0001@\u0001@\u0003@\u0414\b@\u0001@\u0003@\u0417\b@\u0001"+
		"@\u0003@\u041a\b@\u0001@\u0003@\u041d\b@\u0001@\u0003@\u0420\b@\u0001"+
		"@\u0003@\u0423\b@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0005C\u0431\bC\nC\fC\u0434\tC\u0001D\u0001"+
		"D\u0003D\u0438\bD\u0001D\u0001D\u0003D\u043c\bD\u0001E\u0001E\u0001E\u0003"+
		"E\u0441\bE\u0001E\u0001E\u0003E\u0445\bE\u0001F\u0001F\u0001F\u0005F\u044a"+
		"\bF\nF\fF\u044d\tF\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u0486\bH\u0001"+
		"H\u0001H\u0001H\u0003H\u048b\bH\u0001H\u0001H\u0001H\u0003H\u0490\bH\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0003H\u04a0\bH\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u04a9\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u04bd\bH\u0001H\u0001H\u0001H\u0001H\u0001H\u0003"+
		"H\u04c4\bH\u0001H\u0001H\u0001H\u0003H\u04c9\bH\u0001H\u0001H\u0001H\u0001"+
		"H\u0003H\u04cf\bH\u0001H\u0001H\u0005H\u04d3\bH\nH\fH\u04d6\tH\u0001I"+
		"\u0004I\u04d9\bI\u000bI\fI\u04da\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"+
		"K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003"+
		"K\u04ec\bK\u0001L\u0001L\u0001L\u0001L\u0003L\u04f2\bL\u0001L\u0001L\u0001"+
		"M\u0001M\u0001M\u0000\u0002\n\u0090N\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u0000\u0011\u0002\u0000\r\r"+
		"rr\u0001\u0000\u0090\u0091\u0002\u0000!!\u0095\u0095\u0002\u0000\u0004"+
		"\u0004cg\u0001\u0000hl\u0001\u0000>?\u0001\u0000op\u0001\u000002\u0001"+
		"\u0000)*\u0001\u0000,-\u0002\u0000\u008f\u008f\u009d\u009e\u0001\u0000"+
		"\u009b\u009c\u0001\u0000\u0095\u009a\u0001\u0000\u00a2\u00a3\u0001\u0000"+
		"uv\u0002\u0000##\u00a5\u00a6\u0003\u0000ss\u008d\u008e\u00b0\u00b3\u059e"+
		"\u0000\u009d\u0001\u0000\u0000\u0000\u0002\u00ae\u0001\u0000\u0000\u0000"+
		"\u0004\u00b2\u0001\u0000\u0000\u0000\u0006\u00b6\u0001\u0000\u0000\u0000"+
		"\b\u00e0\u0001\u0000\u0000\u0000\n\u0129\u0001\u0000\u0000\u0000\f\u0139"+
		"\u0001\u0000\u0000\u0000\u000e\u0157\u0001\u0000\u0000\u0000\u0010\u0159"+
		"\u0001\u0000\u0000\u0000\u0012\u016e\u0001\u0000\u0000\u0000\u0014\u0170"+
		"\u0001\u0000\u0000\u0000\u0016\u0188\u0001\u0000\u0000\u0000\u0018\u018a"+
		"\u0001\u0000\u0000\u0000\u001a\u0192\u0001\u0000\u0000\u0000\u001c\u01b5"+
		"\u0001\u0000\u0000\u0000\u001e\u01c7\u0001\u0000\u0000\u0000 \u01d7\u0001"+
		"\u0000\u0000\u0000\"\u01d9\u0001\u0000\u0000\u0000$\u01dc\u0001\u0000"+
		"\u0000\u0000&\u01e6\u0001\u0000\u0000\u0000(\u022e\u0001\u0000\u0000\u0000"+
		"*\u0230\u0001\u0000\u0000\u0000,\u0238\u0001\u0000\u0000\u0000.\u0240"+
		"\u0001\u0000\u0000\u00000\u0250\u0001\u0000\u0000\u00002\u0258\u0001\u0000"+
		"\u0000\u00004\u025c\u0001\u0000\u0000\u00006\u0276\u0001\u0000\u0000\u0000"+
		"8\u0278\u0001\u0000\u0000\u0000:\u028e\u0001\u0000\u0000\u0000<\u029c"+
		"\u0001\u0000\u0000\u0000>\u02a0\u0001\u0000\u0000\u0000@\u02a6\u0001\u0000"+
		"\u0000\u0000B\u02b2\u0001\u0000\u0000\u0000D\u02e9\u0001\u0000\u0000\u0000"+
		"F\u0302\u0001\u0000\u0000\u0000H\u0305\u0001\u0000\u0000\u0000J\u0319"+
		"\u0001\u0000\u0000\u0000L\u0323\u0001\u0000\u0000\u0000N\u0346\u0001\u0000"+
		"\u0000\u0000P\u0348\u0001\u0000\u0000\u0000R\u035a\u0001\u0000\u0000\u0000"+
		"T\u0362\u0001\u0000\u0000\u0000V\u0366\u0001\u0000\u0000\u0000X\u036e"+
		"\u0001\u0000\u0000\u0000Z\u0371\u0001\u0000\u0000\u0000\\\u0377\u0001"+
		"\u0000\u0000\u0000^\u0385\u0001\u0000\u0000\u0000`\u0398\u0001\u0000\u0000"+
		"\u0000b\u039c\u0001\u0000\u0000\u0000d\u03a0\u0001\u0000\u0000\u0000f"+
		"\u03a5\u0001\u0000\u0000\u0000h\u03b0\u0001\u0000\u0000\u0000j\u03b2\u0001"+
		"\u0000\u0000\u0000l\u03ba\u0001\u0000\u0000\u0000n\u03c2\u0001\u0000\u0000"+
		"\u0000p\u03c6\u0001\u0000\u0000\u0000r\u03c8\u0001\u0000\u0000\u0000t"+
		"\u03d6\u0001\u0000\u0000\u0000v\u03da\u0001\u0000\u0000\u0000x\u03e1\u0001"+
		"\u0000\u0000\u0000z\u03ee\u0001\u0000\u0000\u0000|\u03f1\u0001\u0000\u0000"+
		"\u0000~\u03f9\u0001\u0000\u0000\u0000\u0080\u0405\u0001\u0000\u0000\u0000"+
		"\u0082\u0424\u0001\u0000\u0000\u0000\u0084\u0428\u0001\u0000\u0000\u0000"+
		"\u0086\u042b\u0001\u0000\u0000\u0000\u0088\u0435\u0001\u0000\u0000\u0000"+
		"\u008a\u043d\u0001\u0000\u0000\u0000\u008c\u0446\u0001\u0000\u0000\u0000"+
		"\u008e\u044e\u0001\u0000\u0000\u0000\u0090\u048f\u0001\u0000\u0000\u0000"+
		"\u0092\u04d8\u0001\u0000\u0000\u0000\u0094\u04dc\u0001\u0000\u0000\u0000"+
		"\u0096\u04eb\u0001\u0000\u0000\u0000\u0098\u04ed\u0001\u0000\u0000\u0000"+
		"\u009a\u04f5\u0001\u0000\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u00a1\u0003\u0004\u0002\u0000"+
		"\u00a0\u009f\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0002\u0000\u0000"+
		"\u00a3\u00a5\u0003\f\u0006\u0000\u00a4\u00a6\u0003`0\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0003\u0000\u0000\u00a8\u00aa"+
		"\u0003\u0002\u0001\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0005\u00a7\u0000\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u0001\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0005\u00ae\u0000\u0000\u00af\u00b0\u0005\u00b4\u0000\u0000\u00b0\u00b1"+
		"\u0005\u00af\u0000\u0000\u00b1\u0003\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0001\u0000\u0000\u00b3\u00b4\u0003\u0006\u0003\u0000\u00b4\u0005"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\b\u0004\u0000\u00b6\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0007\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bc\u0005\u00b4\u0000\u0000\u00bb\u00bd\u0005"+
		"w\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\n\u0005"+
		"\u0000\u00bf\u00c0\u0005t\u0000\u0000\u00c0\u00c2\u0005s\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0093\u0000\u0000\u00c4"+
		"\u00c8\u0003\u0090H\u0000\u00c5\u00c6\u0005x\u0000\u0000\u00c6\u00c8\u0003"+
		"\u0090H\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0005\u00a7\u0000\u0000\u00ca\u00e1\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005\u00b4\u0000\u0000\u00cc\u00d1\u0005\u008b"+
		"\u0000\u0000\u00cd\u00ce\u0005\u00aa\u0000\u0000\u00ce\u00cf\u0003\u008c"+
		"F\u0000\u00cf\u00d0\u0005\u00ab\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0003x<\u0000\u00d5\u00d6\u0005\u00a7\u0000\u0000\u00d6"+
		"\u00e1\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u00b4\u0000\u0000\u00d8"+
		"\u00d9\u0005\u008c\u0000\u0000\u00d9\u00dd\u0005\r\u0000\u0000\u00da\u00de"+
		"\u0005\u00b4\u0000\u0000\u00db\u00dc\u0005\u0092\u0000\u0000\u00dc\u00de"+
		"\u0005\u00b0\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0005\u00a7\u0000\u0000\u00e0\u00ba\u0001\u0000\u0000\u0000\u00e0\u00cb"+
		"\u0001\u0000\u0000\u0000\u00e0\u00d7\u0001\u0000\u0000\u0000\u00e1\t\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0006\u0005\uffff\uffff\u0000\u00e3\u012a"+
		"\u0005@\u0000\u0000\u00e4\u012a\u0005A\u0000\u0000\u00e5\u012a\u0005B"+
		"\u0000\u0000\u00e6\u00ee\u0005C\u0000\u0000\u00e7\u00e8\u0005\u00aa\u0000"+
		"\u0000\u00e8\u00eb\u0005\u00b0\u0000\u0000\u00e9\u00ea\u0005\u00a8\u0000"+
		"\u0000\u00ea\u00ec\u0005\u00b0\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ef\u0005\u00ab\u0000\u0000\u00ee\u00e7\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u012a\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f8\u0005D\u0000\u0000\u00f1\u00f2\u0005\u00aa\u0000\u0000"+
		"\u00f2\u00f5\u0005\u00b0\u0000\u0000\u00f3\u00f4\u0005\u00a8\u0000\u0000"+
		"\u00f4\u00f6\u0005\u00b0\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0005\u00ab\u0000\u0000\u00f8\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u012a\u0001\u0000\u0000\u0000"+
		"\u00fa\u012a\u0005E\u0000\u0000\u00fb\u012a\u0005F\u0000\u0000\u00fc\u0100"+
		"\u0005G\u0000\u0000\u00fd\u00fe\u0005\u00aa\u0000\u0000\u00fe\u00ff\u0005"+
		"\u00b0\u0000\u0000\u00ff\u0101\u0005\u00ab\u0000\u0000\u0100\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u012a\u0001"+
		"\u0000\u0000\u0000\u0102\u0106\u0005H\u0000\u0000\u0103\u0104\u0005\u00aa"+
		"\u0000\u0000\u0104\u0105\u0005\u00b0\u0000\u0000\u0105\u0107\u0005\u00ab"+
		"\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u012a\u0001\u0000\u0000\u0000\u0108\u012a\u0005I\u0000"+
		"\u0000\u0109\u012a\u0005J\u0000\u0000\u010a\u012a\u0005K\u0000\u0000\u010b"+
		"\u010f\u0005L\u0000\u0000\u010c\u010d\u0005\u00aa\u0000\u0000\u010d\u010e"+
		"\u0005\u00b0\u0000\u0000\u010e\u0110\u0005\u00ab\u0000\u0000\u010f\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u012a"+
		"\u0001\u0000\u0000\u0000\u0111\u0115\u0005M\u0000\u0000\u0112\u0113\u0005"+
		"\u00aa\u0000\u0000\u0113\u0114\u0005\u00b0\u0000\u0000\u0114\u0116\u0005"+
		"\u00ab\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u011a\u0001\u0000\u0000\u0000\u0117\u0118\u0005"+
		".\u0000\u0000\u0118\u0119\u0005\u00b4\u0000\u0000\u0119\u011b\u0005{\u0000"+
		"\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u012a\u0001\u0000\u0000\u0000\u011c\u012a\u0005N\u0000\u0000"+
		"\u011d\u012a\u0005O\u0000\u0000\u011e\u012a\u0005P\u0000\u0000\u011f\u012a"+
		"\u0005Q\u0000\u0000\u0120\u012a\u0005R\u0000\u0000\u0121\u012a\u0005S"+
		"\u0000\u0000\u0122\u012a\u0005T\u0000\u0000\u0123\u012a\u0005U\u0000\u0000"+
		"\u0124\u0127\u0005\u00b4\u0000\u0000\u0125\u0126\u0005\u008f\u0000\u0000"+
		"\u0126\u0128\u0007\u0001\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u00e2\u0001\u0000\u0000\u0000\u0129\u00e4\u0001\u0000\u0000\u0000"+
		"\u0129\u00e5\u0001\u0000\u0000\u0000\u0129\u00e6\u0001\u0000\u0000\u0000"+
		"\u0129\u00f0\u0001\u0000\u0000\u0000\u0129\u00fa\u0001\u0000\u0000\u0000"+
		"\u0129\u00fb\u0001\u0000\u0000\u0000\u0129\u00fc\u0001\u0000\u0000\u0000"+
		"\u0129\u0102\u0001\u0000\u0000\u0000\u0129\u0108\u0001\u0000\u0000\u0000"+
		"\u0129\u0109\u0001\u0000\u0000\u0000\u0129\u010a\u0001\u0000\u0000\u0000"+
		"\u0129\u010b\u0001\u0000\u0000\u0000\u0129\u0111\u0001\u0000\u0000\u0000"+
		"\u0129\u011c\u0001\u0000\u0000\u0000\u0129\u011d\u0001\u0000\u0000\u0000"+
		"\u0129\u011e\u0001\u0000\u0000\u0000\u0129\u011f\u0001\u0000\u0000\u0000"+
		"\u0129\u0120\u0001\u0000\u0000\u0000\u0129\u0121\u0001\u0000\u0000\u0000"+
		"\u0129\u0122\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000"+
		"\u0129\u0124\u0001\u0000\u0000\u0000\u012a\u0133\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\n\u0001\u0000\u0000\u012c\u012f\u0005Y\u0000\u0000\u012d"+
		"\u012e\u0005\u00ac\u0000\u0000\u012e\u0130\u0005\u00ad\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u000b\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0138\u0003\u000e\u0007\u0000\u0137"+
		"\u0136\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139"+
		"\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a"+
		"\r\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0158"+
		"\u0003\u0010\b\u0000\u013d\u0158\u0003\u0014\n\u0000\u013e\u0158\u0003"+
		"$\u0012\u0000\u013f\u0158\u0003&\u0013\u0000\u0140\u0158\u0003(\u0014"+
		"\u0000\u0141\u0158\u0003.\u0017\u0000\u0142\u0158\u00034\u001a\u0000\u0143"+
		"\u0158\u00036\u001b\u0000\u0144\u0158\u00038\u001c\u0000\u0145\u0158\u0003"+
		":\u001d\u0000\u0146\u0158\u0003@ \u0000\u0147\u0158\u0003B!\u0000\u0148"+
		"\u0158\u0003D\"\u0000\u0149\u0158\u0003H$\u0000\u014a\u0158\u0003J%\u0000"+
		"\u014b\u0158\u0003L&\u0000\u014c\u0158\u0003N\'\u0000\u014d\u0158\u0003"+
		"P(\u0000\u014e\u0158\u0003V+\u0000\u014f\u0158\u0003X,\u0000\u0150\u0158"+
		"\u0003^/\u0000\u0151\u0158\u0003j5\u0000\u0152\u0158\u0003r9\u0000\u0153"+
		"\u0158\u0003t:\u0000\u0154\u0158\u0003v;\u0000\u0155\u0158\u0003Z-\u0000"+
		"\u0156\u0158\u0003\\.\u0000\u0157\u013c\u0001\u0000\u0000\u0000\u0157"+
		"\u013d\u0001\u0000\u0000\u0000\u0157\u013e\u0001\u0000\u0000\u0000\u0157"+
		"\u013f\u0001\u0000\u0000\u0000\u0157\u0140\u0001\u0000\u0000\u0000\u0157"+
		"\u0141\u0001\u0000\u0000\u0000\u0157\u0142\u0001\u0000\u0000\u0000\u0157"+
		"\u0143\u0001\u0000\u0000\u0000\u0157\u0144\u0001\u0000\u0000\u0000\u0157"+
		"\u0145\u0001\u0000\u0000\u0000\u0157\u0146\u0001\u0000\u0000\u0000\u0157"+
		"\u0147\u0001\u0000\u0000\u0000\u0157\u0148\u0001\u0000\u0000\u0000\u0157"+
		"\u0149\u0001\u0000\u0000\u0000\u0157\u014a\u0001\u0000\u0000\u0000\u0157"+
		"\u014b\u0001\u0000\u0000\u0000\u0157\u014c\u0001\u0000\u0000\u0000\u0157"+
		"\u014d\u0001\u0000\u0000\u0000\u0157\u014e\u0001\u0000\u0000\u0000\u0157"+
		"\u014f\u0001\u0000\u0000\u0000\u0157\u0150\u0001\u0000\u0000\u0000\u0157"+
		"\u0151\u0001\u0000\u0000\u0000\u0157\u0152\u0001\u0000\u0000\u0000\u0157"+
		"\u0153\u0001\u0000\u0000\u0000\u0157\u0154\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u000f\u0001\u0000\u0000\u0000\u0159\u015a\u0003\u0012\t\u0000\u015a\u015b"+
		"\u0005\u0093\u0000\u0000\u015b\u015c\u0003\u0090H\u0000\u015c\u015d\u0005"+
		"\u00a7\u0000\u0000\u015d\u0011\u0001\u0000\u0000\u0000\u015e\u0163\u0005"+
		"\u00b4\u0000\u0000\u015f\u0160\u0005\u00a9\u0000\u0000\u0160\u0162\u0005"+
		"\u00b4\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001"+
		"\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u016f\u0001\u0000\u0000\u0000\u0165\u0163\u0001"+
		"\u0000\u0000\u0000\u0166\u016b\u0005\u00b5\u0000\u0000\u0167\u0168\u0005"+
		"\u00a9\u0000\u0000\u0168\u016a\u0005\u00b5\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016f\u0001"+
		"\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u015e\u0001"+
		"\u0000\u0000\u0000\u016e\u0166\u0001\u0000\u0000\u0000\u016f\u0013\u0001"+
		"\u0000\u0000\u0000\u0170\u0171\u0005\u0015\u0000\u0000\u0171\u0172\u0003"+
		"\u0016\u000b\u0000\u0172\u0174\u0005\u001b\u0000\u0000\u0173\u0175\u0005"+
		"z\u0000\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0178\u0003\u0018"+
		"\f\u0000\u0177\u0179\u0003\u001a\r\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017b\u0001\u0000\u0000"+
		"\u0000\u017a\u017c\u0003\"\u0011\u0000\u017b\u017a\u0001\u0000\u0000\u0000"+
		"\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0005\u00a7\u0000\u0000\u017e\u0015\u0001\u0000\u0000\u0000"+
		"\u017f\u0189\u0005\u009d\u0000\u0000\u0180\u0185\u0003\u0090H\u0000\u0181"+
		"\u0182\u0005\u00a8\u0000\u0000\u0182\u0184\u0003\u0090H\u0000\u0183\u0181"+
		"\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0189"+
		"\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u017f"+
		"\u0001\u0000\u0000\u0000\u0188\u0180\u0001\u0000\u0000\u0000\u0189\u0017"+
		"\u0001\u0000\u0000\u0000\u018a\u018f\u0003\u0012\t\u0000\u018b\u018c\u0005"+
		"\u00a8\u0000\u0000\u018c\u018e\u0003\u0012\t\u0000\u018d\u018b\u0001\u0000"+
		"\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0019\u0001\u0000"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u001c"+
		"\u0000\u0000\u0193\u0197\u0003\u001c\u000e\u0000\u0194\u0196\u0003\u001e"+
		"\u000f\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000"+
		"\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000"+
		"\u0000\u0000\u0198\u001b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u019a\u019f\u0005\u00b4\u0000\u0000\u019b\u019d\u0005q\u0000"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0005\u00b4\u0000"+
		"\u0000\u019f\u019c\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a0\u01b6\u0001\u0000\u0000\u0000\u01a1\u01a4\u0003\u0098L\u0000"+
		"\u01a2\u01a3\u0005.\u0000\u0000\u01a3\u01a5\u0005\u00b4\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01aa\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005q\u0000\u0000\u01a7\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01ab\u0005\u00b4\u0000\u0000\u01aa\u01a7"+
		"\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01b6"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u00aa\u0000\u0000\u01ad\u01ae"+
		"\u0003x<\u0000\u01ae\u01b3\u0005\u00ab\u0000\u0000\u01af\u01b1\u0005q"+
		"\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0005\u00b4"+
		"\u0000\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u019a\u0001\u0000"+
		"\u0000\u0000\u01b5\u01a1\u0001\u0000\u0000\u0000\u01b5\u01ac\u0001\u0000"+
		"\u0000\u0000\u01b6\u001d\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u00a8"+
		"\u0000\u0000\u01b8\u01c8\u0003\u001c\u000e\u0000\u01b9\u01bb\u0003 \u0010"+
		"\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005[\u0000\u0000"+
		"\u01bd\u01c5\u0003\u001c\u000e\u0000\u01be\u01bf\u0005b\u0000\u0000\u01bf"+
		"\u01c6\u0003\u0090H\u0000\u01c0\u01c1\u0005y\u0000\u0000\u01c1\u01c2\u0005"+
		"\u00aa\u0000\u0000\u01c2\u01c3\u0003*\u0015\u0000\u01c3\u01c4\u0005\u00ab"+
		"\u0000\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01be\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c0\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01b7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ba\u0001\u0000\u0000\u0000\u01c8\u001f\u0001\u0000"+
		"\u0000\u0000\u01c9\u01d8\u0005^\u0000\u0000\u01ca\u01cc\u0005\\\u0000"+
		"\u0000\u01cb\u01cd\u0005_\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01d8\u0001\u0000\u0000\u0000"+
		"\u01ce\u01d0\u0005]\u0000\u0000\u01cf\u01d1\u0005_\u0000\u0000\u01d0\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d4\u0005`\u0000\u0000\u01d3\u01d5\u0005"+
		"_\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d8\u0005a\u0000"+
		"\u0000\u01d7\u01c9\u0001\u0000\u0000\u0000\u01d7\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d7\u01ce\u0001\u0000\u0000\u0000\u01d7\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d8!\u0001\u0000\u0000\u0000"+
		"\u01d9\u01da\u0005\u001d\u0000\u0000\u01da\u01db\u0003\u0090H\u0000\u01db"+
		"#\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005\u0019\u0000\u0000\u01dd\u01df"+
		"\u0003\u0016\u000b\u0000\u01de\u01e0\u0003\u001a\r\u0000\u01df\u01de\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e3\u0003\"\u0011\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0005\u00a7\u0000\u0000\u01e5%\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e7\u0005\u001a\u0000\u0000\u01e7\u01ea\u0003\u0090H\u0000"+
		"\u01e8\u01e9\u0005\u001b\u0000\u0000\u01e9\u01eb\u0003\u0018\f\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005y\u0000\u0000\u01ed\u01ef"+
		"\u0003,\u0016\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005"+
		"\u00a7\u0000\u0000\u01f1\'\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005\u0016"+
		"\u0000\u0000\u01f3\u01f4\u0005\u001b\u0000\u0000\u01f4\u01f9\u0005\u00b4"+
		"\u0000\u0000\u01f5\u01f6\u0005\u00aa\u0000\u0000\u01f6\u01f7\u0003*\u0015"+
		"\u0000\u01f7\u01f8\u0005\u00ab\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f5\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005\u001f\u0000"+
		"\u0000\u01fc\u01fd\u0005\u00aa\u0000\u0000\u01fd\u01fe\u0003,\u0016\u0000"+
		"\u01fe\u0204\u0005\u00ab\u0000\u0000\u01ff\u0200\u0005 \u0000\u0000\u0200"+
		"\u0201\u0003,\u0016\u0000\u0201\u0202\u0005\u001b\u0000\u0000\u0202\u0203"+
		"\u0003\u0018\f\u0000\u0203\u0205\u0001\u0000\u0000\u0000\u0204\u01ff\u0001"+
		"\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0001"+
		"\u0000\u0000\u0000\u0206\u0207\u0005\u00a7\u0000\u0000\u0207\u022f\u0001"+
		"\u0000\u0000\u0000\u0208\u0209\u0005\u0016\u0000\u0000\u0209\u020a\u0005"+
		"\u001b\u0000\u0000\u020a\u020f\u0005\u00b4\u0000\u0000\u020b\u020c\u0005"+
		"\u00aa\u0000\u0000\u020c\u020d\u0003*\u0015\u0000\u020d\u020e\u0005\u00ab"+
		"\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u020b\u0001\u0000"+
		"\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u0212\u0005\u0015\u0000\u0000\u0212\u0214\u0003\u0016"+
		"\u000b\u0000\u0213\u0215\u0003\u001a\r\u0000\u0214\u0213\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0217\u0001\u0000\u0000"+
		"\u0000\u0216\u0218\u0003\"\u0011\u0000\u0217\u0216\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000\u0000"+
		"\u0219\u021b\u0003\u0082A\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0001\u0000\u0000\u0000\u021b\u021d\u0001\u0000\u0000\u0000\u021c"+
		"\u021e\u0003\u0084B\u0000\u021d\u021c\u0001\u0000\u0000\u0000\u021d\u021e"+
		"\u0001\u0000\u0000\u0000\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u0221"+
		"\u0003\u0086C\u0000\u0220\u021f\u0001\u0000\u0000\u0000\u0220\u0221\u0001"+
		"\u0000\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u0224\u0003"+
		"\u008aE\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000"+
		"\u0000\u0000\u0224\u022a\u0001\u0000\u0000\u0000\u0225\u0226\u0005 \u0000"+
		"\u0000\u0226\u0227\u0003,\u0016\u0000\u0227\u0228\u0005\u001b\u0000\u0000"+
		"\u0228\u0229\u0003\u0018\f\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a"+
		"\u0225\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005\u00a7\u0000\u0000\u022d"+
		"\u022f\u0001\u0000\u0000\u0000\u022e\u01f2\u0001\u0000\u0000\u0000\u022e"+
		"\u0208\u0001\u0000\u0000\u0000\u022f)\u0001\u0000\u0000\u0000\u0230\u0235"+
		"\u0005\u00b4\u0000\u0000\u0231\u0232\u0005\u00a8\u0000\u0000\u0232\u0234"+
		"\u0005\u00b4\u0000\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237"+
		"\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236+\u0001\u0000\u0000\u0000\u0237\u0235\u0001"+
		"\u0000\u0000\u0000\u0238\u023d\u0003\u0090H\u0000\u0239\u023a\u0005\u00a8"+
		"\u0000\u0000\u023a\u023c\u0003\u0090H\u0000\u023b\u0239\u0001\u0000\u0000"+
		"\u0000\u023c\u023f\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e-\u0001\u0000\u0000\u0000"+
		"\u023f\u023d\u0001\u0000\u0000\u0000\u0240\u0241\u0005\u0017\u0000\u0000"+
		"\u0241\u0242\u0005\u00b4\u0000\u0000\u0242\u0243\u0005\u001e\u0000\u0000"+
		"\u0243\u0245\u00030\u0018\u0000\u0244\u0246\u0003\"\u0011\u0000\u0245"+
		"\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u024c\u0001\u0000\u0000\u0000\u0247\u0248\u0005 \u0000\u0000\u0248\u0249"+
		"\u0003,\u0016\u0000\u0249\u024a\u0005\u001b\u0000\u0000\u024a\u024b\u0003"+
		"\u0018\f\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u0247\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0005\u00a7\u0000\u0000\u024f/\u0001\u0000\u0000"+
		"\u0000\u0250\u0255\u00032\u0019\u0000\u0251\u0252\u0005\u00a8\u0000\u0000"+
		"\u0252\u0254\u00032\u0019\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0254"+
		"\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0001\u0000\u0000\u0000\u02561\u0001\u0000\u0000\u0000\u0257\u0255"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0005\u00b4\u0000\u0000\u0259\u025a"+
		"\u0005\u0095\u0000\u0000\u025a\u025b\u0003\u0090H\u0000\u025b3\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0005\u0018\u0000\u0000\u025d\u025e\u0005\u001c"+
		"\u0000\u0000\u025e\u0260\u0005\u00b4\u0000\u0000\u025f\u0261\u0003\"\u0011"+
		"\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0267\u0001\u0000\u0000\u0000\u0262\u0263\u0005 \u0000\u0000"+
		"\u0263\u0264\u0003,\u0016\u0000\u0264\u0265\u0005\u001b\u0000\u0000\u0265"+
		"\u0266\u0003\u0018\f\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0262"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0005\u00a7\u0000\u0000\u026a5\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0005\u001e\u0000\u0000\u026c\u026d\u0005"+
		"\u00b4\u0000\u0000\u026d\u026e\u0007\u0002\u0000\u0000\u026e\u026f\u0003"+
		"\u0090H\u0000\u026f\u0270\u0005\u00a7\u0000\u0000\u0270\u0277\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0005\u001e\u0000\u0000\u0272\u0273\u0005\u00b4"+
		"\u0000\u0000\u0273\u0274\u0005\u001c\u0000\u0000\u0274\u0275\u0005p\u0000"+
		"\u0000\u0275\u0277\u0005\u00a7\u0000\u0000\u0276\u026b\u0001\u0000\u0000"+
		"\u0000\u0276\u0271\u0001\u0000\u0000\u0000\u02777\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0005\u0005\u0000\u0000\u0279\u027a\u0003\u0090H\u0000\u027a"+
		"\u027b\u0005\u0006\u0000\u0000\u027b\u0283\u0003\f\u0006\u0000\u027c\u027d"+
		"\u0005\u0007\u0000\u0000\u027d\u027e\u0003\u0090H\u0000\u027e\u027f\u0005"+
		"\u0006\u0000\u0000\u027f\u0280\u0003\f\u0006\u0000\u0280\u0282\u0001\u0000"+
		"\u0000\u0000\u0281\u027c\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000"+
		"\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u0288\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0005\b\u0000\u0000\u0287\u0289\u0003\f\u0006"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028b\u0005\u0003\u0000"+
		"\u0000\u028b\u028c\u0005\u0005\u0000\u0000\u028c\u028d\u0005\u00a7\u0000"+
		"\u0000\u028d9\u0001\u0000\u0000\u0000\u028e\u0290\u0005\t\u0000\u0000"+
		"\u028f\u0291\u0003\u0090H\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0001\u0000\u0000\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292"+
		"\u0295\u0003<\u001e\u0000\u0293\u0294\u0005\b\u0000\u0000\u0294\u0296"+
		"\u0003\f\u0006\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		"\u0003\u0000\u0000\u0298\u0299\u0005\t\u0000\u0000\u0299\u029a\u0005\u00a7"+
		"\u0000\u0000\u029a;\u0001\u0000\u0000\u0000\u029b\u029d\u0003>\u001f\u0000"+
		"\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000"+
		"\u029f=\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005\n\u0000\u0000\u02a1"+
		"\u02a2\u0003\u0090H\u0000\u02a2\u02a3\u0005\u0006\u0000\u0000\u02a3\u02a4"+
		"\u0003\f\u0006\u0000\u02a4?\u0001\u0000\u0000\u0000\u02a5\u02a7\u0003"+
		"\u0002\u0001\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005"+
		"\u000b\u0000\u0000\u02a9\u02aa\u0003\f\u0006\u0000\u02aa\u02ab\u0005\u0003"+
		"\u0000\u0000\u02ab\u02ad\u0005\u000b\u0000\u0000\u02ac\u02ae\u0003\u0002"+
		"\u0001\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ad\u02ae\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b0\u0005\u00a7"+
		"\u0000\u0000\u02b0A\u0001\u0000\u0000\u0000\u02b1\u02b3\u0003\u0002\u0001"+
		"\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b5\u0005\f\u0000\u0000"+
		"\u02b5\u02b6\u0003\u0090H\u0000\u02b6\u02b7\u0005\u000b\u0000\u0000\u02b7"+
		"\u02b8\u0003\f\u0006\u0000\u02b8\u02b9\u0005\u0003\u0000\u0000\u02b9\u02bb"+
		"\u0005\u000b\u0000\u0000\u02ba\u02bc\u0003\u0002\u0001\u0000\u02bb\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bd\u02be\u0005\u00a7\u0000\u0000\u02beC\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c1\u0003\u0002\u0001\u0000\u02c0\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0005\r\u0000\u0000\u02c3\u02c4\u0005\u00b4"+
		"\u0000\u0000\u02c4\u02c6\u0005V\u0000\u0000\u02c5\u02c7\u0005W\u0000\u0000"+
		"\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0003\u0090H\u0000\u02c9"+
		"\u02ca\u0005\u00a9\u0000\u0000\u02ca\u02cb\u0005\u00a9\u0000\u0000\u02cb"+
		"\u02ce\u0003\u0090H\u0000\u02cc\u02cd\u0005X\u0000\u0000\u02cd\u02cf\u0003"+
		"\u0090H\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cf\u0001\u0000"+
		"\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0\u02d1\u0005\u000b"+
		"\u0000\u0000\u02d1\u02d2\u0003\f\u0006\u0000\u02d2\u02d3\u0005\u0003\u0000"+
		"\u0000\u02d3\u02d5\u0005\u000b\u0000\u0000\u02d4\u02d6\u0003\u0002\u0001"+
		"\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7\u02d8\u0005\u00a7\u0000"+
		"\u0000\u02d8\u02ea\u0001\u0000\u0000\u0000\u02d9\u02db\u0003\u0002\u0001"+
		"\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000"+
		"\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\r\u0000\u0000"+
		"\u02dd\u02de\u0005\u00b4\u0000\u0000\u02de\u02df\u0005V\u0000\u0000\u02df"+
		"\u02e0\u0003F#\u0000\u02e0\u02e1\u0005\u000b\u0000\u0000\u02e1\u02e2\u0003"+
		"\f\u0006\u0000\u02e2\u02e3\u0005\u0003\u0000\u0000\u02e3\u02e5\u0005\u000b"+
		"\u0000\u0000\u02e4\u02e6\u0003\u0002\u0001\u0000\u02e5\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0005\u00a7\u0000\u0000\u02e8\u02ea\u0001\u0000"+
		"\u0000\u0000\u02e9\u02c0\u0001\u0000\u0000\u0000\u02e9\u02da\u0001\u0000"+
		"\u0000\u0000\u02eaE\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005\u001a\u0000"+
		"\u0000\u02ec\u0303\u0003\u0090H\u0000\u02ed\u02ee\u0005\u0015\u0000\u0000"+
		"\u02ee\u02f0\u0003\u0016\u000b\u0000\u02ef\u02f1\u0003\u001a\r\u0000\u02f0"+
		"\u02ef\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f2\u02f4\u0003\"\u0011\u0000\u02f3\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f7\u0003\u0082A\u0000\u02f6\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f8\u02fa\u0003\u0084B\u0000\u02f9\u02f8\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fd\u0003\u0086C\u0000\u02fc\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fe\u0300\u0003\u008aE\u0000\u02ff\u02fe\u0001\u0000\u0000\u0000"+
		"\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000"+
		"\u0301\u0303\u0003\u0090H\u0000\u0302\u02eb\u0001\u0000\u0000\u0000\u0302"+
		"\u02ed\u0001\u0000\u0000\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303"+
		"G\u0001\u0000\u0000\u0000\u0304\u0306\u0003\u0002\u0001\u0000\u0305\u0304"+
		"\u0001\u0000\u0000\u0000\u0305\u0306\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0001\u0000\u0000\u0000\u0307\u0308\u0005\u000e\u0000\u0000\u0308\u030b"+
		"\u0005\u00b4\u0000\u0000\u0309\u030a\u0005Z\u0000\u0000\u030a\u030c\u0005"+
		"\u00b0\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005"+
		"V\u0000\u0000\u030e\u030f\u0005Y\u0000\u0000\u030f\u0310\u0003\u0090H"+
		"\u0000\u0310\u0311\u0005\u000b\u0000\u0000\u0311\u0312\u0003\f\u0006\u0000"+
		"\u0312\u0313\u0005\u0003\u0000\u0000\u0313\u0315\u0005\u000b\u0000\u0000"+
		"\u0314\u0316\u0003\u0002\u0001\u0000\u0315\u0314\u0001\u0000\u0000\u0000"+
		"\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0005\u00a7\u0000\u0000\u0318I\u0001\u0000\u0000\u0000\u0319"+
		"\u031b\u0005\u000f\u0000\u0000\u031a\u031c\u0005\u00b4\u0000\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031f\u0001\u0000\u0000\u0000\u031d\u031e\u0005\n\u0000\u0000\u031e\u0320"+
		"\u0003\u0090H\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001"+
		"\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005"+
		"\u00a7\u0000\u0000\u0322K\u0001\u0000\u0000\u0000\u0323\u0325\u0005\u0010"+
		"\u0000\u0000\u0324\u0326\u0005\u00b4\u0000\u0000\u0325\u0324\u0001\u0000"+
		"\u0000\u0000\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0329\u0001\u0000"+
		"\u0000\u0000\u0327\u0328\u0005\n\u0000\u0000\u0328\u032a\u0003\u0090H"+
		"\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000"+
		"\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032c\u0005\u00a7\u0000"+
		"\u0000\u032cM\u0001\u0000\u0000\u0000\u032d\u032f\u0005\u0011\u0000\u0000"+
		"\u032e\u0330\u0003\u0090H\u0000\u032f\u032e\u0001\u0000\u0000\u0000\u032f"+
		"\u0330\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331"+
		"\u0347\u0005\u00a7\u0000\u0000\u0332\u0333\u0005\u0011\u0000\u0000\u0333"+
		"\u0334\u0005\u0013\u0000\u0000\u0334\u0335\u0003\u0090H\u0000\u0335\u0336"+
		"\u0005\u00a7\u0000\u0000\u0336\u0347\u0001\u0000\u0000\u0000\u0337\u0338"+
		"\u0005\u0011\u0000\u0000\u0338\u0339\u0005\u0014\u0000\u0000\u0339\u033a"+
		"\u0003x<\u0000\u033a\u033b\u0005\u00a7\u0000\u0000\u033b\u0347\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0005\u0011\u0000\u0000\u033d\u033e\u0005\u0014"+
		"\u0000\u0000\u033e\u033f\u0005\u001a\u0000\u0000\u033f\u0342\u0003\u0090"+
		"H\u0000\u0340\u0341\u0005y\u0000\u0000\u0341\u0343\u0003,\u0016\u0000"+
		"\u0342\u0340\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000"+
		"\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345\u0005\u00a7\u0000\u0000"+
		"\u0345\u0347\u0001\u0000\u0000\u0000\u0346\u032d\u0001\u0000\u0000\u0000"+
		"\u0346\u0332\u0001\u0000\u0000\u0000\u0346\u0337\u0001\u0000\u0000\u0000"+
		"\u0346\u033c\u0001\u0000\u0000\u0000\u0347O\u0001\u0000\u0000\u0000\u0348"+
		"\u034a\u0005\u0012\u0000\u0000\u0349\u034b\u0007\u0003\u0000\u0000\u034a"+
		"\u0349\u0001\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b"+
		"\u0352\u0001\u0000\u0000\u0000\u034c\u034f\u0005\u00b2\u0000\u0000\u034d"+
		"\u034e\u0005\u00a8\u0000\u0000\u034e\u0350\u0003,\u0016\u0000\u034f\u034d"+
		"\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0353"+
		"\u0001\u0000\u0000\u0000\u0351\u0353\u0005\u00b4\u0000\u0000\u0352\u034c"+
		"\u0001\u0000\u0000\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0352\u0353"+
		"\u0001\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0355"+
		"\u0005y\u0000\u0000\u0355\u0357\u0003R)\u0000\u0356\u0354\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000"+
		"\u0000\u0000\u0358\u0359\u0005\u00a7\u0000\u0000\u0359Q\u0001\u0000\u0000"+
		"\u0000\u035a\u035f\u0003T*\u0000\u035b\u035c\u0005\u00a8\u0000\u0000\u035c"+
		"\u035e\u0003T*\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035e\u0361\u0001"+
		"\u0000\u0000\u0000\u035f\u035d\u0001\u0000\u0000\u0000\u035f\u0360\u0001"+
		"\u0000\u0000\u0000\u0360S\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000"+
		"\u0000\u0000\u0362\u0363\u0007\u0004\u0000\u0000\u0363\u0364\u0005\u0095"+
		"\u0000\u0000\u0364\u0365\u0003\u0090H\u0000\u0365U\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0005\u0085\u0000\u0000\u0367\u036a\u0003\u0090H\u0000\u0368"+
		"\u0369\u0005\u00a8\u0000\u0000\u0369\u036b\u0003\u0090H\u0000\u036a\u0368"+
		"\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036c"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0005\u00a7\u0000\u0000\u036dW\u0001"+
		"\u0000\u0000\u0000\u036e\u036f\u0005s\u0000\u0000\u036f\u0370\u0005\u00a7"+
		"\u0000\u0000\u0370Y\u0001\u0000\u0000\u0000\u0371\u0373\u0005:\u0000\u0000"+
		"\u0372\u0374\u0007\u0005\u0000\u0000\u0373\u0372\u0001\u0000\u0000\u0000"+
		"\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"+
		"\u0375\u0376\u0005\u00a7\u0000\u0000\u0376[\u0001\u0000\u0000\u0000\u0377"+
		"\u0379\u0005;\u0000\u0000\u0378\u037a\u0007\u0005\u0000\u0000\u0379\u0378"+
		"\u0001\u0000\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u0380"+
		"\u0001\u0000\u0000\u0000\u037b\u037d\u0005!\u0000\u0000\u037c\u037e\u0005"+
		"<\u0000\u0000\u037d\u037c\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000"+
		"\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0381\u0005\u00b4"+
		"\u0000\u0000\u0380\u037b\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"+
		"\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0383\u0005\u00a7"+
		"\u0000\u0000\u0383]\u0001\u0000\u0000\u0000\u0384\u0386\u0003\u0002\u0001"+
		"\u0000\u0385\u0384\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000"+
		"\u0000\u0386\u0388\u0001\u0000\u0000\u0000\u0387\u0389\u0005\u0001\u0000"+
		"\u0000\u0388\u0387\u0001\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000"+
		"\u0000\u0389\u038b\u0001\u0000\u0000\u0000\u038a\u038c\u0003\u0006\u0003"+
		"\u0000\u038b\u038a\u0001\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000"+
		"\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u038e\u0005\u0002\u0000"+
		"\u0000\u038e\u0390\u0003\f\u0006\u0000\u038f\u0391\u0003`0\u0000\u0390"+
		"\u038f\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000\u0000\u0391"+
		"\u0392\u0001\u0000\u0000\u0000\u0392\u0394\u0005\u0003\u0000\u0000\u0393"+
		"\u0395\u0003\u0002\u0001\u0000\u0394\u0393\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396"+
		"\u0397\u0005\u00a7\u0000\u0000\u0397_\u0001\u0000\u0000\u0000\u0398\u0399"+
		"\u0005\u0004\u0000\u0000\u0399\u039a\u0003b1\u0000\u039aa\u0001\u0000"+
		"\u0000\u0000\u039b\u039d\u0003d2\u0000\u039c\u039b\u0001\u0000\u0000\u0000"+
		"\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039fc\u0001\u0000\u0000\u0000\u03a0"+
		"\u03a1\u0005\n\u0000\u0000\u03a1\u03a2\u0003f3\u0000\u03a2\u03a3\u0005"+
		"\u0006\u0000\u0000\u03a3\u03a4\u0003\f\u0006\u0000\u03a4e\u0001\u0000"+
		"\u0000\u0000\u03a5\u03aa\u0003h4\u0000\u03a6\u03a7\u0005v\u0000\u0000"+
		"\u03a7\u03a9\u0003h4\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03ac"+
		"\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03abg\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001"+
		"\u0000\u0000\u0000\u03ad\u03b1\u0005\u00b4\u0000\u0000\u03ae\u03af\u0005"+
		"h\u0000\u0000\u03af\u03b1\u0005\u00b2\u0000\u0000\u03b0\u03ad\u0001\u0000"+
		"\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b1i\u0001\u0000\u0000"+
		"\u0000\u03b2\u03b4\u0005m\u0000\u0000\u03b3\u03b5\u0007\u0006\u0000\u0000"+
		"\u03b4\u03b3\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000"+
		"\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005n\u0000\u0000\u03b7"+
		"\u03b8\u0003l6\u0000\u03b8\u03b9\u0005\u00a7\u0000\u0000\u03b9k\u0001"+
		"\u0000\u0000\u0000\u03ba\u03bf\u0003n7\u0000\u03bb\u03bc\u0005\u00a8\u0000"+
		"\u0000\u03bc\u03be\u0003n7\u0000\u03bd\u03bb\u0001\u0000\u0000\u0000\u03be"+
		"\u03c1\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c0m\u0001\u0000\u0000\u0000\u03c1\u03bf"+
		"\u0001\u0000\u0000\u0000\u03c2\u03c3\u0003\u0012\t\u0000\u03c3\u03c4\u0005"+
		"\u0095\u0000\u0000\u03c4\u03c5\u0003p8\u0000\u03c5o\u0001\u0000\u0000"+
		"\u0000\u03c6\u03c7\u0005\u00b4\u0000\u0000\u03c7q\u0001\u0000\u0000\u0000"+
		"\u03c8\u03c9\u0005\u0086\u0000\u0000\u03c9\u03ce\u0003\u0012\t\u0000\u03ca"+
		"\u03cb\u0005\u00aa\u0000\u0000\u03cb\u03cc\u0003,\u0016\u0000\u03cc\u03cd"+
		"\u0005\u00ab\u0000\u0000\u03cd\u03cf\u0001\u0000\u0000\u0000\u03ce\u03ca"+
		"\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005\r\u0000\u0000\u03d1\u03d3\u0003"+
		"x<\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005\u00a7\u0000"+
		"\u0000\u03d5s\u0001\u0000\u0000\u0000\u03d6\u03d7\u0005\u0087\u0000\u0000"+
		"\u03d7\u03d8\u0003\u0012\t\u0000\u03d8\u03d9\u0005\u00a7\u0000\u0000\u03d9"+
		"u\u0001\u0000\u0000\u0000\u03da\u03db\u0005\u0088\u0000\u0000\u03db\u03dc"+
		"\u0003\u0012\t\u0000\u03dc\u03dd\u0005\u001b\u0000\u0000\u03dd\u03de\u0003"+
		"\u0018\f\u0000\u03de\u03df\u0005\u00a7\u0000\u0000\u03dfw\u0001\u0000"+
		"\u0000\u0000\u03e0\u03e2\u0003z=\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e3\u03eb\u0003\u0080@\u0000\u03e4\u03e6\u0007\u0007\u0000\u0000\u03e5"+
		"\u03e7\u0005#\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e6\u03e7"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea"+
		"\u0003\u0080@\u0000\u03e9\u03e4\u0001\u0000\u0000\u0000\u03ea\u03ed\u0001"+
		"\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03eb\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ecy\u0001\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ef\u0005.\u0000\u0000\u03ef\u03f0\u0003|>\u0000"+
		"\u03f0{\u0001\u0000\u0000\u0000\u03f1\u03f6\u0003~?\u0000\u03f2\u03f3"+
		"\u0005\u00a8\u0000\u0000\u03f3\u03f5\u0003~?\u0000\u03f4\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f5\u03f8\u0001\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7}\u0001\u0000\u0000"+
		"\u0000\u03f8\u03f6\u0001\u0000\u0000\u0000\u03f9\u03fe\u0005\u00b4\u0000"+
		"\u0000\u03fa\u03fb\u0005\u00aa\u0000\u0000\u03fb\u03fc\u0003*\u0015\u0000"+
		"\u03fc\u03fd\u0005\u00ab\u0000\u0000\u03fd\u03ff\u0001\u0000\u0000\u0000"+
		"\u03fe\u03fa\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000"+
		"\u03ff\u0400\u0001\u0000\u0000\u0000\u0400\u0401\u0005q\u0000\u0000\u0401"+
		"\u0402\u0005\u00aa\u0000\u0000\u0402\u0403\u0003x<\u0000\u0403\u0404\u0005"+
		"\u00ab\u0000\u0000\u0404\u007f\u0001\u0000\u0000\u0000\u0405\u040f\u0005"+
		"\u0015\u0000\u0000\u0406\u040c\u0005\"\u0000\u0000\u0407\u0408\u0005b"+
		"\u0000\u0000\u0408\u0409\u0005\u00aa\u0000\u0000\u0409\u040a\u0003,\u0016"+
		"\u0000\u040a\u040b\u0005\u00ab\u0000\u0000\u040b\u040d\u0001\u0000\u0000"+
		"\u0000\u040c\u0407\u0001\u0000\u0000\u0000\u040c\u040d\u0001\u0000\u0000"+
		"\u0000\u040d\u0410\u0001\u0000\u0000\u0000\u040e\u0410\u0005#\u0000\u0000"+
		"\u040f\u0406\u0001\u0000\u0000\u0000\u040f\u040e\u0001\u0000\u0000\u0000"+
		"\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000\u0000"+
		"\u0411\u0413\u0003\u0016\u000b\u0000\u0412\u0414\u0003\u001a\r\u0000\u0413"+
		"\u0412\u0001\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414"+
		"\u0416\u0001\u0000\u0000\u0000\u0415\u0417\u0003\"\u0011\u0000\u0416\u0415"+
		"\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0419"+
		"\u0001\u0000\u0000\u0000\u0418\u041a\u0003\u0082A\u0000\u0419\u0418\u0001"+
		"\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000\u041a\u041c\u0001"+
		"\u0000\u0000\u0000\u041b\u041d\u0003\u0084B\u0000\u041c\u041b\u0001\u0000"+
		"\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000\u041d\u041f\u0001\u0000"+
		"\u0000\u0000\u041e\u0420\u0003\u0086C\u0000\u041f\u041e\u0001\u0000\u0000"+
		"\u0000\u041f\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000"+
		"\u0000\u0421\u0423\u0003\u008aE\u0000\u0422\u0421\u0001\u0000\u0000\u0000"+
		"\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0081\u0001\u0000\u0000\u0000"+
		"\u0424\u0425\u0005$\u0000\u0000\u0425\u0426\u0005X\u0000\u0000\u0426\u0427"+
		"\u0003,\u0016\u0000\u0427\u0083\u0001\u0000\u0000\u0000\u0428\u0429\u0005"+
		"%\u0000\u0000\u0429\u042a\u0003\u0090H\u0000\u042a\u0085\u0001\u0000\u0000"+
		"\u0000\u042b\u042c\u0005&\u0000\u0000\u042c\u042d\u0005X\u0000\u0000\u042d"+
		"\u0432\u0003\u0088D\u0000\u042e\u042f\u0005\u00a8\u0000\u0000\u042f\u0431"+
		"\u0003\u0088D\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0431\u0434\u0001"+
		"\u0000\u0000\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0432\u0433\u0001"+
		"\u0000\u0000\u0000\u0433\u0087\u0001\u0000\u0000\u0000\u0434\u0432\u0001"+
		"\u0000\u0000\u0000\u0435\u0437\u0003\u0090H\u0000\u0436\u0438\u0007\b"+
		"\u0000\u0000\u0437\u0436\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u043b\u0001\u0000\u0000\u0000\u0439\u043a\u0005+\u0000"+
		"\u0000\u043a\u043c\u0007\t\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000"+
		"\u043b\u043c\u0001\u0000\u0000\u0000\u043c\u0089\u0001\u0000\u0000\u0000"+
		"\u043d\u0440\u0005\'\u0000\u0000\u043e\u0441\u0003\u0090H\u0000\u043f"+
		"\u0441\u0005#\u0000\u0000\u0440\u043e\u0001\u0000\u0000\u0000\u0440\u043f"+
		"\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000\u0000\u0000\u0442\u0443"+
		"\u0005(\u0000\u0000\u0443\u0445\u0003\u0090H\u0000\u0444\u0442\u0001\u0000"+
		"\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000\u0445\u008b\u0001\u0000"+
		"\u0000\u0000\u0446\u044b\u0003\u008eG\u0000\u0447\u0448\u0005\u00a8\u0000"+
		"\u0000\u0448\u044a\u0003\u008eG\u0000\u0449\u0447\u0001\u0000\u0000\u0000"+
		"\u044a\u044d\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000"+
		"\u044b\u044c\u0001\u0000\u0000\u0000\u044c\u008d\u0001\u0000\u0000\u0000"+
		"\u044d\u044b\u0001\u0000\u0000\u0000\u044e\u044f\u0005\u00b4\u0000\u0000"+
		"\u044f\u0450\u0003\n\u0005\u0000\u0450\u008f\u0001\u0000\u0000\u0000\u0451"+
		"\u0452\u0006H\uffff\uffff\u0000\u0452\u0490\u0003\u009aM\u0000\u0453\u0490"+
		"\u0003\u0012\t\u0000\u0454\u0490\u0003\u0098L\u0000\u0455\u0456\u0005"+
		"O\u0000\u0000\u0456\u0490\u0005\u00b2\u0000\u0000\u0457\u0458\u00054\u0000"+
		"\u0000\u0458\u0459\u0005\u00aa\u0000\u0000\u0459\u045a\u0003\u0090H\u0000"+
		"\u045a\u045b\u0005q\u0000\u0000\u045b\u045c\u0003\n\u0005\u0000\u045c"+
		"\u045d\u0005\u00ab\u0000\u0000\u045d\u0490\u0001\u0000\u0000\u0000\u045e"+
		"\u045f\u00056\u0000\u0000\u045f\u0460\u0005\u00aa\u0000\u0000\u0460\u0461"+
		"\u0003,\u0016\u0000\u0461\u0462\u0005\u00ab\u0000\u0000\u0462\u0490\u0001"+
		"\u0000\u0000\u0000\u0463\u0464\u00057\u0000\u0000\u0464\u0465\u0005\u00aa"+
		"\u0000\u0000\u0465\u0466\u0003\u0090H\u0000\u0466\u0467\u0005\u00a8\u0000"+
		"\u0000\u0467\u0468\u0003\u0090H\u0000\u0468\u0469\u0005\u00ab\u0000\u0000"+
		"\u0469\u0490\u0001\u0000\u0000\u0000\u046a\u046b\u00058\u0000\u0000\u046b"+
		"\u046c\u0005\u00aa\u0000\u0000\u046c\u046d\u0003,\u0016\u0000\u046d\u046e"+
		"\u0005\u00ab\u0000\u0000\u046e\u0490\u0001\u0000\u0000\u0000\u046f\u0470"+
		"\u00059\u0000\u0000\u0470\u0471\u0005\u00aa\u0000\u0000\u0471\u0472\u0003"+
		",\u0016\u0000\u0472\u0473\u0005\u00ab\u0000\u0000\u0473\u0490\u0001\u0000"+
		"\u0000\u0000\u0474\u0475\u00053\u0000\u0000\u0475\u0476\u0005\u00aa\u0000"+
		"\u0000\u0476\u0477\u0003x<\u0000\u0477\u0478\u0005\u00ab\u0000\u0000\u0478"+
		"\u0490\u0001\u0000\u0000\u0000\u0479\u047a\u0005\u00aa\u0000\u0000\u047a"+
		"\u047b\u0003x<\u0000\u047b\u047c\u0005\u00ab\u0000\u0000\u047c\u0490\u0001"+
		"\u0000\u0000\u0000\u047d\u047e\u0005\u00aa\u0000\u0000\u047e\u047f\u0003"+
		"\u0090H\u0000\u047f\u0480\u0005\u00ab\u0000\u0000\u0480\u0490\u0001\u0000"+
		"\u0000\u0000\u0481\u0482\u0005t\u0000\u0000\u0482\u0490\u0003\u0090H\u0005"+
		"\u0483\u0485\u0005\t\u0000\u0000\u0484\u0486\u0003\u0090H\u0000\u0485"+
		"\u0484\u0001\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000\u0000\u0486"+
		"\u0487\u0001\u0000\u0000\u0000\u0487\u048a\u0003\u0092I\u0000\u0488\u0489"+
		"\u0005\b\u0000\u0000\u0489\u048b\u0003\u0090H\u0000\u048a\u0488\u0001"+
		"\u0000\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u048c\u0001"+
		"\u0000\u0000\u0000\u048c\u048d\u0005\u0003\u0000\u0000\u048d\u0490\u0001"+
		"\u0000\u0000\u0000\u048e\u0490\u0003\u0096K\u0000\u048f\u0451\u0001\u0000"+
		"\u0000\u0000\u048f\u0453\u0001\u0000\u0000\u0000\u048f\u0454\u0001\u0000"+
		"\u0000\u0000\u048f\u0455\u0001\u0000\u0000\u0000\u048f\u0457\u0001\u0000"+
		"\u0000\u0000\u048f\u045e\u0001\u0000\u0000\u0000\u048f\u0463\u0001\u0000"+
		"\u0000\u0000\u048f\u046a\u0001\u0000\u0000\u0000\u048f\u046f\u0001\u0000"+
		"\u0000\u0000\u048f\u0474\u0001\u0000\u0000\u0000\u048f\u0479\u0001\u0000"+
		"\u0000\u0000\u048f\u047d\u0001\u0000\u0000\u0000\u048f\u0481\u0001\u0000"+
		"\u0000\u0000\u048f\u0483\u0001\u0000\u0000\u0000\u048f\u048e\u0001\u0000"+
		"\u0000\u0000\u0490\u04d4\u0001\u0000\u0000\u0000\u0491\u0492\n\u000e\u0000"+
		"\u0000\u0492\u0493\u0007\n\u0000\u0000\u0493\u04d3\u0003\u0090H\u000f"+
		"\u0494\u0495\n\r\u0000\u0000\u0495\u0496\u0007\u000b\u0000\u0000\u0496"+
		"\u04d3\u0003\u0090H\u000e\u0497\u0498\n\f\u0000\u0000\u0498\u0499\u0005"+
		"\u0094\u0000\u0000\u0499\u04d3\u0003\u0090H\r\u049a\u049b\n\u000b\u0000"+
		"\u0000\u049b\u049c\u0007\f\u0000\u0000\u049c\u04d3\u0003\u0090H\f\u049d"+
		"\u049f\n\n\u0000\u0000\u049e\u04a0\u0005t\u0000\u0000\u049f\u049e\u0001"+
		"\u0000\u0000\u0000\u049f\u04a0\u0001\u0000\u0000\u0000\u04a0\u04a1\u0001"+
		"\u0000\u0000\u0000\u04a1\u04a2\u0005/\u0000\u0000\u04a2\u04a3\u0003\u0090"+
		"H\u0000\u04a3\u04a4\u0005u\u0000\u0000\u04a4\u04a5\u0003\u0090H\u000b"+
		"\u04a5\u04d3\u0001\u0000\u0000\u0000\u04a6\u04a8\n\t\u0000\u0000\u04a7"+
		"\u04a9\u0005t\u0000\u0000\u04a8\u04a7\u0001\u0000\u0000\u0000\u04a8\u04a9"+
		"\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000\u0000\u04aa\u04ab"+
		"\u0007\r\u0000\u0000\u04ab\u04d3\u0003\u0090H\n\u04ac\u04ad\n\b\u0000"+
		"\u0000\u04ad\u04ae\u0005\u00a4\u0000\u0000\u04ae\u04af\u0005!\u0000\u0000"+
		"\u04af\u04d3\u0003\u0090H\t\u04b0\u04b1\n\u0006\u0000\u0000\u04b1\u04b2"+
		"\u0007\u000e\u0000\u0000\u04b2\u04d3\u0003\u0090H\u0007\u04b3\u04b4\n"+
		"\u0016\u0000\u0000\u04b4\u04b5\u0005\u00a1\u0000\u0000\u04b5\u04d3\u0003"+
		"\n\u0005\u0000\u04b6\u04b7\n\u0007\u0000\u0000\u04b7\u04b8\u0007\f\u0000"+
		"\u0000\u04b8\u04b9\u0007\u000f\u0000\u0000\u04b9\u04bc\u0005\u00aa\u0000"+
		"\u0000\u04ba\u04bd\u0003x<\u0000\u04bb\u04bd\u0003,\u0016\u0000\u04bc"+
		"\u04ba\u0001\u0000\u0000\u0000\u04bc\u04bb\u0001\u0000\u0000\u0000\u04bd"+
		"\u04be\u0001\u0000\u0000\u0000\u04be\u04bf\u0005\u00ab\u0000\u0000\u04bf"+
		"\u04d3\u0001\u0000\u0000\u0000\u04c0\u04c1\n\u0004\u0000\u0000\u04c1\u04c3"+
		"\u0005r\u0000\u0000\u04c2\u04c4\u0005t\u0000\u0000\u04c3\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c3\u04c4\u0001\u0000\u0000\u0000\u04c4\u04c5\u0001\u0000"+
		"\u0000\u0000\u04c5\u04d3\u0005s\u0000\u0000\u04c6\u04c8\n\u0003\u0000"+
		"\u0000\u04c7\u04c9\u0005t\u0000\u0000\u04c8\u04c7\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9\u04ca\u0001\u0000\u0000\u0000"+
		"\u04ca\u04cb\u0005V\u0000\u0000\u04cb\u04ce\u0005\u00aa\u0000\u0000\u04cc"+
		"\u04cf\u0003x<\u0000\u04cd\u04cf\u0003,\u0016\u0000\u04ce\u04cc\u0001"+
		"\u0000\u0000\u0000\u04ce\u04cd\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0005\u00ab\u0000\u0000\u04d1\u04d3\u0001"+
		"\u0000\u0000\u0000\u04d2\u0491\u0001\u0000\u0000\u0000\u04d2\u0494\u0001"+
		"\u0000\u0000\u0000\u04d2\u0497\u0001\u0000\u0000\u0000\u04d2\u049a\u0001"+
		"\u0000\u0000\u0000\u04d2\u049d\u0001\u0000\u0000\u0000\u04d2\u04a6\u0001"+
		"\u0000\u0000\u0000\u04d2\u04ac\u0001\u0000\u0000\u0000\u04d2\u04b0\u0001"+
		"\u0000\u0000\u0000\u04d2\u04b3\u0001\u0000\u0000\u0000\u04d2\u04b6\u0001"+
		"\u0000\u0000\u0000\u04d2\u04c0\u0001\u0000\u0000\u0000\u04d2\u04c6\u0001"+
		"\u0000\u0000\u0000\u04d3\u04d6\u0001\u0000\u0000\u0000\u04d4\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d4\u04d5\u0001\u0000\u0000\u0000\u04d5\u0091\u0001"+
		"\u0000\u0000\u0000\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d7\u04d9\u0003"+
		"\u0094J\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000"+
		"\u0000\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000"+
		"\u0000\u0000\u04db\u0093\u0001\u0000\u0000\u0000\u04dc\u04dd\u0005\n\u0000"+
		"\u0000\u04dd\u04de\u0003\u0090H\u0000\u04de\u04df\u0005\u0006\u0000\u0000"+
		"\u04df\u04e0\u0003\u0090H\u0000\u04e0\u0095\u0001\u0000\u0000\u0000\u04e1"+
		"\u04e2\u0005Y\u0000\u0000\u04e2\u04e3\u0005\u00ac\u0000\u0000\u04e3\u04e4"+
		"\u0003,\u0016\u0000\u04e4\u04e5\u0005\u00ad\u0000\u0000\u04e5\u04ec\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e7\u0003\u0012\t\u0000\u04e7\u04e8\u0005\u00ac"+
		"\u0000\u0000\u04e8\u04e9\u0003\u0090H\u0000\u04e9\u04ea\u0005\u00ad\u0000"+
		"\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04e1\u0001\u0000\u0000"+
		"\u0000\u04eb\u04e6\u0001\u0000\u0000\u0000\u04ec\u0097\u0001\u0000\u0000"+
		"\u0000\u04ed\u04ee\u0005\u00b4\u0000\u0000\u04ee\u04f1\u0005\u00aa\u0000"+
		"\u0000\u04ef\u04f2\u0003,\u0016\u0000\u04f0\u04f2\u0005\u009d\u0000\u0000"+
		"\u04f1\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f0\u0001\u0000\u0000\u0000"+
		"\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000"+
		"\u04f3\u04f4\u0005\u00ab\u0000\u0000\u04f4\u0099\u0001\u0000\u0000\u0000"+
		"\u04f5\u04f6\u0007\u0010\u0000\u0000\u04f6\u009b\u0001\u0000\u0000\u0000"+
		"\u00a3\u009d\u00a0\u00a5\u00a9\u00ac\u00b8\u00bc\u00c1\u00c7\u00d1\u00dd"+
		"\u00e0\u00eb\u00ee\u00f5\u00f8\u0100\u0106\u010f\u0115\u011a\u0127\u0129"+
		"\u012f\u0133\u0139\u0157\u0163\u016b\u016e\u0174\u0178\u017b\u0185\u0188"+
		"\u018f\u0197\u019c\u019f\u01a4\u01a7\u01aa\u01b0\u01b3\u01b5\u01ba\u01c5"+
		"\u01c7\u01cc\u01d0\u01d4\u01d7\u01df\u01e2\u01ea\u01ee\u01f9\u0204\u020f"+
		"\u0214\u0217\u021a\u021d\u0220\u0223\u022a\u022e\u0235\u023d\u0245\u024c"+
		"\u0255\u0260\u0267\u0276\u0283\u0288\u0290\u0295\u029e\u02a6\u02ad\u02b2"+
		"\u02bb\u02c0\u02c6\u02ce\u02d5\u02da\u02e5\u02e9\u02f0\u02f3\u02f6\u02f9"+
		"\u02fc\u02ff\u0302\u0305\u030b\u0315\u031b\u031f\u0325\u0329\u032f\u0342"+
		"\u0346\u034a\u034f\u0352\u0356\u035f\u036a\u0373\u0379\u037d\u0380\u0385"+
		"\u0388\u038b\u0390\u0394\u039e\u03aa\u03b0\u03b4\u03bf\u03ce\u03d2\u03e1"+
		"\u03e6\u03eb\u03f6\u03fe\u040c\u040f\u0413\u0416\u0419\u041c\u041f\u0422"+
		"\u0432\u0437\u043b\u0440\u0444\u044b\u0485\u048a\u048f\u049f\u04a8\u04bc"+
		"\u04c3\u04c8\u04ce\u04d2\u04d4\u04da\u04eb\u04f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}