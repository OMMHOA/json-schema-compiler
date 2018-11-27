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
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, LPAREN=10, 
		RPAREN=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, GT=16, LT=17, EQ=18, COMMA=19, 
		POINT=20, POW=21, THIS=22, INT=23, NUMBER=24, BOOLEAN=25, TRUE=26, FALSE=27, 
		NULL=28, JSON_POINTER=29, STRING=30, STRING_CONTENT=31, WS=32;
	public static final int
		RULE_equationwa = 0, RULE_equation = 1, RULE_expression = 2, RULE_plusOrMinusExpression = 3, 
		RULE_plusOrMinus = 4, RULE_multiplyingExpression = 5, RULE_timesOrDivExpression = 6, 
		RULE_timesOrDiv = 7, RULE_poweredExpression = 8, RULE_powExpression = 9, 
		RULE_signedAtom = 10, RULE_atom = 11, RULE_func = 12, RULE_funcname = 13, 
		RULE_relop = 14;
	public static final String[] ruleNames = {
		"equationwa", "equation", "expression", "plusOrMinusExpression", "plusOrMinus", 
		"multiplyingExpression", "timesOrDivExpression", "timesOrDiv", "poweredExpression", 
		"powExpression", "signedAtom", "atom", "func", "funcname", "relop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", 
		"'log'", "'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", 
		"'='", "','", "'.'", "'^'", "'this'", null, null, null, "'true'", "'false'", 
		"'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", 
		"LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", "EQ", 
		"COMMA", "POINT", "POW", "THIS", "INT", "NUMBER", "BOOLEAN", "TRUE", "FALSE", 
		"NULL", "JSON_POINTER", "STRING", "STRING_CONTENT", "WS"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOF) {
				{
				{
				setState(30);
				match(EOF);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(38);
			expression();
			setState(39);
			relop();
			setState(40);
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
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				multiplyingExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
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
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				multiplyingExpression();
				setState(47);
				plusOrMinus();
				setState(48);
				multiplyingExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				multiplyingExpression();
				setState(51);
				plusOrMinus();
				setState(52);
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
			setState(56);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				poweredExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				poweredExpression();
				setState(63);
				timesOrDiv();
				setState(64);
				poweredExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				poweredExpression();
				setState(67);
				timesOrDiv();
				setState(68);
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
			setState(72);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				signedAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				signedAtom();
				setState(79);
				match(POW);
				setState(80);
				signedAtom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				signedAtom();
				setState(83);
				match(POW);
				setState(84);
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
		public TerminalNode PLUS() { return getToken(EquationParser.PLUS, 0); }
		public SignedAtomContext signedAtom() {
			return getRuleContext(SignedAtomContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(EquationParser.MINUS, 0); }
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
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(PLUS);
				setState(89);
				signedAtom();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(MINUS);
				setState(91);
				signedAtom();
				}
				break;
			case COS:
			case SIN:
			case TAN:
			case ACOS:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				func();
				}
				break;
			case LPAREN:
			case THIS:
			case INT:
			case NUMBER:
			case BOOLEAN:
			case NULL:
			case JSON_POINTER:
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
		enterRule(_localctx, 22, RULE_atom);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON_POINTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(JSON_POINTER);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(NUMBER);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(INT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(BOOLEAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(NULL);
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(THIS);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(LPAREN);
				setState(103);
				expression();
				setState(104);
				match(RPAREN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(STRING);
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
		enterRule(_localctx, 24, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			funcname();
			setState(110);
			match(LPAREN);
			setState(111);
			expression();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				expression();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
		enterRule(_localctx, 26, RULE_funcname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 28, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0080\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\7\3\7\5\7?\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bI\n\b\3\t\3\t\3\n\3\n\5\nO\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13Y\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\fa\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3\16\3\16\7\16"+
		"u\n\16\f\16\16\16x\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\3\2\16\17\3\2\20\21\3\2\3\13\3"+
		"\2\22\24\2\u0082\2#\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b8\3\2\2\2\n:\3\2\2"+
		"\2\f>\3\2\2\2\16H\3\2\2\2\20J\3\2\2\2\22N\3\2\2\2\24X\3\2\2\2\26`\3\2"+
		"\2\2\30m\3\2\2\2\32o\3\2\2\2\34{\3\2\2\2\36}\3\2\2\2 \"\7\2\2\3! \3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\4\3\2\'\3"+
		"\3\2\2\2()\5\6\4\2)*\5\36\20\2*+\5\6\4\2+\5\3\2\2\2,/\5\f\7\2-/\5\b\5"+
		"\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61\5\f\7\2\61\62\5\n\6\2\62\63\5"+
		"\f\7\2\639\3\2\2\2\64\65\5\f\7\2\65\66\5\n\6\2\66\67\5\b\5\2\679\3\2\2"+
		"\28\60\3\2\2\28\64\3\2\2\29\t\3\2\2\2:;\t\2\2\2;\13\3\2\2\2<?\5\22\n\2"+
		"=?\5\16\b\2><\3\2\2\2>=\3\2\2\2?\r\3\2\2\2@A\5\22\n\2AB\5\20\t\2BC\5\22"+
		"\n\2CI\3\2\2\2DE\5\22\n\2EF\5\20\t\2FG\5\16\b\2GI\3\2\2\2H@\3\2\2\2HD"+
		"\3\2\2\2I\17\3\2\2\2JK\t\3\2\2K\21\3\2\2\2LO\5\26\f\2MO\5\24\13\2NL\3"+
		"\2\2\2NM\3\2\2\2O\23\3\2\2\2PQ\5\26\f\2QR\7\27\2\2RS\5\26\f\2SY\3\2\2"+
		"\2TU\5\26\f\2UV\7\27\2\2VW\5\24\13\2WY\3\2\2\2XP\3\2\2\2XT\3\2\2\2Y\25"+
		"\3\2\2\2Z[\7\16\2\2[a\5\26\f\2\\]\7\17\2\2]a\5\26\f\2^a\5\32\16\2_a\5"+
		"\30\r\2`Z\3\2\2\2`\\\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\27\3\2\2\2bn\7\37\2"+
		"\2cn\7\32\2\2dn\7\31\2\2en\7\33\2\2fn\7\36\2\2gn\7\30\2\2hi\7\f\2\2ij"+
		"\5\6\4\2jk\7\r\2\2kn\3\2\2\2ln\7 \2\2mb\3\2\2\2mc\3\2\2\2md\3\2\2\2me"+
		"\3\2\2\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2ml\3\2\2\2n\31\3\2\2\2op\5\34\17"+
		"\2pq\7\f\2\2qv\5\6\4\2rs\7\25\2\2su\5\6\4\2tr\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\r\2\2z\33\3\2\2\2{|\t\4\2\2|\35"+
		"\3\2\2\2}~\t\5\2\2~\37\3\2\2\2\f#.8>HNX`mv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}