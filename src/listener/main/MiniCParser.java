// Generated from /Users/goseonggwan/Downloads/Repo/comp/miniC2python/src/MiniC.g4 by ANTLR 4.7.2
 
package listener.main;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, VOID=21, INT=22, DOUBLE=23, FLOAT=24, CHAR=25, 
		STRUCT=26, WHILE=27, IF=28, ELSE=29, RETURN=30, OR=31, AND=32, LE=33, 
		GE=34, EQ=35, NE=36, IDENT=37, STRING=38, FIDENT=39, LITERAL=40, DecimalConstant=41, 
		OctalConstant=42, HexadecimalConstant=43, WS=44;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_var_decl = 2, RULE_type_spec = 3, 
		RULE_fun_decl = 4, RULE_params = 5, RULE_param = 6, RULE_stmt = 7, RULE_expr_stmt = 8, 
		RULE_while_stmt = 9, RULE_compound_stmt = 10, RULE_local_decl = 11, RULE_if_stmt = 12, 
		RULE_return_stmt = 13, RULE_expr = 14, RULE_args = 15, RULE_struct_decl = 16, 
		RULE_struct_stmt = 17, RULE_struct_attribute = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "var_decl", "type_spec", "fun_decl", "params", "param", 
			"stmt", "expr_stmt", "while_stmt", "compound_stmt", "local_decl", "if_stmt", 
			"return_stmt", "expr", "args", "struct_decl", "struct_stmt", "struct_attribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'='", "'['", "']'", "'{'", "','", "'}'", "'('", "')'", 
			"'.'", "'-'", "'+'", "'--'", "'++'", "'*'", "'/'", "'%'", "'<'", "'>'", 
			"'!'", "'void'", "'int'", "'double'", "'float'", "'char'", "'struct'", 
			"'while'", "'if'", "'else'", "'return'", "'or'", "'and'", "'<='", "'>='", 
			"'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VOID", "INT", 
			"DOUBLE", "FLOAT", "CHAR", "STRUCT", "WHILE", "IF", "ELSE", "RETURN", 
			"OR", "AND", "LE", "GE", "EQ", "NE", "IDENT", "STRING", "FIDENT", "LITERAL", 
			"DecimalConstant", "OctalConstant", "HexadecimalConstant", "WS"
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
	public String getGrammarFileName() { return "MiniC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				decl();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR) | (1L << STRUCT) | (1L << IDENT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Fun_declContext fun_decl() {
			return getRuleContext(Fun_declContext.class,0);
		}
		public Struct_declContext struct_decl() {
			return getRuleContext(Struct_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				var_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				fun_decl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				struct_decl();
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

	public static class Var_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniCParser.IDENT, i);
		}
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				type_spec();
				setState(49);
				match(IDENT);
				setState(50);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				type_spec();
				setState(53);
				match(IDENT);
				setState(54);
				match(T__1);
				setState(55);
				match(LITERAL);
				setState(56);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				type_spec();
				setState(59);
				match(IDENT);
				setState(60);
				match(T__2);
				setState(61);
				match(LITERAL);
				setState(62);
				match(T__3);
				setState(63);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				type_spec();
				setState(66);
				match(IDENT);
				setState(67);
				match(T__2);
				setState(68);
				match(LITERAL);
				setState(69);
				match(T__3);
				setState(70);
				match(T__1);
				setState(71);
				match(T__4);
				setState(72);
				expr(0);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(73);
					match(T__5);
					setState(74);
					expr(0);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(T__6);
				setState(81);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(IDENT);
				setState(84);
				match(IDENT);
				setState(85);
				match(T__0);
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

	public static class Type_specContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public TerminalNode INT() { return getToken(MiniCParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MiniCParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(MiniCParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(MiniCParser.CHAR, 0); }
		public Type_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterType_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitType_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitType_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_specContext type_spec() throws RecognitionException {
		Type_specContext _localctx = new Type_specContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0)) ) {
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

	public static class Fun_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Fun_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterFun_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitFun_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitFun_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_declContext fun_decl() throws RecognitionException {
		Fun_declContext _localctx = new Fun_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fun_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			type_spec();
			setState(91);
			match(IDENT);
			setState(92);
			match(T__7);
			setState(93);
			params();
			setState(94);
			match(T__8);
			setState(95);
			compound_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode VOID() { return getToken(MiniCParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				param();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(98);
					match(T__5);
					setState(99);
					param();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(VOID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class ParamContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				type_spec();
				setState(110);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				type_spec();
				setState(113);
				match(IDENT);
				setState(114);
				match(T__2);
				setState(115);
				match(T__3);
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

	public static class StmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stmt);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__19:
			case IDENT:
			case STRING:
			case FIDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				expr_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				compound_stmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				while_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				return_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr_stmt);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				expr(0);
				setState(127);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(IDENT);
				setState(130);
				match(T__9);
				setState(131);
				expr(0);
				setState(132);
				match(T__0);
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniCParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHILE);
			setState(137);
			match(T__7);
			setState(138);
			expr(0);
			setState(139);
			match(T__8);
			setState(140);
			stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_stmtContext extends ParserRuleContext {
		public List<Local_declContext> local_decl() {
			return getRuleContexts(Local_declContext.class);
		}
		public Local_declContext local_decl(int i) {
			return getRuleContext(Local_declContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compound_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__4);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					local_decl();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__19) | (1L << WHILE) | (1L << IF) | (1L << RETURN) | (1L << IDENT) | (1L << STRING) | (1L << FIDENT) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(149);
				stmt();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Local_declContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniCParser.IDENT, i);
		}
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STRING() { return getToken(MiniCParser.STRING, 0); }
		public Local_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterLocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitLocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitLocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_declContext local_decl() throws RecognitionException {
		Local_declContext _localctx = new Local_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_local_decl);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				type_spec();
				setState(158);
				match(IDENT);
				setState(159);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				type_spec();
				setState(162);
				match(IDENT);
				setState(163);
				match(T__1);
				setState(164);
				match(LITERAL);
				setState(165);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				type_spec();
				setState(168);
				match(IDENT);
				setState(169);
				match(T__2);
				setState(170);
				match(LITERAL);
				setState(171);
				match(T__3);
				setState(172);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				type_spec();
				setState(175);
				match(IDENT);
				setState(176);
				match(T__2);
				setState(177);
				match(LITERAL);
				setState(178);
				match(T__3);
				setState(179);
				match(T__1);
				setState(180);
				match(T__4);
				setState(181);
				expr(0);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(182);
					match(T__5);
					setState(183);
					expr(0);
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__6);
				setState(190);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				type_spec();
				setState(193);
				match(IDENT);
				setState(194);
				match(T__2);
				setState(195);
				match(LITERAL);
				setState(196);
				match(T__3);
				setState(197);
				match(T__1);
				setState(198);
				match(STRING);
				setState(199);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(IDENT);
				setState(202);
				match(IDENT);
				setState(203);
				match(T__0);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniCParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniCParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_stmt);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IF);
				setState(207);
				match(T__7);
				setState(208);
				expr(0);
				setState(209);
				match(T__8);
				setState(210);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(IF);
				setState(213);
				match(T__7);
				setState(214);
				expr(0);
				setState(215);
				match(T__8);
				setState(216);
				stmt();
				setState(217);
				match(ELSE);
				setState(218);
				stmt();
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MiniCParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitReturn_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_stmt);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(RETURN);
				setState(223);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(RETURN);
				setState(225);
				expr(0);
				setState(226);
				match(T__0);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MiniCParser.STRING, 0); }
		public TerminalNode FIDENT() { return getToken(MiniCParser.FIDENT, 0); }
		public TerminalNode EQ() { return getToken(MiniCParser.EQ, 0); }
		public TerminalNode NE() { return getToken(MiniCParser.NE, 0); }
		public TerminalNode LE() { return getToken(MiniCParser.LE, 0); }
		public TerminalNode GE() { return getToken(MiniCParser.GE, 0); }
		public TerminalNode AND() { return getToken(MiniCParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniCParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(231);
				match(LITERAL);
				}
				break;
			case 2:
				{
				setState(232);
				match(T__7);
				setState(233);
				expr(0);
				setState(234);
				match(T__8);
				}
				break;
			case 3:
				{
				setState(236);
				match(IDENT);
				}
				break;
			case 4:
				{
				setState(237);
				match(IDENT);
				setState(238);
				match(T__2);
				setState(239);
				expr(0);
				setState(240);
				match(T__3);
				}
				break;
			case 5:
				{
				setState(242);
				match(IDENT);
				setState(243);
				match(T__7);
				setState(244);
				args();
				setState(245);
				match(T__8);
				}
				break;
			case 6:
				{
				setState(247);
				match(STRING);
				}
				break;
			case 7:
				{
				setState(248);
				match(FIDENT);
				}
				break;
			case 8:
				{
				setState(249);
				match(T__10);
				setState(250);
				expr(20);
				}
				break;
			case 9:
				{
				setState(251);
				match(T__11);
				setState(252);
				expr(19);
				}
				break;
			case 10:
				{
				setState(253);
				match(T__12);
				setState(254);
				expr(18);
				}
				break;
			case 11:
				{
				setState(255);
				match(T__13);
				setState(256);
				expr(17);
				}
				break;
			case 12:
				{
				setState(257);
				match(T__19);
				setState(258);
				expr(5);
				}
				break;
			case 13:
				{
				setState(259);
				match(IDENT);
				setState(260);
				match(T__1);
				setState(261);
				expr(2);
				}
				break;
			case 14:
				{
				setState(262);
				match(IDENT);
				setState(263);
				match(T__2);
				setState(264);
				expr(0);
				setState(265);
				match(T__3);
				setState(266);
				match(T__1);
				setState(267);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(271);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(272);
						match(T__14);
						setState(273);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(274);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(275);
						match(T__15);
						setState(276);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(277);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(278);
						match(T__16);
						setState(279);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(281);
						match(T__11);
						setState(282);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(284);
						match(T__10);
						setState(285);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(287);
						match(EQ);
						setState(288);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(289);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(290);
						match(NE);
						setState(291);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(292);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(293);
						match(LE);
						setState(294);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(295);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(296);
						match(T__17);
						setState(297);
						expr(9);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(298);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(299);
						match(GE);
						setState(300);
						expr(8);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(301);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(302);
						match(T__18);
						setState(303);
						expr(7);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(304);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(305);
						match(AND);
						setState(306);
						expr(5);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						match(OR);
						setState(309);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__19:
			case IDENT:
			case STRING:
			case FIDENT:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expr(0);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(316);
					match(T__5);
					setState(317);
					expr(0);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Struct_declContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(MiniCParser.STRUCT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MiniCParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MiniCParser.IDENT, i);
		}
		public Struct_stmtContext struct_stmt() {
			return getRuleContext(Struct_stmtContext.class,0);
		}
		public Struct_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStruct_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStruct_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitStruct_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declContext struct_decl() throws RecognitionException {
		Struct_declContext _localctx = new Struct_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_struct_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(STRUCT);
			setState(327);
			match(IDENT);
			setState(328);
			struct_stmt();
			setState(329);
			match(IDENT);
			setState(330);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_stmtContext extends ParserRuleContext {
		public List<Struct_attributeContext> struct_attribute() {
			return getRuleContexts(Struct_attributeContext.class);
		}
		public Struct_attributeContext struct_attribute(int i) {
			return getRuleContext(Struct_attributeContext.class,i);
		}
		public Struct_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStruct_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStruct_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitStruct_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_stmtContext struct_stmt() throws RecognitionException {
		Struct_stmtContext _localctx = new Struct_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_struct_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__4);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333);
				struct_attribute();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << CHAR))) != 0) );
			setState(338);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_attributeContext extends ParserRuleContext {
		public Type_specContext type_spec() {
			return getRuleContext(Type_specContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniCParser.IDENT, 0); }
		public TerminalNode LITERAL() { return getToken(MiniCParser.LITERAL, 0); }
		public Struct_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).enterStruct_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniCListener ) ((MiniCListener)listener).exitStruct_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniCVisitor ) return ((MiniCVisitor<? extends T>)visitor).visitStruct_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_attributeContext struct_attribute() throws RecognitionException {
		Struct_attributeContext _localctx = new Struct_attributeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_struct_attribute);
		try {
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				type_spec();
				setState(341);
				match(IDENT);
				setState(342);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				type_spec();
				setState(345);
				match(IDENT);
				setState(346);
				match(T__2);
				setState(347);
				match(LITERAL);
				setState(348);
				match(T__3);
				setState(349);
				match(T__0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0164\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\5\3\61\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\7\7g\n\7\f\7\16\7j\13\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\bx\n\b\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0089\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f\u0093"+
		"\n\f\f\f\16\f\u0096\13\f\3\f\7\f\u0099\n\f\f\f\16\f\u009c\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16\r\u00be\13"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00df\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e7\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0110\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0139\n\20"+
		"\f\20\16\20\u013c\13\20\3\21\3\21\3\21\7\21\u0141\n\21\f\21\16\21\u0144"+
		"\13\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\6"+
		"\23\u0151\n\23\r\23\16\23\u0152\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0162\n\24\3\24\2\3\36\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\3\3\2\27\33\2\u0189\2)\3\2\2\2\4\60\3"+
		"\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fm\3\2\2\2\16w\3\2\2\2\20~\3"+
		"\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2\26\u0090\3\2\2\2\30\u00ce\3\2"+
		"\2\2\32\u00de\3\2\2\2\34\u00e6\3\2\2\2\36\u010f\3\2\2\2 \u0146\3\2\2\2"+
		"\"\u0148\3\2\2\2$\u014e\3\2\2\2&\u0161\3\2\2\2(*\5\4\3\2)(\3\2\2\2*+\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\61\5\6\4\2.\61\5\n\6\2/\61\5\""+
		"\22\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\5\3\2\2\2\62\63\5\b\5\2\63"+
		"\64\7\'\2\2\64\65\7\3\2\2\65Y\3\2\2\2\66\67\5\b\5\2\678\7\'\2\289\7\4"+
		"\2\29:\7*\2\2:;\7\3\2\2;Y\3\2\2\2<=\5\b\5\2=>\7\'\2\2>?\7\5\2\2?@\7*\2"+
		"\2@A\7\6\2\2AB\7\3\2\2BY\3\2\2\2CD\5\b\5\2DE\7\'\2\2EF\7\5\2\2FG\7*\2"+
		"\2GH\7\6\2\2HI\7\4\2\2IJ\7\7\2\2JO\5\36\20\2KL\7\b\2\2LN\5\36\20\2MK\3"+
		"\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\t\2\2ST\7"+
		"\3\2\2TY\3\2\2\2UV\7\'\2\2VW\7\'\2\2WY\7\3\2\2X\62\3\2\2\2X\66\3\2\2\2"+
		"X<\3\2\2\2XC\3\2\2\2XU\3\2\2\2Y\7\3\2\2\2Z[\t\2\2\2[\t\3\2\2\2\\]\5\b"+
		"\5\2]^\7\'\2\2^_\7\n\2\2_`\5\f\7\2`a\7\13\2\2ab\5\26\f\2b\13\3\2\2\2c"+
		"h\5\16\b\2de\7\b\2\2eg\5\16\b\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2in\3\2\2\2jh\3\2\2\2kn\7\27\2\2ln\3\2\2\2mc\3\2\2\2mk\3\2\2\2ml\3\2"+
		"\2\2n\r\3\2\2\2op\5\b\5\2pq\7\'\2\2qx\3\2\2\2rs\5\b\5\2st\7\'\2\2tu\7"+
		"\5\2\2uv\7\6\2\2vx\3\2\2\2wo\3\2\2\2wr\3\2\2\2x\17\3\2\2\2y\177\5\22\n"+
		"\2z\177\5\26\f\2{\177\5\32\16\2|\177\5\24\13\2}\177\5\34\17\2~y\3\2\2"+
		"\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\21\3\2\2\2\u0080\u0081"+
		"\5\36\20\2\u0081\u0082\7\3\2\2\u0082\u0089\3\2\2\2\u0083\u0084\7\'\2\2"+
		"\u0084\u0085\7\f\2\2\u0085\u0086\5\36\20\2\u0086\u0087\7\3\2\2\u0087\u0089"+
		"\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0083\3\2\2\2\u0089\23\3\2\2\2\u008a"+
		"\u008b\7\35\2\2\u008b\u008c\7\n\2\2\u008c\u008d\5\36\20\2\u008d\u008e"+
		"\7\13\2\2\u008e\u008f\5\20\t\2\u008f\25\3\2\2\2\u0090\u0094\7\7\2\2\u0091"+
		"\u0093\5\30\r\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u009a\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\5\20\t\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\7\t\2\2\u009e\27\3\2\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7\'\2"+
		"\2\u00a1\u00a2\7\3\2\2\u00a2\u00cf\3\2\2\2\u00a3\u00a4\5\b\5\2\u00a4\u00a5"+
		"\7\'\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\7*\2\2\u00a7\u00a8\7\3\2\2\u00a8"+
		"\u00cf\3\2\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ab\7\'\2\2\u00ab\u00ac\7\5"+
		"\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\7\3\2\2\u00af"+
		"\u00cf\3\2\2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7\'\2\2\u00b2\u00b3\7\5"+
		"\2\2\u00b3\u00b4\7*\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\7\4\2\2\u00b6"+
		"\u00b7\7\7\2\2\u00b7\u00bc\5\36\20\2\u00b8\u00b9\7\b\2\2\u00b9\u00bb\5"+
		"\36\20\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\t"+
		"\2\2\u00c0\u00c1\7\3\2\2\u00c1\u00cf\3\2\2\2\u00c2\u00c3\5\b\5\2\u00c3"+
		"\u00c4\7\'\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\7*\2\2\u00c6\u00c7\7\6"+
		"\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\7\3\2\2\u00ca"+
		"\u00cf\3\2\2\2\u00cb\u00cc\7\'\2\2\u00cc\u00cd\7\'\2\2\u00cd\u00cf\7\3"+
		"\2\2\u00ce\u009f\3\2\2\2\u00ce\u00a3\3\2\2\2\u00ce\u00a9\3\2\2\2\u00ce"+
		"\u00b0\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\31\3\2\2"+
		"\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\5\36\20\2\u00d3"+
		"\u00d4\7\13\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00df\3\2\2\2\u00d6\u00d7\7"+
		"\36\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7\13\2\2"+
		"\u00da\u00db\5\20\t\2\u00db\u00dc\7\37\2\2\u00dc\u00dd\5\20\t\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00d0\3\2\2\2\u00de\u00d6\3\2\2\2\u00df\33\3\2\2"+
		"\2\u00e0\u00e1\7 \2\2\u00e1\u00e7\7\3\2\2\u00e2\u00e3\7 \2\2\u00e3\u00e4"+
		"\5\36\20\2\u00e4\u00e5\7\3\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2"+
		"\u00e6\u00e2\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00e9\b\20\1\2\u00e9\u0110"+
		"\7*\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\13\2\2"+
		"\u00ed\u0110\3\2\2\2\u00ee\u0110\7\'\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f1"+
		"\7\5\2\2\u00f1\u00f2\5\36\20\2\u00f2\u00f3\7\6\2\2\u00f3\u0110\3\2\2\2"+
		"\u00f4\u00f5\7\'\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f7\5 \21\2\u00f7\u00f8"+
		"\7\13\2\2\u00f8\u0110\3\2\2\2\u00f9\u0110\7(\2\2\u00fa\u0110\7)\2\2\u00fb"+
		"\u00fc\7\r\2\2\u00fc\u0110\5\36\20\26\u00fd\u00fe\7\16\2\2\u00fe\u0110"+
		"\5\36\20\25\u00ff\u0100\7\17\2\2\u0100\u0110\5\36\20\24\u0101\u0102\7"+
		"\20\2\2\u0102\u0110\5\36\20\23\u0103\u0104\7\26\2\2\u0104\u0110\5\36\20"+
		"\7\u0105\u0106\7\'\2\2\u0106\u0107\7\4\2\2\u0107\u0110\5\36\20\4\u0108"+
		"\u0109\7\'\2\2\u0109\u010a\7\5\2\2\u010a\u010b\5\36\20\2\u010b\u010c\7"+
		"\6\2\2\u010c\u010d\7\4\2\2\u010d\u010e\5\36\20\3\u010e\u0110\3\2\2\2\u010f"+
		"\u00e8\3\2\2\2\u010f\u00ea\3\2\2\2\u010f\u00ee\3\2\2\2\u010f\u00ef\3\2"+
		"\2\2\u010f\u00f4\3\2\2\2\u010f\u00f9\3\2\2\2\u010f\u00fa\3\2\2\2\u010f"+
		"\u00fb\3\2\2\2\u010f\u00fd\3\2\2\2\u010f\u00ff\3\2\2\2\u010f\u0101\3\2"+
		"\2\2\u010f\u0103\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u0108\3\2\2\2\u0110"+
		"\u013a\3\2\2\2\u0111\u0112\f\22\2\2\u0112\u0113\7\21\2\2\u0113\u0139\5"+
		"\36\20\23\u0114\u0115\f\21\2\2\u0115\u0116\7\22\2\2\u0116\u0139\5\36\20"+
		"\22\u0117\u0118\f\20\2\2\u0118\u0119\7\23\2\2\u0119\u0139\5\36\20\21\u011a"+
		"\u011b\f\17\2\2\u011b\u011c\7\16\2\2\u011c\u0139\5\36\20\20\u011d\u011e"+
		"\f\16\2\2\u011e\u011f\7\r\2\2\u011f\u0139\5\36\20\17\u0120\u0121\f\r\2"+
		"\2\u0121\u0122\7%\2\2\u0122\u0139\5\36\20\16\u0123\u0124\f\f\2\2\u0124"+
		"\u0125\7&\2\2\u0125\u0139\5\36\20\r\u0126\u0127\f\13\2\2\u0127\u0128\7"+
		"#\2\2\u0128\u0139\5\36\20\f\u0129\u012a\f\n\2\2\u012a\u012b\7\24\2\2\u012b"+
		"\u0139\5\36\20\13\u012c\u012d\f\t\2\2\u012d\u012e\7$\2\2\u012e\u0139\5"+
		"\36\20\n\u012f\u0130\f\b\2\2\u0130\u0131\7\25\2\2\u0131\u0139\5\36\20"+
		"\t\u0132\u0133\f\6\2\2\u0133\u0134\7\"\2\2\u0134\u0139\5\36\20\7\u0135"+
		"\u0136\f\5\2\2\u0136\u0137\7!\2\2\u0137\u0139\5\36\20\6\u0138\u0111\3"+
		"\2\2\2\u0138\u0114\3\2\2\2\u0138\u0117\3\2\2\2\u0138\u011a\3\2\2\2\u0138"+
		"\u011d\3\2\2\2\u0138\u0120\3\2\2\2\u0138\u0123\3\2\2\2\u0138\u0126\3\2"+
		"\2\2\u0138\u0129\3\2\2\2\u0138\u012c\3\2\2\2\u0138\u012f\3\2\2\2\u0138"+
		"\u0132\3\2\2\2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\37\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0142"+
		"\5\36\20\2\u013e\u013f\7\b\2\2\u013f\u0141\5\36\20\2\u0140\u013e\3\2\2"+
		"\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0147"+
		"\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u013d\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147!\3\2\2\2\u0148\u0149\7\34\2\2\u0149\u014a\7\'\2\2"+
		"\u014a\u014b\5$\23\2\u014b\u014c\7\'\2\2\u014c\u014d\7\3\2\2\u014d#\3"+
		"\2\2\2\u014e\u0150\7\7\2\2\u014f\u0151\5&\24\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\7\t\2\2\u0155%\3\2\2\2\u0156\u0157\5\b\5\2\u0157\u0158"+
		"\7\'\2\2\u0158\u0159\7\3\2\2\u0159\u0162\3\2\2\2\u015a\u015b\5\b\5\2\u015b"+
		"\u015c\7\'\2\2\u015c\u015d\7\5\2\2\u015d\u015e\7*\2\2\u015e\u015f\7\6"+
		"\2\2\u015f\u0160\7\3\2\2\u0160\u0162\3\2\2\2\u0161\u0156\3\2\2\2\u0161"+
		"\u015a\3\2\2\2\u0162\'\3\2\2\2\30+\60OXhmw~\u0088\u0094\u009a\u00bc\u00ce"+
		"\u00de\u00e6\u010f\u0138\u013a\u0142\u0146\u0152\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}