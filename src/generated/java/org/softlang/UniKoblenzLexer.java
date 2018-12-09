// Generated from org/softlang/UniKoblenz.g4 by ANTLR 4.7.1
package org.softlang;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UniKoblenzLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, CAMPUS=14, WIFIAVAILABILITY=15, 
		WIFISPEED=16, SERVERAVAILABILITY=17, MENU=18, STRING=19, FLOAT=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "CAMPUS", "WIFIAVAILABILITY", "WIFISPEED", 
		"SERVERAVAILABILITY", "MENU", "STRING", "FLOAT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Universit\u00E4t Koblenz-Landau'", "'{'", "'campus'", "'}'", "'faculty'", 
		"'dean'", "'menu'", "'availability'", "'speed'", "'klips'", "'email'", 
		"'address'", "'salary'", null, null, null, null, "'something'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CAMPUS", "WIFIAVAILABILITY", "WIFISPEED", "SERVERAVAILABILITY", 
		"MENU", "STRING", "FLOAT", "WS"
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


	public UniKoblenzLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UniKoblenz.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0127\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cd"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00fa\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\7\24\u0108\n\24\f\24\16\24\u010b\13\24\3\24\3\24"+
		"\3\25\6\25\u0110\n\25\r\25\16\25\u0111\3\25\3\25\6\25\u0116\n\25\r\25"+
		"\16\25\u0117\5\25\u011a\n\25\3\26\3\26\5\26\u011e\n\26\3\26\3\26\6\26"+
		"\u0122\n\26\r\26\16\26\u0123\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27\3\2\3\3\2$$\2\u0133\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\3-\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\r[\3\2\2\2"+
		"\17`\3\2\2\2\21e\3\2\2\2\23r\3\2\2\2\25x\3\2\2\2\27~\3\2\2\2\31\u0084"+
		"\3\2\2\2\33\u008c\3\2\2\2\35\u00a0\3\2\2\2\37\u00cc\3\2\2\2!\u00e5\3\2"+
		"\2\2#\u00f9\3\2\2\2%\u00fb\3\2\2\2\'\u0105\3\2\2\2)\u010f\3\2\2\2+\u0121"+
		"\3\2\2\2-.\7W\2\2./\7p\2\2/\60\7k\2\2\60\61\7x\2\2\61\62\7g\2\2\62\63"+
		"\7t\2\2\63\64\7u\2\2\64\65\7k\2\2\65\66\7v\2\2\66\67\7\u00e6\2\2\678\7"+
		"v\2\289\7\"\2\29:\7M\2\2:;\7q\2\2;<\7d\2\2<=\7n\2\2=>\7g\2\2>?\7p\2\2"+
		"?@\7|\2\2@A\7/\2\2AB\7N\2\2BC\7c\2\2CD\7p\2\2DE\7f\2\2EF\7c\2\2FG\7w\2"+
		"\2G\4\3\2\2\2HI\7}\2\2I\6\3\2\2\2JK\7e\2\2KL\7c\2\2LM\7o\2\2MN\7r\2\2"+
		"NO\7w\2\2OP\7u\2\2P\b\3\2\2\2QR\7\177\2\2R\n\3\2\2\2ST\7h\2\2TU\7c\2\2"+
		"UV\7e\2\2VW\7w\2\2WX\7n\2\2XY\7v\2\2YZ\7{\2\2Z\f\3\2\2\2[\\\7f\2\2\\]"+
		"\7g\2\2]^\7c\2\2^_\7p\2\2_\16\3\2\2\2`a\7o\2\2ab\7g\2\2bc\7p\2\2cd\7w"+
		"\2\2d\20\3\2\2\2ef\7c\2\2fg\7x\2\2gh\7c\2\2hi\7k\2\2ij\7n\2\2jk\7c\2\2"+
		"kl\7d\2\2lm\7k\2\2mn\7n\2\2no\7k\2\2op\7v\2\2pq\7{\2\2q\22\3\2\2\2rs\7"+
		"u\2\2st\7r\2\2tu\7g\2\2uv\7g\2\2vw\7f\2\2w\24\3\2\2\2xy\7m\2\2yz\7n\2"+
		"\2z{\7k\2\2{|\7r\2\2|}\7u\2\2}\26\3\2\2\2~\177\7g\2\2\177\u0080\7o\2\2"+
		"\u0080\u0081\7c\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\30\3\2"+
		"\2\2\u0084\u0085\7c\2\2\u0085\u0086\7f\2\2\u0086\u0087\7f\2\2\u0087\u0088"+
		"\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7u\2\2\u008a\u008b\7u\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e\7c\2\2\u008e\u008f\7n\2\2\u008f"+
		"\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091\u0092\7{\2\2\u0092\34\3\2\2\2\u0093"+
		"\u0094\7M\2\2\u0094\u0095\7q\2\2\u0095\u0096\7d\2\2\u0096\u0097\7n\2\2"+
		"\u0097\u0098\7g\2\2\u0098\u0099\7p\2\2\u0099\u00a1\7|\2\2\u009a\u009b"+
		"\7N\2\2\u009b\u009c\7c\2\2\u009c\u009d\7p\2\2\u009d\u009e\7f\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a1\7w\2\2\u00a0\u0093\3\2\2\2\u00a0\u009a\3\2\2"+
		"\2\u00a1\36\3\2\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7x\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7k\2\2\u00a8"+
		"\u00a9\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7d\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00cd\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7q\2\2\u00af\u00b0"+
		"\7p\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7z\2\2\u00b2\u00b3\7k\2\2\u00b3"+
		"\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7p\2\2"+
		"\u00b7\u00cd\7v\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7n\2\2"+
		"\u00c2\u00c3\7n\2\2\u00c3\u00c4\7{\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6"+
		"\7y\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7m\2\2\u00c9"+
		"\u00ca\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cd\7i\2\2\u00cc\u00a2\3\2\2"+
		"\2\u00cc\u00ad\3\2\2\2\u00cc\u00b8\3\2\2\2\u00cd \3\2\2\2\u00ce\u00cf"+
		"\7u\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7n\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7\"\2\2\u00d5\u00d6\7r\2"+
		"\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7e\2\2\u00d8\u00e6\7g\2\2\u00d9\u00da"+
		"\7v\2\2\u00da\u00db\7w\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"\u00de\7n\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1\7u\2"+
		"\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e6"+
		"\7f\2\2\u00e5\u00ce\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e6\"\3\2\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7k\2\2"+
		"\u00eb\u00ec\7n\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7d\2\2\u00ee\u00ef"+
		"\7n\2\2\u00ef\u00fa\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7v\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7q\2"+
		"\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7c\2\2\u00f8\u00fa\7{\2\2\u00f9\u00e7"+
		"\3\2\2\2\u00f9\u00f0\3\2\2\2\u00fa$\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd"+
		"\7q\2\2\u00fd\u00fe\7o\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100"+
		"\u0101\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7i\2\2"+
		"\u0104&\3\2\2\2\u0105\u0109\7$\2\2\u0106\u0108\n\2\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7$\2\2\u010d(\3\2\2\2\u010e"+
		"\u0110\4\62;\2\u010f\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u010f\3\2"+
		"\2\2\u0111\u0112\3\2\2\2\u0112\u0119\3\2\2\2\u0113\u0115\7\60\2\2\u0114"+
		"\u0116\4\62;\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2"+
		"\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0113\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a*\3\2\2\2\u011b\u0122\7\"\2\2\u011c\u011e\7\17\2\2"+
		"\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122"+
		"\7\f\2\2\u0120\u0122\7\13\2\2\u0121\u011b\3\2\2\2\u0121\u011d\3\2\2\2"+
		"\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\26\2\2\u0126,\3\2\2\2\16\2"+
		"\u00a0\u00cc\u00e5\u00f9\u0109\u0111\u0117\u0119\u011d\u0121\u0123\3\3"+
		"\26\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}