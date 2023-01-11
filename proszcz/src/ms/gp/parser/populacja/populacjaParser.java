// Generated from java-escape by ANTLR 4.11.1
package ms.gp.parser.populacja;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class populacjaParser extends Parser {
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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, KOLOR_HTML=72, KOLOR_HTML_KROTKI=73, 
		ZAWIJAS_LEWY=74, ZAWIJAS_PRAWY=75, LNAWIAS_Z_KRATKA=76, PNAWIAS_Z_KRATKA=77, 
		EWALUACJA=78, LENIWA=79, SPRYTNA=80, GORLIWA=81, EOS=82, NAZWA=83, NAPIS_DOSL=84, 
		STALA=85, IntegerLiteral=86, COMMENT=87, WS=88;
	public static final int
		RULE_populacja = 0, RULE_osobnik = 1, RULE_program = 2, RULE_proces = 3, 
		RULE_instrukcja = 4, RULE_instrukcja_silnika = 5, RULE_wypisanie = 6, 
		RULE_wypisanie_krotkie = 7, RULE_wypisanie_rekursywne = 8, RULE_pokaz_drzewo = 9, 
		RULE_uruchomienie = 10, RULE_reset_silnika = 11, RULE_logi = 12, RULE_instrukcja_procesowa = 13, 
		RULE_import_procesu = 14, RULE_deport_procesu = 15, RULE_typ_ewaluacji = 16, 
		RULE_deklaracja_procesu = 17, RULE_desygnat_celu = 18, RULE_zapis_segmentu_anonimowego = 19, 
		RULE_blok_procesowy = 20, RULE_naglowek_bloku_procesowego = 21, RULE_arnosc = 22, 
		RULE_zawijanie_pamieci = 23, RULE_wyrazenie = 24, RULE_lista_wyrazen = 25, 
		RULE_nastepstwo_wyrazen = 26, RULE_dodatek = 27, RULE_waga = 28, RULE_desygnat_wagi = 29, 
		RULE_atrybut_wagi = 30, RULE_generacja = 31, RULE_mutacja = 32, RULE_krzyzowanie = 33, 
		RULE_krzyzowanie_arg = 34, RULE_kopiowanie_dod = 35, RULE_wartosc = 36, 
		RULE_glebokosc = 37, RULE_cel_dodatku = 38, RULE_zrodlo_dodatku = 39, 
		RULE_poz_dodatek = 40, RULE_pokoloruj = 41, RULE_pokaz_generatory = 42, 
		RULE_wezel_dod = 43, RULE_nieterm_dod = 44, RULE_term_dod = 45, RULE_par_dod = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"populacja", "osobnik", "program", "proces", "instrukcja", "instrukcja_silnika", 
			"wypisanie", "wypisanie_krotkie", "wypisanie_rekursywne", "pokaz_drzewo", 
			"uruchomienie", "reset_silnika", "logi", "instrukcja_procesowa", "import_procesu", 
			"deport_procesu", "typ_ewaluacji", "deklaracja_procesu", "desygnat_celu", 
			"zapis_segmentu_anonimowego", "blok_procesowy", "naglowek_bloku_procesowego", 
			"arnosc", "zawijanie_pamieci", "wyrazenie", "lista_wyrazen", "nastepstwo_wyrazen", 
			"dodatek", "waga", "desygnat_wagi", "atrybut_wagi", "generacja", "mutacja", 
			"krzyzowanie", "krzyzowanie_arg", "kopiowanie_dod", "wartosc", "glebokosc", 
			"cel_dodatku", "zrodlo_dodatku", "poz_dodatek", "pokoloruj", "pokaz_generatory", 
			"wezel_dod", "nieterm_dod", "term_dod", "par_dod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'population'", "','", "'size:'", "'ls'", "'ll'", "'show'", "'-r'", 
			"'-R'", "'run'", "'reset'", "'trace'", "'use'", "'^'", "'parent'", "'use-not'", 
			"'::='", "'::+='", "'-'", "'+'", "'~'", "'%'", "'*'", "'/'", "'&'", "'|'", 
			"'~='", "'!~='", "'>'", "'<'", "':='", "'.'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'if'", "'else'", "'while'", "'break_with'", "'weight'", 
			"'of'", "':'", "'node'", "'call'", "'min'", "'max'", "'roundexp'", "'='", 
			"'full'", "'grow'", "'s'", "'subtree'", "'sfs'", "'size-fair-subtree'", 
			"'p'", "'point'", "'-mutate'", "'depth'", "'cross'", "'with'", "'dcpy'", 
			"'into'", "'at'", "'color'", "'colour'", "'generators'", "'gens'", "'nonterm'", 
			"'term'", null, null, "'(/'", "'\\)'", "'(#'", "'#)'", null, null, null, 
			null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"KOLOR_HTML", "KOLOR_HTML_KROTKI", "ZAWIJAS_LEWY", "ZAWIJAS_PRAWY", "LNAWIAS_Z_KRATKA", 
			"PNAWIAS_Z_KRATKA", "EWALUACJA", "LENIWA", "SPRYTNA", "GORLIWA", "EOS", 
			"NAZWA", "NAPIS_DOSL", "STALA", "IntegerLiteral", "COMMENT", "WS"
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

	public populacjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PopulacjaContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public List<TerminalNode> EOS() { return getTokens(populacjaParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(populacjaParser.EOS, i);
		}
		public List<OsobnikContext> osobnik() {
			return getRuleContexts(OsobnikContext.class);
		}
		public OsobnikContext osobnik(int i) {
			return getRuleContext(OsobnikContext.class,i);
		}
		public PopulacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_populacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPopulacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPopulacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPopulacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PopulacjaContext populacja() throws RecognitionException {
		PopulacjaContext _localctx = new PopulacjaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_populacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__0);
			setState(95);
			match(NAZWA);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(96);
				match(T__1);
				}
			}

			setState(99);
			match(T__2);
			setState(100);
			match(STALA);
			setState(101);
			match(EOS);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3665755373568L) != 0 || _la==NAZWA || _la==STALA) {
				{
				{
				setState(102);
				osobnik();
				setState(103);
				match(EOS);
				}
				}
				setState(109);
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
	public static class OsobnikContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public OsobnikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_osobnik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterOsobnik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitOsobnik(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitOsobnik(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OsobnikContext osobnik() throws RecognitionException {
		OsobnikContext _localctx = new OsobnikContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_osobnik);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			wyrazenie(0);
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(populacjaParser.EOF, 0); }
		public List<InstrukcjaContext> instrukcja() {
			return getRuleContexts(InstrukcjaContext.class);
		}
		public InstrukcjaContext instrukcja(int i) {
			return getRuleContext(InstrukcjaContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -6343276826977329552L) != 0 || (((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 713023L) != 0) {
				{
				{
				setState(112);
				instrukcja();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
	public static class ProcesContext extends ParserRuleContext {
		public Deklaracja_procesuContext deklaracja_procesu() {
			return getRuleContext(Deklaracja_procesuContext.class,0);
		}
		public TerminalNode EOF() { return getToken(populacjaParser.EOF, 0); }
		public ProcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterProces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitProces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitProces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesContext proces() throws RecognitionException {
		ProcesContext _localctx = new ProcesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_proces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			deklaracja_procesu();
			setState(121);
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
		public Instrukcja_procesowaContext instrukcja_procesowa() {
			return getRuleContext(Instrukcja_procesowaContext.class,0);
		}
		public Instrukcja_silnikaContext instrukcja_silnika() {
			return getRuleContext(Instrukcja_silnikaContext.class,0);
		}
		public DodatekContext dodatek() {
			return getRuleContext(DodatekContext.class,0);
		}
		public InstrukcjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instrukcja);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__14:
			case T__17:
			case T__18:
			case T__30:
			case T__31:
			case T__33:
			case T__35:
			case T__37:
			case T__39:
			case T__40:
			case ZAWIJAS_LEWY:
			case LENIWA:
			case SPRYTNA:
			case GORLIWA:
			case NAZWA:
			case STALA:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				instrukcja_procesowa();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				instrukcja_silnika();
				}
				break;
			case T__41:
			case T__44:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__60:
			case T__62:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				dodatek();
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
	public static class Instrukcja_silnikaContext extends ParserRuleContext {
		public UruchomienieContext uruchomienie() {
			return getRuleContext(UruchomienieContext.class,0);
		}
		public WypisanieContext wypisanie() {
			return getRuleContext(WypisanieContext.class,0);
		}
		public Reset_silnikaContext reset_silnika() {
			return getRuleContext(Reset_silnikaContext.class,0);
		}
		public Pokaz_drzewoContext pokaz_drzewo() {
			return getRuleContext(Pokaz_drzewoContext.class,0);
		}
		public LogiContext logi() {
			return getRuleContext(LogiContext.class,0);
		}
		public Instrukcja_silnikaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_silnika; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterInstrukcja_silnika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitInstrukcja_silnika(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitInstrukcja_silnika(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_silnikaContext instrukcja_silnika() throws RecognitionException {
		Instrukcja_silnikaContext _localctx = new Instrukcja_silnikaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrukcja_silnika);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				uruchomienie();
				}
				break;
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				wypisanie();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				reset_silnika();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				pokaz_drzewo();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				logi();
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
	public static class WypisanieContext extends ParserRuleContext {
		public Wypisanie_krotkieContext wypisanie_krotkie() {
			return getRuleContext(Wypisanie_krotkieContext.class,0);
		}
		public Wypisanie_rekursywneContext wypisanie_rekursywne() {
			return getRuleContext(Wypisanie_rekursywneContext.class,0);
		}
		public WypisanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWypisanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WypisanieContext wypisanie() throws RecognitionException {
		WypisanieContext _localctx = new WypisanieContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wypisanie);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				wypisanie_krotkie();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				wypisanie_rekursywne();
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
	public static class Wypisanie_krotkieContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Wypisanie_krotkieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie_krotkie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWypisanie_krotkie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWypisanie_krotkie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWypisanie_krotkie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wypisanie_krotkieContext wypisanie_krotkie() throws RecognitionException {
		Wypisanie_krotkieContext _localctx = new Wypisanie_krotkieContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wypisanie_krotkie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__3);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAZWA) {
				{
				setState(140);
				match(NAZWA);
				}
			}

			setState(143);
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
	public static class Wypisanie_rekursywneContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Wypisanie_rekursywneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie_rekursywne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWypisanie_rekursywne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWypisanie_rekursywne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWypisanie_rekursywne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wypisanie_rekursywneContext wypisanie_rekursywne() throws RecognitionException {
		Wypisanie_rekursywneContext _localctx = new Wypisanie_rekursywneContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wypisanie_rekursywne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__4);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAZWA) {
				{
				setState(146);
				match(NAZWA);
				}
			}

			setState(149);
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
	public static class Pokaz_drzewoContext extends ParserRuleContext {
		public Token rek;
		public List<TerminalNode> NAZWA() { return getTokens(populacjaParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(populacjaParser.NAZWA, i);
		}
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public Pokaz_drzewoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokaz_drzewo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPokaz_drzewo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPokaz_drzewo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPokaz_drzewo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pokaz_drzewoContext pokaz_drzewo() throws RecognitionException {
		Pokaz_drzewoContext _localctx = new Pokaz_drzewoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pokaz_drzewo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__5);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__7) {
				{
				setState(152);
				((Pokaz_drzewoContext)_localctx).rek = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
					((Pokaz_drzewoContext)_localctx).rek = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(155);
			match(NAZWA);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(156);
				match(T__1);
				setState(157);
				match(NAZWA);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
	public static class UruchomienieContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public UruchomienieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uruchomienie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterUruchomienie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitUruchomienie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitUruchomienie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UruchomienieContext uruchomienie() throws RecognitionException {
		UruchomienieContext _localctx = new UruchomienieContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_uruchomienie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__8);
			setState(166);
			match(NAZWA);
			setState(167);
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
	public static class Reset_silnikaContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public Reset_silnikaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset_silnika; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterReset_silnika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitReset_silnika(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitReset_silnika(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reset_silnikaContext reset_silnika() throws RecognitionException {
		Reset_silnikaContext _localctx = new Reset_silnikaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_reset_silnika);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__9);
			setState(170);
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
	public static class LogiContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public LogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterLogi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitLogi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitLogi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogiContext logi() throws RecognitionException {
		LogiContext _localctx = new LogiContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__10);
			setState(173);
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
	public static class Instrukcja_procesowaContext extends ParserRuleContext {
		public Deklaracja_procesuContext deklaracja_procesu() {
			return getRuleContext(Deklaracja_procesuContext.class,0);
		}
		public Import_procesuContext import_procesu() {
			return getRuleContext(Import_procesuContext.class,0);
		}
		public Deport_procesuContext deport_procesu() {
			return getRuleContext(Deport_procesuContext.class,0);
		}
		public Typ_ewaluacjiContext typ_ewaluacji() {
			return getRuleContext(Typ_ewaluacjiContext.class,0);
		}
		public Instrukcja_procesowaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrukcja_procesowa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterInstrukcja_procesowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitInstrukcja_procesowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitInstrukcja_procesowa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_procesowaContext instrukcja_procesowa() throws RecognitionException {
		Instrukcja_procesowaContext _localctx = new Instrukcja_procesowaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_instrukcja_procesowa);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__30:
			case T__31:
			case T__33:
			case T__35:
			case T__37:
			case T__39:
			case T__40:
			case ZAWIJAS_LEWY:
			case NAZWA:
			case STALA:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				deklaracja_procesu();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				import_procesu();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				deport_procesu();
				}
				break;
			case LENIWA:
			case SPRYTNA:
			case GORLIWA:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				typ_ewaluacji();
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
	public static class Import_procesuContext extends ParserRuleContext {
		public Token special;
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public List<TerminalNode> NAZWA() { return getTokens(populacjaParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(populacjaParser.NAZWA, i);
		}
		public Import_procesuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_procesu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterImport_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitImport_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitImport_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_procesuContext import_procesu() throws RecognitionException {
		Import_procesuContext _localctx = new Import_procesuContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_import_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__11);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				{
				{
				setState(182);
				((Import_procesuContext)_localctx).special = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
					((Import_procesuContext)_localctx).special = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case NAZWA:
				{
				{
				setState(183);
				match(NAZWA);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(184);
					match(T__1);
					setState(185);
					match(NAZWA);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
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
	public static class Deport_procesuContext extends ParserRuleContext {
		public List<TerminalNode> NAZWA() { return getTokens(populacjaParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(populacjaParser.NAZWA, i);
		}
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public Deport_procesuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deport_procesu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterDeport_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitDeport_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitDeport_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deport_procesuContext deport_procesu() throws RecognitionException {
		Deport_procesuContext _localctx = new Deport_procesuContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deport_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__14);
			setState(196);
			match(NAZWA);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(197);
				match(T__1);
				setState(198);
				match(NAZWA);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
	public static class Typ_ewaluacjiContext extends ParserRuleContext {
		public TerminalNode EWALUACJA() { return getToken(populacjaParser.EWALUACJA, 0); }
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public TerminalNode LENIWA() { return getToken(populacjaParser.LENIWA, 0); }
		public TerminalNode SPRYTNA() { return getToken(populacjaParser.SPRYTNA, 0); }
		public TerminalNode GORLIWA() { return getToken(populacjaParser.GORLIWA, 0); }
		public Typ_ewaluacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ_ewaluacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterTyp_ewaluacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitTyp_ewaluacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitTyp_ewaluacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typ_ewaluacjiContext typ_ewaluacji() throws RecognitionException {
		Typ_ewaluacjiContext _localctx = new Typ_ewaluacjiContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typ_ewaluacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(207);
			match(EWALUACJA);
			setState(208);
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
	public static class Deklaracja_procesuContext extends ParserRuleContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public Desygnat_celuContext desygnat_celu() {
			return getRuleContext(Desygnat_celuContext.class,0);
		}
		public Blok_procesowyContext blok_procesowy() {
			return getRuleContext(Blok_procesowyContext.class,0);
		}
		public Zapis_segmentu_anonimowegoContext zapis_segmentu_anonimowego() {
			return getRuleContext(Zapis_segmentu_anonimowegoContext.class,0);
		}
		public Deklaracja_procesuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deklaracja_procesu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterDeklaracja_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitDeklaracja_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitDeklaracja_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_procesuContext deklaracja_procesu() throws RecognitionException {
		Deklaracja_procesuContext _localctx = new Deklaracja_procesuContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_deklaracja_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(210);
				desygnat_celu();
				}
				break;
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZAWIJAS_LEWY) {
				{
				setState(213);
				blok_procesowy();
				}
			}

			setState(216);
			wyrazenie(0);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LNAWIAS_Z_KRATKA) {
				{
				setState(217);
				zapis_segmentu_anonimowego();
				}
			}

			setState(220);
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
	public static class Desygnat_celuContext extends ParserRuleContext {
		public Token op;
		public List<TerminalNode> NAZWA() { return getTokens(populacjaParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(populacjaParser.NAZWA, i);
		}
		public Desygnat_celuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desygnat_celu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterDesygnat_celu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitDesygnat_celu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitDesygnat_celu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desygnat_celuContext desygnat_celu() throws RecognitionException {
		Desygnat_celuContext _localctx = new Desygnat_celuContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_desygnat_celu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(NAZWA);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(223);
				match(T__1);
				setState(224);
				match(NAZWA);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			((Desygnat_celuContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
				((Desygnat_celuContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class Zapis_segmentu_anonimowegoContext extends ParserRuleContext {
		public Token znak;
		public TerminalNode LNAWIAS_Z_KRATKA() { return getToken(populacjaParser.LNAWIAS_Z_KRATKA, 0); }
		public TerminalNode PNAWIAS_Z_KRATKA() { return getToken(populacjaParser.PNAWIAS_Z_KRATKA, 0); }
		public List<TerminalNode> STALA() { return getTokens(populacjaParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(populacjaParser.STALA, i);
		}
		public Zapis_segmentu_anonimowegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapis_segmentu_anonimowego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterZapis_segmentu_anonimowego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitZapis_segmentu_anonimowego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitZapis_segmentu_anonimowego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapis_segmentu_anonimowegoContext zapis_segmentu_anonimowego() throws RecognitionException {
		Zapis_segmentu_anonimowegoContext _localctx = new Zapis_segmentu_anonimowegoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_zapis_segmentu_anonimowego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(LNAWIAS_Z_KRATKA);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18 || _la==STALA) {
				{
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17 || _la==T__18) {
					{
					setState(233);
					((Zapis_segmentu_anonimowegoContext)_localctx).znak = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
						((Zapis_segmentu_anonimowegoContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(236);
				match(STALA);
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
			match(PNAWIAS_Z_KRATKA);
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
	public static class Blok_procesowyContext extends ParserRuleContext {
		public TerminalNode ZAWIJAS_LEWY() { return getToken(populacjaParser.ZAWIJAS_LEWY, 0); }
		public TerminalNode ZAWIJAS_PRAWY() { return getToken(populacjaParser.ZAWIJAS_PRAWY, 0); }
		public Naglowek_bloku_procesowegoContext naglowek_bloku_procesowego() {
			return getRuleContext(Naglowek_bloku_procesowegoContext.class,0);
		}
		public List<Instrukcja_procesowaContext> instrukcja_procesowa() {
			return getRuleContexts(Instrukcja_procesowaContext.class);
		}
		public Instrukcja_procesowaContext instrukcja_procesowa(int i) {
			return getRuleContext(Instrukcja_procesowaContext.class,i);
		}
		public Blok_procesowyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blok_procesowy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterBlok_procesowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitBlok_procesowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitBlok_procesowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blok_procesowyContext blok_procesowy() throws RecognitionException {
		Blok_procesowyContext _localctx = new Blok_procesowyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_blok_procesowy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(ZAWIJAS_LEWY);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(245);
				naglowek_bloku_procesowego();
				}
				break;
			}
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3665755410432L) != 0 || (((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 2785L) != 0) {
				{
				{
				setState(248);
				instrukcja_procesowa();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(ZAWIJAS_PRAWY);
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
	public static class Naglowek_bloku_procesowegoContext extends ParserRuleContext {
		public ArnoscContext arnosc() {
			return getRuleContext(ArnoscContext.class,0);
		}
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public Zawijanie_pamieciContext zawijanie_pamieci() {
			return getRuleContext(Zawijanie_pamieciContext.class,0);
		}
		public Naglowek_bloku_procesowegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naglowek_bloku_procesowego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterNaglowek_bloku_procesowego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitNaglowek_bloku_procesowego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitNaglowek_bloku_procesowego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naglowek_bloku_procesowegoContext naglowek_bloku_procesowego() throws RecognitionException {
		Naglowek_bloku_procesowegoContext _localctx = new Naglowek_bloku_procesowegoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_naglowek_bloku_procesowego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			arnosc();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(257);
				match(T__1);
				setState(258);
				zawijanie_pamieci();
				}
			}

			setState(261);
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
	public static class ArnoscContext extends ParserRuleContext {
		public List<TerminalNode> STALA() { return getTokens(populacjaParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(populacjaParser.STALA, i);
		}
		public ArnoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterArnosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitArnosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitArnosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoscContext arnosc() throws RecognitionException {
		ArnoscContext _localctx = new ArnoscContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arnosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(STALA);
			setState(264);
			match(T__19);
			setState(265);
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
	public static class Zawijanie_pamieciContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public Zawijanie_pamieciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zawijanie_pamieci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterZawijanie_pamieci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitZawijanie_pamieci(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitZawijanie_pamieci(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zawijanie_pamieciContext zawijanie_pamieci() throws RecognitionException {
		Zawijanie_pamieciContext _localctx = new Zawijanie_pamieciContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_zawijanie_pamieci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__20);
			setState(268);
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
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieInstrukcjaWarunkowaContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieInstrukcjaWarunkowaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieInstrukcjaWarunkowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieInstrukcjaWarunkowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieInstrukcjaWarunkowa(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieLubLgiczContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieLubLgiczContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieLubLgicz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieLubLgicz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieLubLgicz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieAdresZmiennejContext extends WyrazenieContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public WyrazenieAdresZmiennejContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieAdresZmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieAdresZmiennej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieAdresZmiennej(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieNawiasyContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieNawiasyContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieNawiasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieNawiasy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieNawiasy(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazeniePorownanieContext extends WyrazenieContext {
		public Token porownanie;
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePorownanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazeniePorownanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazeniePorownanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazeniePorownanie(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieDereferencjaContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieDereferencjaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieDereferencja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieDereferencja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieDereferencja(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazeniePetelkaContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePetelkaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazeniePetelka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazeniePetelka(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazeniePetelka(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieInstrukcjaZlozonaContext extends WyrazenieContext {
		public Nastepstwo_wyrazenContext nastepstwo_wyrazen() {
			return getRuleContext(Nastepstwo_wyrazenContext.class,0);
		}
		public WyrazenieInstrukcjaZlozonaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieInstrukcjaZlozona(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieInstrukcjaZlozona(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieInstrukcjaZlozona(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieILgiczContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazenieILgiczContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieILgicz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieILgicz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieILgicz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazeniePrzerwaniePetelkiContext extends WyrazenieContext {
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazeniePrzerwaniePetelkiContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazeniePrzerwaniePetelki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazeniePrzerwaniePetelki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazeniePrzerwaniePetelki(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieMult(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazeniePrzypisanieContext extends WyrazenieContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public WyrazeniePrzypisanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazeniePrzypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazeniePrzypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazeniePrzypisanie(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieAddyt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieStalaContext extends WyrazenieContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public WyrazenieStalaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieStala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieStala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieStala(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieWywolanieContext extends WyrazenieContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Lista_wyrazenContext lista_wyrazen() {
			return getRuleContext(Lista_wyrazenContext.class,0);
		}
		public WyrazenieWywolanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieWywolanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieWywolanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieWywolanie(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieZnakContext extends WyrazenieContext {
		public Token znak;
		public WyrazenieContext wyrazenie() {
			return getRuleContext(WyrazenieContext.class,0);
		}
		public WyrazenieZnakContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWyrazenieZnak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWyrazenieZnak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWyrazenieZnak(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(271);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				wyrazenie(16);
				}
				break;
			case T__30:
				{
				_localctx = new WyrazenieAdresZmiennejContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(T__30);
				setState(274);
				match(NAZWA);
				}
				break;
			case STALA:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(STALA);
				}
				break;
			case NAZWA:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(NAZWA);
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(277);
					match(T__31);
					setState(278);
					lista_wyrazen();
					setState(279);
					match(T__32);
					}
					break;
				}
				}
				break;
			case T__33:
				{
				_localctx = new WyrazenieDereferencjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				match(T__33);
				setState(284);
				wyrazenie(0);
				setState(285);
				match(T__34);
				}
				break;
			case T__31:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__31);
				setState(288);
				wyrazenie(0);
				setState(289);
				match(T__32);
				}
				break;
			case T__35:
				{
				_localctx = new WyrazenieInstrukcjaZlozonaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(T__35);
				setState(292);
				nastepstwo_wyrazen();
				setState(293);
				match(T__36);
				}
				break;
			case T__37:
				{
				_localctx = new WyrazenieInstrukcjaWarunkowaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(T__37);
				setState(296);
				match(T__31);
				setState(297);
				wyrazenie(0);
				setState(298);
				match(T__32);
				setState(299);
				wyrazenie(0);
				setState(300);
				match(T__38);
				setState(301);
				wyrazenie(3);
				}
				break;
			case T__39:
				{
				_localctx = new WyrazeniePetelkaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(T__39);
				setState(304);
				match(T__31);
				setState(305);
				wyrazenie(0);
				setState(306);
				match(T__32);
				setState(307);
				wyrazenie(2);
				}
				break;
			case T__40:
				{
				_localctx = new WyrazeniePrzerwaniePetelkiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(T__40);
				setState(310);
				wyrazenie(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(313);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(314);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(315);
						wyrazenie(16);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(316);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(317);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(318);
						wyrazenie(15);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieILgiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(319);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(320);
						match(T__23);
						setState(321);
						wyrazenie(14);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLubLgiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(322);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(323);
						match(T__24);
						setState(324);
						wyrazenie(13);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(325);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(326);
						((WyrazeniePorownanieContext)_localctx).porownanie = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0) ) {
							((WyrazeniePorownanieContext)_localctx).porownanie = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						wyrazenie(12);
						}
						break;
					case 6:
						{
						_localctx = new WyrazeniePrzypisanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(328);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(329);
						match(T__29);
						setState(330);
						wyrazenie(10);
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_wyrazenContext extends ParserRuleContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public Lista_wyrazenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_wyrazen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterLista_wyrazen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitLista_wyrazen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitLista_wyrazen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_wyrazenContext lista_wyrazen() throws RecognitionException {
		Lista_wyrazenContext _localctx = new Lista_wyrazenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lista_wyrazen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3665755373568L) != 0 || _la==NAZWA || _la==STALA) {
				{
				setState(336);
				wyrazenie(0);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(337);
					match(T__1);
					setState(338);
					wyrazenie(0);
					}
					}
					setState(343);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Nastepstwo_wyrazenContext extends ParserRuleContext {
		public List<WyrazenieContext> wyrazenie() {
			return getRuleContexts(WyrazenieContext.class);
		}
		public WyrazenieContext wyrazenie(int i) {
			return getRuleContext(WyrazenieContext.class,i);
		}
		public List<TerminalNode> EOS() { return getTokens(populacjaParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(populacjaParser.EOS, i);
		}
		public Nastepstwo_wyrazenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nastepstwo_wyrazen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterNastepstwo_wyrazen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitNastepstwo_wyrazen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitNastepstwo_wyrazen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nastepstwo_wyrazenContext nastepstwo_wyrazen() throws RecognitionException {
		Nastepstwo_wyrazenContext _localctx = new Nastepstwo_wyrazenContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nastepstwo_wyrazen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3665755373568L) != 0 || _la==NAZWA || _la==STALA) {
				{
				{
				setState(346);
				wyrazenie(0);
				setState(347);
				match(EOS);
				}
				}
				setState(353);
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
	public static class DodatekContext extends ParserRuleContext {
		public TerminalNode EOS() { return getToken(populacjaParser.EOS, 0); }
		public GeneracjaContext generacja() {
			return getRuleContext(GeneracjaContext.class,0);
		}
		public MutacjaContext mutacja() {
			return getRuleContext(MutacjaContext.class,0);
		}
		public KrzyzowanieContext krzyzowanie() {
			return getRuleContext(KrzyzowanieContext.class,0);
		}
		public PokolorujContext pokoloruj() {
			return getRuleContext(PokolorujContext.class,0);
		}
		public Wezel_dodContext wezel_dod() {
			return getRuleContext(Wezel_dodContext.class,0);
		}
		public Nieterm_dodContext nieterm_dod() {
			return getRuleContext(Nieterm_dodContext.class,0);
		}
		public Term_dodContext term_dod() {
			return getRuleContext(Term_dodContext.class,0);
		}
		public Pokaz_generatoryContext pokaz_generatory() {
			return getRuleContext(Pokaz_generatoryContext.class,0);
		}
		public Kopiowanie_dodContext kopiowanie_dod() {
			return getRuleContext(Kopiowanie_dodContext.class,0);
		}
		public WagaContext waga() {
			return getRuleContext(WagaContext.class,0);
		}
		public DodatekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dodatek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterDodatek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitDodatek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitDodatek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodatekContext dodatek() throws RecognitionException {
		DodatekContext _localctx = new DodatekContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_dodatek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
			case T__51:
				{
				setState(354);
				generacja();
				}
				break;
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				{
				setState(355);
				mutacja();
				}
				break;
			case T__60:
				{
				setState(356);
				krzyzowanie();
				}
				break;
			case T__65:
			case T__66:
				{
				setState(357);
				pokoloruj();
				}
				break;
			case T__44:
				{
				setState(358);
				wezel_dod();
				}
				break;
			case T__69:
				{
				setState(359);
				nieterm_dod();
				}
				break;
			case T__70:
				{
				setState(360);
				term_dod();
				}
				break;
			case T__67:
			case T__68:
				{
				setState(361);
				pokaz_generatory();
				}
				break;
			case T__62:
				{
				setState(362);
				kopiowanie_dod();
				}
				break;
			case T__41:
				{
				setState(363);
				waga();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(366);
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
	public static class WagaContext extends ParserRuleContext {
		public List<Desygnat_wagiContext> desygnat_wagi() {
			return getRuleContexts(Desygnat_wagiContext.class);
		}
		public Desygnat_wagiContext desygnat_wagi(int i) {
			return getRuleContext(Desygnat_wagiContext.class,i);
		}
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public List<Atrybut_wagiContext> atrybut_wagi() {
			return getRuleContexts(Atrybut_wagiContext.class);
		}
		public Atrybut_wagiContext atrybut_wagi(int i) {
			return getRuleContext(Atrybut_wagiContext.class,i);
		}
		public WagaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waga; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWaga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWaga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWaga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WagaContext waga() throws RecognitionException {
		WagaContext _localctx = new WagaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_waga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__41);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(369);
				match(T__42);
				}
			}

			setState(372);
			desygnat_wagi();
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(373);
				match(T__1);
				setState(374);
				desygnat_wagi();
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			match(T__43);
			setState(381);
			match(STALA);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0) {
				{
				{
				setState(382);
				atrybut_wagi();
				}
				}
				setState(387);
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
	public static class Desygnat_wagiContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public TerminalNode NAPIS_DOSL() { return getToken(populacjaParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Desygnat_wagiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desygnat_wagi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterDesygnat_wagi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitDesygnat_wagi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitDesygnat_wagi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desygnat_wagiContext desygnat_wagi() throws RecognitionException {
		Desygnat_wagiContext _localctx = new Desygnat_wagiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_desygnat_wagi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
			case NAPIS_DOSL:
				{
				{
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(388);
					match(T__44);
					}
				}

				setState(391);
				match(NAPIS_DOSL);
				}
				}
				break;
			case T__45:
			case NAZWA:
				{
				{
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(392);
					match(T__45);
					}
				}

				setState(395);
				match(NAZWA);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__33) {
				{
				setState(398);
				match(T__33);
				setState(399);
				match(STALA);
				setState(400);
				match(T__34);
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
	public static class Atrybut_wagiContext extends ParserRuleContext {
		public Token typ;
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public Atrybut_wagiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrybut_wagi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterAtrybut_wagi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitAtrybut_wagi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitAtrybut_wagi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atrybut_wagiContext atrybut_wagi() throws RecognitionException {
		Atrybut_wagiContext _localctx = new Atrybut_wagiContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atrybut_wagi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((Atrybut_wagiContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0) ) {
				((Atrybut_wagiContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(404);
			match(T__49);
			setState(405);
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
	public static class GeneracjaContext extends ParserRuleContext {
		public Token typ;
		public GlebokoscContext glebokosc() {
			return getRuleContext(GlebokoscContext.class,0);
		}
		public Cel_dodatkuContext cel_dodatku() {
			return getRuleContext(Cel_dodatkuContext.class,0);
		}
		public GeneracjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterGeneracja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitGeneracja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitGeneracja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneracjaContext generacja() throws RecognitionException {
		GeneracjaContext _localctx = new GeneracjaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_generacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			((GeneracjaContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__50 || _la==T__51) ) {
				((GeneracjaContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(408);
			glebokosc();
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(409);
				cel_dodatku();
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
	public static class MutacjaContext extends ParserRuleContext {
		public Token typ;
		public Zrodlo_dodatkuContext zrodlo_dodatku() {
			return getRuleContext(Zrodlo_dodatkuContext.class,0);
		}
		public GlebokoscContext glebokosc() {
			return getRuleContext(GlebokoscContext.class,0);
		}
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public Cel_dodatkuContext cel_dodatku() {
			return getRuleContext(Cel_dodatkuContext.class,0);
		}
		public MutacjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutacja; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterMutacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitMutacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitMutacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutacjaContext mutacja() throws RecognitionException {
		MutacjaContext _localctx = new MutacjaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mutacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			((MutacjaContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 567453553048682496L) != 0) ) {
				((MutacjaContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(413);
			match(T__58);
			setState(414);
			zrodlo_dodatku();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(415);
				poz_dodatek();
				}
			}

			setState(418);
			match(T__59);
			setState(419);
			glebokosc();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(420);
				cel_dodatku();
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
	public static class KrzyzowanieContext extends ParserRuleContext {
		public List<Krzyzowanie_argContext> krzyzowanie_arg() {
			return getRuleContexts(Krzyzowanie_argContext.class);
		}
		public Krzyzowanie_argContext krzyzowanie_arg(int i) {
			return getRuleContext(Krzyzowanie_argContext.class,i);
		}
		public Cel_dodatkuContext cel_dodatku() {
			return getRuleContext(Cel_dodatkuContext.class,0);
		}
		public KrzyzowanieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krzyzowanie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterKrzyzowanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitKrzyzowanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitKrzyzowanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrzyzowanieContext krzyzowanie() throws RecognitionException {
		KrzyzowanieContext _localctx = new KrzyzowanieContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_krzyzowanie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__60);
			setState(424);
			krzyzowanie_arg();
			setState(425);
			match(T__61);
			setState(426);
			krzyzowanie_arg();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(427);
				cel_dodatku();
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
	public static class Krzyzowanie_argContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public Krzyzowanie_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krzyzowanie_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterKrzyzowanie_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitKrzyzowanie_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitKrzyzowanie_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Krzyzowanie_argContext krzyzowanie_arg() throws RecognitionException {
		Krzyzowanie_argContext _localctx = new Krzyzowanie_argContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_krzyzowanie_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(NAZWA);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(431);
				poz_dodatek();
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
	public static class Kopiowanie_dodContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public Cel_dodatkuContext cel_dodatku() {
			return getRuleContext(Cel_dodatkuContext.class,0);
		}
		public Kopiowanie_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kopiowanie_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterKopiowanie_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitKopiowanie_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitKopiowanie_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kopiowanie_dodContext kopiowanie_dod() throws RecognitionException {
		Kopiowanie_dodContext _localctx = new Kopiowanie_dodContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kopiowanie_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(T__62);
			setState(435);
			match(NAZWA);
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(436);
				poz_dodatek();
				}
			}

			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__63) {
				{
				setState(439);
				cel_dodatku();
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
	public static class WartoscContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public WartoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wartosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWartosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWartosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWartosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WartoscContext wartosc() throws RecognitionException {
		WartoscContext _localctx = new WartoscContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_wartosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
	public static class GlebokoscContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public GlebokoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glebokosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterGlebokosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitGlebokosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitGlebokosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlebokoscContext glebokosc() throws RecognitionException {
		GlebokoscContext _localctx = new GlebokoscContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_glebokosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
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
	public static class Cel_dodatkuContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Cel_dodatkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cel_dodatku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterCel_dodatku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitCel_dodatku(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitCel_dodatku(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cel_dodatkuContext cel_dodatku() throws RecognitionException {
		Cel_dodatkuContext _localctx = new Cel_dodatkuContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_cel_dodatku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__63);
			setState(447);
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
	public static class Zrodlo_dodatkuContext extends ParserRuleContext {
		public TerminalNode NAZWA() { return getToken(populacjaParser.NAZWA, 0); }
		public Zrodlo_dodatkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zrodlo_dodatku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterZrodlo_dodatku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitZrodlo_dodatku(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitZrodlo_dodatku(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zrodlo_dodatkuContext zrodlo_dodatku() throws RecognitionException {
		Zrodlo_dodatkuContext _localctx = new Zrodlo_dodatkuContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_zrodlo_dodatku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
	public static class Poz_dodatekContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public Poz_dodatekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poz_dodatek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPoz_dodatek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPoz_dodatek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPoz_dodatek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Poz_dodatekContext poz_dodatek() throws RecognitionException {
		Poz_dodatekContext _localctx = new Poz_dodatekContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_poz_dodatek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__64);
			setState(452);
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
	public static class PokolorujContext extends ParserRuleContext {
		public List<TerminalNode> NAZWA() { return getTokens(populacjaParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(populacjaParser.NAZWA, i);
		}
		public TerminalNode KOLOR_HTML() { return getToken(populacjaParser.KOLOR_HTML, 0); }
		public TerminalNode KOLOR_HTML_KROTKI() { return getToken(populacjaParser.KOLOR_HTML_KROTKI, 0); }
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public PokolorujContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokoloruj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPokoloruj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPokoloruj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPokoloruj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PokolorujContext pokoloruj() throws RecognitionException {
		PokolorujContext _localctx = new PokolorujContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pokoloruj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__66) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(455);
			match(NAZWA);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(456);
				match(T__1);
				setState(457);
				match(NAZWA);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==KOLOR_HTML || _la==KOLOR_HTML_KROTKI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(464);
				poz_dodatek();
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
	public static class Pokaz_generatoryContext extends ParserRuleContext {
		public Pokaz_generatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokaz_generatory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPokaz_generatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPokaz_generatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPokaz_generatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pokaz_generatoryContext pokaz_generatory() throws RecognitionException {
		Pokaz_generatoryContext _localctx = new Pokaz_generatoryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pokaz_generatory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==T__67 || _la==T__68) ) {
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
	public static class Wezel_dodContext extends ParserRuleContext {
		public List<Par_dodContext> par_dod() {
			return getRuleContexts(Par_dodContext.class);
		}
		public Par_dodContext par_dod(int i) {
			return getRuleContext(Par_dodContext.class,i);
		}
		public Wezel_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wezel_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterWezel_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitWezel_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitWezel_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wezel_dodContext wezel_dod() throws RecognitionException {
		Wezel_dodContext _localctx = new Wezel_dodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_wezel_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(T__44);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(470);
				par_dod();
				}
				break;
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(473);
				par_dod();
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
	public static class Nieterm_dodContext extends ParserRuleContext {
		public List<Par_dodContext> par_dod() {
			return getRuleContexts(Par_dodContext.class);
		}
		public Par_dodContext par_dod(int i) {
			return getRuleContext(Par_dodContext.class,i);
		}
		public Nieterm_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nieterm_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterNieterm_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitNieterm_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitNieterm_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nieterm_dodContext nieterm_dod() throws RecognitionException {
		Nieterm_dodContext _localctx = new Nieterm_dodContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nieterm_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__69);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(477);
				par_dod();
				}
				break;
			}
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(480);
				par_dod();
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
	public static class Term_dodContext extends ParserRuleContext {
		public List<Par_dodContext> par_dod() {
			return getRuleContexts(Par_dodContext.class);
		}
		public Par_dodContext par_dod(int i) {
			return getRuleContext(Par_dodContext.class,i);
		}
		public Term_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterTerm_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitTerm_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitTerm_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_dodContext term_dod() throws RecognitionException {
		Term_dodContext _localctx = new Term_dodContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_term_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(T__70);
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(484);
				par_dod();
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(487);
				par_dod();
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
	public static class Par_dodContext extends ParserRuleContext {
		public TerminalNode STALA() { return getToken(populacjaParser.STALA, 0); }
		public Par_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).enterPar_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof populacjaListener ) ((populacjaListener)listener).exitPar_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof populacjaVisitor ) return ((populacjaVisitor<? extends T>)visitor).visitPar_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_dodContext par_dod() throws RecognitionException {
		Par_dodContext _localctx = new Par_dodContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_par_dod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
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
		case 24:
			return wyrazenie_sempred((WyrazenieContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wyrazenie_sempred(WyrazenieContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001X\u01ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000j\b\u0000\n\u0000\f\u0000m\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u0002r\b\u0002\n\u0002\f\u0002u\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u007f\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0086\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u008a\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u008e\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0094\b"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u009a\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u009f\b\t\n\t\f\t\u00a2\t\t\u0001\t\u0001\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00bb\b\u000e\n"+
		"\u000e\f\u000e\u00be\t\u000e\u0003\u000e\u00c0\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00c8"+
		"\b\u000f\n\u000f\f\u000f\u00cb\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u00d4\b\u0011"+
		"\u0001\u0011\u0003\u0011\u00d7\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00db\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00e2\b\u0012\n\u0012\f\u0012\u00e5\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00eb\b\u0013\u0001\u0013\u0005"+
		"\u0013\u00ee\b\u0013\n\u0013\f\u0013\u00f1\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00f7\b\u0014\u0001\u0014\u0005\u0014"+
		"\u00fa\b\u0014\n\u0014\f\u0014\u00fd\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0104\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u011a\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0138\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u014c\b\u0018\n\u0018\f\u0018"+
		"\u014f\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0154\b"+
		"\u0019\n\u0019\f\u0019\u0157\t\u0019\u0003\u0019\u0159\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u015e\b\u001a\n\u001a\f\u001a\u0161"+
		"\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u016d"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0173"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u0178\b\u001c"+
		"\n\u001c\f\u001c\u017b\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0180\b\u001c\n\u001c\f\u001c\u0183\t\u001c\u0001\u001d\u0003\u001d"+
		"\u0186\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u018a\b\u001d\u0001"+
		"\u001d\u0003\u001d\u018d\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0192\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u019b\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u01a1\b \u0001 \u0001 \u0001 \u0003 \u01a6\b \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01ad\b!\u0001\"\u0001\"\u0003\""+
		"\u01b1\b\"\u0001#\u0001#\u0001#\u0003#\u01b6\b#\u0001#\u0003#\u01b9\b"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005)\u01cb\b)\n)\f)\u01ce"+
		"\t)\u0001)\u0001)\u0003)\u01d2\b)\u0001*\u0001*\u0001+\u0001+\u0003+\u01d8"+
		"\b+\u0001+\u0003+\u01db\b+\u0001,\u0001,\u0003,\u01df\b,\u0001,\u0003"+
		",\u01e2\b,\u0001-\u0001-\u0003-\u01e6\b-\u0001-\u0003-\u01e9\b-\u0001"+
		".\u0001.\u0001.\u0000\u00010/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\\u0000\r\u0001\u0000\u0007\b\u0001\u0000\r\u000e\u0001\u0000OQ\u0001"+
		"\u0000\u0010\u0011\u0001\u0000\u0012\u0013\u0001\u0000\u0015\u0017\u0001"+
		"\u0000\u001a\u001d\u0001\u0000/1\u0001\u000034\u0001\u00005:\u0001\u0000"+
		"BC\u0001\u0000HI\u0001\u0000DE\u020c\u0000^\u0001\u0000\u0000\u0000\u0002"+
		"n\u0001\u0000\u0000\u0000\u0004s\u0001\u0000\u0000\u0000\u0006x\u0001"+
		"\u0000\u0000\u0000\b~\u0001\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000"+
		"\u0000\f\u0089\u0001\u0000\u0000\u0000\u000e\u008b\u0001\u0000\u0000\u0000"+
		"\u0010\u0091\u0001\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000"+
		"\u0014\u00a5\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000"+
		"\u0018\u00ac\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000"+
		"\u001c\u00b5\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000"+
		" \u00ce\u0001\u0000\u0000\u0000\"\u00d3\u0001\u0000\u0000\u0000$\u00de"+
		"\u0001\u0000\u0000\u0000&\u00e8\u0001\u0000\u0000\u0000(\u00f4\u0001\u0000"+
		"\u0000\u0000*\u0100\u0001\u0000\u0000\u0000,\u0107\u0001\u0000\u0000\u0000"+
		".\u010b\u0001\u0000\u0000\u00000\u0137\u0001\u0000\u0000\u00002\u0158"+
		"\u0001\u0000\u0000\u00004\u015f\u0001\u0000\u0000\u00006\u016c\u0001\u0000"+
		"\u0000\u00008\u0170\u0001\u0000\u0000\u0000:\u018c\u0001\u0000\u0000\u0000"+
		"<\u0193\u0001\u0000\u0000\u0000>\u0197\u0001\u0000\u0000\u0000@\u019c"+
		"\u0001\u0000\u0000\u0000B\u01a7\u0001\u0000\u0000\u0000D\u01ae\u0001\u0000"+
		"\u0000\u0000F\u01b2\u0001\u0000\u0000\u0000H\u01ba\u0001\u0000\u0000\u0000"+
		"J\u01bc\u0001\u0000\u0000\u0000L\u01be\u0001\u0000\u0000\u0000N\u01c1"+
		"\u0001\u0000\u0000\u0000P\u01c3\u0001\u0000\u0000\u0000R\u01c6\u0001\u0000"+
		"\u0000\u0000T\u01d3\u0001\u0000\u0000\u0000V\u01d5\u0001\u0000\u0000\u0000"+
		"X\u01dc\u0001\u0000\u0000\u0000Z\u01e3\u0001\u0000\u0000\u0000\\\u01ea"+
		"\u0001\u0000\u0000\u0000^_\u0005\u0001\u0000\u0000_a\u0005S\u0000\u0000"+
		"`b\u0005\u0002\u0000\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0005\u0003\u0000\u0000de\u0005U\u0000"+
		"\u0000ek\u0005R\u0000\u0000fg\u0003\u0002\u0001\u0000gh\u0005R\u0000\u0000"+
		"hj\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000l\u0001\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u00030\u0018\u0000o\u0003"+
		"\u0001\u0000\u0000\u0000pr\u0003\b\u0004\u0000qp\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0005\u0000"+
		"\u0000\u0001w\u0005\u0001\u0000\u0000\u0000xy\u0003\"\u0011\u0000yz\u0005"+
		"\u0000\u0000\u0001z\u0007\u0001\u0000\u0000\u0000{\u007f\u0003\u001a\r"+
		"\u0000|\u007f\u0003\n\u0005\u0000}\u007f\u00036\u001b\u0000~{\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f"+
		"\t\u0001\u0000\u0000\u0000\u0080\u0086\u0003\u0014\n\u0000\u0081\u0086"+
		"\u0003\f\u0006\u0000\u0082\u0086\u0003\u0016\u000b\u0000\u0083\u0086\u0003"+
		"\u0012\t\u0000\u0084\u0086\u0003\u0018\f\u0000\u0085\u0080\u0001\u0000"+
		"\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u000b\u0001\u0000\u0000\u0000\u0087\u008a\u0003\u000e"+
		"\u0007\u0000\u0088\u008a\u0003\u0010\b\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000"+
		"\u008b\u008d\u0005\u0004\u0000\u0000\u008c\u008e\u0005S\u0000\u0000\u008d"+
		"\u008c\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005R\u0000\u0000\u0090\u000f"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0005\u0005\u0000\u0000\u0092\u0094"+
		"\u0005S\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0005"+
		"R\u0000\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0099\u0005\u0006"+
		"\u0000\u0000\u0098\u009a\u0007\u0000\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u00a0\u0005S\u0000\u0000\u009c\u009d\u0005\u0002\u0000"+
		"\u0000\u009d\u009f\u0005S\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005R\u0000\u0000\u00a4"+
		"\u0013\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a7"+
		"\u0005S\u0000\u0000\u00a7\u00a8\u0005R\u0000\u0000\u00a8\u0015\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab\u0005R\u0000"+
		"\u0000\u00ab\u0017\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u000b\u0000"+
		"\u0000\u00ad\u00ae\u0005R\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000"+
		"\u00af\u00b4\u0003\"\u0011\u0000\u00b0\u00b4\u0003\u001c\u000e\u0000\u00b1"+
		"\u00b4\u0003\u001e\u000f\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3\u00af"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u001b"+
		"\u0001\u0000\u0000\u0000\u00b5\u00bf\u0005\f\u0000\u0000\u00b6\u00c0\u0007"+
		"\u0001\u0000\u0000\u00b7\u00bc\u0005S\u0000\u0000\u00b8\u00b9\u0005\u0002"+
		"\u0000\u0000\u00b9\u00bb\u0005S\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b7\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005R\u0000\u0000\u00c2\u001d\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\u000f\u0000\u0000\u00c4\u00c9\u0005S\u0000\u0000\u00c5"+
		"\u00c6\u0005\u0002\u0000\u0000\u00c6\u00c8\u0005S\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005R\u0000\u0000\u00cd\u001f\u0001\u0000\u0000\u0000\u00ce\u00cf\u0007"+
		"\u0002\u0000\u0000\u00cf\u00d0\u0005N\u0000\u0000\u00d0\u00d1\u0005R\u0000"+
		"\u0000\u00d1!\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003$\u0012\u0000\u00d3"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d7\u0003(\u0014\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u00030\u0018\u0000\u00d9\u00db\u0003"+
		"&\u0013\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005R\u0000"+
		"\u0000\u00dd#\u0001\u0000\u0000\u0000\u00de\u00e3\u0005S\u0000\u0000\u00df"+
		"\u00e0\u0005\u0002\u0000\u0000\u00e0\u00e2\u0005S\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0007\u0003\u0000\u0000\u00e7%\u0001\u0000\u0000\u0000\u00e8\u00ef\u0005"+
		"L\u0000\u0000\u00e9\u00eb\u0007\u0004\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0005U\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005M\u0000\u0000"+
		"\u00f3\'\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005J\u0000\u0000\u00f5"+
		"\u00f7\u0003*\u0015\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fb\u0001\u0000\u0000\u0000\u00f8\u00fa"+
		"\u0003\u001a\r\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u00ff\u0005K\u0000\u0000\u00ff)\u0001\u0000\u0000"+
		"\u0000\u0100\u0103\u0003,\u0016\u0000\u0101\u0102\u0005\u0002\u0000\u0000"+
		"\u0102\u0104\u0003.\u0017\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105"+
		"\u0106\u0005R\u0000\u0000\u0106+\u0001\u0000\u0000\u0000\u0107\u0108\u0005"+
		"U\u0000\u0000\u0108\u0109\u0005\u0014\u0000\u0000\u0109\u010a\u0005U\u0000"+
		"\u0000\u010a-\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u0015\u0000\u0000"+
		"\u010c\u010d\u0005U\u0000\u0000\u010d/\u0001\u0000\u0000\u0000\u010e\u010f"+
		"\u0006\u0018\uffff\uffff\u0000\u010f\u0110\u0007\u0004\u0000\u0000\u0110"+
		"\u0138\u00030\u0018\u0010\u0111\u0112\u0005\u001f\u0000\u0000\u0112\u0138"+
		"\u0005S\u0000\u0000\u0113\u0138\u0005U\u0000\u0000\u0114\u0119\u0005S"+
		"\u0000\u0000\u0115\u0116\u0005 \u0000\u0000\u0116\u0117\u00032\u0019\u0000"+
		"\u0117\u0118\u0005!\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u0115\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a"+
		"\u0138\u0001\u0000\u0000\u0000\u011b\u011c\u0005\"\u0000\u0000\u011c\u011d"+
		"\u00030\u0018\u0000\u011d\u011e\u0005#\u0000\u0000\u011e\u0138\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u0005 \u0000\u0000\u0120\u0121\u00030\u0018\u0000"+
		"\u0121\u0122\u0005!\u0000\u0000\u0122\u0138\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005$\u0000\u0000\u0124\u0125\u00034\u001a\u0000\u0125\u0126\u0005"+
		"%\u0000\u0000\u0126\u0138\u0001\u0000\u0000\u0000\u0127\u0128\u0005&\u0000"+
		"\u0000\u0128\u0129\u0005 \u0000\u0000\u0129\u012a\u00030\u0018\u0000\u012a"+
		"\u012b\u0005!\u0000\u0000\u012b\u012c\u00030\u0018\u0000\u012c\u012d\u0005"+
		"\'\u0000\u0000\u012d\u012e\u00030\u0018\u0003\u012e\u0138\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0005(\u0000\u0000\u0130\u0131\u0005 \u0000\u0000"+
		"\u0131\u0132\u00030\u0018\u0000\u0132\u0133\u0005!\u0000\u0000\u0133\u0134"+
		"\u00030\u0018\u0002\u0134\u0138\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		")\u0000\u0000\u0136\u0138\u00030\u0018\u0001\u0137\u010e\u0001\u0000\u0000"+
		"\u0000\u0137\u0111\u0001\u0000\u0000\u0000\u0137\u0113\u0001\u0000\u0000"+
		"\u0000\u0137\u0114\u0001\u0000\u0000\u0000\u0137\u011b\u0001\u0000\u0000"+
		"\u0000\u0137\u011f\u0001\u0000\u0000\u0000\u0137\u0123\u0001\u0000\u0000"+
		"\u0000\u0137\u0127\u0001\u0000\u0000\u0000\u0137\u012f\u0001\u0000\u0000"+
		"\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u014d\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\n\u000f\u0000\u0000\u013a\u013b\u0007\u0005\u0000\u0000"+
		"\u013b\u014c\u00030\u0018\u0010\u013c\u013d\n\u000e\u0000\u0000\u013d"+
		"\u013e\u0007\u0004\u0000\u0000\u013e\u014c\u00030\u0018\u000f\u013f\u0140"+
		"\n\r\u0000\u0000\u0140\u0141\u0005\u0018\u0000\u0000\u0141\u014c\u0003"+
		"0\u0018\u000e\u0142\u0143\n\f\u0000\u0000\u0143\u0144\u0005\u0019\u0000"+
		"\u0000\u0144\u014c\u00030\u0018\r\u0145\u0146\n\u000b\u0000\u0000\u0146"+
		"\u0147\u0007\u0006\u0000\u0000\u0147\u014c\u00030\u0018\f\u0148\u0149"+
		"\n\n\u0000\u0000\u0149\u014a\u0005\u001e\u0000\u0000\u014a\u014c\u0003"+
		"0\u0018\n\u014b\u0139\u0001\u0000\u0000\u0000\u014b\u013c\u0001\u0000"+
		"\u0000\u0000\u014b\u013f\u0001\u0000\u0000\u0000\u014b\u0142\u0001\u0000"+
		"\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014b\u0148\u0001\u0000"+
		"\u0000\u0000\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e1\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0155\u00030\u0018\u0000"+
		"\u0151\u0152\u0005\u0002\u0000\u0000\u0152\u0154\u00030\u0018\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0159\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0158"+
		"\u0150\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"3\u0001\u0000\u0000\u0000\u015a\u015b\u00030\u0018\u0000\u015b\u015c\u0005"+
		"R\u0000\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000"+
		"\u0000\u0000\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000"+
		"\u0000\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u01605\u0001\u0000\u0000"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u016d\u0003>\u001f\u0000"+
		"\u0163\u016d\u0003@ \u0000\u0164\u016d\u0003B!\u0000\u0165\u016d\u0003"+
		"R)\u0000\u0166\u016d\u0003V+\u0000\u0167\u016d\u0003X,\u0000\u0168\u016d"+
		"\u0003Z-\u0000\u0169\u016d\u0003T*\u0000\u016a\u016d\u0003F#\u0000\u016b"+
		"\u016d\u00038\u001c\u0000\u016c\u0162\u0001\u0000\u0000\u0000\u016c\u0163"+
		"\u0001\u0000\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016c\u0165"+
		"\u0001\u0000\u0000\u0000\u016c\u0166\u0001\u0000\u0000\u0000\u016c\u0167"+
		"\u0001\u0000\u0000\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016c\u0169"+
		"\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016f"+
		"\u0005R\u0000\u0000\u016f7\u0001\u0000\u0000\u0000\u0170\u0172\u0005*"+
		"\u0000\u0000\u0171\u0173\u0005+\u0000\u0000\u0172\u0171\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0179\u0003:\u001d\u0000\u0175\u0176\u0005\u0002\u0000\u0000"+
		"\u0176\u0178\u0003:\u001d\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178"+
		"\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179"+
		"\u017a\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017d\u0005,\u0000\u0000\u017d\u0181"+
		"\u0005U\u0000\u0000\u017e\u0180\u0003<\u001e\u0000\u017f\u017e\u0001\u0000"+
		"\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u01829\u0001\u0000\u0000"+
		"\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0186\u0005-\u0000\u0000"+
		"\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u018d\u0005T\u0000\u0000\u0188"+
		"\u018a\u0005.\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d"+
		"\u0005S\u0000\u0000\u018c\u0185\u0001\u0000\u0000\u0000\u018c\u0189\u0001"+
		"\u0000\u0000\u0000\u018d\u0191\u0001\u0000\u0000\u0000\u018e\u018f\u0005"+
		"\"\u0000\u0000\u018f\u0190\u0005U\u0000\u0000\u0190\u0192\u0005#\u0000"+
		"\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000"+
		"\u0000\u0192;\u0001\u0000\u0000\u0000\u0193\u0194\u0007\u0007\u0000\u0000"+
		"\u0194\u0195\u00052\u0000\u0000\u0195\u0196\u0005U\u0000\u0000\u0196="+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0007\b\u0000\u0000\u0198\u019a\u0003"+
		"J%\u0000\u0199\u019b\u0003L&\u0000\u019a\u0199\u0001\u0000\u0000\u0000"+
		"\u019a\u019b\u0001\u0000\u0000\u0000\u019b?\u0001\u0000\u0000\u0000\u019c"+
		"\u019d\u0007\t\u0000\u0000\u019d\u019e\u0005;\u0000\u0000\u019e\u01a0"+
		"\u0003N\'\u0000\u019f\u01a1\u0003P(\u0000\u01a0\u019f\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0005<\u0000\u0000\u01a3\u01a5\u0003J%\u0000\u01a4"+
		"\u01a6\u0003L&\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6A\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005=\u0000"+
		"\u0000\u01a8\u01a9\u0003D\"\u0000\u01a9\u01aa\u0005>\u0000\u0000\u01aa"+
		"\u01ac\u0003D\"\u0000\u01ab\u01ad\u0003L&\u0000\u01ac\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01adC\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b0\u0005S\u0000\u0000\u01af\u01b1\u0003P(\u0000\u01b0"+
		"\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1"+
		"E\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005?\u0000\u0000\u01b3\u01b5\u0005"+
		"S\u0000\u0000\u01b4\u01b6\u0003P(\u0000\u01b5\u01b4\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b9\u0003L&\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b9\u0001\u0000\u0000\u0000\u01b9G\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0005U\u0000\u0000\u01bbI\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005U"+
		"\u0000\u0000\u01bdK\u0001\u0000\u0000\u0000\u01be\u01bf\u0005@\u0000\u0000"+
		"\u01bf\u01c0\u0005S\u0000\u0000\u01c0M\u0001\u0000\u0000\u0000\u01c1\u01c2"+
		"\u0005S\u0000\u0000\u01c2O\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005A"+
		"\u0000\u0000\u01c4\u01c5\u0005U\u0000\u0000\u01c5Q\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0007\n\u0000\u0000\u01c7\u01cc\u0005S\u0000\u0000\u01c8"+
		"\u01c9\u0005\u0002\u0000\u0000\u01c9\u01cb\u0005S\u0000\u0000\u01ca\u01c8"+
		"\u0001\u0000\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d1"+
		"\u0007\u000b\u0000\u0000\u01d0\u01d2\u0003P(\u0000\u01d1\u01d0\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2S\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d4\u0007\f\u0000\u0000\u01d4U\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d7\u0005-\u0000\u0000\u01d6\u01d8\u0003\\.\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0003\\.\u0000\u01da\u01d9\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01dbW\u0001\u0000"+
		"\u0000\u0000\u01dc\u01de\u0005F\u0000\u0000\u01dd\u01df\u0003\\.\u0000"+
		"\u01de\u01dd\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003\\.\u0000\u01e1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"Y\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005G\u0000\u0000\u01e4\u01e6\u0003"+
		"\\.\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003\\."+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e9[\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005U\u0000\u0000\u01eb"+
		"]\u0001\u0000\u0000\u00005aks~\u0085\u0089\u008d\u0093\u0099\u00a0\u00b3"+
		"\u00bc\u00bf\u00c9\u00d3\u00d6\u00da\u00e3\u00ea\u00ef\u00f6\u00fb\u0103"+
		"\u0119\u0137\u014b\u014d\u0155\u0158\u015f\u016c\u0172\u0179\u0181\u0185"+
		"\u0189\u018c\u0191\u019a\u01a0\u01a5\u01ac\u01b0\u01b5\u01b8\u01cc\u01d1"+
		"\u01d7\u01da\u01de\u01e1\u01e5\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}