// Generated from C:/Users/mastr/Documents/MS/STUDIA/Programowanie_genetyczne/Upraszczacz/src/ms\wyr.g4 by ANTLR 4.9.2
package ms.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class wyrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ZMIENNA=9, 
		NAZWA=10, STALA=11, IntegerLiteral=12, COMMENT=13, WS=14;
	public static final int
		RULE_program = 0, RULE_wyrazenie = 1, RULE_wywolanie_funkcji = 2, RULE_lista_parametrow_aktualnych = 3, 
		RULE_zmienna = 4, RULE_stala_atom = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "wyrazenie", "wywolanie_funkcji", "lista_parametrow_aktualnych", 
			"zmienna", "stala_atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'+'", "'*'", "'/'", "'%'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "ZMIENNA", "NAZWA", 
			"STALA", "IntegerLiteral", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "wyr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public wyrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode EOF() { return getToken(wyrParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			wyrazenie(0);
			setState(13);
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

	public static class WyrazenieContext extends ParserRuleContext {
		public WyrazenieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyrazenie; }
	 
		public WyrazenieContext() { }
		public void copyFrom(WyrazenieContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WyrazenieMultContext extends WyrazenieContext {
		public Token mult;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieMultContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieNawiasyContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieNawiasyContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieNawiasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieNawiasy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieNawiasy(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieZmiennaContext extends WyrazenieContext {
		public ZmiennaContext zmienna() {
			return getRuleContext(ZmiennaContext.class,0);
		}
		public WyrazenieZmiennaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieZmienna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieZmienna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieZmienna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieAddytContext extends WyrazenieContext {
		public Token addyt;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieAddytContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieAddyt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieWywolanieContext extends WyrazenieContext {
		public Wywolanie_funkcjiContext wywolanie_funkcji() {
			return getRuleContext(Wywolanie_funkcjiContext.class,0);
		}
		public WyrazenieWywolanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieWywolanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieWywolanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieWywolanie(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieStalaContext extends WyrazenieContext {
		public Stala_atomContext stala_atom() {
			return getRuleContext(Stala_atomContext.class,0);
		}
		public WyrazenieStalaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieStala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieStala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieStala(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WyrazenieZnakContext extends WyrazenieContext {
		public Token znak;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieZnakContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWyrazenieZnak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWyrazenieZnak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWyrazenieZnak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WyrazenieContext wyrazenie() throws RecognitionException {
		return wyrazenie(0);
	}

	private WyrazenieContext wyrazenie(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WyrazenieContext _localctx = new WyrazenieContext(_ctx, _parentState);
		WyrazenieContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAZWA:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(16);
				wywolanie_funkcji();
				}
				break;
			case ZMIENNA:
				{
				_localctx = new WyrazenieZmiennaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(17);
				zmienna();
				}
				break;
			case T__0:
			case T__1:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(18);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(19);
				wyrazenie(5);
				}
				break;
			case STALA:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				stala_atom();
				}
				break;
			case T__5:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				match(T__5);
				setState(22);
				wyrazenie(0);
				setState(23);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(27);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(28);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(29);
						wyrazenie(5);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(30);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(31);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(32);
						wyrazenie(4);
						}
						break;
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Wywolanie_funkcjiContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(wyrParser.NAZWA, 0); }
		public Lista_parametrow_aktualnychContext lista_parametrow_aktualnych() {
			return getRuleContext(Lista_parametrow_aktualnychContext.class,0);
		}
		public Wywolanie_funkcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wywolanie_funkcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterWywolanie_funkcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitWywolanie_funkcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitWywolanie_funkcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wywolanie_funkcjiContext wywolanie_funkcji() throws RecognitionException {
		Wywolanie_funkcjiContext _localctx = new Wywolanie_funkcjiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_wywolanie_funkcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NAZWA);
			setState(39);
			match(T__5);
			setState(40);
			lista_parametrow_aktualnych();
			setState(41);
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

	public static class Lista_parametrow_aktualnychContext extends ParserRuleContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public Lista_parametrow_aktualnychContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametrow_aktualnych; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterLista_parametrow_aktualnych(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitLista_parametrow_aktualnych(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitLista_parametrow_aktualnych(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrow_aktualnychContext lista_parametrow_aktualnych() throws RecognitionException {
		Lista_parametrow_aktualnychContext _localctx = new Lista_parametrow_aktualnychContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_parametrow_aktualnych);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__5) | (1L << ZMIENNA) | (1L << NAZWA) | (1L << STALA))) != 0)) {
				{
				setState(43);
				wyrazenie(0);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(44);
					match(T__7);
					setState(45);
					wyrazenie(0);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ZmiennaContext extends ParserRuleContext {
		public TerminalNode ZMIENNA() { return getToken(wyrParser.ZMIENNA, 0); }
		public ZmiennaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zmienna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterZmienna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitZmienna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitZmienna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZmiennaContext zmienna() throws RecognitionException {
		ZmiennaContext _localctx = new ZmiennaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_zmienna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ZMIENNA);
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

	public static class Stala_atomContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(wyrParser.STALA, 0); }
		public Stala_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stala_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).enterStala_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof wyrListener ) ((wyrListener)listener).exitStala_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof wyrVisitor ) return ((wyrVisitor<? extends T>)visitor).visitStala_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stala_atomContext stala_atom() throws RecognitionException {
		Stala_atomContext _localctx = new Stala_atomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stala_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(STALA);
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
		case 1:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3\f\3\16\3"+
		"\'\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13\5\5"+
		"\5\66\n\5\3\6\3\6\3\7\3\7\3\7\2\3\4\b\2\4\6\b\n\f\2\4\3\2\3\4\3\2\5\7"+
		"\2=\2\16\3\2\2\2\4\33\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\n\67\3\2\2\2\f9"+
		"\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\b\3\1\2\22\34"+
		"\5\6\4\2\23\34\5\n\6\2\24\25\t\2\2\2\25\34\5\4\3\7\26\34\5\f\7\2\27\30"+
		"\7\b\2\2\30\31\5\4\3\2\31\32\7\t\2\2\32\34\3\2\2\2\33\21\3\2\2\2\33\23"+
		"\3\2\2\2\33\24\3\2\2\2\33\26\3\2\2\2\33\27\3\2\2\2\34%\3\2\2\2\35\36\f"+
		"\6\2\2\36\37\t\3\2\2\37$\5\4\3\7 !\f\5\2\2!\"\t\2\2\2\"$\5\4\3\6#\35\3"+
		"\2\2\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2"+
		"()\7\f\2\2)*\7\b\2\2*+\5\b\5\2+,\7\t\2\2,\7\3\2\2\2-\62\5\4\3\2./\7\n"+
		"\2\2/\61\5\4\3\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65\66\3\2\2\2\66\t\3\2\2\2\67"+
		"8\7\13\2\28\13\3\2\2\29:\7\r\2\2:\r\3\2\2\2\7\33#%\62\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}