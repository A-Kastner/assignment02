// Generated from Company.g4 by ANTLR 4.7.1

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
public class CompanyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, STRING=9, 
		FLOAT=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "STRING", 
		"FLOAT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'company'", "'{'", "'}'", "'department'", "'manager'", "'employee'", 
		"'address'", "'salary'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "STRING", "FLOAT", 
		"WS"
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


	public double total = 0;


	public CompanyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Company.g4"; }

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
		case 10:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rr\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\nS\n\n\f\n\16\nV\13\n\3\n\3\n\3\13\6"+
		"\13[\n\13\r\13\16\13\\\3\13\3\13\6\13a\n\13\r\13\16\13b\5\13e\n\13\3\f"+
		"\3\f\5\fi\n\f\3\f\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\3\3\2$$\2y\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5!\3\2\2"+
		"\2\7#\3\2\2\2\t%\3\2\2\2\13\60\3\2\2\2\r8\3\2\2\2\17A\3\2\2\2\21I\3\2"+
		"\2\2\23P\3\2\2\2\25Z\3\2\2\2\27l\3\2\2\2\31\32\7e\2\2\32\33\7q\2\2\33"+
		"\34\7o\2\2\34\35\7r\2\2\35\36\7c\2\2\36\37\7p\2\2\37 \7{\2\2 \4\3\2\2"+
		"\2!\"\7}\2\2\"\6\3\2\2\2#$\7\177\2\2$\b\3\2\2\2%&\7f\2\2&\'\7g\2\2\'("+
		"\7r\2\2()\7c\2\2)*\7t\2\2*+\7v\2\2+,\7o\2\2,-\7g\2\2-.\7p\2\2./\7v\2\2"+
		"/\n\3\2\2\2\60\61\7o\2\2\61\62\7c\2\2\62\63\7p\2\2\63\64\7c\2\2\64\65"+
		"\7i\2\2\65\66\7g\2\2\66\67\7t\2\2\67\f\3\2\2\289\7g\2\29:\7o\2\2:;\7r"+
		"\2\2;<\7n\2\2<=\7q\2\2=>\7{\2\2>?\7g\2\2?@\7g\2\2@\16\3\2\2\2AB\7c\2\2"+
		"BC\7f\2\2CD\7f\2\2DE\7t\2\2EF\7g\2\2FG\7u\2\2GH\7u\2\2H\20\3\2\2\2IJ\7"+
		"u\2\2JK\7c\2\2KL\7n\2\2LM\7c\2\2MN\7t\2\2NO\7{\2\2O\22\3\2\2\2PT\7$\2"+
		"\2QS\n\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2"+
		"\2WX\7$\2\2X\24\3\2\2\2Y[\4\62;\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]d\3\2\2\2^`\7\60\2\2_a\4\62;\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc"+
		"\3\2\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2e\26\3\2\2\2fm\7\"\2\2gi\7\17\2"+
		"\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jm\7\f\2\2km\7\13\2\2lf\3\2\2\2lh\3\2"+
		"\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\f\2\2q\30\3"+
		"\2\2\2\n\2T\\bdhln\3\3\f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}