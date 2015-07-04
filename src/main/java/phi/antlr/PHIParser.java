// Generated from C:\Users\bubble-07\My Documents\GitHub\Phi\src\main\antlr4\PHI.g4 by ANTLR 4.2.2

    package phi.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PHIParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACKET=3, RBRACKET=4, LSQBRACKET=5, RSQBRACKET=6, 
		COMMA=7, DOT=8, DEF=9, SUBS=10, SUPS=11, TYPE=12, NAMESPACE=13, LAMBDA=14, 
		LET=15, STRING_CONST=16, INT_CONST=17, FLOAT_CONST=18, LC=19, NC=20, NL=21, 
		ID=22, SPACE=23, INDENT=24, DEDENT=25;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "'.'", "DEF", 
		"SUBS", "SUPS", "'type'", "'namespace'", "LAMBDA", "'let'", "STRING_CONST", 
		"INT_CONST", "FLOAT_CONST", "LC", "NC", "NL", "ID", "SPACE", "INDENT", 
		"DEDENT"
	};
	public static final int
		RULE_def = 0, RULE_subs = 1, RULE_sups = 2, RULE_type = 3, RULE_namespace = 4, 
		RULE_lambda = 5, RULE_let = 6, RULE_reservedword = 7, RULE_identifier = 8, 
		RULE_intconst = 9, RULE_floatconst = 10, RULE_stringconst = 11, RULE_aspace = 12, 
		RULE_optspace = 13, RULE_sexpr = 14, RULE_alistitems = 15, RULE_apaddeditems = 16, 
		RULE_listitems = 17, RULE_listitem = 18, RULE_funapp = 19, RULE_funitems = 20, 
		RULE_item = 21, RULE_dotitem = 22, RULE_dotapp = 23, RULE_blockitems = 24, 
		RULE_blockapp = 25, RULE_blocklines = 26, RULE_blockline = 27, RULE_start = 28;
	public static final String[] ruleNames = {
		"def", "subs", "sups", "type", "namespace", "lambda", "let", "reservedword", 
		"identifier", "intconst", "floatconst", "stringconst", "aspace", "optspace", 
		"sexpr", "alistitems", "apaddeditems", "listitems", "listitem", "funapp", 
		"funitems", "item", "dotitem", "dotapp", "blockitems", "blockapp", "blocklines", 
		"blockline", "start"
	};

	@Override
	public String getGrammarFileName() { return "PHI.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PHIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PHIParser.DEF, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(DEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubsContext extends ParserRuleContext {
		public TerminalNode SUBS() { return getToken(PHIParser.SUBS, 0); }
		public SubsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterSubs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitSubs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitSubs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsContext subs() throws RecognitionException {
		SubsContext _localctx = new SubsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_subs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(SUBS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SupsContext extends ParserRuleContext {
		public TerminalNode SUPS() { return getToken(PHIParser.SUPS, 0); }
		public SupsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sups; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterSups(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitSups(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitSups(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupsContext sups() throws RecognitionException {
		SupsContext _localctx = new SupsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sups);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(SUPS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PHIParser.TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(PHIParser.NAMESPACE, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(NAMESPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PHIParser.LAMBDA, 0); }
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(LAMBDA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(PHIParser.LET, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(LET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedwordContext extends ParserRuleContext {
		public SubsContext subs() {
			return getRuleContext(SubsContext.class,0);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public SupsContext sups() {
			return getRuleContext(SupsContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ReservedwordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterReservedword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitReservedword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitReservedword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedwordContext reservedword() throws RecognitionException {
		ReservedwordContext _localctx = new ReservedwordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_reservedword);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); def();
				}
				break;
			case SUBS:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); subs();
				}
				break;
			case SUPS:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); sups();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); type();
				}
				break;
			case NAMESPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(76); namespace();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 6);
				{
				setState(77); lambda();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 7);
				{
				setState(78); let();
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

	public static class IdentifierContext extends ParserRuleContext {
		public ReservedwordContext reservedword() {
			return getRuleContext(ReservedwordContext.class,0);
		}
		public TerminalNode ID() { return getToken(PHIParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(ID);
				}
				break;
			case DEF:
			case SUBS:
			case SUPS:
			case TYPE:
			case NAMESPACE:
			case LAMBDA:
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); reservedword();
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

	public static class IntconstContext extends ParserRuleContext {
		public TerminalNode INT_CONST() { return getToken(PHIParser.INT_CONST, 0); }
		public IntconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterIntconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitIntconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitIntconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntconstContext intconst() throws RecognitionException {
		IntconstContext _localctx = new IntconstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_intconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(INT_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatconstContext extends ParserRuleContext {
		public TerminalNode FLOAT_CONST() { return getToken(PHIParser.FLOAT_CONST, 0); }
		public FloatconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterFloatconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitFloatconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitFloatconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatconstContext floatconst() throws RecognitionException {
		FloatconstContext _localctx = new FloatconstContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_floatconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(FLOAT_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringconstContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(PHIParser.STRING_CONST, 0); }
		public StringconstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringconst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterStringconst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitStringconst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitStringconst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringconstContext stringconst() throws RecognitionException {
		StringconstContext _localctx = new StringconstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stringconst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(STRING_CONST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AspaceContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(PHIParser.NL, 0); }
		public TerminalNode DEDENT() { return getToken(PHIParser.DEDENT, 0); }
		public TerminalNode INDENT() { return getToken(PHIParser.INDENT, 0); }
		public TerminalNode SPACE() { return getToken(PHIParser.SPACE, 0); }
		public AspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterAspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitAspace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitAspace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AspaceContext aspace() throws RecognitionException {
		AspaceContext _localctx = new AspaceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << SPACE) | (1L << INDENT) | (1L << DEDENT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptspaceContext extends ParserRuleContext {
		public TerminalNode SPACE(int i) {
			return getToken(PHIParser.SPACE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PHIParser.SPACE); }
		public OptspaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optspace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterOptspace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitOptspace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitOptspace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptspaceContext optspace() throws RecognitionException {
		OptspaceContext _localctx = new OptspaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optspace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(93); match(SPACE);
				}
				}
				setState(98);
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

	public static class SexprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PHIParser.LPAREN, 0); }
		public ApaddeditemsContext apaddeditems() {
			return getRuleContext(ApaddeditemsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PHIParser.RPAREN, 0); }
		public SexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterSexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitSexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitSexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexprContext sexpr() throws RecognitionException {
		SexprContext _localctx = new SexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(LPAREN);
			setState(100); apaddeditems();
			setState(101); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlistitemsContext extends ParserRuleContext {
		public AspaceContext aspace(int i) {
			return getRuleContext(AspaceContext.class,i);
		}
		public List<ListitemContext> listitem() {
			return getRuleContexts(ListitemContext.class);
		}
		public List<AspaceContext> aspace() {
			return getRuleContexts(AspaceContext.class);
		}
		public ListitemContext listitem(int i) {
			return getRuleContext(ListitemContext.class,i);
		}
		public AlistitemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alistitems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterAlistitems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitAlistitems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitAlistitems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlistitemsContext alistitems() throws RecognitionException {
		AlistitemsContext _localctx = new AlistitemsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alistitems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103); listitem();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(104); aspace();
						}
						}
						setState(107); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << SPACE) | (1L << INDENT) | (1L << DEDENT))) != 0) );
					setState(109); listitem();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ApaddeditemsContext extends ParserRuleContext {
		public AspaceContext aspace(int i) {
			return getRuleContext(AspaceContext.class,i);
		}
		public AlistitemsContext alistitems() {
			return getRuleContext(AlistitemsContext.class,0);
		}
		public List<AspaceContext> aspace() {
			return getRuleContexts(AspaceContext.class);
		}
		public ApaddeditemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apaddeditems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterApaddeditems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitApaddeditems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitApaddeditems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApaddeditemsContext apaddeditems() throws RecognitionException {
		ApaddeditemsContext _localctx = new ApaddeditemsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_apaddeditems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << SPACE) | (1L << INDENT) | (1L << DEDENT))) != 0)) {
				{
				{
				setState(116); aspace();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122); alistitems();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << SPACE) | (1L << INDENT) | (1L << DEDENT))) != 0)) {
				{
				{
				setState(123); aspace();
				}
				}
				setState(128);
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

	public static class ListitemsContext extends ParserRuleContext {
		public TerminalNode SPACE(int i) {
			return getToken(PHIParser.SPACE, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(PHIParser.SPACE); }
		public List<ListitemContext> listitem() {
			return getRuleContexts(ListitemContext.class);
		}
		public ListitemContext listitem(int i) {
			return getRuleContext(ListitemContext.class,i);
		}
		public ListitemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listitems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterListitems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitListitems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitListitems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListitemsContext listitems() throws RecognitionException {
		ListitemsContext _localctx = new ListitemsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listitems);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); listitem();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130); match(SPACE);
					setState(131); listitem();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ListitemContext extends ParserRuleContext {
		public DotappContext dotapp() {
			return getRuleContext(DotappContext.class,0);
		}
		public SexprContext sexpr() {
			return getRuleContext(SexprContext.class,0);
		}
		public ListitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterListitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitListitem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitListitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListitemContext listitem() throws RecognitionException {
		ListitemContext _localctx = new ListitemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listitem);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case DEF:
			case SUBS:
			case SUPS:
			case TYPE:
			case NAMESPACE:
			case LAMBDA:
			case LET:
			case STRING_CONST:
			case INT_CONST:
			case FLOAT_CONST:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(137); dotapp();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(138); sexpr();
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

	public static class FunappContext extends ParserRuleContext {
		public FunitemsContext funitems() {
			return getRuleContext(FunitemsContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PHIParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PHIParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funapp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterFunapp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitFunapp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitFunapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunappContext funapp() throws RecognitionException {
		FunappContext _localctx = new FunappContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funapp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); identifier();
			setState(142); match(LPAREN);
			setState(143); funitems();
			setState(144); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunitemsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(PHIParser.COMMA); }
		public ApaddeditemsContext apaddeditems(int i) {
			return getRuleContext(ApaddeditemsContext.class,i);
		}
		public List<ApaddeditemsContext> apaddeditems() {
			return getRuleContexts(ApaddeditemsContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(PHIParser.COMMA, i);
		}
		public FunitemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funitems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterFunitems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitFunitems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitFunitems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunitemsContext funitems() throws RecognitionException {
		FunitemsContext _localctx = new FunitemsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funitems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); apaddeditems();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147); match(COMMA);
				setState(148); apaddeditems();
				}
				}
				setState(153);
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

	public static class ItemContext extends ParserRuleContext {
		public FloatconstContext floatconst() {
			return getRuleContext(FloatconstContext.class,0);
		}
		public IntconstContext intconst() {
			return getRuleContext(IntconstContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringconstContext stringconst() {
			return getRuleContext(StringconstContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_item);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case DEF:
			case SUBS:
			case SUPS:
			case TYPE:
			case NAMESPACE:
			case LAMBDA:
			case LET:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); identifier();
				}
				break;
			case INT_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); intconst();
				}
				break;
			case FLOAT_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); floatconst();
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); stringconst();
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

	public static class DotitemContext extends ParserRuleContext {
		public FunappContext funapp() {
			return getRuleContext(FunappContext.class,0);
		}
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public DotitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotitem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterDotitem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitDotitem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitDotitem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotitemContext dotitem() throws RecognitionException {
		DotitemContext _localctx = new DotitemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dotitem);
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); funapp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); item();
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

	public static class DotappContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(PHIParser.DOT); }
		public List<DotitemContext> dotitem() {
			return getRuleContexts(DotitemContext.class);
		}
		public DotitemContext dotitem(int i) {
			return getRuleContext(DotitemContext.class,i);
		}
		public TerminalNode DOT(int i) {
			return getToken(PHIParser.DOT, i);
		}
		public DotappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotapp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterDotapp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitDotapp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitDotapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotappContext dotapp() throws RecognitionException {
		DotappContext _localctx = new DotappContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dotapp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); dotitem();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(165); match(DOT);
				setState(166); dotitem();
				}
				}
				setState(171);
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

	public static class BlockitemsContext extends ParserRuleContext {
		public BlockappContext blockapp() {
			return getRuleContext(BlockappContext.class,0);
		}
		public ListitemsContext listitems() {
			return getRuleContext(ListitemsContext.class,0);
		}
		public BlockitemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockitems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterBlockitems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitBlockitems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitBlockitems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockitemsContext blockitems() throws RecognitionException {
		BlockitemsContext _localctx = new BlockitemsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blockitems);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); blockapp();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173); listitems();
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

	public static class BlockappContext extends ParserRuleContext {
		public BlocklinesContext blocklines() {
			return getRuleContext(BlocklinesContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PHIParser.DEDENT, 0); }
		public OptspaceContext optspace() {
			return getRuleContext(OptspaceContext.class,0);
		}
		public TerminalNode INDENT() { return getToken(PHIParser.INDENT, 0); }
		public DotappContext dotapp() {
			return getRuleContext(DotappContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(PHIParser.SPACE, 0); }
		public ListitemsContext listitems() {
			return getRuleContext(ListitemsContext.class,0);
		}
		public BlockappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockapp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterBlockapp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitBlockapp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitBlockapp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockappContext blockapp() throws RecognitionException {
		BlockappContext _localctx = new BlockappContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_blockapp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); dotapp();
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(177); match(SPACE);
				setState(178); listitems();
				}
				break;
			}
			setState(181); optspace();
			setState(182); match(INDENT);
			setState(183); blocklines();
			setState(184); match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocklinesContext extends ParserRuleContext {
		public List<BlocklineContext> blockline() {
			return getRuleContexts(BlocklineContext.class);
		}
		public BlocklineContext blockline(int i) {
			return getRuleContext(BlocklineContext.class,i);
		}
		public BlocklinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocklines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterBlocklines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitBlocklines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitBlocklines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocklinesContext blocklines() throws RecognitionException {
		BlocklinesContext _localctx = new BlocklinesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_blocklines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186); blockline();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << DEF) | (1L << SUBS) | (1L << SUPS) | (1L << TYPE) | (1L << NAMESPACE) | (1L << LAMBDA) | (1L << LET) | (1L << STRING_CONST) | (1L << INT_CONST) | (1L << FLOAT_CONST) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocklineContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(PHIParser.NL); }
		public TerminalNode EOF() { return getToken(PHIParser.EOF, 0); }
		public OptspaceContext optspace() {
			return getRuleContext(OptspaceContext.class,0);
		}
		public TerminalNode SPACE(int i) {
			return getToken(PHIParser.SPACE, i);
		}
		public BlockitemsContext blockitems() {
			return getRuleContext(BlockitemsContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(PHIParser.SPACE); }
		public TerminalNode NL(int i) {
			return getToken(PHIParser.NL, i);
		}
		public BlocklineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterBlockline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitBlockline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitBlockline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocklineContext blockline() throws RecognitionException {
		BlocklineContext _localctx = new BlocklineContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_blockline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); blockitems();
			setState(192); optspace();
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL || _la==SPACE) {
				{
				{
				setState(194);
				_la = _input.LA(1);
				if ( !(_la==NL || _la==SPACE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(199);
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

	public static class StartContext extends ParserRuleContext {
		public BlocklinesContext blocklines() {
			return getRuleContext(BlocklinesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PHIParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PHIListener ) ((PHIListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PHIVisitor ) return ((PHIVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); blocklines();
			setState(201); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u00ce\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tR"+
		"\n\t\3\n\3\n\5\nV\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\7\17a\n"+
		"\17\f\17\16\17d\13\17\3\20\3\20\3\20\3\20\3\21\3\21\6\21l\n\21\r\21\16"+
		"\21m\3\21\3\21\7\21r\n\21\f\21\16\21u\13\21\3\22\7\22x\n\22\f\22\16\22"+
		"{\13\22\3\22\3\22\7\22\177\n\22\f\22\16\22\u0082\13\22\3\23\3\23\3\23"+
		"\7\23\u0087\n\23\f\23\16\23\u008a\13\23\3\24\3\24\5\24\u008e\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u0098\n\26\f\26\16\26\u009b\13"+
		"\26\3\27\3\27\3\27\3\27\5\27\u00a1\n\27\3\30\3\30\5\30\u00a5\n\30\3\31"+
		"\3\31\3\31\7\31\u00aa\n\31\f\31\16\31\u00ad\13\31\3\32\3\32\5\32\u00b1"+
		"\n\32\3\33\3\33\3\33\5\33\u00b6\n\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34"+
		"\u00be\n\34\r\34\16\34\u00bf\3\35\3\35\3\35\3\35\7\35\u00c6\n\35\f\35"+
		"\16\35\u00c9\13\35\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\4\2\27\27\31\33\3\3\27\27\4"+
		"\2\27\27\31\31\u00c8\2<\3\2\2\2\4>\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nD\3"+
		"\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20Q\3\2\2\2\22U\3\2\2\2\24W\3\2\2\2\26Y"+
		"\3\2\2\2\30[\3\2\2\2\32]\3\2\2\2\34b\3\2\2\2\36e\3\2\2\2 i\3\2\2\2\"y"+
		"\3\2\2\2$\u0083\3\2\2\2&\u008d\3\2\2\2(\u008f\3\2\2\2*\u0094\3\2\2\2,"+
		"\u00a0\3\2\2\2.\u00a4\3\2\2\2\60\u00a6\3\2\2\2\62\u00b0\3\2\2\2\64\u00b2"+
		"\3\2\2\2\66\u00bd\3\2\2\28\u00c1\3\2\2\2:\u00ca\3\2\2\2<=\7\13\2\2=\3"+
		"\3\2\2\2>?\7\f\2\2?\5\3\2\2\2@A\7\r\2\2A\7\3\2\2\2BC\7\16\2\2C\t\3\2\2"+
		"\2DE\7\17\2\2E\13\3\2\2\2FG\7\20\2\2G\r\3\2\2\2HI\7\21\2\2I\17\3\2\2\2"+
		"JR\5\2\2\2KR\5\4\3\2LR\5\6\4\2MR\5\b\5\2NR\5\n\6\2OR\5\f\7\2PR\5\16\b"+
		"\2QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2"+
		"\2R\21\3\2\2\2SV\7\30\2\2TV\5\20\t\2US\3\2\2\2UT\3\2\2\2V\23\3\2\2\2W"+
		"X\7\23\2\2X\25\3\2\2\2YZ\7\24\2\2Z\27\3\2\2\2[\\\7\22\2\2\\\31\3\2\2\2"+
		"]^\t\2\2\2^\33\3\2\2\2_a\7\31\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2c\35\3\2\2\2db\3\2\2\2ef\7\3\2\2fg\5\"\22\2gh\7\4\2\2h\37\3\2\2\2"+
		"is\5&\24\2jl\5\32\16\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2"+
		"\2op\5&\24\2pr\3\2\2\2qk\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t!\3\2\2"+
		"\2us\3\2\2\2vx\5\32\16\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2"+
		"\2\2{y\3\2\2\2|\u0080\5 \21\2}\177\5\32\16\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081#\3\2\2\2\u0082\u0080\3\2\2"+
		"\2\u0083\u0088\5&\24\2\u0084\u0085\7\31\2\2\u0085\u0087\5&\24\2\u0086"+
		"\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089%\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008e\5\60\31\2\u008c\u008e"+
		"\5\36\20\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e\'\3\2\2\2\u008f"+
		"\u0090\5\22\n\2\u0090\u0091\7\3\2\2\u0091\u0092\5*\26\2\u0092\u0093\7"+
		"\4\2\2\u0093)\3\2\2\2\u0094\u0099\5\"\22\2\u0095\u0096\7\t\2\2\u0096\u0098"+
		"\5\"\22\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a+\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a1\5"+
		"\22\n\2\u009d\u00a1\5\24\13\2\u009e\u00a1\5\26\f\2\u009f\u00a1\5\30\r"+
		"\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1-\3\2\2\2\u00a2\u00a5\5(\25\2\u00a3\u00a5\5,\27\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5/\3\2\2\2\u00a6\u00ab\5.\30\2"+
		"\u00a7\u00a8\7\n\2\2\u00a8\u00aa\5.\30\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\61\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\5\64\33\2\u00af\u00b1\5$\23\2\u00b0\u00ae\3"+
		"\2\2\2\u00b0\u00af\3\2\2\2\u00b1\63\3\2\2\2\u00b2\u00b5\5\60\31\2\u00b3"+
		"\u00b4\7\31\2\2\u00b4\u00b6\5$\23\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00b9\7\32\2\2"+
		"\u00b9\u00ba\5\66\34\2\u00ba\u00bb\7\33\2\2\u00bb\65\3\2\2\2\u00bc\u00be"+
		"\58\35\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\67\3\2\2\2\u00c1\u00c2\5\62\32\2\u00c2\u00c3\5\34"+
		"\17\2\u00c3\u00c7\t\3\2\2\u00c4\u00c6\t\4\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c89\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\66\34\2\u00cb\u00cc\7\2\2\3\u00cc;"+
		"\3\2\2\2\23QUbmsy\u0080\u0088\u008d\u0099\u00a0\u00a4\u00ab\u00b0\u00b5"+
		"\u00bf\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}