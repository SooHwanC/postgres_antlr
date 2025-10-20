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
		ASC=39, DESC=40, NULLS=41, FIRST=42, LAST=43, WITH=44, INTEGER=45, BIGINT=46, 
		SMALLINT=47, NUMERIC=48, DECIMAL=49, REAL=50, DOUBLE=51, VARCHAR=52, CHAR=53, 
		TEXT=54, BOOLEAN=55, DATE=56, TIMESTAMP=57, RECORD=58, IN=59, REVERSE=60, 
		BY=61, ARRAY=62, SLICE=63, NOTICE=64, WARNING=65, INFO=66, DEBUG=67, LOG=68, 
		SQLSTATE=69, ERRCODE=70, MESSAGE=71, DETAIL=72, HINT=73, GET=74, DIAGNOSTICS=75, 
		STACKED=76, CURRENT=77, AS=78, IS=79, NULL=80, NOT=81, AND=82, OR=83, 
		CONSTANT=84, DEFAULT=85, USING=86, STRICT=87, VOLATILE=88, STABLE=89, 
		IMMUTABLE=90, LANGUAGE=91, RETURNS=92, CALLED=93, SECURITY=94, DEFINER=95, 
		INVOKER=96, ASSERT=97, OPEN=98, CLOSE=99, FETCH=100, MOVE=101, FOUND=102, 
		CURSOR=103, TRUE=104, FALSE=105, PERCENT=106, TYPE=107, ROWTYPE=108, DOLLAR=109, 
		ASSIGN=110, CONCAT=111, EQ=112, NEQ=113, LT=114, LTE=115, GT=116, GTE=117, 
		PLUS=118, MINUS=119, STAR=120, SLASH=121, PERCENT_OP=122, CARET=123, SEMI=124, 
		COMMA=125, DOT=126, LPAREN=127, RPAREN=128, LBRACK=129, RBRACK=130, LABEL_START=131, 
		LABEL_END=132, IntegerLiteral=133, NumericLiteral=134, StringLiteral=135, 
		DollarQuotedString=136, Identifier=137, QuotedIdentifier=138, LineComment=139, 
		BlockComment=140, WS=141, ALIAS=142;
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
		RULE_raiseOption = 40, RULE_assertStmt = 41, RULE_nullStmt = 42, RULE_nestedBlock = 43, 
		RULE_exceptionSection = 44, RULE_exceptionHandlerList = 45, RULE_exceptionHandler = 46, 
		RULE_exceptionConditionList = 47, RULE_exceptionCondition = 48, RULE_getDiagnosticsStmt = 49, 
		RULE_diagnosticsItemList = 50, RULE_diagnosticsItem = 51, RULE_diagnosticsOption = 52, 
		RULE_openCursorStmt = 53, RULE_closeCursorStmt = 54, RULE_fetchStmt = 55, 
		RULE_selectStmt = 56, RULE_groupByClause = 57, RULE_havingClause = 58, 
		RULE_orderByClause = 59, RULE_orderByItem = 60, RULE_limitClause = 61, 
		RULE_parameterList = 62, RULE_parameter = 63, RULE_expression = 64, RULE_whenExprClauseList = 65, 
		RULE_whenExprClause = 66, RULE_arrayExpression = 67, RULE_functionCall = 68, 
		RULE_literal = 69;
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
			"raiseOption", "assertStmt", "nullStmt", "nestedBlock", "exceptionSection", 
			"exceptionHandlerList", "exceptionHandler", "exceptionConditionList", 
			"exceptionCondition", "getDiagnosticsStmt", "diagnosticsItemList", "diagnosticsItem", 
			"diagnosticsOption", "openCursorStmt", "closeCursorStmt", "fetchStmt", 
			"selectStmt", "groupByClause", "havingClause", "orderByClause", "orderByItem", 
			"limitClause", "parameterList", "parameter", "expression", "whenExprClauseList", 
			"whenExprClause", "arrayExpression", "functionCall", "literal"
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
			"'DESC'", "'NULLS'", "'FIRST'", "'LAST'", "'WITH'", null, "'BIGINT'", 
			"'SMALLINT'", "'NUMERIC'", "'DECIMAL'", "'REAL'", null, "'VARCHAR'", 
			"'CHAR'", "'TEXT'", null, "'DATE'", "'TIMESTAMP'", "'RECORD'", "'IN'", 
			"'REVERSE'", "'BY'", "'ARRAY'", "'SLICE'", "'NOTICE'", "'WARNING'", "'INFO'", 
			"'DEBUG'", "'LOG'", "'SQLSTATE'", "'ERRCODE'", "'MESSAGE'", "'DETAIL'", 
			"'HINT'", "'GET'", "'DIAGNOSTICS'", "'STACKED'", "'CURRENT'", "'AS'", 
			"'IS'", "'NULL'", "'NOT'", "'AND'", "'OR'", "'CONSTANT'", "'DEFAULT'", 
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
			"DESC", "NULLS", "FIRST", "LAST", "WITH", "INTEGER", "BIGINT", "SMALLINT", 
			"NUMERIC", "DECIMAL", "REAL", "DOUBLE", "VARCHAR", "CHAR", "TEXT", "BOOLEAN", 
			"DATE", "TIMESTAMP", "RECORD", "IN", "REVERSE", "BY", "ARRAY", "SLICE", 
			"NOTICE", "WARNING", "INFO", "DEBUG", "LOG", "SQLSTATE", "ERRCODE", "MESSAGE", 
			"DETAIL", "HINT", "GET", "DIAGNOSTICS", "STACKED", "CURRENT", "AS", "IS", 
			"NULL", "NOT", "AND", "OR", "CONSTANT", "DEFAULT", "USING", "STRICT", 
			"VOLATILE", "STABLE", "IMMUTABLE", "LANGUAGE", "RETURNS", "CALLED", "SECURITY", 
			"DEFINER", "INVOKER", "ASSERT", "OPEN", "CLOSE", "FETCH", "MOVE", "FOUND", 
			"CURSOR", "TRUE", "FALSE", "PERCENT", "TYPE", "ROWTYPE", "DOLLAR", "ASSIGN", 
			"CONCAT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "STAR", 
			"SLASH", "PERCENT_OP", "CARET", "SEMI", "COMMA", "DOT", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "LABEL_START", "LABEL_END", "IntegerLiteral", "NumericLiteral", 
			"StringLiteral", "DollarQuotedString", "Identifier", "QuotedIdentifier", 
			"LineComment", "BlockComment", "WS", "ALIAS"
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
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(140);
				label();
				}
			}

			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(143);
				declareSection();
				}
			}

			setState(146);
			match(BEGIN);
			setState(147);
			statementList();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(148);
				exceptionSection();
				}
			}

			setState(151);
			match(END);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(152);
				label();
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(155);
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
			setState(158);
			match(LABEL_START);
			setState(159);
			match(Identifier);
			setState(160);
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
			setState(162);
			match(DECLARE);
			setState(163);
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
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				declaration();
				}
				}
				setState(168); 
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(Identifier);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(171);
					match(CONSTANT);
					}
				}

				setState(174);
				dataType(0);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(175);
					match(NOT);
					setState(176);
					match(NULL);
					}
				}

				setState(183);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(179);
					match(ASSIGN);
					setState(180);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(181);
					match(DEFAULT);
					setState(182);
					expression(0);
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(185);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(Identifier);
				setState(188);
				match(CURSOR);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(189);
					match(LPAREN);
					setState(190);
					parameterList();
					setState(191);
					match(RPAREN);
					}
				}

				setState(195);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				selectStmt();
				setState(197);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(Identifier);
				setState(200);
				match(ALIAS);
				setState(201);
				match(FOR);
				setState(205);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(202);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(203);
					match(DOLLAR);
					setState(204);
					match(IntegerLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207);
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
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(211);
				match(INTEGER);
				}
				break;
			case BIGINT:
				{
				setState(212);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				{
				setState(213);
				match(SMALLINT);
				}
				break;
			case NUMERIC:
				{
				setState(214);
				match(NUMERIC);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(215);
					match(LPAREN);
					setState(216);
					match(IntegerLiteral);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(217);
						match(COMMA);
						setState(218);
						match(IntegerLiteral);
						}
					}

					setState(221);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				{
				setState(224);
				match(DECIMAL);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(225);
					match(LPAREN);
					setState(226);
					match(IntegerLiteral);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(227);
						match(COMMA);
						setState(228);
						match(IntegerLiteral);
						}
					}

					setState(231);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case REAL:
				{
				setState(234);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(235);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				{
				setState(236);
				match(VARCHAR);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(237);
					match(LPAREN);
					setState(238);
					match(IntegerLiteral);
					setState(239);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(242);
				match(CHAR);
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(243);
					match(LPAREN);
					setState(244);
					match(IntegerLiteral);
					setState(245);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(248);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(249);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(250);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				{
				setState(251);
				match(TIMESTAMP);
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(252);
					match(LPAREN);
					setState(253);
					match(IntegerLiteral);
					setState(254);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(257);
				match(RECORD);
				}
				break;
			case Identifier:
				{
				setState(258);
				match(Identifier);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(259);
					match(PERCENT);
					setState(260);
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
			setState(273);
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
					setState(265);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(266);
					match(ARRAY);
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(267);
						match(LBRACK);
						setState(268);
						match(RBRACK);
						}
						break;
					}
					}
					} 
				}
				setState(275);
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 301988390L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -9079256848653090751L) != 0) || _la==QuotedIdentifier) {
				{
				{
				setState(276);
				statement();
				}
				}
				setState(281);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				selectIntoStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				performStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				executeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(286);
				insertStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(287);
				updateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(288);
				deleteStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(289);
				setStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(290);
				ifStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(291);
				caseStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(292);
				loopStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(293);
				whileStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(294);
				forStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(295);
				foreachStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(296);
				exitStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(297);
				continueStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(298);
				returnStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(299);
				raiseStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(300);
				assertStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(301);
				nullStmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(302);
				nestedBlock();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(303);
				getDiagnosticsStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(304);
				openCursorStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(305);
				closeCursorStmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(306);
				fetchStmt();
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
			setState(309);
			variableRef();
			setState(310);
			match(ASSIGN);
			setState(311);
			expression(0);
			setState(312);
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
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(Identifier);
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(DOT);
						setState(316);
						match(Identifier);
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(QuotedIdentifier);
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						match(DOT);
						setState(324);
						match(QuotedIdentifier);
						}
						} 
					}
					setState(329);
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
			setState(332);
			match(SELECT);
			setState(333);
			selectList();
			setState(334);
			match(INTO);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(335);
				match(STRICT);
				}
			}

			setState(338);
			variableList();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(339);
				fromClause();
				}
			}

			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(342);
				whereClause();
				}
			}

			setState(345);
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
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(347);
				match(STAR);
				}
				break;
			case CASE:
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
				setState(348);
				expression(0);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(349);
					match(COMMA);
					setState(350);
					expression(0);
					}
					}
					setState(355);
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
			setState(358);
			variableRef();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				variableRef();
				}
				}
				setState(365);
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
			setState(366);
			match(FROM);
			setState(367);
			tableRef();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(368);
				match(COMMA);
				setState(369);
				tableRef();
				}
				}
				setState(374);
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
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(Identifier);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(376);
						match(AS);
						}
					}

					setState(379);
					match(Identifier);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				functionCall();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(383);
					match(WITH);
					setState(384);
					match(Identifier);
					}
				}

				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==Identifier) {
					{
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(387);
						match(AS);
						}
					}

					setState(390);
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
			setState(395);
			match(WHERE);
			setState(396);
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
			setState(398);
			match(PERFORM);
			setState(399);
			selectList();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(400);
				fromClause();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(403);
				whereClause();
				}
			}

			setState(406);
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
			setState(408);
			match(EXECUTE);
			setState(409);
			expression(0);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(410);
				match(INTO);
				setState(411);
				variableList();
				}
			}

			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(414);
				match(USING);
				setState(415);
				expressionList();
				}
			}

			setState(418);
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
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(INSERT);
			setState(421);
			match(INTO);
			setState(422);
			match(Identifier);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(423);
				match(LPAREN);
				setState(424);
				columnList();
				setState(425);
				match(RPAREN);
				}
			}

			setState(429);
			match(VALUES);
			setState(430);
			match(LPAREN);
			setState(431);
			expressionList();
			setState(432);
			match(RPAREN);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(433);
				match(RETURNING);
				setState(434);
				expressionList();
				setState(435);
				match(INTO);
				setState(436);
				variableList();
				}
			}

			setState(440);
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
			setState(442);
			match(Identifier);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(443);
				match(COMMA);
				setState(444);
				match(Identifier);
				}
				}
				setState(449);
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
			setState(450);
			expression(0);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(451);
				match(COMMA);
				setState(452);
				expression(0);
				}
				}
				setState(457);
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
			setState(458);
			match(UPDATE);
			setState(459);
			match(Identifier);
			setState(460);
			match(SET);
			setState(461);
			assignmentList();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(462);
				whereClause();
				}
			}

			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(465);
				match(RETURNING);
				setState(466);
				expressionList();
				setState(467);
				match(INTO);
				setState(468);
				variableList();
				}
			}

			setState(472);
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
			setState(474);
			columnAssignment();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(475);
				match(COMMA);
				setState(476);
				columnAssignment();
				}
				}
				setState(481);
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
			setState(482);
			match(Identifier);
			setState(483);
			match(EQ);
			setState(484);
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
			setState(486);
			match(DELETE);
			setState(487);
			match(FROM);
			setState(488);
			match(Identifier);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(489);
				whereClause();
				}
			}

			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(492);
				match(RETURNING);
				setState(493);
				expressionList();
				setState(494);
				match(INTO);
				setState(495);
				variableList();
				}
			}

			setState(499);
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
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(SET);
				setState(502);
				match(Identifier);
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==TO || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				expression(0);
				setState(505);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(SET);
				setState(508);
				match(Identifier);
				setState(509);
				match(FROM);
				setState(510);
				match(CURRENT);
				setState(511);
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
			setState(514);
			match(IF);
			setState(515);
			expression(0);
			setState(516);
			match(THEN);
			setState(517);
			statementList();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(518);
				match(ELSIF);
				setState(519);
				expression(0);
				setState(520);
				match(THEN);
				setState(521);
				statementList();
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(528);
				match(ELSE);
				setState(529);
				statementList();
				}
			}

			setState(532);
			match(END);
			setState(533);
			match(IF);
			setState(534);
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
			setState(536);
			match(CASE);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==ARRAY || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 567594290587369475L) != 0)) {
				{
				setState(537);
				expression(0);
				}
			}

			setState(540);
			whenClauseList();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(541);
				match(ELSE);
				setState(542);
				statementList();
				}
			}

			setState(545);
			match(END);
			setState(546);
			match(CASE);
			setState(547);
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
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				whenClause();
				}
				}
				setState(552); 
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
			setState(554);
			match(WHEN);
			setState(555);
			expression(0);
			setState(556);
			match(THEN);
			setState(557);
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
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(559);
				label();
				}
			}

			setState(562);
			match(LOOP);
			setState(563);
			statementList();
			setState(564);
			match(END);
			setState(565);
			match(LOOP);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(566);
				label();
				}
			}

			setState(569);
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
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(571);
				label();
				}
			}

			setState(574);
			match(WHILE);
			setState(575);
			expression(0);
			setState(576);
			match(LOOP);
			setState(577);
			statementList();
			setState(578);
			match(END);
			setState(579);
			match(LOOP);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(580);
				label();
				}
			}

			setState(583);
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(585);
					label();
					}
				}

				setState(588);
				match(FOR);
				setState(589);
				match(Identifier);
				setState(590);
				match(IN);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(591);
					match(REVERSE);
					}
				}

				setState(594);
				expression(0);
				setState(595);
				match(DOT);
				setState(596);
				match(DOT);
				setState(597);
				expression(0);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(598);
					match(BY);
					setState(599);
					expression(0);
					}
				}

				setState(602);
				match(LOOP);
				setState(603);
				statementList();
				setState(604);
				match(END);
				setState(605);
				match(LOOP);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(606);
					label();
					}
				}

				setState(609);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(611);
					label();
					}
				}

				setState(614);
				match(FOR);
				setState(615);
				match(Identifier);
				setState(616);
				match(IN);
				setState(617);
				forQuerySource();
				setState(618);
				match(LOOP);
				setState(619);
				statementList();
				setState(620);
				match(END);
				setState(621);
				match(LOOP);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(622);
					label();
					}
				}

				setState(625);
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
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXECUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(EXECUTE);
				setState(630);
				expression(0);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(SELECT);
				setState(632);
				selectList();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(633);
					fromClause();
					}
				}

				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(636);
					whereClause();
					}
				}

				setState(640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GROUP) {
					{
					setState(639);
					groupByClause();
					}
				}

				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HAVING) {
					{
					setState(642);
					havingClause();
					}
				}

				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(645);
					orderByClause();
					}
				}

				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(648);
					limitClause();
					}
				}

				}
				break;
			case CASE:
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
				setState(651);
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
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(654);
				label();
				}
			}

			setState(657);
			match(FOREACH);
			setState(658);
			match(Identifier);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(659);
				match(SLICE);
				setState(660);
				match(IntegerLiteral);
				}
			}

			setState(663);
			match(IN);
			setState(664);
			match(ARRAY);
			setState(665);
			expression(0);
			setState(666);
			match(LOOP);
			setState(667);
			statementList();
			setState(668);
			match(END);
			setState(669);
			match(LOOP);
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(670);
				label();
				}
			}

			setState(673);
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
			setState(675);
			match(EXIT);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(676);
				match(Identifier);
				}
			}

			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(679);
				match(WHEN);
				setState(680);
				expression(0);
				}
			}

			setState(683);
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
			setState(685);
			match(CONTINUE);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(686);
				match(Identifier);
				}
			}

			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(689);
				match(WHEN);
				setState(690);
				expression(0);
				}
			}

			setState(693);
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
			setState(695);
			match(RETURN);
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==ARRAY || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 567594290587369475L) != 0)) {
				{
				setState(696);
				expression(0);
				}
			}

			setState(699);
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
			setState(701);
			match(RAISE);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) {
				{
				setState(702);
				_la = _input.LA(1);
				if ( !(_la==EXCEPTION || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 31L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(705);
				match(StringLiteral);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(706);
					match(COMMA);
					setState(707);
					expressionList();
					}
				}

				}
				break;
			case Identifier:
				{
				setState(710);
				match(Identifier);
				}
				break;
			case USING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(713);
				match(USING);
				setState(714);
				raiseOptionList();
				}
			}

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
			setState(719);
			raiseOption();
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(720);
				match(COMMA);
				setState(721);
				raiseOption();
				}
				}
				setState(726);
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
			setState(727);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(728);
			match(EQ);
			setState(729);
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
			setState(731);
			match(ASSERT);
			setState(732);
			expression(0);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(733);
				match(COMMA);
				setState(734);
				expression(0);
				}
			}

			setState(737);
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
			setState(739);
			match(NULL);
			setState(740);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitNestedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedBlockContext nestedBlock() throws RecognitionException {
		NestedBlockContext _localctx = new NestedBlockContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(742);
				label();
				}
			}

			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(745);
				match(DECLARE);
				}
			}

			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(748);
				declarationList();
				}
			}

			setState(751);
			match(BEGIN);
			setState(752);
			statementList();
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(753);
				exceptionSection();
				}
			}

			setState(756);
			match(END);
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(757);
				label();
				}
			}

			setState(760);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionSectionContext exceptionSection() throws RecognitionException {
		ExceptionSectionContext _localctx = new ExceptionSectionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exceptionSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(EXCEPTION);
			setState(763);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionHandlerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerListContext exceptionHandlerList() throws RecognitionException {
		ExceptionHandlerListContext _localctx = new ExceptionHandlerListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exceptionHandlerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(765);
				exceptionHandler();
				}
				}
				setState(768); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(WHEN);
			setState(771);
			exceptionConditionList();
			setState(772);
			match(THEN);
			setState(773);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionConditionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionConditionListContext exceptionConditionList() throws RecognitionException {
		ExceptionConditionListContext _localctx = new ExceptionConditionListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exceptionConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			exceptionCondition();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(776);
				match(OR);
				setState(777);
				exceptionCondition();
				}
				}
				setState(782);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitExceptionCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionConditionContext exceptionCondition() throws RecognitionException {
		ExceptionConditionContext _localctx = new ExceptionConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exceptionCondition);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(Identifier);
				}
				break;
			case SQLSTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(SQLSTATE);
				setState(785);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitGetDiagnosticsStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetDiagnosticsStmtContext getDiagnosticsStmt() throws RecognitionException {
		GetDiagnosticsStmtContext _localctx = new GetDiagnosticsStmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(GET);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STACKED || _la==CURRENT) {
				{
				setState(789);
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

			setState(792);
			match(DIAGNOSTICS);
			setState(793);
			diagnosticsItemList();
			setState(794);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsItemListContext diagnosticsItemList() throws RecognitionException {
		DiagnosticsItemListContext _localctx = new DiagnosticsItemListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_diagnosticsItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			diagnosticsItem();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(797);
				match(COMMA);
				setState(798);
				diagnosticsItem();
				}
				}
				setState(803);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsItemContext diagnosticsItem() throws RecognitionException {
		DiagnosticsItemContext _localctx = new DiagnosticsItemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_diagnosticsItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			variableRef();
			setState(805);
			match(EQ);
			setState(806);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitDiagnosticsOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiagnosticsOptionContext diagnosticsOption() throws RecognitionException {
		DiagnosticsOptionContext _localctx = new DiagnosticsOptionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_diagnosticsOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOpenCursorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCursorStmtContext openCursorStmt() throws RecognitionException {
		OpenCursorStmtContext _localctx = new OpenCursorStmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_openCursorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(OPEN);
			setState(811);
			variableRef();
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(812);
				match(LPAREN);
				setState(813);
				expressionList();
				setState(814);
				match(RPAREN);
				}
			}

			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(818);
				match(FOR);
				setState(819);
				selectStmt();
				}
			}

			setState(822);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitCloseCursorStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseCursorStmtContext closeCursorStmt() throws RecognitionException {
		CloseCursorStmtContext _localctx = new CloseCursorStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_closeCursorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(CLOSE);
			setState(825);
			variableRef();
			setState(826);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitFetchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FetchStmtContext fetchStmt() throws RecognitionException {
		FetchStmtContext _localctx = new FetchStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_fetchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(FETCH);
			setState(829);
			variableRef();
			setState(830);
			match(INTO);
			setState(831);
			variableList();
			setState(832);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(SELECT);
			setState(836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(835);
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

			setState(838);
			selectList();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(839);
				fromClause();
				}
			}

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(842);
				whereClause();
				}
			}

			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(845);
				groupByClause();
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(848);
				havingClause();
				}
			}

			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(851);
				orderByClause();
				}
			}

			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(854);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(GROUP);
			setState(858);
			match(BY);
			setState(859);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(HAVING);
			setState(862);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(ORDER);
			setState(865);
			match(BY);
			setState(866);
			orderByItem();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(867);
				match(COMMA);
				setState(868);
				orderByItem();
				}
				}
				setState(873);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			expression(0);
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(875);
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

			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(878);
				match(NULLS);
				setState(879);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLimitClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_limitClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(LIMIT);
			setState(885);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
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
				setState(883);
				expression(0);
				}
				break;
			case ALL:
				{
				setState(884);
				match(ALL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(887);
				match(OFFSET);
				setState(888);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			parameter();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(892);
				match(COMMA);
				setState(893);
				parameter();
				}
				}
				setState(898);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(Identifier);
			setState(900);
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
		public TerminalNode AND() { return getToken(PlpgsqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlpgsqlParser.OR, 0); }
		public TerminalNode IS() { return getToken(PlpgsqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PlpgsqlParser.NULL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(903);
				literal();
				}
				break;
			case 2:
				{
				setState(904);
				variableRef();
				}
				break;
			case 3:
				{
				setState(905);
				functionCall();
				}
				break;
			case 4:
				{
				setState(906);
				match(LPAREN);
				setState(907);
				expression(0);
				setState(908);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(910);
				match(NOT);
				setState(911);
				expression(4);
				}
				break;
			case 6:
				{
				setState(912);
				match(CASE);
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASE || _la==ARRAY || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 567594290587369475L) != 0)) {
					{
					setState(913);
					expression(0);
					}
				}

				setState(916);
				whenExprClauseList();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(917);
					match(ELSE);
					setState(918);
					expression(0);
					}
				}

				setState(921);
				match(END);
				}
				break;
			case 7:
				{
				setState(923);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(949);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(947);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(926);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(927);
						_la = _input.LA(1);
						if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 49153L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(928);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(929);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(930);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(931);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(932);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(933);
						match(CONCAT);
						setState(934);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(935);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(936);
						_la = _input.LA(1);
						if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(937);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(938);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(939);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(940);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(941);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(942);
						match(IS);
						setState(944);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(943);
							match(NOT);
							}
						}

						setState(946);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(951);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenExprClauseList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExprClauseListContext whenExprClauseList() throws RecognitionException {
		WhenExprClauseListContext _localctx = new WhenExprClauseListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_whenExprClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(952);
				whenExprClause();
				}
				}
				setState(955); 
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitWhenExprClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenExprClauseContext whenExprClause() throws RecognitionException {
		WhenExprClauseContext _localctx = new WhenExprClauseContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_whenExprClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(WHEN);
			setState(958);
			expression(0);
			setState(959);
			match(THEN);
			setState(960);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayExpressionContext arrayExpression() throws RecognitionException {
		ArrayExpressionContext _localctx = new ArrayExpressionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arrayExpression);
		try {
			setState(972);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(962);
				match(ARRAY);
				setState(963);
				match(LBRACK);
				setState(964);
				expressionList();
				setState(965);
				match(RBRACK);
				}
				break;
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				variableRef();
				setState(968);
				match(LBRACK);
				setState(969);
				expression(0);
				setState(970);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			match(Identifier);
			setState(975);
			match(LPAREN);
			setState(978);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
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
				setState(976);
				expressionList();
				}
				break;
			case STAR:
				{
				setState(977);
				match(STAR);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(980);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlpgsqlParserVisitor ) return ((PlpgsqlParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 135107988871446529L) != 0)) ) {
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
		case 64:
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
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u008e\u03d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"E\u0001\u0000\u0003\u0000\u008e\b\u0000\u0001\u0000\u0003\u0000\u0091"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0096\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u009a\b\u0000\u0001\u0000\u0003\u0000"+
		"\u009d\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003\u00a7\b\u0003\u000b\u0003"+
		"\f\u0003\u00a8\u0001\u0004\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b2\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b8\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00c2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00ce\b\u0004\u0001\u0004\u0003\u0004\u00d1\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00dc\b\u0005\u0001\u0005"+
		"\u0003\u0005\u00df\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00e6\b\u0005\u0001\u0005\u0003\u0005\u00e9\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00f1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00f7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0100\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0106\b\u0005\u0003"+
		"\u0005\u0108\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u010e\b\u0005\u0005\u0005\u0110\b\u0005\n\u0005\f\u0005\u0113\t"+
		"\u0005\u0001\u0006\u0005\u0006\u0116\b\u0006\n\u0006\f\u0006\u0119\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0134\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u013e\b\t\n\t\f\t\u0141\t\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0146\b\t\n\t\f\t\u0149\t\t\u0003\t\u014b\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0151\b\n\u0001\n\u0001\n\u0003"+
		"\n\u0155\b\n\u0001\n\u0003\n\u0158\b\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0160\b\u000b\n\u000b\f\u000b"+
		"\u0163\t\u000b\u0003\u000b\u0165\b\u000b\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u016a\b\f\n\f\f\f\u016d\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0173\b\r\n\r\f\r\u0176\t\r\u0001\u000e\u0001\u000e\u0003\u000e\u017a"+
		"\b\u000e\u0001\u000e\u0003\u000e\u017d\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0182\b\u000e\u0001\u000e\u0003\u000e\u0185\b"+
		"\u000e\u0001\u000e\u0003\u000e\u0188\b\u000e\u0003\u000e\u018a\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0192\b\u0010\u0001\u0010\u0003\u0010\u0195\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u019d\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01a1\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01ac\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01b7\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01be\b\u0013\n\u0013"+
		"\f\u0013\u01c1\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u01c6\b\u0014\n\u0014\f\u0014\u01c9\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d0\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d7\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01de"+
		"\b\u0016\n\u0016\f\u0016\u01e1\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01eb\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01f2\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0201\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u020c\b\u001a\n\u001a\f\u001a\u020f"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0213\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u021b\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0220\b"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004"+
		"\u001c\u0227\b\u001c\u000b\u001c\f\u001c\u0228\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e\u0231\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0238\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0003\u001f\u023d\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0246\b\u001f\u0001\u001f\u0001\u001f\u0001"+
		" \u0003 \u024b\b \u0001 \u0001 \u0001 \u0001 \u0003 \u0251\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u0259\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0260\b \u0001 \u0001 \u0001 \u0003 \u0265\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0270\b \u0001"+
		" \u0001 \u0003 \u0274\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u027b"+
		"\b!\u0001!\u0003!\u027e\b!\u0001!\u0003!\u0281\b!\u0001!\u0003!\u0284"+
		"\b!\u0001!\u0003!\u0287\b!\u0001!\u0003!\u028a\b!\u0001!\u0003!\u028d"+
		"\b!\u0001\"\u0003\"\u0290\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\""+
		"\u0296\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u02a0\b\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u02a6\b#\u0001"+
		"#\u0001#\u0003#\u02aa\b#\u0001#\u0001#\u0001$\u0001$\u0003$\u02b0\b$\u0001"+
		"$\u0001$\u0003$\u02b4\b$\u0001$\u0001$\u0001%\u0001%\u0003%\u02ba\b%\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u02c0\b&\u0001&\u0001&\u0001&\u0003&\u02c5"+
		"\b&\u0001&\u0003&\u02c8\b&\u0001&\u0001&\u0003&\u02cc\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u02d3\b\'\n\'\f\'\u02d6\t\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0003)\u02e0\b)\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0003+\u02e8\b+\u0001+\u0003+\u02eb\b+\u0001"+
		"+\u0003+\u02ee\b+\u0001+\u0001+\u0001+\u0003+\u02f3\b+\u0001+\u0001+\u0003"+
		"+\u02f7\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0004-\u02ff\b-\u000b"+
		"-\f-\u0300\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005"+
		"/\u030b\b/\n/\f/\u030e\t/\u00010\u00010\u00010\u00030\u0313\b0\u00011"+
		"\u00011\u00031\u0317\b1\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00052\u0320\b2\n2\f2\u0323\t2\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0331\b5\u00015\u0001"+
		"5\u00035\u0335\b5\u00015\u00015\u00016\u00016\u00016\u00016\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00018\u00018\u00038\u0345\b8\u00018\u0001"+
		"8\u00038\u0349\b8\u00018\u00038\u034c\b8\u00018\u00038\u034f\b8\u0001"+
		"8\u00038\u0352\b8\u00018\u00038\u0355\b8\u00018\u00038\u0358\b8\u0001"+
		"9\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0005;\u0366\b;\n;\f;\u0369\t;\u0001<\u0001<\u0003<\u036d\b<"+
		"\u0001<\u0001<\u0003<\u0371\b<\u0001=\u0001=\u0001=\u0003=\u0376\b=\u0001"+
		"=\u0001=\u0003=\u037a\b=\u0001>\u0001>\u0001>\u0005>\u037f\b>\n>\f>\u0382"+
		"\t>\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u0393\b@\u0001@\u0001@\u0001"+
		"@\u0003@\u0398\b@\u0001@\u0001@\u0001@\u0003@\u039d\b@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003@\u03b1\b@\u0001@\u0005@\u03b4"+
		"\b@\n@\f@\u03b7\t@\u0001A\u0004A\u03ba\bA\u000bA\fA\u03bb\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u03cd\bC\u0001D\u0001D\u0001D\u0001D\u0003"+
		"D\u03d3\bD\u0001D\u0001D\u0001E\u0001E\u0001E\u0000\u0002\n\u0080F\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u0000\u000e\u0002\u0000\r\rOO\u0001\u0000kl\u0002\u0000"+
		"\u001f\u001fpp\u0002\u0000\u0004\u0004@D\u0001\u0000EI\u0001\u0000LM\u0001"+
		"\u0000 !\u0001\u0000\'(\u0001\u0000*+\u0002\u0000jjxy\u0001\u0000vw\u0001"+
		"\u0000pu\u0001\u0000RS\u0003\u0000PPhi\u0085\u0088\u0442\u0000\u008d\u0001"+
		"\u0000\u0000\u0000\u0002\u009e\u0001\u0000\u0000\u0000\u0004\u00a2\u0001"+
		"\u0000\u0000\u0000\u0006\u00a6\u0001\u0000\u0000\u0000\b\u00d0\u0001\u0000"+
		"\u0000\u0000\n\u0107\u0001\u0000\u0000\u0000\f\u0117\u0001\u0000\u0000"+
		"\u0000\u000e\u0133\u0001\u0000\u0000\u0000\u0010\u0135\u0001\u0000\u0000"+
		"\u0000\u0012\u014a\u0001\u0000\u0000\u0000\u0014\u014c\u0001\u0000\u0000"+
		"\u0000\u0016\u0164\u0001\u0000\u0000\u0000\u0018\u0166\u0001\u0000\u0000"+
		"\u0000\u001a\u016e\u0001\u0000\u0000\u0000\u001c\u0189\u0001\u0000\u0000"+
		"\u0000\u001e\u018b\u0001\u0000\u0000\u0000 \u018e\u0001\u0000\u0000\u0000"+
		"\"\u0198\u0001\u0000\u0000\u0000$\u01a4\u0001\u0000\u0000\u0000&\u01ba"+
		"\u0001\u0000\u0000\u0000(\u01c2\u0001\u0000\u0000\u0000*\u01ca\u0001\u0000"+
		"\u0000\u0000,\u01da\u0001\u0000\u0000\u0000.\u01e2\u0001\u0000\u0000\u0000"+
		"0\u01e6\u0001\u0000\u0000\u00002\u0200\u0001\u0000\u0000\u00004\u0202"+
		"\u0001\u0000\u0000\u00006\u0218\u0001\u0000\u0000\u00008\u0226\u0001\u0000"+
		"\u0000\u0000:\u022a\u0001\u0000\u0000\u0000<\u0230\u0001\u0000\u0000\u0000"+
		">\u023c\u0001\u0000\u0000\u0000@\u0273\u0001\u0000\u0000\u0000B\u028c"+
		"\u0001\u0000\u0000\u0000D\u028f\u0001\u0000\u0000\u0000F\u02a3\u0001\u0000"+
		"\u0000\u0000H\u02ad\u0001\u0000\u0000\u0000J\u02b7\u0001\u0000\u0000\u0000"+
		"L\u02bd\u0001\u0000\u0000\u0000N\u02cf\u0001\u0000\u0000\u0000P\u02d7"+
		"\u0001\u0000\u0000\u0000R\u02db\u0001\u0000\u0000\u0000T\u02e3\u0001\u0000"+
		"\u0000\u0000V\u02e7\u0001\u0000\u0000\u0000X\u02fa\u0001\u0000\u0000\u0000"+
		"Z\u02fe\u0001\u0000\u0000\u0000\\\u0302\u0001\u0000\u0000\u0000^\u0307"+
		"\u0001\u0000\u0000\u0000`\u0312\u0001\u0000\u0000\u0000b\u0314\u0001\u0000"+
		"\u0000\u0000d\u031c\u0001\u0000\u0000\u0000f\u0324\u0001\u0000\u0000\u0000"+
		"h\u0328\u0001\u0000\u0000\u0000j\u032a\u0001\u0000\u0000\u0000l\u0338"+
		"\u0001\u0000\u0000\u0000n\u033c\u0001\u0000\u0000\u0000p\u0342\u0001\u0000"+
		"\u0000\u0000r\u0359\u0001\u0000\u0000\u0000t\u035d\u0001\u0000\u0000\u0000"+
		"v\u0360\u0001\u0000\u0000\u0000x\u036a\u0001\u0000\u0000\u0000z\u0372"+
		"\u0001\u0000\u0000\u0000|\u037b\u0001\u0000\u0000\u0000~\u0383\u0001\u0000"+
		"\u0000\u0000\u0080\u039c\u0001\u0000\u0000\u0000\u0082\u03b9\u0001\u0000"+
		"\u0000\u0000\u0084\u03bd\u0001\u0000\u0000\u0000\u0086\u03cc\u0001\u0000"+
		"\u0000\u0000\u0088\u03ce\u0001\u0000\u0000\u0000\u008a\u03d6\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u0091\u0003\u0004\u0002\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0095\u0003\f\u0006"+
		"\u0000\u0094\u0096\u0003X,\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0099\u0005\u0003\u0000\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099"+
		"\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a"+
		"\u009c\u0001\u0000\u0000\u0000\u009b\u009d\u0005|\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u0001"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0083\u0000\u0000\u009f\u00a0"+
		"\u0005\u0089\u0000\u0000\u00a0\u00a1\u0005\u0084\u0000\u0000\u00a1\u0003"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0001\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0006\u0003\u0000\u00a4\u0005\u0001\u0000\u0000\u0000\u00a5\u00a7"+
		"\u0003\b\u0004\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u0007\u0001\u0000\u0000\u0000\u00aa\u00ac\u0005"+
		"\u0089\u0000\u0000\u00ab\u00ad\u0005T\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b1\u0003\n\u0005\u0000\u00af\u00b0\u0005Q\u0000"+
		"\u0000\u00b0\u00b2\u0005P\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005n\u0000\u0000\u00b4\u00b8\u0003\u0080@\u0000\u00b5\u00b6"+
		"\u0005U\u0000\u0000\u00b6\u00b8\u0003\u0080@\u0000\u00b7\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005|\u0000"+
		"\u0000\u00ba\u00d1\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0089\u0000"+
		"\u0000\u00bc\u00c1\u0005g\u0000\u0000\u00bd\u00be\u0005\u007f\u0000\u0000"+
		"\u00be\u00bf\u0003|>\u0000\u00bf\u00c0\u0005\u0080\u0000\u0000\u00c0\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0007\u0000\u0000\u0000\u00c4\u00c5\u0003p8\u0000\u00c5\u00c6\u0005|"+
		"\u0000\u0000\u00c6\u00d1\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0089"+
		"\u0000\u0000\u00c8\u00c9\u0005\u008e\u0000\u0000\u00c9\u00cd\u0005\r\u0000"+
		"\u0000\u00ca\u00ce\u0005\u0089\u0000\u0000\u00cb\u00cc\u0005m\u0000\u0000"+
		"\u00cc\u00ce\u0005\u0085\u0000\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d1\u0005|\u0000\u0000\u00d0\u00aa\u0001\u0000\u0000\u0000\u00d0"+
		"\u00bb\u0001\u0000\u0000\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d1"+
		"\t\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u0005\uffff\uffff\u0000\u00d3"+
		"\u0108\u0005-\u0000\u0000\u00d4\u0108\u0005.\u0000\u0000\u00d5\u0108\u0005"+
		"/\u0000\u0000\u00d6\u00de\u00050\u0000\u0000\u00d7\u00d8\u0005\u007f\u0000"+
		"\u0000\u00d8\u00db\u0005\u0085\u0000\u0000\u00d9\u00da\u0005}\u0000\u0000"+
		"\u00da\u00dc\u0005\u0085\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00df\u0005\u0080\u0000\u0000\u00de\u00d7\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0108\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e8\u00051\u0000\u0000\u00e1\u00e2\u0005\u007f\u0000\u0000\u00e2"+
		"\u00e5\u0005\u0085\u0000\u0000\u00e3\u00e4\u0005}\u0000\u0000\u00e4\u00e6"+
		"\u0005\u0085\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9"+
		"\u0005\u0080\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e9\u0108\u0001\u0000\u0000\u0000\u00ea\u0108"+
		"\u00052\u0000\u0000\u00eb\u0108\u00053\u0000\u0000\u00ec\u00f0\u00054"+
		"\u0000\u0000\u00ed\u00ee\u0005\u007f\u0000\u0000\u00ee\u00ef\u0005\u0085"+
		"\u0000\u0000\u00ef\u00f1\u0005\u0080\u0000\u0000\u00f0\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0108\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f6\u00055\u0000\u0000\u00f3\u00f4\u0005\u007f\u0000"+
		"\u0000\u00f4\u00f5\u0005\u0085\u0000\u0000\u00f5\u00f7\u0005\u0080\u0000"+
		"\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u0108\u0001\u0000\u0000\u0000\u00f8\u0108\u00056\u0000\u0000"+
		"\u00f9\u0108\u00057\u0000\u0000\u00fa\u0108\u00058\u0000\u0000\u00fb\u00ff"+
		"\u00059\u0000\u0000\u00fc\u00fd\u0005\u007f\u0000\u0000\u00fd\u00fe\u0005"+
		"\u0085\u0000\u0000\u00fe\u0100\u0005\u0080\u0000\u0000\u00ff\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0108\u0001"+
		"\u0000\u0000\u0000\u0101\u0108\u0005:\u0000\u0000\u0102\u0105\u0005\u0089"+
		"\u0000\u0000\u0103\u0104\u0005j\u0000\u0000\u0104\u0106\u0007\u0001\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0001\u0000\u0000\u0000\u0107\u00d2\u0001\u0000\u0000"+
		"\u0000\u0107\u00d4\u0001\u0000\u0000\u0000\u0107\u00d5\u0001\u0000\u0000"+
		"\u0000\u0107\u00d6\u0001\u0000\u0000\u0000\u0107\u00e0\u0001\u0000\u0000"+
		"\u0000\u0107\u00ea\u0001\u0000\u0000\u0000\u0107\u00eb\u0001\u0000\u0000"+
		"\u0000\u0107\u00ec\u0001\u0000\u0000\u0000\u0107\u00f2\u0001\u0000\u0000"+
		"\u0000\u0107\u00f8\u0001\u0000\u0000\u0000\u0107\u00f9\u0001\u0000\u0000"+
		"\u0000\u0107\u00fa\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000\u0000"+
		"\u0000\u0107\u0101\u0001\u0000\u0000\u0000\u0107\u0102\u0001\u0000\u0000"+
		"\u0000\u0108\u0111\u0001\u0000\u0000\u0000\u0109\u010a\n\u0001\u0000\u0000"+
		"\u010a\u010d\u0005>\u0000\u0000\u010b\u010c\u0005\u0081\u0000\u0000\u010c"+
		"\u010e\u0005\u0082\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u0109\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u000b\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114"+
		"\u0116\u0003\u000e\u0007\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116"+
		"\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0001\u0000\u0000\u0000\u0118\r\u0001\u0000\u0000\u0000\u0119\u0117"+
		"\u0001\u0000\u0000\u0000\u011a\u0134\u0003\u0010\b\u0000\u011b\u0134\u0003"+
		"\u0014\n\u0000\u011c\u0134\u0003 \u0010\u0000\u011d\u0134\u0003\"\u0011"+
		"\u0000\u011e\u0134\u0003$\u0012\u0000\u011f\u0134\u0003*\u0015\u0000\u0120"+
		"\u0134\u00030\u0018\u0000\u0121\u0134\u00032\u0019\u0000\u0122\u0134\u0003"+
		"4\u001a\u0000\u0123\u0134\u00036\u001b\u0000\u0124\u0134\u0003<\u001e"+
		"\u0000\u0125\u0134\u0003>\u001f\u0000\u0126\u0134\u0003@ \u0000\u0127"+
		"\u0134\u0003D\"\u0000\u0128\u0134\u0003F#\u0000\u0129\u0134\u0003H$\u0000"+
		"\u012a\u0134\u0003J%\u0000\u012b\u0134\u0003L&\u0000\u012c\u0134\u0003"+
		"R)\u0000\u012d\u0134\u0003T*\u0000\u012e\u0134\u0003V+\u0000\u012f\u0134"+
		"\u0003b1\u0000\u0130\u0134\u0003j5\u0000\u0131\u0134\u0003l6\u0000\u0132"+
		"\u0134\u0003n7\u0000\u0133\u011a\u0001\u0000\u0000\u0000\u0133\u011b\u0001"+
		"\u0000\u0000\u0000\u0133\u011c\u0001\u0000\u0000\u0000\u0133\u011d\u0001"+
		"\u0000\u0000\u0000\u0133\u011e\u0001\u0000\u0000\u0000\u0133\u011f\u0001"+
		"\u0000\u0000\u0000\u0133\u0120\u0001\u0000\u0000\u0000\u0133\u0121\u0001"+
		"\u0000\u0000\u0000\u0133\u0122\u0001\u0000\u0000\u0000\u0133\u0123\u0001"+
		"\u0000\u0000\u0000\u0133\u0124\u0001\u0000\u0000\u0000\u0133\u0125\u0001"+
		"\u0000\u0000\u0000\u0133\u0126\u0001\u0000\u0000\u0000\u0133\u0127\u0001"+
		"\u0000\u0000\u0000\u0133\u0128\u0001\u0000\u0000\u0000\u0133\u0129\u0001"+
		"\u0000\u0000\u0000\u0133\u012a\u0001\u0000\u0000\u0000\u0133\u012b\u0001"+
		"\u0000\u0000\u0000\u0133\u012c\u0001\u0000\u0000\u0000\u0133\u012d\u0001"+
		"\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u012f\u0001"+
		"\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001"+
		"\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u000f\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003\u0012\t\u0000\u0136\u0137\u0005n"+
		"\u0000\u0000\u0137\u0138\u0003\u0080@\u0000\u0138\u0139\u0005|\u0000\u0000"+
		"\u0139\u0011\u0001\u0000\u0000\u0000\u013a\u013f\u0005\u0089\u0000\u0000"+
		"\u013b\u013c\u0005~\u0000\u0000\u013c\u013e\u0005\u0089\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u014b\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142"+
		"\u0147\u0005\u008a\u0000\u0000\u0143\u0144\u0005~\u0000\u0000\u0144\u0146"+
		"\u0005\u008a\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0149"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147"+
		"\u0001\u0000\u0000\u0000\u014a\u013a\u0001\u0000\u0000\u0000\u014a\u0142"+
		"\u0001\u0000\u0000\u0000\u014b\u0013\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0005\u0013\u0000\u0000\u014d\u014e\u0003\u0016\u000b\u0000\u014e\u0150"+
		"\u0005\u0019\u0000\u0000\u014f\u0151\u0005W\u0000\u0000\u0150\u014f\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u0154\u0003\u0018\f\u0000\u0153\u0155\u0003\u001a"+
		"\r\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000"+
		"\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0158\u0003\u001e\u000f"+
		"\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005|\u0000\u0000"+
		"\u015a\u0015\u0001\u0000\u0000\u0000\u015b\u0165\u0005x\u0000\u0000\u015c"+
		"\u0161\u0003\u0080@\u0000\u015d\u015e\u0005}\u0000\u0000\u015e\u0160\u0003"+
		"\u0080@\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000"+
		"\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000"+
		"\u0000\u0000\u0164\u015b\u0001\u0000\u0000\u0000\u0164\u015c\u0001\u0000"+
		"\u0000\u0000\u0165\u0017\u0001\u0000\u0000\u0000\u0166\u016b\u0003\u0012"+
		"\t\u0000\u0167\u0168\u0005}\u0000\u0000\u0168\u016a\u0003\u0012\t\u0000"+
		"\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000"+
		"\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u0019\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0005\u001a\u0000\u0000\u016f\u0174\u0003\u001c\u000e\u0000"+
		"\u0170\u0171\u0005}\u0000\u0000\u0171\u0173\u0003\u001c\u000e\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175"+
		"\u001b\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177"+
		"\u017c\u0005\u0089\u0000\u0000\u0178\u017a\u0005N\u0000\u0000\u0179\u0178"+
		"\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b"+
		"\u0001\u0000\u0000\u0000\u017b\u017d\u0005\u0089\u0000\u0000\u017c\u0179"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u018a"+
		"\u0001\u0000\u0000\u0000\u017e\u0181\u0003\u0088D\u0000\u017f\u0180\u0005"+
		",\u0000\u0000\u0180\u0182\u0005\u0089\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0187\u0001\u0000"+
		"\u0000\u0000\u0183\u0185\u0005N\u0000\u0000\u0184\u0183\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0188\u0005\u0089\u0000\u0000\u0187\u0184\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000"+
		"\u0000\u0189\u0177\u0001\u0000\u0000\u0000\u0189\u017e\u0001\u0000\u0000"+
		"\u0000\u018a\u001d\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u001b\u0000"+
		"\u0000\u018c\u018d\u0003\u0080@\u0000\u018d\u001f\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005\u0017\u0000\u0000\u018f\u0191\u0003\u0016\u000b\u0000"+
		"\u0190\u0192\u0003\u001a\r\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193"+
		"\u0195\u0003\u001e\u000f\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0005|\u0000\u0000\u0197!\u0001\u0000\u0000\u0000\u0198\u0199\u0005"+
		"\u0018\u0000\u0000\u0199\u019c\u0003\u0080@\u0000\u019a\u019b\u0005\u0019"+
		"\u0000\u0000\u019b\u019d\u0003\u0018\f\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0005V\u0000\u0000\u019f\u01a1\u0003(\u0014\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005|\u0000\u0000\u01a3#\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0005\u0014\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0019\u0000\u0000\u01a6\u01ab\u0005\u0089\u0000\u0000\u01a7\u01a8\u0005"+
		"\u007f\u0000\u0000\u01a8\u01a9\u0003&\u0013\u0000\u01a9\u01aa\u0005\u0080"+
		"\u0000\u0000\u01aa\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a7\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005\u001d\u0000\u0000\u01ae\u01af\u0005\u007f"+
		"\u0000\u0000\u01af\u01b0\u0003(\u0014\u0000\u01b0\u01b6\u0005\u0080\u0000"+
		"\u0000\u01b1\u01b2\u0005\u001e\u0000\u0000\u01b2\u01b3\u0003(\u0014\u0000"+
		"\u01b3\u01b4\u0005\u0019\u0000\u0000\u01b4\u01b5\u0003\u0018\f\u0000\u01b5"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b1\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0005|\u0000\u0000\u01b9%\u0001\u0000\u0000\u0000\u01ba\u01bf\u0005"+
		"\u0089\u0000\u0000\u01bb\u01bc\u0005}\u0000\u0000\u01bc\u01be\u0005\u0089"+
		"\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c0\'\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c7\u0003\u0080@\u0000\u01c3\u01c4\u0005}\u0000\u0000\u01c4"+
		"\u01c6\u0003\u0080@\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c9"+
		"\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8)\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005\u0015\u0000\u0000\u01cb\u01cc\u0005"+
		"\u0089\u0000\u0000\u01cc\u01cd\u0005\u001c\u0000\u0000\u01cd\u01cf\u0003"+
		",\u0016\u0000\u01ce\u01d0\u0003\u001e\u000f\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0005\u001e\u0000\u0000\u01d2\u01d3\u0003(\u0014"+
		"\u0000\u01d3\u01d4\u0005\u0019\u0000\u0000\u01d4\u01d5\u0003\u0018\f\u0000"+
		"\u01d5\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0005|\u0000\u0000\u01d9+\u0001\u0000\u0000\u0000\u01da\u01df"+
		"\u0003.\u0017\u0000\u01db\u01dc\u0005}\u0000\u0000\u01dc\u01de\u0003."+
		"\u0017\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000"+
		"\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e0-\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0005\u0089\u0000\u0000\u01e3\u01e4\u0005p\u0000\u0000"+
		"\u01e4\u01e5\u0003\u0080@\u0000\u01e5/\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005\u0016\u0000\u0000\u01e7\u01e8\u0005\u001a\u0000\u0000\u01e8\u01ea"+
		"\u0005\u0089\u0000\u0000\u01e9\u01eb\u0003\u001e\u000f\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01f1"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u001e\u0000\u0000\u01ed\u01ee"+
		"\u0003(\u0014\u0000\u01ee\u01ef\u0005\u0019\u0000\u0000\u01ef\u01f0\u0003"+
		"\u0018\f\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01ec\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005|\u0000\u0000\u01f41\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005\u001c\u0000\u0000\u01f6\u01f7\u0005\u0089\u0000\u0000"+
		"\u01f7\u01f8\u0007\u0002\u0000\u0000\u01f8\u01f9\u0003\u0080@\u0000\u01f9"+
		"\u01fa\u0005|\u0000\u0000\u01fa\u0201\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0005\u001c\u0000\u0000\u01fc\u01fd\u0005\u0089\u0000\u0000\u01fd\u01fe"+
		"\u0005\u001a\u0000\u0000\u01fe\u01ff\u0005M\u0000\u0000\u01ff\u0201\u0005"+
		"|\u0000\u0000\u0200\u01f5\u0001\u0000\u0000\u0000\u0200\u01fb\u0001\u0000"+
		"\u0000\u0000\u02013\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u0005\u0000"+
		"\u0000\u0203\u0204\u0003\u0080@\u0000\u0204\u0205\u0005\u0006\u0000\u0000"+
		"\u0205\u020d\u0003\f\u0006\u0000\u0206\u0207\u0005\u0007\u0000\u0000\u0207"+
		"\u0208\u0003\u0080@\u0000\u0208\u0209\u0005\u0006\u0000\u0000\u0209\u020a"+
		"\u0003\f\u0006\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0206\u0001"+
		"\u0000\u0000\u0000\u020c\u020f\u0001\u0000\u0000\u0000\u020d\u020b\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0212\u0001"+
		"\u0000\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0211\u0005"+
		"\b\u0000\u0000\u0211\u0213\u0003\f\u0006\u0000\u0212\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005\u0003\u0000\u0000\u0215\u0216\u0005\u0005"+
		"\u0000\u0000\u0216\u0217\u0005|\u0000\u0000\u02175\u0001\u0000\u0000\u0000"+
		"\u0218\u021a\u0005\t\u0000\u0000\u0219\u021b\u0003\u0080@\u0000\u021a"+
		"\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b"+
		"\u021c\u0001\u0000\u0000\u0000\u021c\u021f\u00038\u001c\u0000\u021d\u021e"+
		"\u0005\b\u0000\u0000\u021e\u0220\u0003\f\u0006\u0000\u021f\u021d\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005\u0003\u0000\u0000\u0222\u0223\u0005"+
		"\t\u0000\u0000\u0223\u0224\u0005|\u0000\u0000\u02247\u0001\u0000\u0000"+
		"\u0000\u0225\u0227\u0003:\u001d\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u02299\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0005\n\u0000\u0000\u022b\u022c\u0003\u0080@\u0000\u022c\u022d"+
		"\u0005\u0006\u0000\u0000\u022d\u022e\u0003\f\u0006\u0000\u022e;\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0003\u0002\u0001\u0000\u0230\u022f\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0233\u0005\u000b\u0000\u0000\u0233\u0234\u0003"+
		"\f\u0006\u0000\u0234\u0235\u0005\u0003\u0000\u0000\u0235\u0237\u0005\u000b"+
		"\u0000\u0000\u0236\u0238\u0003\u0002\u0001\u0000\u0237\u0236\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0005|\u0000\u0000\u023a=\u0001\u0000\u0000\u0000"+
		"\u023b\u023d\u0003\u0002\u0001\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0005\f\u0000\u0000\u023f\u0240\u0003\u0080@\u0000\u0240"+
		"\u0241\u0005\u000b\u0000\u0000\u0241\u0242\u0003\f\u0006\u0000\u0242\u0243"+
		"\u0005\u0003\u0000\u0000\u0243\u0245\u0005\u000b\u0000\u0000\u0244\u0246"+
		"\u0003\u0002\u0001\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0005|\u0000\u0000\u0248?\u0001\u0000\u0000\u0000\u0249\u024b\u0003\u0002"+
		"\u0001\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0005\r\u0000"+
		"\u0000\u024d\u024e\u0005\u0089\u0000\u0000\u024e\u0250\u0005;\u0000\u0000"+
		"\u024f\u0251\u0005<\u0000\u0000\u0250\u024f\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u0003\u0080@\u0000\u0253\u0254\u0005~\u0000\u0000\u0254\u0255\u0005"+
		"~\u0000\u0000\u0255\u0258\u0003\u0080@\u0000\u0256\u0257\u0005=\u0000"+
		"\u0000\u0257\u0259\u0003\u0080@\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000"+
		"\u025a\u025b\u0005\u000b\u0000\u0000\u025b\u025c\u0003\f\u0006\u0000\u025c"+
		"\u025d\u0005\u0003\u0000\u0000\u025d\u025f\u0005\u000b\u0000\u0000\u025e"+
		"\u0260\u0003\u0002\u0001\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0005|\u0000\u0000\u0262\u0274\u0001\u0000\u0000\u0000\u0263\u0265"+
		"\u0003\u0002\u0001\u0000\u0264\u0263\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0267"+
		"\u0005\r\u0000\u0000\u0267\u0268\u0005\u0089\u0000\u0000\u0268\u0269\u0005"+
		";\u0000\u0000\u0269\u026a\u0003B!\u0000\u026a\u026b\u0005\u000b\u0000"+
		"\u0000\u026b\u026c\u0003\f\u0006\u0000\u026c\u026d\u0005\u0003\u0000\u0000"+
		"\u026d\u026f\u0005\u000b\u0000\u0000\u026e\u0270\u0003\u0002\u0001\u0000"+
		"\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005|\u0000\u0000\u0272"+
		"\u0274\u0001\u0000\u0000\u0000\u0273\u024a\u0001\u0000\u0000\u0000\u0273"+
		"\u0264\u0001\u0000\u0000\u0000\u0274A\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005\u0018\u0000\u0000\u0276\u028d\u0003\u0080@\u0000\u0277\u0278\u0005"+
		"\u0013\u0000\u0000\u0278\u027a\u0003\u0016\u000b\u0000\u0279\u027b\u0003"+
		"\u001a\r\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000"+
		"\u0000\u0000\u027b\u027d\u0001\u0000\u0000\u0000\u027c\u027e\u0003\u001e"+
		"\u000f\u0000\u027d\u027c\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000"+
		"\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u0281\u0003r9\u0000"+
		"\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000"+
		"\u0281\u0283\u0001\u0000\u0000\u0000\u0282\u0284\u0003t:\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000\u0284\u0286"+
		"\u0001\u0000\u0000\u0000\u0285\u0287\u0003v;\u0000\u0286\u0285\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000"+
		"\u0000\u0000\u0288\u028a\u0003z=\u0000\u0289\u0288\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000\u0000\u0000"+
		"\u028b\u028d\u0003\u0080@\u0000\u028c\u0275\u0001\u0000\u0000\u0000\u028c"+
		"\u0277\u0001\u0000\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028d"+
		"C\u0001\u0000\u0000\u0000\u028e\u0290\u0003\u0002\u0001\u0000\u028f\u028e"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0001\u0000\u0000\u0000\u0291\u0292\u0005\u000e\u0000\u0000\u0292\u0295"+
		"\u0005\u0089\u0000\u0000\u0293\u0294\u0005?\u0000\u0000\u0294\u0296\u0005"+
		"\u0085\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001"+
		"\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0005"+
		";\u0000\u0000\u0298\u0299\u0005>\u0000\u0000\u0299\u029a\u0003\u0080@"+
		"\u0000\u029a\u029b\u0005\u000b\u0000\u0000\u029b\u029c\u0003\f\u0006\u0000"+
		"\u029c\u029d\u0005\u0003\u0000\u0000\u029d\u029f\u0005\u000b\u0000\u0000"+
		"\u029e\u02a0\u0003\u0002\u0001\u0000\u029f\u029e\u0001\u0000\u0000\u0000"+
		"\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02a1\u02a2\u0005|\u0000\u0000\u02a2E\u0001\u0000\u0000\u0000\u02a3\u02a5"+
		"\u0005\u000f\u0000\u0000\u02a4\u02a6\u0005\u0089\u0000\u0000\u02a5\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a9"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005\n\u0000\u0000\u02a8\u02aa\u0003"+
		"\u0080@\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000"+
		"\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005|\u0000"+
		"\u0000\u02acG\u0001\u0000\u0000\u0000\u02ad\u02af\u0005\u0010\u0000\u0000"+
		"\u02ae\u02b0\u0005\u0089\u0000\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0005\n\u0000\u0000\u02b2\u02b4\u0003\u0080@\u0000\u02b3"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005|\u0000\u0000\u02b6I\u0001"+
		"\u0000\u0000\u0000\u02b7\u02b9\u0005\u0011\u0000\u0000\u02b8\u02ba\u0003"+
		"\u0080@\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0005|\u0000"+
		"\u0000\u02bcK\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005\u0012\u0000\u0000"+
		"\u02be\u02c0\u0007\u0003\u0000\u0000\u02bf\u02be\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c4\u0005\u0087\u0000\u0000\u02c2\u02c3\u0005}\u0000\u0000\u02c3"+
		"\u02c5\u0003(\u0014\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001\u0000\u0000\u0000\u02c6\u02c8"+
		"\u0005\u0089\u0000\u0000\u02c7\u02c1\u0001\u0000\u0000\u0000\u02c7\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02cb"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005V\u0000\u0000\u02ca\u02cc\u0003"+
		"N\'\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000"+
		"\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02ce\u0005|\u0000"+
		"\u0000\u02ceM\u0001\u0000\u0000\u0000\u02cf\u02d4\u0003P(\u0000\u02d0"+
		"\u02d1\u0005}\u0000\u0000\u02d1\u02d3\u0003P(\u0000\u02d2\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5O\u0001\u0000"+
		"\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8\u0007\u0004"+
		"\u0000\u0000\u02d8\u02d9\u0005p\u0000\u0000\u02d9\u02da\u0003\u0080@\u0000"+
		"\u02daQ\u0001\u0000\u0000\u0000\u02db\u02dc\u0005a\u0000\u0000\u02dc\u02df"+
		"\u0003\u0080@\u0000\u02dd\u02de\u0005}\u0000\u0000\u02de\u02e0\u0003\u0080"+
		"@\u0000\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005|\u0000\u0000"+
		"\u02e2S\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005P\u0000\u0000\u02e4\u02e5"+
		"\u0005|\u0000\u0000\u02e5U\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003\u0002"+
		"\u0001\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000"+
		"\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02eb\u0005\u0001"+
		"\u0000\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000\u0000\u02ec\u02ee\u0003\u0006"+
		"\u0003\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u0002"+
		"\u0000\u0000\u02f0\u02f2\u0003\f\u0006\u0000\u02f1\u02f3\u0003X,\u0000"+
		"\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4\u02f6\u0005\u0003\u0000\u0000"+
		"\u02f5\u02f7\u0003\u0002\u0001\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f9\u0005|\u0000\u0000\u02f9W\u0001\u0000\u0000\u0000\u02fa\u02fb"+
		"\u0005\u0004\u0000\u0000\u02fb\u02fc\u0003Z-\u0000\u02fcY\u0001\u0000"+
		"\u0000\u0000\u02fd\u02ff\u0003\\.\u0000\u02fe\u02fd\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301[\u0001\u0000\u0000\u0000"+
		"\u0302\u0303\u0005\n\u0000\u0000\u0303\u0304\u0003^/\u0000\u0304\u0305"+
		"\u0005\u0006\u0000\u0000\u0305\u0306\u0003\f\u0006\u0000\u0306]\u0001"+
		"\u0000\u0000\u0000\u0307\u030c\u0003`0\u0000\u0308\u0309\u0005S\u0000"+
		"\u0000\u0309\u030b\u0003`0\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b"+
		"\u030e\u0001\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d_\u0001\u0000\u0000\u0000\u030e\u030c"+
		"\u0001\u0000\u0000\u0000\u030f\u0313\u0005\u0089\u0000\u0000\u0310\u0311"+
		"\u0005E\u0000\u0000\u0311\u0313\u0005\u0087\u0000\u0000\u0312\u030f\u0001"+
		"\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313a\u0001\u0000"+
		"\u0000\u0000\u0314\u0316\u0005J\u0000\u0000\u0315\u0317\u0007\u0005\u0000"+
		"\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u0319\u0005K\u0000\u0000"+
		"\u0319\u031a\u0003d2\u0000\u031a\u031b\u0005|\u0000\u0000\u031bc\u0001"+
		"\u0000\u0000\u0000\u031c\u0321\u0003f3\u0000\u031d\u031e\u0005}\u0000"+
		"\u0000\u031e\u0320\u0003f3\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320"+
		"\u0323\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0321"+
		"\u0322\u0001\u0000\u0000\u0000\u0322e\u0001\u0000\u0000\u0000\u0323\u0321"+
		"\u0001\u0000\u0000\u0000\u0324\u0325\u0003\u0012\t\u0000\u0325\u0326\u0005"+
		"p\u0000\u0000\u0326\u0327\u0003h4\u0000\u0327g\u0001\u0000\u0000\u0000"+
		"\u0328\u0329\u0005\u0089\u0000\u0000\u0329i\u0001\u0000\u0000\u0000\u032a"+
		"\u032b\u0005b\u0000\u0000\u032b\u0330\u0003\u0012\t\u0000\u032c\u032d"+
		"\u0005\u007f\u0000\u0000\u032d\u032e\u0003(\u0014\u0000\u032e\u032f\u0005"+
		"\u0080\u0000\u0000\u032f\u0331\u0001\u0000\u0000\u0000\u0330\u032c\u0001"+
		"\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0334\u0001"+
		"\u0000\u0000\u0000\u0332\u0333\u0005\r\u0000\u0000\u0333\u0335\u0003p"+
		"8\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0337\u0005|\u0000\u0000"+
		"\u0337k\u0001\u0000\u0000\u0000\u0338\u0339\u0005c\u0000\u0000\u0339\u033a"+
		"\u0003\u0012\t\u0000\u033a\u033b\u0005|\u0000\u0000\u033bm\u0001\u0000"+
		"\u0000\u0000\u033c\u033d\u0005d\u0000\u0000\u033d\u033e\u0003\u0012\t"+
		"\u0000\u033e\u033f\u0005\u0019\u0000\u0000\u033f\u0340\u0003\u0018\f\u0000"+
		"\u0340\u0341\u0005|\u0000\u0000\u0341o\u0001\u0000\u0000\u0000\u0342\u0344"+
		"\u0005\u0013\u0000\u0000\u0343\u0345\u0007\u0006\u0000\u0000\u0344\u0343"+
		"\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0346"+
		"\u0001\u0000\u0000\u0000\u0346\u0348\u0003\u0016\u000b\u0000\u0347\u0349"+
		"\u0003\u001a\r\u0000\u0348\u0347\u0001\u0000\u0000\u0000\u0348\u0349\u0001"+
		"\u0000\u0000\u0000\u0349\u034b\u0001\u0000\u0000\u0000\u034a\u034c\u0003"+
		"\u001e\u000f\u0000\u034b\u034a\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034f\u0003"+
		"r9\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000"+
		"\u0000\u034f\u0351\u0001\u0000\u0000\u0000\u0350\u0352\u0003t:\u0000\u0351"+
		"\u0350\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352"+
		"\u0354\u0001\u0000\u0000\u0000\u0353\u0355\u0003v;\u0000\u0354\u0353\u0001"+
		"\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0357\u0001"+
		"\u0000\u0000\u0000\u0356\u0358\u0003z=\u0000\u0357\u0356\u0001\u0000\u0000"+
		"\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358q\u0001\u0000\u0000\u0000"+
		"\u0359\u035a\u0005\"\u0000\u0000\u035a\u035b\u0005=\u0000\u0000\u035b"+
		"\u035c\u0003(\u0014\u0000\u035cs\u0001\u0000\u0000\u0000\u035d\u035e\u0005"+
		"#\u0000\u0000\u035e\u035f\u0003\u0080@\u0000\u035fu\u0001\u0000\u0000"+
		"\u0000\u0360\u0361\u0005$\u0000\u0000\u0361\u0362\u0005=\u0000\u0000\u0362"+
		"\u0367\u0003x<\u0000\u0363\u0364\u0005}\u0000\u0000\u0364\u0366\u0003"+
		"x<\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366\u0369\u0001\u0000\u0000"+
		"\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000"+
		"\u0000\u0368w\u0001\u0000\u0000\u0000\u0369\u0367\u0001\u0000\u0000\u0000"+
		"\u036a\u036c\u0003\u0080@\u0000\u036b\u036d\u0007\u0007\u0000\u0000\u036c"+
		"\u036b\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d"+
		"\u0370\u0001\u0000\u0000\u0000\u036e\u036f\u0005)\u0000\u0000\u036f\u0371"+
		"\u0007\b\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001"+
		"\u0000\u0000\u0000\u0371y\u0001\u0000\u0000\u0000\u0372\u0375\u0005%\u0000"+
		"\u0000\u0373\u0376\u0003\u0080@\u0000\u0374\u0376\u0005!\u0000\u0000\u0375"+
		"\u0373\u0001\u0000\u0000\u0000\u0375\u0374\u0001\u0000\u0000\u0000\u0376"+
		"\u0379\u0001\u0000\u0000\u0000\u0377\u0378\u0005&\u0000\u0000\u0378\u037a"+
		"\u0003\u0080@\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379\u037a\u0001"+
		"\u0000\u0000\u0000\u037a{\u0001\u0000\u0000\u0000\u037b\u0380\u0003~?"+
		"\u0000\u037c\u037d\u0005}\u0000\u0000\u037d\u037f\u0003~?\u0000\u037e"+
		"\u037c\u0001\u0000\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380"+
		"\u037e\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381"+
		"}\u0001\u0000\u0000\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0005\u0089\u0000\u0000\u0384\u0385\u0003\n\u0005\u0000\u0385\u007f\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0006@\uffff\uffff\u0000\u0387\u039d\u0003"+
		"\u008aE\u0000\u0388\u039d\u0003\u0012\t\u0000\u0389\u039d\u0003\u0088"+
		"D\u0000\u038a\u038b\u0005\u007f\u0000\u0000\u038b\u038c\u0003\u0080@\u0000"+
		"\u038c\u038d\u0005\u0080\u0000\u0000\u038d\u039d\u0001\u0000\u0000\u0000"+
		"\u038e\u038f\u0005Q\u0000\u0000\u038f\u039d\u0003\u0080@\u0004\u0390\u0392"+
		"\u0005\t\u0000\u0000\u0391\u0393\u0003\u0080@\u0000\u0392\u0391\u0001"+
		"\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000\u0000\u0393\u0394\u0001"+
		"\u0000\u0000\u0000\u0394\u0397\u0003\u0082A\u0000\u0395\u0396\u0005\b"+
		"\u0000\u0000\u0396\u0398\u0003\u0080@\u0000\u0397\u0395\u0001\u0000\u0000"+
		"\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000"+
		"\u0000\u0399\u039a\u0005\u0003\u0000\u0000\u039a\u039d\u0001\u0000\u0000"+
		"\u0000\u039b\u039d\u0003\u0086C\u0000\u039c\u0386\u0001\u0000\u0000\u0000"+
		"\u039c\u0388\u0001\u0000\u0000\u0000\u039c\u0389\u0001\u0000\u0000\u0000"+
		"\u039c\u038a\u0001\u0000\u0000\u0000\u039c\u038e\u0001\u0000\u0000\u0000"+
		"\u039c\u0390\u0001\u0000\u0000\u0000\u039c\u039b\u0001\u0000\u0000\u0000"+
		"\u039d\u03b5\u0001\u0000\u0000\u0000\u039e\u039f\n\t\u0000\u0000\u039f"+
		"\u03a0\u0007\t\u0000\u0000\u03a0\u03b4\u0003\u0080@\n\u03a1\u03a2\n\b"+
		"\u0000\u0000\u03a2\u03a3\u0007\n\u0000\u0000\u03a3\u03b4\u0003\u0080@"+
		"\t\u03a4\u03a5\n\u0007\u0000\u0000\u03a5\u03a6\u0005o\u0000\u0000\u03a6"+
		"\u03b4\u0003\u0080@\b\u03a7\u03a8\n\u0006\u0000\u0000\u03a8\u03a9\u0007"+
		"\u000b\u0000\u0000\u03a9\u03b4\u0003\u0080@\u0007\u03aa\u03ab\n\u0005"+
		"\u0000\u0000\u03ab\u03ac\u0007\f\u0000\u0000\u03ac\u03b4\u0003\u0080@"+
		"\u0006\u03ad\u03ae\n\u0003\u0000\u0000\u03ae\u03b0\u0005O\u0000\u0000"+
		"\u03af\u03b1\u0005Q\u0000\u0000\u03b0\u03af\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000\u0000\u0000\u03b2"+
		"\u03b4\u0005P\u0000\u0000\u03b3\u039e\u0001\u0000\u0000\u0000\u03b3\u03a1"+
		"\u0001\u0000\u0000\u0000\u03b3\u03a4\u0001\u0000\u0000\u0000\u03b3\u03a7"+
		"\u0001\u0000\u0000\u0000\u03b3\u03aa\u0001\u0000\u0000\u0000\u03b3\u03ad"+
		"\u0001\u0000\u0000\u0000\u03b4\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b6\u0001\u0000\u0000\u0000\u03b6\u0081"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b8\u03ba"+
		"\u0003\u0084B\u0000\u03b9\u03b8\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bb\u03b9\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001"+
		"\u0000\u0000\u0000\u03bc\u0083\u0001\u0000\u0000\u0000\u03bd\u03be\u0005"+
		"\n\u0000\u0000\u03be\u03bf\u0003\u0080@\u0000\u03bf\u03c0\u0005\u0006"+
		"\u0000\u0000\u03c0\u03c1\u0003\u0080@\u0000\u03c1\u0085\u0001\u0000\u0000"+
		"\u0000\u03c2\u03c3\u0005>\u0000\u0000\u03c3\u03c4\u0005\u0081\u0000\u0000"+
		"\u03c4\u03c5\u0003(\u0014\u0000\u03c5\u03c6\u0005\u0082\u0000\u0000\u03c6"+
		"\u03cd\u0001\u0000\u0000\u0000\u03c7\u03c8\u0003\u0012\t\u0000\u03c8\u03c9"+
		"\u0005\u0081\u0000\u0000\u03c9\u03ca\u0003\u0080@\u0000\u03ca\u03cb\u0005"+
		"\u0082\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc\u03c2\u0001"+
		"\u0000\u0000\u0000\u03cc\u03c7\u0001\u0000\u0000\u0000\u03cd\u0087\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cf\u0005\u0089\u0000\u0000\u03cf\u03d2\u0005"+
		"\u007f\u0000\u0000\u03d0\u03d3\u0003(\u0014\u0000\u03d1\u03d3\u0005x\u0000"+
		"\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d1\u0001\u0000\u0000"+
		"\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d5\u0005\u0080\u0000\u0000\u03d5\u0089\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d7\u0007\r\u0000\u0000\u03d7\u008b\u0001\u0000\u0000\u0000"+
		"~\u008d\u0090\u0095\u0099\u009c\u00a8\u00ac\u00b1\u00b7\u00c1\u00cd\u00d0"+
		"\u00db\u00de\u00e5\u00e8\u00f0\u00f6\u00ff\u0105\u0107\u010d\u0111\u0117"+
		"\u0133\u013f\u0147\u014a\u0150\u0154\u0157\u0161\u0164\u016b\u0174\u0179"+
		"\u017c\u0181\u0184\u0187\u0189\u0191\u0194\u019c\u01a0\u01ab\u01b6\u01bf"+
		"\u01c7\u01cf\u01d6\u01df\u01ea\u01f1\u0200\u020d\u0212\u021a\u021f\u0228"+
		"\u0230\u0237\u023c\u0245\u024a\u0250\u0258\u025f\u0264\u026f\u0273\u027a"+
		"\u027d\u0280\u0283\u0286\u0289\u028c\u028f\u0295\u029f\u02a5\u02a9\u02af"+
		"\u02b3\u02b9\u02bf\u02c4\u02c7\u02cb\u02d4\u02df\u02e7\u02ea\u02ed\u02f2"+
		"\u02f6\u0300\u030c\u0312\u0316\u0321\u0330\u0334\u0344\u0348\u034b\u034e"+
		"\u0351\u0354\u0357\u0367\u036c\u0370\u0375\u0379\u0380\u0392\u0397\u039c"+
		"\u03b0\u03b3\u03b5\u03bb\u03cc\u03d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}