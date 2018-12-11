// Generated from UniKoblenz.g4 by ANTLR 4.7.1

package org.softlang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UniKoblenzParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, CAMPUS=14, WIFIAVAILABILITY=15, 
		WIFISPEED=16, SERVERAVAILABILITY=17, MENU=18, STRING=19, FLOAT=20, WS=21;
	public static final int
		RULE_uniKoblenz = 0, RULE_faculty = 1, RULE_mensa = 2, RULE_wifihotspot = 3, 
		RULE_server = 4, RULE_student = 5, RULE_employee = 6;
	public static final String[] ruleNames = {
		"uniKoblenz", "faculty", "mensa", "wifihotspot", "server", "student", 
		"employee"
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

	@Override
	public String getGrammarFileName() { return "UniKoblenz.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UniKoblenzParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UniKoblenzContext extends ParserRuleContext {
		public TerminalNode CAMPUS() { return getToken(UniKoblenzParser.CAMPUS, 0); }
		public MensaContext mensa() {
			return getRuleContext(MensaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UniKoblenzParser.EOF, 0); }
		public List<FacultyContext> faculty() {
			return getRuleContexts(FacultyContext.class);
		}
		public FacultyContext faculty(int i) {
			return getRuleContext(FacultyContext.class,i);
		}
		public List<EmployeeContext> employee() {
			return getRuleContexts(EmployeeContext.class);
		}
		public EmployeeContext employee(int i) {
			return getRuleContext(EmployeeContext.class,i);
		}
		public List<StudentContext> student() {
			return getRuleContexts(StudentContext.class);
		}
		public StudentContext student(int i) {
			return getRuleContext(StudentContext.class,i);
		}
		public List<WifihotspotContext> wifihotspot() {
			return getRuleContexts(WifihotspotContext.class);
		}
		public WifihotspotContext wifihotspot(int i) {
			return getRuleContext(WifihotspotContext.class,i);
		}
		public UniKoblenzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniKoblenz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterUniKoblenz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitUniKoblenz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitUniKoblenz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniKoblenzContext uniKoblenz() throws RecognitionException {
		UniKoblenzContext _localctx = new UniKoblenzContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_uniKoblenz);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			match(T__1);
			setState(16);
			match(T__2);
			setState(17);
			match(CAMPUS);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(18);
				faculty();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					employee();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					student();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(36);
				wifihotspot();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			mensa();
			setState(43);
			match(T__3);
			setState(44);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FacultyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UniKoblenzParser.STRING, 0); }
		public EmployeeContext employee() {
			return getRuleContext(EmployeeContext.class,0);
		}
		public FacultyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faculty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterFaculty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitFaculty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitFaculty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FacultyContext faculty() throws RecognitionException {
		FacultyContext _localctx = new FacultyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_faculty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__4);
			setState(47);
			match(STRING);
			setState(48);
			match(T__1);
			setState(49);
			match(T__5);
			setState(50);
			employee();
			setState(51);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MensaContext extends ParserRuleContext {
		public TerminalNode MENU() { return getToken(UniKoblenzParser.MENU, 0); }
		public MensaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterMensa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitMensa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitMensa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MensaContext mensa() throws RecognitionException {
		MensaContext _localctx = new MensaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mensa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__1);
			setState(54);
			match(T__6);
			setState(55);
			match(MENU);
			setState(56);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WifihotspotContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(UniKoblenzParser.STRING, 0); }
		public TerminalNode WIFIAVAILABILITY() { return getToken(UniKoblenzParser.WIFIAVAILABILITY, 0); }
		public TerminalNode WIFISPEED() { return getToken(UniKoblenzParser.WIFISPEED, 0); }
		public WifihotspotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wifihotspot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterWifihotspot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitWifihotspot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitWifihotspot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WifihotspotContext wifihotspot() throws RecognitionException {
		WifihotspotContext _localctx = new WifihotspotContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_wifihotspot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(STRING);
			setState(59);
			match(T__1);
			setState(60);
			match(T__7);
			setState(61);
			match(WIFIAVAILABILITY);
			setState(62);
			match(T__8);
			setState(63);
			match(WIFISPEED);
			setState(64);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ServerContext extends ParserRuleContext {
		public List<TerminalNode> SERVERAVAILABILITY() { return getTokens(UniKoblenzParser.SERVERAVAILABILITY); }
		public TerminalNode SERVERAVAILABILITY(int i) {
			return getToken(UniKoblenzParser.SERVERAVAILABILITY, i);
		}
		public ServerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterServer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitServer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitServer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerContext server() throws RecognitionException {
		ServerContext _localctx = new ServerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_server);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__1);
			setState(67);
			match(T__9);
			setState(68);
			match(SERVERAVAILABILITY);
			setState(69);
			match(T__10);
			setState(70);
			match(SERVERAVAILABILITY);
			setState(71);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StudentContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(UniKoblenzParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UniKoblenzParser.STRING, i);
		}
		public StudentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_student; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterStudent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitStudent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitStudent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StudentContext student() throws RecognitionException {
		StudentContext _localctx = new StudentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_student);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
			setState(74);
			match(T__1);
			setState(75);
			match(T__11);
			setState(76);
			match(STRING);
			setState(77);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmployeeContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(UniKoblenzParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(UniKoblenzParser.STRING, i);
		}
		public TerminalNode FLOAT() { return getToken(UniKoblenzParser.FLOAT, 0); }
		public EmployeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_employee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).enterEmployee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UniKoblenzListener ) ((UniKoblenzListener)listener).exitEmployee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UniKoblenzVisitor ) return ((UniKoblenzVisitor<? extends T>)visitor).visitEmployee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmployeeContext employee() throws RecognitionException {
		EmployeeContext _localctx = new EmployeeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_employee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(STRING);
			setState(80);
			match(T__1);
			setState(81);
			match(T__12);
			setState(82);
			match(FLOAT);
			setState(83);
			match(T__11);
			setState(84);
			match(STRING);
			setState(85);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f"+
		"\2\16\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2V\2\20\3\2\2\2\4\60\3\2\2\2"+
		"\6\67\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fK\3\2\2\2\16Q\3\2\2\2\20\21\7\3\2"+
		"\2\21\22\7\4\2\2\22\23\7\5\2\2\23\27\7\20\2\2\24\26\5\4\3\2\25\24\3\2"+
		"\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\35\3\2\2\2\31\27\3\2"+
		"\2\2\32\34\5\16\b\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3"+
		"\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5\f\7\2! \3\2\2\2\"%\3\2\2\2#!\3\2"+
		"\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\5\6\4\2-.\7\6\2\2./\7\2\2\3/\3"+
		"\3\2\2\2\60\61\7\7\2\2\61\62\7\25\2\2\62\63\7\4\2\2\63\64\7\b\2\2\64\65"+
		"\5\16\b\2\65\66\7\6\2\2\66\5\3\2\2\2\678\7\4\2\289\7\t\2\29:\7\24\2\2"+
		":;\7\6\2\2;\7\3\2\2\2<=\7\25\2\2=>\7\4\2\2>?\7\n\2\2?@\7\21\2\2@A\7\13"+
		"\2\2AB\7\22\2\2BC\7\6\2\2C\t\3\2\2\2DE\7\4\2\2EF\7\f\2\2FG\7\23\2\2GH"+
		"\7\r\2\2HI\7\23\2\2IJ\7\6\2\2J\13\3\2\2\2KL\7\25\2\2LM\7\4\2\2MN\7\16"+
		"\2\2NO\7\25\2\2OP\7\6\2\2P\r\3\2\2\2QR\7\25\2\2RS\7\4\2\2ST\7\17\2\2T"+
		"U\7\26\2\2UV\7\16\2\2VW\7\25\2\2WX\7\6\2\2X\17\3\2\2\2\6\27\35#)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}