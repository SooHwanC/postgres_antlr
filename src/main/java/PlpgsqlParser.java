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
		RETURN=17, RAISE=18, NEXT=19, QUERY=20, CREATE=21, DROP=22, ALTER=23, 
		TRUNCATE=24, ANALYZE=25, VACUUM=26, EXPLAIN=27, LOCK=28, REINDEX=29, CLUSTER=30, 
		COMMENT=31, TABLE=32, TEMP=33, TEMPORARY=34, SELECT=35, INSERT=36, UPDATE=37, 
		DELETE=38, PERFORM=39, EXECUTE=40, INTO=41, FROM=42, WHERE=43, SET=44, 
		VALUES=45, RETURNING=46, TO=47, DISTINCT=48, ALL=49, GROUP=50, HAVING=51, 
		ORDER=52, LIMIT=53, OFFSET=54, ASC=55, DESC=56, NULLS=57, FIRST=58, LAST=59, 
		WITH=60, BETWEEN=61, UNION=62, INTERSECT=63, EXCEPT=64, EXISTS=65, CAST=66, 
		EXTRACT=67, COALESCE=68, NULLIF=69, GREATEST=70, LEAST=71, OVER=72, PARTITION=73, 
		COMMIT=74, ROLLBACK=75, SAVEPOINT=76, START=77, TRANSACTION=78, WORK=79, 
		INTEGER=80, BIGINT=81, SMALLINT=82, NUMERIC=83, DECIMAL=84, REAL=85, DOUBLE=86, 
		VARCHAR=87, CHAR=88, TEXT=89, BOOLEAN=90, DATE=91, TIME=92, TIMESTAMP=93, 
		TIMESTAMPTZ=94, INTERVAL=95, RECORD=96, JSON=97, JSONB=98, UUID=99, BYTEA=100, 
		MONEY=101, IN=102, REVERSE=103, BY=104, ARRAY=105, SLICE=106, JOIN=107, 
		LEFT=108, RIGHT=109, INNER=110, OUTER=111, FULL=112, CROSS=113, ON=114, 
		NOTICE=115, WARNING=116, INFO=117, DEBUG=118, LOG=119, SQLSTATE=120, ERRCODE=121, 
		MESSAGE=122, DETAIL=123, HINT=124, GET=125, DIAGNOSTICS=126, STACKED=127, 
		CURRENT=128, AS=129, IS=130, NULL=131, NOT=132, AND=133, OR=134, CONSTANT=135, 
		DEFAULT=136, USING=137, STRICT=138, ZONE=139, VOLATILE=140, STABLE=141, 
		IMMUTABLE=142, LANGUAGE=143, CALLED=144, SECURITY=145, DEFINER=146, INVOKER=147, 
		ASSERT=148, OPEN=149, CLOSE=150, FETCH=151, MOVE=152, FOUND=153, CURSOR=154, 
		ALIAS=155, ROWS=156, PRESERVE=157, TRUE=158, FALSE=159, PERCENT=160, TYPE=161, 
		ROWTYPE=162, DOLLAR=163, ASSIGN=164, CONCAT=165, EQ=166, NEQ=167, LT=168, 
		LTE=169, GT=170, GTE=171, PLUS=172, MINUS=173, STAR=174, SLASH=175, CARET=176, 
		TYPECAST=177, LIKE=178, ILIKE=179, SIMILAR=180, ANY=181, SOME=182, SEMI=183, 
		COMMA=184, DOT=185, LPAREN=186, RPAREN=187, LBRACK=188, RBRACK=189, LABEL_START=190, 
		LABEL_END=191, IntegerLiteral=192, NumericLiteral=193, StringLiteral=194, 
		DollarQuotedString=195, Identifier=196, QuotedIdentifier=197, LineComment=198, 
		BlockComment=199, WS=200;
	public static final int
		RULE_plpgsqlBlock = 0, RULE_label = 1, RULE_declareSection = 2, RULE_declarationList = 3, 
		RULE_declaration = 4, RULE_dataType = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_assignmentStmt = 8, RULE_variableRef = 9, RULE_selectIntoStmt = 10, 
		RULE_selectList = 11, RULE_selectItem = 12, RULE_variableList = 13, RULE_fromClause = 14, 
		RULE_tableRef = 15, RULE_joinClause = 16, RULE_joinType = 17, RULE_whereClause = 18, 
		RULE_performStmt = 19, RULE_executeStmt = 20, RULE_insertStmt = 21, RULE_columnList = 22, 
		RULE_expressionList = 23, RULE_updateStmt = 24, RULE_assignmentList = 25, 
		RULE_columnAssignment = 26, RULE_deleteStmt = 27, RULE_setStmt = 28, RULE_ifStmt = 29, 
		RULE_caseStmt = 30, RULE_whenClauseList = 31, RULE_whenClause = 32, RULE_loopStmt = 33, 
		RULE_whileStmt = 34, RULE_forStmt = 35, RULE_forQuerySource = 36, RULE_foreachStmt = 37, 
		RULE_exitStmt = 38, RULE_continueStmt = 39, RULE_returnStmt = 40, RULE_raiseStmt = 41, 
		RULE_raiseOptionList = 42, RULE_raiseOption = 43, RULE_assertStmt = 44, 
		RULE_nullStmt = 45, RULE_commitStmt = 46, RULE_rollbackStmt = 47, RULE_nestedBlock = 48, 
		RULE_exceptionSection = 49, RULE_exceptionHandlerList = 50, RULE_exceptionHandler = 51, 
		RULE_exceptionConditionList = 52, RULE_exceptionCondition = 53, RULE_getDiagnosticsStmt = 54, 
		RULE_diagnosticsItemList = 55, RULE_diagnosticsItem = 56, RULE_diagnosticsOption = 57, 
		RULE_openCursorStmt = 58, RULE_closeCursorStmt = 59, RULE_fetchStmt = 60, 
		RULE_selectStmt = 61, RULE_withClause = 62, RULE_cteList = 63, RULE_cte = 64, 
		RULE_selectQuery = 65, RULE_groupByClause = 66, RULE_havingClause = 67, 
		RULE_orderByClause = 68, RULE_orderByItem = 69, RULE_limitClause = 70, 
		RULE_parameterList = 71, RULE_parameter = 72, RULE_expression = 73, RULE_whenExprClauseList = 74, 
		RULE_whenExprClause = 75, RULE_arrayExpression = 76, RULE_specialVariable = 77, 
		RULE_functionCall = 78, RULE_windowFunction = 79, RULE_windowSpec = 80, 
		RULE_sqlGenericStmt = 81, RULE_literal = 82, RULE_createTempTableStmt = 83, 
		RULE_createTableColumnDefList = 84, RULE_createTableColumnDef = 85, RULE_onCommitClause = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"plpgsqlBlock", "label", "declareSection", "declarationList", "declaration", 
			"dataType", "statementList", "statement", "assignmentStmt", "variableRef", 
			"selectIntoStmt", "selectList", "selectItem", "variableList", "fromClause", 
			"tableRef", "joinClause", "joinType", "whereClause", "performStmt", "executeStmt", 
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
			"whenExprClauseList", "whenExprClause", "arrayExpression", "specialVariable", 
			"functionCall", "windowFunction", "windowSpec", "sqlGenericStmt", "literal", 
			"createTempTableStmt", "createTableColumnDefList", "createTableColumnDef", 
			"onCommitClause"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARE'", "'BEGIN'", "'END'", "'EXCEPTION'", "'IF'", "'THEN'", 
			"'ELSIF'", "'ELSE'", "'CASE'", "'WHEN'", "'LOOP'", "'WHILE'", "'FOR'", 
			"'FOREACH'", "'EXIT'", "'CONTINUE'", "'RETURN'", "'RAISE'", "'NEXT'", 
			"'QUERY'", "'CREATE'", "'DROP'", "'ALTER'", "'TRUNCATE'", "'ANALYZE'", 
			"'VACUUM'", "'EXPLAIN'", "'LOCK'", "'REINDEX'", "'CLUSTER'", "'COMMENT'", 
			"'TABLE'", "'TEMP'", "'TEMPORARY'", "'SELECT'", "'INSERT'", "'UPDATE'", 
			"'DELETE'", "'PERFORM'", "'EXECUTE'", "'INTO'", "'FROM'", "'WHERE'", 
			"'SET'", "'VALUES'", "'RETURNING'", "'TO'", "'DISTINCT'", "'ALL'", "'GROUP'", 
			"'HAVING'", "'ORDER'", "'LIMIT'", "'OFFSET'", "'ASC'", "'DESC'", "'NULLS'", 
			"'FIRST'", "'LAST'", "'WITH'", "'BETWEEN'", "'UNION'", "'INTERSECT'", 
			"'EXCEPT'", "'EXISTS'", "'CAST'", "'EXTRACT'", "'COALESCE'", "'NULLIF'", 
			"'GREATEST'", "'LEAST'", "'OVER'", "'PARTITION'", "'COMMIT'", "'ROLLBACK'", 
			"'SAVEPOINT'", "'START'", "'TRANSACTION'", "'WORK'", null, "'BIGINT'", 
			"'SMALLINT'", "'NUMERIC'", "'DECIMAL'", "'REAL'", null, "'VARCHAR'", 
			"'CHAR'", "'TEXT'", null, "'DATE'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPTZ'", 
			"'INTERVAL'", "'RECORD'", "'JSON'", "'JSONB'", "'UUID'", "'BYTEA'", "'MONEY'", 
			"'IN'", "'REVERSE'", "'BY'", "'ARRAY'", "'SLICE'", "'JOIN'", "'LEFT'", 
			"'RIGHT'", "'INNER'", "'OUTER'", "'FULL'", "'CROSS'", "'ON'", "'NOTICE'", 
			"'WARNING'", "'INFO'", "'DEBUG'", "'LOG'", "'SQLSTATE'", "'ERRCODE'", 
			"'MESSAGE'", "'DETAIL'", "'HINT'", "'GET'", "'DIAGNOSTICS'", "'STACKED'", 
			"'CURRENT'", "'AS'", "'IS'", "'NULL'", "'NOT'", "'AND'", "'OR'", "'CONSTANT'", 
			"'DEFAULT'", "'USING'", "'STRICT'", "'ZONE'", "'VOLATILE'", "'STABLE'", 
			"'IMMUTABLE'", "'LANGUAGE'", "'CALLED'", "'SECURITY'", "'DEFINER'", "'INVOKER'", 
			"'ASSERT'", "'OPEN'", "'CLOSE'", "'FETCH'", "'MOVE'", "'FOUND'", "'CURSOR'", 
			"'ALIAS'", "'ROWS'", "'PRESERVE'", "'TRUE'", "'FALSE'", "'%'", "'TYPE'", 
			"'ROWTYPE'", "'$'", "':='", "'||'", "'='", null, "'<'", "'<='", "'>'", 
			"'>='", "'+'", "'-'", "'*'", "'/'", "'^'", "'::'", "'LIKE'", "'ILIKE'", 
			"'SIMILAR'", "'ANY'", "'SOME'", "';'", "','", "'.'", "'('", "')'", "'['", 
			"']'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "BEGIN", "END", "EXCEPTION", "IF", "THEN", "ELSIF", 
			"ELSE", "CASE", "WHEN", "LOOP", "WHILE", "FOR", "FOREACH", "EXIT", "CONTINUE", 
			"RETURN", "RAISE", "NEXT", "QUERY", "CREATE", "DROP", "ALTER", "TRUNCATE", 
			"ANALYZE", "VACUUM", "EXPLAIN", "LOCK", "REINDEX", "CLUSTER", "COMMENT", 
			"TABLE", "TEMP", "TEMPORARY", "SELECT", "INSERT", "UPDATE", "DELETE", 
			"PERFORM", "EXECUTE", "INTO", "FROM", "WHERE", "SET", "VALUES", "RETURNING", 
			"TO", "DISTINCT", "ALL", "GROUP", "HAVING", "ORDER", "LIMIT", "OFFSET", 
			"ASC", "DESC", "NULLS", "FIRST", "LAST", "WITH", "BETWEEN", "UNION", 
			"INTERSECT", "EXCEPT", "EXISTS", "CAST", "EXTRACT", "COALESCE", "NULLIF", 
			"GREATEST", "LEAST", "OVER", "PARTITION", "COMMIT", "ROLLBACK", "SAVEPOINT", 
			"START", "TRANSACTION", "WORK", "INTEGER", "BIGINT", "SMALLINT", "NUMERIC", 
			"DECIMAL", "REAL", "DOUBLE", "VARCHAR", "CHAR", "TEXT", "BOOLEAN", "DATE", 
			"TIME", "TIMESTAMP", "TIMESTAMPTZ", "INTERVAL", "RECORD", "JSON", "JSONB", 
			"UUID", "BYTEA", "MONEY", "IN", "REVERSE", "BY", "ARRAY", "SLICE", "JOIN", 
			"LEFT", "RIGHT", "INNER", "OUTER", "FULL", "CROSS", "ON", "NOTICE", "WARNING", 
			"INFO", "DEBUG", "LOG", "SQLSTATE", "ERRCODE", "MESSAGE", "DETAIL", "HINT", 
			"GET", "DIAGNOSTICS", "STACKED", "CURRENT", "AS", "IS", "NULL", "NOT", 
			"AND", "OR", "CONSTANT", "DEFAULT", "USING", "STRICT", "ZONE", "VOLATILE", 
			"STABLE", "IMMUTABLE", "LANGUAGE", "CALLED", "SECURITY", "DEFINER", "INVOKER", 
			"ASSERT", "OPEN", "CLOSE", "FETCH", "MOVE", "FOUND", "CURSOR", "ALIAS", 
			"ROWS", "PRESERVE", "TRUE", "FALSE", "PERCENT", "TYPE", "ROWTYPE", "DOLLAR", 
			"ASSIGN", "CONCAT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
			"STAR", "SLASH", "CARET", "TYPECAST", "LIKE", "ILIKE", "SIMILAR", "ANY", 
			"SOME", "SEMI", "COMMA", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"LABEL_START", "LABEL_END", "IntegerLiteral", "NumericLiteral", "StringLiteral", 
			"DollarQuotedString", "Identifier", "QuotedIdentifier", "LineComment", 
			"BlockComment", "WS"
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
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(174);
				label();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(177);
				declareSection();
				}
			}

			setState(180);
			match(BEGIN);
			setState(181);
			statementList();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(182);
				exceptionSection();
				}
			}

			setState(185);
			match(END);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(186);
				label();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(189);
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
			setState(192);
			match(LABEL_START);
			setState(193);
			match(Identifier);
			setState(194);
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
			setState(196);
			match(DECLARE);
			setState(197);
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
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				declaration();
				}
				}
				setState(202); 
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(Identifier);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(205);
					match(CONSTANT);
					}
				}

				setState(208);
				dataType(0);
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(209);
					match(NOT);
					setState(210);
					match(NULL);
					}
				}

				setState(217);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(213);
					match(ASSIGN);
					setState(214);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(215);
					match(DEFAULT);
					setState(216);
					expression(0);
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(219);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(Identifier);
				setState(222);
				match(CURSOR);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(223);
					match(LPAREN);
					setState(224);
					parameterList();
					setState(225);
					match(RPAREN);
					}
				}

				setState(229);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
				selectStmt();
				setState(231);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(Identifier);
				setState(234);
				match(ALIAS);
				setState(235);
				match(FOR);
				setState(239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(236);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(237);
					match(DOLLAR);
					setState(238);
					match(IntegerLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(241);
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
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(245);
				match(INTEGER);
				}
				break;
			case BIGINT:
				{
				setState(246);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				{
				setState(247);
				match(SMALLINT);
				}
				break;
			case NUMERIC:
				{
				setState(248);
				match(NUMERIC);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(249);
					match(LPAREN);
					setState(250);
					match(IntegerLiteral);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(251);
						match(COMMA);
						setState(252);
						match(IntegerLiteral);
						}
					}

					setState(255);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				{
				setState(258);
				match(DECIMAL);
				setState(266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(259);
					match(LPAREN);
					setState(260);
					match(IntegerLiteral);
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(261);
						match(COMMA);
						setState(262);
						match(IntegerLiteral);
						}
					}

					setState(265);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case REAL:
				{
				setState(268);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(269);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				{
				setState(270);
				match(VARCHAR);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(271);
					match(LPAREN);
					setState(272);
					match(IntegerLiteral);
					setState(273);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(276);
				match(CHAR);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(277);
					match(LPAREN);
					setState(278);
					match(IntegerLiteral);
					setState(279);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(282);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(283);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(284);
				match(DATE);
				}
				break;
			case TIME:
				{
				setState(285);
				match(TIME);
				setState(289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(286);
					match(LPAREN);
					setState(287);
					match(IntegerLiteral);
					setState(288);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TIMESTAMP:
				{
				setState(291);
				match(TIMESTAMP);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(292);
					match(LPAREN);
					setState(293);
					match(IntegerLiteral);
					setState(294);
					match(RPAREN);
					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(297);
					match(WITH);
					setState(298);
					match(Identifier);
					setState(299);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case TIMESTAMPTZ:
				{
				setState(302);
				match(TIMESTAMPTZ);
				}
				break;
			case INTERVAL:
				{
				setState(303);
				match(INTERVAL);
				}
				break;
			case RECORD:
				{
				setState(304);
				match(RECORD);
				}
				break;
			case JSON:
				{
				setState(305);
				match(JSON);
				}
				break;
			case JSONB:
				{
				setState(306);
				match(JSONB);
				}
				break;
			case UUID:
				{
				setState(307);
				match(UUID);
				}
				break;
			case BYTEA:
				{
				setState(308);
				match(BYTEA);
				}
				break;
			case MONEY:
				{
				setState(309);
				match(MONEY);
				}
				break;
			case Identifier:
				{
				setState(310);
				match(Identifier);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(311);
					match(PERCENT);
					setState(312);
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
			setState(325);
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
					setState(317);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(318);
					match(ARRAY);
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(319);
						match(LBRACK);
						setState(320);
						match(RBRACK);
						}
						break;
					}
					}
					} 
				}
				setState(327);
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152941265749801510L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 146366987889541123L) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & 848822976643087L) != 0)) {
				{
				{
				setState(328);
				statement();
				}
				}
				setState(333);
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
		public CreateTempTableStmtContext createTempTableStmt() {
			return getRuleContext(CreateTempTableStmtContext.class,0);
		}
		public SqlGenericStmtContext sqlGenericStmt() {
			return getRuleContext(SqlGenericStmtContext.class,0);
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
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				selectIntoStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				performStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				executeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				insertStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				updateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				deleteStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				setStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(342);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(343);
				caseStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(344);
				loopStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(345);
				whileStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(346);
				forStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(347);
				foreachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(348);
				exitStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(349);
				continueStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(350);
				returnStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(351);
				raiseStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(352);
				assertStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(353);
				nullStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(354);
				nestedBlock();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(355);
				getDiagnosticsStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(356);
				openCursorStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(357);
				closeCursorStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(358);
				fetchStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(359);
				commitStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(360);
				rollbackStmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(361);
				createTempTableStmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(362);
				sqlGenericStmt();
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
			setState(365);
			variableRef();
			setState(366);
			match(ASSIGN);
			setState(367);
			expression(0);
			setState(368);
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
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(Identifier);
				setState(375);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(371);
						match(DOT);
						setState(372);
						match(Identifier);
						}
						} 
					}
					setState(377);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(QuotedIdentifier);
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						match(DOT);
						setState(380);
						match(QuotedIdentifier);
						}
						} 
					}
					setState(385);
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
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode STRICT() { return getToken(PlpgsqlParser.STRICT, 0); }
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
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(388);
				withClause();
				}
			}

			setState(391);
			match(SELECT);
			setState(392);
			selectList();
			setState(393);
			match(INTO);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(394);
				match(STRICT);
				}
			}

			setState(397);
			variableList();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(398);
				fromClause();
				}
			}

			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(401);
				whereClause();
				}
			}

			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(404);
				groupByClause();
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(407);
				havingClause();
				}
			}

			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(410);
				orderByClause();
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(413);
				limitClause();
				}
			}

			setState(416);
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
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
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
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
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
			case SQLSTATE:
			case NULL:
			case NOT:
			case FOUND:
			case TRUE:
			case FALSE:
			case LPAREN:
			case IntegerLiteral:
			case NumericLiteral:
			case StringLiteral:
			case DollarQuotedString:
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				selectItem();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(420);
					match(COMMA);
					setState(421);
					selectItem();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class SelectItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode AS() { return getToken(PlpgsqlParser.AS, 0); }
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSelectItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			expression(0);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==Identifier) {
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(430);
					match(AS);
					}
				}

				setState(433);
				match(Identifier);
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
		enterRule(_localctx, 26, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			variableRef();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(437);
				match(COMMA);
				setState(438);
				variableRef();
				}
				}
				setState(443);
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
		enterRule(_localctx, 28, RULE_fromClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(FROM);
			setState(445);
			tableRef();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 111L) != 0) || _la==COMMA) {
				{
				{
				setState(446);
				joinClause();
				}
				}
				setState(451);
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
		enterRule(_localctx, 30, RULE_tableRef);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				match(Identifier);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(453);
						match(AS);
						}
					}

					setState(456);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				functionCall();
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(460);
					match(WITH);
					setState(461);
					match(Identifier);
					}
				}

				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(465);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(464);
						match(AS);
						}
					}

					setState(467);
					match(Identifier);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				match(LPAREN);
				setState(471);
				selectStmt();
				setState(472);
				match(RPAREN);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(473);
						match(AS);
						}
					}

					setState(476);
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
		enterRule(_localctx, 32, RULE_joinClause);
		int _la;
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(COMMA);
				setState(482);
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
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 55L) != 0)) {
					{
					setState(483);
					joinType();
					}
				}

				setState(486);
				match(JOIN);
				setState(487);
				tableRef();
				setState(495);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON:
					{
					setState(488);
					match(ON);
					setState(489);
					expression(0);
					}
					break;
				case USING:
					{
					setState(490);
					match(USING);
					setState(491);
					match(LPAREN);
					setState(492);
					columnList();
					setState(493);
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
		enterRule(_localctx, 34, RULE_joinType);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				match(LEFT);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(501);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				match(RIGHT);
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(505);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
				match(FULL);
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(509);
					match(OUTER);
					}
				}

				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(512);
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
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(WHERE);
			setState(516);
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
		enterRule(_localctx, 38, RULE_performStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(PERFORM);
			setState(519);
			selectList();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(520);
				fromClause();
				}
			}

			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(523);
				whereClause();
				}
			}

			setState(526);
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
		enterRule(_localctx, 40, RULE_executeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(EXECUTE);
			setState(529);
			expression(0);
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(530);
				match(INTO);
				setState(531);
				variableList();
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(534);
				match(USING);
				setState(535);
				expressionList();
				}
			}

			setState(538);
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
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
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
		enterRule(_localctx, 42, RULE_insertStmt);
		int _la;
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(INSERT);
				setState(541);
				match(INTO);
				setState(542);
				match(Identifier);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(543);
					match(LPAREN);
					setState(544);
					columnList();
					setState(545);
					match(RPAREN);
					}
				}

				setState(549);
				match(VALUES);
				setState(550);
				match(LPAREN);
				setState(551);
				expressionList();
				setState(552);
				match(RPAREN);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(553);
					match(COMMA);
					setState(554);
					match(LPAREN);
					setState(555);
					expressionList();
					setState(556);
					match(RPAREN);
					}
					}
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(563);
					match(RETURNING);
					setState(564);
					expressionList();
					setState(565);
					match(INTO);
					setState(566);
					variableList();
					}
				}

				setState(570);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				match(INSERT);
				setState(573);
				match(INTO);
				setState(574);
				match(Identifier);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(575);
					match(LPAREN);
					setState(576);
					columnList();
					setState(577);
					match(RPAREN);
					}
				}

				setState(581);
				match(SELECT);
				setState(582);
				selectList();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(583);
					fromClause();
					}
				}

				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(586);
					whereClause();
					}
				}

				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(589);
					groupByClause();
					}
				}

				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(592);
					havingClause();
					}
				}

				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(595);
					orderByClause();
					}
				}

				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(598);
					limitClause();
					}
				}

				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(601);
					match(RETURNING);
					setState(602);
					expressionList();
					setState(603);
					match(INTO);
					setState(604);
					variableList();
					}
				}

				setState(608);
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
		enterRule(_localctx, 44, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(Identifier);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(613);
				match(COMMA);
				setState(614);
				match(Identifier);
				}
				}
				setState(619);
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
		enterRule(_localctx, 46, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			expression(0);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(621);
				match(COMMA);
				setState(622);
				expression(0);
				}
				}
				setState(627);
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
		enterRule(_localctx, 48, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(UPDATE);
			setState(629);
			match(Identifier);
			setState(630);
			match(SET);
			setState(631);
			assignmentList();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(632);
				whereClause();
				}
			}

			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(635);
				match(RETURNING);
				setState(636);
				expressionList();
				setState(637);
				match(INTO);
				setState(638);
				variableList();
				}
			}

			setState(642);
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
		enterRule(_localctx, 50, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			columnAssignment();
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(645);
				match(COMMA);
				setState(646);
				columnAssignment();
				}
				}
				setState(651);
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
		enterRule(_localctx, 52, RULE_columnAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(Identifier);
			setState(653);
			match(EQ);
			setState(654);
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
		enterRule(_localctx, 54, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(DELETE);
			setState(657);
			match(FROM);
			setState(658);
			match(Identifier);
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(659);
				whereClause();
				}
			}

			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(662);
				match(RETURNING);
				setState(663);
				expressionList();
				setState(664);
				match(INTO);
				setState(665);
				variableList();
				}
			}

			setState(669);
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
		enterRule(_localctx, 56, RULE_setStmt);
		int _la;
		try {
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(SET);
				setState(672);
				match(Identifier);
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				expression(0);
				setState(675);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(SET);
				setState(678);
				match(Identifier);
				setState(679);
				match(FROM);
				setState(680);
				match(CURRENT);
				setState(681);
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
		enterRule(_localctx, 58, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(IF);
			setState(685);
			expression(0);
			setState(686);
			match(THEN);
			setState(687);
			statementList();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(688);
				match(ELSIF);
				setState(689);
				expression(0);
				setState(690);
				match(THEN);
				setState(691);
				statementList();
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(698);
				match(ELSE);
				setState(699);
				statementList();
				}
			}

			setState(702);
			match(END);
			setState(703);
			match(IF);
			setState(704);
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
		enterRule(_localctx, 60, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(CASE);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 8863084066665136129L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & -8935141454511078399L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 541300097025L) != 0)) {
				{
				setState(707);
				expression(0);
				}
			}

			setState(710);
			whenClauseList();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(711);
				match(ELSE);
				setState(712);
				statementList();
				}
			}

			setState(715);
			match(END);
			setState(716);
			match(CASE);
			setState(717);
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
		enterRule(_localctx, 62, RULE_whenClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(719);
				whenClause();
				}
				}
				setState(722); 
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
		enterRule(_localctx, 64, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(WHEN);
			setState(725);
			expression(0);
			setState(726);
			match(THEN);
			setState(727);
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
		enterRule(_localctx, 66, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			match(LOOP);
			setState(733);
			statementList();
			setState(734);
			match(END);
			setState(735);
			match(LOOP);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(736);
				label();
				}
			}

			setState(739);
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
		enterRule(_localctx, 68, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(741);
				label();
				}
			}

			setState(744);
			match(WHILE);
			setState(745);
			expression(0);
			setState(746);
			match(LOOP);
			setState(747);
			statementList();
			setState(748);
			match(END);
			setState(749);
			match(LOOP);
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(750);
				label();
				}
			}

			setState(753);
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
		enterRule(_localctx, 70, RULE_forStmt);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(755);
					label();
					}
				}

				setState(758);
				match(FOR);
				setState(759);
				match(Identifier);
				setState(760);
				match(IN);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(761);
					match(REVERSE);
					}
				}

				setState(764);
				expression(0);
				setState(765);
				match(DOT);
				setState(766);
				match(DOT);
				setState(767);
				expression(0);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(768);
					match(BY);
					setState(769);
					expression(0);
					}
				}

				setState(772);
				match(LOOP);
				setState(773);
				statementList();
				setState(774);
				match(END);
				setState(775);
				match(LOOP);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(776);
					label();
					}
				}

				setState(779);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(781);
					label();
					}
				}

				setState(784);
				match(FOR);
				setState(785);
				match(Identifier);
				setState(786);
				match(IN);
				setState(787);
				forQuerySource();
				setState(788);
				match(LOOP);
				setState(789);
				statementList();
				setState(790);
				match(END);
				setState(791);
				match(LOOP);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(792);
					label();
					}
				}

				setState(795);
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
		enterRule(_localctx, 72, RULE_forQuerySource);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				match(EXECUTE);
				setState(800);
				expression(0);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(801);
				match(SELECT);
				setState(802);
				selectList();
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(803);
					fromClause();
					}
				}

				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(806);
					whereClause();
					}
				}

				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(809);
					groupByClause();
					}
				}

				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(812);
					havingClause();
					}
				}

				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(815);
					orderByClause();
					}
				}

				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(818);
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
			case SQLSTATE:
			case NULL:
			case NOT:
			case FOUND:
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
				setState(821);
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
		enterRule(_localctx, 74, RULE_foreachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(824);
				label();
				}
			}

			setState(827);
			match(FOREACH);
			setState(828);
			match(Identifier);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(829);
				match(SLICE);
				setState(830);
				match(IntegerLiteral);
				}
			}

			setState(833);
			match(IN);
			setState(834);
			match(ARRAY);
			setState(835);
			expression(0);
			setState(836);
			match(LOOP);
			setState(837);
			statementList();
			setState(838);
			match(END);
			setState(839);
			match(LOOP);
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(840);
				label();
				}
			}

			setState(843);
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
		enterRule(_localctx, 76, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(EXIT);
			setState(847);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(846);
				match(Identifier);
				}
			}

			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(849);
				match(WHEN);
				setState(850);
				expression(0);
				}
			}

			setState(853);
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
		enterRule(_localctx, 78, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(CONTINUE);
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(856);
				match(Identifier);
				}
			}

			setState(861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(859);
				match(WHEN);
				setState(860);
				expression(0);
				}
			}

			setState(863);
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
		enterRule(_localctx, 80, RULE_returnStmt);
		int _la;
		try {
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				match(RETURN);
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 8863084066665136129L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & -8935141454511078399L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 541300097025L) != 0)) {
					{
					setState(866);
					expression(0);
					}
				}

				setState(869);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(RETURN);
				setState(871);
				match(NEXT);
				setState(872);
				expression(0);
				setState(873);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				match(RETURN);
				setState(876);
				match(QUERY);
				setState(877);
				selectStmt();
				setState(878);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				match(RETURN);
				setState(881);
				match(QUERY);
				setState(882);
				match(EXECUTE);
				setState(883);
				expression(0);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(884);
					match(USING);
					setState(885);
					expressionList();
					}
				}

				setState(888);
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
		enterRule(_localctx, 82, RULE_raiseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			match(RAISE);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 31L) != 0)) {
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==EXCEPTION || ((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(902);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(896);
				match(StringLiteral);
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(897);
					match(COMMA);
					setState(898);
					expressionList();
					}
				}

				}
				break;
			case Identifier:
				{
				setState(901);
				match(Identifier);
				}
				break;
			case USING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(904);
				match(USING);
				setState(905);
				raiseOptionList();
				}
			}

			setState(908);
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
		enterRule(_localctx, 84, RULE_raiseOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(910);
			raiseOption();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(911);
				match(COMMA);
				setState(912);
				raiseOption();
				}
				}
				setState(917);
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
		enterRule(_localctx, 86, RULE_raiseOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_la = _input.LA(1);
			if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(919);
			match(EQ);
			setState(920);
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
		enterRule(_localctx, 88, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(ASSERT);
			setState(923);
			expression(0);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(924);
				match(COMMA);
				setState(925);
				expression(0);
				}
			}

			setState(928);
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
		enterRule(_localctx, 90, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			match(NULL);
			setState(931);
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
		enterRule(_localctx, 92, RULE_commitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			match(COMMIT);
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(934);
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

			setState(937);
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
		enterRule(_localctx, 94, RULE_rollbackStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(ROLLBACK);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(940);
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

			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(943);
				match(TO);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(944);
					match(SAVEPOINT);
					}
				}

				setState(947);
				match(Identifier);
				}
			}

			setState(950);
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
		enterRule(_localctx, 96, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(952);
				label();
				}
			}

			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(955);
				match(DECLARE);
				}
			}

			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(958);
				declarationList();
				}
			}

			setState(961);
			match(BEGIN);
			setState(962);
			statementList();
			setState(964);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(963);
				exceptionSection();
				}
			}

			setState(966);
			match(END);
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(967);
				label();
				}
			}

			setState(970);
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
		enterRule(_localctx, 98, RULE_exceptionSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(EXCEPTION);
			setState(973);
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
		enterRule(_localctx, 100, RULE_exceptionHandlerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(975);
				exceptionHandler();
				}
				}
				setState(978); 
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
		enterRule(_localctx, 102, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(WHEN);
			setState(981);
			exceptionConditionList();
			setState(982);
			match(THEN);
			setState(983);
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
		enterRule(_localctx, 104, RULE_exceptionConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			exceptionCondition();
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(986);
				match(OR);
				setState(987);
				exceptionCondition();
				}
				}
				setState(992);
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
		enterRule(_localctx, 106, RULE_exceptionCondition);
		try {
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				match(Identifier);
				}
				break;
			case SQLSTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				match(SQLSTATE);
				setState(995);
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
		enterRule(_localctx, 108, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(GET);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STACKED || _la==CURRENT) {
				{
				setState(999);
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

			setState(1002);
			match(DIAGNOSTICS);
			setState(1003);
			diagnosticsItemList();
			setState(1004);
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
		enterRule(_localctx, 110, RULE_diagnosticsItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			diagnosticsItem();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1007);
				match(COMMA);
				setState(1008);
				diagnosticsItem();
				}
				}
				setState(1013);
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
		enterRule(_localctx, 112, RULE_diagnosticsItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			variableRef();
			setState(1015);
			match(EQ);
			setState(1016);
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
		enterRule(_localctx, 114, RULE_diagnosticsOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
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
		enterRule(_localctx, 116, RULE_openCursorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(OPEN);
			setState(1021);
			variableRef();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1022);
				match(LPAREN);
				setState(1023);
				expressionList();
				setState(1024);
				match(RPAREN);
				}
			}

			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1028);
				match(FOR);
				setState(1029);
				selectStmt();
				}
			}

			setState(1032);
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
		enterRule(_localctx, 118, RULE_closeCursorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(CLOSE);
			setState(1035);
			variableRef();
			setState(1036);
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
		enterRule(_localctx, 120, RULE_fetchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			match(FETCH);
			setState(1039);
			variableRef();
			setState(1040);
			match(INTO);
			setState(1041);
			variableList();
			setState(1042);
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
		enterRule(_localctx, 122, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1044);
				withClause();
				}
			}

			setState(1047);
			selectQuery();
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0)) {
				{
				{
				setState(1048);
				_la = _input.LA(1);
				if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL) {
					{
					setState(1049);
					match(ALL);
					}
				}

				setState(1052);
				selectQuery();
				}
				}
				setState(1057);
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
		enterRule(_localctx, 124, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(WITH);
			setState(1059);
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
		enterRule(_localctx, 126, RULE_cteList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			cte();
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1062);
				match(COMMA);
				setState(1063);
				cte();
				}
				}
				setState(1068);
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
		enterRule(_localctx, 128, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(Identifier);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1070);
				match(LPAREN);
				setState(1071);
				columnList();
				setState(1072);
				match(RPAREN);
				}
			}

			setState(1076);
			match(AS);
			setState(1077);
			match(LPAREN);
			setState(1078);
			selectStmt();
			setState(1079);
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
		enterRule(_localctx, 130, RULE_selectQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			match(SELECT);
			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				{
				setState(1082);
				match(DISTINCT);
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1083);
					match(ON);
					setState(1084);
					match(LPAREN);
					setState(1085);
					expressionList();
					setState(1086);
					match(RPAREN);
					}
				}

				}
				break;
			case ALL:
				{
				setState(1090);
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
			case SQLSTATE:
			case NULL:
			case NOT:
			case FOUND:
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
			setState(1093);
			selectList();
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1094);
				fromClause();
				}
			}

			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1097);
				whereClause();
				}
			}

			setState(1101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1100);
				groupByClause();
				}
			}

			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1103);
				havingClause();
				}
			}

			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1106);
				orderByClause();
				}
			}

			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1109);
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
		enterRule(_localctx, 132, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			match(GROUP);
			setState(1113);
			match(BY);
			setState(1114);
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
		enterRule(_localctx, 134, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			match(HAVING);
			setState(1117);
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
		enterRule(_localctx, 136, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(ORDER);
			setState(1120);
			match(BY);
			setState(1121);
			orderByItem();
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1122);
				match(COMMA);
				setState(1123);
				orderByItem();
				}
				}
				setState(1128);
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
		enterRule(_localctx, 138, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1129);
			expression(0);
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1130);
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

			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1133);
				match(NULLS);
				setState(1134);
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
		enterRule(_localctx, 140, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(LIMIT);
			setState(1140);
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
			case SQLSTATE:
			case NULL:
			case NOT:
			case FOUND:
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
				setState(1138);
				expression(0);
				}
				break;
			case ALL:
				{
				setState(1139);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1142);
				match(OFFSET);
				setState(1143);
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
		enterRule(_localctx, 142, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			parameter();
			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1147);
				match(COMMA);
				setState(1148);
				parameter();
				}
				}
				setState(1153);
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
		enterRule(_localctx, 144, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(Identifier);
			setState(1155);
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
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public SpecialVariableContext specialVariable() {
			return getRuleContext(SpecialVariableContext.class,0);
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
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1158);
				literal();
				}
				break;
			case 2:
				{
				setState(1159);
				variableRef();
				}
				break;
			case 3:
				{
				setState(1160);
				functionCall();
				}
				break;
			case 4:
				{
				setState(1161);
				windowFunction();
				}
				break;
			case 5:
				{
				setState(1162);
				specialVariable();
				}
				break;
			case 6:
				{
				setState(1163);
				match(INTERVAL);
				setState(1164);
				match(StringLiteral);
				}
				break;
			case 7:
				{
				setState(1165);
				match(CAST);
				setState(1166);
				match(LPAREN);
				setState(1167);
				expression(0);
				setState(1168);
				match(AS);
				setState(1169);
				dataType(0);
				setState(1170);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(1172);
				match(COALESCE);
				setState(1173);
				match(LPAREN);
				setState(1174);
				expressionList();
				setState(1175);
				match(RPAREN);
				}
				break;
			case 9:
				{
				setState(1177);
				match(NULLIF);
				setState(1178);
				match(LPAREN);
				setState(1179);
				expression(0);
				setState(1180);
				match(COMMA);
				setState(1181);
				expression(0);
				setState(1182);
				match(RPAREN);
				}
				break;
			case 10:
				{
				setState(1184);
				match(GREATEST);
				setState(1185);
				match(LPAREN);
				setState(1186);
				expressionList();
				setState(1187);
				match(RPAREN);
				}
				break;
			case 11:
				{
				setState(1189);
				match(LEAST);
				setState(1190);
				match(LPAREN);
				setState(1191);
				expressionList();
				setState(1192);
				match(RPAREN);
				}
				break;
			case 12:
				{
				setState(1194);
				match(EXISTS);
				setState(1195);
				match(LPAREN);
				setState(1196);
				selectStmt();
				setState(1197);
				match(RPAREN);
				}
				break;
			case 13:
				{
				setState(1199);
				match(LPAREN);
				setState(1200);
				selectStmt();
				setState(1201);
				match(RPAREN);
				}
				break;
			case 14:
				{
				setState(1203);
				match(LPAREN);
				setState(1204);
				expression(0);
				setState(1205);
				match(RPAREN);
				}
				break;
			case 15:
				{
				setState(1207);
				match(NOT);
				setState(1208);
				expression(5);
				}
				break;
			case 16:
				{
				setState(1209);
				match(CASE);
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 8863084066665136129L) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & -8935141454511078399L) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & 541300097025L) != 0)) {
					{
					setState(1210);
					expression(0);
					}
				}

				setState(1213);
				whenExprClauseList();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1214);
					match(ELSE);
					setState(1215);
					expression(0);
					}
				}

				setState(1218);
				match(END);
				}
				break;
			case 17:
				{
				setState(1220);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1223);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1224);
						_la = _input.LA(1);
						if ( !(((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 49153L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1225);
						expression(15);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1226);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1227);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1228);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1229);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1230);
						match(CONCAT);
						setState(1231);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1232);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1233);
						_la = _input.LA(1);
						if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1234);
						expression(12);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1235);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1237);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1236);
							match(NOT);
							}
						}

						setState(1239);
						match(BETWEEN);
						setState(1240);
						expression(0);
						setState(1241);
						match(AND);
						setState(1242);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1244);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1246);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1245);
							match(NOT);
							}
						}

						setState(1248);
						_la = _input.LA(1);
						if ( !(_la==LIKE || _la==ILIKE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1249);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1250);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1251);
						match(SIMILAR);
						setState(1252);
						match(TO);
						setState(1253);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1254);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1255);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1256);
						expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1257);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1258);
						match(TYPECAST);
						setState(1259);
						dataType(0);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1260);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1261);
						_la = _input.LA(1);
						if ( !(((((_la - 166)) & ~0x3f) == 0 && ((1L << (_la - 166)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1262);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1263);
						match(LPAREN);
						setState(1266);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SELECT:
						case WITH:
							{
							setState(1264);
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
						case SQLSTATE:
						case NULL:
						case NOT:
						case FOUND:
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
							setState(1265);
							expressionList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1268);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1270);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1271);
						match(IS);
						setState(1273);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1272);
							match(NOT);
							}
						}

						setState(1275);
						match(NULL);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1278);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1277);
							match(NOT);
							}
						}

						setState(1280);
						match(IN);
						setState(1281);
						match(LPAREN);
						setState(1284);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case SELECT:
						case WITH:
							{
							setState(1282);
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
						case SQLSTATE:
						case NULL:
						case NOT:
						case FOUND:
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
							setState(1283);
							expressionList();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1286);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(1292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,167,_ctx);
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
		enterRule(_localctx, 148, RULE_whenExprClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1293);
				whenExprClause();
				}
				}
				setState(1296); 
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
		enterRule(_localctx, 150, RULE_whenExprClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(WHEN);
			setState(1299);
			expression(0);
			setState(1300);
			match(THEN);
			setState(1301);
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
		enterRule(_localctx, 152, RULE_arrayExpression);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(ARRAY);
				setState(1304);
				match(LBRACK);
				setState(1305);
				expressionList();
				setState(1306);
				match(RBRACK);
				}
				break;
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				variableRef();
				setState(1309);
				match(LBRACK);
				setState(1310);
				expression(0);
				setState(1311);
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
	public static class SpecialVariableContext extends ParserRuleContext {
		public TerminalNode SQLSTATE() { return getToken(PlpgsqlParser.SQLSTATE, 0); }
		public TerminalNode FOUND() { return getToken(PlpgsqlParser.FOUND, 0); }
		public SpecialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSpecialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSpecialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSpecialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialVariableContext specialVariable() throws RecognitionException {
		SpecialVariableContext _localctx = new SpecialVariableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_specialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_la = _input.LA(1);
			if ( !(_la==SQLSTATE || _la==FOUND) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode DISTINCT() { return getToken(PlpgsqlParser.DISTINCT, 0); }
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
		enterRule(_localctx, 156, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(Identifier);
			setState(1318);
			match(LPAREN);
			setState(1323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISTINCT:
				{
				setState(1319);
				match(DISTINCT);
				setState(1320);
				expressionList();
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
			case SQLSTATE:
			case NULL:
			case NOT:
			case FOUND:
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
				setState(1321);
				expressionList();
				}
				break;
			case STAR:
				{
				setState(1322);
				match(STAR);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1325);
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
	public static class WindowFunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode OVER() { return getToken(PlpgsqlParser.OVER, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_windowFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			functionCall();
			setState(1328);
			match(OVER);
			setState(1329);
			match(LPAREN);
			setState(1330);
			windowSpec();
			setState(1331);
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
	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(PlpgsqlParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PlpgsqlParser.BY, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterWindowSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitWindowSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWindowSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1333);
				match(PARTITION);
				setState(1334);
				match(BY);
				setState(1335);
				expressionList();
				}
			}

			setState(1339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1338);
				orderByClause();
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
	public static class SqlGenericStmtContext extends ParserRuleContext {
		public List<TerminalNode> SEMI() { return getTokens(PlpgsqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PlpgsqlParser.SEMI, i);
		}
		public TerminalNode WITH() { return getToken(PlpgsqlParser.WITH, 0); }
		public TerminalNode SELECT() { return getToken(PlpgsqlParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PlpgsqlParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PlpgsqlParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PlpgsqlParser.DELETE, 0); }
		public TerminalNode CREATE() { return getToken(PlpgsqlParser.CREATE, 0); }
		public TerminalNode DROP() { return getToken(PlpgsqlParser.DROP, 0); }
		public TerminalNode ALTER() { return getToken(PlpgsqlParser.ALTER, 0); }
		public TerminalNode TRUNCATE() { return getToken(PlpgsqlParser.TRUNCATE, 0); }
		public TerminalNode ANALYZE() { return getToken(PlpgsqlParser.ANALYZE, 0); }
		public TerminalNode VACUUM() { return getToken(PlpgsqlParser.VACUUM, 0); }
		public TerminalNode EXPLAIN() { return getToken(PlpgsqlParser.EXPLAIN, 0); }
		public TerminalNode LOCK() { return getToken(PlpgsqlParser.LOCK, 0); }
		public TerminalNode REINDEX() { return getToken(PlpgsqlParser.REINDEX, 0); }
		public TerminalNode CLUSTER() { return getToken(PlpgsqlParser.CLUSTER, 0); }
		public TerminalNode COMMENT() { return getToken(PlpgsqlParser.COMMENT, 0); }
		public SqlGenericStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlGenericStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterSqlGenericStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitSqlGenericStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSqlGenericStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlGenericStmtContext sqlGenericStmt() throws RecognitionException {
		SqlGenericStmtContext _localctx = new SqlGenericStmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sqlGenericStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152922024295792640L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -36028797018963969L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & 511L) != 0)) {
				{
				{
				setState(1342);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==SEMI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1348);
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
		enterRule(_localctx, 164, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_la = _input.LA(1);
			if ( !(((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & -2305843008811040767L) != 0) || _la==DollarQuotedString) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTempTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PlpgsqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PlpgsqlParser.TABLE, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public CreateTableColumnDefListContext createTableColumnDefList() {
			return getRuleContext(CreateTableColumnDefListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public TerminalNode IF() { return getToken(PlpgsqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PlpgsqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PlpgsqlParser.EXISTS, 0); }
		public OnCommitClauseContext onCommitClause() {
			return getRuleContext(OnCommitClauseContext.class,0);
		}
		public TerminalNode TEMP() { return getToken(PlpgsqlParser.TEMP, 0); }
		public TerminalNode TEMPORARY() { return getToken(PlpgsqlParser.TEMPORARY, 0); }
		public CreateTempTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTempTableStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCreateTempTableStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCreateTempTableStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCreateTempTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTempTableStmtContext createTempTableStmt() throws RecognitionException {
		CreateTempTableStmtContext _localctx = new CreateTempTableStmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_createTempTableStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(CREATE);
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP || _la==TEMPORARY) {
				{
				setState(1353);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1356);
			match(TABLE);
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1357);
				match(IF);
				setState(1358);
				match(NOT);
				setState(1359);
				match(EXISTS);
				}
			}

			setState(1362);
			match(Identifier);
			setState(1363);
			match(LPAREN);
			setState(1364);
			createTableColumnDefList();
			setState(1365);
			match(RPAREN);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(1366);
				onCommitClause();
				}
			}

			setState(1369);
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
	public static class CreateTableColumnDefListContext extends ParserRuleContext {
		public List<CreateTableColumnDefContext> createTableColumnDef() {
			return getRuleContexts(CreateTableColumnDefContext.class);
		}
		public CreateTableColumnDefContext createTableColumnDef(int i) {
			return getRuleContext(CreateTableColumnDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
		}
		public CreateTableColumnDefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableColumnDefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCreateTableColumnDefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCreateTableColumnDefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCreateTableColumnDefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableColumnDefListContext createTableColumnDefList() throws RecognitionException {
		CreateTableColumnDefListContext _localctx = new CreateTableColumnDefListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_createTableColumnDefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1371);
			createTableColumnDef();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1372);
				match(COMMA);
				setState(1373);
				createTableColumnDef();
				}
				}
				setState(1378);
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
	public static class CreateTableColumnDefContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CreateTableColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableColumnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterCreateTableColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitCreateTableColumnDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCreateTableColumnDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableColumnDefContext createTableColumnDef() throws RecognitionException {
		CreateTableColumnDefContext _localctx = new CreateTableColumnDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_createTableColumnDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(Identifier);
			setState(1380);
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
	public static class OnCommitClauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PlpgsqlParser.ON, 0); }
		public TerminalNode COMMIT() { return getToken(PlpgsqlParser.COMMIT, 0); }
		public TerminalNode DROP() { return getToken(PlpgsqlParser.DROP, 0); }
		public TerminalNode DELETE() { return getToken(PlpgsqlParser.DELETE, 0); }
		public TerminalNode ROWS() { return getToken(PlpgsqlParser.ROWS, 0); }
		public TerminalNode PRESERVE() { return getToken(PlpgsqlParser.PRESERVE, 0); }
		public OnCommitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onCommitClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).enterOnCommitClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlpgsqlParserListener ) ((PlpgsqlParserListener)listener).exitOnCommitClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOnCommitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnCommitClauseContext onCommitClause() throws RecognitionException {
		OnCommitClauseContext _localctx = new OnCommitClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_onCommitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(ON);
			setState(1383);
			match(COMMIT);
			setState(1389);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DROP:
				{
				setState(1384);
				match(DROP);
				}
				break;
			case DELETE:
				{
				setState(1385);
				match(DELETE);
				setState(1386);
				match(ROWS);
				}
				break;
			case PRESERVE:
				{
				setState(1387);
				match(PRESERVE);
				setState(1388);
				match(ROWS);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return dataType_sempred((DataTypeContext)_localctx, predIndex);
		case 73:
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
		"\u0004\u0001\u00c8\u0570\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0001\u0000\u0003\u0000\u00b0\b\u0000\u0001"+
		"\u0000\u0003\u0000\u00b3\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u00b8\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00bc\b\u0000"+
		"\u0001\u0000\u0003\u0000\u00bf\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		"\u00c9\b\u0003\u000b\u0003\f\u0003\u00ca\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00cf\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d4"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00da"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00e4\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00f0\b\u0004\u0001\u0004\u0003"+
		"\u0004\u00f3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00fe"+
		"\b\u0005\u0001\u0005\u0003\u0005\u0101\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0108\b\u0005\u0001\u0005"+
		"\u0003\u0005\u010b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0113\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0119\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0122\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0128\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u012d\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u013a\b\u0005\u0003\u0005\u013c\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0142\b\u0005\u0005\u0005\u0144\b"+
		"\u0005\n\u0005\f\u0005\u0147\t\u0005\u0001\u0006\u0005\u0006\u014a\b\u0006"+
		"\n\u0006\f\u0006\u014d\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u016c\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0176\b\t\n\t\f\t\u0179\t\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u017e\b\t\n\t\f\t\u0181\t\t\u0003\t\u0183"+
		"\b\t\u0001\n\u0003\n\u0186\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u018c\b\n\u0001\n\u0001\n\u0003\n\u0190\b\n\u0001\n\u0003\n\u0193\b\n"+
		"\u0001\n\u0003\n\u0196\b\n\u0001\n\u0003\n\u0199\b\n\u0001\n\u0003\n\u019c"+
		"\b\n\u0001\n\u0003\n\u019f\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u01a7\b\u000b\n\u000b\f\u000b\u01aa"+
		"\t\u000b\u0003\u000b\u01ac\b\u000b\u0001\f\u0001\f\u0003\f\u01b0\b\f\u0001"+
		"\f\u0003\f\u01b3\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u01b8\b\r\n\r\f\r"+
		"\u01bb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u01c0\b\u000e"+
		"\n\u000e\f\u000e\u01c3\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f\u01c7"+
		"\b\u000f\u0001\u000f\u0003\u000f\u01ca\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u01cf\b\u000f\u0001\u000f\u0003\u000f\u01d2\b"+
		"\u000f\u0001\u000f\u0003\u000f\u01d5\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u01db\b\u000f\u0001\u000f\u0003\u000f\u01de"+
		"\b\u000f\u0003\u000f\u01e0\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01e5\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u01f0\b\u0010\u0003\u0010\u01f2\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01f7\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01fb"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01ff\b\u0011\u0001\u0011"+
		"\u0003\u0011\u0202\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u020a\b\u0013\u0001\u0013\u0003\u0013"+
		"\u020d\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0215\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0219\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0224\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u022f\b\u0015\n\u0015"+
		"\f\u0015\u0232\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0239\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0244\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0249\b\u0015\u0001\u0015\u0003\u0015\u024c\b\u0015\u0001\u0015\u0003"+
		"\u0015\u024f\b\u0015\u0001\u0015\u0003\u0015\u0252\b\u0015\u0001\u0015"+
		"\u0003\u0015\u0255\b\u0015\u0001\u0015\u0003\u0015\u0258\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u025f"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0263\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0268\b\u0016\n\u0016\f\u0016\u026b"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0270\b\u0017"+
		"\n\u0017\f\u0017\u0273\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u027a\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0281\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0288\b\u0019\n"+
		"\u0019\f\u0019\u028b\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0295"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u029c\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02ab\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0005\u001d\u02b6\b\u001d\n\u001d\f\u001d\u02b9\t\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u02bd\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u02c5\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02ca\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0004\u001f\u02d1\b\u001f"+
		"\u000b\u001f\f\u001f\u02d2\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0003"+
		"!\u02db\b!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02e2\b!\u0001!\u0001"+
		"!\u0001\"\u0003\"\u02e7\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u02f0\b\"\u0001\"\u0001\"\u0001#\u0003#\u02f5\b#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u02fb\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0303\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u030a"+
		"\b#\u0001#\u0001#\u0001#\u0003#\u030f\b#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0003#\u031a\b#\u0001#\u0001#\u0003#\u031e"+
		"\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0325\b$\u0001$\u0003$\u0328"+
		"\b$\u0001$\u0003$\u032b\b$\u0001$\u0003$\u032e\b$\u0001$\u0003$\u0331"+
		"\b$\u0001$\u0003$\u0334\b$\u0001$\u0003$\u0337\b$\u0001%\u0003%\u033a"+
		"\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u0340\b%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u034a\b%\u0001%\u0001%\u0001&\u0001"+
		"&\u0003&\u0350\b&\u0001&\u0001&\u0003&\u0354\b&\u0001&\u0001&\u0001\'"+
		"\u0001\'\u0003\'\u035a\b\'\u0001\'\u0001\'\u0003\'\u035e\b\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0003(\u0364\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u0377\b(\u0001(\u0001(\u0003(\u037b\b(\u0001)\u0001)\u0003"+
		")\u037f\b)\u0001)\u0001)\u0001)\u0003)\u0384\b)\u0001)\u0003)\u0387\b"+
		")\u0001)\u0001)\u0003)\u038b\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005"+
		"*\u0392\b*\n*\f*\u0395\t*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u039f\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0003.\u03a8\b.\u0001.\u0001.\u0001/\u0001/\u0003/\u03ae\b/\u0001/\u0001"+
		"/\u0003/\u03b2\b/\u0001/\u0003/\u03b5\b/\u0001/\u0001/\u00010\u00030\u03ba"+
		"\b0\u00010\u00030\u03bd\b0\u00010\u00030\u03c0\b0\u00010\u00010\u0001"+
		"0\u00030\u03c5\b0\u00010\u00010\u00030\u03c9\b0\u00010\u00010\u00011\u0001"+
		"1\u00011\u00012\u00042\u03d1\b2\u000b2\f2\u03d2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00054\u03dd\b4\n4\f4\u03e0\t4\u00015\u0001"+
		"5\u00015\u00035\u03e5\b5\u00016\u00016\u00036\u03e9\b6\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00057\u03f2\b7\n7\f7\u03f5\t7\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0003:\u0403\b:\u0001:\u0001:\u0003:\u0407\b:\u0001:\u0001:\u0001;\u0001"+
		";\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0003"+
		"=\u0416\b=\u0001=\u0001=\u0001=\u0003=\u041b\b=\u0001=\u0005=\u041e\b"+
		"=\n=\f=\u0421\t=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u0429"+
		"\b?\n?\f?\u042c\t?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0433\b@"+
		"\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0003A\u0441\bA\u0001A\u0003A\u0444\bA\u0001A\u0001A\u0003"+
		"A\u0448\bA\u0001A\u0003A\u044b\bA\u0001A\u0003A\u044e\bA\u0001A\u0003"+
		"A\u0451\bA\u0001A\u0003A\u0454\bA\u0001A\u0003A\u0457\bA\u0001B\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0005D\u0465\bD\nD\fD\u0468\tD\u0001E\u0001E\u0003E\u046c\bE\u0001E"+
		"\u0001E\u0003E\u0470\bE\u0001F\u0001F\u0001F\u0003F\u0475\bF\u0001F\u0001"+
		"F\u0003F\u0479\bF\u0001G\u0001G\u0001G\u0005G\u047e\bG\nG\fG\u0481\tG"+
		"\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u04bc\bI\u0001"+
		"I\u0001I\u0001I\u0003I\u04c1\bI\u0001I\u0001I\u0001I\u0003I\u04c6\bI\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u04d6\bI\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u04df\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u04f3\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u04fa\bI\u0001I\u0001I\u0001I\u0003I\u04ff\bI\u0001I\u0001I\u0001I\u0001"+
		"I\u0003I\u0505\bI\u0001I\u0001I\u0005I\u0509\bI\nI\fI\u050c\tI\u0001J"+
		"\u0004J\u050f\bJ\u000bJ\fJ\u0510\u0001K\u0001K\u0001K\u0001K\u0001K\u0001"+
		"L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003"+
		"L\u0522\bL\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003"+
		"N\u052c\bN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"P\u0001P\u0001P\u0003P\u0539\bP\u0001P\u0003P\u053c\bP\u0001Q\u0001Q\u0005"+
		"Q\u0540\bQ\nQ\fQ\u0543\tQ\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0003"+
		"S\u054b\bS\u0001S\u0001S\u0001S\u0001S\u0003S\u0551\bS\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u0558\bS\u0001S\u0001S\u0001T\u0001T\u0001T\u0005"+
		"T\u055f\bT\nT\fT\u0562\tT\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0003V\u056e\bV\u0001V\u0000\u0002\n\u0092W\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\u0015\u0002\u0000"+
		"\r\r\u0082\u0082\u0001\u0000\u00a1\u00a2\u0002\u0000//\u00a6\u00a6\u0002"+
		"\u0000\u0004\u0004sw\u0001\u0000x|\u0001\u0000NO\u0001\u0000\u007f\u0080"+
		"\u0001\u0000>@\u0001\u000078\u0001\u0000:;\u0002\u0000\u00a0\u00a0\u00ae"+
		"\u00af\u0001\u0000\u00ac\u00ad\u0001\u0000\u00a6\u00ab\u0001\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0085\u0086\u0002\u000011\u00b5\u00b6\u0002\u0000x"+
		"x\u0099\u0099\u0003\u0000\u0015\u001f#&<<\u0001\u0000\u00b7\u00b7\u0003"+
		"\u0000\u0083\u0083\u009e\u009f\u00c0\u00c3\u0001\u0000!\"\u0623\u0000"+
		"\u00af\u0001\u0000\u0000\u0000\u0002\u00c0\u0001\u0000\u0000\u0000\u0004"+
		"\u00c4\u0001\u0000\u0000\u0000\u0006\u00c8\u0001\u0000\u0000\u0000\b\u00f2"+
		"\u0001\u0000\u0000\u0000\n\u013b\u0001\u0000\u0000\u0000\f\u014b\u0001"+
		"\u0000\u0000\u0000\u000e\u016b\u0001\u0000\u0000\u0000\u0010\u016d\u0001"+
		"\u0000\u0000\u0000\u0012\u0182\u0001\u0000\u0000\u0000\u0014\u0185\u0001"+
		"\u0000\u0000\u0000\u0016\u01ab\u0001\u0000\u0000\u0000\u0018\u01ad\u0001"+
		"\u0000\u0000\u0000\u001a\u01b4\u0001\u0000\u0000\u0000\u001c\u01bc\u0001"+
		"\u0000\u0000\u0000\u001e\u01df\u0001\u0000\u0000\u0000 \u01f1\u0001\u0000"+
		"\u0000\u0000\"\u0201\u0001\u0000\u0000\u0000$\u0203\u0001\u0000\u0000"+
		"\u0000&\u0206\u0001\u0000\u0000\u0000(\u0210\u0001\u0000\u0000\u0000*"+
		"\u0262\u0001\u0000\u0000\u0000,\u0264\u0001\u0000\u0000\u0000.\u026c\u0001"+
		"\u0000\u0000\u00000\u0274\u0001\u0000\u0000\u00002\u0284\u0001\u0000\u0000"+
		"\u00004\u028c\u0001\u0000\u0000\u00006\u0290\u0001\u0000\u0000\u00008"+
		"\u02aa\u0001\u0000\u0000\u0000:\u02ac\u0001\u0000\u0000\u0000<\u02c2\u0001"+
		"\u0000\u0000\u0000>\u02d0\u0001\u0000\u0000\u0000@\u02d4\u0001\u0000\u0000"+
		"\u0000B\u02da\u0001\u0000\u0000\u0000D\u02e6\u0001\u0000\u0000\u0000F"+
		"\u031d\u0001\u0000\u0000\u0000H\u0336\u0001\u0000\u0000\u0000J\u0339\u0001"+
		"\u0000\u0000\u0000L\u034d\u0001\u0000\u0000\u0000N\u0357\u0001\u0000\u0000"+
		"\u0000P\u037a\u0001\u0000\u0000\u0000R\u037c\u0001\u0000\u0000\u0000T"+
		"\u038e\u0001\u0000\u0000\u0000V\u0396\u0001\u0000\u0000\u0000X\u039a\u0001"+
		"\u0000\u0000\u0000Z\u03a2\u0001\u0000\u0000\u0000\\\u03a5\u0001\u0000"+
		"\u0000\u0000^\u03ab\u0001\u0000\u0000\u0000`\u03b9\u0001\u0000\u0000\u0000"+
		"b\u03cc\u0001\u0000\u0000\u0000d\u03d0\u0001\u0000\u0000\u0000f\u03d4"+
		"\u0001\u0000\u0000\u0000h\u03d9\u0001\u0000\u0000\u0000j\u03e4\u0001\u0000"+
		"\u0000\u0000l\u03e6\u0001\u0000\u0000\u0000n\u03ee\u0001\u0000\u0000\u0000"+
		"p\u03f6\u0001\u0000\u0000\u0000r\u03fa\u0001\u0000\u0000\u0000t\u03fc"+
		"\u0001\u0000\u0000\u0000v\u040a\u0001\u0000\u0000\u0000x\u040e\u0001\u0000"+
		"\u0000\u0000z\u0415\u0001\u0000\u0000\u0000|\u0422\u0001\u0000\u0000\u0000"+
		"~\u0425\u0001\u0000\u0000\u0000\u0080\u042d\u0001\u0000\u0000\u0000\u0082"+
		"\u0439\u0001\u0000\u0000\u0000\u0084\u0458\u0001\u0000\u0000\u0000\u0086"+
		"\u045c\u0001\u0000\u0000\u0000\u0088\u045f\u0001\u0000\u0000\u0000\u008a"+
		"\u0469\u0001\u0000\u0000\u0000\u008c\u0471\u0001\u0000\u0000\u0000\u008e"+
		"\u047a\u0001\u0000\u0000\u0000\u0090\u0482\u0001\u0000\u0000\u0000\u0092"+
		"\u04c5\u0001\u0000\u0000\u0000\u0094\u050e\u0001\u0000\u0000\u0000\u0096"+
		"\u0512\u0001\u0000\u0000\u0000\u0098\u0521\u0001\u0000\u0000\u0000\u009a"+
		"\u0523\u0001\u0000\u0000\u0000\u009c\u0525\u0001\u0000\u0000\u0000\u009e"+
		"\u052f\u0001\u0000\u0000\u0000\u00a0\u0538\u0001\u0000\u0000\u0000\u00a2"+
		"\u053d\u0001\u0000\u0000\u0000\u00a4\u0546\u0001\u0000\u0000\u0000\u00a6"+
		"\u0548\u0001\u0000\u0000\u0000\u00a8\u055b\u0001\u0000\u0000\u0000\u00aa"+
		"\u0563\u0001\u0000\u0000\u0000\u00ac\u0566\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b0\u0003\u0002\u0001\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b3\u0003\u0004\u0002\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b7\u0003\f\u0006\u0000\u00b6\u00b8"+
		"\u0003b1\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0003"+
		"\u0000\u0000\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00be\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bf\u0005\u00b7\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u0001\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\u00be\u0000\u0000\u00c1\u00c2\u0005\u00c4"+
		"\u0000\u0000\u00c2\u00c3\u0005\u00bf\u0000\u0000\u00c3\u0003\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0001\u0000\u0000\u00c5\u00c6\u0003\u0006"+
		"\u0003\u0000\u00c6\u0005\u0001\u0000\u0000\u0000\u00c7\u00c9\u0003\b\u0004"+
		"\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u0007\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u00c4\u0000"+
		"\u0000\u00cd\u00cf\u0005\u0087\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0003\n\u0005\u0000\u00d1\u00d2\u0005\u0084\u0000\u0000"+
		"\u00d2\u00d4\u0005\u0083\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d6\u0005\u00a4\u0000\u0000\u00d6\u00da\u0003\u0092I\u0000\u00d7"+
		"\u00d8\u0005\u0088\u0000\u0000\u00d8\u00da\u0003\u0092I\u0000\u00d9\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\u00b7\u0000\u0000\u00dc\u00f3\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\u00c4\u0000\u0000\u00de\u00e3\u0005\u009a\u0000\u0000\u00df\u00e0"+
		"\u0005\u00ba\u0000\u0000\u00e0\u00e1\u0003\u008eG\u0000\u00e1\u00e2\u0005"+
		"\u00bb\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0007\u0000\u0000\u0000\u00e6\u00e7\u0003"+
		"z=\u0000\u00e7\u00e8\u0005\u00b7\u0000\u0000\u00e8\u00f3\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0005\u00c4\u0000\u0000\u00ea\u00eb\u0005\u009b\u0000"+
		"\u0000\u00eb\u00ef\u0005\r\u0000\u0000\u00ec\u00f0\u0005\u00c4\u0000\u0000"+
		"\u00ed\u00ee\u0005\u00a3\u0000\u0000\u00ee\u00f0\u0005\u00c0\u0000\u0000"+
		"\u00ef\u00ec\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005\u00b7\u0000\u0000"+
		"\u00f2\u00cc\u0001\u0000\u0000\u0000\u00f2\u00dd\u0001\u0000\u0000\u0000"+
		"\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f3\t\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0006\u0005\uffff\uffff\u0000\u00f5\u013c\u0005P\u0000\u0000\u00f6"+
		"\u013c\u0005Q\u0000\u0000\u00f7\u013c\u0005R\u0000\u0000\u00f8\u0100\u0005"+
		"S\u0000\u0000\u00f9\u00fa\u0005\u00ba\u0000\u0000\u00fa\u00fd\u0005\u00c0"+
		"\u0000\u0000\u00fb\u00fc\u0005\u00b8\u0000\u0000\u00fc\u00fe\u0005\u00c0"+
		"\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\u00bb"+
		"\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000"+
		"\u0000\u0000\u0101\u013c\u0001\u0000\u0000\u0000\u0102\u010a\u0005T\u0000"+
		"\u0000\u0103\u0104\u0005\u00ba\u0000\u0000\u0104\u0107\u0005\u00c0\u0000"+
		"\u0000\u0105\u0106\u0005\u00b8\u0000\u0000\u0106\u0108\u0005\u00c0\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0005\u00bb\u0000"+
		"\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000"+
		"\u0000\u010b\u013c\u0001\u0000\u0000\u0000\u010c\u013c\u0005U\u0000\u0000"+
		"\u010d\u013c\u0005V\u0000\u0000\u010e\u0112\u0005W\u0000\u0000\u010f\u0110"+
		"\u0005\u00ba\u0000\u0000\u0110\u0111\u0005\u00c0\u0000\u0000\u0111\u0113"+
		"\u0005\u00bb\u0000\u0000\u0112\u010f\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u013c\u0001\u0000\u0000\u0000\u0114\u0118"+
		"\u0005X\u0000\u0000\u0115\u0116\u0005\u00ba\u0000\u0000\u0116\u0117\u0005"+
		"\u00c0\u0000\u0000\u0117\u0119\u0005\u00bb\u0000\u0000\u0118\u0115\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u013c\u0001"+
		"\u0000\u0000\u0000\u011a\u013c\u0005Y\u0000\u0000\u011b\u013c\u0005Z\u0000"+
		"\u0000\u011c\u013c\u0005[\u0000\u0000\u011d\u0121\u0005\\\u0000\u0000"+
		"\u011e\u011f\u0005\u00ba\u0000\u0000\u011f\u0120\u0005\u00c0\u0000\u0000"+
		"\u0120\u0122\u0005\u00bb\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u013c\u0001\u0000\u0000\u0000"+
		"\u0123\u0127\u0005]\u0000\u0000\u0124\u0125\u0005\u00ba\u0000\u0000\u0125"+
		"\u0126\u0005\u00c0\u0000\u0000\u0126\u0128\u0005\u00bb\u0000\u0000\u0127"+
		"\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u012c\u0001\u0000\u0000\u0000\u0129\u012a\u0005<\u0000\u0000\u012a\u012b"+
		"\u0005\u00c4\u0000\u0000\u012b\u012d\u0005\u008b\u0000\u0000\u012c\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u013c"+
		"\u0001\u0000\u0000\u0000\u012e\u013c\u0005^\u0000\u0000\u012f\u013c\u0005"+
		"_\u0000\u0000\u0130\u013c\u0005`\u0000\u0000\u0131\u013c\u0005a\u0000"+
		"\u0000\u0132\u013c\u0005b\u0000\u0000\u0133\u013c\u0005c\u0000\u0000\u0134"+
		"\u013c\u0005d\u0000\u0000\u0135\u013c\u0005e\u0000\u0000\u0136\u0139\u0005"+
		"\u00c4\u0000\u0000\u0137\u0138\u0005\u00a0\u0000\u0000\u0138\u013a\u0007"+
		"\u0001\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u00f4\u0001"+
		"\u0000\u0000\u0000\u013b\u00f6\u0001\u0000\u0000\u0000\u013b\u00f7\u0001"+
		"\u0000\u0000\u0000\u013b\u00f8\u0001\u0000\u0000\u0000\u013b\u0102\u0001"+
		"\u0000\u0000\u0000\u013b\u010c\u0001\u0000\u0000\u0000\u013b\u010d\u0001"+
		"\u0000\u0000\u0000\u013b\u010e\u0001\u0000\u0000\u0000\u013b\u0114\u0001"+
		"\u0000\u0000\u0000\u013b\u011a\u0001\u0000\u0000\u0000\u013b\u011b\u0001"+
		"\u0000\u0000\u0000\u013b\u011c\u0001\u0000\u0000\u0000\u013b\u011d\u0001"+
		"\u0000\u0000\u0000\u013b\u0123\u0001\u0000\u0000\u0000\u013b\u012e\u0001"+
		"\u0000\u0000\u0000\u013b\u012f\u0001\u0000\u0000\u0000\u013b\u0130\u0001"+
		"\u0000\u0000\u0000\u013b\u0131\u0001\u0000\u0000\u0000\u013b\u0132\u0001"+
		"\u0000\u0000\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u0134\u0001"+
		"\u0000\u0000\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0136\u0001"+
		"\u0000\u0000\u0000\u013c\u0145\u0001\u0000\u0000\u0000\u013d\u013e\n\u0001"+
		"\u0000\u0000\u013e\u0141\u0005i\u0000\u0000\u013f\u0140\u0005\u00bc\u0000"+
		"\u0000\u0140\u0142\u0005\u00bd\u0000\u0000\u0141\u013f\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000"+
		"\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u000b\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0148\u014a\u0003\u000e\u0007\u0000\u0149\u0148\u0001\u0000\u0000"+
		"\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\r\u0001\u0000\u0000\u0000"+
		"\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u016c\u0003\u0010\b\u0000\u014f"+
		"\u016c\u0003\u0014\n\u0000\u0150\u016c\u0003&\u0013\u0000\u0151\u016c"+
		"\u0003(\u0014\u0000\u0152\u016c\u0003*\u0015\u0000\u0153\u016c\u00030"+
		"\u0018\u0000\u0154\u016c\u00036\u001b\u0000\u0155\u016c\u00038\u001c\u0000"+
		"\u0156\u016c\u0003:\u001d\u0000\u0157\u016c\u0003<\u001e\u0000\u0158\u016c"+
		"\u0003B!\u0000\u0159\u016c\u0003D\"\u0000\u015a\u016c\u0003F#\u0000\u015b"+
		"\u016c\u0003J%\u0000\u015c\u016c\u0003L&\u0000\u015d\u016c\u0003N\'\u0000"+
		"\u015e\u016c\u0003P(\u0000\u015f\u016c\u0003R)\u0000\u0160\u016c\u0003"+
		"X,\u0000\u0161\u016c\u0003Z-\u0000\u0162\u016c\u0003`0\u0000\u0163\u016c"+
		"\u0003l6\u0000\u0164\u016c\u0003t:\u0000\u0165\u016c\u0003v;\u0000\u0166"+
		"\u016c\u0003x<\u0000\u0167\u016c\u0003\\.\u0000\u0168\u016c\u0003^/\u0000"+
		"\u0169\u016c\u0003\u00a6S\u0000\u016a\u016c\u0003\u00a2Q\u0000\u016b\u014e"+
		"\u0001\u0000\u0000\u0000\u016b\u014f\u0001\u0000\u0000\u0000\u016b\u0150"+
		"\u0001\u0000\u0000\u0000\u016b\u0151\u0001\u0000\u0000\u0000\u016b\u0152"+
		"\u0001\u0000\u0000\u0000\u016b\u0153\u0001\u0000\u0000\u0000\u016b\u0154"+
		"\u0001\u0000\u0000\u0000\u016b\u0155\u0001\u0000\u0000\u0000\u016b\u0156"+
		"\u0001\u0000\u0000\u0000\u016b\u0157\u0001\u0000\u0000\u0000\u016b\u0158"+
		"\u0001\u0000\u0000\u0000\u016b\u0159\u0001\u0000\u0000\u0000\u016b\u015a"+
		"\u0001\u0000\u0000\u0000\u016b\u015b\u0001\u0000\u0000\u0000\u016b\u015c"+
		"\u0001\u0000\u0000\u0000\u016b\u015d\u0001\u0000\u0000\u0000\u016b\u015e"+
		"\u0001\u0000\u0000\u0000\u016b\u015f\u0001\u0000\u0000\u0000\u016b\u0160"+
		"\u0001\u0000\u0000\u0000\u016b\u0161\u0001\u0000\u0000\u0000\u016b\u0162"+
		"\u0001\u0000\u0000\u0000\u016b\u0163\u0001\u0000\u0000\u0000\u016b\u0164"+
		"\u0001\u0000\u0000\u0000\u016b\u0165\u0001\u0000\u0000\u0000\u016b\u0166"+
		"\u0001\u0000\u0000\u0000\u016b\u0167\u0001\u0000\u0000\u0000\u016b\u0168"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016a"+
		"\u0001\u0000\u0000\u0000\u016c\u000f\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0003\u0012\t\u0000\u016e\u016f\u0005\u00a4\u0000\u0000\u016f\u0170\u0003"+
		"\u0092I\u0000\u0170\u0171\u0005\u00b7\u0000\u0000\u0171\u0011\u0001\u0000"+
		"\u0000\u0000\u0172\u0177\u0005\u00c4\u0000\u0000\u0173\u0174\u0005\u00b9"+
		"\u0000\u0000\u0174\u0176\u0005\u00c4\u0000\u0000\u0175\u0173\u0001\u0000"+
		"\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0183\u0001\u0000"+
		"\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u017a\u017f\u0005\u00c5"+
		"\u0000\u0000\u017b\u017c\u0005\u00b9\u0000\u0000\u017c\u017e\u0005\u00c5"+
		"\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0172\u0001\u0000\u0000\u0000\u0182\u017a\u0001\u0000"+
		"\u0000\u0000\u0183\u0013\u0001\u0000\u0000\u0000\u0184\u0186\u0003|>\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0005#\u0000\u0000\u0188"+
		"\u0189\u0003\u0016\u000b\u0000\u0189\u018b\u0005)\u0000\u0000\u018a\u018c"+
		"\u0005\u008a\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018f"+
		"\u0003\u001a\r\u0000\u018e\u0190\u0003\u001c\u000e\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0003$\u0012\u0000\u0192\u0191\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0195\u0001\u0000"+
		"\u0000\u0000\u0194\u0196\u0003\u0084B\u0000\u0195\u0194\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0198\u0001\u0000\u0000"+
		"\u0000\u0197\u0199\u0003\u0086C\u0000\u0198\u0197\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000\u0000\u0000"+
		"\u019a\u019c\u0003\u0088D\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b"+
		"\u019c\u0001\u0000\u0000\u0000\u019c\u019e\u0001\u0000\u0000\u0000\u019d"+
		"\u019f\u0003\u008cF\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e\u019f"+
		"\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0005\u00b7\u0000\u0000\u01a1\u0015\u0001\u0000\u0000\u0000\u01a2\u01ac"+
		"\u0005\u00ae\u0000\u0000\u01a3\u01a8\u0003\u0018\f\u0000\u01a4\u01a5\u0005"+
		"\u00b8\u0000\u0000\u01a5\u01a7\u0003\u0018\f\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01a2\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a3\u0001\u0000\u0000\u0000\u01ac\u0017\u0001\u0000"+
		"\u0000\u0000\u01ad\u01b2\u0003\u0092I\u0000\u01ae\u01b0\u0005\u0081\u0000"+
		"\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0005\u00c4\u0000"+
		"\u0000\u01b2\u01af\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u0019\u0001\u0000\u0000\u0000\u01b4\u01b9\u0003\u0012\t\u0000"+
		"\u01b5\u01b6\u0005\u00b8\u0000\u0000\u01b6\u01b8\u0003\u0012\t\u0000\u01b7"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001\u0000\u0000\u0000\u01b9"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba"+
		"\u001b\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0005*\u0000\u0000\u01bd\u01c1\u0003\u001e\u000f\u0000\u01be\u01c0"+
		"\u0003 \u0010\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c2\u001d\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c9\u0005\u00c4\u0000\u0000\u01c5\u01c7\u0005"+
		"\u0081\u0000\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01ca\u0005"+
		"\u00c4\u0000\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01e0\u0001\u0000\u0000\u0000\u01cb\u01ce\u0003"+
		"\u009cN\u0000\u01cc\u01cd\u0005<\u0000\u0000\u01cd\u01cf\u0005\u00c4\u0000"+
		"\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000"+
		"\u0000\u01cf\u01d4\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\u0081\u0000"+
		"\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0005\u00c4\u0000"+
		"\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d5\u01e0\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\u00ba\u0000"+
		"\u0000\u01d7\u01d8\u0003z=\u0000\u01d8\u01dd\u0005\u00bb\u0000\u0000\u01d9"+
		"\u01db\u0005\u0081\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01de\u0005\u00c4\u0000\u0000\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df"+
		"\u01c4\u0001\u0000\u0000\u0000\u01df\u01cb\u0001\u0000\u0000\u0000\u01df"+
		"\u01d6\u0001\u0000\u0000\u0000\u01e0\u001f\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0005\u00b8\u0000\u0000\u01e2\u01f2\u0003\u001e\u000f\u0000\u01e3"+
		"\u01e5\u0003\"\u0011\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e4\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005k\u0000\u0000\u01e7\u01ef\u0003\u001e\u000f\u0000\u01e8\u01e9\u0005"+
		"r\u0000\u0000\u01e9\u01f0\u0003\u0092I\u0000\u01ea\u01eb\u0005\u0089\u0000"+
		"\u0000\u01eb\u01ec\u0005\u00ba\u0000\u0000\u01ec\u01ed\u0003,\u0016\u0000"+
		"\u01ed\u01ee\u0005\u00bb\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000"+
		"\u01ef\u01e8\u0001\u0000\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f1\u01e1\u0001\u0000\u0000\u0000\u01f1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01f2!\u0001\u0000\u0000\u0000\u01f3\u0202\u0005n\u0000\u0000\u01f4\u01f6"+
		"\u0005l\u0000\u0000\u01f5\u01f7\u0005o\u0000\u0000\u01f6\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u0202\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fa\u0005m\u0000\u0000\u01f9\u01fb\u0005o\u0000\u0000"+
		"\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fb\u0202\u0001\u0000\u0000\u0000\u01fc\u01fe\u0005p\u0000\u0000\u01fd"+
		"\u01ff\u0005o\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u0202"+
		"\u0005q\u0000\u0000\u0201\u01f3\u0001\u0000\u0000\u0000\u0201\u01f4\u0001"+
		"\u0000\u0000\u0000\u0201\u01f8\u0001\u0000\u0000\u0000\u0201\u01fc\u0001"+
		"\u0000\u0000\u0000\u0201\u0200\u0001\u0000\u0000\u0000\u0202#\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0005+\u0000\u0000\u0204\u0205\u0003\u0092I\u0000"+
		"\u0205%\u0001\u0000\u0000\u0000\u0206\u0207\u0005\'\u0000\u0000\u0207"+
		"\u0209\u0003\u0016\u000b\u0000\u0208\u020a\u0003\u001c\u000e\u0000\u0209"+
		"\u0208\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0001\u0000\u0000\u0000\u020b\u020d\u0003$\u0012\u0000\u020c\u020b"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0005\u00b7\u0000\u0000\u020f\'\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0005(\u0000\u0000\u0211\u0214\u0003\u0092"+
		"I\u0000\u0212\u0213\u0005)\u0000\u0000\u0213\u0215\u0003\u001a\r\u0000"+
		"\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000"+
		"\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0217\u0005\u0089\u0000\u0000"+
		"\u0217\u0219\u0003.\u0017\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a"+
		"\u021b\u0005\u00b7\u0000\u0000\u021b)\u0001\u0000\u0000\u0000\u021c\u021d"+
		"\u0005$\u0000\u0000\u021d\u021e\u0005)\u0000\u0000\u021e\u0223\u0005\u00c4"+
		"\u0000\u0000\u021f\u0220\u0005\u00ba\u0000\u0000\u0220\u0221\u0003,\u0016"+
		"\u0000\u0221\u0222\u0005\u00bb\u0000\u0000\u0222\u0224\u0001\u0000\u0000"+
		"\u0000\u0223\u021f\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0226\u0005-\u0000\u0000"+
		"\u0226\u0227\u0005\u00ba\u0000\u0000\u0227\u0228\u0003.\u0017\u0000\u0228"+
		"\u0230\u0005\u00bb\u0000\u0000\u0229\u022a\u0005\u00b8\u0000\u0000\u022a"+
		"\u022b\u0005\u00ba\u0000\u0000\u022b\u022c\u0003.\u0017\u0000\u022c\u022d"+
		"\u0005\u00bb\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u0229"+
		"\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u022e"+
		"\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0238"+
		"\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233\u0234"+
		"\u0005.\u0000\u0000\u0234\u0235\u0003.\u0017\u0000\u0235\u0236\u0005)"+
		"\u0000\u0000\u0236\u0237\u0003\u001a\r\u0000\u0237\u0239\u0001\u0000\u0000"+
		"\u0000\u0238\u0233\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000"+
		"\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u00b7\u0000"+
		"\u0000\u023b\u0263\u0001\u0000\u0000\u0000\u023c\u023d\u0005$\u0000\u0000"+
		"\u023d\u023e\u0005)\u0000\u0000\u023e\u0243\u0005\u00c4\u0000\u0000\u023f"+
		"\u0240\u0005\u00ba\u0000\u0000\u0240\u0241\u0003,\u0016\u0000\u0241\u0242"+
		"\u0005\u00bb\u0000\u0000\u0242\u0244\u0001\u0000\u0000\u0000\u0243\u023f"+
		"\u0001\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0001\u0000\u0000\u0000\u0245\u0246\u0005#\u0000\u0000\u0246\u0248\u0003"+
		"\u0016\u000b\u0000\u0247\u0249\u0003\u001c\u000e\u0000\u0248\u0247\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001"+
		"\u0000\u0000\u0000\u024a\u024c\u0003$\u0012\u0000\u024b\u024a\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e\u0001\u0000"+
		"\u0000\u0000\u024d\u024f\u0003\u0084B\u0000\u024e\u024d\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0251\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0003\u0086C\u0000\u0251\u0250\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0254\u0001\u0000\u0000\u0000"+
		"\u0253\u0255\u0003\u0088D\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0003\u008cF\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u025e\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0005.\u0000\u0000\u025a\u025b\u0003.\u0017\u0000\u025b\u025c\u0005)"+
		"\u0000\u0000\u025c\u025d\u0003\u001a\r\u0000\u025d\u025f\u0001\u0000\u0000"+
		"\u0000\u025e\u0259\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u00b7\u0000"+
		"\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u021c\u0001\u0000\u0000"+
		"\u0000\u0262\u023c\u0001\u0000\u0000\u0000\u0263+\u0001\u0000\u0000\u0000"+
		"\u0264\u0269\u0005\u00c4\u0000\u0000\u0265\u0266\u0005\u00b8\u0000\u0000"+
		"\u0266\u0268\u0005\u00c4\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000"+
		"\u0269\u026a\u0001\u0000\u0000\u0000\u026a-\u0001\u0000\u0000\u0000\u026b"+
		"\u0269\u0001\u0000\u0000\u0000\u026c\u0271\u0003\u0092I\u0000\u026d\u026e"+
		"\u0005\u00b8\u0000\u0000\u026e\u0270\u0003\u0092I\u0000\u026f\u026d\u0001"+
		"\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272/\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u0005%\u0000"+
		"\u0000\u0275\u0276\u0005\u00c4\u0000\u0000\u0276\u0277\u0005,\u0000\u0000"+
		"\u0277\u0279\u00032\u0019\u0000\u0278\u027a\u0003$\u0012\u0000\u0279\u0278"+
		"\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u0280"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0005.\u0000\u0000\u027c\u027d\u0003"+
		".\u0017\u0000\u027d\u027e\u0005)\u0000\u0000\u027e\u027f\u0003\u001a\r"+
		"\u0000\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u027b\u0001\u0000\u0000"+
		"\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0005\u00b7\u0000\u0000\u02831\u0001\u0000\u0000\u0000"+
		"\u0284\u0289\u00034\u001a\u0000\u0285\u0286\u0005\u00b8\u0000\u0000\u0286"+
		"\u0288\u00034\u001a\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u028b"+
		"\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0001\u0000\u0000\u0000\u028a3\u0001\u0000\u0000\u0000\u028b\u0289\u0001"+
		"\u0000\u0000\u0000\u028c\u028d\u0005\u00c4\u0000\u0000\u028d\u028e\u0005"+
		"\u00a6\u0000\u0000\u028e\u028f\u0003\u0092I\u0000\u028f5\u0001\u0000\u0000"+
		"\u0000\u0290\u0291\u0005&\u0000\u0000\u0291\u0292\u0005*\u0000\u0000\u0292"+
		"\u0294\u0005\u00c4\u0000\u0000\u0293\u0295\u0003$\u0012\u0000\u0294\u0293"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u029b"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0005.\u0000\u0000\u0297\u0298\u0003"+
		".\u0017\u0000\u0298\u0299\u0005)\u0000\u0000\u0299\u029a\u0003\u001a\r"+
		"\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0296\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0005\u00b7\u0000\u0000\u029e7\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0005,\u0000\u0000\u02a0\u02a1\u0005\u00c4\u0000\u0000\u02a1"+
		"\u02a2\u0007\u0002\u0000\u0000\u02a2\u02a3\u0003\u0092I\u0000\u02a3\u02a4"+
		"\u0005\u00b7\u0000\u0000\u02a4\u02ab\u0001\u0000\u0000\u0000\u02a5\u02a6"+
		"\u0005,\u0000\u0000\u02a6\u02a7\u0005\u00c4\u0000\u0000\u02a7\u02a8\u0005"+
		"*\u0000\u0000\u02a8\u02a9\u0005\u0080\u0000\u0000\u02a9\u02ab\u0005\u00b7"+
		"\u0000\u0000\u02aa\u029f\u0001\u0000\u0000\u0000\u02aa\u02a5\u0001\u0000"+
		"\u0000\u0000\u02ab9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\u0005\u0000"+
		"\u0000\u02ad\u02ae\u0003\u0092I\u0000\u02ae\u02af\u0005\u0006\u0000\u0000"+
		"\u02af\u02b7\u0003\f\u0006\u0000\u02b0\u02b1\u0005\u0007\u0000\u0000\u02b1"+
		"\u02b2\u0003\u0092I\u0000\u02b2\u02b3\u0005\u0006\u0000\u0000\u02b3\u02b4"+
		"\u0003\f\u0006\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02bc\u0001"+
		"\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02bb\u0005"+
		"\b\u0000\u0000\u02bb\u02bd\u0003\f\u0006\u0000\u02bc\u02ba\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000"+
		"\u0000\u0000\u02be\u02bf\u0005\u0003\u0000\u0000\u02bf\u02c0\u0005\u0005"+
		"\u0000\u0000\u02c0\u02c1\u0005\u00b7\u0000\u0000\u02c1;\u0001\u0000\u0000"+
		"\u0000\u02c2\u02c4\u0005\t\u0000\u0000\u02c3\u02c5\u0003\u0092I\u0000"+
		"\u02c4\u02c3\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c9\u0003>\u001f\u0000\u02c7"+
		"\u02c8\u0005\b\u0000\u0000\u02c8\u02ca\u0003\f\u0006\u0000\u02c9\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0005\u0003\u0000\u0000\u02cc\u02cd"+
		"\u0005\t\u0000\u0000\u02cd\u02ce\u0005\u00b7\u0000\u0000\u02ce=\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d1\u0003@ \u0000\u02d0\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000"+
		"\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3?\u0001\u0000\u0000\u0000"+
		"\u02d4\u02d5\u0005\n\u0000\u0000\u02d5\u02d6\u0003\u0092I\u0000\u02d6"+
		"\u02d7\u0005\u0006\u0000\u0000\u02d7\u02d8\u0003\f\u0006\u0000\u02d8A"+
		"\u0001\u0000\u0000\u0000\u02d9\u02db\u0003\u0002\u0001\u0000\u02da\u02d9"+
		"\u0001\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc"+
		"\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005\u000b\u0000\u0000\u02dd\u02de"+
		"\u0003\f\u0006\u0000\u02de\u02df\u0005\u0003\u0000\u0000\u02df\u02e1\u0005"+
		"\u000b\u0000\u0000\u02e0\u02e2\u0003\u0002\u0001\u0000\u02e1\u02e0\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005\u00b7\u0000\u0000\u02e4C\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e7\u0003\u0002\u0001\u0000\u02e6\u02e5\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e9\u0005\f\u0000\u0000\u02e9\u02ea\u0003\u0092I"+
		"\u0000\u02ea\u02eb\u0005\u000b\u0000\u0000\u02eb\u02ec\u0003\f\u0006\u0000"+
		"\u02ec\u02ed\u0005\u0003\u0000\u0000\u02ed\u02ef\u0005\u000b\u0000\u0000"+
		"\u02ee\u02f0\u0003\u0002\u0001\u0000\u02ef\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0005\u00b7\u0000\u0000\u02f2E\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f5\u0003\u0002\u0001\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0005\r\u0000\u0000\u02f7\u02f8\u0005\u00c4\u0000\u0000\u02f8\u02fa"+
		"\u0005f\u0000\u0000\u02f9\u02fb\u0005g\u0000\u0000\u02fa\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fc\u02fd\u0003\u0092I\u0000\u02fd\u02fe\u0005\u00b9\u0000"+
		"\u0000\u02fe\u02ff\u0005\u00b9\u0000\u0000\u02ff\u0302\u0003\u0092I\u0000"+
		"\u0300\u0301\u0005h\u0000\u0000\u0301\u0303\u0003\u0092I\u0000\u0302\u0300"+
		"\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303\u0304"+
		"\u0001\u0000\u0000\u0000\u0304\u0305\u0005\u000b\u0000\u0000\u0305\u0306"+
		"\u0003\f\u0006\u0000\u0306\u0307\u0005\u0003\u0000\u0000\u0307\u0309\u0005"+
		"\u000b\u0000\u0000\u0308\u030a\u0003\u0002\u0001\u0000\u0309\u0308\u0001"+
		"\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030b\u0001"+
		"\u0000\u0000\u0000\u030b\u030c\u0005\u00b7\u0000\u0000\u030c\u031e\u0001"+
		"\u0000\u0000\u0000\u030d\u030f\u0003\u0002\u0001\u0000\u030e\u030d\u0001"+
		"\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0310\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0005\r\u0000\u0000\u0311\u0312\u0005\u00c4"+
		"\u0000\u0000\u0312\u0313\u0005f\u0000\u0000\u0313\u0314\u0003H$\u0000"+
		"\u0314\u0315\u0005\u000b\u0000\u0000\u0315\u0316\u0003\f\u0006\u0000\u0316"+
		"\u0317\u0005\u0003\u0000\u0000\u0317\u0319\u0005\u000b\u0000\u0000\u0318"+
		"\u031a\u0003\u0002\u0001\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u0319"+
		"\u031a\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0005\u00b7\u0000\u0000\u031c\u031e\u0001\u0000\u0000\u0000\u031d"+
		"\u02f4\u0001\u0000\u0000\u0000\u031d\u030e\u0001\u0000\u0000\u0000\u031e"+
		"G\u0001\u0000\u0000\u0000\u031f\u0320\u0005(\u0000\u0000\u0320\u0337\u0003"+
		"\u0092I\u0000\u0321\u0322\u0005#\u0000\u0000\u0322\u0324\u0003\u0016\u000b"+
		"\u0000\u0323\u0325\u0003\u001c\u000e\u0000\u0324\u0323\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0327\u0001\u0000\u0000"+
		"\u0000\u0326\u0328\u0003$\u0012\u0000\u0327\u0326\u0001\u0000\u0000\u0000"+
		"\u0327\u0328\u0001\u0000\u0000\u0000\u0328\u032a\u0001\u0000\u0000\u0000"+
		"\u0329\u032b\u0003\u0084B\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0001\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c"+
		"\u032e\u0003\u0086C\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032d\u032e"+
		"\u0001\u0000\u0000\u0000\u032e\u0330\u0001\u0000\u0000\u0000\u032f\u0331"+
		"\u0003\u0088D\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331\u0001"+
		"\u0000\u0000\u0000\u0331\u0333\u0001\u0000\u0000\u0000\u0332\u0334\u0003"+
		"\u008cF\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000"+
		"\u0000\u0000\u0334\u0337\u0001\u0000\u0000\u0000\u0335\u0337\u0003\u0092"+
		"I\u0000\u0336\u031f\u0001\u0000\u0000\u0000\u0336\u0321\u0001\u0000\u0000"+
		"\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0337I\u0001\u0000\u0000\u0000"+
		"\u0338\u033a\u0003\u0002\u0001\u0000\u0339\u0338\u0001\u0000\u0000\u0000"+
		"\u0339\u033a\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000"+
		"\u033b\u033c\u0005\u000e\u0000\u0000\u033c\u033f\u0005\u00c4\u0000\u0000"+
		"\u033d\u033e\u0005j\u0000\u0000\u033e\u0340\u0005\u00c0\u0000\u0000\u033f"+
		"\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0001\u0000\u0000\u0000\u0341\u0342\u0005f\u0000\u0000\u0342\u0343"+
		"\u0005i\u0000\u0000\u0343\u0344\u0003\u0092I\u0000\u0344\u0345\u0005\u000b"+
		"\u0000\u0000\u0345\u0346\u0003\f\u0006\u0000\u0346\u0347\u0005\u0003\u0000"+
		"\u0000\u0347\u0349\u0005\u000b\u0000\u0000\u0348\u034a\u0003\u0002\u0001"+
		"\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000"+
		"\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c\u0005\u00b7\u0000"+
		"\u0000\u034cK\u0001\u0000\u0000\u0000\u034d\u034f\u0005\u000f\u0000\u0000"+
		"\u034e\u0350\u0005\u00c4\u0000\u0000\u034f\u034e\u0001\u0000\u0000\u0000"+
		"\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000"+
		"\u0351\u0352\u0005\n\u0000\u0000\u0352\u0354\u0003\u0092I\u0000\u0353"+
		"\u0351\u0001\u0000\u0000\u0000\u0353\u0354\u0001\u0000\u0000\u0000\u0354"+
		"\u0355\u0001\u0000\u0000\u0000\u0355\u0356\u0005\u00b7\u0000\u0000\u0356"+
		"M\u0001\u0000\u0000\u0000\u0357\u0359\u0005\u0010\u0000\u0000\u0358\u035a"+
		"\u0005\u00c4\u0000\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u0359\u035a"+
		"\u0001\u0000\u0000\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0005\n\u0000\u0000\u035c\u035e\u0003\u0092I\u0000\u035d\u035b\u0001"+
		"\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u035f\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0005\u00b7\u0000\u0000\u0360O\u0001\u0000"+
		"\u0000\u0000\u0361\u0363\u0005\u0011\u0000\u0000\u0362\u0364\u0003\u0092"+
		"I\u0000\u0363\u0362\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000"+
		"\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365\u037b\u0005\u00b7\u0000"+
		"\u0000\u0366\u0367\u0005\u0011\u0000\u0000\u0367\u0368\u0005\u0013\u0000"+
		"\u0000\u0368\u0369\u0003\u0092I\u0000\u0369\u036a\u0005\u00b7\u0000\u0000"+
		"\u036a\u037b\u0001\u0000\u0000\u0000\u036b\u036c\u0005\u0011\u0000\u0000"+
		"\u036c\u036d\u0005\u0014\u0000\u0000\u036d\u036e\u0003z=\u0000\u036e\u036f"+
		"\u0005\u00b7\u0000\u0000\u036f\u037b\u0001\u0000\u0000\u0000\u0370\u0371"+
		"\u0005\u0011\u0000\u0000\u0371\u0372\u0005\u0014\u0000\u0000\u0372\u0373"+
		"\u0005(\u0000\u0000\u0373\u0376\u0003\u0092I\u0000\u0374\u0375\u0005\u0089"+
		"\u0000\u0000\u0375\u0377\u0003.\u0017\u0000\u0376\u0374\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000"+
		"\u0000\u0378\u0379\u0005\u00b7\u0000\u0000\u0379\u037b\u0001\u0000\u0000"+
		"\u0000\u037a\u0361\u0001\u0000\u0000\u0000\u037a\u0366\u0001\u0000\u0000"+
		"\u0000\u037a\u036b\u0001\u0000\u0000\u0000\u037a\u0370\u0001\u0000\u0000"+
		"\u0000\u037bQ\u0001\u0000\u0000\u0000\u037c\u037e\u0005\u0012\u0000\u0000"+
		"\u037d\u037f\u0007\u0003\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0386\u0001\u0000\u0000\u0000"+
		"\u0380\u0383\u0005\u00c2\u0000\u0000\u0381\u0382\u0005\u00b8\u0000\u0000"+
		"\u0382\u0384\u0003.\u0017\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0383"+
		"\u0384\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000\u0385"+
		"\u0387\u0005\u00c4\u0000\u0000\u0386\u0380\u0001\u0000\u0000\u0000\u0386"+
		"\u0385\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000\u0000\u0387"+
		"\u038a\u0001\u0000\u0000\u0000\u0388\u0389\u0005\u0089\u0000\u0000\u0389"+
		"\u038b\u0003T*\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038a\u038b\u0001"+
		"\u0000\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038d\u0005"+
		"\u00b7\u0000\u0000\u038dS\u0001\u0000\u0000\u0000\u038e\u0393\u0003V+"+
		"\u0000\u038f\u0390\u0005\u00b8\u0000\u0000\u0390\u0392\u0003V+\u0000\u0391"+
		"\u038f\u0001\u0000\u0000\u0000\u0392\u0395\u0001\u0000\u0000\u0000\u0393"+
		"\u0391\u0001\u0000\u0000\u0000\u0393\u0394\u0001\u0000\u0000\u0000\u0394"+
		"U\u0001\u0000\u0000\u0000\u0395\u0393\u0001\u0000\u0000\u0000\u0396\u0397"+
		"\u0007\u0004\u0000\u0000\u0397\u0398\u0005\u00a6\u0000\u0000\u0398\u0399"+
		"\u0003\u0092I\u0000\u0399W\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u0094"+
		"\u0000\u0000\u039b\u039e\u0003\u0092I\u0000\u039c\u039d\u0005\u00b8\u0000"+
		"\u0000\u039d\u039f\u0003\u0092I\u0000\u039e\u039c\u0001\u0000\u0000\u0000"+
		"\u039e\u039f\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0005\u00b7\u0000\u0000\u03a1Y\u0001\u0000\u0000\u0000\u03a2"+
		"\u03a3\u0005\u0083\u0000\u0000\u03a3\u03a4\u0005\u00b7\u0000\u0000\u03a4"+
		"[\u0001\u0000\u0000\u0000\u03a5\u03a7\u0005J\u0000\u0000\u03a6\u03a8\u0007"+
		"\u0005\u0000\u0000\u03a7\u03a6\u0001\u0000\u0000\u0000\u03a7\u03a8\u0001"+
		"\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9\u03aa\u0005"+
		"\u00b7\u0000\u0000\u03aa]\u0001\u0000\u0000\u0000\u03ab\u03ad\u0005K\u0000"+
		"\u0000\u03ac\u03ae\u0007\u0005\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae\u03b4\u0001\u0000\u0000"+
		"\u0000\u03af\u03b1\u0005/\u0000\u0000\u03b0\u03b2\u0005L\u0000\u0000\u03b1"+
		"\u03b0\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b3\u03b5\u0005\u00c4\u0000\u0000\u03b4"+
		"\u03af\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b6\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005\u00b7\u0000\u0000\u03b7"+
		"_\u0001\u0000\u0000\u0000\u03b8\u03ba\u0003\u0002\u0001\u0000\u03b9\u03b8"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba\u03bc"+
		"\u0001\u0000\u0000\u0000\u03bb\u03bd\u0005\u0001\u0000\u0000\u03bc\u03bb"+
		"\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03bf"+
		"\u0001\u0000\u0000\u0000\u03be\u03c0\u0003\u0006\u0003\u0000\u03bf\u03be"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005\u0002\u0000\u0000\u03c2\u03c4"+
		"\u0003\f\u0006\u0000\u03c3\u03c5\u0003b1\u0000\u03c4\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c8\u0005\u0003\u0000\u0000\u03c7\u03c9\u0003\u0002"+
		"\u0001\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c8\u03c9\u0001\u0000"+
		"\u0000\u0000\u03c9\u03ca\u0001\u0000\u0000\u0000\u03ca\u03cb\u0005\u00b7"+
		"\u0000\u0000\u03cba\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005\u0004\u0000"+
		"\u0000\u03cd\u03ce\u0003d2\u0000\u03cec\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d1\u0003f3\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001"+
		"\u0000\u0000\u0000\u03d3e\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005\n"+
		"\u0000\u0000\u03d5\u03d6\u0003h4\u0000\u03d6\u03d7\u0005\u0006\u0000\u0000"+
		"\u03d7\u03d8\u0003\f\u0006\u0000\u03d8g\u0001\u0000\u0000\u0000\u03d9"+
		"\u03de\u0003j5\u0000\u03da\u03db\u0005\u0086\u0000\u0000\u03db\u03dd\u0003"+
		"j5\u0000\u03dc\u03da\u0001\u0000\u0000\u0000\u03dd\u03e0\u0001\u0000\u0000"+
		"\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000"+
		"\u0000\u03dfi\u0001\u0000\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000"+
		"\u03e1\u03e5\u0005\u00c4\u0000\u0000\u03e2\u03e3\u0005x\u0000\u0000\u03e3"+
		"\u03e5\u0005\u00c2\u0000\u0000\u03e4\u03e1\u0001\u0000\u0000\u0000\u03e4"+
		"\u03e2\u0001\u0000\u0000\u0000\u03e5k\u0001\u0000\u0000\u0000\u03e6\u03e8"+
		"\u0005}\u0000\u0000\u03e7\u03e9\u0007\u0006\u0000\u0000\u03e8\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ea\u03eb\u0005~\u0000\u0000\u03eb\u03ec\u0003n7"+
		"\u0000\u03ec\u03ed\u0005\u00b7\u0000\u0000\u03edm\u0001\u0000\u0000\u0000"+
		"\u03ee\u03f3\u0003p8\u0000\u03ef\u03f0\u0005\u00b8\u0000\u0000\u03f0\u03f2"+
		"\u0003p8\u0000\u03f1\u03ef\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f1\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f4o\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f7\u0003\u0012\t\u0000\u03f7\u03f8\u0005\u00a6\u0000\u0000"+
		"\u03f8\u03f9\u0003r9\u0000\u03f9q\u0001\u0000\u0000\u0000\u03fa\u03fb"+
		"\u0005\u00c4\u0000\u0000\u03fbs\u0001\u0000\u0000\u0000\u03fc\u03fd\u0005"+
		"\u0095\u0000\u0000\u03fd\u0402\u0003\u0012\t\u0000\u03fe\u03ff\u0005\u00ba"+
		"\u0000\u0000\u03ff\u0400\u0003.\u0017\u0000\u0400\u0401\u0005\u00bb\u0000"+
		"\u0000\u0401\u0403\u0001\u0000\u0000\u0000\u0402\u03fe\u0001\u0000\u0000"+
		"\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000"+
		"\u0000\u0404\u0405\u0005\r\u0000\u0000\u0405\u0407\u0003z=\u0000\u0406"+
		"\u0404\u0001\u0000\u0000\u0000\u0406\u0407\u0001\u0000\u0000\u0000\u0407"+
		"\u0408\u0001\u0000\u0000\u0000\u0408\u0409\u0005\u00b7\u0000\u0000\u0409"+
		"u\u0001\u0000\u0000\u0000\u040a\u040b\u0005\u0096\u0000\u0000\u040b\u040c"+
		"\u0003\u0012\t\u0000\u040c\u040d\u0005\u00b7\u0000\u0000\u040dw\u0001"+
		"\u0000\u0000\u0000\u040e\u040f\u0005\u0097\u0000\u0000\u040f\u0410\u0003"+
		"\u0012\t\u0000\u0410\u0411\u0005)\u0000\u0000\u0411\u0412\u0003\u001a"+
		"\r\u0000\u0412\u0413\u0005\u00b7\u0000\u0000\u0413y\u0001\u0000\u0000"+
		"\u0000\u0414\u0416\u0003|>\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0415"+
		"\u0416\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417"+
		"\u041f\u0003\u0082A\u0000\u0418\u041a\u0007\u0007\u0000\u0000\u0419\u041b"+
		"\u00051\u0000\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001"+
		"\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041e\u0003"+
		"\u0082A\u0000\u041d\u0418\u0001\u0000\u0000\u0000\u041e\u0421\u0001\u0000"+
		"\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000"+
		"\u0000\u0000\u0420{\u0001\u0000\u0000\u0000\u0421\u041f\u0001\u0000\u0000"+
		"\u0000\u0422\u0423\u0005<\u0000\u0000\u0423\u0424\u0003~?\u0000\u0424"+
		"}\u0001\u0000\u0000\u0000\u0425\u042a\u0003\u0080@\u0000\u0426\u0427\u0005"+
		"\u00b8\u0000\u0000\u0427\u0429\u0003\u0080@\u0000\u0428\u0426\u0001\u0000"+
		"\u0000\u0000\u0429\u042c\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000"+
		"\u0000\u0000\u042a\u042b\u0001\u0000\u0000\u0000\u042b\u007f\u0001\u0000"+
		"\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000\u042d\u0432\u0005\u00c4"+
		"\u0000\u0000\u042e\u042f\u0005\u00ba\u0000\u0000\u042f\u0430\u0003,\u0016"+
		"\u0000\u0430\u0431\u0005\u00bb\u0000\u0000\u0431\u0433\u0001\u0000\u0000"+
		"\u0000\u0432\u042e\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000"+
		"\u0000\u0433\u0434\u0001\u0000\u0000\u0000\u0434\u0435\u0005\u0081\u0000"+
		"\u0000\u0435\u0436\u0005\u00ba\u0000\u0000\u0436\u0437\u0003z=\u0000\u0437"+
		"\u0438\u0005\u00bb\u0000\u0000\u0438\u0081\u0001\u0000\u0000\u0000\u0439"+
		"\u0443\u0005#\u0000\u0000\u043a\u0440\u00050\u0000\u0000\u043b\u043c\u0005"+
		"r\u0000\u0000\u043c\u043d\u0005\u00ba\u0000\u0000\u043d\u043e\u0003.\u0017"+
		"\u0000\u043e\u043f\u0005\u00bb\u0000\u0000\u043f\u0441\u0001\u0000\u0000"+
		"\u0000\u0440\u043b\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000"+
		"\u0000\u0441\u0444\u0001\u0000\u0000\u0000\u0442\u0444\u00051\u0000\u0000"+
		"\u0443\u043a\u0001\u0000\u0000\u0000\u0443\u0442\u0001\u0000\u0000\u0000"+
		"\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000"+
		"\u0445\u0447\u0003\u0016\u000b\u0000\u0446\u0448\u0003\u001c\u000e\u0000"+
		"\u0447\u0446\u0001\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000"+
		"\u0448\u044a\u0001\u0000\u0000\u0000\u0449\u044b\u0003$\u0012\u0000\u044a"+
		"\u0449\u0001\u0000\u0000\u0000\u044a\u044b\u0001\u0000\u0000\u0000\u044b"+
		"\u044d\u0001\u0000\u0000\u0000\u044c\u044e\u0003\u0084B\u0000\u044d\u044c"+
		"\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u0450"+
		"\u0001\u0000\u0000\u0000\u044f\u0451\u0003\u0086C\u0000\u0450\u044f\u0001"+
		"\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000\u0451\u0453\u0001"+
		"\u0000\u0000\u0000\u0452\u0454\u0003\u0088D\u0000\u0453\u0452\u0001\u0000"+
		"\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0456\u0001\u0000"+
		"\u0000\u0000\u0455\u0457\u0003\u008cF\u0000\u0456\u0455\u0001\u0000\u0000"+
		"\u0000\u0456\u0457\u0001\u0000\u0000\u0000\u0457\u0083\u0001\u0000\u0000"+
		"\u0000\u0458\u0459\u00052\u0000\u0000\u0459\u045a\u0005h\u0000\u0000\u045a"+
		"\u045b\u0003.\u0017\u0000\u045b\u0085\u0001\u0000\u0000\u0000\u045c\u045d"+
		"\u00053\u0000\u0000\u045d\u045e\u0003\u0092I\u0000\u045e\u0087\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u00054\u0000\u0000\u0460\u0461\u0005h\u0000\u0000"+
		"\u0461\u0466\u0003\u008aE\u0000\u0462\u0463\u0005\u00b8\u0000\u0000\u0463"+
		"\u0465\u0003\u008aE\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0465\u0468"+
		"\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u0089\u0001\u0000\u0000\u0000\u0468\u0466"+
		"\u0001\u0000\u0000\u0000\u0469\u046b\u0003\u0092I\u0000\u046a\u046c\u0007"+
		"\b\u0000\u0000\u046b\u046a\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000"+
		"\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046e\u00059\u0000"+
		"\u0000\u046e\u0470\u0007\t\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000"+
		"\u046f\u0470\u0001\u0000\u0000\u0000\u0470\u008b\u0001\u0000\u0000\u0000"+
		"\u0471\u0474\u00055\u0000\u0000\u0472\u0475\u0003\u0092I\u0000\u0473\u0475"+
		"\u00051\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0478\u0001\u0000\u0000\u0000\u0476\u0477\u0005"+
		"6\u0000\u0000\u0477\u0479\u0003\u0092I\u0000\u0478\u0476\u0001\u0000\u0000"+
		"\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u008d\u0001\u0000\u0000"+
		"\u0000\u047a\u047f\u0003\u0090H\u0000\u047b\u047c\u0005\u00b8\u0000\u0000"+
		"\u047c\u047e\u0003\u0090H\u0000\u047d\u047b\u0001\u0000\u0000\u0000\u047e"+
		"\u0481\u0001\u0000\u0000\u0000\u047f\u047d\u0001\u0000\u0000\u0000\u047f"+
		"\u0480\u0001\u0000\u0000\u0000\u0480\u008f\u0001\u0000\u0000\u0000\u0481"+
		"\u047f\u0001\u0000\u0000\u0000\u0482\u0483\u0005\u00c4\u0000\u0000\u0483"+
		"\u0484\u0003\n\u0005\u0000\u0484\u0091\u0001\u0000\u0000\u0000\u0485\u0486"+
		"\u0006I\uffff\uffff\u0000\u0486\u04c6\u0003\u00a4R\u0000\u0487\u04c6\u0003"+
		"\u0012\t\u0000\u0488\u04c6\u0003\u009cN\u0000\u0489\u04c6\u0003\u009e"+
		"O\u0000\u048a\u04c6\u0003\u009aM\u0000\u048b\u048c\u0005_\u0000\u0000"+
		"\u048c\u04c6\u0005\u00c2\u0000\u0000\u048d\u048e\u0005B\u0000\u0000\u048e"+
		"\u048f\u0005\u00ba\u0000\u0000\u048f\u0490\u0003\u0092I\u0000\u0490\u0491"+
		"\u0005\u0081\u0000\u0000\u0491\u0492\u0003\n\u0005\u0000\u0492\u0493\u0005"+
		"\u00bb\u0000\u0000\u0493\u04c6\u0001\u0000\u0000\u0000\u0494\u0495\u0005"+
		"D\u0000\u0000\u0495\u0496\u0005\u00ba\u0000\u0000\u0496\u0497\u0003.\u0017"+
		"\u0000\u0497\u0498\u0005\u00bb\u0000\u0000\u0498\u04c6\u0001\u0000\u0000"+
		"\u0000\u0499\u049a\u0005E\u0000\u0000\u049a\u049b\u0005\u00ba\u0000\u0000"+
		"\u049b\u049c\u0003\u0092I\u0000\u049c\u049d\u0005\u00b8\u0000\u0000\u049d"+
		"\u049e\u0003\u0092I\u0000\u049e\u049f\u0005\u00bb\u0000\u0000\u049f\u04c6"+
		"\u0001\u0000\u0000\u0000\u04a0\u04a1\u0005F\u0000\u0000\u04a1\u04a2\u0005"+
		"\u00ba\u0000\u0000\u04a2\u04a3\u0003.\u0017\u0000\u04a3\u04a4\u0005\u00bb"+
		"\u0000\u0000\u04a4\u04c6\u0001\u0000\u0000\u0000\u04a5\u04a6\u0005G\u0000"+
		"\u0000\u04a6\u04a7\u0005\u00ba\u0000\u0000\u04a7\u04a8\u0003.\u0017\u0000"+
		"\u04a8\u04a9\u0005\u00bb\u0000\u0000\u04a9\u04c6\u0001\u0000\u0000\u0000"+
		"\u04aa\u04ab\u0005A\u0000\u0000\u04ab\u04ac\u0005\u00ba\u0000\u0000\u04ac"+
		"\u04ad\u0003z=\u0000\u04ad\u04ae\u0005\u00bb\u0000\u0000\u04ae\u04c6\u0001"+
		"\u0000\u0000\u0000\u04af\u04b0\u0005\u00ba\u0000\u0000\u04b0\u04b1\u0003"+
		"z=\u0000\u04b1\u04b2\u0005\u00bb\u0000\u0000\u04b2\u04c6\u0001\u0000\u0000"+
		"\u0000\u04b3\u04b4\u0005\u00ba\u0000\u0000\u04b4\u04b5\u0003\u0092I\u0000"+
		"\u04b5\u04b6\u0005\u00bb\u0000\u0000\u04b6\u04c6\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b8\u0005\u0084\u0000\u0000\u04b8\u04c6\u0003\u0092I\u0005\u04b9"+
		"\u04bb\u0005\t\u0000\u0000\u04ba\u04bc\u0003\u0092I\u0000\u04bb\u04ba"+
		"\u0001\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u04bd"+
		"\u0001\u0000\u0000\u0000\u04bd\u04c0\u0003\u0094J\u0000\u04be\u04bf\u0005"+
		"\b\u0000\u0000\u04bf\u04c1\u0003\u0092I\u0000\u04c0\u04be\u0001\u0000"+
		"\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000\u0000\u04c1\u04c2\u0001\u0000"+
		"\u0000\u0000\u04c2\u04c3\u0005\u0003\u0000\u0000\u04c3\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c6\u0003\u0098L\u0000\u04c5\u0485\u0001\u0000\u0000"+
		"\u0000\u04c5\u0487\u0001\u0000\u0000\u0000\u04c5\u0488\u0001\u0000\u0000"+
		"\u0000\u04c5\u0489\u0001\u0000\u0000\u0000\u04c5\u048a\u0001\u0000\u0000"+
		"\u0000\u04c5\u048b\u0001\u0000\u0000\u0000\u04c5\u048d\u0001\u0000\u0000"+
		"\u0000\u04c5\u0494\u0001\u0000\u0000\u0000\u04c5\u0499\u0001\u0000\u0000"+
		"\u0000\u04c5\u04a0\u0001\u0000\u0000\u0000\u04c5\u04a5\u0001\u0000\u0000"+
		"\u0000\u04c5\u04aa\u0001\u0000\u0000\u0000\u04c5\u04af\u0001\u0000\u0000"+
		"\u0000\u04c5\u04b3\u0001\u0000\u0000\u0000\u04c5\u04b7\u0001\u0000\u0000"+
		"\u0000\u04c5\u04b9\u0001\u0000\u0000\u0000\u04c5\u04c4\u0001\u0000\u0000"+
		"\u0000\u04c6\u050a\u0001\u0000\u0000\u0000\u04c7\u04c8\n\u000e\u0000\u0000"+
		"\u04c8\u04c9\u0007\n\u0000\u0000\u04c9\u0509\u0003\u0092I\u000f\u04ca"+
		"\u04cb\n\r\u0000\u0000\u04cb\u04cc\u0007\u000b\u0000\u0000\u04cc\u0509"+
		"\u0003\u0092I\u000e\u04cd\u04ce\n\f\u0000\u0000\u04ce\u04cf\u0005\u00a5"+
		"\u0000\u0000\u04cf\u0509\u0003\u0092I\r\u04d0\u04d1\n\u000b\u0000\u0000"+
		"\u04d1\u04d2\u0007\f\u0000\u0000\u04d2\u0509\u0003\u0092I\f\u04d3\u04d5"+
		"\n\n\u0000\u0000\u04d4\u04d6\u0005\u0084\u0000\u0000\u04d5\u04d4\u0001"+
		"\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u04d7\u0001"+
		"\u0000\u0000\u0000\u04d7\u04d8\u0005=\u0000\u0000\u04d8\u04d9\u0003\u0092"+
		"I\u0000\u04d9\u04da\u0005\u0085\u0000\u0000\u04da\u04db\u0003\u0092I\u000b"+
		"\u04db\u0509\u0001\u0000\u0000\u0000\u04dc\u04de\n\t\u0000\u0000\u04dd"+
		"\u04df\u0005\u0084\u0000\u0000\u04de\u04dd\u0001\u0000\u0000\u0000\u04de"+
		"\u04df\u0001\u0000\u0000\u0000\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e1\u0007\r\u0000\u0000\u04e1\u0509\u0003\u0092I\n\u04e2\u04e3\n\b"+
		"\u0000\u0000\u04e3\u04e4\u0005\u00b4\u0000\u0000\u04e4\u04e5\u0005/\u0000"+
		"\u0000\u04e5\u0509\u0003\u0092I\t\u04e6\u04e7\n\u0006\u0000\u0000\u04e7"+
		"\u04e8\u0007\u000e\u0000\u0000\u04e8\u0509\u0003\u0092I\u0007\u04e9\u04ea"+
		"\n\u0016\u0000\u0000\u04ea\u04eb\u0005\u00b1\u0000\u0000\u04eb\u0509\u0003"+
		"\n\u0005\u0000\u04ec\u04ed\n\u0007\u0000\u0000\u04ed\u04ee\u0007\f\u0000"+
		"\u0000\u04ee\u04ef\u0007\u000f\u0000\u0000\u04ef\u04f2\u0005\u00ba\u0000"+
		"\u0000\u04f0\u04f3\u0003z=\u0000\u04f1\u04f3\u0003.\u0017\u0000\u04f2"+
		"\u04f0\u0001\u0000\u0000\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f3"+
		"\u04f4\u0001\u0000\u0000\u0000\u04f4\u04f5\u0005\u00bb\u0000\u0000\u04f5"+
		"\u0509\u0001\u0000\u0000\u0000\u04f6\u04f7\n\u0004\u0000\u0000\u04f7\u04f9"+
		"\u0005\u0082\u0000\u0000\u04f8\u04fa\u0005\u0084\u0000\u0000\u04f9\u04f8"+
		"\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000\u0000\u04fa\u04fb"+
		"\u0001\u0000\u0000\u0000\u04fb\u0509\u0005\u0083\u0000\u0000\u04fc\u04fe"+
		"\n\u0003\u0000\u0000\u04fd\u04ff\u0005\u0084\u0000\u0000\u04fe\u04fd\u0001"+
		"\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000\u0000\u04ff\u0500\u0001"+
		"\u0000\u0000\u0000\u0500\u0501\u0005f\u0000\u0000\u0501\u0504\u0005\u00ba"+
		"\u0000\u0000\u0502\u0505\u0003z=\u0000\u0503\u0505\u0003.\u0017\u0000"+
		"\u0504\u0502\u0001\u0000\u0000\u0000\u0504\u0503\u0001\u0000\u0000\u0000"+
		"\u0505\u0506\u0001\u0000\u0000\u0000\u0506\u0507\u0005\u00bb\u0000\u0000"+
		"\u0507\u0509\u0001\u0000\u0000\u0000\u0508\u04c7\u0001\u0000\u0000\u0000"+
		"\u0508\u04ca\u0001\u0000\u0000\u0000\u0508\u04cd\u0001\u0000\u0000\u0000"+
		"\u0508\u04d0\u0001\u0000\u0000\u0000\u0508\u04d3\u0001\u0000\u0000\u0000"+
		"\u0508\u04dc\u0001\u0000\u0000\u0000\u0508\u04e2\u0001\u0000\u0000\u0000"+
		"\u0508\u04e6\u0001\u0000\u0000\u0000\u0508\u04e9\u0001\u0000\u0000\u0000"+
		"\u0508\u04ec\u0001\u0000\u0000\u0000\u0508\u04f6\u0001\u0000\u0000\u0000"+
		"\u0508\u04fc\u0001\u0000\u0000\u0000\u0509\u050c\u0001\u0000\u0000\u0000"+
		"\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000"+
		"\u050b\u0093\u0001\u0000\u0000\u0000\u050c\u050a\u0001\u0000\u0000\u0000"+
		"\u050d\u050f\u0003\u0096K\u0000\u050e\u050d\u0001\u0000\u0000\u0000\u050f"+
		"\u0510\u0001\u0000\u0000\u0000\u0510\u050e\u0001\u0000\u0000\u0000\u0510"+
		"\u0511\u0001\u0000\u0000\u0000\u0511\u0095\u0001\u0000\u0000\u0000\u0512"+
		"\u0513\u0005\n\u0000\u0000\u0513\u0514\u0003\u0092I\u0000\u0514\u0515"+
		"\u0005\u0006\u0000\u0000\u0515\u0516\u0003\u0092I\u0000\u0516\u0097\u0001"+
		"\u0000\u0000\u0000\u0517\u0518\u0005i\u0000\u0000\u0518\u0519\u0005\u00bc"+
		"\u0000\u0000\u0519\u051a\u0003.\u0017\u0000\u051a\u051b\u0005\u00bd\u0000"+
		"\u0000\u051b\u0522\u0001\u0000\u0000\u0000\u051c\u051d\u0003\u0012\t\u0000"+
		"\u051d\u051e\u0005\u00bc\u0000\u0000\u051e\u051f\u0003\u0092I\u0000\u051f"+
		"\u0520\u0005\u00bd\u0000\u0000\u0520\u0522\u0001\u0000\u0000\u0000\u0521"+
		"\u0517\u0001\u0000\u0000\u0000\u0521\u051c\u0001\u0000\u0000\u0000\u0522"+
		"\u0099\u0001\u0000\u0000\u0000\u0523\u0524\u0007\u0010\u0000\u0000\u0524"+
		"\u009b\u0001\u0000\u0000\u0000\u0525\u0526\u0005\u00c4\u0000\u0000\u0526"+
		"\u052b\u0005\u00ba\u0000\u0000\u0527\u0528\u00050\u0000\u0000\u0528\u052c"+
		"\u0003.\u0017\u0000\u0529\u052c\u0003.\u0017\u0000\u052a\u052c\u0005\u00ae"+
		"\u0000\u0000\u052b\u0527\u0001\u0000\u0000\u0000\u052b\u0529\u0001\u0000"+
		"\u0000\u0000\u052b\u052a\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000"+
		"\u0000\u0000\u052c\u052d\u0001\u0000\u0000\u0000\u052d\u052e\u0005\u00bb"+
		"\u0000\u0000\u052e\u009d\u0001\u0000\u0000\u0000\u052f\u0530\u0003\u009c"+
		"N\u0000\u0530\u0531\u0005H\u0000\u0000\u0531\u0532\u0005\u00ba\u0000\u0000"+
		"\u0532\u0533\u0003\u00a0P\u0000\u0533\u0534\u0005\u00bb\u0000\u0000\u0534"+
		"\u009f\u0001\u0000\u0000\u0000\u0535\u0536\u0005I\u0000\u0000\u0536\u0537"+
		"\u0005h\u0000\u0000\u0537\u0539\u0003.\u0017\u0000\u0538\u0535\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053b\u0001\u0000"+
		"\u0000\u0000\u053a\u053c\u0003\u0088D\u0000\u053b\u053a\u0001\u0000\u0000"+
		"\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c\u00a1\u0001\u0000\u0000"+
		"\u0000\u053d\u0541\u0007\u0011\u0000\u0000\u053e\u0540\b\u0012\u0000\u0000"+
		"\u053f\u053e\u0001\u0000\u0000\u0000\u0540\u0543\u0001\u0000\u0000\u0000"+
		"\u0541\u053f\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000"+
		"\u0542\u0544\u0001\u0000\u0000\u0000\u0543\u0541\u0001\u0000\u0000\u0000"+
		"\u0544\u0545\u0005\u00b7\u0000\u0000\u0545\u00a3\u0001\u0000\u0000\u0000"+
		"\u0546\u0547\u0007\u0013\u0000\u0000\u0547\u00a5\u0001\u0000\u0000\u0000"+
		"\u0548\u054a\u0005\u0015\u0000\u0000\u0549\u054b\u0007\u0014\u0000\u0000"+
		"\u054a\u0549\u0001\u0000\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000"+
		"\u054b\u054c\u0001\u0000\u0000\u0000\u054c\u0550\u0005 \u0000\u0000\u054d"+
		"\u054e\u0005\u0005\u0000\u0000\u054e\u054f\u0005\u0084\u0000\u0000\u054f"+
		"\u0551\u0005A\u0000\u0000\u0550\u054d\u0001\u0000\u0000\u0000\u0550\u0551"+
		"\u0001\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u0553"+
		"\u0005\u00c4\u0000\u0000\u0553\u0554\u0005\u00ba\u0000\u0000\u0554\u0555"+
		"\u0003\u00a8T\u0000\u0555\u0557\u0005\u00bb\u0000\u0000\u0556\u0558\u0003"+
		"\u00acV\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000"+
		"\u0000\u0000\u0558\u0559\u0001\u0000\u0000\u0000\u0559\u055a\u0005\u00b7"+
		"\u0000\u0000\u055a\u00a7\u0001\u0000\u0000\u0000\u055b\u0560\u0003\u00aa"+
		"U\u0000\u055c\u055d\u0005\u00b8\u0000\u0000\u055d\u055f\u0003\u00aaU\u0000"+
		"\u055e\u055c\u0001\u0000\u0000\u0000\u055f\u0562\u0001\u0000\u0000\u0000"+
		"\u0560\u055e\u0001\u0000\u0000\u0000\u0560\u0561\u0001\u0000\u0000\u0000"+
		"\u0561\u00a9\u0001\u0000\u0000\u0000\u0562\u0560\u0001\u0000\u0000\u0000"+
		"\u0563\u0564\u0005\u00c4\u0000\u0000\u0564\u0565\u0003\n\u0005\u0000\u0565"+
		"\u00ab\u0001\u0000\u0000\u0000\u0566\u0567\u0005r\u0000\u0000\u0567\u056d"+
		"\u0005J\u0000\u0000\u0568\u056e\u0005\u0016\u0000\u0000\u0569\u056a\u0005"+
		"&\u0000\u0000\u056a\u056e\u0005\u009c\u0000\u0000\u056b\u056c\u0005\u009d"+
		"\u0000\u0000\u056c\u056e\u0005\u009c\u0000\u0000\u056d\u0568\u0001\u0000"+
		"\u0000\u0000\u056d\u0569\u0001\u0000\u0000\u0000\u056d\u056b\u0001\u0000"+
		"\u0000\u0000\u056e\u00ad\u0001\u0000\u0000\u0000\u00b3\u00af\u00b2\u00b7"+
		"\u00bb\u00be\u00ca\u00ce\u00d3\u00d9\u00e3\u00ef\u00f2\u00fd\u0100\u0107"+
		"\u010a\u0112\u0118\u0121\u0127\u012c\u0139\u013b\u0141\u0145\u014b\u016b"+
		"\u0177\u017f\u0182\u0185\u018b\u018f\u0192\u0195\u0198\u019b\u019e\u01a8"+
		"\u01ab\u01af\u01b2\u01b9\u01c1\u01c6\u01c9\u01ce\u01d1\u01d4\u01da\u01dd"+
		"\u01df\u01e4\u01ef\u01f1\u01f6\u01fa\u01fe\u0201\u0209\u020c\u0214\u0218"+
		"\u0223\u0230\u0238\u0243\u0248\u024b\u024e\u0251\u0254\u0257\u025e\u0262"+
		"\u0269\u0271\u0279\u0280\u0289\u0294\u029b\u02aa\u02b7\u02bc\u02c4\u02c9"+
		"\u02d2\u02da\u02e1\u02e6\u02ef\u02f4\u02fa\u0302\u0309\u030e\u0319\u031d"+
		"\u0324\u0327\u032a\u032d\u0330\u0333\u0336\u0339\u033f\u0349\u034f\u0353"+
		"\u0359\u035d\u0363\u0376\u037a\u037e\u0383\u0386\u038a\u0393\u039e\u03a7"+
		"\u03ad\u03b1\u03b4\u03b9\u03bc\u03bf\u03c4\u03c8\u03d2\u03de\u03e4\u03e8"+
		"\u03f3\u0402\u0406\u0415\u041a\u041f\u042a\u0432\u0440\u0443\u0447\u044a"+
		"\u044d\u0450\u0453\u0456\u0466\u046b\u046f\u0474\u0478\u047f\u04bb\u04c0"+
		"\u04c5\u04d5\u04de\u04f2\u04f9\u04fe\u0504\u0508\u050a\u0510\u0521\u052b"+
		"\u0538\u053b\u0541\u054a\u0550\u0557\u0560\u056d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}