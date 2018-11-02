// Generated from JSON.g4 by ANTLR 4.7.1
package hu.bme.aut.thesis.json.schema.compiler.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, STRING=7, NUMBER=8, INT=9, 
		BOOLEAN=10, TRUE=11, FALSE=12, NULL=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "STRING", "ESC", "UNICODE", 
		"HEX", "SAFECODEPOINT", "NUMBER", "INT", "EXP", "BOOLEAN", "TRUE", "FALSE", 
		"NULL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "':'", "'['", "']'", null, null, null, null, 
		"'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "STRING", "NUMBER", "INT", "BOOLEAN", 
		"TRUE", "FALSE", "NULL", "WS"
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


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\7\b9\n\b\f\b\16\b<\13\b\3\b\3\b\3\t\3\t\3\t\5\tC\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\rP\n\r\3\r\3\r\3\r\6"+
		"\rU\n\r\r\r\16\rV\5\rY\n\r\3\r\5\r\\\n\r\3\16\3\16\3\16\7\16a\n\16\f\16"+
		"\16\16d\13\16\5\16f\n\16\3\17\3\17\5\17j\n\17\3\17\3\17\3\20\3\20\5\20"+
		"p\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\6\24\u0083\n\24\r\24\16\24\u0084\3\24\3\24\2\2\25"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\n\33\13\35\2\37"+
		"\f!\r#\16%\17\'\20\3\2\n\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\5\2\2!$$"+
		"^^\3\2\62;\3\2\63;\4\2GGgg\4\2--//\5\2\13\f\17\17\"\"\2\u008e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13"+
		"\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21?\3\2\2\2\23D\3\2\2\2\25J\3\2"+
		"\2\2\27L\3\2\2\2\31O\3\2\2\2\33e\3\2\2\2\35g\3\2\2\2\37o\3\2\2\2!q\3\2"+
		"\2\2#v\3\2\2\2%|\3\2\2\2\'\u0082\3\2\2\2)*\7}\2\2*\4\3\2\2\2+,\7.\2\2"+
		",\6\3\2\2\2-.\7\177\2\2.\b\3\2\2\2/\60\7<\2\2\60\n\3\2\2\2\61\62\7]\2"+
		"\2\62\f\3\2\2\2\63\64\7_\2\2\64\16\3\2\2\2\65:\7$\2\2\669\5\21\t\2\67"+
		"9\5\27\f\28\66\3\2\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2"+
		"\2\2<:\3\2\2\2=>\7$\2\2>\20\3\2\2\2?B\7^\2\2@C\t\2\2\2AC\5\23\n\2B@\3"+
		"\2\2\2BA\3\2\2\2C\22\3\2\2\2DE\7w\2\2EF\5\25\13\2FG\5\25\13\2GH\5\25\13"+
		"\2HI\5\25\13\2I\24\3\2\2\2JK\t\3\2\2K\26\3\2\2\2LM\n\4\2\2M\30\3\2\2\2"+
		"NP\7/\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QX\5\33\16\2RT\7\60\2\2SU\t\5\2"+
		"\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XR\3\2\2\2XY\3\2\2"+
		"\2Y[\3\2\2\2Z\\\5\35\17\2[Z\3\2\2\2[\\\3\2\2\2\\\32\3\2\2\2]f\7\62\2\2"+
		"^b\t\6\2\2_a\t\5\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2e]\3\2\2\2e^\3\2\2\2f\34\3\2\2\2gi\t\7\2\2hj\t\b\2\2ih\3\2\2"+
		"\2ij\3\2\2\2jk\3\2\2\2kl\5\33\16\2l\36\3\2\2\2mp\5!\21\2np\5#\22\2om\3"+
		"\2\2\2on\3\2\2\2p \3\2\2\2qr\7v\2\2rs\7t\2\2st\7w\2\2tu\7g\2\2u\"\3\2"+
		"\2\2vw\7h\2\2wx\7c\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{$\3\2\2\2|}\7p\2\2}"+
		"~\7w\2\2~\177\7n\2\2\177\u0080\7n\2\2\u0080&\3\2\2\2\u0081\u0083\t\t\2"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\24\2\2\u0087(\3\2\2\2\17\2"+
		"8:BOVX[beio\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}