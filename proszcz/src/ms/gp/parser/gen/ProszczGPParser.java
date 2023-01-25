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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		EOS=53, NAZWA=54, NAPIS_DOSL=55, STALA=56, IntegerLiteral=57, COMMENT=58, 
		SL_COMMENT=59, WS=60;
	public static final int
		RULE_plik = 0, RULE_instrukcja = 1, RULE_nazwanapis = 2, RULE_echo = 3, 
		RULE_ustaw_nazwe = 4, RULE_ustaw_katalog = 5, RULE_wykonaj_skrypt = 6, 
		RULE_przypadki = 7, RULE_opcja_przypadkow = 8, RULE_generuj_przypadki = 9, 
		RULE_pisz_przypadki = 10, RULE_funkcja_przystosowania = 11, RULE_fprzyst_klasa = 12, 
		RULE_wczytaj_srodowisko = 13, RULE_zapisz_srodowisko = 14, RULE_listuj_srodowiska = 15, 
		RULE_rozmiar_populacji = 16, RULE_inicjalizacja_populacji = 17, RULE_zapis_populacji = 18, 
		RULE_zapis_populacji_gdzie = 19, RULE_odczyt_populacji = 20, RULE_odczyt_populacji_gdzie = 21, 
		RULE_listuj_populacje = 22, RULE_nastepne = 23, RULE_statystyki = 24, 
		RULE_nr_obecnej_generacji = 25, RULE_inspekcja = 26, RULE_koniec_inspekcji = 27, 
		RULE_inspekcja_srodowiska = 28, RULE_zakoncz = 29, RULE_wstrzykniecie_osobnika_do_srodowiska = 30, 
		RULE_ustawienie_wejsc = 31, RULE_we_stdin = 32, RULE_we_tablica = 33, 
		RULE_waga_operatora_genetycznego = 34, RULE_listuj_operatory_genetyczne = 35, 
		RULE_wydanie_programu = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"plik", "instrukcja", "nazwanapis", "echo", "ustaw_nazwe", "ustaw_katalog", 
			"wykonaj_skrypt", "przypadki", "opcja_przypadkow", "generuj_przypadki", 
			"pisz_przypadki", "funkcja_przystosowania", "fprzyst_klasa", "wczytaj_srodowisko", 
			"zapisz_srodowisko", "listuj_srodowiska", "rozmiar_populacji", "inicjalizacja_populacji", 
			"zapis_populacji", "zapis_populacji_gdzie", "odczyt_populacji", "odczyt_populacji_gdzie", 
			"listuj_populacje", "nastepne", "statystyki", "nr_obecnej_generacji", 
			"inspekcja", "koniec_inspekcji", "inspekcja_srodowiska", "zakoncz", "wstrzykniecie_osobnika_do_srodowiska", 
			"ustawienie_wejsc", "we_stdin", "we_tablica", "waga_operatora_genetycznego", 
			"listuj_operatory_genetyczne", "wydanie_programu"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'echo'", "'name'", "'cd'", "'exec'", "'cases'", "'from'", "'tinygp'", 
			"'plain'", "'gencases'", "'<'", "','", "':'", "'>'", "'*'", "'x'", "'show'", 
			"'fitfunc'", "'class'", "'in'", "'env'", "'to'", "'envs'", "'popsize'", 
			"'initpop'", "'grow'", "'full'", "'ramped-and-a-half'", "'rah'", "'writepop'", 
			"'readpop'", "'pops'", "'fwd'", "'stats'", "'gen'", "'inspect'", "'resume'", 
			"'halt'", "'inject'", "'specimen'", "'population'", "'environment'", 
			"'inj'", "'setinput'", "'stdin'", "'op'", "'genetic-operator'", "'%'", 
			"'\\u00E2\\u20AC\\u00B0'", "'ops'", "'genetic-operators'", "'release'", 
			"'@'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "EOS", "NAZWA", "NAPIS_DOSL", "STALA", 
			"IntegerLiteral", "COMMENT", "SL_COMMENT", "WS"
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4051150086275646L) != 0) {
				{
				{
				setState(74);
				instrukcja();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		public Generuj_przypadkiContext generuj_przypadki() {
			return getRuleContext(Generuj_przypadkiContext.class,0);
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
		public Wydanie_programuContext wydanie_programu() {
			return getRuleContext(Wydanie_programuContext.class,0);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(82);
				echo();
				}
				break;
			case 2:
				{
				setState(83);
				ustaw_nazwe();
				}
				break;
			case 3:
				{
				setState(84);
				ustaw_katalog();
				}
				break;
			case 4:
				{
				setState(85);
				wykonaj_skrypt();
				}
				break;
			case 5:
				{
				setState(86);
				przypadki();
				}
				break;
			case 6:
				{
				setState(87);
				generuj_przypadki();
				}
				break;
			case 7:
				{
				setState(88);
				pisz_przypadki();
				}
				break;
			case 8:
				{
				setState(89);
				funkcja_przystosowania();
				}
				break;
			case 9:
				{
				setState(90);
				wczytaj_srodowisko();
				}
				break;
			case 10:
				{
				setState(91);
				zapisz_srodowisko();
				}
				break;
			case 11:
				{
				setState(92);
				listuj_srodowiska();
				}
				break;
			case 12:
				{
				setState(93);
				rozmiar_populacji();
				}
				break;
			case 13:
				{
				setState(94);
				inicjalizacja_populacji();
				}
				break;
			case 14:
				{
				setState(95);
				zapis_populacji();
				}
				break;
			case 15:
				{
				setState(96);
				odczyt_populacji();
				}
				break;
			case 16:
				{
				setState(97);
				listuj_populacje();
				}
				break;
			case 17:
				{
				setState(98);
				nastepne();
				}
				break;
			case 18:
				{
				setState(99);
				statystyki();
				}
				break;
			case 19:
				{
				setState(100);
				nr_obecnej_generacji();
				}
				break;
			case 20:
				{
				setState(101);
				inspekcja();
				}
				break;
			case 21:
				{
				setState(102);
				koniec_inspekcji();
				}
				break;
			case 22:
				{
				setState(103);
				inspekcja_srodowiska();
				}
				break;
			case 23:
				{
				setState(104);
				zakoncz();
				}
				break;
			case 24:
				{
				setState(105);
				wstrzykniecie_osobnika_do_srodowiska();
				}
				break;
			case 25:
				{
				setState(106);
				waga_operatora_genetycznego();
				}
				break;
			case 26:
				{
				setState(107);
				listuj_operatory_genetyczne();
				}
				break;
			case 27:
				{
				setState(108);
				wydanie_programu();
				}
				break;
			}
			setState(111);
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
			setState(113);
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
			setState(115);
			match(T__0);
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
			setState(118);
			match(T__1);
			setState(119);
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
			setState(121);
			match(T__2);
			setState(122);
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
			setState(124);
			match(T__3);
			setState(125);
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
			setState(127);
			match(T__4);
			setState(128);
			match(T__5);
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==NAZWA || _la==NAPIS_DOSL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(130);
				opcja_przypadkow();
				}
				}
				setState(135);
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
			setState(136);
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
	public static class Generuj_przypadkiContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(ProszczGPParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(ProszczGPParser.STALA, i);
		}
		public Generuj_przypadkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generuj_przypadki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterGeneruj_przypadki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitGeneruj_przypadki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitGeneruj_przypadki(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generuj_przypadkiContext generuj_przypadki() throws RecognitionException {
		Generuj_przypadkiContext _localctx = new Generuj_przypadkiContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_generuj_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__8);
			setState(139);
			match(T__9);
			setState(140);
			match(STALA);
			setState(141);
			match(T__10);
			setState(142);
			match(STALA);
			setState(143);
			match(T__11);
			setState(144);
			match(STALA);
			setState(145);
			match(T__12);
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
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
		enterRule(_localctx, 20, RULE_pisz_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__15);
			setState(150);
			match(T__4);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(151);
				match(STALA);
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(152);
					match(T__10);
					}
				}

				setState(155);
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
		enterRule(_localctx, 22, RULE_funkcja_przystosowania);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__16);
			setState(159);
			match(T__5);
			setState(160);
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
		enterRule(_localctx, 24, RULE_fprzyst_klasa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__17);
			setState(163);
			nazwanapis();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(164);
				match(T__18);
				setState(165);
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
		enterRule(_localctx, 26, RULE_wczytaj_srodowisko);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__19);
			setState(169);
			nazwanapis();
			setState(170);
			match(T__5);
			setState(171);
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
		enterRule(_localctx, 28, RULE_zapisz_srodowisko);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__19);
			setState(174);
			nazwanapis();
			setState(175);
			match(T__20);
			setState(176);
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
		enterRule(_localctx, 30, RULE_listuj_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__21);
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
		enterRule(_localctx, 32, RULE_rozmiar_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__22);
			setState(181);
			match(NAZWA);
			setState(182);
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
		enterRule(_localctx, 34, RULE_inicjalizacja_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__23);
			setState(185);
			match(NAZWA);
			setState(186);
			((Inicjalizacja_populacjiContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 503316480L) != 0) ) {
				((Inicjalizacja_populacjiContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(187);
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
		enterRule(_localctx, 36, RULE_zapis_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__28);
			setState(190);
			match(NAZWA);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				{
				setState(191);
				zapis_populacji_gdzie();
				}
				}
				break;
			case EOS:
			case STALA:
				{
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STALA) {
					{
					setState(192);
					match(STALA);
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__10) {
						{
						setState(193);
						match(T__10);
						}
					}

					setState(196);
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
		enterRule(_localctx, 38, RULE_zapis_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(201);
			match(T__20);
			setState(202);
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
		enterRule(_localctx, 40, RULE_odczyt_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__29);
			setState(205);
			match(NAZWA);
			setState(206);
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
		enterRule(_localctx, 42, RULE_odczyt_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			match(T__5);
			setState(209);
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
		enterRule(_localctx, 44, RULE_listuj_populacje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
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
		enterRule(_localctx, 46, RULE_nastepne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__31);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(214);
				match(STALA);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(215);
					match(T__10);
					setState(216);
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
		enterRule(_localctx, 48, RULE_statystyki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__32);
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(222);
				match(STALA);
				}
				break;
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(225);
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
		enterRule(_localctx, 50, RULE_nr_obecnej_generacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__33);
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
		enterRule(_localctx, 52, RULE_inspekcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__34);
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
		enterRule(_localctx, 54, RULE_koniec_inspekcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__35);
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
		enterRule(_localctx, 56, RULE_inspekcja_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__34);
			setState(235);
			match(T__19);
			setState(236);
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
		enterRule(_localctx, 58, RULE_zakoncz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__36);
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
		enterRule(_localctx, 60, RULE_wstrzykniecie_osobnika_do_srodowiska);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(240);
				match(T__37);
				setState(241);
				match(T__38);
				setState(242);
				match(STALA);
				setState(243);
				match(T__5);
				setState(244);
				match(T__39);
				setState(245);
				match(NAZWA);
				setState(246);
				match(T__20);
				setState(247);
				match(T__40);
				setState(248);
				match(NAZWA);
				}
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(249);
				match(T__41);
				setState(250);
				match(NAZWA);
				setState(251);
				match(T__11);
				setState(252);
				match(STALA);
				setState(253);
				match(T__12);
				setState(254);
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
		enterRule(_localctx, 62, RULE_ustawienie_wejsc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(257);
			match(T__42);
			setState(258);
			nazwanapis();
			setState(259);
			match(T__18);
			setState(260);
			nazwanapis();
			setState(261);
			match(T__20);
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				{
				setState(262);
				we_stdin();
				}
				break;
			case EOF:
			case STALA:
				{
				setState(263);
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
		enterRule(_localctx, 64, RULE_we_stdin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__43);
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
		enterRule(_localctx, 66, RULE_we_tablica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STALA) {
				{
				{
				setState(268);
				match(STALA);
				}
				}
				setState(273);
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
		enterRule(_localctx, 68, RULE_waga_operatora_genetycznego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(275);
			match(NAZWA);
			setState(276);
			match(STALA);
			setState(277);
			((Waga_operatora_genetycznegoContext)_localctx).zn = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
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
		enterRule(_localctx, 70, RULE_listuj_operatory_genetyczne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
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
	public static class Wydanie_programuContext extends ParserRuleContext {
		public List<NazwanapisContext> nazwanapis() {
			return getRuleContexts(NazwanapisContext.class);
		}
		public NazwanapisContext nazwanapis(int i) {
			return getRuleContext(NazwanapisContext.class,i);
		}
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
		public Wydanie_programuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wydanie_programu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterWydanie_programu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitWydanie_programu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitWydanie_programu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wydanie_programuContext wydanie_programu() throws RecognitionException {
		Wydanie_programuContext _localctx = new Wydanie_programuContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wydanie_programu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__50);
			setState(282);
			nazwanapis();
			setState(283);
			match(T__11);
			setState(284);
			match(STALA);
			setState(285);
			match(T__51);
			setState(286);
			nazwanapis();
			setState(287);
			match(T__20);
			setState(288);
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

	public static final String _serializedATN =
		"\u0004\u0001<\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001n\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0084\b\u0007"+
		"\n\u0007\f\u0007\u0087\t\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u009a\b\n\u0001\n\u0003\n\u009d\b\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c3\b\u0012\u0001\u0012\u0003"+
		"\u0012\u00c6\b\u0012\u0003\u0012\u00c8\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u00da\b\u0017\u0003\u0017\u00dc\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u00e0\b\u0018\u0001\u0018\u0003"+
		"\u0018\u00e3\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0100"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0109\b\u001f\u0001 \u0001 \u0001!\u0005"+
		"!\u010e\b!\n!\f!\u0111\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0007"+
		"\u0001\u000067\u0001\u0000\u0007\b\u0001\u0000\u000e\u000f\u0001\u0000"+
		"\u0019\u001c\u0001\u0000-.\u0001\u0000/0\u0001\u000012\u0126\u0000M\u0001"+
		"\u0000\u0000\u0000\u0002m\u0001\u0000\u0000\u0000\u0004q\u0001\u0000\u0000"+
		"\u0000\u0006s\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\ny\u0001"+
		"\u0000\u0000\u0000\f|\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000"+
		"\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000"+
		"\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000"+
		"\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u00a8\u0001\u0000"+
		"\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00b2\u0001\u0000"+
		"\u0000\u0000 \u00b4\u0001\u0000\u0000\u0000\"\u00b8\u0001\u0000\u0000"+
		"\u0000$\u00bd\u0001\u0000\u0000\u0000&\u00c9\u0001\u0000\u0000\u0000("+
		"\u00cc\u0001\u0000\u0000\u0000*\u00d0\u0001\u0000\u0000\u0000,\u00d3\u0001"+
		"\u0000\u0000\u0000.\u00d5\u0001\u0000\u0000\u00000\u00dd\u0001\u0000\u0000"+
		"\u00002\u00e4\u0001\u0000\u0000\u00004\u00e6\u0001\u0000\u0000\u00006"+
		"\u00e8\u0001\u0000\u0000\u00008\u00ea\u0001\u0000\u0000\u0000:\u00ee\u0001"+
		"\u0000\u0000\u0000<\u00ff\u0001\u0000\u0000\u0000>\u0101\u0001\u0000\u0000"+
		"\u0000@\u010a\u0001\u0000\u0000\u0000B\u010f\u0001\u0000\u0000\u0000D"+
		"\u0112\u0001\u0000\u0000\u0000F\u0117\u0001\u0000\u0000\u0000H\u0119\u0001"+
		"\u0000\u0000\u0000JL\u0003\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000"+
		"LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000"+
		"\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000Rn\u0003\u0006\u0003\u0000"+
		"Sn\u0003\b\u0004\u0000Tn\u0003\n\u0005\u0000Un\u0003\f\u0006\u0000Vn\u0003"+
		"\u000e\u0007\u0000Wn\u0003\u0012\t\u0000Xn\u0003\u0014\n\u0000Yn\u0003"+
		"\u0016\u000b\u0000Zn\u0003\u001a\r\u0000[n\u0003\u001c\u000e\u0000\\n"+
		"\u0003\u001e\u000f\u0000]n\u0003 \u0010\u0000^n\u0003\"\u0011\u0000_n"+
		"\u0003$\u0012\u0000`n\u0003(\u0014\u0000an\u0003,\u0016\u0000bn\u0003"+
		".\u0017\u0000cn\u00030\u0018\u0000dn\u00032\u0019\u0000en\u00034\u001a"+
		"\u0000fn\u00036\u001b\u0000gn\u00038\u001c\u0000hn\u0003:\u001d\u0000"+
		"in\u0003<\u001e\u0000jn\u0003D\"\u0000kn\u0003F#\u0000ln\u0003H$\u0000"+
		"mR\u0001\u0000\u0000\u0000mS\u0001\u0000\u0000\u0000mT\u0001\u0000\u0000"+
		"\u0000mU\u0001\u0000\u0000\u0000mV\u0001\u0000\u0000\u0000mW\u0001\u0000"+
		"\u0000\u0000mX\u0001\u0000\u0000\u0000mY\u0001\u0000\u0000\u0000mZ\u0001"+
		"\u0000\u0000\u0000m[\u0001\u0000\u0000\u0000m\\\u0001\u0000\u0000\u0000"+
		"m]\u0001\u0000\u0000\u0000m^\u0001\u0000\u0000\u0000m_\u0001\u0000\u0000"+
		"\u0000m`\u0001\u0000\u0000\u0000ma\u0001\u0000\u0000\u0000mb\u0001\u0000"+
		"\u0000\u0000mc\u0001\u0000\u0000\u0000md\u0001\u0000\u0000\u0000me\u0001"+
		"\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000\u0000\u0000"+
		"mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000op\u00055\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qr\u0007"+
		"\u0000\u0000\u0000r\u0005\u0001\u0000\u0000\u0000st\u0005\u0001\u0000"+
		"\u0000tu\u0007\u0000\u0000\u0000u\u0007\u0001\u0000\u0000\u0000vw\u0005"+
		"\u0002\u0000\u0000wx\u00056\u0000\u0000x\t\u0001\u0000\u0000\u0000yz\u0005"+
		"\u0003\u0000\u0000z{\u0007\u0000\u0000\u0000{\u000b\u0001\u0000\u0000"+
		"\u0000|}\u0005\u0004\u0000\u0000}~\u0007\u0000\u0000\u0000~\r\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0005\u0006"+
		"\u0000\u0000\u0081\u0085\u0007\u0000\u0000\u0000\u0082\u0084\u0003\u0010"+
		"\b\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u000f\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0007\u0001\u0000\u0000\u0089\u0011\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000"+
		"\u008c\u008d\u00058\u0000\u0000\u008d\u008e\u0005\u000b\u0000\u0000\u008e"+
		"\u008f\u00058\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091"+
		"\u00058\u0000\u0000\u0091\u0092\u0005\r\u0000\u0000\u0092\u0093\u0007"+
		"\u0002\u0000\u0000\u0093\u0094\u00058\u0000\u0000\u0094\u0013\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0010\u0000\u0000\u0096\u009c\u0005\u0005"+
		"\u0000\u0000\u0097\u0099\u00058\u0000\u0000\u0098\u009a\u0005\u000b\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009d\u00058\u0000\u0000"+
		"\u009c\u0097\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u0015\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u0011\u0000\u0000"+
		"\u009f\u00a0\u0005\u0006\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1"+
		"\u0017\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3"+
		"\u00a6\u0003\u0004\u0002\u0000\u00a4\u00a5\u0005\u0013\u0000\u0000\u00a5"+
		"\u00a7\u0003\u0004\u0002\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u0019\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0014\u0000\u0000\u00a9\u00aa\u0003\u0004\u0002\u0000\u00aa"+
		"\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0003\u0004\u0002\u0000\u00ac"+
		"\u001b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0014\u0000\u0000\u00ae"+
		"\u00af\u0003\u0004\u0002\u0000\u00af\u00b0\u0005\u0015\u0000\u0000\u00b0"+
		"\u00b1\u0003\u0004\u0002\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u0016\u0000\u0000\u00b3\u001f\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005\u0017\u0000\u0000\u00b5\u00b6\u00056\u0000\u0000\u00b6\u00b7"+
		"\u00058\u0000\u0000\u00b7!\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0018"+
		"\u0000\u0000\u00b9\u00ba\u00056\u0000\u0000\u00ba\u00bb\u0007\u0003\u0000"+
		"\u0000\u00bb\u00bc\u00058\u0000\u0000\u00bc#\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u001d\u0000\u0000\u00be\u00c7\u00056\u0000\u0000\u00bf\u00c8"+
		"\u0003&\u0013\u0000\u00c0\u00c2\u00058\u0000\u0000\u00c1\u00c3\u0005\u000b"+
		"\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c6\u00058\u0000"+
		"\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8%\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u0015\u0000\u0000\u00ca\u00cb\u0007\u0000\u0000\u0000"+
		"\u00cb\'\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001e\u0000\u0000\u00cd"+
		"\u00ce\u00056\u0000\u0000\u00ce\u00cf\u0003*\u0015\u0000\u00cf)\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0006\u0000\u0000\u00d1\u00d2\u0007"+
		"\u0000\u0000\u0000\u00d2+\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u001f"+
		"\u0000\u0000\u00d4-\u0001\u0000\u0000\u0000\u00d5\u00db\u0005 \u0000\u0000"+
		"\u00d6\u00d9\u00058\u0000\u0000\u00d7\u00d8\u0005\u000b\u0000\u0000\u00d8"+
		"\u00da\u00058\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc/\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0005!\u0000\u0000\u00de\u00e0\u00058\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00e3\u00058\u0000\u0000"+
		"\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e31\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\"\u0000\u0000\u00e5"+
		"3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005#\u0000\u0000\u00e75\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005$\u0000\u0000\u00e97\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005#\u0000\u0000\u00eb\u00ec\u0005\u0014\u0000\u0000"+
		"\u00ec\u00ed\u00056\u0000\u0000\u00ed9\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0005%\u0000\u0000\u00ef;\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005&"+
		"\u0000\u0000\u00f1\u00f2\u0005\'\u0000\u0000\u00f2\u00f3\u00058\u0000"+
		"\u0000\u00f3\u00f4\u0005\u0006\u0000\u0000\u00f4\u00f5\u0005(\u0000\u0000"+
		"\u00f5\u00f6\u00056\u0000\u0000\u00f6\u00f7\u0005\u0015\u0000\u0000\u00f7"+
		"\u00f8\u0005)\u0000\u0000\u00f8\u0100\u00056\u0000\u0000\u00f9\u00fa\u0005"+
		"*\u0000\u0000\u00fa\u00fb\u00056\u0000\u0000\u00fb\u00fc\u0005\f\u0000"+
		"\u0000\u00fc\u00fd\u00058\u0000\u0000\u00fd\u00fe\u0005\r\u0000\u0000"+
		"\u00fe\u0100\u00056\u0000\u0000\u00ff\u00f0\u0001\u0000\u0000\u0000\u00ff"+
		"\u00f9\u0001\u0000\u0000\u0000\u0100=\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005+\u0000\u0000\u0102\u0103\u0003\u0004\u0002\u0000\u0103\u0104\u0005"+
		"\u0013\u0000\u0000\u0104\u0105\u0003\u0004\u0002\u0000\u0105\u0108\u0005"+
		"\u0015\u0000\u0000\u0106\u0109\u0003@ \u0000\u0107\u0109\u0003B!\u0000"+
		"\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0109?\u0001\u0000\u0000\u0000\u010a\u010b\u0005,\u0000\u0000\u010bA"+
		"\u0001\u0000\u0000\u0000\u010c\u010e\u00058\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110C\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113\u0007\u0004"+
		"\u0000\u0000\u0113\u0114\u00056\u0000\u0000\u0114\u0115\u00058\u0000\u0000"+
		"\u0115\u0116\u0007\u0005\u0000\u0000\u0116E\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0007\u0006\u0000\u0000\u0118G\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u00053\u0000\u0000\u011a\u011b\u0003\u0004\u0002\u0000\u011b\u011c\u0005"+
		"\f\u0000\u0000\u011c\u011d\u00058\u0000\u0000\u011d\u011e\u00054\u0000"+
		"\u0000\u011e\u011f\u0003\u0004\u0002\u0000\u011f\u0120\u0005\u0015\u0000"+
		"\u0000\u0120\u0121\u0003\u0004\u0002\u0000\u0121I\u0001\u0000\u0000\u0000"+
		"\u0010Mm\u0085\u0099\u009c\u00a6\u00c2\u00c5\u00c7\u00d9\u00db\u00df\u00e2"+
		"\u00ff\u0108\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}