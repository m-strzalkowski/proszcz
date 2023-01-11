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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, EOS=45, NAZWA=46, 
		NAPIS_DOSL=47, STALA=48, IntegerLiteral=49, COMMENT=50, SL_COMMENT=51, 
		WS=52;
	public static final int
		RULE_plik = 0, RULE_instrukcja = 1, RULE_echo = 2, RULE_ustaw_nazwe = 3, 
		RULE_ustaw_katalog = 4, RULE_wykonaj_skrypt = 5, RULE_przypadki = 6, RULE_opcja_przypadkow = 7, 
		RULE_pisz_przypadki = 8, RULE_funkcja_przystosowania = 9, RULE_fprzyst_klasa = 10, 
		RULE_srodowisko = 11, RULE_listuj_srodowiska = 12, RULE_rozmiar_populacji = 13, 
		RULE_inicjalizacja_populacji = 14, RULE_zapis_populacji = 15, RULE_zapis_populacji_gdzie = 16, 
		RULE_odczyt_populacji = 17, RULE_odczyt_populacji_gdzie = 18, RULE_listuj_populacje = 19, 
		RULE_nastepne = 20, RULE_statystyki = 21, RULE_nr_obecnej_generacji = 22, 
		RULE_inspekcja = 23, RULE_koniec_inspekcji = 24, RULE_inspekcja_srodowiska = 25, 
		RULE_zakoncz = 26, RULE_wstrzykniecie_osobnika_do_srodowiska = 27, RULE_waga_operatora_genetycznego = 28, 
		RULE_listuj_operatory_genetyczne = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"plik", "instrukcja", "echo", "ustaw_nazwe", "ustaw_katalog", "wykonaj_skrypt", 
			"przypadki", "opcja_przypadkow", "pisz_przypadki", "funkcja_przystosowania", 
			"fprzyst_klasa", "srodowisko", "listuj_srodowiska", "rozmiar_populacji", 
			"inicjalizacja_populacji", "zapis_populacji", "zapis_populacji_gdzie", 
			"odczyt_populacji", "odczyt_populacji_gdzie", "listuj_populacje", "nastepne", 
			"statystyki", "nr_obecnej_generacji", "inspekcja", "koniec_inspekcji", 
			"inspekcja_srodowiska", "zakoncz", "wstrzykniecie_osobnika_do_srodowiska", 
			"waga_operatora_genetycznego", "listuj_operatory_genetyczne"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'echo'", "'name'", "'cd'", "'exec'", "'cases'", "'from'", "'tinygp'", 
			"'plain'", "'show'", "','", "'fitfunc'", "'class'", "'in'", "'env'", 
			"'envs'", "'popsize'", "'initpop'", "'grow'", "'full'", "'ramped-and-a-half'", 
			"'rah'", "'writepop'", "'to'", "'readpop'", "'pops'", "'fwd'", "'stats'", 
			"'gen'", "'inspect'", "'resume'", "'halt'", "'inject'", "'specimen'", 
			"'population'", "'environment'", "'inj'", "':'", "'>'", "'op'", "'genetic-operator'", 
			"'%'", "'\\u00E2\\u20AC\\u00B0'", "'ops'", "'genetic-operators'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "EOS", "NAZWA", 
			"NAPIS_DOSL", "STALA", "IntegerLiteral", "COMMENT", "SL_COMMENT", "WS"
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
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 28114843585086L) != 0) {
				{
				{
				setState(60);
				instrukcja();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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
		public SrodowiskoContext srodowisko() {
			return getRuleContext(SrodowiskoContext.class,0);
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
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(68);
				echo();
				}
				break;
			case 2:
				{
				setState(69);
				ustaw_nazwe();
				}
				break;
			case 3:
				{
				setState(70);
				ustaw_katalog();
				}
				break;
			case 4:
				{
				setState(71);
				wykonaj_skrypt();
				}
				break;
			case 5:
				{
				setState(72);
				przypadki();
				}
				break;
			case 6:
				{
				setState(73);
				pisz_przypadki();
				}
				break;
			case 7:
				{
				setState(74);
				funkcja_przystosowania();
				}
				break;
			case 8:
				{
				setState(75);
				srodowisko();
				}
				break;
			case 9:
				{
				setState(76);
				listuj_srodowiska();
				}
				break;
			case 10:
				{
				setState(77);
				rozmiar_populacji();
				}
				break;
			case 11:
				{
				setState(78);
				inicjalizacja_populacji();
				}
				break;
			case 12:
				{
				setState(79);
				zapis_populacji();
				}
				break;
			case 13:
				{
				setState(80);
				odczyt_populacji();
				}
				break;
			case 14:
				{
				setState(81);
				listuj_populacje();
				}
				break;
			case 15:
				{
				setState(82);
				nastepne();
				}
				break;
			case 16:
				{
				setState(83);
				statystyki();
				}
				break;
			case 17:
				{
				setState(84);
				nr_obecnej_generacji();
				}
				break;
			case 18:
				{
				setState(85);
				inspekcja();
				}
				break;
			case 19:
				{
				setState(86);
				koniec_inspekcji();
				}
				break;
			case 20:
				{
				setState(87);
				inspekcja_srodowiska();
				}
				break;
			case 21:
				{
				setState(88);
				zakoncz();
				}
				break;
			case 22:
				{
				setState(89);
				wstrzykniecie_osobnika_do_srodowiska();
				}
				break;
			case 23:
				{
				setState(90);
				waga_operatora_genetycznego();
				}
				break;
			case 24:
				{
				setState(91);
				listuj_operatory_genetyczne();
				}
				break;
			}
			setState(94);
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
		enterRule(_localctx, 4, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__0);
			setState(97);
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
		enterRule(_localctx, 6, RULE_ustaw_nazwe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__1);
			setState(100);
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
		enterRule(_localctx, 8, RULE_ustaw_katalog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__2);
			setState(103);
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
		enterRule(_localctx, 10, RULE_wykonaj_skrypt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__3);
			setState(106);
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
		enterRule(_localctx, 12, RULE_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__4);
			setState(109);
			match(T__5);
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
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(111);
				opcja_przypadkow();
				}
				}
				setState(116);
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
		enterRule(_localctx, 14, RULE_opcja_przypadkow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 16, RULE_pisz_przypadki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__8);
			setState(120);
			match(T__4);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(121);
				match(STALA);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(122);
					match(T__9);
					}
				}

				setState(125);
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
		enterRule(_localctx, 18, RULE_funkcja_przystosowania);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__10);
			setState(129);
			match(T__5);
			setState(130);
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
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
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
		enterRule(_localctx, 20, RULE_fprzyst_klasa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__11);
			setState(133);
			match(NAZWA);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(134);
				match(T__12);
				setState(135);
				match(NAPIS_DOSL);
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
	public static class SrodowiskoContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(ProszczGPParser.NAZWA, 0); }
		public TerminalNode NAPIS_DOSL() { return getToken(ProszczGPParser.NAPIS_DOSL, 0); }
		public SrodowiskoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_srodowisko; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).enterSrodowisko(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProszczGPListener ) ((ProszczGPListener)listener).exitSrodowisko(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProszczGPVisitor ) return ((ProszczGPVisitor<? extends T>)visitor).visitSrodowisko(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrodowiskoContext srodowisko() throws RecognitionException {
		SrodowiskoContext _localctx = new SrodowiskoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_srodowisko);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__13);
			setState(139);
			match(NAZWA);
			setState(140);
			match(T__5);
			setState(141);
			match(NAPIS_DOSL);
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
		enterRule(_localctx, 24, RULE_listuj_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__14);
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
		enterRule(_localctx, 26, RULE_rozmiar_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__15);
			setState(146);
			match(NAZWA);
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
		enterRule(_localctx, 28, RULE_inicjalizacja_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__16);
			setState(150);
			match(NAZWA);
			setState(151);
			((Inicjalizacja_populacjiContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0) ) {
				((Inicjalizacja_populacjiContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
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
		enterRule(_localctx, 30, RULE_zapis_populacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__21);
			setState(155);
			match(NAZWA);
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				{
				setState(156);
				zapis_populacji_gdzie();
				}
				}
				break;
			case EOS:
			case STALA:
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STALA) {
					{
					setState(157);
					match(STALA);
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(158);
						match(T__9);
						}
					}

					setState(161);
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
		enterRule(_localctx, 32, RULE_zapis_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(166);
			match(T__22);
			setState(167);
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
		enterRule(_localctx, 34, RULE_odczyt_populacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__23);
			setState(170);
			match(NAZWA);
			setState(171);
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
		enterRule(_localctx, 36, RULE_odczyt_populacji_gdzie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(173);
			match(T__5);
			setState(174);
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
		enterRule(_localctx, 38, RULE_listuj_populacje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		public TerminalNode STALA() { return getToken(ProszczGPParser.STALA, 0); }
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
		enterRule(_localctx, 40, RULE_nastepne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__25);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(179);
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
		enterRule(_localctx, 42, RULE_statystyki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__26);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(183);
				match(STALA);
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(186);
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
		enterRule(_localctx, 44, RULE_nr_obecnej_generacji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 46, RULE_inspekcja);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 48, RULE_koniec_inspekcji);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 50, RULE_inspekcja_srodowiska);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__28);
			setState(196);
			match(T__13);
			setState(197);
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
		enterRule(_localctx, 52, RULE_zakoncz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 54, RULE_wstrzykniecie_osobnika_do_srodowiska);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(201);
				match(T__31);
				setState(202);
				match(T__32);
				setState(203);
				match(STALA);
				setState(204);
				match(T__5);
				setState(205);
				match(T__33);
				setState(206);
				match(NAZWA);
				setState(207);
				match(T__22);
				setState(208);
				match(T__34);
				setState(209);
				match(NAZWA);
				}
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(210);
				match(T__35);
				setState(211);
				match(NAZWA);
				setState(212);
				match(T__36);
				setState(213);
				match(STALA);
				setState(214);
				match(T__37);
				setState(215);
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
		enterRule(_localctx, 56, RULE_waga_operatora_genetycznego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_la = _input.LA(1);
			if ( !(_la==T__38 || _la==T__39) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(219);
			match(NAZWA);
			setState(220);
			match(STALA);
			setState(221);
			((Waga_operatora_genetycznegoContext)_localctx).zn = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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
		enterRule(_localctx, 58, RULE_listuj_operatory_genetyczne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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
		"\u0004\u00014\u00e2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0005\u0000"+
		">\b\u0000\n\u0000\f\u0000A\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"]\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006q\b\u0006\n\u0006\f\u0006t\t\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b|\b\b\u0001\b\u0003"+
		"\b\u007f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u0089\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a0\b\u000f\u0001\u000f\u0003"+
		"\u000f\u00a3\b\u000f\u0003\u000f\u00a5\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u00b5\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00b9\b"+
		"\u0015\u0001\u0015\u0003\u0015\u00bc\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u00d9\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0000\u0000\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0006\u0001\u0000./\u0001\u0000\u0007"+
		"\b\u0001\u0000\u0012\u0015\u0001\u0000\'(\u0001\u0000)*\u0001\u0000+,"+
		"\u00e6\u0000?\u0001\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000"+
		"\u0004`\u0001\u0000\u0000\u0000\u0006c\u0001\u0000\u0000\u0000\bf\u0001"+
		"\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000"+
		"\u000eu\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012\u0080"+
		"\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u008a"+
		"\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000\u001a\u0091"+
		"\u0001\u0000\u0000\u0000\u001c\u0095\u0001\u0000\u0000\u0000\u001e\u009a"+
		"\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\"\u00a9\u0001"+
		"\u0000\u0000\u0000$\u00ad\u0001\u0000\u0000\u0000&\u00b0\u0001\u0000\u0000"+
		"\u0000(\u00b2\u0001\u0000\u0000\u0000*\u00b6\u0001\u0000\u0000\u0000,"+
		"\u00bd\u0001\u0000\u0000\u0000.\u00bf\u0001\u0000\u0000\u00000\u00c1\u0001"+
		"\u0000\u0000\u00002\u00c3\u0001\u0000\u0000\u00004\u00c7\u0001\u0000\u0000"+
		"\u00006\u00d8\u0001\u0000\u0000\u00008\u00da\u0001\u0000\u0000\u0000:"+
		"\u00df\u0001\u0000\u0000\u0000<>\u0003\u0002\u0001\u0000=<\u0001\u0000"+
		"\u0000\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BC\u0005\u0000\u0000\u0001C\u0001\u0001\u0000\u0000\u0000D]\u0003\u0004"+
		"\u0002\u0000E]\u0003\u0006\u0003\u0000F]\u0003\b\u0004\u0000G]\u0003\n"+
		"\u0005\u0000H]\u0003\f\u0006\u0000I]\u0003\u0010\b\u0000J]\u0003\u0012"+
		"\t\u0000K]\u0003\u0016\u000b\u0000L]\u0003\u0018\f\u0000M]\u0003\u001a"+
		"\r\u0000N]\u0003\u001c\u000e\u0000O]\u0003\u001e\u000f\u0000P]\u0003\""+
		"\u0011\u0000Q]\u0003&\u0013\u0000R]\u0003(\u0014\u0000S]\u0003*\u0015"+
		"\u0000T]\u0003,\u0016\u0000U]\u0003.\u0017\u0000V]\u00030\u0018\u0000"+
		"W]\u00032\u0019\u0000X]\u00034\u001a\u0000Y]\u00036\u001b\u0000Z]\u0003"+
		"8\u001c\u0000[]\u0003:\u001d\u0000\\D\u0001\u0000\u0000\u0000\\E\u0001"+
		"\u0000\u0000\u0000\\F\u0001\u0000\u0000\u0000\\G\u0001\u0000\u0000\u0000"+
		"\\H\u0001\u0000\u0000\u0000\\I\u0001\u0000\u0000\u0000\\J\u0001\u0000"+
		"\u0000\u0000\\K\u0001\u0000\u0000\u0000\\L\u0001\u0000\u0000\u0000\\M"+
		"\u0001\u0000\u0000\u0000\\N\u0001\u0000\u0000\u0000\\O\u0001\u0000\u0000"+
		"\u0000\\P\u0001\u0000\u0000\u0000\\Q\u0001\u0000\u0000\u0000\\R\u0001"+
		"\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000\u0000\u0000"+
		"\\U\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000\u0000\\W\u0001\u0000"+
		"\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000\\Z"+
		"\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005-\u0000\u0000_\u0003\u0001\u0000\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0007\u0000\u0000\u0000b\u0005\u0001\u0000\u0000\u0000"+
		"cd\u0005\u0002\u0000\u0000de\u0005.\u0000\u0000e\u0007\u0001\u0000\u0000"+
		"\u0000fg\u0005\u0003\u0000\u0000gh\u0007\u0000\u0000\u0000h\t\u0001\u0000"+
		"\u0000\u0000ij\u0005\u0004\u0000\u0000jk\u0007\u0000\u0000\u0000k\u000b"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0005\u0000\u0000mn\u0005\u0006\u0000"+
		"\u0000nr\u0007\u0000\u0000\u0000oq\u0003\u000e\u0007\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000s\r\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0007\u0001\u0000\u0000v\u000f\u0001\u0000\u0000\u0000wx\u0005\t\u0000"+
		"\u0000x~\u0005\u0005\u0000\u0000y{\u00050\u0000\u0000z|\u0005\n\u0000"+
		"\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u007f\u00050\u0000\u0000~y\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u000b\u0000\u0000\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0083"+
		"\u0003\u0014\n\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0005"+
		"\f\u0000\u0000\u0085\u0088\u0005.\u0000\u0000\u0086\u0087\u0005\r\u0000"+
		"\u0000\u0087\u0089\u0005/\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0015\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u000e\u0000\u0000\u008b\u008c\u0005.\u0000\u0000\u008c"+
		"\u008d\u0005\u0006\u0000\u0000\u008d\u008e\u0005/\u0000\u0000\u008e\u0017"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090\u0019"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0010\u0000\u0000\u0092\u0093"+
		"\u0005.\u0000\u0000\u0093\u0094\u00050\u0000\u0000\u0094\u001b\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096\u0097\u0005.\u0000"+
		"\u0000\u0097\u0098\u0007\u0002\u0000\u0000\u0098\u0099\u00050\u0000\u0000"+
		"\u0099\u001d\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u0016\u0000\u0000"+
		"\u009b\u00a4\u0005.\u0000\u0000\u009c\u00a5\u0003 \u0010\u0000\u009d\u009f"+
		"\u00050\u0000\u0000\u009e\u00a0\u0005\n\u0000\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\u00050\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u009c\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0017"+
		"\u0000\u0000\u00a7\u00a8\u0007\u0000\u0000\u0000\u00a8!\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab\u0005.\u0000\u0000"+
		"\u00ab\u00ac\u0003$\u0012\u0000\u00ac#\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0006\u0000\u0000\u00ae\u00af\u0007\u0000\u0000\u0000\u00af%\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u0019\u0000\u0000\u00b1\'\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0005\u001a\u0000\u0000\u00b3\u00b5\u00050\u0000"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5)\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005\u001b\u0000\u0000"+
		"\u00b7\u00b9\u00050\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u00050\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bc+\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\u001c\u0000\u0000\u00be-\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u001d"+
		"\u0000\u0000\u00c0/\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u001e\u0000"+
		"\u0000\u00c21\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u001d\u0000\u0000"+
		"\u00c4\u00c5\u0005\u000e\u0000\u0000\u00c5\u00c6\u0005.\u0000\u0000\u00c6"+
		"3\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u001f\u0000\u0000\u00c85\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0005 \u0000\u0000\u00ca\u00cb\u0005!\u0000"+
		"\u0000\u00cb\u00cc\u00050\u0000\u0000\u00cc\u00cd\u0005\u0006\u0000\u0000"+
		"\u00cd\u00ce\u0005\"\u0000\u0000\u00ce\u00cf\u0005.\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d1\u0005#\u0000\u0000\u00d1\u00d9"+
		"\u0005.\u0000\u0000\u00d2\u00d3\u0005$\u0000\u0000\u00d3\u00d4\u0005."+
		"\u0000\u0000\u00d4\u00d5\u0005%\u0000\u0000\u00d5\u00d6\u00050\u0000\u0000"+
		"\u00d6\u00d7\u0005&\u0000\u0000\u00d7\u00d9\u0005.\u0000\u0000\u00d8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d97\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0007\u0003\u0000\u0000\u00db\u00dc\u0005"+
		".\u0000\u0000\u00dc\u00dd\u00050\u0000\u0000\u00dd\u00de\u0007\u0004\u0000"+
		"\u0000\u00de9\u0001\u0000\u0000\u0000\u00df\u00e0\u0007\u0005\u0000\u0000"+
		"\u00e0;\u0001\u0000\u0000\u0000\r?\\r{~\u0088\u009f\u00a2\u00a4\u00b4"+
		"\u00b8\u00bb\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}