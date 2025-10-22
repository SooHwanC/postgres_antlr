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
		RETURN=17, RAISE=18, SELECT=19, INSERT=20, UPDATE=21, DELETE=22, PERFORM=23, 
		EXECUTE=24, INTO=25, FROM=26, WHERE=27, SET=28, VALUES=29, RETURNING=30, 
		TO=31, DISTINCT=32, ALL=33, GROUP=34, HAVING=35, ORDER=36, LIMIT=37, OFFSET=38, 
		ASC=39, DESC=40, NULLS=41, FIRST=42, LAST=43, WITH=44, BETWEEN=45, COMMIT=46, 
		ROLLBACK=47, SAVEPOINT=48, START=49, TRANSACTION=50, WORK=51, INTEGER=52, 
		BIGINT=53, SMALLINT=54, NUMERIC=55, DECIMAL=56, REAL=57, DOUBLE=58, VARCHAR=59, 
		CHAR=60, TEXT=61, BOOLEAN=62, DATE=63, TIMESTAMP=64, INTERVAL=65, RECORD=66, 
		IN=67, REVERSE=68, BY=69, ARRAY=70, SLICE=71, NOTICE=72, WARNING=73, INFO=74, 
		DEBUG=75, LOG=76, SQLSTATE=77, ERRCODE=78, MESSAGE=79, DETAIL=80, HINT=81, 
		GET=82, DIAGNOSTICS=83, STACKED=84, CURRENT=85, AS=86, IS=87, NULL=88, 
		NOT=89, AND=90, OR=91, CONSTANT=92, DEFAULT=93, USING=94, STRICT=95, VOLATILE=96, 
		STABLE=97, IMMUTABLE=98, LANGUAGE=99, RETURNS=100, CALLED=101, SECURITY=102, 
		DEFINER=103, INVOKER=104, ASSERT=105, OPEN=106, CLOSE=107, FETCH=108, 
		MOVE=109, FOUND=110, CURSOR=111, TRUE=112, FALSE=113, PERCENT=114, TYPE=115, 
		ROWTYPE=116, DOLLAR=117, ASSIGN=118, CONCAT=119, EQ=120, NEQ=121, LT=122, 
		LTE=123, GT=124, GTE=125, PLUS=126, MINUS=127, STAR=128, SLASH=129, PERCENT_OP=130, 
		CARET=131, SEMI=132, COMMA=133, DOT=134, LPAREN=135, RPAREN=136, LBRACK=137, 
		RBRACK=138, LABEL_START=139, LABEL_END=140, IntegerLiteral=141, NumericLiteral=142, 
		StringLiteral=143, DollarQuotedString=144, Identifier=145, QuotedIdentifier=146, 
		LineComment=147, BlockComment=148, WS=149, ALIAS=150;
	public static final int
		RULE_plpgsqlBlock = 0, RULE_label = 1, RULE_declareSection = 2, RULE_declarationList = 3, 
		RULE_declaration = 4, RULE_dataType = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_assignmentStmt = 8, RULE_variableRef = 9, RULE_selectIntoStmt = 10, 
		RULE_selectList = 11, RULE_variableList = 12, RULE_fromClause = 13, RULE_tableRef = 14, 
		RULE_whereClause = 15, RULE_performStmt = 16, RULE_executeStmt = 17, RULE_insertStmt = 18, 
		RULE_columnList = 19, RULE_expressionList = 20, RULE_updateStmt = 21, 
		RULE_assignmentList = 22, RULE_columnAssignment = 23, RULE_deleteStmt = 24, 
		RULE_setStmt = 25, RULE_ifStmt = 26, RULE_caseStmt = 27, RULE_whenClauseList = 28, 
		RULE_whenClause = 29, RULE_loopStmt = 30, RULE_whileStmt = 31, RULE_forStmt = 32, 
		RULE_forQuerySource = 33, RULE_foreachStmt = 34, RULE_exitStmt = 35, RULE_continueStmt = 36, 
		RULE_returnStmt = 37, RULE_raiseStmt = 38, RULE_raiseOptionList = 39, 
		RULE_raiseOption = 40, RULE_assertStmt = 41, RULE_nullStmt = 42, RULE_commitStmt = 43, 
		RULE_rollbackStmt = 44, RULE_nestedBlock = 45, RULE_exceptionSection = 46, 
		RULE_exceptionHandlerList = 47, RULE_exceptionHandler = 48, RULE_exceptionConditionList = 49, 
		RULE_exceptionCondition = 50, RULE_getDiagnosticsStmt = 51, RULE_diagnosticsItemList = 52, 
		RULE_diagnosticsItem = 53, RULE_diagnosticsOption = 54, RULE_openCursorStmt = 55, 
		RULE_closeCursorStmt = 56, RULE_fetchStmt = 57, RULE_selectStmt = 58, 
		RULE_groupByClause = 59, RULE_havingClause = 60, RULE_orderByClause = 61, 
		RULE_orderByItem = 62, RULE_limitClause = 63, RULE_parameterList = 64, 
		RULE_parameter = 65, RULE_expression = 66, RULE_whenExprClauseList = 67, 
		RULE_whenExprClause = 68, RULE_arrayExpression = 69, RULE_functionCall = 70, 
		RULE_literal = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"plpgsqlBlock", "label", "declareSection", "declarationList", "declaration", 
			"dataType", "statementList", "statement", "assignmentStmt", "variableRef", 
			"selectIntoStmt", "selectList", "variableList", "fromClause", "tableRef", 
			"whereClause", "performStmt", "executeStmt", "insertStmt", "columnList", 
			"expressionList", "updateStmt", "assignmentList", "columnAssignment", 
			"deleteStmt", "setStmt", "ifStmt", "caseStmt", "whenClauseList", "whenClause", 
			"loopStmt", "whileStmt", "forStmt", "forQuerySource", "foreachStmt", 
			"exitStmt", "continueStmt", "returnStmt", "raiseStmt", "raiseOptionList", 
			"raiseOption", "assertStmt", "nullStmt", "commitStmt", "rollbackStmt", 
			"nestedBlock", "exceptionSection", "exceptionHandlerList", "exceptionHandler", 
			"exceptionConditionList", "exceptionCondition", "getDiagnosticsStmt", 
			"diagnosticsItemList", "diagnosticsItem", "diagnosticsOption", "openCursorStmt", 
			"closeCursorStmt", "fetchStmt", "selectStmt", "groupByClause", "havingClause", 
			"orderByClause", "orderByItem", "limitClause", "parameterList", "parameter", 
			"expression", "whenExprClauseList", "whenExprClause", "arrayExpression", 
			"functionCall", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARE'", "'BEGIN'", "'END'", "'EXCEPTION'", "'IF'", "'THEN'", 
			"'ELSIF'", "'ELSE'", "'CASE'", "'WHEN'", "'LOOP'", "'WHILE'", "'FOR'", 
			"'FOREACH'", "'EXIT'", "'CONTINUE'", "'RETURN'", "'RAISE'", "'SELECT'", 
			"'INSERT'", "'UPDATE'", "'DELETE'", "'PERFORM'", "'EXECUTE'", "'INTO'", 
			"'FROM'", "'WHERE'", "'SET'", "'VALUES'", "'RETURNING'", "'TO'", "'DISTINCT'", 
			"'ALL'", "'GROUP'", "'HAVING'", "'ORDER'", "'LIMIT'", "'OFFSET'", "'ASC'", 
			"'DESC'", "'NULLS'", "'FIRST'", "'LAST'", "'WITH'", "'BETWEEN'", "'COMMIT'", 
			"'ROLLBACK'", "'SAVEPOINT'", "'START'", "'TRANSACTION'", "'WORK'", null, 
			"'BIGINT'", "'SMALLINT'", "'NUMERIC'", "'DECIMAL'", "'REAL'", null, "'VARCHAR'", 
			"'CHAR'", "'TEXT'", null, "'DATE'", "'TIMESTAMP'", "'INTERVAL'", "'RECORD'", 
			"'IN'", "'REVERSE'", "'BY'", "'ARRAY'", "'SLICE'", "'NOTICE'", "'WARNING'", 
			"'INFO'", "'DEBUG'", "'LOG'", "'SQLSTATE'", "'ERRCODE'", "'MESSAGE'", 
			"'DETAIL'", "'HINT'", "'GET'", "'DIAGNOSTICS'", "'STACKED'", "'CURRENT'", 
			"'AS'", "'IS'", "'NULL'", "'NOT'", "'AND'", "'OR'", "'CONSTANT'", "'DEFAULT'", 
			"'USING'", "'STRICT'", "'VOLATILE'", "'STABLE'", "'IMMUTABLE'", "'LANGUAGE'", 
			"'RETURNS'", "'CALLED'", "'SECURITY'", "'DEFINER'", "'INVOKER'", "'ASSERT'", 
			"'OPEN'", "'CLOSE'", "'FETCH'", "'MOVE'", "'FOUND'", "'CURSOR'", "'TRUE'", 
			"'FALSE'", null, "'TYPE'", "'ROWTYPE'", "'$'", "':='", "'||'", "'='", 
			null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", null, 
			"'^'", "';'", "','", "'.'", "'('", "')'", "'['", "']'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "BEGIN", "END", "EXCEPTION", "IF", "THEN", "ELSIF", 
			"ELSE", "CASE", "WHEN", "LOOP", "WHILE", "FOR", "FOREACH", "EXIT", "CONTINUE", 
			"RETURN", "RAISE", "SELECT", "INSERT", "UPDATE", "DELETE", "PERFORM", 
			"EXECUTE", "INTO", "FROM", "WHERE", "SET", "VALUES", "RETURNING", "TO", 
			"DISTINCT", "ALL", "GROUP", "HAVING", "ORDER", "LIMIT", "OFFSET", "ASC", 
			"DESC", "NULLS", "FIRST", "LAST", "WITH", "BETWEEN", "COMMIT", "ROLLBACK", 
			"SAVEPOINT", "START", "TRANSACTION", "WORK", "INTEGER", "BIGINT", "SMALLINT", 
			"NUMERIC", "DECIMAL", "REAL", "DOUBLE", "VARCHAR", "CHAR", "TEXT", "BOOLEAN", 
			"DATE", "TIMESTAMP", "INTERVAL", "RECORD", "IN", "REVERSE", "BY", "ARRAY", 
			"SLICE", "NOTICE", "WARNING", "INFO", "DEBUG", "LOG", "SQLSTATE", "ERRCODE", 
			"MESSAGE", "DETAIL", "HINT", "GET", "DIAGNOSTICS", "STACKED", "CURRENT", 
			"AS", "IS", "NULL", "NOT", "AND", "OR", "CONSTANT", "DEFAULT", "USING", 
			"STRICT", "VOLATILE", "STABLE", "IMMUTABLE", "LANGUAGE", "RETURNS", "CALLED", 
			"SECURITY", "DEFINER", "INVOKER", "ASSERT", "OPEN", "CLOSE", "FETCH", 
			"MOVE", "FOUND", "CURSOR", "TRUE", "FALSE", "PERCENT", "TYPE", "ROWTYPE", 
			"DOLLAR", "ASSIGN", "CONCAT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "STAR", "SLASH", "PERCENT_OP", "CARET", "SEMI", "COMMA", 
			"DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LABEL_START", "LABEL_END", 
			"IntegerLiteral", "NumericLiteral", "StringLiteral", "DollarQuotedString", 
			"Identifier", "QuotedIdentifier", "LineComment", "BlockComment", "WS", 
			"ALIAS"
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(144);
				label();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(147);
				declareSection();
				}
			}

			setState(150);
			match(BEGIN);
			setState(151);
			statementList();
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(152);
				exceptionSection();
				}
			}

			setState(155);
			match(END);
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
			if (_la==SEMI) {
				{
				setState(159);
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
			setState(162);
			match(LABEL_START);
			setState(163);
			match(Identifier);
			setState(164);
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
			setState(166);
			match(DECLARE);
			setState(167);
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
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				declaration();
				}
				}
				setState(172); 
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(Identifier);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(175);
					match(CONSTANT);
					}
				}

				setState(178);
				dataType(0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(179);
					match(NOT);
					setState(180);
					match(NULL);
					}
				}

				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(183);
					match(ASSIGN);
					setState(184);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(185);
					match(DEFAULT);
					setState(186);
					expression(0);
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(189);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(Identifier);
				setState(192);
				match(CURSOR);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(193);
					match(LPAREN);
					setState(194);
					parameterList();
					setState(195);
					match(RPAREN);
					}
				}

				setState(199);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				selectStmt();
				setState(201);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(Identifier);
				setState(204);
				match(ALIAS);
				setState(205);
				match(FOR);
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(206);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(207);
					match(DOLLAR);
					setState(208);
					match(IntegerLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(211);
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
		public TerminalNode TIMESTAMP() { return getToken(PlpgsqlParser.TIMESTAMP, 0); }
		public TerminalNode RECORD() { return getToken(PlpgsqlParser.RECORD, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(215);
				match(INTEGER);
				}
				break;
			case BIGINT:
				{
				setState(216);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				{
				setState(217);
				match(SMALLINT);
				}
				break;
			case NUMERIC:
				{
				setState(218);
				match(NUMERIC);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(219);
					match(LPAREN);
					setState(220);
					match(IntegerLiteral);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(221);
						match(COMMA);
						setState(222);
						match(IntegerLiteral);
						}
					}

					setState(225);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				{
				setState(228);
				match(DECIMAL);
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(229);
					match(LPAREN);
					setState(230);
					match(IntegerLiteral);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(231);
						match(COMMA);
						setState(232);
						match(IntegerLiteral);
						}
					}

					setState(235);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case REAL:
				{
				setState(238);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(239);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				{
				setState(240);
				match(VARCHAR);
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(241);
					match(LPAREN);
					setState(242);
					match(IntegerLiteral);
					setState(243);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(246);
				match(CHAR);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(247);
					match(LPAREN);
					setState(248);
					match(IntegerLiteral);
					setState(249);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(252);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(253);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(254);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				{
				setState(255);
				match(TIMESTAMP);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(256);
					match(LPAREN);
					setState(257);
					match(IntegerLiteral);
					setState(258);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(261);
				match(RECORD);
				}
				break;
			case Identifier:
				{
				setState(262);
				match(Identifier);
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(263);
					match(PERCENT);
					setState(264);
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
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DataTypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dataType);
					setState(269);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(270);
					match(ARRAY);
					setState(273);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(271);
						match(LBRACK);
						setState(272);
						match(RBRACK);
						}
						break;
					}
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 211106534521382L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & -9079256848653090751L) != 0) || _la==QuotedIdentifier) {
				{
				{
				setState(280);
				statement();
				}
				}
				setState(285);
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
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				selectIntoStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				performStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				executeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				insertStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				updateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(292);
				deleteStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(293);
				setStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(294);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				caseStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(296);
				loopStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(297);
				whileStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(298);
				forStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(299);
				foreachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(300);
				exitStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(301);
				continueStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(302);
				returnStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(303);
				raiseStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(304);
				assertStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(305);
				nullStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(306);
				nestedBlock();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(307);
				getDiagnosticsStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(308);
				openCursorStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(309);
				closeCursorStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(310);
				fetchStmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(311);
				commitStmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(312);
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
			setState(315);
			variableRef();
			setState(316);
			match(ASSIGN);
			setState(317);
			expression(0);
			setState(318);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(Identifier);
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(321);
						match(DOT);
						setState(322);
						match(Identifier);
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(QuotedIdentifier);
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(329);
						match(DOT);
						setState(330);
						match(QuotedIdentifier);
						}
						} 
					}
					setState(335);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(338);
			match(SELECT);
			setState(339);
			selectList();
			setState(340);
			match(INTO);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(341);
				match(STRICT);
				}
			}

			setState(344);
			variableList();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(345);
				fromClause();
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(348);
				whereClause();
				}
			}

			setState(351);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(353);
				match(STAR);
				}
				break;
			case CASE:
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
				setState(354);
				expression(0);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(355);
					match(COMMA);
					setState(356);
					expression(0);
					}
					}
					setState(361);
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
			setState(364);
			variableRef();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(365);
				match(COMMA);
				setState(366);
				variableRef();
				}
				}
				setState(371);
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
		public List<TableRefContext> tableRef() {
			return getRuleContexts(TableRefContext.class);
		}
		public TableRefContext tableRef(int i) {
			return getRuleContext(TableRefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlpgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlpgsqlParser.COMMA, i);
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
			setState(372);
			match(FROM);
			setState(373);
			tableRef();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(374);
				match(COMMA);
				setState(375);
				tableRef();
				}
				}
				setState(380);
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
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				match(Identifier);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(382);
						match(AS);
						}
					}

					setState(385);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				functionCall();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(389);
					match(WITH);
					setState(390);
					match(Identifier);
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(393);
						match(AS);
						}
					}

					setState(396);
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
		enterRule(_localctx, 30, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(WHERE);
			setState(402);
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
		enterRule(_localctx, 32, RULE_performStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(PERFORM);
			setState(405);
			selectList();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(406);
				fromClause();
				}
			}

			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(409);
				whereClause();
				}
			}

			setState(412);
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
		enterRule(_localctx, 34, RULE_executeStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(EXECUTE);
			setState(415);
			expression(0);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(416);
				match(INTO);
				setState(417);
				variableList();
				}
			}

			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(420);
				match(USING);
				setState(421);
				expressionList();
				}
			}

			setState(424);
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
		enterRule(_localctx, 36, RULE_insertStmt);
		int _la;
		try {
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(INSERT);
				setState(427);
				match(INTO);
				setState(428);
				match(Identifier);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(429);
					match(LPAREN);
					setState(430);
					columnList();
					setState(431);
					match(RPAREN);
					}
				}

				setState(435);
				match(VALUES);
				setState(436);
				match(LPAREN);
				setState(437);
				expressionList();
				setState(438);
				match(RPAREN);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(439);
					match(RETURNING);
					setState(440);
					expressionList();
					setState(441);
					match(INTO);
					setState(442);
					variableList();
					}
				}

				setState(446);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				match(INSERT);
				setState(449);
				match(INTO);
				setState(450);
				match(Identifier);
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(451);
					match(LPAREN);
					setState(452);
					columnList();
					setState(453);
					match(RPAREN);
					}
				}

				setState(457);
				match(SELECT);
				setState(458);
				selectList();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(459);
					fromClause();
					}
				}

				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(462);
					whereClause();
					}
				}

				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(465);
					groupByClause();
					}
				}

				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(468);
					havingClause();
					}
				}

				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(471);
					orderByClause();
					}
				}

				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(474);
					limitClause();
					}
				}

				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURNING) {
					{
					setState(477);
					match(RETURNING);
					setState(478);
					expressionList();
					setState(479);
					match(INTO);
					setState(480);
					variableList();
					}
				}

				setState(484);
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
		enterRule(_localctx, 38, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(Identifier);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(489);
				match(COMMA);
				setState(490);
				match(Identifier);
				}
				}
				setState(495);
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
		enterRule(_localctx, 40, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			expression(0);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(497);
				match(COMMA);
				setState(498);
				expression(0);
				}
				}
				setState(503);
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
		enterRule(_localctx, 42, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(UPDATE);
			setState(505);
			match(Identifier);
			setState(506);
			match(SET);
			setState(507);
			assignmentList();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(508);
				whereClause();
				}
			}

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
		enterRule(_localctx, 44, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			columnAssignment();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(521);
				match(COMMA);
				setState(522);
				columnAssignment();
				}
				}
				setState(527);
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
		enterRule(_localctx, 46, RULE_columnAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(Identifier);
			setState(529);
			match(EQ);
			setState(530);
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
		enterRule(_localctx, 48, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(DELETE);
			setState(533);
			match(FROM);
			setState(534);
			match(Identifier);
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(535);
				whereClause();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(538);
				match(RETURNING);
				setState(539);
				expressionList();
				setState(540);
				match(INTO);
				setState(541);
				variableList();
				}
			}

			setState(545);
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
		enterRule(_localctx, 50, RULE_setStmt);
		int _la;
		try {
			setState(558);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(SET);
				setState(548);
				match(Identifier);
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(550);
				expression(0);
				setState(551);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				match(SET);
				setState(554);
				match(Identifier);
				setState(555);
				match(FROM);
				setState(556);
				match(CURRENT);
				setState(557);
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
		enterRule(_localctx, 52, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(IF);
			setState(561);
			expression(0);
			setState(562);
			match(THEN);
			setState(563);
			statementList();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(564);
				match(ELSIF);
				setState(565);
				expression(0);
				setState(566);
				match(THEN);
				setState(567);
				statementList();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(574);
				match(ELSE);
				setState(575);
				statementList();
				}
			}

			setState(578);
			match(END);
			setState(579);
			match(IF);
			setState(580);
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
		enterRule(_localctx, 54, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(CASE);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2377900603251621889L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 567594290587369475L) != 0)) {
				{
				setState(583);
				expression(0);
				}
			}

			setState(586);
			whenClauseList();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(587);
				match(ELSE);
				setState(588);
				statementList();
				}
			}

			setState(591);
			match(END);
			setState(592);
			match(CASE);
			setState(593);
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
		enterRule(_localctx, 56, RULE_whenClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(595);
				whenClause();
				}
				}
				setState(598); 
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
		enterRule(_localctx, 58, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(WHEN);
			setState(601);
			expression(0);
			setState(602);
			match(THEN);
			setState(603);
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
		enterRule(_localctx, 60, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(605);
				label();
				}
			}

			setState(608);
			match(LOOP);
			setState(609);
			statementList();
			setState(610);
			match(END);
			setState(611);
			match(LOOP);
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(612);
				label();
				}
			}

			setState(615);
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
		enterRule(_localctx, 62, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(617);
				label();
				}
			}

			setState(620);
			match(WHILE);
			setState(621);
			expression(0);
			setState(622);
			match(LOOP);
			setState(623);
			statementList();
			setState(624);
			match(END);
			setState(625);
			match(LOOP);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(626);
				label();
				}
			}

			setState(629);
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
		enterRule(_localctx, 64, RULE_forStmt);
		int _la;
		try {
			setState(673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(631);
					label();
					}
				}

				setState(634);
				match(FOR);
				setState(635);
				match(Identifier);
				setState(636);
				match(IN);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(637);
					match(REVERSE);
					}
				}

				setState(640);
				expression(0);
				setState(641);
				match(DOT);
				setState(642);
				match(DOT);
				setState(643);
				expression(0);
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(644);
					match(BY);
					setState(645);
					expression(0);
					}
				}

				setState(648);
				match(LOOP);
				setState(649);
				statementList();
				setState(650);
				match(END);
				setState(651);
				match(LOOP);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(652);
					label();
					}
				}

				setState(655);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(657);
					label();
					}
				}

				setState(660);
				match(FOR);
				setState(661);
				match(Identifier);
				setState(662);
				match(IN);
				setState(663);
				forQuerySource();
				setState(664);
				match(LOOP);
				setState(665);
				statementList();
				setState(666);
				match(END);
				setState(667);
				match(LOOP);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(668);
					label();
					}
				}

				setState(671);
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
		enterRule(_localctx, 66, RULE_forQuerySource);
		int _la;
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				match(EXECUTE);
				setState(676);
				expression(0);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				match(SELECT);
				setState(678);
				selectList();
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(679);
					fromClause();
					}
				}

				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(682);
					whereClause();
					}
				}

				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(685);
					groupByClause();
					}
				}

				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(688);
					havingClause();
					}
				}

				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(691);
					orderByClause();
					}
				}

				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(694);
					limitClause();
					}
				}

				}
				break;
			case CASE:
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
				setState(697);
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
		enterRule(_localctx, 68, RULE_foreachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(700);
				label();
				}
			}

			setState(703);
			match(FOREACH);
			setState(704);
			match(Identifier);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(705);
				match(SLICE);
				setState(706);
				match(IntegerLiteral);
				}
			}

			setState(709);
			match(IN);
			setState(710);
			match(ARRAY);
			setState(711);
			expression(0);
			setState(712);
			match(LOOP);
			setState(713);
			statementList();
			setState(714);
			match(END);
			setState(715);
			match(LOOP);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(716);
				label();
				}
			}

			setState(719);
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
		enterRule(_localctx, 70, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(EXIT);
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(722);
				match(Identifier);
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(725);
				match(WHEN);
				setState(726);
				expression(0);
				}
			}

			setState(729);
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
		enterRule(_localctx, 72, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(CONTINUE);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(732);
				match(Identifier);
				}
			}

			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(735);
				match(WHEN);
				setState(736);
				expression(0);
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
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PlpgsqlParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 74, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(RETURN);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2377900603251621889L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 567594290587369475L) != 0)) {
				{
				setState(742);
				expression(0);
				}
			}

			setState(745);
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
		enterRule(_localctx, 76, RULE_raiseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(RAISE);
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) {
				{
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==EXCEPTION || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(757);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(751);
				match(StringLiteral);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(752);
					match(COMMA);
					setState(753);
					expressionList();
					}
				}

				}
				break;
			case Identifier:
				{
				setState(756);
				match(Identifier);
				}
				break;
			case USING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(759);
				match(USING);
				setState(760);
				raiseOptionList();
				}
			}

			setState(763);
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
		enterRule(_localctx, 78, RULE_raiseOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			raiseOption();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(766);
				match(COMMA);
				setState(767);
				raiseOption();
				}
				}
				setState(772);
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
		enterRule(_localctx, 80, RULE_raiseOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(774);
			match(EQ);
			setState(775);
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
		enterRule(_localctx, 82, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(ASSERT);
			setState(778);
			expression(0);
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(779);
				match(COMMA);
				setState(780);
				expression(0);
				}
			}

			setState(783);
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
		enterRule(_localctx, 84, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(NULL);
			setState(786);
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
		enterRule(_localctx, 86, RULE_commitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(COMMIT);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(789);
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

			setState(792);
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
		enterRule(_localctx, 88, RULE_rollbackStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(ROLLBACK);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSACTION || _la==WORK) {
				{
				setState(795);
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

			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(798);
				match(TO);
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SAVEPOINT) {
					{
					setState(799);
					match(SAVEPOINT);
					}
				}

				setState(802);
				match(Identifier);
				}
			}

			setState(805);
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
		enterRule(_localctx, 90, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(807);
				label();
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(810);
				match(DECLARE);
				}
			}

			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(813);
				declarationList();
				}
			}

			setState(816);
			match(BEGIN);
			setState(817);
			statementList();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(818);
				exceptionSection();
				}
			}

			setState(821);
			match(END);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(822);
				label();
				}
			}

			setState(825);
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
		enterRule(_localctx, 92, RULE_exceptionSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(EXCEPTION);
			setState(828);
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
		enterRule(_localctx, 94, RULE_exceptionHandlerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(830);
				exceptionHandler();
				}
				}
				setState(833); 
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
		enterRule(_localctx, 96, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(WHEN);
			setState(836);
			exceptionConditionList();
			setState(837);
			match(THEN);
			setState(838);
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
		enterRule(_localctx, 98, RULE_exceptionConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			exceptionCondition();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(841);
				match(OR);
				setState(842);
				exceptionCondition();
				}
				}
				setState(847);
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
		enterRule(_localctx, 100, RULE_exceptionCondition);
		try {
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(848);
				match(Identifier);
				}
				break;
			case SQLSTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(849);
				match(SQLSTATE);
				setState(850);
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
		enterRule(_localctx, 102, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(GET);
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STACKED || _la==CURRENT) {
				{
				setState(854);
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

			setState(857);
			match(DIAGNOSTICS);
			setState(858);
			diagnosticsItemList();
			setState(859);
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
		enterRule(_localctx, 104, RULE_diagnosticsItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			diagnosticsItem();
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(862);
				match(COMMA);
				setState(863);
				diagnosticsItem();
				}
				}
				setState(868);
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
		enterRule(_localctx, 106, RULE_diagnosticsItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			variableRef();
			setState(870);
			match(EQ);
			setState(871);
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
		enterRule(_localctx, 108, RULE_diagnosticsOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
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
		enterRule(_localctx, 110, RULE_openCursorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(OPEN);
			setState(876);
			variableRef();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(877);
				match(LPAREN);
				setState(878);
				expressionList();
				setState(879);
				match(RPAREN);
				}
			}

			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(883);
				match(FOR);
				setState(884);
				selectStmt();
				}
			}

			setState(887);
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
		enterRule(_localctx, 112, RULE_closeCursorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(CLOSE);
			setState(890);
			variableRef();
			setState(891);
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
		enterRule(_localctx, 114, RULE_fetchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(FETCH);
			setState(894);
			variableRef();
			setState(895);
			match(INTO);
			setState(896);
			variableList();
			setState(897);
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
		public TerminalNode DISTINCT() { return getToken(PlpgsqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(PlpgsqlParser.ALL, 0); }
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
		enterRule(_localctx, 116, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(SELECT);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(900);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(903);
			selectList();
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(904);
				fromClause();
				}
			}

			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(907);
				whereClause();
				}
			}

			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(910);
				groupByClause();
				}
			}

			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(913);
				havingClause();
				}
			}

			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(916);
				orderByClause();
				}
			}

			setState(920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(919);
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
		enterRule(_localctx, 118, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(GROUP);
			setState(923);
			match(BY);
			setState(924);
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
		enterRule(_localctx, 120, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(HAVING);
			setState(927);
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
		enterRule(_localctx, 122, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929);
			match(ORDER);
			setState(930);
			match(BY);
			setState(931);
			orderByItem();
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(932);
				match(COMMA);
				setState(933);
				orderByItem();
				}
				}
				setState(938);
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
		enterRule(_localctx, 124, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			expression(0);
			setState(941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(940);
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

			setState(945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(943);
				match(NULLS);
				setState(944);
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
		enterRule(_localctx, 126, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(LIMIT);
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
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
				setState(948);
				expression(0);
				}
				break;
			case ALL:
				{
				setState(949);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(952);
				match(OFFSET);
				setState(953);
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
		enterRule(_localctx, 128, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			parameter();
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(957);
				match(COMMA);
				setState(958);
				parameter();
				}
				}
				setState(963);
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
		enterRule(_localctx, 130, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(Identifier);
			setState(965);
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
		public TerminalNode LPAREN() { return getToken(PlpgsqlParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PlpgsqlParser.RPAREN, 0); }
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
		public TerminalNode OR() { return getToken(PlpgsqlParser.OR, 0); }
		public TerminalNode IS() { return getToken(PlpgsqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public TerminalNode IN() { return getToken(PlpgsqlParser.IN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
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
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(968);
				literal();
				}
				break;
			case 2:
				{
				setState(969);
				variableRef();
				}
				break;
			case 3:
				{
				setState(970);
				functionCall();
				}
				break;
			case 4:
				{
				setState(971);
				match(INTERVAL);
				setState(972);
				match(StringLiteral);
				}
				break;
			case 5:
				{
				setState(973);
				match(LPAREN);
				setState(974);
				expression(0);
				setState(975);
				match(RPAREN);
				}
				break;
			case 6:
				{
				setState(977);
				match(NOT);
				setState(978);
				expression(5);
				}
				break;
			case 7:
				{
				setState(979);
				match(CASE);
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & 2377900603251621889L) != 0) || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 567594290587369475L) != 0)) {
					{
					setState(980);
					expression(0);
					}
				}

				setState(983);
				whenExprClauseList();
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(984);
					match(ELSE);
					setState(985);
					expression(0);
					}
				}

				setState(988);
				match(END);
				}
				break;
			case 8:
				{
				setState(990);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1034);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1032);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(993);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(994);
						_la = _input.LA(1);
						if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 49153L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(995);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(996);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(997);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(998);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(999);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1000);
						match(CONCAT);
						setState(1001);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1002);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1003);
						_la = _input.LA(1);
						if ( !(((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1004);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1005);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1007);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1006);
							match(NOT);
							}
						}

						setState(1009);
						match(BETWEEN);
						setState(1010);
						expression(0);
						setState(1011);
						match(AND);
						setState(1012);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1014);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1015);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1016);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1017);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1018);
						match(IS);
						setState(1020);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1019);
							match(NOT);
							}
						}

						setState(1022);
						match(NULL);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1023);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1025);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(1024);
							match(NOT);
							}
						}

						setState(1027);
						match(IN);
						setState(1028);
						match(LPAREN);
						setState(1029);
						expressionList();
						setState(1030);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(1036);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
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
		enterRule(_localctx, 134, RULE_whenExprClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1037);
				whenExprClause();
				}
				}
				setState(1040); 
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
		enterRule(_localctx, 136, RULE_whenExprClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			match(WHEN);
			setState(1043);
			expression(0);
			setState(1044);
			match(THEN);
			setState(1045);
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
		enterRule(_localctx, 138, RULE_arrayExpression);
		try {
			setState(1057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				match(ARRAY);
				setState(1048);
				match(LBRACK);
				setState(1049);
				expressionList();
				setState(1050);
				match(RBRACK);
				}
				break;
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1052);
				variableRef();
				setState(1053);
				match(LBRACK);
				setState(1054);
				expression(0);
				setState(1055);
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
		enterRule(_localctx, 140, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			match(Identifier);
			setState(1060);
			match(LPAREN);
			setState(1063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
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
				setState(1061);
				expressionList();
				}
				break;
			case STAR:
				{
				setState(1062);
				match(STAR);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(1065);
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
		enterRule(_localctx, 142, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & 135107988871446529L) != 0)) ) {
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
		case 66:
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
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0096\u042e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"E\u0002F\u0007F\u0002G\u0007G\u0001\u0000\u0003\u0000\u0092\b\u0000\u0001"+
		"\u0000\u0003\u0000\u0095\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u0000\u009a\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u009e\b\u0000"+
		"\u0001\u0000\u0003\u0000\u00a1\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003"+
		"\u00ab\b\u0003\u000b\u0003\f\u0003\u00ac\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00b1\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b6"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00bc"+
		"\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c6\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00d2\b\u0004\u0001\u0004\u0003"+
		"\u0004\u00d5\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e0"+
		"\b\u0005\u0001\u0005\u0003\u0005\u00e3\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ea\b\u0005\u0001\u0005"+
		"\u0003\u0005\u00ed\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00f5\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00fb\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0104\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u010a\b\u0005\u0003\u0005\u010c\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0112\b\u0005\u0005\u0005\u0114\b\u0005"+
		"\n\u0005\f\u0005\u0117\t\u0005\u0001\u0006\u0005\u0006\u011a\b\u0006\n"+
		"\u0006\f\u0006\u011d\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u013a\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u0144\b\t\n\t\f\t\u0147\t\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u014c\b\t\n\t\f\t\u014f\t\t\u0003\t\u0151\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0003\n\u0157\b\n\u0001\n\u0001\n\u0003\n\u015b\b\n\u0001"+
		"\n\u0003\n\u015e\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0166\b\u000b\n\u000b\f\u000b\u0169\t\u000b\u0003"+
		"\u000b\u016b\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u0170\b\f\n\f\f\f"+
		"\u0173\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0179\b\r\n\r\f\r\u017c"+
		"\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u0180\b\u000e\u0001\u000e\u0003"+
		"\u000e\u0183\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0188"+
		"\b\u000e\u0001\u000e\u0003\u000e\u018b\b\u000e\u0001\u000e\u0003\u000e"+
		"\u018e\b\u000e\u0003\u000e\u0190\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0198\b\u0010\u0001"+
		"\u0010\u0003\u0010\u019b\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01a3\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u01a7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01b2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01bd"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01c8\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01cd\b\u0012\u0001\u0012\u0003"+
		"\u0012\u01d0\b\u0012\u0001\u0012\u0003\u0012\u01d3\b\u0012\u0001\u0012"+
		"\u0003\u0012\u01d6\b\u0012\u0001\u0012\u0003\u0012\u01d9\b\u0012\u0001"+
		"\u0012\u0003\u0012\u01dc\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u01e3\b\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01e7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01ec"+
		"\b\u0013\n\u0013\f\u0013\u01ef\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01f4\b\u0014\n\u0014\f\u0014\u01f7\t\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01fe\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0205"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u020c\b\u0016\n\u0016\f\u0016\u020f\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0219\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0220\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u022f\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u023a\b\u001a\n\u001a"+
		"\f\u001a\u023d\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0241\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0249\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u024e\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0004\u001c\u0255\b\u001c\u000b\u001c\f\u001c\u0256\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e\u025f"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0266\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u026b"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0274\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0003 \u0279\b \u0001 \u0001 \u0001 \u0001 \u0003 \u027f\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u0287\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u028e\b \u0001 \u0001 \u0001 \u0003 \u0293\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u029e\b \u0001"+
		" \u0001 \u0003 \u02a2\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02a9"+
		"\b!\u0001!\u0003!\u02ac\b!\u0001!\u0003!\u02af\b!\u0001!\u0003!\u02b2"+
		"\b!\u0001!\u0003!\u02b5\b!\u0001!\u0003!\u02b8\b!\u0001!\u0003!\u02bb"+
		"\b!\u0001\"\u0003\"\u02be\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u02c4\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02ce\b\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u02d4\b#\u0001"+
		"#\u0001#\u0003#\u02d8\b#\u0001#\u0001#\u0001$\u0001$\u0003$\u02de\b$\u0001"+
		"$\u0001$\u0003$\u02e2\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u02e8\b%\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u02ee\b&\u0001&\u0001&\u0001&\u0003&\u02f3"+
		"\b&\u0001&\u0003&\u02f6\b&\u0001&\u0001&\u0003&\u02fa\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u0301\b\'\n\'\f\'\u0304\t\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u030e\b)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0001+\u0003+\u0317\b+\u0001+\u0001+\u0001"+
		",\u0001,\u0003,\u031d\b,\u0001,\u0001,\u0003,\u0321\b,\u0001,\u0003,\u0324"+
		"\b,\u0001,\u0001,\u0001-\u0003-\u0329\b-\u0001-\u0003-\u032c\b-\u0001"+
		"-\u0003-\u032f\b-\u0001-\u0001-\u0001-\u0003-\u0334\b-\u0001-\u0001-\u0003"+
		"-\u0338\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0004/\u0340\b/\u000b"+
		"/\f/\u0341\u00010\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0005"+
		"1\u034c\b1\n1\f1\u034f\t1\u00012\u00012\u00012\u00032\u0354\b2\u00013"+
		"\u00013\u00033\u0358\b3\u00013\u00013\u00013\u00013\u00014\u00014\u0001"+
		"4\u00054\u0361\b4\n4\f4\u0364\t4\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0372\b7\u00017\u0001"+
		"7\u00037\u0376\b7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u0001:\u0001:\u0003:\u0386\b:\u0001:\u0001"+
		":\u0003:\u038a\b:\u0001:\u0003:\u038d\b:\u0001:\u0003:\u0390\b:\u0001"+
		":\u0003:\u0393\b:\u0001:\u0003:\u0396\b:\u0001:\u0003:\u0399\b:\u0001"+
		";\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0005=\u03a7\b=\n=\f=\u03aa\t=\u0001>\u0001>\u0003>\u03ae\b>"+
		"\u0001>\u0001>\u0003>\u03b2\b>\u0001?\u0001?\u0001?\u0003?\u03b7\b?\u0001"+
		"?\u0001?\u0003?\u03bb\b?\u0001@\u0001@\u0001@\u0005@\u03c0\b@\n@\f@\u03c3"+
		"\t@\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u03d6\bB\u0001"+
		"B\u0001B\u0001B\u0003B\u03db\bB\u0001B\u0001B\u0001B\u0003B\u03e0\bB\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u03f0\bB\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u03fd\bB\u0001B\u0001"+
		"B\u0001B\u0003B\u0402\bB\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0409"+
		"\bB\nB\fB\u040c\tB\u0001C\u0004C\u040f\bC\u000bC\fC\u0410\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001E\u0001E\u0001E\u0003E\u0422\bE\u0001F\u0001F\u0001F\u0001F\u0003"+
		"F\u0428\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0000\u0002\n\u0084H\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0000\u000f\u0002\u0000\r\rWW\u0001\u0000"+
		"st\u0002\u0000\u001f\u001fxx\u0002\u0000\u0004\u0004HL\u0001\u0000MQ\u0001"+
		"\u000023\u0001\u0000TU\u0001\u0000 !\u0001\u0000\'(\u0001\u0000*+\u0002"+
		"\u0000rr\u0080\u0081\u0001\u0000~\u007f\u0001\u0000x}\u0001\u0000Z[\u0003"+
		"\u0000XXpq\u008d\u0090\u04a9\u0000\u0091\u0001\u0000\u0000\u0000\u0002"+
		"\u00a2\u0001\u0000\u0000\u0000\u0004\u00a6\u0001\u0000\u0000\u0000\u0006"+
		"\u00aa\u0001\u0000\u0000\u0000\b\u00d4\u0001\u0000\u0000\u0000\n\u010b"+
		"\u0001\u0000\u0000\u0000\f\u011b\u0001\u0000\u0000\u0000\u000e\u0139\u0001"+
		"\u0000\u0000\u0000\u0010\u013b\u0001\u0000\u0000\u0000\u0012\u0150\u0001"+
		"\u0000\u0000\u0000\u0014\u0152\u0001\u0000\u0000\u0000\u0016\u016a\u0001"+
		"\u0000\u0000\u0000\u0018\u016c\u0001\u0000\u0000\u0000\u001a\u0174\u0001"+
		"\u0000\u0000\u0000\u001c\u018f\u0001\u0000\u0000\u0000\u001e\u0191\u0001"+
		"\u0000\u0000\u0000 \u0194\u0001\u0000\u0000\u0000\"\u019e\u0001\u0000"+
		"\u0000\u0000$\u01e6\u0001\u0000\u0000\u0000&\u01e8\u0001\u0000\u0000\u0000"+
		"(\u01f0\u0001\u0000\u0000\u0000*\u01f8\u0001\u0000\u0000\u0000,\u0208"+
		"\u0001\u0000\u0000\u0000.\u0210\u0001\u0000\u0000\u00000\u0214\u0001\u0000"+
		"\u0000\u00002\u022e\u0001\u0000\u0000\u00004\u0230\u0001\u0000\u0000\u0000"+
		"6\u0246\u0001\u0000\u0000\u00008\u0254\u0001\u0000\u0000\u0000:\u0258"+
		"\u0001\u0000\u0000\u0000<\u025e\u0001\u0000\u0000\u0000>\u026a\u0001\u0000"+
		"\u0000\u0000@\u02a1\u0001\u0000\u0000\u0000B\u02ba\u0001\u0000\u0000\u0000"+
		"D\u02bd\u0001\u0000\u0000\u0000F\u02d1\u0001\u0000\u0000\u0000H\u02db"+
		"\u0001\u0000\u0000\u0000J\u02e5\u0001\u0000\u0000\u0000L\u02eb\u0001\u0000"+
		"\u0000\u0000N\u02fd\u0001\u0000\u0000\u0000P\u0305\u0001\u0000\u0000\u0000"+
		"R\u0309\u0001\u0000\u0000\u0000T\u0311\u0001\u0000\u0000\u0000V\u0314"+
		"\u0001\u0000\u0000\u0000X\u031a\u0001\u0000\u0000\u0000Z\u0328\u0001\u0000"+
		"\u0000\u0000\\\u033b\u0001\u0000\u0000\u0000^\u033f\u0001\u0000\u0000"+
		"\u0000`\u0343\u0001\u0000\u0000\u0000b\u0348\u0001\u0000\u0000\u0000d"+
		"\u0353\u0001\u0000\u0000\u0000f\u0355\u0001\u0000\u0000\u0000h\u035d\u0001"+
		"\u0000\u0000\u0000j\u0365\u0001\u0000\u0000\u0000l\u0369\u0001\u0000\u0000"+
		"\u0000n\u036b\u0001\u0000\u0000\u0000p\u0379\u0001\u0000\u0000\u0000r"+
		"\u037d\u0001\u0000\u0000\u0000t\u0383\u0001\u0000\u0000\u0000v\u039a\u0001"+
		"\u0000\u0000\u0000x\u039e\u0001\u0000\u0000\u0000z\u03a1\u0001\u0000\u0000"+
		"\u0000|\u03ab\u0001\u0000\u0000\u0000~\u03b3\u0001\u0000\u0000\u0000\u0080"+
		"\u03bc\u0001\u0000\u0000\u0000\u0082\u03c4\u0001\u0000\u0000\u0000\u0084"+
		"\u03df\u0001\u0000\u0000\u0000\u0086\u040e\u0001\u0000\u0000\u0000\u0088"+
		"\u0412\u0001\u0000\u0000\u0000\u008a\u0421\u0001\u0000\u0000\u0000\u008c"+
		"\u0423\u0001\u0000\u0000\u0000\u008e\u042b\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0003\u0002\u0001\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093"+
		"\u0095\u0003\u0004\u0002\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u0002\u0000\u0000\u0097\u0099\u0003\f\u0006\u0000\u0098\u009a"+
		"\u0003\\.\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u0005"+
		"\u0003\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u00a1\u0005\u0084\u0000\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0001\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005\u008b\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0091\u0000\u0000\u00a4\u00a5\u0005\u008c\u0000\u0000\u00a5\u0003\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005\u0001\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0006\u0003\u0000\u00a8\u0005\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003"+
		"\b\u0004\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ad\u0007\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005\u0091"+
		"\u0000\u0000\u00af\u00b1\u0005\\\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0003\n\u0005\u0000\u00b3\u00b4\u0005Y\u0000\u0000"+
		"\u00b4\u00b6\u0005X\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00bb\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005v\u0000\u0000\u00b8\u00bc\u0003\u0084B\u0000\u00b9\u00ba\u0005"+
		"]\u0000\u0000\u00ba\u00bc\u0003\u0084B\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0084\u0000"+
		"\u0000\u00be\u00d5\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0091\u0000"+
		"\u0000\u00c0\u00c5\u0005o\u0000\u0000\u00c1\u00c2\u0005\u0087\u0000\u0000"+
		"\u00c2\u00c3\u0003\u0080@\u0000\u00c3\u00c4\u0005\u0088\u0000\u0000\u00c4"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0007\u0000\u0000\u0000\u00c8\u00c9\u0003t:\u0000\u00c9\u00ca\u0005"+
		"\u0084\u0000\u0000\u00ca\u00d5\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0091\u0000\u0000\u00cc\u00cd\u0005\u0096\u0000\u0000\u00cd\u00d1\u0005"+
		"\r\u0000\u0000\u00ce\u00d2\u0005\u0091\u0000\u0000\u00cf\u00d0\u0005u"+
		"\u0000\u0000\u00d0\u00d2\u0005\u008d\u0000\u0000\u00d1\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d5\u0005\u0084\u0000\u0000\u00d4\u00ae\u0001\u0000"+
		"\u0000\u0000\u00d4\u00bf\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000"+
		"\u0000\u0000\u00d5\t\u0001\u0000\u0000\u0000\u00d6\u00d7\u0006\u0005\uffff"+
		"\uffff\u0000\u00d7\u010c\u00054\u0000\u0000\u00d8\u010c\u00055\u0000\u0000"+
		"\u00d9\u010c\u00056\u0000\u0000\u00da\u00e2\u00057\u0000\u0000\u00db\u00dc"+
		"\u0005\u0087\u0000\u0000\u00dc\u00df\u0005\u008d\u0000\u0000\u00dd\u00de"+
		"\u0005\u0085\u0000\u0000\u00de\u00e0\u0005\u008d\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005\u0088\u0000\u0000\u00e2\u00db"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u010c"+
		"\u0001\u0000\u0000\u0000\u00e4\u00ec\u00058\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0087\u0000\u0000\u00e6\u00e9\u0005\u008d\u0000\u0000\u00e7\u00e8\u0005"+
		"\u0085\u0000\u0000\u00e8\u00ea\u0005\u008d\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0005\u0088\u0000\u0000\u00ec\u00e5\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u010c\u0001"+
		"\u0000\u0000\u0000\u00ee\u010c\u00059\u0000\u0000\u00ef\u010c\u0005:\u0000"+
		"\u0000\u00f0\u00f4\u0005;\u0000\u0000\u00f1\u00f2\u0005\u0087\u0000\u0000"+
		"\u00f2\u00f3\u0005\u008d\u0000\u0000\u00f3\u00f5\u0005\u0088\u0000\u0000"+
		"\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u010c\u0001\u0000\u0000\u0000\u00f6\u00fa\u0005<\u0000\u0000\u00f7"+
		"\u00f8\u0005\u0087\u0000\u0000\u00f8\u00f9\u0005\u008d\u0000\u0000\u00f9"+
		"\u00fb\u0005\u0088\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0001\u0000\u0000\u0000\u00fb\u010c\u0001\u0000\u0000\u0000\u00fc"+
		"\u010c\u0005=\u0000\u0000\u00fd\u010c\u0005>\u0000\u0000\u00fe\u010c\u0005"+
		"?\u0000\u0000\u00ff\u0103\u0005@\u0000\u0000\u0100\u0101\u0005\u0087\u0000"+
		"\u0000\u0101\u0102\u0005\u008d\u0000\u0000\u0102\u0104\u0005\u0088\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u010c\u0001\u0000\u0000\u0000\u0105\u010c\u0005B\u0000\u0000"+
		"\u0106\u0109\u0005\u0091\u0000\u0000\u0107\u0108\u0005r\u0000\u0000\u0108"+
		"\u010a\u0007\u0001\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b"+
		"\u00d6\u0001\u0000\u0000\u0000\u010b\u00d8\u0001\u0000\u0000\u0000\u010b"+
		"\u00d9\u0001\u0000\u0000\u0000\u010b\u00da\u0001\u0000\u0000\u0000\u010b"+
		"\u00e4\u0001\u0000\u0000\u0000\u010b\u00ee\u0001\u0000\u0000\u0000\u010b"+
		"\u00ef\u0001\u0000\u0000\u0000\u010b\u00f0\u0001\u0000\u0000\u0000\u010b"+
		"\u00f6\u0001\u0000\u0000\u0000\u010b\u00fc\u0001\u0000\u0000\u0000\u010b"+
		"\u00fd\u0001\u0000\u0000\u0000\u010b\u00fe\u0001\u0000\u0000\u0000\u010b"+
		"\u00ff\u0001\u0000\u0000\u0000\u010b\u0105\u0001\u0000\u0000\u0000\u010b"+
		"\u0106\u0001\u0000\u0000\u0000\u010c\u0115\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\n\u0001\u0000\u0000\u010e\u0111\u0005F\u0000\u0000\u010f\u0110"+
		"\u0005\u0089\u0000\u0000\u0110\u0112\u0005\u008a\u0000\u0000\u0111\u010f"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0114\u0117"+
		"\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0001\u0000\u0000\u0000\u0116\u000b\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0003\u000e\u0007\u0000\u0119\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\r\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u013a\u0003"+
		"\u0010\b\u0000\u011f\u013a\u0003\u0014\n\u0000\u0120\u013a\u0003 \u0010"+
		"\u0000\u0121\u013a\u0003\"\u0011\u0000\u0122\u013a\u0003$\u0012\u0000"+
		"\u0123\u013a\u0003*\u0015\u0000\u0124\u013a\u00030\u0018\u0000\u0125\u013a"+
		"\u00032\u0019\u0000\u0126\u013a\u00034\u001a\u0000\u0127\u013a\u00036"+
		"\u001b\u0000\u0128\u013a\u0003<\u001e\u0000\u0129\u013a\u0003>\u001f\u0000"+
		"\u012a\u013a\u0003@ \u0000\u012b\u013a\u0003D\"\u0000\u012c\u013a\u0003"+
		"F#\u0000\u012d\u013a\u0003H$\u0000\u012e\u013a\u0003J%\u0000\u012f\u013a"+
		"\u0003L&\u0000\u0130\u013a\u0003R)\u0000\u0131\u013a\u0003T*\u0000\u0132"+
		"\u013a\u0003Z-\u0000\u0133\u013a\u0003f3\u0000\u0134\u013a\u0003n7\u0000"+
		"\u0135\u013a\u0003p8\u0000\u0136\u013a\u0003r9\u0000\u0137\u013a\u0003"+
		"V+\u0000\u0138\u013a\u0003X,\u0000\u0139\u011e\u0001\u0000\u0000\u0000"+
		"\u0139\u011f\u0001\u0000\u0000\u0000\u0139\u0120\u0001\u0000\u0000\u0000"+
		"\u0139\u0121\u0001\u0000\u0000\u0000\u0139\u0122\u0001\u0000\u0000\u0000"+
		"\u0139\u0123\u0001\u0000\u0000\u0000\u0139\u0124\u0001\u0000\u0000\u0000"+
		"\u0139\u0125\u0001\u0000\u0000\u0000\u0139\u0126\u0001\u0000\u0000\u0000"+
		"\u0139\u0127\u0001\u0000\u0000\u0000\u0139\u0128\u0001\u0000\u0000\u0000"+
		"\u0139\u0129\u0001\u0000\u0000\u0000\u0139\u012a\u0001\u0000\u0000\u0000"+
		"\u0139\u012b\u0001\u0000\u0000\u0000\u0139\u012c\u0001\u0000\u0000\u0000"+
		"\u0139\u012d\u0001\u0000\u0000\u0000\u0139\u012e\u0001\u0000\u0000\u0000"+
		"\u0139\u012f\u0001\u0000\u0000\u0000\u0139\u0130\u0001\u0000\u0000\u0000"+
		"\u0139\u0131\u0001\u0000\u0000\u0000\u0139\u0132\u0001\u0000\u0000\u0000"+
		"\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0134\u0001\u0000\u0000\u0000"+
		"\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u000f\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u0012\t\u0000\u013c"+
		"\u013d\u0005v\u0000\u0000\u013d\u013e\u0003\u0084B\u0000\u013e\u013f\u0005"+
		"\u0084\u0000\u0000\u013f\u0011\u0001\u0000\u0000\u0000\u0140\u0145\u0005"+
		"\u0091\u0000\u0000\u0141\u0142\u0005\u0086\u0000\u0000\u0142\u0144\u0005"+
		"\u0091\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147\u0001"+
		"\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001"+
		"\u0000\u0000\u0000\u0146\u0151\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u014d\u0005\u0092\u0000\u0000\u0149\u014a\u0005"+
		"\u0086\u0000\u0000\u014a\u014c\u0005\u0092\u0000\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0151\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0140\u0001"+
		"\u0000\u0000\u0000\u0150\u0148\u0001\u0000\u0000\u0000\u0151\u0013\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0005\u0013\u0000\u0000\u0153\u0154\u0003"+
		"\u0016\u000b\u0000\u0154\u0156\u0005\u0019\u0000\u0000\u0155\u0157\u0005"+
		"_\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0003\u0018"+
		"\f\u0000\u0159\u015b\u0003\u001a\r\u0000\u015a\u0159\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0003\u001e\u000f\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0005\u0084\u0000\u0000\u0160\u0015\u0001\u0000\u0000"+
		"\u0000\u0161\u016b\u0005\u0080\u0000\u0000\u0162\u0167\u0003\u0084B\u0000"+
		"\u0163\u0164\u0005\u0085\u0000\u0000\u0164\u0166\u0003\u0084B\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167"+
		"\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168"+
		"\u016b\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a"+
		"\u0161\u0001\u0000\u0000\u0000\u016a\u0162\u0001\u0000\u0000\u0000\u016b"+
		"\u0017\u0001\u0000\u0000\u0000\u016c\u0171\u0003\u0012\t\u0000\u016d\u016e"+
		"\u0005\u0085\u0000\u0000\u016e\u0170\u0003\u0012\t\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0019\u0001"+
		"\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005"+
		"\u001a\u0000\u0000\u0175\u017a\u0003\u001c\u000e\u0000\u0176\u0177\u0005"+
		"\u0085\u0000\u0000\u0177\u0179\u0003\u001c\u000e\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000\u0000\u017a\u0178\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u001b\u0001"+
		"\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0182\u0005"+
		"\u0091\u0000\u0000\u017e\u0180\u0005V\u0000\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0183\u0005\u0091\u0000\u0000\u0182\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0190\u0001\u0000"+
		"\u0000\u0000\u0184\u0187\u0003\u008cF\u0000\u0185\u0186\u0005,\u0000\u0000"+
		"\u0186\u0188\u0005\u0091\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018d\u0001\u0000\u0000\u0000"+
		"\u0189\u018b\u0005V\u0000\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018e\u0005\u0091\u0000\u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000\u018f"+
		"\u017d\u0001\u0000\u0000\u0000\u018f\u0184\u0001\u0000\u0000\u0000\u0190"+
		"\u001d\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u001b\u0000\u0000\u0192"+
		"\u0193\u0003\u0084B\u0000\u0193\u001f\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0005\u0017\u0000\u0000\u0195\u0197\u0003\u0016\u000b\u0000\u0196\u0198"+
		"\u0003\u001a\r\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197\u0198\u0001"+
		"\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000\u0000\u0199\u019b\u0003"+
		"\u001e\u000f\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"\u0084\u0000\u0000\u019d!\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0018"+
		"\u0000\u0000\u019f\u01a2\u0003\u0084B\u0000\u01a0\u01a1\u0005\u0019\u0000"+
		"\u0000\u01a1\u01a3\u0003\u0018\f\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005^\u0000\u0000\u01a5\u01a7\u0003(\u0014\u0000\u01a6\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0084\u0000\u0000\u01a9#\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005\u0014\u0000\u0000\u01ab\u01ac\u0005"+
		"\u0019\u0000\u0000\u01ac\u01b1\u0005\u0091\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0087\u0000\u0000\u01ae\u01af\u0003&\u0013\u0000\u01af\u01b0\u0005\u0088"+
		"\u0000\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0005\u001d\u0000\u0000\u01b4\u01b5\u0005\u0087"+
		"\u0000\u0000\u01b5\u01b6\u0003(\u0014\u0000\u01b6\u01bc\u0005\u0088\u0000"+
		"\u0000\u01b7\u01b8\u0005\u001e\u0000\u0000\u01b8\u01b9\u0003(\u0014\u0000"+
		"\u01b9\u01ba\u0005\u0019\u0000\u0000\u01ba\u01bb\u0003\u0018\f\u0000\u01bb"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0005\u0084\u0000\u0000\u01bf\u01e7\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005\u0014\u0000\u0000\u01c1\u01c2\u0005\u0019\u0000\u0000\u01c2"+
		"\u01c7\u0005\u0091\u0000\u0000\u01c3\u01c4\u0005\u0087\u0000\u0000\u01c4"+
		"\u01c5\u0003&\u0013\u0000\u01c5\u01c6\u0005\u0088\u0000\u0000\u01c6\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c3\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0005\u0013\u0000\u0000\u01ca\u01cc\u0003\u0016\u000b\u0000\u01cb\u01cd"+
		"\u0003\u001a\r\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000\u0000\u0000\u01ce\u01d0\u0003"+
		"\u001e\u000f\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003"+
		"v;\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01d6\u0003x<\u0000\u01d5"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d9\u0003z=\u0000\u01d8\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01db\u0001"+
		"\u0000\u0000\u0000\u01da\u01dc\u0003~?\u0000\u01db\u01da\u0001\u0000\u0000"+
		"\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01e2\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005\u001e\u0000\u0000\u01de\u01df\u0003(\u0014\u0000"+
		"\u01df\u01e0\u0005\u0019\u0000\u0000\u01e0\u01e1\u0003\u0018\f\u0000\u01e1"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\u0084\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6"+
		"\u01aa\u0001\u0000\u0000\u0000\u01e6\u01c0\u0001\u0000\u0000\u0000\u01e7"+
		"%\u0001\u0000\u0000\u0000\u01e8\u01ed\u0005\u0091\u0000\u0000\u01e9\u01ea"+
		"\u0005\u0085\u0000\u0000\u01ea\u01ec\u0005\u0091\u0000\u0000\u01eb\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\'\u0001"+
		"\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000\u0000\u01f0\u01f5\u0003"+
		"\u0084B\u0000\u01f1\u01f2\u0005\u0085\u0000\u0000\u01f2\u01f4\u0003\u0084"+
		"B\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000"+
		"\u0000\u01f6)\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0005\u0015\u0000\u0000\u01f9\u01fa\u0005\u0091\u0000\u0000"+
		"\u01fa\u01fb\u0005\u001c\u0000\u0000\u01fb\u01fd\u0003,\u0016\u0000\u01fc"+
		"\u01fe\u0003\u001e\u000f\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fe\u0204\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005\u001e\u0000\u0000\u0200\u0201\u0003(\u0014\u0000\u0201\u0202"+
		"\u0005\u0019\u0000\u0000\u0202\u0203\u0003\u0018\f\u0000\u0203\u0205\u0001"+
		"\u0000\u0000\u0000\u0204\u01ff\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0005"+
		"\u0084\u0000\u0000\u0207+\u0001\u0000\u0000\u0000\u0208\u020d\u0003.\u0017"+
		"\u0000\u0209\u020a\u0005\u0085\u0000\u0000\u020a\u020c\u0003.\u0017\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000"+
		"\u020d\u020b\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e-\u0001\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005\u0091\u0000\u0000\u0211\u0212\u0005x\u0000\u0000\u0212\u0213"+
		"\u0003\u0084B\u0000\u0213/\u0001\u0000\u0000\u0000\u0214\u0215\u0005\u0016"+
		"\u0000\u0000\u0215\u0216\u0005\u001a\u0000\u0000\u0216\u0218\u0005\u0091"+
		"\u0000\u0000\u0217\u0219\u0003\u001e\u000f\u0000\u0218\u0217\u0001\u0000"+
		"\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219\u021f\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0005\u001e\u0000\u0000\u021b\u021c\u0003(\u0014"+
		"\u0000\u021c\u021d\u0005\u0019\u0000\u0000\u021d\u021e\u0003\u0018\f\u0000"+
		"\u021e\u0220\u0001\u0000\u0000\u0000\u021f\u021a\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005\u0084\u0000\u0000\u02221\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0005\u001c\u0000\u0000\u0224\u0225\u0005\u0091\u0000\u0000\u0225"+
		"\u0226\u0007\u0002\u0000\u0000\u0226\u0227\u0003\u0084B\u0000\u0227\u0228"+
		"\u0005\u0084\u0000\u0000\u0228\u022f\u0001\u0000\u0000\u0000\u0229\u022a"+
		"\u0005\u001c\u0000\u0000\u022a\u022b\u0005\u0091\u0000\u0000\u022b\u022c"+
		"\u0005\u001a\u0000\u0000\u022c\u022d\u0005U\u0000\u0000\u022d\u022f\u0005"+
		"\u0084\u0000\u0000\u022e\u0223\u0001\u0000\u0000\u0000\u022e\u0229\u0001"+
		"\u0000\u0000\u0000\u022f3\u0001\u0000\u0000\u0000\u0230\u0231\u0005\u0005"+
		"\u0000\u0000\u0231\u0232\u0003\u0084B\u0000\u0232\u0233\u0005\u0006\u0000"+
		"\u0000\u0233\u023b\u0003\f\u0006\u0000\u0234\u0235\u0005\u0007\u0000\u0000"+
		"\u0235\u0236\u0003\u0084B\u0000\u0236\u0237\u0005\u0006\u0000\u0000\u0237"+
		"\u0238\u0003\f\u0006\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0234"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u0240"+
		"\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005\b\u0000\u0000\u023f\u0241\u0003\f\u0006\u0000\u0240\u023e\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u0005\u0003\u0000\u0000\u0243\u0244\u0005"+
		"\u0005\u0000\u0000\u0244\u0245\u0005\u0084\u0000\u0000\u02455\u0001\u0000"+
		"\u0000\u0000\u0246\u0248\u0005\t\u0000\u0000\u0247\u0249\u0003\u0084B"+
		"\u0000\u0248\u0247\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000"+
		"\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024d\u00038\u001c\u0000"+
		"\u024b\u024c\u0005\b\u0000\u0000\u024c\u024e\u0003\f\u0006\u0000\u024d"+
		"\u024b\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0005\u0003\u0000\u0000\u0250"+
		"\u0251\u0005\t\u0000\u0000\u0251\u0252\u0005\u0084\u0000\u0000\u02527"+
		"\u0001\u0000\u0000\u0000\u0253\u0255\u0003:\u001d\u0000\u0254\u0253\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0254\u0001"+
		"\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u02579\u0001\u0000"+
		"\u0000\u0000\u0258\u0259\u0005\n\u0000\u0000\u0259\u025a\u0003\u0084B"+
		"\u0000\u025a\u025b\u0005\u0006\u0000\u0000\u025b\u025c\u0003\f\u0006\u0000"+
		"\u025c;\u0001\u0000\u0000\u0000\u025d\u025f\u0003\u0002\u0001\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u000b\u0000\u0000\u0261"+
		"\u0262\u0003\f\u0006\u0000\u0262\u0263\u0005\u0003\u0000\u0000\u0263\u0265"+
		"\u0005\u000b\u0000\u0000\u0264\u0266\u0003\u0002\u0001\u0000\u0265\u0264"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0005\u0084\u0000\u0000\u0268=\u0001"+
		"\u0000\u0000\u0000\u0269\u026b\u0003\u0002\u0001\u0000\u026a\u0269\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0001"+
		"\u0000\u0000\u0000\u026c\u026d\u0005\f\u0000\u0000\u026d\u026e\u0003\u0084"+
		"B\u0000\u026e\u026f\u0005\u000b\u0000\u0000\u026f\u0270\u0003\f\u0006"+
		"\u0000\u0270\u0271\u0005\u0003\u0000\u0000\u0271\u0273\u0005\u000b\u0000"+
		"\u0000\u0272\u0274\u0003\u0002\u0001\u0000\u0273\u0272\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0005\u0084\u0000\u0000\u0276?\u0001\u0000\u0000\u0000"+
		"\u0277\u0279\u0003\u0002\u0001\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005\r\u0000\u0000\u027b\u027c\u0005\u0091\u0000\u0000\u027c"+
		"\u027e\u0005C\u0000\u0000\u027d\u027f\u0005D\u0000\u0000\u027e\u027d\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001"+
		"\u0000\u0000\u0000\u0280\u0281\u0003\u0084B\u0000\u0281\u0282\u0005\u0086"+
		"\u0000\u0000\u0282\u0283\u0005\u0086\u0000\u0000\u0283\u0286\u0003\u0084"+
		"B\u0000\u0284\u0285\u0005E\u0000\u0000\u0285\u0287\u0003\u0084B\u0000"+
		"\u0286\u0284\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000"+
		"\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0005\u000b\u0000\u0000"+
		"\u0289\u028a\u0003\f\u0006\u0000\u028a\u028b\u0005\u0003\u0000\u0000\u028b"+
		"\u028d\u0005\u000b\u0000\u0000\u028c\u028e\u0003\u0002\u0001\u0000\u028d"+
		"\u028c\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0005\u0084\u0000\u0000\u0290"+
		"\u02a2\u0001\u0000\u0000\u0000\u0291\u0293\u0003\u0002\u0001\u0000\u0292"+
		"\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0001\u0000\u0000\u0000\u0294\u0295\u0005\r\u0000\u0000\u0295\u0296"+
		"\u0005\u0091\u0000\u0000\u0296\u0297\u0005C\u0000\u0000\u0297\u0298\u0003"+
		"B!\u0000\u0298\u0299\u0005\u000b\u0000\u0000\u0299\u029a\u0003\f\u0006"+
		"\u0000\u029a\u029b\u0005\u0003\u0000\u0000\u029b\u029d\u0005\u000b\u0000"+
		"\u0000\u029c\u029e\u0003\u0002\u0001\u0000\u029d\u029c\u0001\u0000\u0000"+
		"\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000"+
		"\u0000\u029f\u02a0\u0005\u0084\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a1\u0278\u0001\u0000\u0000\u0000\u02a1\u0292\u0001\u0000\u0000"+
		"\u0000\u02a2A\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005\u0018\u0000\u0000"+
		"\u02a4\u02bb\u0003\u0084B\u0000\u02a5\u02a6\u0005\u0013\u0000\u0000\u02a6"+
		"\u02a8\u0003\u0016\u000b\u0000\u02a7\u02a9\u0003\u001a\r\u0000\u02a8\u02a7"+
		"\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02ab"+
		"\u0001\u0000\u0000\u0000\u02aa\u02ac\u0003\u001e\u000f\u0000\u02ab\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ae"+
		"\u0001\u0000\u0000\u0000\u02ad\u02af\u0003v;\u0000\u02ae\u02ad\u0001\u0000"+
		"\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b1\u0001\u0000"+
		"\u0000\u0000\u02b0\u02b2\u0003x<\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b5\u0003z=\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b4\u02b5"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000\u0000\u02b6\u02b8"+
		"\u0003~?\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001\u0000"+
		"\u0000\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003\u0084"+
		"B\u0000\u02ba\u02a3\u0001\u0000\u0000\u0000\u02ba\u02a5\u0001\u0000\u0000"+
		"\u0000\u02ba\u02b9\u0001\u0000\u0000\u0000\u02bbC\u0001\u0000\u0000\u0000"+
		"\u02bc\u02be\u0003\u0002\u0001\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000"+
		"\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0005\u000e\u0000\u0000\u02c0\u02c3\u0005\u0091\u0000\u0000"+
		"\u02c1\u02c2\u0005G\u0000\u0000\u02c2\u02c4\u0005\u008d\u0000\u0000\u02c3"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005C\u0000\u0000\u02c6\u02c7"+
		"\u0005F\u0000\u0000\u02c7\u02c8\u0003\u0084B\u0000\u02c8\u02c9\u0005\u000b"+
		"\u0000\u0000\u02c9\u02ca\u0003\f\u0006\u0000\u02ca\u02cb\u0005\u0003\u0000"+
		"\u0000\u02cb\u02cd\u0005\u000b\u0000\u0000\u02cc\u02ce\u0003\u0002\u0001"+
		"\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u0084\u0000"+
		"\u0000\u02d0E\u0001\u0000\u0000\u0000\u02d1\u02d3\u0005\u000f\u0000\u0000"+
		"\u02d2\u02d4\u0005\u0091\u0000\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000"+
		"\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d6\u0005\n\u0000\u0000\u02d6\u02d8\u0003\u0084B\u0000\u02d7"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d7\u02d8\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d9\u0001\u0000\u0000\u0000\u02d9\u02da\u0005\u0084\u0000\u0000\u02da"+
		"G\u0001\u0000\u0000\u0000\u02db\u02dd\u0005\u0010\u0000\u0000\u02dc\u02de"+
		"\u0005\u0091\u0000\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0005\n\u0000\u0000\u02e0\u02e2\u0003\u0084B\u0000\u02e1\u02df\u0001"+
		"\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0005\u0084\u0000\u0000\u02e4I\u0001\u0000"+
		"\u0000\u0000\u02e5\u02e7\u0005\u0011\u0000\u0000\u02e6\u02e8\u0003\u0084"+
		"B\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005\u0084\u0000"+
		"\u0000\u02eaK\u0001\u0000\u0000\u0000\u02eb\u02ed\u0005\u0012\u0000\u0000"+
		"\u02ec\u02ee\u0007\u0003\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02f5\u0001\u0000\u0000\u0000"+
		"\u02ef\u02f2\u0005\u008f\u0000\u0000\u02f0\u02f1\u0005\u0085\u0000\u0000"+
		"\u02f1\u02f3\u0003(\u0014\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2"+
		"\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000\u0000\u02f4"+
		"\u02f6\u0005\u0091\u0000\u0000\u02f5\u02ef\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005^\u0000\u0000\u02f8\u02fa"+
		"\u0003N\'\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fc\u0005"+
		"\u0084\u0000\u0000\u02fcM\u0001\u0000\u0000\u0000\u02fd\u0302\u0003P("+
		"\u0000\u02fe\u02ff\u0005\u0085\u0000\u0000\u02ff\u0301\u0003P(\u0000\u0300"+
		"\u02fe\u0001\u0000\u0000\u0000\u0301\u0304\u0001\u0000\u0000\u0000\u0302"+
		"\u0300\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000\u0303"+
		"O\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0305\u0306"+
		"\u0007\u0004\u0000\u0000\u0306\u0307\u0005x\u0000\u0000\u0307\u0308\u0003"+
		"\u0084B\u0000\u0308Q\u0001\u0000\u0000\u0000\u0309\u030a\u0005i\u0000"+
		"\u0000\u030a\u030d\u0003\u0084B\u0000\u030b\u030c\u0005\u0085\u0000\u0000"+
		"\u030c\u030e\u0003\u0084B\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d"+
		"\u030e\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f"+
		"\u0310\u0005\u0084\u0000\u0000\u0310S\u0001\u0000\u0000\u0000\u0311\u0312"+
		"\u0005X\u0000\u0000\u0312\u0313\u0005\u0084\u0000\u0000\u0313U\u0001\u0000"+
		"\u0000\u0000\u0314\u0316\u0005.\u0000\u0000\u0315\u0317\u0007\u0005\u0000"+
		"\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0005\u0084\u0000"+
		"\u0000\u0319W\u0001\u0000\u0000\u0000\u031a\u031c\u0005/\u0000\u0000\u031b"+
		"\u031d\u0007\u0005\u0000\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u0323\u0001\u0000\u0000\u0000\u031e"+
		"\u0320\u0005\u001f\u0000\u0000\u031f\u0321\u00050\u0000\u0000\u0320\u031f"+
		"\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322"+
		"\u0001\u0000\u0000\u0000\u0322\u0324\u0005\u0091\u0000\u0000\u0323\u031e"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325"+
		"\u0001\u0000\u0000\u0000\u0325\u0326\u0005\u0084\u0000\u0000\u0326Y\u0001"+
		"\u0000\u0000\u0000\u0327\u0329\u0003\u0002\u0001\u0000\u0328\u0327\u0001"+
		"\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000\u0329\u032b\u0001"+
		"\u0000\u0000\u0000\u032a\u032c\u0005\u0001\u0000\u0000\u032b\u032a\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032e\u0001"+
		"\u0000\u0000\u0000\u032d\u032f\u0003\u0006\u0003\u0000\u032e\u032d\u0001"+
		"\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0330\u0001"+
		"\u0000\u0000\u0000\u0330\u0331\u0005\u0002\u0000\u0000\u0331\u0333\u0003"+
		"\f\u0006\u0000\u0332\u0334\u0003\\.\u0000\u0333\u0332\u0001\u0000\u0000"+
		"\u0000\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u0337\u0005\u0003\u0000\u0000\u0336\u0338\u0003\u0002\u0001"+
		"\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000"+
		"\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033a\u0005\u0084\u0000"+
		"\u0000\u033a[\u0001\u0000\u0000\u0000\u033b\u033c\u0005\u0004\u0000\u0000"+
		"\u033c\u033d\u0003^/\u0000\u033d]\u0001\u0000\u0000\u0000\u033e\u0340"+
		"\u0003`0\u0000\u033f\u033e\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000"+
		"\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000"+
		"\u0000\u0000\u0342_\u0001\u0000\u0000\u0000\u0343\u0344\u0005\n\u0000"+
		"\u0000\u0344\u0345\u0003b1\u0000\u0345\u0346\u0005\u0006\u0000\u0000\u0346"+
		"\u0347\u0003\f\u0006\u0000\u0347a\u0001\u0000\u0000\u0000\u0348\u034d"+
		"\u0003d2\u0000\u0349\u034a\u0005[\u0000\u0000\u034a\u034c\u0003d2\u0000"+
		"\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034f\u0001\u0000\u0000\u0000"+
		"\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000"+
		"\u034ec\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u0350"+
		"\u0354\u0005\u0091\u0000\u0000\u0351\u0352\u0005M\u0000\u0000\u0352\u0354"+
		"\u0005\u008f\u0000\u0000\u0353\u0350\u0001\u0000\u0000\u0000\u0353\u0351"+
		"\u0001\u0000\u0000\u0000\u0354e\u0001\u0000\u0000\u0000\u0355\u0357\u0005"+
		"R\u0000\u0000\u0356\u0358\u0007\u0006\u0000\u0000\u0357\u0356\u0001\u0000"+
		"\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358\u0359\u0001\u0000"+
		"\u0000\u0000\u0359\u035a\u0005S\u0000\u0000\u035a\u035b\u0003h4\u0000"+
		"\u035b\u035c\u0005\u0084\u0000\u0000\u035cg\u0001\u0000\u0000\u0000\u035d"+
		"\u0362\u0003j5\u0000\u035e\u035f\u0005\u0085\u0000\u0000\u035f\u0361\u0003"+
		"j5\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000"+
		"\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000"+
		"\u0000\u0363i\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000"+
		"\u0365\u0366\u0003\u0012\t\u0000\u0366\u0367\u0005x\u0000\u0000\u0367"+
		"\u0368\u0003l6\u0000\u0368k\u0001\u0000\u0000\u0000\u0369\u036a\u0005"+
		"\u0091\u0000\u0000\u036am\u0001\u0000\u0000\u0000\u036b\u036c\u0005j\u0000"+
		"\u0000\u036c\u0371\u0003\u0012\t\u0000\u036d\u036e\u0005\u0087\u0000\u0000"+
		"\u036e\u036f\u0003(\u0014\u0000\u036f\u0370\u0005\u0088\u0000\u0000\u0370"+
		"\u0372\u0001\u0000\u0000\u0000\u0371\u036d\u0001\u0000\u0000\u0000\u0371"+
		"\u0372\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000\u0373"+
		"\u0374\u0005\r\u0000\u0000\u0374\u0376\u0003t:\u0000\u0375\u0373\u0001"+
		"\u0000\u0000\u0000\u0375\u0376\u0001\u0000\u0000\u0000\u0376\u0377\u0001"+
		"\u0000\u0000\u0000\u0377\u0378\u0005\u0084\u0000\u0000\u0378o\u0001\u0000"+
		"\u0000\u0000\u0379\u037a\u0005k\u0000\u0000\u037a\u037b\u0003\u0012\t"+
		"\u0000\u037b\u037c\u0005\u0084\u0000\u0000\u037cq\u0001\u0000\u0000\u0000"+
		"\u037d\u037e\u0005l\u0000\u0000\u037e\u037f\u0003\u0012\t\u0000\u037f"+
		"\u0380\u0005\u0019\u0000\u0000\u0380\u0381\u0003\u0018\f\u0000\u0381\u0382"+
		"\u0005\u0084\u0000\u0000\u0382s\u0001\u0000\u0000\u0000\u0383\u0385\u0005"+
		"\u0013\u0000\u0000\u0384\u0386\u0007\u0007\u0000\u0000\u0385\u0384\u0001"+
		"\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000\u0386\u0387\u0001"+
		"\u0000\u0000\u0000\u0387\u0389\u0003\u0016\u000b\u0000\u0388\u038a\u0003"+
		"\u001a\r\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a\u0001\u0000"+
		"\u0000\u0000\u038a\u038c\u0001\u0000\u0000\u0000\u038b\u038d\u0003\u001e"+
		"\u000f\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000"+
		"\u0000\u0000\u038d\u038f\u0001\u0000\u0000\u0000\u038e\u0390\u0003v;\u0000"+
		"\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u0392\u0001\u0000\u0000\u0000\u0391\u0393\u0003x<\u0000\u0392\u0391"+
		"\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0395"+
		"\u0001\u0000\u0000\u0000\u0394\u0396\u0003z=\u0000\u0395\u0394\u0001\u0000"+
		"\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396\u0398\u0001\u0000"+
		"\u0000\u0000\u0397\u0399\u0003~?\u0000\u0398\u0397\u0001\u0000\u0000\u0000"+
		"\u0398\u0399\u0001\u0000\u0000\u0000\u0399u\u0001\u0000\u0000\u0000\u039a"+
		"\u039b\u0005\"\u0000\u0000\u039b\u039c\u0005E\u0000\u0000\u039c\u039d"+
		"\u0003(\u0014\u0000\u039dw\u0001\u0000\u0000\u0000\u039e\u039f\u0005#"+
		"\u0000\u0000\u039f\u03a0\u0003\u0084B\u0000\u03a0y\u0001\u0000\u0000\u0000"+
		"\u03a1\u03a2\u0005$\u0000\u0000\u03a2\u03a3\u0005E\u0000\u0000\u03a3\u03a8"+
		"\u0003|>\u0000\u03a4\u03a5\u0005\u0085\u0000\u0000\u03a5\u03a7\u0003|"+
		">\u0000\u03a6\u03a4\u0001\u0000\u0000\u0000\u03a7\u03aa\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9{\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000"+
		"\u03ab\u03ad\u0003\u0084B\u0000\u03ac\u03ae\u0007\b\u0000\u0000\u03ad"+
		"\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000\u03ae"+
		"\u03b1\u0001\u0000\u0000\u0000\u03af\u03b0\u0005)\u0000\u0000\u03b0\u03b2"+
		"\u0007\t\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001"+
		"\u0000\u0000\u0000\u03b2}\u0001\u0000\u0000\u0000\u03b3\u03b6\u0005%\u0000"+
		"\u0000\u03b4\u03b7\u0003\u0084B\u0000\u03b5\u03b7\u0005!\u0000\u0000\u03b6"+
		"\u03b4\u0001\u0000\u0000\u0000\u03b6\u03b5\u0001\u0000\u0000\u0000\u03b7"+
		"\u03ba\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005&\u0000\u0000\u03b9\u03bb"+
		"\u0003\u0084B\u0000\u03ba\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bb\u007f\u0001\u0000\u0000\u0000\u03bc\u03c1\u0003"+
		"\u0082A\u0000\u03bd\u03be\u0005\u0085\u0000\u0000\u03be\u03c0\u0003\u0082"+
		"A\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c2\u0081\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c5\u0005\u0091\u0000\u0000\u03c5\u03c6\u0003\n\u0005\u0000"+
		"\u03c6\u0083\u0001\u0000\u0000\u0000\u03c7\u03c8\u0006B\uffff\uffff\u0000"+
		"\u03c8\u03e0\u0003\u008eG\u0000\u03c9\u03e0\u0003\u0012\t\u0000\u03ca"+
		"\u03e0\u0003\u008cF\u0000\u03cb\u03cc\u0005A\u0000\u0000\u03cc\u03e0\u0005"+
		"\u008f\u0000\u0000\u03cd\u03ce\u0005\u0087\u0000\u0000\u03ce\u03cf\u0003"+
		"\u0084B\u0000\u03cf\u03d0\u0005\u0088\u0000\u0000\u03d0\u03e0\u0001\u0000"+
		"\u0000\u0000\u03d1\u03d2\u0005Y\u0000\u0000\u03d2\u03e0\u0003\u0084B\u0005"+
		"\u03d3\u03d5\u0005\t\u0000\u0000\u03d4\u03d6\u0003\u0084B\u0000\u03d5"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6"+
		"\u03d7\u0001\u0000\u0000\u0000\u03d7\u03da\u0003\u0086C\u0000\u03d8\u03d9"+
		"\u0005\b\u0000\u0000\u03d9\u03db\u0003\u0084B\u0000\u03da\u03d8\u0001"+
		"\u0000\u0000\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001"+
		"\u0000\u0000\u0000\u03dc\u03dd\u0005\u0003\u0000\u0000\u03dd\u03e0\u0001"+
		"\u0000\u0000\u0000\u03de\u03e0\u0003\u008aE\u0000\u03df\u03c7\u0001\u0000"+
		"\u0000\u0000\u03df\u03c9\u0001\u0000\u0000\u0000\u03df\u03ca\u0001\u0000"+
		"\u0000\u0000\u03df\u03cb\u0001\u0000\u0000\u0000\u03df\u03cd\u0001\u0000"+
		"\u0000\u0000\u03df\u03d1\u0001\u0000\u0000\u0000\u03df\u03d3\u0001\u0000"+
		"\u0000\u0000\u03df\u03de\u0001\u0000\u0000\u0000\u03e0\u040a\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e2\n\u000b\u0000\u0000\u03e2\u03e3\u0007\n\u0000"+
		"\u0000\u03e3\u0409\u0003\u0084B\f\u03e4\u03e5\n\n\u0000\u0000\u03e5\u03e6"+
		"\u0007\u000b\u0000\u0000\u03e6\u0409\u0003\u0084B\u000b\u03e7\u03e8\n"+
		"\t\u0000\u0000\u03e8\u03e9\u0005w\u0000\u0000\u03e9\u0409\u0003\u0084"+
		"B\n\u03ea\u03eb\n\b\u0000\u0000\u03eb\u03ec\u0007\f\u0000\u0000\u03ec"+
		"\u0409\u0003\u0084B\t\u03ed\u03ef\n\u0007\u0000\u0000\u03ee\u03f0\u0005"+
		"Y\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f0\u03f1\u0001\u0000\u0000\u0000\u03f1\u03f2\u0005-\u0000"+
		"\u0000\u03f2\u03f3\u0003\u0084B\u0000\u03f3\u03f4\u0005Z\u0000\u0000\u03f4"+
		"\u03f5\u0003\u0084B\b\u03f5\u0409\u0001\u0000\u0000\u0000\u03f6\u03f7"+
		"\n\u0006\u0000\u0000\u03f7\u03f8\u0007\r\u0000\u0000\u03f8\u0409\u0003"+
		"\u0084B\u0007\u03f9\u03fa\n\u0004\u0000\u0000\u03fa\u03fc\u0005W\u0000"+
		"\u0000\u03fb\u03fd\u0005Y\u0000\u0000\u03fc\u03fb\u0001\u0000\u0000\u0000"+
		"\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000"+
		"\u03fe\u0409\u0005X\u0000\u0000\u03ff\u0401\n\u0003\u0000\u0000\u0400"+
		"\u0402\u0005Y\u0000\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0401\u0402"+
		"\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403\u0404"+
		"\u0005C\u0000\u0000\u0404\u0405\u0005\u0087\u0000\u0000\u0405\u0406\u0003"+
		"(\u0014\u0000\u0406\u0407\u0005\u0088\u0000\u0000\u0407\u0409\u0001\u0000"+
		"\u0000\u0000\u0408\u03e1\u0001\u0000\u0000\u0000\u0408\u03e4\u0001\u0000"+
		"\u0000\u0000\u0408\u03e7\u0001\u0000\u0000\u0000\u0408\u03ea\u0001\u0000"+
		"\u0000\u0000\u0408\u03ed\u0001\u0000\u0000\u0000\u0408\u03f6\u0001\u0000"+
		"\u0000\u0000\u0408\u03f9\u0001\u0000\u0000\u0000\u0408\u03ff\u0001\u0000"+
		"\u0000\u0000\u0409\u040c\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000"+
		"\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u0085\u0001\u0000"+
		"\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040d\u040f\u0003\u0088"+
		"D\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001\u0000\u0000"+
		"\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410\u0411\u0001\u0000\u0000"+
		"\u0000\u0411\u0087\u0001\u0000\u0000\u0000\u0412\u0413\u0005\n\u0000\u0000"+
		"\u0413\u0414\u0003\u0084B\u0000\u0414\u0415\u0005\u0006\u0000\u0000\u0415"+
		"\u0416\u0003\u0084B\u0000\u0416\u0089\u0001\u0000\u0000\u0000\u0417\u0418"+
		"\u0005F\u0000\u0000\u0418\u0419\u0005\u0089\u0000\u0000\u0419\u041a\u0003"+
		"(\u0014\u0000\u041a\u041b\u0005\u008a\u0000\u0000\u041b\u0422\u0001\u0000"+
		"\u0000\u0000\u041c\u041d\u0003\u0012\t\u0000\u041d\u041e\u0005\u0089\u0000"+
		"\u0000\u041e\u041f\u0003\u0084B\u0000\u041f\u0420\u0005\u008a\u0000\u0000"+
		"\u0420\u0422\u0001\u0000\u0000\u0000\u0421\u0417\u0001\u0000\u0000\u0000"+
		"\u0421\u041c\u0001\u0000\u0000\u0000\u0422\u008b\u0001\u0000\u0000\u0000"+
		"\u0423\u0424\u0005\u0091\u0000\u0000\u0424\u0427\u0005\u0087\u0000\u0000"+
		"\u0425\u0428\u0003(\u0014\u0000\u0426\u0428\u0005\u0080\u0000\u0000\u0427"+
		"\u0425\u0001\u0000\u0000\u0000\u0427\u0426\u0001\u0000\u0000\u0000\u0427"+
		"\u0428\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429"+
		"\u042a\u0005\u0088\u0000\u0000\u042a\u008d\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0007\u000e\u0000\u0000\u042c\u008f\u0001\u0000\u0000\u0000\u008d"+
		"\u0091\u0094\u0099\u009d\u00a0\u00ac\u00b0\u00b5\u00bb\u00c5\u00d1\u00d4"+
		"\u00df\u00e2\u00e9\u00ec\u00f4\u00fa\u0103\u0109\u010b\u0111\u0115\u011b"+
		"\u0139\u0145\u014d\u0150\u0156\u015a\u015d\u0167\u016a\u0171\u017a\u017f"+
		"\u0182\u0187\u018a\u018d\u018f\u0197\u019a\u01a2\u01a6\u01b1\u01bc\u01c7"+
		"\u01cc\u01cf\u01d2\u01d5\u01d8\u01db\u01e2\u01e6\u01ed\u01f5\u01fd\u0204"+
		"\u020d\u0218\u021f\u022e\u023b\u0240\u0248\u024d\u0256\u025e\u0265\u026a"+
		"\u0273\u0278\u027e\u0286\u028d\u0292\u029d\u02a1\u02a8\u02ab\u02ae\u02b1"+
		"\u02b4\u02b7\u02ba\u02bd\u02c3\u02cd\u02d3\u02d7\u02dd\u02e1\u02e7\u02ed"+
		"\u02f2\u02f5\u02f9\u0302\u030d\u0316\u031c\u0320\u0323\u0328\u032b\u032e"+
		"\u0333\u0337\u0341\u034d\u0353\u0357\u0362\u0371\u0375\u0385\u0389\u038c"+
		"\u038f\u0392\u0395\u0398\u03a8\u03ad\u03b1\u03b6\u03ba\u03c1\u03d5\u03da"+
		"\u03df\u03ef\u03fc\u0401\u0408\u040a\u0410\u0421\u0427";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}