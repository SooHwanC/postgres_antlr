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
		EXECUTE=24, INTO=25, FROM=26, WHERE=27, SET=28, VALUES=29, INTEGER=30, 
		BIGINT=31, SMALLINT=32, NUMERIC=33, DECIMAL=34, REAL=35, DOUBLE=36, VARCHAR=37, 
		CHAR=38, TEXT=39, BOOLEAN=40, DATE=41, TIMESTAMP=42, RECORD=43, IN=44, 
		REVERSE=45, BY=46, ARRAY=47, SLICE=48, NOTICE=49, WARNING=50, INFO=51, 
		DEBUG=52, LOG=53, SQLSTATE=54, ERRCODE=55, MESSAGE=56, DETAIL=57, HINT=58, 
		GET=59, DIAGNOSTICS=60, STACKED=61, CURRENT=62, AS=63, IS=64, NULL=65, 
		NOT=66, AND=67, OR=68, CONSTANT=69, DEFAULT=70, USING=71, STRICT=72, VOLATILE=73, 
		STABLE=74, IMMUTABLE=75, LANGUAGE=76, RETURNS=77, CALLED=78, SECURITY=79, 
		DEFINER=80, INVOKER=81, ASSERT=82, OPEN=83, CLOSE=84, FETCH=85, MOVE=86, 
		FOUND=87, CURSOR=88, TRUE=89, FALSE=90, PERCENT=91, TYPE=92, ROWTYPE=93, 
		DOLLAR=94, ASSIGN=95, CONCAT=96, EQ=97, NEQ=98, LT=99, LTE=100, GT=101, 
		GTE=102, PLUS=103, MINUS=104, STAR=105, SLASH=106, PERCENT_OP=107, CARET=108, 
		SEMI=109, COMMA=110, DOT=111, LPAREN=112, RPAREN=113, LBRACK=114, RBRACK=115, 
		LABEL_START=116, LABEL_END=117, IntegerLiteral=118, NumericLiteral=119, 
		StringLiteral=120, Identifier=121, QuotedIdentifier=122, LineComment=123, 
		BlockComment=124, WS=125, ALIAS=126;
	public static final int
		RULE_plpgsqlBlock = 0, RULE_label = 1, RULE_declareSection = 2, RULE_declarationList = 3, 
		RULE_declaration = 4, RULE_dataType = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_assignmentStmt = 8, RULE_variableRef = 9, RULE_selectIntoStmt = 10, 
		RULE_selectList = 11, RULE_variableList = 12, RULE_fromClause = 13, RULE_tableRef = 14, 
		RULE_whereClause = 15, RULE_performStmt = 16, RULE_executeStmt = 17, RULE_insertStmt = 18, 
		RULE_columnList = 19, RULE_expressionList = 20, RULE_updateStmt = 21, 
		RULE_assignmentList = 22, RULE_columnAssignment = 23, RULE_deleteStmt = 24, 
		RULE_ifStmt = 25, RULE_caseStmt = 26, RULE_whenClauseList = 27, RULE_whenClause = 28, 
		RULE_loopStmt = 29, RULE_whileStmt = 30, RULE_forStmt = 31, RULE_foreachStmt = 32, 
		RULE_exitStmt = 33, RULE_continueStmt = 34, RULE_returnStmt = 35, RULE_raiseStmt = 36, 
		RULE_raiseOptionList = 37, RULE_raiseOption = 38, RULE_assertStmt = 39, 
		RULE_nullStmt = 40, RULE_nestedBlock = 41, RULE_exceptionSection = 42, 
		RULE_exceptionHandlerList = 43, RULE_exceptionHandler = 44, RULE_exceptionConditionList = 45, 
		RULE_exceptionCondition = 46, RULE_getDiagnosticsStmt = 47, RULE_diagnosticsItemList = 48, 
		RULE_diagnosticsItem = 49, RULE_diagnosticsOption = 50, RULE_openCursorStmt = 51, 
		RULE_closeCursorStmt = 52, RULE_fetchStmt = 53, RULE_selectStmt = 54, 
		RULE_parameterList = 55, RULE_parameter = 56, RULE_expression = 57, RULE_whenExprClauseList = 58, 
		RULE_whenExprClause = 59, RULE_arrayExpression = 60, RULE_functionCall = 61, 
		RULE_literal = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"plpgsqlBlock", "label", "declareSection", "declarationList", "declaration", 
			"dataType", "statementList", "statement", "assignmentStmt", "variableRef", 
			"selectIntoStmt", "selectList", "variableList", "fromClause", "tableRef", 
			"whereClause", "performStmt", "executeStmt", "insertStmt", "columnList", 
			"expressionList", "updateStmt", "assignmentList", "columnAssignment", 
			"deleteStmt", "ifStmt", "caseStmt", "whenClauseList", "whenClause", "loopStmt", 
			"whileStmt", "forStmt", "foreachStmt", "exitStmt", "continueStmt", "returnStmt", 
			"raiseStmt", "raiseOptionList", "raiseOption", "assertStmt", "nullStmt", 
			"nestedBlock", "exceptionSection", "exceptionHandlerList", "exceptionHandler", 
			"exceptionConditionList", "exceptionCondition", "getDiagnosticsStmt", 
			"diagnosticsItemList", "diagnosticsItem", "diagnosticsOption", "openCursorStmt", 
			"closeCursorStmt", "fetchStmt", "selectStmt", "parameterList", "parameter", 
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
			"'FROM'", "'WHERE'", "'SET'", "'VALUES'", null, "'BIGINT'", "'SMALLINT'", 
			"'NUMERIC'", "'DECIMAL'", "'REAL'", null, "'VARCHAR'", "'CHAR'", "'TEXT'", 
			null, "'DATE'", "'TIMESTAMP'", "'RECORD'", "'IN'", "'REVERSE'", "'BY'", 
			"'ARRAY'", "'SLICE'", "'NOTICE'", "'WARNING'", "'INFO'", "'DEBUG'", "'LOG'", 
			"'SQLSTATE'", "'ERRCODE'", "'MESSAGE'", "'DETAIL'", "'HINT'", "'GET'", 
			"'DIAGNOSTICS'", "'STACKED'", "'CURRENT'", "'AS'", "'IS'", "'NULL'", 
			"'NOT'", "'AND'", "'OR'", "'CONSTANT'", "'DEFAULT'", "'USING'", "'STRICT'", 
			"'VOLATILE'", "'STABLE'", "'IMMUTABLE'", "'LANGUAGE'", "'RETURNS'", "'CALLED'", 
			"'SECURITY'", "'DEFINER'", "'INVOKER'", "'ASSERT'", "'OPEN'", "'CLOSE'", 
			"'FETCH'", "'MOVE'", "'FOUND'", "'CURSOR'", "'TRUE'", "'FALSE'", null, 
			"'TYPE'", "'ROWTYPE'", "'$'", "':='", "'||'", "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", null, "'^'", "';'", "','", 
			"'.'", "'('", "')'", "'['", "']'", "'<<'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "BEGIN", "END", "EXCEPTION", "IF", "THEN", "ELSIF", 
			"ELSE", "CASE", "WHEN", "LOOP", "WHILE", "FOR", "FOREACH", "EXIT", "CONTINUE", 
			"RETURN", "RAISE", "SELECT", "INSERT", "UPDATE", "DELETE", "PERFORM", 
			"EXECUTE", "INTO", "FROM", "WHERE", "SET", "VALUES", "INTEGER", "BIGINT", 
			"SMALLINT", "NUMERIC", "DECIMAL", "REAL", "DOUBLE", "VARCHAR", "CHAR", 
			"TEXT", "BOOLEAN", "DATE", "TIMESTAMP", "RECORD", "IN", "REVERSE", "BY", 
			"ARRAY", "SLICE", "NOTICE", "WARNING", "INFO", "DEBUG", "LOG", "SQLSTATE", 
			"ERRCODE", "MESSAGE", "DETAIL", "HINT", "GET", "DIAGNOSTICS", "STACKED", 
			"CURRENT", "AS", "IS", "NULL", "NOT", "AND", "OR", "CONSTANT", "DEFAULT", 
			"USING", "STRICT", "VOLATILE", "STABLE", "IMMUTABLE", "LANGUAGE", "RETURNS", 
			"CALLED", "SECURITY", "DEFINER", "INVOKER", "ASSERT", "OPEN", "CLOSE", 
			"FETCH", "MOVE", "FOUND", "CURSOR", "TRUE", "FALSE", "PERCENT", "TYPE", 
			"ROWTYPE", "DOLLAR", "ASSIGN", "CONCAT", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT_OP", "CARET", "SEMI", 
			"COMMA", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LABEL_START", 
			"LABEL_END", "IntegerLiteral", "NumericLiteral", "StringLiteral", "Identifier", 
			"QuotedIdentifier", "LineComment", "BlockComment", "WS", "ALIAS"
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
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(126);
				label();
				}
			}

			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(129);
				declareSection();
				}
			}

			setState(132);
			match(BEGIN);
			setState(133);
			statementList();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(134);
				exceptionSection();
				}
			}

			setState(137);
			match(END);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(138);
				label();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(141);
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
			setState(144);
			match(LABEL_START);
			setState(145);
			match(Identifier);
			setState(146);
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
			setState(148);
			match(DECLARE);
			setState(149);
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
			setState(152); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(151);
				declaration();
				}
				}
				setState(154); 
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
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(Identifier);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTANT) {
					{
					setState(157);
					match(CONSTANT);
					}
				}

				setState(160);
				dataType(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(161);
					match(NOT);
					setState(162);
					match(NULL);
					}
				}

				setState(169);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(165);
					match(ASSIGN);
					setState(166);
					expression(0);
					}
					break;
				case DEFAULT:
					{
					setState(167);
					match(DEFAULT);
					setState(168);
					expression(0);
					}
					break;
				case SEMI:
					break;
				default:
					break;
				}
				setState(171);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(Identifier);
				setState(174);
				match(CURSOR);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(175);
					match(LPAREN);
					setState(176);
					parameterList();
					setState(177);
					match(RPAREN);
					}
				}

				setState(181);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				selectStmt();
				setState(183);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(Identifier);
				setState(186);
				match(ALIAS);
				setState(187);
				match(FOR);
				setState(191);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(188);
					match(Identifier);
					}
					break;
				case DOLLAR:
					{
					setState(189);
					match(DOLLAR);
					setState(190);
					match(IntegerLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193);
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(197);
				match(INTEGER);
				}
				break;
			case BIGINT:
				{
				setState(198);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				{
				setState(199);
				match(SMALLINT);
				}
				break;
			case NUMERIC:
				{
				setState(200);
				match(NUMERIC);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(201);
					match(LPAREN);
					setState(202);
					match(IntegerLiteral);
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(203);
						match(COMMA);
						setState(204);
						match(IntegerLiteral);
						}
					}

					setState(207);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case DECIMAL:
				{
				setState(210);
				match(DECIMAL);
				setState(218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(211);
					match(LPAREN);
					setState(212);
					match(IntegerLiteral);
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(213);
						match(COMMA);
						setState(214);
						match(IntegerLiteral);
						}
					}

					setState(217);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case REAL:
				{
				setState(220);
				match(REAL);
				}
				break;
			case DOUBLE:
				{
				setState(221);
				match(DOUBLE);
				}
				break;
			case VARCHAR:
				{
				setState(222);
				match(VARCHAR);
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(223);
					match(LPAREN);
					setState(224);
					match(IntegerLiteral);
					setState(225);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case CHAR:
				{
				setState(228);
				match(CHAR);
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(229);
					match(LPAREN);
					setState(230);
					match(IntegerLiteral);
					setState(231);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case TEXT:
				{
				setState(234);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				{
				setState(235);
				match(BOOLEAN);
				}
				break;
			case DATE:
				{
				setState(236);
				match(DATE);
				}
				break;
			case TIMESTAMP:
				{
				setState(237);
				match(TIMESTAMP);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(238);
					match(LPAREN);
					setState(239);
					match(IntegerLiteral);
					setState(240);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case RECORD:
				{
				setState(243);
				match(RECORD);
				}
				break;
			case Identifier:
				{
				setState(244);
				match(Identifier);
				setState(247);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(245);
					match(PERCENT);
					setState(246);
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
			setState(259);
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
					setState(251);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(252);
					match(ARRAY);
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(253);
						match(LBRACK);
						setState(254);
						match(RBRACK);
						}
						break;
					}
					}
					} 
				}
				setState(261);
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
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460752336976422L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 218424581929435137L) != 0)) {
				{
				{
				setState(262);
				statement();
				}
				}
				setState(267);
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				assignmentStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				selectIntoStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				performStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				executeStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				insertStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(273);
				updateStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(274);
				deleteStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(275);
				ifStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(276);
				caseStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(277);
				loopStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(278);
				whileStmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(279);
				forStmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(280);
				foreachStmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(281);
				exitStmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(282);
				continueStmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(283);
				returnStmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(284);
				raiseStmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(285);
				assertStmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(286);
				nullStmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(287);
				nestedBlock();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(288);
				getDiagnosticsStmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(289);
				openCursorStmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(290);
				closeCursorStmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(291);
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
			setState(294);
			variableRef();
			setState(295);
			match(ASSIGN);
			setState(296);
			expression(0);
			setState(297);
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
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(Identifier);
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(300);
						match(DOT);
						setState(301);
						match(Identifier);
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(QuotedIdentifier);
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						match(DOT);
						setState(309);
						match(QuotedIdentifier);
						}
						} 
					}
					setState(314);
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
			setState(317);
			match(SELECT);
			setState(318);
			selectList();
			setState(319);
			match(INTO);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(320);
				match(STRICT);
				}
			}

			setState(323);
			variableList();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(324);
				fromClause();
				}
			}

			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(327);
				whereClause();
				}
			}

			setState(330);
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
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(332);
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
			case Identifier:
			case QuotedIdentifier:
				{
				setState(333);
				expression(0);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(334);
					match(COMMA);
					setState(335);
					expression(0);
					}
					}
					setState(340);
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
			setState(343);
			variableRef();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(344);
				match(COMMA);
				setState(345);
				variableRef();
				}
				}
				setState(350);
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
			setState(351);
			match(FROM);
			setState(352);
			tableRef();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(353);
				match(COMMA);
				setState(354);
				tableRef();
				}
				}
				setState(359);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(Identifier);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==Identifier) {
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(361);
					match(AS);
					}
				}

				setState(364);
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
			setState(367);
			match(WHERE);
			setState(368);
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
			setState(370);
			match(PERFORM);
			setState(371);
			selectList();
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(372);
				fromClause();
				}
			}

			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(375);
				whereClause();
				}
			}

			setState(378);
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
			setState(380);
			match(EXECUTE);
			setState(381);
			expression(0);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(382);
				match(INTO);
				setState(383);
				variableList();
				}
			}

			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(386);
				match(USING);
				setState(387);
				expressionList();
				}
			}

			setState(390);
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
		public TerminalNode INTO() { return getToken(PlpgsqlParser.INTO, 0); }
		public TerminalNode Identifier() { return getToken(PlpgsqlParser.Identifier, 0); }
		public TerminalNode VALUES() { return getToken(PlpgsqlParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(PlpgsqlParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PlpgsqlParser.LPAREN, i);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PlpgsqlParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PlpgsqlParser.RPAREN, i);
		}
		public TerminalNode SEMI() { return getToken(PlpgsqlParser.SEMI, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(INSERT);
			setState(393);
			match(INTO);
			setState(394);
			match(Identifier);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(395);
				match(LPAREN);
				setState(396);
				columnList();
				setState(397);
				match(RPAREN);
				}
			}

			setState(401);
			match(VALUES);
			setState(402);
			match(LPAREN);
			setState(403);
			expressionList();
			setState(404);
			match(RPAREN);
			setState(405);
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
			setState(407);
			match(Identifier);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(408);
				match(COMMA);
				setState(409);
				match(Identifier);
				}
				}
				setState(414);
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
			setState(415);
			expression(0);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(416);
				match(COMMA);
				setState(417);
				expression(0);
				}
				}
				setState(422);
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
			setState(423);
			match(UPDATE);
			setState(424);
			match(Identifier);
			setState(425);
			match(SET);
			setState(426);
			assignmentList();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(427);
				whereClause();
				}
			}

			setState(430);
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
			setState(432);
			columnAssignment();
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(433);
				match(COMMA);
				setState(434);
				columnAssignment();
				}
				}
				setState(439);
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
			setState(440);
			match(Identifier);
			setState(441);
			match(EQ);
			setState(442);
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
			setState(444);
			match(DELETE);
			setState(445);
			match(FROM);
			setState(446);
			match(Identifier);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(447);
				whereClause();
				}
			}

			setState(450);
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
		enterRule(_localctx, 50, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(IF);
			setState(453);
			expression(0);
			setState(454);
			match(THEN);
			setState(455);
			statementList();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(456);
				match(ELSIF);
				setState(457);
				expression(0);
				setState(458);
				match(THEN);
				setState(459);
				statementList();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(466);
				match(ELSE);
				setState(467);
				statementList();
				}
			}

			setState(470);
			match(END);
			setState(471);
			match(IF);
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
		enterRule(_localctx, 52, RULE_caseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(CASE);
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==ARRAY || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 279363914435657731L) != 0)) {
				{
				setState(475);
				expression(0);
				}
			}

			setState(478);
			whenClauseList();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(479);
				match(ELSE);
				setState(480);
				statementList();
				}
			}

			setState(483);
			match(END);
			setState(484);
			match(CASE);
			setState(485);
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
		enterRule(_localctx, 54, RULE_whenClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(487);
				whenClause();
				}
				}
				setState(490); 
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
		enterRule(_localctx, 56, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(WHEN);
			setState(493);
			expression(0);
			setState(494);
			match(THEN);
			setState(495);
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
		enterRule(_localctx, 58, RULE_loopStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(497);
				label();
				}
			}

			setState(500);
			match(LOOP);
			setState(501);
			statementList();
			setState(502);
			match(END);
			setState(503);
			match(LOOP);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(504);
				label();
				}
			}

			setState(507);
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
		enterRule(_localctx, 60, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(509);
				label();
				}
			}

			setState(512);
			match(WHILE);
			setState(513);
			expression(0);
			setState(514);
			match(LOOP);
			setState(515);
			statementList();
			setState(516);
			match(END);
			setState(517);
			match(LOOP);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(518);
				label();
				}
			}

			setState(521);
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
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
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
		enterRule(_localctx, 62, RULE_forStmt);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(523);
					label();
					}
				}

				setState(526);
				match(FOR);
				setState(527);
				match(Identifier);
				setState(528);
				match(IN);
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE) {
					{
					setState(529);
					match(REVERSE);
					}
				}

				setState(532);
				expression(0);
				setState(533);
				match(DOT);
				setState(534);
				match(DOT);
				setState(535);
				expression(0);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(536);
					match(BY);
					setState(537);
					expression(0);
					}
				}

				setState(540);
				match(LOOP);
				setState(541);
				statementList();
				setState(542);
				match(END);
				setState(543);
				match(LOOP);
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(544);
					label();
					}
				}

				setState(547);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(549);
					label();
					}
				}

				setState(552);
				match(FOR);
				setState(553);
				match(Identifier);
				setState(554);
				match(IN);
				setState(555);
				selectStmt();
				setState(556);
				match(LOOP);
				setState(557);
				statementList();
				setState(558);
				match(END);
				setState(559);
				match(LOOP);
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LABEL_START) {
					{
					setState(560);
					label();
					}
				}

				setState(563);
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
		enterRule(_localctx, 64, RULE_foreachStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(567);
				label();
				}
			}

			setState(570);
			match(FOREACH);
			setState(571);
			match(Identifier);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLICE) {
				{
				setState(572);
				match(SLICE);
				setState(573);
				match(IntegerLiteral);
				}
			}

			setState(576);
			match(IN);
			setState(577);
			match(ARRAY);
			setState(578);
			expression(0);
			setState(579);
			match(LOOP);
			setState(580);
			statementList();
			setState(581);
			match(END);
			setState(582);
			match(LOOP);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(583);
				label();
				}
			}

			setState(586);
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
		enterRule(_localctx, 66, RULE_exitStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(EXIT);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(589);
				match(Identifier);
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(592);
				match(WHEN);
				setState(593);
				expression(0);
				}
			}

			setState(596);
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
		enterRule(_localctx, 68, RULE_continueStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(CONTINUE);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(599);
				match(Identifier);
				}
			}

			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(602);
				match(WHEN);
				setState(603);
				expression(0);
				}
			}

			setState(606);
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
		enterRule(_localctx, 70, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(RETURN);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==ARRAY || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 279363914435657731L) != 0)) {
				{
				setState(609);
				expression(0);
				}
			}

			setState(612);
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
		enterRule(_localctx, 72, RULE_raiseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(RAISE);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060688L) != 0)) {
				{
				setState(615);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556060688L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteral:
				{
				setState(618);
				match(StringLiteral);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(619);
					match(COMMA);
					setState(620);
					expressionList();
					}
				}

				}
				break;
			case Identifier:
				{
				setState(623);
				match(Identifier);
				}
				break;
			case USING:
			case SEMI:
				break;
			default:
				break;
			}
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(626);
				match(USING);
				setState(627);
				raiseOptionList();
				}
			}

			setState(630);
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
		enterRule(_localctx, 74, RULE_raiseOptionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			raiseOption();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				raiseOption();
				}
				}
				setState(639);
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
		enterRule(_localctx, 76, RULE_raiseOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 558446353793941504L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(641);
			match(EQ);
			setState(642);
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
		enterRule(_localctx, 78, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(ASSERT);
			setState(645);
			expression(0);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(646);
				match(COMMA);
				setState(647);
				expression(0);
				}
			}

			setState(650);
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
		enterRule(_localctx, 80, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(NULL);
			setState(653);
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
		enterRule(_localctx, 82, RULE_nestedBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL_START) {
				{
				setState(655);
				label();
				}
			}

			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(658);
				match(DECLARE);
				}
			}

			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(661);
				declarationList();
				}
			}

			setState(664);
			match(BEGIN);
			setState(665);
			statementList();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPTION) {
				{
				setState(666);
				exceptionSection();
				}
			}

			setState(669);
			match(END);
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
		enterRule(_localctx, 84, RULE_exceptionSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(EXCEPTION);
			setState(676);
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
		enterRule(_localctx, 86, RULE_exceptionHandlerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(678);
				exceptionHandler();
				}
				}
				setState(681); 
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
		enterRule(_localctx, 88, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(WHEN);
			setState(684);
			exceptionConditionList();
			setState(685);
			match(THEN);
			setState(686);
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
		enterRule(_localctx, 90, RULE_exceptionConditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			exceptionCondition();
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(689);
				match(OR);
				setState(690);
				exceptionCondition();
				}
				}
				setState(695);
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
		enterRule(_localctx, 92, RULE_exceptionCondition);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(Identifier);
				}
				break;
			case SQLSTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(SQLSTATE);
				setState(698);
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
		enterRule(_localctx, 94, RULE_getDiagnosticsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(GET);
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STACKED || _la==CURRENT) {
				{
				setState(702);
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

			setState(705);
			match(DIAGNOSTICS);
			setState(706);
			diagnosticsItemList();
			setState(707);
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
		enterRule(_localctx, 96, RULE_diagnosticsItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			diagnosticsItem();
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(710);
				match(COMMA);
				setState(711);
				diagnosticsItem();
				}
				}
				setState(716);
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
		enterRule(_localctx, 98, RULE_diagnosticsItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			variableRef();
			setState(718);
			match(EQ);
			setState(719);
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
		enterRule(_localctx, 100, RULE_diagnosticsOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
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
		enterRule(_localctx, 102, RULE_openCursorStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(OPEN);
			setState(724);
			variableRef();
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(725);
				match(LPAREN);
				setState(726);
				expressionList();
				setState(727);
				match(RPAREN);
				}
			}

			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(731);
				match(FOR);
				setState(732);
				selectStmt();
				}
			}

			setState(735);
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
		enterRule(_localctx, 104, RULE_closeCursorStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(CLOSE);
			setState(738);
			variableRef();
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
		enterRule(_localctx, 106, RULE_fetchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			match(FETCH);
			setState(742);
			variableRef();
			setState(743);
			match(INTO);
			setState(744);
			variableList();
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
		enterRule(_localctx, 108, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			match(SELECT);
			setState(748);
			selectList();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(749);
				fromClause();
				}
			}

			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(752);
				whereClause();
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
		enterRule(_localctx, 110, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			parameter();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(756);
				match(COMMA);
				setState(757);
				parameter();
				}
				}
				setState(762);
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
		enterRule(_localctx, 112, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(Identifier);
			setState(764);
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
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(767);
				literal();
				}
				break;
			case 2:
				{
				setState(768);
				variableRef();
				}
				break;
			case 3:
				{
				setState(769);
				functionCall();
				}
				break;
			case 4:
				{
				setState(770);
				match(LPAREN);
				setState(771);
				expression(0);
				setState(772);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(774);
				match(NOT);
				setState(775);
				expression(4);
				}
				break;
			case 6:
				{
				setState(776);
				match(CASE);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASE || _la==ARRAY || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 279363914435657731L) != 0)) {
					{
					setState(777);
					expression(0);
					}
				}

				setState(780);
				whenExprClauseList();
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(781);
					match(ELSE);
					setState(782);
					expression(0);
					}
				}

				setState(785);
				match(END);
				}
				break;
			case 7:
				{
				setState(787);
				arrayExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(813);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(790);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(791);
						_la = _input.LA(1);
						if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 49153L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(792);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(793);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(794);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(795);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(796);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(797);
						match(CONCAT);
						setState(798);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(799);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(800);
						_la = _input.LA(1);
						if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 63L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(801);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(802);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(803);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(804);
						expression(6);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(805);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(806);
						match(IS);
						setState(808);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(807);
							match(NOT);
							}
						}

						setState(810);
						match(NULL);
						}
						break;
					}
					} 
				}
				setState(815);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		enterRule(_localctx, 116, RULE_whenExprClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(817); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(816);
				whenExprClause();
				}
				}
				setState(819); 
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
		enterRule(_localctx, 118, RULE_whenExprClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(WHEN);
			setState(822);
			expression(0);
			setState(823);
			match(THEN);
			setState(824);
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
		enterRule(_localctx, 120, RULE_arrayExpression);
		try {
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(826);
				match(ARRAY);
				setState(827);
				match(LBRACK);
				setState(828);
				expressionList();
				setState(829);
				match(RBRACK);
				}
				break;
			case Identifier:
			case QuotedIdentifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				variableRef();
				setState(832);
				match(LBRACK);
				setState(833);
				expression(0);
				setState(834);
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
		enterRule(_localctx, 122, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(Identifier);
			setState(839);
			match(LPAREN);
			setState(842);
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
			case Identifier:
			case QuotedIdentifier:
				{
				setState(840);
				expressionList();
				}
				break;
			case STAR:
				{
				setState(841);
				match(STAR);
				}
				break;
			case RPAREN:
				break;
			default:
				break;
			}
			setState(844);
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
		enterRule(_localctx, 124, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			_la = _input.LA(1);
			if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 63050394833518593L) != 0)) ) {
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
		case 57:
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
		"\u0004\u0001~\u0351\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0003\u0000\u0080\b\u0000"+
		"\u0001\u0000\u0003\u0000\u0083\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000\u0088\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u008c\b"+
		"\u0000\u0001\u0000\u0003\u0000\u008f\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u0003\u0099\b\u0003\u000b\u0003\f\u0003\u009a\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u009f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00a4\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b4\b\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c0\b\u0004\u0001\u0004"+
		"\u0003\u0004\u00c3\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00ce\b\u0005\u0001\u0005\u0003\u0005\u00d1\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d8\b\u0005\u0001"+
		"\u0005\u0003\u0005\u00db\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e3\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00e9\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00f8\b\u0005\u0003\u0005\u00fa\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0100\b\u0005\u0005\u0005\u0102\b"+
		"\u0005\n\u0005\f\u0005\u0105\t\u0005\u0001\u0006\u0005\u0006\u0108\b\u0006"+
		"\n\u0006\f\u0006\u010b\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0125\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u012f\b\t\n"+
		"\t\f\t\u0132\t\t\u0001\t\u0001\t\u0001\t\u0005\t\u0137\b\t\n\t\f\t\u013a"+
		"\t\t\u0003\t\u013c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0142\b"+
		"\n\u0001\n\u0001\n\u0003\n\u0146\b\n\u0001\n\u0003\n\u0149\b\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0151"+
		"\b\u000b\n\u000b\f\u000b\u0154\t\u000b\u0003\u000b\u0156\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u015b\b\f\n\f\f\f\u015e\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0005\r\u0164\b\r\n\r\f\r\u0167\t\r\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u016b\b\u000e\u0001\u000e\u0003\u000e\u016e\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0176\b\u0010\u0001\u0010\u0003\u0010\u0179\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0181\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0185\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0190\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u019b\b\u0013\n\u0013\f\u0013\u019e"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01a3\b\u0014"+
		"\n\u0014\f\u0014\u01a6\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01ad\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01b4\b\u0016\n\u0016\f\u0016"+
		"\u01b7\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01c1\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01ce\b\u0019"+
		"\n\u0019\f\u0019\u01d1\t\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01d5"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u01dd\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01e2\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0004\u001b\u01e9\b\u001b\u000b\u001b\f\u001b\u01ea\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0003\u001d"+
		"\u01f3\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01fa\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0003\u001e"+
		"\u01ff\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0208\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0003\u001f\u020d\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0213\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u021b\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0222\b\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0227\b\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u0232\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u0236\b\u001f\u0001 \u0003 \u0239\b \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u023f\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0249\b \u0001 \u0001 \u0001!\u0001!\u0003!\u024f\b!\u0001"+
		"!\u0001!\u0003!\u0253\b!\u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0259\b"+
		"\"\u0001\"\u0001\"\u0003\"\u025d\b\"\u0001\"\u0001\"\u0001#\u0001#\u0003"+
		"#\u0263\b#\u0001#\u0001#\u0001$\u0001$\u0003$\u0269\b$\u0001$\u0001$\u0001"+
		"$\u0003$\u026e\b$\u0001$\u0003$\u0271\b$\u0001$\u0001$\u0003$\u0275\b"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0005%\u027c\b%\n%\f%\u027f\t%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0289\b"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001)\u0003)\u0291\b)\u0001)"+
		"\u0003)\u0294\b)\u0001)\u0003)\u0297\b)\u0001)\u0001)\u0001)\u0003)\u029c"+
		"\b)\u0001)\u0001)\u0003)\u02a0\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0004+\u02a8\b+\u000b+\f+\u02a9\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0005-\u02b4\b-\n-\f-\u02b7\t-\u0001.\u0001.\u0001.\u0003"+
		".\u02bc\b.\u0001/\u0001/\u0003/\u02c0\b/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00050\u02c9\b0\n0\f0\u02cc\t0\u00011\u00011\u00011\u0001"+
		"1\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u02da"+
		"\b3\u00013\u00013\u00033\u02de\b3\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0003"+
		"6\u02ef\b6\u00016\u00036\u02f2\b6\u00017\u00017\u00017\u00057\u02f7\b"+
		"7\n7\f7\u02fa\t7\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u030b\b9\u0001"+
		"9\u00019\u00019\u00039\u0310\b9\u00019\u00019\u00019\u00039\u0315\b9\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u0329\b9\u0001"+
		"9\u00059\u032c\b9\n9\f9\u032f\t9\u0001:\u0004:\u0332\b:\u000b:\f:\u0333"+
		"\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u0345\b<\u0001=\u0001=\u0001"+
		"=\u0001=\u0003=\u034b\b=\u0001=\u0001=\u0001>\u0001>\u0001>\u0000\u0002"+
		"\nr?\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|\u0000"+
		"\n\u0002\u0000\r\r@@\u0001\u0000\\]\u0002\u0000\u0004\u000415\u0001\u0000"+
		"6:\u0001\u0000=>\u0002\u0000[[ij\u0001\u0000gh\u0001\u0000af\u0001\u0000"+
		"CD\u0003\u0000AAYZvx\u03a6\u0000\u007f\u0001\u0000\u0000\u0000\u0002\u0090"+
		"\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000\u0000\u0006\u0098"+
		"\u0001\u0000\u0000\u0000\b\u00c2\u0001\u0000\u0000\u0000\n\u00f9\u0001"+
		"\u0000\u0000\u0000\f\u0109\u0001\u0000\u0000\u0000\u000e\u0124\u0001\u0000"+
		"\u0000\u0000\u0010\u0126\u0001\u0000\u0000\u0000\u0012\u013b\u0001\u0000"+
		"\u0000\u0000\u0014\u013d\u0001\u0000\u0000\u0000\u0016\u0155\u0001\u0000"+
		"\u0000\u0000\u0018\u0157\u0001\u0000\u0000\u0000\u001a\u015f\u0001\u0000"+
		"\u0000\u0000\u001c\u0168\u0001\u0000\u0000\u0000\u001e\u016f\u0001\u0000"+
		"\u0000\u0000 \u0172\u0001\u0000\u0000\u0000\"\u017c\u0001\u0000\u0000"+
		"\u0000$\u0188\u0001\u0000\u0000\u0000&\u0197\u0001\u0000\u0000\u0000("+
		"\u019f\u0001\u0000\u0000\u0000*\u01a7\u0001\u0000\u0000\u0000,\u01b0\u0001"+
		"\u0000\u0000\u0000.\u01b8\u0001\u0000\u0000\u00000\u01bc\u0001\u0000\u0000"+
		"\u00002\u01c4\u0001\u0000\u0000\u00004\u01da\u0001\u0000\u0000\u00006"+
		"\u01e8\u0001\u0000\u0000\u00008\u01ec\u0001\u0000\u0000\u0000:\u01f2\u0001"+
		"\u0000\u0000\u0000<\u01fe\u0001\u0000\u0000\u0000>\u0235\u0001\u0000\u0000"+
		"\u0000@\u0238\u0001\u0000\u0000\u0000B\u024c\u0001\u0000\u0000\u0000D"+
		"\u0256\u0001\u0000\u0000\u0000F\u0260\u0001\u0000\u0000\u0000H\u0266\u0001"+
		"\u0000\u0000\u0000J\u0278\u0001\u0000\u0000\u0000L\u0280\u0001\u0000\u0000"+
		"\u0000N\u0284\u0001\u0000\u0000\u0000P\u028c\u0001\u0000\u0000\u0000R"+
		"\u0290\u0001\u0000\u0000\u0000T\u02a3\u0001\u0000\u0000\u0000V\u02a7\u0001"+
		"\u0000\u0000\u0000X\u02ab\u0001\u0000\u0000\u0000Z\u02b0\u0001\u0000\u0000"+
		"\u0000\\\u02bb\u0001\u0000\u0000\u0000^\u02bd\u0001\u0000\u0000\u0000"+
		"`\u02c5\u0001\u0000\u0000\u0000b\u02cd\u0001\u0000\u0000\u0000d\u02d1"+
		"\u0001\u0000\u0000\u0000f\u02d3\u0001\u0000\u0000\u0000h\u02e1\u0001\u0000"+
		"\u0000\u0000j\u02e5\u0001\u0000\u0000\u0000l\u02eb\u0001\u0000\u0000\u0000"+
		"n\u02f3\u0001\u0000\u0000\u0000p\u02fb\u0001\u0000\u0000\u0000r\u0314"+
		"\u0001\u0000\u0000\u0000t\u0331\u0001\u0000\u0000\u0000v\u0335\u0001\u0000"+
		"\u0000\u0000x\u0344\u0001\u0000\u0000\u0000z\u0346\u0001\u0000\u0000\u0000"+
		"|\u034e\u0001\u0000\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0001\u0000\u0000\u0000\u0081\u0083\u0003\u0004\u0002\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0087"+
		"\u0003\f\u0006\u0000\u0086\u0088\u0003T*\u0000\u0087\u0086\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0005\u0003\u0000\u0000\u008a\u008c\u0003\u0002"+
		"\u0001\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008f\u0005m\u0000"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000"+
		"\u0000\u008f\u0001\u0001\u0000\u0000\u0000\u0090\u0091\u0005t\u0000\u0000"+
		"\u0091\u0092\u0005y\u0000\u0000\u0092\u0093\u0005u\u0000\u0000\u0093\u0003"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0001\u0000\u0000\u0095\u0096"+
		"\u0003\u0006\u0003\u0000\u0096\u0005\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0003\b\u0004\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c\u009e\u0005"+
		"y\u0000\u0000\u009d\u009f\u0005E\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0003\n\u0005\u0000\u00a1\u00a2\u0005B\u0000\u0000"+
		"\u00a2\u00a4\u0005A\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a9\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005_\u0000\u0000\u00a6\u00aa\u0003r9\u0000\u00a7\u00a8\u0005"+
		"F\u0000\u0000\u00a8\u00aa\u0003r9\u0000\u00a9\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005m\u0000\u0000"+
		"\u00ac\u00c3\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005y\u0000\u0000\u00ae"+
		"\u00b3\u0005X\u0000\u0000\u00af\u00b0\u0005p\u0000\u0000\u00b0\u00b1\u0003"+
		"n7\u0000\u00b1\u00b2\u0005q\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b3\u00af\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0003l6\u0000\u00b7\u00b8\u0005m\u0000\u0000\u00b8"+
		"\u00c3\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005y\u0000\u0000\u00ba\u00bb"+
		"\u0005~\u0000\u0000\u00bb\u00bf\u0005\r\u0000\u0000\u00bc\u00c0\u0005"+
		"y\u0000\u0000\u00bd\u00be\u0005^\u0000\u0000\u00be\u00c0\u0005v\u0000"+
		"\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005m\u0000\u0000"+
		"\u00c2\u009c\u0001\u0000\u0000\u0000\u00c2\u00ad\u0001\u0000\u0000\u0000"+
		"\u00c2\u00b9\u0001\u0000\u0000\u0000\u00c3\t\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0006\u0005\uffff\uffff\u0000\u00c5\u00fa\u0005\u001e\u0000\u0000"+
		"\u00c6\u00fa\u0005\u001f\u0000\u0000\u00c7\u00fa\u0005 \u0000\u0000\u00c8"+
		"\u00d0\u0005!\u0000\u0000\u00c9\u00ca\u0005p\u0000\u0000\u00ca\u00cd\u0005"+
		"v\u0000\u0000\u00cb\u00cc\u0005n\u0000\u0000\u00cc\u00ce\u0005v\u0000"+
		"\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0005q\u0000\u0000"+
		"\u00d0\u00c9\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d1\u00fa\u0001\u0000\u0000\u0000\u00d2\u00da\u0005\"\u0000\u0000\u00d3"+
		"\u00d4\u0005p\u0000\u0000\u00d4\u00d7\u0005v\u0000\u0000\u00d5\u00d6\u0005"+
		"n\u0000\u0000\u00d6\u00d8\u0005v\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00db\u0005q\u0000\u0000\u00da\u00d3\u0001\u0000\u0000\u0000"+
		"\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00fa\u0001\u0000\u0000\u0000"+
		"\u00dc\u00fa\u0005#\u0000\u0000\u00dd\u00fa\u0005$\u0000\u0000\u00de\u00e2"+
		"\u0005%\u0000\u0000\u00df\u00e0\u0005p\u0000\u0000\u00e0\u00e1\u0005v"+
		"\u0000\u0000\u00e1\u00e3\u0005q\u0000\u0000\u00e2\u00df\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00fa\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e8\u0005&\u0000\u0000\u00e5\u00e6\u0005p\u0000\u0000\u00e6"+
		"\u00e7\u0005v\u0000\u0000\u00e7\u00e9\u0005q\u0000\u0000\u00e8\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00fa\u0001"+
		"\u0000\u0000\u0000\u00ea\u00fa\u0005\'\u0000\u0000\u00eb\u00fa\u0005("+
		"\u0000\u0000\u00ec\u00fa\u0005)\u0000\u0000\u00ed\u00f1\u0005*\u0000\u0000"+
		"\u00ee\u00ef\u0005p\u0000\u0000\u00ef\u00f0\u0005v\u0000\u0000\u00f0\u00f2"+
		"\u0005q\u0000\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00fa\u0001\u0000\u0000\u0000\u00f3\u00fa\u0005"+
		"+\u0000\u0000\u00f4\u00f7\u0005y\u0000\u0000\u00f5\u00f6\u0005[\u0000"+
		"\u0000\u00f6\u00f8\u0007\u0001\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00c4\u0001\u0000\u0000\u0000\u00f9\u00c6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00c7\u0001\u0000\u0000\u0000\u00f9\u00c8\u0001\u0000\u0000"+
		"\u0000\u00f9\u00d2\u0001\u0000\u0000\u0000\u00f9\u00dc\u0001\u0000\u0000"+
		"\u0000\u00f9\u00dd\u0001\u0000\u0000\u0000\u00f9\u00de\u0001\u0000\u0000"+
		"\u0000\u00f9\u00e4\u0001\u0000\u0000\u0000\u00f9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f9\u00eb\u0001\u0000\u0000\u0000\u00f9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00f9\u00ed\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00fa\u0103\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\n\u0001\u0000\u0000\u00fc\u00ff\u0005/\u0000\u0000"+
		"\u00fd\u00fe\u0005r\u0000\u0000\u00fe\u0100\u0005s\u0000\u0000\u00ff\u00fd"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00fb\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u000b\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0108\u0003\u000e\u0007\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\r\u0001"+
		"\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u0125\u0003"+
		"\u0010\b\u0000\u010d\u0125\u0003\u0014\n\u0000\u010e\u0125\u0003 \u0010"+
		"\u0000\u010f\u0125\u0003\"\u0011\u0000\u0110\u0125\u0003$\u0012\u0000"+
		"\u0111\u0125\u0003*\u0015\u0000\u0112\u0125\u00030\u0018\u0000\u0113\u0125"+
		"\u00032\u0019\u0000\u0114\u0125\u00034\u001a\u0000\u0115\u0125\u0003:"+
		"\u001d\u0000\u0116\u0125\u0003<\u001e\u0000\u0117\u0125\u0003>\u001f\u0000"+
		"\u0118\u0125\u0003@ \u0000\u0119\u0125\u0003B!\u0000\u011a\u0125\u0003"+
		"D\"\u0000\u011b\u0125\u0003F#\u0000\u011c\u0125\u0003H$\u0000\u011d\u0125"+
		"\u0003N\'\u0000\u011e\u0125\u0003P(\u0000\u011f\u0125\u0003R)\u0000\u0120"+
		"\u0125\u0003^/\u0000\u0121\u0125\u0003f3\u0000\u0122\u0125\u0003h4\u0000"+
		"\u0123\u0125\u0003j5\u0000\u0124\u010c\u0001\u0000\u0000\u0000\u0124\u010d"+
		"\u0001\u0000\u0000\u0000\u0124\u010e\u0001\u0000\u0000\u0000\u0124\u010f"+
		"\u0001\u0000\u0000\u0000\u0124\u0110\u0001\u0000\u0000\u0000\u0124\u0111"+
		"\u0001\u0000\u0000\u0000\u0124\u0112\u0001\u0000\u0000\u0000\u0124\u0113"+
		"\u0001\u0000\u0000\u0000\u0124\u0114\u0001\u0000\u0000\u0000\u0124\u0115"+
		"\u0001\u0000\u0000\u0000\u0124\u0116\u0001\u0000\u0000\u0000\u0124\u0117"+
		"\u0001\u0000\u0000\u0000\u0124\u0118\u0001\u0000\u0000\u0000\u0124\u0119"+
		"\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000\u0000\u0000\u0124\u011b"+
		"\u0001\u0000\u0000\u0000\u0124\u011c\u0001\u0000\u0000\u0000\u0124\u011d"+
		"\u0001\u0000\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u011f"+
		"\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0124\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125\u000f\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0003\u0012\t\u0000\u0127\u0128\u0005_\u0000\u0000\u0128\u0129\u0003"+
		"r9\u0000\u0129\u012a\u0005m\u0000\u0000\u012a\u0011\u0001\u0000\u0000"+
		"\u0000\u012b\u0130\u0005y\u0000\u0000\u012c\u012d\u0005o\u0000\u0000\u012d"+
		"\u012f\u0005y\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132"+
		"\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131"+
		"\u0001\u0000\u0000\u0000\u0131\u013c\u0001\u0000\u0000\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0133\u0138\u0005z\u0000\u0000\u0134\u0135\u0005"+
		"o\u0000\u0000\u0135\u0137\u0005z\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u012b\u0001\u0000\u0000"+
		"\u0000\u013b\u0133\u0001\u0000\u0000\u0000\u013c\u0013\u0001\u0000\u0000"+
		"\u0000\u013d\u013e\u0005\u0013\u0000\u0000\u013e\u013f\u0003\u0016\u000b"+
		"\u0000\u013f\u0141\u0005\u0019\u0000\u0000\u0140\u0142\u0005H\u0000\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0003\u0018\f\u0000\u0144"+
		"\u0146\u0003\u001a\r\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000\u0000\u0147\u0149"+
		"\u0003\u001e\u000f\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148\u0149"+
		"\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005m\u0000\u0000\u014b\u0015\u0001\u0000\u0000\u0000\u014c\u0156\u0005"+
		"i\u0000\u0000\u014d\u0152\u0003r9\u0000\u014e\u014f\u0005n\u0000\u0000"+
		"\u014f\u0151\u0003r9\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0154"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0152"+
		"\u0001\u0000\u0000\u0000\u0155\u014c\u0001\u0000\u0000\u0000\u0155\u014d"+
		"\u0001\u0000\u0000\u0000\u0156\u0017\u0001\u0000\u0000\u0000\u0157\u015c"+
		"\u0003\u0012\t\u0000\u0158\u0159\u0005n\u0000\u0000\u0159\u015b\u0003"+
		"\u0012\t\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000"+
		"\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000"+
		"\u0000\u0000\u015d\u0019\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0005\u001a\u0000\u0000\u0160\u0165\u0003\u001c"+
		"\u000e\u0000\u0161\u0162\u0005n\u0000\u0000\u0162\u0164\u0003\u001c\u000e"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000"+
		"\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000"+
		"\u0000\u0166\u001b\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0168\u016d\u0005y\u0000\u0000\u0169\u016b\u0005?\u0000\u0000\u016a"+
		"\u0169\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0005y\u0000\u0000\u016d\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u001d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u001b\u0000\u0000\u0170\u0171"+
		"\u0003r9\u0000\u0171\u001f\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u0017"+
		"\u0000\u0000\u0173\u0175\u0003\u0016\u000b\u0000\u0174\u0176\u0003\u001a"+
		"\r\u0000\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000"+
		"\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0179\u0003\u001e\u000f"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0005m\u0000\u0000"+
		"\u017b!\u0001\u0000\u0000\u0000\u017c\u017d\u0005\u0018\u0000\u0000\u017d"+
		"\u0180\u0003r9\u0000\u017e\u017f\u0005\u0019\u0000\u0000\u017f\u0181\u0003"+
		"\u0018\f\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0183\u0005G\u0000"+
		"\u0000\u0183\u0185\u0003(\u0014\u0000\u0184\u0182\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0005m\u0000\u0000\u0187#\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0005\u0014\u0000\u0000\u0189\u018a\u0005\u0019\u0000\u0000\u018a\u018f"+
		"\u0005y\u0000\u0000\u018b\u018c\u0005p\u0000\u0000\u018c\u018d\u0003&"+
		"\u0013\u0000\u018d\u018e\u0005q\u0000\u0000\u018e\u0190\u0001\u0000\u0000"+
		"\u0000\u018f\u018b\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u001d\u0000"+
		"\u0000\u0192\u0193\u0005p\u0000\u0000\u0193\u0194\u0003(\u0014\u0000\u0194"+
		"\u0195\u0005q\u0000\u0000\u0195\u0196\u0005m\u0000\u0000\u0196%\u0001"+
		"\u0000\u0000\u0000\u0197\u019c\u0005y\u0000\u0000\u0198\u0199\u0005n\u0000"+
		"\u0000\u0199\u019b\u0005y\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000"+
		"\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\'\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019f\u01a4\u0003r9\u0000\u01a0\u01a1\u0005"+
		"n\u0000\u0000\u01a1\u01a3\u0003r9\u0000\u01a2\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5)\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u0015\u0000\u0000"+
		"\u01a8\u01a9\u0005y\u0000\u0000\u01a9\u01aa\u0005\u001c\u0000\u0000\u01aa"+
		"\u01ac\u0003,\u0016\u0000\u01ab\u01ad\u0003\u001e\u000f\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0005m\u0000\u0000\u01af+\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b5\u0003.\u0017\u0000\u01b1\u01b2\u0005n\u0000\u0000"+
		"\u01b2\u01b4\u0003.\u0017\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b6-\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005y\u0000\u0000\u01b9\u01ba\u0005"+
		"a\u0000\u0000\u01ba\u01bb\u0003r9\u0000\u01bb/\u0001\u0000\u0000\u0000"+
		"\u01bc\u01bd\u0005\u0016\u0000\u0000\u01bd\u01be\u0005\u001a\u0000\u0000"+
		"\u01be\u01c0\u0005y\u0000\u0000\u01bf\u01c1\u0003\u001e\u000f\u0000\u01c0"+
		"\u01bf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005m\u0000\u0000\u01c31\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0005\u0005\u0000\u0000\u01c5\u01c6\u0003"+
		"r9\u0000\u01c6\u01c7\u0005\u0006\u0000\u0000\u01c7\u01cf\u0003\f\u0006"+
		"\u0000\u01c8\u01c9\u0005\u0007\u0000\u0000\u01c9\u01ca\u0003r9\u0000\u01ca"+
		"\u01cb\u0005\u0006\u0000\u0000\u01cb\u01cc\u0003\f\u0006\u0000\u01cc\u01ce"+
		"\u0001\u0000\u0000\u0000\u01cd\u01c8\u0001\u0000\u0000\u0000\u01ce\u01d1"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d4\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005\b\u0000\u0000\u01d3\u01d5\u0003"+
		"\f\u0006\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7\u0005\u0003"+
		"\u0000\u0000\u01d7\u01d8\u0005\u0005\u0000\u0000\u01d8\u01d9\u0005m\u0000"+
		"\u0000\u01d93\u0001\u0000\u0000\u0000\u01da\u01dc\u0005\t\u0000\u0000"+
		"\u01db\u01dd\u0003r9\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd"+
		"\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e1"+
		"\u00036\u001b\u0000\u01df\u01e0\u0005\b\u0000\u0000\u01e0\u01e2\u0003"+
		"\f\u0006\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005\u0003"+
		"\u0000\u0000\u01e4\u01e5\u0005\t\u0000\u0000\u01e5\u01e6\u0005m\u0000"+
		"\u0000\u01e65\u0001\u0000\u0000\u0000\u01e7\u01e9\u00038\u001c\u0000\u01e8"+
		"\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e8\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb"+
		"7\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\n\u0000\u0000\u01ed\u01ee"+
		"\u0003r9\u0000\u01ee\u01ef\u0005\u0006\u0000\u0000\u01ef\u01f0\u0003\f"+
		"\u0006\u0000\u01f09\u0001\u0000\u0000\u0000\u01f1\u01f3\u0003\u0002\u0001"+
		"\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\u000b\u0000"+
		"\u0000\u01f5\u01f6\u0003\f\u0006\u0000\u01f6\u01f7\u0005\u0003\u0000\u0000"+
		"\u01f7\u01f9\u0005\u000b\u0000\u0000\u01f8\u01fa\u0003\u0002\u0001\u0000"+
		"\u01f9\u01f8\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005m\u0000\u0000\u01fc"+
		";\u0001\u0000\u0000\u0000\u01fd\u01ff\u0003\u0002\u0001\u0000\u01fe\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u0005\f\u0000\u0000\u0201\u0202\u0003"+
		"r9\u0000\u0202\u0203\u0005\u000b\u0000\u0000\u0203\u0204\u0003\f\u0006"+
		"\u0000\u0204\u0205\u0005\u0003\u0000\u0000\u0205\u0207\u0005\u000b\u0000"+
		"\u0000\u0206\u0208\u0003\u0002\u0001\u0000\u0207\u0206\u0001\u0000\u0000"+
		"\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0005m\u0000\u0000\u020a=\u0001\u0000\u0000\u0000\u020b"+
		"\u020d\u0003\u0002\u0001\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020c"+
		"\u020d\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0005\r\u0000\u0000\u020f\u0210\u0005y\u0000\u0000\u0210\u0212"+
		"\u0005,\u0000\u0000\u0211\u0213\u0005-\u0000\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0003r9\u0000\u0215\u0216\u0005o\u0000\u0000"+
		"\u0216\u0217\u0005o\u0000\u0000\u0217\u021a\u0003r9\u0000\u0218\u0219"+
		"\u0005.\u0000\u0000\u0219\u021b\u0003r9\u0000\u021a\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0005\u000b\u0000\u0000\u021d\u021e\u0003\f\u0006"+
		"\u0000\u021e\u021f\u0005\u0003\u0000\u0000\u021f\u0221\u0005\u000b\u0000"+
		"\u0000\u0220\u0222\u0003\u0002\u0001\u0000\u0221\u0220\u0001\u0000\u0000"+
		"\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0005m\u0000\u0000\u0224\u0236\u0001\u0000\u0000\u0000"+
		"\u0225\u0227\u0003\u0002\u0001\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0005\r\u0000\u0000\u0229\u022a\u0005y\u0000\u0000\u022a"+
		"\u022b\u0005,\u0000\u0000\u022b\u022c\u0003l6\u0000\u022c\u022d\u0005"+
		"\u000b\u0000\u0000\u022d\u022e\u0003\f\u0006\u0000\u022e\u022f\u0005\u0003"+
		"\u0000\u0000\u022f\u0231\u0005\u000b\u0000\u0000\u0230\u0232\u0003\u0002"+
		"\u0001\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0234\u0005m\u0000"+
		"\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u020c\u0001\u0000\u0000"+
		"\u0000\u0235\u0226\u0001\u0000\u0000\u0000\u0236?\u0001\u0000\u0000\u0000"+
		"\u0237\u0239\u0003\u0002\u0001\u0000\u0238\u0237\u0001\u0000\u0000\u0000"+
		"\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0005\u000e\u0000\u0000\u023b\u023e\u0005y\u0000\u0000\u023c"+
		"\u023d\u00050\u0000\u0000\u023d\u023f\u0005v\u0000\u0000\u023e\u023c\u0001"+
		"\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001"+
		"\u0000\u0000\u0000\u0240\u0241\u0005,\u0000\u0000\u0241\u0242\u0005/\u0000"+
		"\u0000\u0242\u0243\u0003r9\u0000\u0243\u0244\u0005\u000b\u0000\u0000\u0244"+
		"\u0245\u0003\f\u0006\u0000\u0245\u0246\u0005\u0003\u0000\u0000\u0246\u0248"+
		"\u0005\u000b\u0000\u0000\u0247\u0249\u0003\u0002\u0001\u0000\u0248\u0247"+
		"\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0005m\u0000\u0000\u024bA\u0001\u0000"+
		"\u0000\u0000\u024c\u024e\u0005\u000f\u0000\u0000\u024d\u024f\u0005y\u0000"+
		"\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u0251\u0005\n\u0000\u0000"+
		"\u0251\u0253\u0003r9\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005m\u0000\u0000\u0255C\u0001\u0000\u0000\u0000\u0256\u0258\u0005\u0010"+
		"\u0000\u0000\u0257\u0259\u0005y\u0000\u0000\u0258\u0257\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025c\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005\n\u0000\u0000\u025b\u025d\u0003r9\u0000\u025c"+
		"\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005m\u0000\u0000\u025fE\u0001"+
		"\u0000\u0000\u0000\u0260\u0262\u0005\u0011\u0000\u0000\u0261\u0263\u0003"+
		"r9\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265\u0005m\u0000\u0000"+
		"\u0265G\u0001\u0000\u0000\u0000\u0266\u0268\u0005\u0012\u0000\u0000\u0267"+
		"\u0269\u0007\u0002\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u0270\u0001\u0000\u0000\u0000\u026a"+
		"\u026d\u0005x\u0000\u0000\u026b\u026c\u0005n\u0000\u0000\u026c\u026e\u0003"+
		"(\u0014\u0000\u026d\u026b\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u0271\u0001\u0000\u0000\u0000\u026f\u0271\u0005y\u0000"+
		"\u0000\u0270\u026a\u0001\u0000\u0000\u0000\u0270\u026f\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005G\u0000\u0000\u0273\u0275\u0003J%\u0000\u0274"+
		"\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0005m\u0000\u0000\u0277I\u0001"+
		"\u0000\u0000\u0000\u0278\u027d\u0003L&\u0000\u0279\u027a\u0005n\u0000"+
		"\u0000\u027a\u027c\u0003L&\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027c"+
		"\u027f\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000\u0000\u027d"+
		"\u027e\u0001\u0000\u0000\u0000\u027eK\u0001\u0000\u0000\u0000\u027f\u027d"+
		"\u0001\u0000\u0000\u0000\u0280\u0281\u0007\u0003\u0000\u0000\u0281\u0282"+
		"\u0005a\u0000\u0000\u0282\u0283\u0003r9\u0000\u0283M\u0001\u0000\u0000"+
		"\u0000\u0284\u0285\u0005R\u0000\u0000\u0285\u0288\u0003r9\u0000\u0286"+
		"\u0287\u0005n\u0000\u0000\u0287\u0289\u0003r9\u0000\u0288\u0286\u0001"+
		"\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0001"+
		"\u0000\u0000\u0000\u028a\u028b\u0005m\u0000\u0000\u028bO\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0005A\u0000\u0000\u028d\u028e\u0005m\u0000\u0000\u028e"+
		"Q\u0001\u0000\u0000\u0000\u028f\u0291\u0003\u0002\u0001\u0000\u0290\u028f"+
		"\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0001\u0000\u0000\u0000\u0292\u0294\u0005\u0001\u0000\u0000\u0293\u0292"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0296"+
		"\u0001\u0000\u0000\u0000\u0295\u0297\u0003\u0006\u0003\u0000\u0296\u0295"+
		"\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u0002\u0000\u0000\u0299\u029b"+
		"\u0003\f\u0006\u0000\u029a\u029c\u0003T*\u0000\u029b\u029a\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029d\u0001\u0000"+
		"\u0000\u0000\u029d\u029f\u0005\u0003\u0000\u0000\u029e\u02a0\u0003\u0002"+
		"\u0001\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0005m\u0000"+
		"\u0000\u02a2S\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005\u0004\u0000\u0000"+
		"\u02a4\u02a5\u0003V+\u0000\u02a5U\u0001\u0000\u0000\u0000\u02a6\u02a8"+
		"\u0003X,\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000"+
		"\u0000\u0000\u02aaW\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005\n\u0000"+
		"\u0000\u02ac\u02ad\u0003Z-\u0000\u02ad\u02ae\u0005\u0006\u0000\u0000\u02ae"+
		"\u02af\u0003\f\u0006\u0000\u02afY\u0001\u0000\u0000\u0000\u02b0\u02b5"+
		"\u0003\\.\u0000\u02b1\u02b2\u0005D\u0000\u0000\u02b2\u02b4\u0003\\.\u0000"+
		"\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000"+
		"\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000"+
		"\u02b6[\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bc\u0005y\u0000\u0000\u02b9\u02ba\u00056\u0000\u0000\u02ba\u02bc\u0005"+
		"x\u0000\u0000\u02bb\u02b8\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bc]\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005;\u0000\u0000"+
		"\u02be\u02c0\u0007\u0004\u0000\u0000\u02bf\u02be\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005<\u0000\u0000\u02c2\u02c3\u0003`0\u0000\u02c3\u02c4"+
		"\u0005m\u0000\u0000\u02c4_\u0001\u0000\u0000\u0000\u02c5\u02ca\u0003b"+
		"1\u0000\u02c6\u02c7\u0005n\u0000\u0000\u02c7\u02c9\u0003b1\u0000\u02c8"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000\u02ca"+
		"\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cb"+
		"a\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cd\u02ce"+
		"\u0003\u0012\t\u0000\u02ce\u02cf\u0005a\u0000\u0000\u02cf\u02d0\u0003"+
		"d2\u0000\u02d0c\u0001\u0000\u0000\u0000\u02d1\u02d2\u0005y\u0000\u0000"+
		"\u02d2e\u0001\u0000\u0000\u0000\u02d3\u02d4\u0005S\u0000\u0000\u02d4\u02d9"+
		"\u0003\u0012\t\u0000\u02d5\u02d6\u0005p\u0000\u0000\u02d6\u02d7\u0003"+
		"(\u0014\u0000\u02d7\u02d8\u0005q\u0000\u0000\u02d8\u02da\u0001\u0000\u0000"+
		"\u0000\u02d9\u02d5\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02da\u02dd\u0001\u0000\u0000\u0000\u02db\u02dc\u0005\r\u0000\u0000"+
		"\u02dc\u02de\u0003l6\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u02e0"+
		"\u0005m\u0000\u0000\u02e0g\u0001\u0000\u0000\u0000\u02e1\u02e2\u0005T"+
		"\u0000\u0000\u02e2\u02e3\u0003\u0012\t\u0000\u02e3\u02e4\u0005m\u0000"+
		"\u0000\u02e4i\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005U\u0000\u0000\u02e6"+
		"\u02e7\u0003\u0012\t\u0000\u02e7\u02e8\u0005\u0019\u0000\u0000\u02e8\u02e9"+
		"\u0003\u0018\f\u0000\u02e9\u02ea\u0005m\u0000\u0000\u02eak\u0001\u0000"+
		"\u0000\u0000\u02eb\u02ec\u0005\u0013\u0000\u0000\u02ec\u02ee\u0003\u0016"+
		"\u000b\u0000\u02ed\u02ef\u0003\u001a\r\u0000\u02ee\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f1\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f2\u0003\u001e\u000f\u0000\u02f1\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2m\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f8\u0003p8\u0000\u02f4\u02f5\u0005n\u0000\u0000\u02f5\u02f7"+
		"\u0003p8\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000"+
		"\u0000\u0000\u02f9o\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0005y\u0000\u0000\u02fc\u02fd\u0003\n\u0005\u0000"+
		"\u02fdq\u0001\u0000\u0000\u0000\u02fe\u02ff\u00069\uffff\uffff\u0000\u02ff"+
		"\u0315\u0003|>\u0000\u0300\u0315\u0003\u0012\t\u0000\u0301\u0315\u0003"+
		"z=\u0000\u0302\u0303\u0005p\u0000\u0000\u0303\u0304\u0003r9\u0000\u0304"+
		"\u0305\u0005q\u0000\u0000\u0305\u0315\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0005B\u0000\u0000\u0307\u0315\u0003r9\u0004\u0308\u030a\u0005\t\u0000"+
		"\u0000\u0309\u030b\u0003r9\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030a"+
		"\u030b\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"\u030f\u0003t:\u0000\u030d\u030e\u0005\b\u0000\u0000\u030e\u0310\u0003"+
		"r9\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000"+
		"\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0005\u0003\u0000"+
		"\u0000\u0312\u0315\u0001\u0000\u0000\u0000\u0313\u0315\u0003x<\u0000\u0314"+
		"\u02fe\u0001\u0000\u0000\u0000\u0314\u0300\u0001\u0000\u0000\u0000\u0314"+
		"\u0301\u0001\u0000\u0000\u0000\u0314\u0302\u0001\u0000\u0000\u0000\u0314"+
		"\u0306\u0001\u0000\u0000\u0000\u0314\u0308\u0001\u0000\u0000\u0000\u0314"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u032d\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\n\t\u0000\u0000\u0317\u0318\u0007\u0005\u0000\u0000\u0318\u032c"+
		"\u0003r9\n\u0319\u031a\n\b\u0000\u0000\u031a\u031b\u0007\u0006\u0000\u0000"+
		"\u031b\u032c\u0003r9\t\u031c\u031d\n\u0007\u0000\u0000\u031d\u031e\u0005"+
		"`\u0000\u0000\u031e\u032c\u0003r9\b\u031f\u0320\n\u0006\u0000\u0000\u0320"+
		"\u0321\u0007\u0007\u0000\u0000\u0321\u032c\u0003r9\u0007\u0322\u0323\n"+
		"\u0005\u0000\u0000\u0323\u0324\u0007\b\u0000\u0000\u0324\u032c\u0003r"+
		"9\u0006\u0325\u0326\n\u0003\u0000\u0000\u0326\u0328\u0005@\u0000\u0000"+
		"\u0327\u0329\u0005B\u0000\u0000\u0328\u0327\u0001\u0000\u0000\u0000\u0328"+
		"\u0329\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000\u032a"+
		"\u032c\u0005A\u0000\u0000\u032b\u0316\u0001\u0000\u0000\u0000\u032b\u0319"+
		"\u0001\u0000\u0000\u0000\u032b\u031c\u0001\u0000\u0000\u0000\u032b\u031f"+
		"\u0001\u0000\u0000\u0000\u032b\u0322\u0001\u0000\u0000\u0000\u032b\u0325"+
		"\u0001\u0000\u0000\u0000\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032es\u0001"+
		"\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u0330\u0332\u0003"+
		"v;\u0000\u0331\u0330\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000"+
		"\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000"+
		"\u0000\u0334u\u0001\u0000\u0000\u0000\u0335\u0336\u0005\n\u0000\u0000"+
		"\u0336\u0337\u0003r9\u0000\u0337\u0338\u0005\u0006\u0000\u0000\u0338\u0339"+
		"\u0003r9\u0000\u0339w\u0001\u0000\u0000\u0000\u033a\u033b\u0005/\u0000"+
		"\u0000\u033b\u033c\u0005r\u0000\u0000\u033c\u033d\u0003(\u0014\u0000\u033d"+
		"\u033e\u0005s\u0000\u0000\u033e\u0345\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0003\u0012\t\u0000\u0340\u0341\u0005r\u0000\u0000\u0341\u0342\u0003"+
		"r9\u0000\u0342\u0343\u0005s\u0000\u0000\u0343\u0345\u0001\u0000\u0000"+
		"\u0000\u0344\u033a\u0001\u0000\u0000\u0000\u0344\u033f\u0001\u0000\u0000"+
		"\u0000\u0345y\u0001\u0000\u0000\u0000\u0346\u0347\u0005y\u0000\u0000\u0347"+
		"\u034a\u0005p\u0000\u0000\u0348\u034b\u0003(\u0014\u0000\u0349\u034b\u0005"+
		"i\u0000\u0000\u034a\u0348\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000"+
		"\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000"+
		"\u0000\u0000\u034c\u034d\u0005q\u0000\u0000\u034d{\u0001\u0000\u0000\u0000"+
		"\u034e\u034f\u0007\t\u0000\u0000\u034f}\u0001\u0000\u0000\u0000e\u007f"+
		"\u0082\u0087\u008b\u008e\u009a\u009e\u00a3\u00a9\u00b3\u00bf\u00c2\u00cd"+
		"\u00d0\u00d7\u00da\u00e2\u00e8\u00f1\u00f7\u00f9\u00ff\u0103\u0109\u0124"+
		"\u0130\u0138\u013b\u0141\u0145\u0148\u0152\u0155\u015c\u0165\u016a\u016d"+
		"\u0175\u0178\u0180\u0184\u018f\u019c\u01a4\u01ac\u01b5\u01c0\u01cf\u01d4"+
		"\u01dc\u01e1\u01ea\u01f2\u01f9\u01fe\u0207\u020c\u0212\u021a\u0221\u0226"+
		"\u0231\u0235\u0238\u023e\u0248\u024e\u0252\u0258\u025c\u0262\u0268\u026d"+
		"\u0270\u0274\u027d\u0288\u0290\u0293\u0296\u029b\u029f\u02a9\u02b5\u02bb"+
		"\u02bf\u02ca\u02d9\u02dd\u02ee\u02f1\u02f8\u030a\u030f\u0314\u0328\u032b"+
		"\u032d\u0333\u0344\u034a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}