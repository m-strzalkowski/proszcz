// Generated from java-escape by ANTLR 4.11.1
package ms.gp.parser.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ProszczGPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, EOS=47, NAZWA=48, NAPIS_DOSL=49, STALA=50, IntegerLiteral=51, 
		COMMENT=52, SL_COMMENT=53, WS=54;
	public static final int
		RULE_plik = 0, RULE_instrukcja = 1, RULE_nazwanapis = 2, RULE_echo = 3, 
		RULE_ustaw_nazwe = 4, RULE_ustaw_katalog = 5, RULE_wykonaj_skrypt = 6, 
		RULE_przypadki = 7, RULE_opcja_przypadkow = 8, RULE_pisz_przypadki = 9, 
		RULE_funkcja_przystosowania = 10, RULE_fprzyst_klasa = 11, RULE_wczytaj_srodowisko = 12, 
		RULE_zapisz_srodowisko = 13, RULE_listuj_srodowiska = 14, RULE_rozmiar_populacji = 15, 
		RULE_inicjalizacja_populacji = 16, RULE_zapis_populacji = 17, RULE_zapis_populacji_gdzie = 18, 
		RULE_odczyt_populacji = 19, RULE_odczyt_populacji_gdzie = 20, RULE_listuj_populacje = 21, 
		RULE_nastepne = 22, RULE_statystyki = 23, RULE_nr_obecnej_generacji = 24, 
		RULE_inspekcja = 25, RULE_koniec_inspekcji = 26, RULE_inspekcja_srodowiska = 27, 
		RULE_zakoncz = 28, RULE_wstrzykniecie_osobnika_do_srodowiska = 29, RULE_ustawienie_wejsc = 30, 
		RULE_we_stdin = 31, RULE_we_tablica = 32, RULE_waga_operatora_genetycznego = 33, 
		RULE_listuj_operatory_genetyczne = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"plik", "instrukcja", "nazwanapis", "echo", "ustaw_nazwe", "ustaw_katalog", 
			"wykonaj_skrypt", "przypadki", "opcja_przypadkow", "pisz_przypadki", 
			"funkcja_przystosowania", "fprzyst_klasa", "wczytaj_srodowisko", "zapisz_srodowisko", 
			"listuj_srodowiska", "rozmiar_populacji", "inicjalizacja_populacji", 
			"zapis_populacji", "zapis_populacji_gdzie", "odczyt_populacji", "odczyt_populacji_gdzie", 
			"listuj_populacje", "nastepne", "statystyki", "nr_obecnej_generacji", 
			"inspekcja", "koniec_inspekcji", "inspekcja_srodowiska", "zakoncz", "wstrzykniecie_osobnika_do_srodowiska", 
			"ustawienie_wejsc", "we_stdin", "we_tablica", "waga_operatora_genetycznego", 
			"listuj_operatory_genetyczne"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'echo'", "'name'", "'cd'", "'exec'", "'cases'", "'from'", "'tinygp'", 
			"'plain'", "'show'", "','", "'fitfunc'", "'class'", "'in'", "'env'", 
			"'to'", "'envs'", "'popsize'", "'initpop'", "'grow'", "'full'", "'ramped-and-a-half'", 
			"'rah'", "'writepop'", "'readpop'", "'pops'", "'fwd'", "'stats'", "'gen'", 
			"'inspect'", "'resume'", "'halt'", "'inject'", "'specimen'", "'population'", 
			"'environment'", "'inj'", "':'", "'>'", "'setinput'", "'stdin'", "'op'", 
			"'genetic-operator'", "'%'", "'\\u00E2\\u20AC\\u00B0'", "'ops'", "'genetic-operators'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "EOS", 
			"NAZWA", "NAPIS_DOSL", "STALA", "IntegerLiteral", "COMMENT", "SL_COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProszczGPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlikContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ProszczGPParser.EOF, 0); }
		public List<InstrukcjaContext> instrukcja() {
			return getRuleContexts(InstrukcjaContext.class);
		}
		public InstrukcjaContext instrukcja(int i) {
			return getRuleContext(InstrukcjaContext.class,i);
		}
		public PlikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterPlik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitPlik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitPlik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlikContext plik() throws RecognitionException {
		PlikContext _localctx = new PlikContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_plik);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 112227487533630L) != 0) {
				{
				{
				setState(70);
				instrukcja();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrukcjaContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(ProszczGPParser.EOS, 0); }
		public EchoContext echo() {
			return getRuleContext(EchoContext.class,0);
		}
		public Ustaw_nazweContext ustaw_nazwe() {
			return getRuleContext(Ustaw_nazweContext.class,0);
		}
		public Ustaw_katalogContext ustaw_katalog() {
			return getRuleContext(Ustaw_katalogContext.class,0);
		}
		public Wykonaj_skryptContext wykonaj_skrypt() {
			return getRuleContext(Wykonaj_skryptContext.class,0);
		}
		public PrzypadkiContext przypadki() {
			return getRuleContext(PrzypadkiContext.class,0);
		}
		public Pisz_przypadkiContext pisz_przypadki() {
			return getRuleContext(Pisz_przypadkiContext.class,0);
		}
		public Funkcja_przystosowaniaContext funkcja_przystosowania() {
			return getRuleContext(Funkcja_przystosowaniaContext.class,0);
		}
		public Wczytaj_srodowiskoContext wczytaj_srodowisko() {
			return getRuleContext(Wczytaj_srodowiskoContext.class,0);
		}
		public Zapisz_srodowiskoContext zapisz_srodowisko() {
			return getRuleContext(Zapisz_srodowiskoContext.class,0);
		}
		public Listuj_srodowiskaContext listuj_srodowiska() {
			return getRuleContext(Listuj_srodowiskaContext.class,0);
		}
		public Rozmiar_populacjiContext rozmiar_populacji() {
			return getRuleContext(Rozmiar_populacjiContext.class,0);
		}
		public Inicjalizacja_populacjiContext inicjalizacja_populacji() {
			return getRuleContext(Inicjalizacja_populacjiContext.class,0);
		}
		public Zapis_populacjiContext zapis_populacji() {
			return getRuleContext(Zapis_populacjiContext.class,0);
		}
		public Odczyt_populacjiContext odczyt_populacji() {
			return getRuleContext(Odczyt_populacjiContext.class,0);
		}
		public Listuj_populacjeContext listuj_populacje() {
			return getRuleContext(Listuj_populacjeContext.class,0);
		}
		public NastepneContext nastepne() {
			return getRuleContext(NastepneContext.class,0);
		}
		public StatystykiContext statystyki() {
			return getRuleContext(StatystykiContext.class,0);
		}
		public Nr_obecnej_generacjiContext nr_obecnej_generacji() {
			return getRuleContext(Nr_obecnej_generacjiContext.class,0);
		}
		public InspekcjaContext inspekcja() {
			return getRuleContext(InspekcjaContext.class,0);
		}
		public Koniec_inspekcjiContext koniec_inspekcji() {
			return getRuleContext(Koniec_inspekcjiContext.class,0);
		}
		public Inspekcja_srodowiskaContext inspekcja_srodowiska() {
			return getRuleContext(Inspekcja_srodowiskaContext.class,0);
		}
		public ZakonczContext zakoncz() {
			return getRuleContext(ZakonczContext.class,0);
		}
		public Wstrzykniecie_osobnika_do_srodowiskaContext wstrzykniecie_osobnika_do_srodowiska() {
			return getRuleContext(Wstrzykniecie_osobnika_do_srodowiskaContext.class,0);
		}
		public Waga_operatora_genetycznegoContext waga_operatora_genetycznego() {
			return getRuleContext(Waga_operatora_genetycznegoContext.class,0);
		}
		public Listuj_operatory_genetyczneContext listuj_operatory_genetyczne() {
			return getRuleContext(Listuj_operatory_genetyczneContext.class,0);
		}
		public InstrukcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrukcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(78);
				echo();
				}
				break;
			case 2:
				{
				setState(79);
				ustaw_nazwe();
				}
				break;
			case 3:
				{
				setState(80);
				ustaw_katalog();
				}
				break;
			case 4:
				{
				setState(81);
				wykonaj_skrypt();
				}
				break;
			case 5:
				{
				setState(82);
				przypadki();
				}
				break;
			case 6:
				{
				setState(83);
				pisz_przypadki();
				}
				break;
			case 7:
				{
				setState(84);
				funkcja_przystosowania();
				}
				break;
			case 8:
				{
				setState(85);
				wczytaj_srodowisko();
				}
				break;
			case 9:
				{
				setState(86);
				zapisz_srodowisko();
				}
				break;
			case 10:
				{
				setState(87);
				listuj_srodowiska();
				}
				break;
			case 11:
				{
				setState(88);
				rozmiar_populacji();
				}
				break;
			case 12:
				{
				setState(89);
				inicjalizacja_populacji();
				}
				break;
			case 13:
				{
				setState(90);
				zapis_populacji();
				}
				break;
			case 14:
				{
				setState(91);
				odczyt_populacji();
				}
				break;
			case 15:
				{
				setState(92);
				listuj_populacje();
				}
				break;
			case 16:
				{
				setState(93);
				nastepne();
				}
				break;
			case 17:
				{
				setState(94);
				statystyki();
				}
				break;
			case 18:
				{
				setState(95);
				nr_obecnej_generacji();
				}
				break;
			case 19:
				{
				setState(96);
				inspekcja();
				}
				break;
			case 20:
				{
				setState(97);
				koniec_inspekcji();
				}
				break;
			case 21:
				{
				setState(98);
				inspekcja_srodowiska();
				}
				break;
			case 22:
				{
				setState(99);
				zakoncz();
				}
				break;
			case 23:
				{
				setState(100);
				wstrzykniecie_osobnika_do_srodowiska();
				}
				break;
			case 24:
				{
				setState(101);
				waga_operatora_genetycznego();
				}
				break;
			case 25:
				{
				setState(102);
				listuj_operatory_genetyczne();
				}
				break;
			}
			setState(105);
			match(EOS);
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
	public static class NazwanapisContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public NazwanapisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nazwanapis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterNazwanapis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitNazwanapis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitNazwanapis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NazwanapisContext nazwanapis() throws RecognitionException {
		NazwanapisContext _localctx = new NazwanapisContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nazwanapis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EchoContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public EchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterEcho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitEcho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitEcho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoContext echo() throws RecognitionException {
		EchoContext _localctx = new EchoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__0);
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ustaw_nazweContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Ustaw_nazweContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ustaw_nazwe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterUstaw_nazwe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitUstaw_nazwe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitUstaw_nazwe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ustaw_nazweContext ustaw_nazwe() throws RecognitionException {
		Ustaw_nazweContext _localctx = new Ustaw_nazweContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ustaw_nazwe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__1);
			setState(113);
			match(NAZWA);
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
	public static class Ustaw_katalogContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Ustaw_katalogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ustaw_katalog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterUstaw_katalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitUstaw_katalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitUstaw_katalog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ustaw_katalogContext ustaw_katalog() throws RecognitionException {
		Ustaw_katalogContext _localctx = new Ustaw_katalogContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ustaw_katalog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Wykonaj_skryptContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Wykonaj_skryptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wykonaj_skrypt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWykonaj_skrypt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWykonaj_skrypt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWykonaj_skrypt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wykonaj_skryptContext wykonaj_skrypt() throws RecognitionException {
		Wykonaj_skryptContext _localctx = new Wykonaj_skryptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wykonaj_skrypt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__3);
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrzypadkiContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public List<Opcja_przypadkowContext> opcja_przypadkow() {
			return getRuleContexts(Opcja_przypadkowContext.class);
		}
		public Opcja_przypadkowContext opcja_przypadkow(int i) {
			return getRuleContext(Opcja_przypadkowContext.class,i);
		}
		public PrzypadkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_przypadki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterPrzypadki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitPrzypadki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitPrzypadki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrzypadkiContext przypadki() throws RecognitionException {
		PrzypadkiContext _localctx = new PrzypadkiContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__4);
			setState(122);
			match(T__5);
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(124);
				opcja_przypadkow();
				}
				}
				setState(129);
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
	public static class Opcja_przypadkowContext extends ParserRuleContext {
		public Opcja_przypadkowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcja_przypadkow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterOpcja_przypadkow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitOpcja_przypadkow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitOpcja_przypadkow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opcja_przypadkowContext opcja_przypadkow() throws RecognitionException {
		Opcja_przypadkowContext _localctx = new Opcja_przypadkowContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_opcja_przypadkow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pisz_przypadkiContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public Pisz_przypadkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pisz_przypadki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterPisz_przypadki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitPisz_przypadki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitPisz_przypadki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pisz_przypadkiContext pisz_przypadki() throws RecognitionException {
		Pisz_przypadkiContext _localctx = new Pisz_przypadkiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pisz_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__8);
			setState(133);
			match(T__4);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(134);
				match(STALA);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(135);
					match(T__9);
					}
				}

				setState(138);
				match(STALA);
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
	public static class Funkcja_przystosowaniaContext extends ParserRuleContext {
		public Fprzyst_klasaContext fprzyst_klasa() {
			return getRuleContext(Fprzyst_klasaContext.class,0);
		}
		public Funkcja_przystosowaniaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funkcja_przystosowania; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterFunkcja_przystosowania(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitFunkcja_przystosowania(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitFunkcja_przystosowania(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funkcja_przystosowaniaContext funkcja_przystosowania() throws RecognitionException {
		Funkcja_przystosowaniaContext _localctx = new Funkcja_przystosowaniaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funkcja_przystosowania);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__10);
			setState(142);
			match(T__5);
			setState(143);
			fprzyst_klasa();
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
	public static class Fprzyst_klasaContext extends ParserRuleContext {
		public List<NazwanapisContext> nazwanapis() {
			return getRuleContexts(NazwanapisContext.class);
		}
		public NazwanapisContext nazwanapis(int i) {
			return getRuleContext(NazwanapisContext.class,i);
		}
		public Fprzyst_klasaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fprzyst_klasa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterFprzyst_klasa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitFprzyst_klasa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitFprzyst_klasa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fprzyst_klasaContext fprzyst_klasa() throws RecognitionException {
		Fprzyst_klasaContext _localctx = new Fprzyst_klasaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fprzyst_klasa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			setState(146);
			nazwanapis();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(147);
				match(T__12);
				setState(148);
				nazwanapis();
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
	public static class Wczytaj_srodowiskoContext extends ParserRuleContext {
		public List<NazwanapisContext> nazwanapis() {
			return getRuleContexts(NazwanapisContext.class);
		}
		public NazwanapisContext nazwanapis(int i) {
			return getRuleContext(NazwanapisContext.class,i);
		}
		public Wczytaj_srodowiskoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wczytaj_srodowisko; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWczytaj_srodowisko(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWczytaj_srodowisko(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWczytaj_srodowisko(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wczytaj_srodowiskoContext wczytaj_srodowisko() throws RecognitionException {
		Wczytaj_srodowiskoContext _localctx = new Wczytaj_srodowiskoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wczytaj_srodowisko);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__13);
			setState(152);
			nazwanapis();
			setState(153);
			match(T__5);
			setState(154);
			nazwanapis();
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
	public static class Zapisz_srodowiskoContext extends ParserRuleContext {
		public List<NazwanapisContext> nazwanapis() {
			return getRuleContexts(NazwanapisContext.class);
		}
		public NazwanapisContext nazwanapis(int i) {
			return getRuleContext(NazwanapisContext.class,i);
		}
		public Zapisz_srodowiskoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapisz_srodowisko; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterZapisz_srodowisko(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitZapisz_srodowisko(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitZapisz_srodowisko(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapisz_srodowiskoContext zapisz_srodowisko() throws RecognitionException {
		Zapisz_srodowiskoContext _localctx = new Zapisz_srodowiskoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_zapisz_srodowisko);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__13);
			setState(157);
			nazwanapis();
			setState(158);
			match(T__14);
			setState(159);
			nazwanapis();
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
	public static class Listuj_srodowiskaContext extends ParserRuleContext {
		public Listuj_srodowiskaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listuj_srodowiska; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterListuj_srodowiska(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitListuj_srodowiska(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitListuj_srodowiska(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listuj_srodowiskaContext listuj_srodowiska() throws RecognitionException {
		Listuj_srodowiskaContext _localctx = new Listuj_srodowiskaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listuj_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__15);
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
	public static class Rozmiar_populacjiContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
		public Rozmiar_populacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rozmiar_populacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterRozmiar_populacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitRozmiar_populacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitRozmiar_populacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rozmiar_populacjiContext rozmiar_populacji() throws RecognitionException {
		Rozmiar_populacjiContext _localctx = new Rozmiar_populacjiContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rozmiar_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__16);
			setState(164);
			match(NAZWA);
			setState(165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Inicjalizacja_populacjiContext extends ParserRuleContext {
		public Token typ;
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
		public Inicjalizacja_populacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicjalizacja_populacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterInicjalizacja_populacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitInicjalizacja_populacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitInicjalizacja_populacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inicjalizacja_populacjiContext inicjalizacja_populacji() throws RecognitionException {
		Inicjalizacja_populacjiContext _localctx = new Inicjalizacja_populacjiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inicjalizacja_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__17);
			setState(168);
			match(NAZWA);
			setState(169);
			((Inicjalizacja_populacjiContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0) ) {
				((Inicjalizacja_populacjiContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Zapis_populacjiContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Zapis_populacji_gdzieContext zapis_populacji_gdzie() {
			return getRuleContext(Zapis_populacji_gdzieContext.class,0);
		}
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public Zapis_populacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapis_populacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterZapis_populacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitZapis_populacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitZapis_populacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapis_populacjiContext zapis_populacji() throws RecognitionException {
		Zapis_populacjiContext _localctx = new Zapis_populacjiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_zapis_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__22);
			setState(173);
			match(NAZWA);
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				{
				setState(174);
				zapis_populacji_gdzie();
				}
				}
				break;
			case EOS:
			case STALA:
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STALA) {
					{
					setState(175);
					match(STALA);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(176);
						match(T__9);
						}
					}

					setState(179);
					match(STALA);
					}
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
	public static class Zapis_populacji_gdzieContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Zapis_populacji_gdzieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapis_populacji_gdzie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterZapis_populacji_gdzie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitZapis_populacji_gdzie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitZapis_populacji_gdzie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapis_populacji_gdzieContext zapis_populacji_gdzie() throws RecognitionException {
		Zapis_populacji_gdzieContext _localctx = new Zapis_populacji_gdzieContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_zapis_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(184);
			match(T__14);
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Odczyt_populacjiContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Odczyt_populacji_gdzieContext odczyt_populacji_gdzie() {
			return getRuleContext(Odczyt_populacji_gdzieContext.class,0);
		}
		public Odczyt_populacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_odczyt_populacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterOdczyt_populacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitOdczyt_populacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitOdczyt_populacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Odczyt_populacjiContext odczyt_populacji() throws RecognitionException {
		Odczyt_populacjiContext _localctx = new Odczyt_populacjiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_odczyt_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(T__23);
			setState(188);
			match(NAZWA);
			setState(189);
			odczyt_populacji_gdzie();
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
	public static class Odczyt_populacji_gdzieContext extends ParserRuleContext {
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Odczyt_populacji_gdzieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_odczyt_populacji_gdzie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterOdczyt_populacji_gdzie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitOdczyt_populacji_gdzie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitOdczyt_populacji_gdzie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Odczyt_populacji_gdzieContext odczyt_populacji_gdzie() throws RecognitionException {
		Odczyt_populacji_gdzieContext _localctx = new Odczyt_populacji_gdzieContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_odczyt_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			match(T__5);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Listuj_populacjeContext extends ParserRuleContext {
		public Listuj_populacjeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listuj_populacje; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterListuj_populacje(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitListuj_populacje(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitListuj_populacje(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listuj_populacjeContext listuj_populacje() throws RecognitionException {
		Listuj_populacjeContext _localctx = new Listuj_populacjeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_listuj_populacje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__24);
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
	public static class NastepneContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public NastepneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nastepne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterNastepne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitNastepne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitNastepne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NastepneContext nastepne() throws RecognitionException {
		NastepneContext _localctx = new NastepneContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nastepne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__25);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(197);
				match(STALA);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(198);
					match(T__9);
					setState(199);
					match(STALA);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatystykiContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public StatystykiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statystyki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterStatystyki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitStatystyki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitStatystyki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatystykiContext statystyki() throws RecognitionException {
		StatystykiContext _localctx = new StatystykiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statystyki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__26);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(205);
				match(STALA);
				}
				break;
			}
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(208);
				match(STALA);
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
	public static class Nr_obecnej_generacjiContext extends ParserRuleContext {
		public Nr_obecnej_generacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nr_obecnej_generacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterNr_obecnej_generacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitNr_obecnej_generacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitNr_obecnej_generacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nr_obecnej_generacjiContext nr_obecnej_generacji() throws RecognitionException {
		Nr_obecnej_generacjiContext _localctx = new Nr_obecnej_generacjiContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nr_obecnej_generacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__27);
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
	public static class InspekcjaContext extends ParserRuleContext {
		public InspekcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inspekcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterInspekcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitInspekcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitInspekcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InspekcjaContext inspekcja() throws RecognitionException {
		InspekcjaContext _localctx = new InspekcjaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_inspekcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__28);
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
	public static class Koniec_inspekcjiContext extends ParserRuleContext {
		public Koniec_inspekcjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_koniec_inspekcji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterKoniec_inspekcji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitKoniec_inspekcji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitKoniec_inspekcji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Koniec_inspekcjiContext koniec_inspekcji() throws RecognitionException {
		Koniec_inspekcjiContext _localctx = new Koniec_inspekcjiContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_koniec_inspekcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__29);
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
	public static class Inspekcja_srodowiskaContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public Inspekcja_srodowiskaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inspekcja_srodowiska; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterInspekcja_srodowiska(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitInspekcja_srodowiska(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitInspekcja_srodowiska(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inspekcja_srodowiskaContext inspekcja_srodowiska() throws RecognitionException {
		Inspekcja_srodowiskaContext _localctx = new Inspekcja_srodowiskaContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_inspekcja_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__28);
			setState(218);
			match(T__13);
			setState(219);
			match(NAZWA);
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
	public static class ZakonczContext extends ParserRuleContext {
		public ZakonczContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zakoncz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterZakoncz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitZakoncz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitZakoncz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZakonczContext zakoncz() throws RecognitionException {
		ZakonczContext _localctx = new ZakonczContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_zakoncz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__30);
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
	public static class Wstrzykniecie_osobnika_do_srodowiskaContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
		public List<TerminalNode> NAZWA() { return getTokens(ProszczGPParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(ProszczGPParser.NAZWA, i);
		}
		public Wstrzykniecie_osobnika_do_srodowiskaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wstrzykniecie_osobnika_do_srodowiska; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWstrzykniecie_osobnika_do_srodowiska(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWstrzykniecie_osobnika_do_srodowiska(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWstrzykniecie_osobnika_do_srodowiska(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wstrzykniecie_osobnika_do_srodowiskaContext wstrzykniecie_osobnika_do_srodowiska() throws RecognitionException {
		Wstrzykniecie_osobnika_do_srodowiskaContext _localctx = new Wstrzykniecie_osobnika_do_srodowiskaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_wstrzykniecie_osobnika_do_srodowiska);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(223);
				match(T__31);
				setState(224);
				match(T__32);
				setState(225);
				match(STALA);
				setState(226);
				match(T__5);
				setState(227);
				match(T__33);
				setState(228);
				match(NAZWA);
				setState(229);
				match(T__14);
				setState(230);
				match(T__34);
				setState(231);
				match(NAZWA);
				}
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(232);
				match(T__35);
				setState(233);
				match(NAZWA);
				setState(234);
				match(T__36);
				setState(235);
				match(STALA);
				setState(236);
				match(T__37);
				setState(237);
				match(NAZWA);
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
	public static class Ustawienie_wejscContext extends ParserRuleContext {
		public List<NazwanapisContext> nazwanapis() {
			return getRuleContexts(NazwanapisContext.class);
		}
		public NazwanapisContext nazwanapis(int i) {
			return getRuleContext(NazwanapisContext.class,i);
		}
		public We_stdinContext we_stdin() {
			return getRuleContext(We_stdinContext.class,0);
		}
		public We_tablicaContext we_tablica() {
			return getRuleContext(We_tablicaContext.class,0);
		}
		public Ustawienie_wejscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ustawienie_wejsc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterUstawienie_wejsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitUstawienie_wejsc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitUstawienie_wejsc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ustawienie_wejscContext ustawienie_wejsc() throws RecognitionException {
		Ustawienie_wejscContext _localctx = new Ustawienie_wejscContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ustawienie_wejsc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(240);
			match(T__38);
			setState(241);
			nazwanapis();
			setState(242);
			match(T__12);
			setState(243);
			nazwanapis();
			setState(244);
			match(T__14);
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				{
				setState(245);
				we_stdin();
				}
				break;
			case EOF:
			case STALA:
				{
				setState(246);
				we_tablica();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class We_stdinContext extends ParserRuleContext {
		public We_stdinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_we_stdin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWe_stdin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWe_stdin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWe_stdin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final We_stdinContext we_stdin() throws RecognitionException {
		We_stdinContext _localctx = new We_stdinContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_we_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__39);
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
	public static class We_tablicaContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public We_tablicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_we_tablica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWe_tablica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWe_tablica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWe_tablica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final We_tablicaContext we_tablica() throws RecognitionException {
		We_tablicaContext _localctx = new We_tablicaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_we_tablica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STALA) {
				{
				{
				setState(251);
				match(STALA);
				}
				}
				setState(256);
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
	public static class Waga_operatora_genetycznegoContext extends ParserRuleContext {
		public Token zn;
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
		public Waga_operatora_genetycznegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waga_operatora_genetycznego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWaga_operatora_genetycznego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWaga_operatora_genetycznego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWaga_operatora_genetycznego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Waga_operatora_genetycznegoContext waga_operatora_genetycznego() throws RecognitionException {
		Waga_operatora_genetycznegoContext _localctx = new Waga_operatora_genetycznegoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_waga_operatora_genetycznego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(258);
			match(NAZWA);
			setState(259);
			match(STALA);
			setState(260);
			((Waga_operatora_genetycznegoContext)_localctx).zn = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
				((Waga_operatora_genetycznegoContext)_localctx).zn = (Token)_errHandler.recoverInline(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Listuj_operatory_genetyczneContext extends ParserRuleContext {
		public Listuj_operatory_genetyczneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listuj_operatory_genetyczne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterListuj_operatory_genetyczne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitListuj_operatory_genetyczne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitListuj_operatory_genetyczne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Listuj_operatory_genetyczneContext listuj_operatory_genetyczne() throws RecognitionException {
		Listuj_operatory_genetyczneContext _localctx = new Listuj_operatory_genetyczneContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listuj_operatory_genetyczne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
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
		"\u0004\u00016\u0109\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001h\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007~\b\u0007\n\u0007\f\u0007\u0081\t\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0003\t\u0089\b\t\u0001\t\u0003\t\u008c\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0096\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00b2\b\u0011\u0001\u0011\u0003\u0011\u00b5\b"+
		"\u0011\u0003\u0011\u00b7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00c9\b\u0016\u0003\u0016\u00cb\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u00cf\b\u0017\u0001\u0017\u0003\u0017\u00d2\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00ef\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u00f8\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0005"+
		" \u00fd\b \n \f \u0100\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BD\u0000\u0006\u0001"+
		"\u000001\u0001\u0000\u0007\b\u0001\u0000\u0013\u0016\u0001\u0000)*\u0001"+
		"\u0000+,\u0001\u0000-.\u010c\u0000I\u0001\u0000\u0000\u0000\u0002g\u0001"+
		"\u0000\u0000\u0000\u0004k\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000"+
		"\u0000\bp\u0001\u0000\u0000\u0000\ns\u0001\u0000\u0000\u0000\fv\u0001"+
		"\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010\u0082\u0001\u0000"+
		"\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u008d\u0001\u0000"+
		"\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0097\u0001\u0000"+
		"\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00a1\u0001\u0000"+
		"\u0000\u0000\u001e\u00a3\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000"+
		"\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00b8\u0001\u0000\u0000\u0000"+
		"&\u00bb\u0001\u0000\u0000\u0000(\u00bf\u0001\u0000\u0000\u0000*\u00c2"+
		"\u0001\u0000\u0000\u0000,\u00c4\u0001\u0000\u0000\u0000.\u00cc\u0001\u0000"+
		"\u0000\u00000\u00d3\u0001\u0000\u0000\u00002\u00d5\u0001\u0000\u0000\u0000"+
		"4\u00d7\u0001\u0000\u0000\u00006\u00d9\u0001\u0000\u0000\u00008\u00dd"+
		"\u0001\u0000\u0000\u0000:\u00ee\u0001\u0000\u0000\u0000<\u00f0\u0001\u0000"+
		"\u0000\u0000>\u00f9\u0001\u0000\u0000\u0000@\u00fe\u0001\u0000\u0000\u0000"+
		"B\u0101\u0001\u0000\u0000\u0000D\u0106\u0001\u0000\u0000\u0000FH\u0003"+
		"\u0002\u0001\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0000\u0000\u0001M\u0001\u0001"+
		"\u0000\u0000\u0000Nh\u0003\u0006\u0003\u0000Oh\u0003\b\u0004\u0000Ph\u0003"+
		"\n\u0005\u0000Qh\u0003\f\u0006\u0000Rh\u0003\u000e\u0007\u0000Sh\u0003"+
		"\u0012\t\u0000Th\u0003\u0014\n\u0000Uh\u0003\u0018\f\u0000Vh\u0003\u001a"+
		"\r\u0000Wh\u0003\u001c\u000e\u0000Xh\u0003\u001e\u000f\u0000Yh\u0003 "+
		"\u0010\u0000Zh\u0003\"\u0011\u0000[h\u0003&\u0013\u0000\\h\u0003*\u0015"+
		"\u0000]h\u0003,\u0016\u0000^h\u0003.\u0017\u0000_h\u00030\u0018\u0000"+
		"`h\u00032\u0019\u0000ah\u00034\u001a\u0000bh\u00036\u001b\u0000ch\u0003"+
		"8\u001c\u0000dh\u0003:\u001d\u0000eh\u0003B!\u0000fh\u0003D\"\u0000gN"+
		"\u0001\u0000\u0000\u0000gO\u0001\u0000\u0000\u0000gP\u0001\u0000\u0000"+
		"\u0000gQ\u0001\u0000\u0000\u0000gR\u0001\u0000\u0000\u0000gS\u0001\u0000"+
		"\u0000\u0000gT\u0001\u0000\u0000\u0000gU\u0001\u0000\u0000\u0000gV\u0001"+
		"\u0000\u0000\u0000gW\u0001\u0000\u0000\u0000gX\u0001\u0000\u0000\u0000"+
		"gY\u0001\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000g[\u0001\u0000\u0000"+
		"\u0000g\\\u0001\u0000\u0000\u0000g]\u0001\u0000\u0000\u0000g^\u0001\u0000"+
		"\u0000\u0000g_\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000ga\u0001"+
		"\u0000\u0000\u0000gb\u0001\u0000\u0000\u0000gc\u0001\u0000\u0000\u0000"+
		"gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ij\u0005/\u0000\u0000j\u0003\u0001\u0000"+
		"\u0000\u0000kl\u0007\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0001\u0000\u0000no\u0007\u0000\u0000\u0000o\u0007\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0002\u0000\u0000qr\u00050\u0000\u0000r\t\u0001\u0000"+
		"\u0000\u0000st\u0005\u0003\u0000\u0000tu\u0007\u0000\u0000\u0000u\u000b"+
		"\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000wx\u0007\u0000\u0000"+
		"\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0005\u0006"+
		"\u0000\u0000{\u007f\u0007\u0000\u0000\u0000|~\u0003\u0010\b\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u000f\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0001\u0000"+
		"\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084\u0085\u0005\t\u0000\u0000"+
		"\u0085\u008b\u0005\u0005\u0000\u0000\u0086\u0088\u00052\u0000\u0000\u0087"+
		"\u0089\u0005\n\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c"+
		"\u00052\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0005"+
		"\u000b\u0000\u0000\u008e\u008f\u0005\u0006\u0000\u0000\u008f\u0090\u0003"+
		"\u0016\u000b\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\f\u0000\u0000\u0092\u0095\u0003\u0004\u0002\u0000\u0093\u0094\u0005\r"+
		"\u0000\u0000\u0094\u0096\u0003\u0004\u0002\u0000\u0095\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0017\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\u000e\u0000\u0000\u0098\u0099\u0003\u0004"+
		"\u0002\u0000\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u009b\u0003\u0004"+
		"\u0002\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u000e"+
		"\u0000\u0000\u009d\u009e\u0003\u0004\u0002\u0000\u009e\u009f\u0005\u000f"+
		"\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0\u001b\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2\u001d\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4\u00a5\u00050\u0000"+
		"\u0000\u00a5\u00a6\u00052\u0000\u0000\u00a6\u001f\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a8\u0005\u0012\u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9"+
		"\u00aa\u0007\u0002\u0000\u0000\u00aa\u00ab\u00052\u0000\u0000\u00ab!\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0017\u0000\u0000\u00ad\u00b6\u0005"+
		"0\u0000\u0000\u00ae\u00b7\u0003$\u0012\u0000\u00af\u00b1\u00052\u0000"+
		"\u0000\u00b0\u00b2\u0005\n\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b5\u00052\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"#\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u000f\u0000\u0000\u00b9\u00ba"+
		"\u0007\u0000\u0000\u0000\u00ba%\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u0018\u0000\u0000\u00bc\u00bd\u00050\u0000\u0000\u00bd\u00be\u0003(\u0014"+
		"\u0000\u00be\'\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000"+
		"\u00c0\u00c1\u0007\u0000\u0000\u0000\u00c1)\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0005\u0019\u0000\u0000\u00c3+\u0001\u0000\u0000\u0000\u00c4\u00ca"+
		"\u0005\u001a\u0000\u0000\u00c5\u00c8\u00052\u0000\u0000\u00c6\u00c7\u0005"+
		"\n\u0000\u0000\u00c7\u00c9\u00052\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c5\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb-\u0001\u0000\u0000\u0000\u00cc\u00ce\u0005\u001b\u0000"+
		"\u0000\u00cd\u00cf\u00052\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d2\u00052\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2/\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001c\u0000\u0000\u00d41\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u001d\u0000\u0000\u00d63\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u001e"+
		"\u0000\u0000\u00d85\u0001\u0000\u0000\u0000\u00d9\u00da\u0005\u001d\u0000"+
		"\u0000\u00da\u00db\u0005\u000e\u0000\u0000\u00db\u00dc\u00050\u0000\u0000"+
		"\u00dc7\u0001\u0000\u0000\u0000\u00dd\u00de\u0005\u001f\u0000\u0000\u00de"+
		"9\u0001\u0000\u0000\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0\u00e1\u0005"+
		"!\u0000\u0000\u00e1\u00e2\u00052\u0000\u0000\u00e2\u00e3\u0005\u0006\u0000"+
		"\u0000\u00e3\u00e4\u0005\"\u0000\u0000\u00e4\u00e5\u00050\u0000\u0000"+
		"\u00e5\u00e6\u0005\u000f\u0000\u0000\u00e6\u00e7\u0005#\u0000\u0000\u00e7"+
		"\u00ef\u00050\u0000\u0000\u00e8\u00e9\u0005$\u0000\u0000\u00e9\u00ea\u0005"+
		"0\u0000\u0000\u00ea\u00eb\u0005%\u0000\u0000\u00eb\u00ec\u00052\u0000"+
		"\u0000\u00ec\u00ed\u0005&\u0000\u0000\u00ed\u00ef\u00050\u0000\u0000\u00ee"+
		"\u00df\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ef"+
		";\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\'\u0000\u0000\u00f1\u00f2"+
		"\u0003\u0004\u0002\u0000\u00f2\u00f3\u0005\r\u0000\u0000\u00f3\u00f4\u0003"+
		"\u0004\u0002\u0000\u00f4\u00f7\u0005\u000f\u0000\u0000\u00f5\u00f8\u0003"+
		">\u001f\u0000\u00f6\u00f8\u0003@ \u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8=\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fa\u0005(\u0000\u0000\u00fa?\u0001\u0000\u0000\u0000\u00fb\u00fd"+
		"\u00052\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ffA\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0007\u0003\u0000\u0000\u0102\u0103\u00050\u0000"+
		"\u0000\u0103\u0104\u00052\u0000\u0000\u0104\u0105\u0007\u0004\u0000\u0000"+
		"\u0105C\u0001\u0000\u0000\u0000\u0106\u0107\u0007\u0005\u0000\u0000\u0107"+
		"E\u0001\u0000\u0000\u0000\u0010Ig\u007f\u0088\u008b\u0095\u00b1\u00b4"+
		"\u00b6\u00c8\u00ca\u00ce\u00d1\u00ee\u00f7\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}