// Generated from Equation.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EquationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COS=3, SIN=4, TAN=5, ACOS=6, ASIN=7, ATAN=8, LN=9, LOG=10, 
		SQRT=11, LPAREN=12, RPAREN=13, PLUS=14, MINUS=15, TIMES=16, DIV=17, GT=18, 
		LT=19, EQ=20, COMMA=21, POINT=22, POW=23, THIS=24, INT=25, NUMBER=26, 
		BOOLEAN=27, TRUE=28, FALSE=29, NULL=30, JSON_POINTER=31, STRING=32, WS=33;
	public static final int
		RULE_equationwa = 0, RULE_equation = 1, RULE_expression = 2, RULE_plusOrMinusExpression = 3, 
		RULE_plusOrMinus = 4, RULE_multiplyingExpression = 5, RULE_timesOrDivExpression = 6, 
		RULE_timesOrDiv = 7, RULE_poweredExpression = 8, RULE_powExpression = 9, 
		RULE_signedAtom = 10, RULE_array = 11, RULE_atom = 12, RULE_func = 13, 
		RULE_funcname = 14, RULE_relop = 15;
	public static final String[] ruleNames = {
		"equationwa", "equation", "expression", "plusOrMinusExpression", "plusOrMinus", 
		"multiplyingExpression", "timesOrDivExpression", "timesOrDiv", "poweredExpression", 
		"powExpression", "signedAtom", "array", "atom", "func", "funcname", "relop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", 
		"'ln'", "'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", 
		"'<'", "'='", "','", "'.'", "'^'", "'this'", null, null, null, "'true'", 
		"'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", 
		"SQRT", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", 
		"EQ", "COMMA", "POINT", "POW", "THIS", "INT", "NUMBER", "BOOLEAN", "TRUE", 
		"FALSE", "NULL", "JSON_POINTER", "STRING", "WS"
	};
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
	public String getGrammarFileName() { return "Equation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EquationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EquationwaContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public List<TerminalNode> EOF() { return getTokens(EquationParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(EquationParser.EOF, i);
		}
		public EquationwaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationwa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterEquationwa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitEquationwa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitEquationwa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationwaContext equationwa() throws RecognitionException {
		EquationwaContext _localctx = new EquationwaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_equationwa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOF) {
				{
				{
				setState(32);
				match(EOF);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			equation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			expression();
			setState(41);
			relop();
			setState(42);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public MultiplyingExpressionContext multiplyingExpression() {
			return getRuleContext(MultiplyingExpressionContext.class,0);
		}
		public PlusOrMinusExpressionContext plusOrMinusExpression() {
			return getRuleContext(PlusOrMinusExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				multiplyingExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				plusOrMinusExpression();
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

	public static class PlusOrMinusExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public PlusOrMinusContext plusOrMinus() {
			return getRuleContext(PlusOrMinusContext.class,0);
		}
		public PlusOrMinusExpressionContext plusOrMinusExpression() {
			return getRuleContext(PlusOrMinusExpressionContext.class,0);
		}
		public PlusOrMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOrMinusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterPlusOrMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitPlusOrMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitPlusOrMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOrMinusExpressionContext plusOrMinusExpression() throws RecognitionException {
		PlusOrMinusExpressionContext _localctx = new PlusOrMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_plusOrMinusExpression);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				multiplyingExpression();
				setState(49);
				plusOrMinus();
				setState(50);
				multiplyingExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				multiplyingExpression();
				setState(53);
				plusOrMinus();
				setState(54);
				plusOrMinusExpression();
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

	public static class PlusOrMinusContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(EquationParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EquationParser.MINUS, 0); }
		public PlusOrMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusOrMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterPlusOrMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitPlusOrMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitPlusOrMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusOrMinusContext plusOrMinus() throws RecognitionException {
		PlusOrMinusContext _localctx = new PlusOrMinusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_plusOrMinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public PoweredExpressionContext poweredExpression() {
			return getRuleContext(PoweredExpressionContext.class,0);
		}
		public TimesOrDivExpressionContext timesOrDivExpression() {
			return getRuleContext(TimesOrDivExpressionContext.class,0);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitMultiplyingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitMultiplyingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multiplyingExpression);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				poweredExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				timesOrDivExpression();
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

	public static class TimesOrDivExpressionContext extends ParserRuleContext {
		public List<PoweredExpressionContext> poweredExpression() {
			return getRuleContexts(PoweredExpressionContext.class);
		}
		public PoweredExpressionContext poweredExpression(int i) {
			return getRuleContext(PoweredExpressionContext.class,i);
		}
		public TimesOrDivContext timesOrDiv() {
			return getRuleContext(TimesOrDivContext.class,0);
		}
		public TimesOrDivExpressionContext timesOrDivExpression() {
			return getRuleContext(TimesOrDivExpressionContext.class,0);
		}
		public TimesOrDivExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesOrDivExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterTimesOrDivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitTimesOrDivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitTimesOrDivExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesOrDivExpressionContext timesOrDivExpression() throws RecognitionException {
		TimesOrDivExpressionContext _localctx = new TimesOrDivExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timesOrDivExpression);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				poweredExpression();
				setState(65);
				timesOrDiv();
				setState(66);
				poweredExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				poweredExpression();
				setState(69);
				timesOrDiv();
				setState(70);
				timesOrDivExpression();
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

	public static class TimesOrDivContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(EquationParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(EquationParser.DIV, 0); }
		public TimesOrDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesOrDiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterTimesOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitTimesOrDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitTimesOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimesOrDivContext timesOrDiv() throws RecognitionException {
		TimesOrDivContext _localctx = new TimesOrDivContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_timesOrDiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==DIV) ) {
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

	public static class PoweredExpressionContext extends ParserRuleContext {
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public PowExpressionContext powExpression() {
			return getRuleContext(PowExpressionContext.class,0);
		}
		public PoweredExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poweredExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterPoweredExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitPoweredExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitPoweredExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PoweredExpressionContext poweredExpression() throws RecognitionException {
		PoweredExpressionContext _localctx = new PoweredExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_poweredExpression);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				signedAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				powExpression();
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

	public static class PowExpressionContext extends ParserRuleContext {
		public List<SignedAtomContext> signedAtom() {
			return getRuleContexts(SignedAtomContext.class);
		}
		public SignedAtomContext signedAtom(int i) {
			return getRuleContext(SignedAtomContext.class,i);
		}
		public TerminalNode POW() { return getToken(EquationParser.POW, 0); }
		public PowExpressionContext powExpression() {
			return getRuleContext(PowExpressionContext.class,0);
		}
		public PowExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_powExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterPowExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitPowExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitPowExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowExpressionContext powExpression() throws RecognitionException {
		PowExpressionContext _localctx = new PowExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_powExpression);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				signedAtom();
				setState(81);
				match(POW);
				setState(82);
				signedAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				signedAtom();
				setState(85);
				match(POW);
				setState(86);
				powExpression();
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

	public static class SignedAtomContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public SignedAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterSignedAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitSignedAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitSignedAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedAtomContext signedAtom() throws RecognitionException {
		SignedAtomContext _localctx = new SignedAtomContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signedAtom);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				func();
				}
				break;
			case T__0:
			case LPAREN:
			case THIS:
			case INT:
			case NUMBER:
			case BOOLEAN:
			case NULL:
			case JSON_POINTER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				atom();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__0);
				setState(95);
				expression();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					expression();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__0);
				setState(106);
				match(T__1);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode JSON_POINTER() { return getToken(EquationParser.JSON_POINTER, 0); }
		public TerminalNode NUMBER() { return getToken(EquationParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(EquationParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(EquationParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(EquationParser.NULL, 0); }
		public TerminalNode THIS() { return getToken(EquationParser.THIS, 0); }
		public TerminalNode LPAREN() { return getToken(EquationParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EquationParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(EquationParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON_POINTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(JSON_POINTER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(NUMBER);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(BOOLEAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(NULL);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(THIS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(LPAREN);
				setState(116);
				expression();
				setState(117);
				match(RPAREN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(STRING);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 9);
				{
				setState(120);
				array();
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

	public static class FuncContext extends ParserRuleContext {
		public FuncnameContext funcname() {
			return getRuleContext(FuncnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EquationParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EquationParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EquationParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EquationParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			funcname();
			setState(124);
			match(LPAREN);
			setState(125);
			expression();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				expression();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
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

	public static class FuncnameContext extends ParserRuleContext {
		public TerminalNode COS() { return getToken(EquationParser.COS, 0); }
		public TerminalNode TAN() { return getToken(EquationParser.TAN, 0); }
		public TerminalNode SIN() { return getToken(EquationParser.SIN, 0); }
		public TerminalNode ACOS() { return getToken(EquationParser.ACOS, 0); }
		public TerminalNode ATAN() { return getToken(EquationParser.ATAN, 0); }
		public TerminalNode ASIN() { return getToken(EquationParser.ASIN, 0); }
		public TerminalNode LOG() { return getToken(EquationParser.LOG, 0); }
		public TerminalNode LN() { return getToken(EquationParser.LN, 0); }
		public TerminalNode SQRT() { return getToken(EquationParser.SQRT, 0); }
		public FuncnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterFuncname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitFuncname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitFuncname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncnameContext funcname() throws RecognitionException {
		FuncnameContext _localctx = new FuncnameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COS) | (1L << SIN) | (1L << TAN) | (1L << ACOS) | (1L << ASIN) | (1L << ATAN) | (1L << LN) | (1L << LOG) | (1L << SQRT))) != 0)) ) {
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(EquationParser.EQ, 0); }
		public TerminalNode GT() { return getToken(EquationParser.GT, 0); }
		public TerminalNode LT() { return getToken(EquationParser.LT, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EquationListener ) ((EquationListener)listener).exitRelop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EquationVisitor ) return ((EquationVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u008e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4\61\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\7\3\7\5\7A\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\3\n\5\nQ\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13[\n\13\3\f\3\f\5\f_\n\f\3\r\3\r\3\r\3\r"+
		"\7\re\n\r\f\r\16\rh\13\r\3\r\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16|\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0083\n\17\f\17\16\17\u0086\13\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\6\3\2\20\21"+
		"\3\2\22\23\3\2\5\r\3\2\24\26\2\u0090\2%\3\2\2\2\4*\3\2\2\2\6\60\3\2\2"+
		"\2\b:\3\2\2\2\n<\3\2\2\2\f@\3\2\2\2\16J\3\2\2\2\20L\3\2\2\2\22P\3\2\2"+
		"\2\24Z\3\2\2\2\26^\3\2\2\2\30m\3\2\2\2\32{\3\2\2\2\34}\3\2\2\2\36\u0089"+
		"\3\2\2\2 \u008b\3\2\2\2\"$\7\2\2\3#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&(\3\2\2\2\'%\3\2\2\2()\5\4\3\2)\3\3\2\2\2*+\5\6\4\2+,\5 \21\2,"+
		"-\5\6\4\2-\5\3\2\2\2.\61\5\f\7\2/\61\5\b\5\2\60.\3\2\2\2\60/\3\2\2\2\61"+
		"\7\3\2\2\2\62\63\5\f\7\2\63\64\5\n\6\2\64\65\5\f\7\2\65;\3\2\2\2\66\67"+
		"\5\f\7\2\678\5\n\6\289\5\b\5\29;\3\2\2\2:\62\3\2\2\2:\66\3\2\2\2;\t\3"+
		"\2\2\2<=\t\2\2\2=\13\3\2\2\2>A\5\22\n\2?A\5\16\b\2@>\3\2\2\2@?\3\2\2\2"+
		"A\r\3\2\2\2BC\5\22\n\2CD\5\20\t\2DE\5\22\n\2EK\3\2\2\2FG\5\22\n\2GH\5"+
		"\20\t\2HI\5\16\b\2IK\3\2\2\2JB\3\2\2\2JF\3\2\2\2K\17\3\2\2\2LM\t\3\2\2"+
		"M\21\3\2\2\2NQ\5\26\f\2OQ\5\24\13\2PN\3\2\2\2PO\3\2\2\2Q\23\3\2\2\2RS"+
		"\5\26\f\2ST\7\31\2\2TU\5\26\f\2U[\3\2\2\2VW\5\26\f\2WX\7\31\2\2XY\5\24"+
		"\13\2Y[\3\2\2\2ZR\3\2\2\2ZV\3\2\2\2[\25\3\2\2\2\\_\5\34\17\2]_\5\32\16"+
		"\2^\\\3\2\2\2^]\3\2\2\2_\27\3\2\2\2`a\7\3\2\2af\5\6\4\2bc\7\27\2\2ce\5"+
		"\6\4\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7"+
		"\4\2\2jn\3\2\2\2kl\7\3\2\2ln\7\4\2\2m`\3\2\2\2mk\3\2\2\2n\31\3\2\2\2o"+
		"|\7!\2\2p|\7\34\2\2q|\7\33\2\2r|\7\35\2\2s|\7 \2\2t|\7\32\2\2uv\7\16\2"+
		"\2vw\5\6\4\2wx\7\17\2\2x|\3\2\2\2y|\7\"\2\2z|\5\30\r\2{o\3\2\2\2{p\3\2"+
		"\2\2{q\3\2\2\2{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{u\3\2\2\2{y\3\2\2\2{z\3\2"+
		"\2\2|\33\3\2\2\2}~\5\36\20\2~\177\7\16\2\2\177\u0084\5\6\4\2\u0080\u0081"+
		"\7\27\2\2\u0081\u0083\5\6\4\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7\17\2\2\u0088\35\3\2\2\2\u0089\u008a\t\4\2\2\u008a"+
		"\37\3\2\2\2\u008b\u008c\t\5\2\2\u008c!\3\2\2\2\16%\60:@JPZ^fm{\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}