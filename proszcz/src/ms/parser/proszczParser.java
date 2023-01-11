// Generated from java-escape by ANTLR 4.11.1
package ms.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class proszczParser extends Parser {
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
		T__66=67, T__67=68, T__68=69, KOLOR_HTML=70, KOLOR_HTML_KROTKI=71, ZAWIJAS_LEWY=72, 
		ZAWIJAS_PRAWY=73, LNAWIAS_Z_KRATKA=74, PNAWIAS_Z_KRATKA=75, EWALUACJA=76, 
		LENIWA=77, SPRYTNA=78, GORLIWA=79, EOS=80, NAZWA=81, NAPIS_DOSL=82, STALA=83, 
		IntegerLiteral=84, COMMENT=85, WS=86;
	public static final int
		RULE_program = 0, RULE_proces = 1, RULE_instrukcja = 2, RULE_instrukcja_silnika = 3, 
		RULE_wypisanie = 4, RULE_wypisanie_krotkie = 5, RULE_wypisanie_rekursywne = 6, 
		RULE_pokaz_drzewo = 7, RULE_uruchomienie = 8, RULE_reset_silnika = 9, 
		RULE_logi = 10, RULE_instrukcja_procesowa = 11, RULE_import_procesu = 12, 
		RULE_deport_procesu = 13, RULE_typ_ewaluacji = 14, RULE_deklaracja_procesu = 15, 
		RULE_desygnat_celu = 16, RULE_zapis_segmentu_anonimowego = 17, RULE_blok_procesowy = 18, 
		RULE_naglowek_bloku_procesowego = 19, RULE_arnosc = 20, RULE_zawijanie_pamieci = 21, 
		RULE_wyrazenie = 22, RULE_lista_wyrazen = 23, RULE_nastepstwo_wyrazen = 24, 
		RULE_dodatek = 25, RULE_waga = 26, RULE_desygnat_wagi = 27, RULE_atrybut_wagi = 28, 
		RULE_generacja = 29, RULE_mutacja = 30, RULE_krzyzowanie = 31, RULE_krzyzowanie_arg = 32, 
		RULE_kopiowanie_dod = 33, RULE_wartosc = 34, RULE_glebokosc = 35, RULE_cel_dodatku = 36, 
		RULE_zrodlo_dodatku = 37, RULE_poz_dodatek = 38, RULE_pokoloruj = 39, 
		RULE_pokaz_generatory = 40, RULE_wezel_dod = 41, RULE_nieterm_dod = 42, 
		RULE_term_dod = 43, RULE_par_dod = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "proces", "instrukcja", "instrukcja_silnika", "wypisanie", 
			"wypisanie_krotkie", "wypisanie_rekursywne", "pokaz_drzewo", "uruchomienie", 
			"reset_silnika", "logi", "instrukcja_procesowa", "import_procesu", "deport_procesu", 
			"typ_ewaluacji", "deklaracja_procesu", "desygnat_celu", "zapis_segmentu_anonimowego", 
			"blok_procesowy", "naglowek_bloku_procesowego", "arnosc", "zawijanie_pamieci", 
			"wyrazenie", "lista_wyrazen", "nastepstwo_wyrazen", "dodatek", "waga", 
			"desygnat_wagi", "atrybut_wagi", "generacja", "mutacja", "krzyzowanie", 
			"krzyzowanie_arg", "kopiowanie_dod", "wartosc", "glebokosc", "cel_dodatku", 
			"zrodlo_dodatku", "poz_dodatek", "pokoloruj", "pokaz_generatory", "wezel_dod", 
			"nieterm_dod", "term_dod", "par_dod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ls'", "'ll'", "'show'", "'-r'", "'-R'", "','", "'run'", "'reset'", 
			"'trace'", "'use'", "'^'", "'parent'", "'use-not'", "'::='", "'::+='", 
			"'-'", "'+'", "'~'", "'%'", "'*'", "'/'", "'&'", "'|'", "'~='", "'!~='", 
			"'>'", "'<'", "':='", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'if'", "'else'", "'while'", "'break_with'", "'weight'", "'of'", "':'", 
			"'node'", "'call'", "'min'", "'max'", "'roundexp'", "'='", "'full'", 
			"'grow'", "'s'", "'subtree'", "'sfs'", "'size-fair-subtree'", "'p'", 
			"'point'", "'-mutate'", "'depth'", "'cross'", "'with'", "'dcpy'", "'into'", 
			"'at'", "'color'", "'colour'", "'generators'", "'gens'", "'nonterm'", 
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
			null, null, null, null, null, null, null, null, null, null, "KOLOR_HTML", 
			"KOLOR_HTML_KROTKI", "ZAWIJAS_LEWY", "ZAWIJAS_PRAWY", "LNAWIAS_Z_KRATKA", 
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

	public proszczParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(proszczParser.EOF, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3025866811683055502L) != 0 || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 713023L) != 0) {
				{
				{
				setState(90);
				instrukcja();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public TerminalNode EOF() { return getToken(proszczParser.EOF, 0); }
		public ProcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterProces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitProces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitProces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcesContext proces() throws RecognitionException {
		ProcesContext _localctx = new ProcesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_proces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			deklaracja_procesu();
			setState(99);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterInstrukcja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitInstrukcja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitInstrukcja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrukcjaContext instrukcja() throws RecognitionException {
		InstrukcjaContext _localctx = new InstrukcjaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instrukcja);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__12:
			case T__15:
			case T__16:
			case T__28:
			case T__29:
			case T__31:
			case T__33:
			case T__35:
			case T__37:
			case T__38:
			case ZAWIJAS_LEWY:
			case LENIWA:
			case SPRYTNA:
			case GORLIWA:
			case NAZWA:
			case STALA:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				instrukcja_procesowa();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				instrukcja_silnika();
				}
				break;
			case T__39:
			case T__42:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__58:
			case T__60:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterInstrukcja_silnika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitInstrukcja_silnika(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitInstrukcja_silnika(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_silnikaContext instrukcja_silnika() throws RecognitionException {
		Instrukcja_silnikaContext _localctx = new Instrukcja_silnikaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrukcja_silnika);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				uruchomienie();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				wypisanie();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				reset_silnika();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				pokaz_drzewo();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWypisanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WypisanieContext wypisanie() throws RecognitionException {
		WypisanieContext _localctx = new WypisanieContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_wypisanie);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				wypisanie_krotkie();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Wypisanie_krotkieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie_krotkie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWypisanie_krotkie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWypisanie_krotkie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWypisanie_krotkie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wypisanie_krotkieContext wypisanie_krotkie() throws RecognitionException {
		Wypisanie_krotkieContext _localctx = new Wypisanie_krotkieContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_wypisanie_krotkie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__0);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAZWA) {
				{
				setState(118);
				match(NAZWA);
				}
			}

			setState(121);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Wypisanie_rekursywneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wypisanie_rekursywne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWypisanie_rekursywne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWypisanie_rekursywne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWypisanie_rekursywne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wypisanie_rekursywneContext wypisanie_rekursywne() throws RecognitionException {
		Wypisanie_rekursywneContext _localctx = new Wypisanie_rekursywneContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_wypisanie_rekursywne);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__1);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAZWA) {
				{
				setState(124);
				match(NAZWA);
				}
			}

			setState(127);
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
		public List<TerminalNode> NAZWA() { return getTokens(proszczParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(proszczParser.NAZWA, i);
		}
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public Pokaz_drzewoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokaz_drzewo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterPokaz_drzewo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitPokaz_drzewo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitPokaz_drzewo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pokaz_drzewoContext pokaz_drzewo() throws RecognitionException {
		Pokaz_drzewoContext _localctx = new Pokaz_drzewoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pokaz_drzewo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__2);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(130);
				((Pokaz_drzewoContext)_localctx).rek = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__4) ) {
					((Pokaz_drzewoContext)_localctx).rek = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(133);
			match(NAZWA);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(134);
				match(T__5);
				setState(135);
				match(NAZWA);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public UruchomienieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uruchomienie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterUruchomienie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitUruchomienie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitUruchomienie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UruchomienieContext uruchomienie() throws RecognitionException {
		UruchomienieContext _localctx = new UruchomienieContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_uruchomienie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__6);
			setState(144);
			match(NAZWA);
			setState(145);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public Reset_silnikaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset_silnika; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterReset_silnika(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitReset_silnika(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitReset_silnika(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reset_silnikaContext reset_silnika() throws RecognitionException {
		Reset_silnikaContext _localctx = new Reset_silnikaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_reset_silnika);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__7);
			setState(148);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public LogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterLogi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitLogi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitLogi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogiContext logi() throws RecognitionException {
		LogiContext _localctx = new LogiContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__8);
			setState(151);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterInstrukcja_procesowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitInstrukcja_procesowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitInstrukcja_procesowa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrukcja_procesowaContext instrukcja_procesowa() throws RecognitionException {
		Instrukcja_procesowaContext _localctx = new Instrukcja_procesowaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrukcja_procesowa);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
			case T__28:
			case T__29:
			case T__31:
			case T__33:
			case T__35:
			case T__37:
			case T__38:
			case ZAWIJAS_LEWY:
			case NAZWA:
			case STALA:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				deklaracja_procesu();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				import_procesu();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				deport_procesu();
				}
				break;
			case LENIWA:
			case SPRYTNA:
			case GORLIWA:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public List<TerminalNode> NAZWA() { return getTokens(proszczParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(proszczParser.NAZWA, i);
		}
		public Import_procesuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_procesu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterImport_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitImport_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitImport_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_procesuContext import_procesu() throws RecognitionException {
		Import_procesuContext _localctx = new Import_procesuContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_import_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__9);
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				{
				{
				setState(160);
				((Import_procesuContext)_localctx).special = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
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
				setState(161);
				match(NAZWA);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(162);
					match(T__5);
					setState(163);
					match(NAZWA);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
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
		public List<TerminalNode> NAZWA() { return getTokens(proszczParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(proszczParser.NAZWA, i);
		}
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public Deport_procesuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deport_procesu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterDeport_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitDeport_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitDeport_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deport_procesuContext deport_procesu() throws RecognitionException {
		Deport_procesuContext _localctx = new Deport_procesuContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deport_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__12);
			setState(174);
			match(NAZWA);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(175);
				match(T__5);
				setState(176);
				match(NAZWA);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
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
		public TerminalNode EWALUACJA() { return getToken(proszczParser.EWALUACJA, 0); }
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public TerminalNode LENIWA() { return getToken(proszczParser.LENIWA, 0); }
		public TerminalNode SPRYTNA() { return getToken(proszczParser.SPRYTNA, 0); }
		public TerminalNode GORLIWA() { return getToken(proszczParser.GORLIWA, 0); }
		public Typ_ewaluacjiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typ_ewaluacji; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterTyp_ewaluacji(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitTyp_ewaluacji(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitTyp_ewaluacji(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typ_ewaluacjiContext typ_ewaluacji() throws RecognitionException {
		Typ_ewaluacjiContext _localctx = new Typ_ewaluacjiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typ_ewaluacji);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 7L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(185);
			match(EWALUACJA);
			setState(186);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterDeklaracja_procesu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitDeklaracja_procesu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitDeklaracja_procesu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deklaracja_procesuContext deklaracja_procesu() throws RecognitionException {
		Deklaracja_procesuContext _localctx = new Deklaracja_procesuContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deklaracja_procesu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(188);
				desygnat_celu();
				}
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ZAWIJAS_LEWY) {
				{
				setState(191);
				blok_procesowy();
				}
			}

			setState(194);
			wyrazenie(0);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LNAWIAS_Z_KRATKA) {
				{
				setState(195);
				zapis_segmentu_anonimowego();
				}
			}

			setState(198);
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
		public List<TerminalNode> NAZWA() { return getTokens(proszczParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(proszczParser.NAZWA, i);
		}
		public Desygnat_celuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desygnat_celu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterDesygnat_celu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitDesygnat_celu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitDesygnat_celu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desygnat_celuContext desygnat_celu() throws RecognitionException {
		Desygnat_celuContext _localctx = new Desygnat_celuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_desygnat_celu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(NAZWA);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(201);
				match(T__5);
				setState(202);
				match(NAZWA);
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			((Desygnat_celuContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
		public TerminalNode LNAWIAS_Z_KRATKA() { return getToken(proszczParser.LNAWIAS_Z_KRATKA, 0); }
		public TerminalNode PNAWIAS_Z_KRATKA() { return getToken(proszczParser.PNAWIAS_Z_KRATKA, 0); }
		public List<TerminalNode> STALA() { return getTokens(proszczParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(proszczParser.STALA, i);
		}
		public Zapis_segmentu_anonimowegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zapis_segmentu_anonimowego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterZapis_segmentu_anonimowego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitZapis_segmentu_anonimowego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitZapis_segmentu_anonimowego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zapis_segmentu_anonimowegoContext zapis_segmentu_anonimowego() throws RecognitionException {
		Zapis_segmentu_anonimowegoContext _localctx = new Zapis_segmentu_anonimowegoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_zapis_segmentu_anonimowego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LNAWIAS_Z_KRATKA);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15 || _la==T__16 || _la==STALA) {
				{
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15 || _la==T__16) {
					{
					setState(211);
					((Zapis_segmentu_anonimowegoContext)_localctx).znak = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
						((Zapis_segmentu_anonimowegoContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(214);
				match(STALA);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
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
		public TerminalNode ZAWIJAS_LEWY() { return getToken(proszczParser.ZAWIJAS_LEWY, 0); }
		public TerminalNode ZAWIJAS_PRAWY() { return getToken(proszczParser.ZAWIJAS_PRAWY, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterBlok_procesowy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitBlok_procesowy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitBlok_procesowy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blok_procesowyContext blok_procesowy() throws RecognitionException {
		Blok_procesowyContext _localctx = new Blok_procesowyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blok_procesowy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(ZAWIJAS_LEWY);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(223);
				naglowek_bloku_procesowego();
				}
				break;
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 916438852608L) != 0 || (((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 2785L) != 0) {
				{
				{
				setState(226);
				instrukcja_procesowa();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
		public Zawijanie_pamieciContext zawijanie_pamieci() {
			return getRuleContext(Zawijanie_pamieciContext.class,0);
		}
		public Naglowek_bloku_procesowegoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naglowek_bloku_procesowego; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterNaglowek_bloku_procesowego(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitNaglowek_bloku_procesowego(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitNaglowek_bloku_procesowego(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Naglowek_bloku_procesowegoContext naglowek_bloku_procesowego() throws RecognitionException {
		Naglowek_bloku_procesowegoContext _localctx = new Naglowek_bloku_procesowegoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_naglowek_bloku_procesowego);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			arnosc();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(235);
				match(T__5);
				setState(236);
				zawijanie_pamieci();
				}
			}

			setState(239);
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
		public List<TerminalNode> STALA() { return getTokens(proszczParser.STALA); }
		public TerminalNode STALA(int i) {
			return getToken(proszczParser.STALA, i);
		}
		public ArnoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arnosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterArnosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitArnosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitArnosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArnoscContext arnosc() throws RecognitionException {
		ArnoscContext _localctx = new ArnoscContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arnosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(STALA);
			setState(242);
			match(T__17);
			setState(243);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public Zawijanie_pamieciContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zawijanie_pamieci; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterZawijanie_pamieci(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitZawijanie_pamieci(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitZawijanie_pamieci(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zawijanie_pamieciContext zawijanie_pamieci() throws RecognitionException {
		Zawijanie_pamieciContext _localctx = new Zawijanie_pamieciContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_zawijanie_pamieci);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__18);
			setState(246);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieInstrukcjaWarunkowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieInstrukcjaWarunkowa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieInstrukcjaWarunkowa(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieLubLgicz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieLubLgicz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieLubLgicz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieAdresZmiennejContext extends WyrazenieContext {
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public WyrazenieAdresZmiennejContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieAdresZmiennej(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieAdresZmiennej(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieAdresZmiennej(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieNawiasy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieNawiasy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieNawiasy(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazeniePorownanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazeniePorownanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazeniePorownanie(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieDereferencja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieDereferencja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieDereferencja(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazeniePetelka(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazeniePetelka(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazeniePetelka(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieInstrukcjaZlozona(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieInstrukcjaZlozona(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieInstrukcjaZlozona(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieILgicz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieILgicz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieILgicz(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazeniePrzerwaniePetelki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazeniePrzerwaniePetelki(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazeniePrzerwaniePetelki(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieMult(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazeniePrzypisanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazeniePrzypisanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazeniePrzypisanie(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieAddyt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieAddyt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieAddyt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieStalaContext extends WyrazenieContext {
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public WyrazenieStalaContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieStala(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieStala(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieStala(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WyrazenieWywolanieContext extends WyrazenieContext {
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Lista_wyrazenContext lista_wyrazen() {
			return getRuleContext(Lista_wyrazenContext.class,0);
		}
		public WyrazenieWywolanieContext(WyrazenieContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieWywolanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieWywolanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieWywolanie(this);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWyrazenieZnak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWyrazenieZnak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWyrazenieZnak(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_wyrazenie, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__16:
				{
				_localctx = new WyrazenieZnakContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				((WyrazenieZnakContext)_localctx).znak = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
					((WyrazenieZnakContext)_localctx).znak = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				wyrazenie(16);
				}
				break;
			case T__28:
				{
				_localctx = new WyrazenieAdresZmiennejContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(T__28);
				setState(252);
				match(NAZWA);
				}
				break;
			case STALA:
				{
				_localctx = new WyrazenieStalaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(STALA);
				}
				break;
			case NAZWA:
				{
				_localctx = new WyrazenieWywolanieContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254);
				match(NAZWA);
				setState(259);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(255);
					match(T__29);
					setState(256);
					lista_wyrazen();
					setState(257);
					match(T__30);
					}
					break;
				}
				}
				break;
			case T__31:
				{
				_localctx = new WyrazenieDereferencjaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(T__31);
				setState(262);
				wyrazenie(0);
				setState(263);
				match(T__32);
				}
				break;
			case T__29:
				{
				_localctx = new WyrazenieNawiasyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265);
				match(T__29);
				setState(266);
				wyrazenie(0);
				setState(267);
				match(T__30);
				}
				break;
			case T__33:
				{
				_localctx = new WyrazenieInstrukcjaZlozonaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(T__33);
				setState(270);
				nastepstwo_wyrazen();
				setState(271);
				match(T__34);
				}
				break;
			case T__35:
				{
				_localctx = new WyrazenieInstrukcjaWarunkowaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				match(T__35);
				setState(274);
				match(T__29);
				setState(275);
				wyrazenie(0);
				setState(276);
				match(T__30);
				setState(277);
				wyrazenie(0);
				setState(278);
				match(T__36);
				setState(279);
				wyrazenie(3);
				}
				break;
			case T__37:
				{
				_localctx = new WyrazeniePetelkaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(T__37);
				setState(282);
				match(T__29);
				setState(283);
				wyrazenie(0);
				setState(284);
				match(T__30);
				setState(285);
				wyrazenie(2);
				}
				break;
			case T__38:
				{
				_localctx = new WyrazeniePrzerwaniePetelkiContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				match(T__38);
				setState(288);
				wyrazenie(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new WyrazenieMultContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(291);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(292);
						((WyrazenieMultContext)_localctx).mult = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0) ) {
							((WyrazenieMultContext)_localctx).mult = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(293);
						wyrazenie(16);
						}
						break;
					case 2:
						{
						_localctx = new WyrazenieAddytContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(294);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(295);
						((WyrazenieAddytContext)_localctx).addyt = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((WyrazenieAddytContext)_localctx).addyt = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						wyrazenie(15);
						}
						break;
					case 3:
						{
						_localctx = new WyrazenieILgiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(297);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(298);
						match(T__21);
						setState(299);
						wyrazenie(14);
						}
						break;
					case 4:
						{
						_localctx = new WyrazenieLubLgiczContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(300);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(301);
						match(T__22);
						setState(302);
						wyrazenie(13);
						}
						break;
					case 5:
						{
						_localctx = new WyrazeniePorownanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(304);
						((WyrazeniePorownanieContext)_localctx).porownanie = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0) ) {
							((WyrazeniePorownanieContext)_localctx).porownanie = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(305);
						wyrazenie(12);
						}
						break;
					case 6:
						{
						_localctx = new WyrazeniePrzypisanieContext(new WyrazenieContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wyrazenie);
						setState(306);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(307);
						match(T__27);
						setState(308);
						wyrazenie(10);
						}
						break;
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterLista_wyrazen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitLista_wyrazen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitLista_wyrazen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_wyrazenContext lista_wyrazen() throws RecognitionException {
		Lista_wyrazenContext _localctx = new Lista_wyrazenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lista_wyrazen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 916438843392L) != 0 || _la==NAZWA || _la==STALA) {
				{
				setState(314);
				wyrazenie(0);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(315);
					match(T__5);
					setState(316);
					wyrazenie(0);
					}
					}
					setState(321);
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
		public List<TerminalNode> EOS() { return getTokens(proszczParser.EOS); }
		public TerminalNode EOS(int i) {
			return getToken(proszczParser.EOS, i);
		}
		public Nastepstwo_wyrazenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nastepstwo_wyrazen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterNastepstwo_wyrazen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitNastepstwo_wyrazen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitNastepstwo_wyrazen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nastepstwo_wyrazenContext nastepstwo_wyrazen() throws RecognitionException {
		Nastepstwo_wyrazenContext _localctx = new Nastepstwo_wyrazenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_nastepstwo_wyrazen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 916438843392L) != 0 || _la==NAZWA || _la==STALA) {
				{
				{
				setState(324);
				wyrazenie(0);
				setState(325);
				match(EOS);
				}
				}
				setState(331);
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
		public TerminalNode EOS() { return getToken(proszczParser.EOS, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterDodatek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitDodatek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitDodatek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DodatekContext dodatek() throws RecognitionException {
		DodatekContext _localctx = new DodatekContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dodatek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
			case T__49:
				{
				setState(332);
				generacja();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
				{
				setState(333);
				mutacja();
				}
				break;
			case T__58:
				{
				setState(334);
				krzyzowanie();
				}
				break;
			case T__63:
			case T__64:
				{
				setState(335);
				pokoloruj();
				}
				break;
			case T__42:
				{
				setState(336);
				wezel_dod();
				}
				break;
			case T__67:
				{
				setState(337);
				nieterm_dod();
				}
				break;
			case T__68:
				{
				setState(338);
				term_dod();
				}
				break;
			case T__65:
			case T__66:
				{
				setState(339);
				pokaz_generatory();
				}
				break;
			case T__60:
				{
				setState(340);
				kopiowanie_dod();
				}
				break;
			case T__39:
				{
				setState(341);
				waga();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(344);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWaga(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWaga(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWaga(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WagaContext waga() throws RecognitionException {
		WagaContext _localctx = new WagaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_waga);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__39);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(347);
				match(T__40);
				}
			}

			setState(350);
			desygnat_wagi();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(351);
				match(T__5);
				setState(352);
				desygnat_wagi();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(T__41);
			setState(359);
			match(STALA);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0) {
				{
				{
				setState(360);
				atrybut_wagi();
				}
				}
				setState(365);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public TerminalNode NAPIS_DOSL() { return getToken(proszczParser.NAPIS_DOSL, 0); }
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Desygnat_wagiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desygnat_wagi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterDesygnat_wagi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitDesygnat_wagi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitDesygnat_wagi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Desygnat_wagiContext desygnat_wagi() throws RecognitionException {
		Desygnat_wagiContext _localctx = new Desygnat_wagiContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_desygnat_wagi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case NAPIS_DOSL:
				{
				{
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__42) {
					{
					setState(366);
					match(T__42);
					}
				}

				setState(369);
				match(NAPIS_DOSL);
				}
				}
				break;
			case T__43:
			case NAZWA:
				{
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__43) {
					{
					setState(370);
					match(T__43);
					}
				}

				setState(373);
				match(NAZWA);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(376);
				match(T__31);
				setState(377);
				match(STALA);
				setState(378);
				match(T__32);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public Atrybut_wagiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrybut_wagi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterAtrybut_wagi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitAtrybut_wagi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitAtrybut_wagi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atrybut_wagiContext atrybut_wagi() throws RecognitionException {
		Atrybut_wagiContext _localctx = new Atrybut_wagiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atrybut_wagi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((Atrybut_wagiContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0) ) {
				((Atrybut_wagiContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(382);
			match(T__47);
			setState(383);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterGeneracja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitGeneracja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitGeneracja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneracjaContext generacja() throws RecognitionException {
		GeneracjaContext _localctx = new GeneracjaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_generacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			((GeneracjaContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==T__49) ) {
				((GeneracjaContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(386);
			glebokosc();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(387);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterMutacja(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitMutacja(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitMutacja(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MutacjaContext mutacja() throws RecognitionException {
		MutacjaContext _localctx = new MutacjaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mutacja);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			((MutacjaContext)_localctx).typ = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 141863388262170624L) != 0) ) {
				((MutacjaContext)_localctx).typ = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			match(T__56);
			setState(392);
			zrodlo_dodatku();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(393);
				poz_dodatek();
				}
			}

			setState(396);
			match(T__57);
			setState(397);
			glebokosc();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(398);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterKrzyzowanie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitKrzyzowanie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitKrzyzowanie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KrzyzowanieContext krzyzowanie() throws RecognitionException {
		KrzyzowanieContext _localctx = new KrzyzowanieContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_krzyzowanie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__58);
			setState(402);
			krzyzowanie_arg();
			setState(403);
			match(T__59);
			setState(404);
			krzyzowanie_arg();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(405);
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
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public Krzyzowanie_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krzyzowanie_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterKrzyzowanie_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitKrzyzowanie_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitKrzyzowanie_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Krzyzowanie_argContext krzyzowanie_arg() throws RecognitionException {
		Krzyzowanie_argContext _localctx = new Krzyzowanie_argContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_krzyzowanie_arg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(NAZWA);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(409);
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
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterKopiowanie_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitKopiowanie_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitKopiowanie_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kopiowanie_dodContext kopiowanie_dod() throws RecognitionException {
		Kopiowanie_dodContext _localctx = new Kopiowanie_dodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kopiowanie_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__60);
			setState(413);
			match(NAZWA);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(414);
				poz_dodatek();
				}
			}

			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(417);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public WartoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wartosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWartosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWartosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWartosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WartoscContext wartosc() throws RecognitionException {
		WartoscContext _localctx = new WartoscContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_wartosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public GlebokoscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glebokosc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterGlebokosc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitGlebokosc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitGlebokosc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlebokoscContext glebokosc() throws RecognitionException {
		GlebokoscContext _localctx = new GlebokoscContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_glebokosc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Cel_dodatkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cel_dodatku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterCel_dodatku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitCel_dodatku(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitCel_dodatku(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cel_dodatkuContext cel_dodatku() throws RecognitionException {
		Cel_dodatkuContext _localctx = new Cel_dodatkuContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_cel_dodatku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__61);
			setState(425);
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
		public TerminalNode NAZWA() { return getToken(proszczParser.NAZWA, 0); }
		public Zrodlo_dodatkuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zrodlo_dodatku; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterZrodlo_dodatku(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitZrodlo_dodatku(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitZrodlo_dodatku(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Zrodlo_dodatkuContext zrodlo_dodatku() throws RecognitionException {
		Zrodlo_dodatkuContext _localctx = new Zrodlo_dodatkuContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_zrodlo_dodatku);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public Poz_dodatekContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poz_dodatek; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterPoz_dodatek(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitPoz_dodatek(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitPoz_dodatek(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Poz_dodatekContext poz_dodatek() throws RecognitionException {
		Poz_dodatekContext _localctx = new Poz_dodatekContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_poz_dodatek);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__62);
			setState(430);
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
		public List<TerminalNode> NAZWA() { return getTokens(proszczParser.NAZWA); }
		public TerminalNode NAZWA(int i) {
			return getToken(proszczParser.NAZWA, i);
		}
		public TerminalNode KOLOR_HTML() { return getToken(proszczParser.KOLOR_HTML, 0); }
		public TerminalNode KOLOR_HTML_KROTKI() { return getToken(proszczParser.KOLOR_HTML_KROTKI, 0); }
		public Poz_dodatekContext poz_dodatek() {
			return getRuleContext(Poz_dodatekContext.class,0);
		}
		public PokolorujContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pokoloruj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterPokoloruj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitPokoloruj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitPokoloruj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PokolorujContext pokoloruj() throws RecognitionException {
		PokolorujContext _localctx = new PokolorujContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_pokoloruj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !(_la==T__63 || _la==T__64) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(433);
			match(NAZWA);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(434);
				match(T__5);
				setState(435);
				match(NAZWA);
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			_la = _input.LA(1);
			if ( !(_la==KOLOR_HTML || _la==KOLOR_HTML_KROTKI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__62) {
				{
				setState(442);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterPokaz_generatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitPokaz_generatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitPokaz_generatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pokaz_generatoryContext pokaz_generatory() throws RecognitionException {
		Pokaz_generatoryContext _localctx = new Pokaz_generatoryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_pokaz_generatory);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !(_la==T__65 || _la==T__66) ) {
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterWezel_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitWezel_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitWezel_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wezel_dodContext wezel_dod() throws RecognitionException {
		Wezel_dodContext _localctx = new Wezel_dodContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_wezel_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(T__42);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(448);
				par_dod();
				}
				break;
			}
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(451);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterNieterm_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitNieterm_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitNieterm_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nieterm_dodContext nieterm_dod() throws RecognitionException {
		Nieterm_dodContext _localctx = new Nieterm_dodContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_nieterm_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__67);
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(455);
				par_dod();
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(458);
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
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterTerm_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitTerm_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitTerm_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_dodContext term_dod() throws RecognitionException {
		Term_dodContext _localctx = new Term_dodContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_term_dod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(T__68);
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(462);
				par_dod();
				}
				break;
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STALA) {
				{
				setState(465);
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
		public TerminalNode STALA() { return getToken(proszczParser.STALA, 0); }
		public Par_dodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_dod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).enterPar_dod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof proszczListener ) ((proszczListener)listener).exitPar_dod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof proszczVisitor ) return ((proszczVisitor<? extends T>)visitor).visitPar_dod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_dodContext par_dod() throws RecognitionException {
		Par_dodContext _localctx = new Par_dodContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_par_dod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
		case 22:
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
		"\u0004\u0001V\u01d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002i\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004t\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005x\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006~\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0084\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0089\b\u0007\n\u0007\f\u0007\u008c"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u009e\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00a5\b\f\n\f\f\f\u00a8\t\f\u0003\f\u00aa\b\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b2\b\r\n\r\f\r\u00b5"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0003\u000f\u00be\b\u000f\u0001\u000f\u0003\u000f\u00c1\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00c5\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00cc\b\u0010\n\u0010"+
		"\f\u0010\u00cf\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00d5\b\u0011\u0001\u0011\u0005\u0011\u00d8\b\u0011\n\u0011"+
		"\f\u0011\u00db\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00e1\b\u0012\u0001\u0012\u0005\u0012\u00e4\b\u0012\n\u0012"+
		"\f\u0012\u00e7\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00ee\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0104\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0122\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0136\b\u0016\n\u0016\f\u0016\u0139\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u013e\b\u0017\n\u0017\f\u0017"+
		"\u0141\t\u0017\u0003\u0017\u0143\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0005\u0018\u0148\b\u0018\n\u0018\f\u0018\u014b\t\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0157\b\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0003\u001a\u015d\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u0162\b\u001a\n\u001a\f\u001a\u0165"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016a\b\u001a"+
		"\n\u001a\f\u001a\u016d\t\u001a\u0001\u001b\u0003\u001b\u0170\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0174\b\u001b\u0001\u001b\u0003\u001b\u0177"+
		"\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u017c\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0185\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u018b\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u0190\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0197\b\u001f\u0001 \u0001 \u0003 \u019b\b \u0001"+
		"!\u0001!\u0001!\u0003!\u01a0\b!\u0001!\u0003!\u01a3\b!\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u01b5\b\'\n\'\f\'\u01b8\t\'"+
		"\u0001\'\u0001\'\u0003\'\u01bc\b\'\u0001(\u0001(\u0001)\u0001)\u0003)"+
		"\u01c2\b)\u0001)\u0003)\u01c5\b)\u0001*\u0001*\u0003*\u01c9\b*\u0001*"+
		"\u0003*\u01cc\b*\u0001+\u0001+\u0003+\u01d0\b+\u0001+\u0003+\u01d3\b+"+
		"\u0001,\u0001,\u0001,\u0000\u0001,-\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVX\u0000\r\u0001\u0000\u0004\u0005\u0001\u0000\u000b\f\u0001\u0000"+
		"MO\u0001\u0000\u000e\u000f\u0001\u0000\u0010\u0011\u0001\u0000\u0013\u0015"+
		"\u0001\u0000\u0018\u001b\u0001\u0000-/\u0001\u000012\u0001\u000038\u0001"+
		"\u0000@A\u0001\u0000FG\u0001\u0000BC\u01f6\u0000]\u0001\u0000\u0000\u0000"+
		"\u0002b\u0001\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006o"+
		"\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\nu\u0001\u0000\u0000"+
		"\u0000\f{\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000"+
		"\u0010\u008f\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000"+
		"\u0014\u0096\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000\u0000"+
		"\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00ad\u0001\u0000\u0000\u0000"+
		"\u001c\u00b8\u0001\u0000\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000"+
		" \u00c8\u0001\u0000\u0000\u0000\"\u00d2\u0001\u0000\u0000\u0000$\u00de"+
		"\u0001\u0000\u0000\u0000&\u00ea\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000"+
		"\u0000\u0000*\u00f5\u0001\u0000\u0000\u0000,\u0121\u0001\u0000\u0000\u0000"+
		".\u0142\u0001\u0000\u0000\u00000\u0149\u0001\u0000\u0000\u00002\u0156"+
		"\u0001\u0000\u0000\u00004\u015a\u0001\u0000\u0000\u00006\u0176\u0001\u0000"+
		"\u0000\u00008\u017d\u0001\u0000\u0000\u0000:\u0181\u0001\u0000\u0000\u0000"+
		"<\u0186\u0001\u0000\u0000\u0000>\u0191\u0001\u0000\u0000\u0000@\u0198"+
		"\u0001\u0000\u0000\u0000B\u019c\u0001\u0000\u0000\u0000D\u01a4\u0001\u0000"+
		"\u0000\u0000F\u01a6\u0001\u0000\u0000\u0000H\u01a8\u0001\u0000\u0000\u0000"+
		"J\u01ab\u0001\u0000\u0000\u0000L\u01ad\u0001\u0000\u0000\u0000N\u01b0"+
		"\u0001\u0000\u0000\u0000P\u01bd\u0001\u0000\u0000\u0000R\u01bf\u0001\u0000"+
		"\u0000\u0000T\u01c6\u0001\u0000\u0000\u0000V\u01cd\u0001\u0000\u0000\u0000"+
		"X\u01d4\u0001\u0000\u0000\u0000Z\\\u0003\u0004\u0002\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000bc\u0003\u001e"+
		"\u000f\u0000cd\u0005\u0000\u0000\u0001d\u0003\u0001\u0000\u0000\u0000"+
		"ei\u0003\u0016\u000b\u0000fi\u0003\u0006\u0003\u0000gi\u00032\u0019\u0000"+
		"he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000i\u0005\u0001\u0000\u0000\u0000jp\u0003\u0010\b\u0000kp\u0003\b"+
		"\u0004\u0000lp\u0003\u0012\t\u0000mp\u0003\u000e\u0007\u0000np\u0003\u0014"+
		"\n\u0000oj\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000\u0000ol\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\u0007"+
		"\u0001\u0000\u0000\u0000qt\u0003\n\u0005\u0000rt\u0003\f\u0006\u0000s"+
		"q\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\t\u0001\u0000\u0000"+
		"\u0000uw\u0005\u0001\u0000\u0000vx\u0005Q\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005P\u0000"+
		"\u0000z\u000b\u0001\u0000\u0000\u0000{}\u0005\u0002\u0000\u0000|~\u0005"+
		"Q\u0000\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005P\u0000\u0000\u0080\r\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0005\u0003\u0000\u0000\u0082\u0084\u0007"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u008a\u0005"+
		"Q\u0000\u0000\u0086\u0087\u0005\u0006\u0000\u0000\u0087\u0089\u0005Q\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005P\u0000\u0000\u008e\u000f\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u0091\u0005Q\u0000\u0000\u0091"+
		"\u0092\u0005P\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094"+
		"\u0005\b\u0000\u0000\u0094\u0095\u0005P\u0000\u0000\u0095\u0013\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\t\u0000\u0000\u0097\u0098\u0005P"+
		"\u0000\u0000\u0098\u0015\u0001\u0000\u0000\u0000\u0099\u009e\u0003\u001e"+
		"\u000f\u0000\u009a\u009e\u0003\u0018\f\u0000\u009b\u009e\u0003\u001a\r"+
		"\u0000\u009c\u009e\u0003\u001c\u000e\u0000\u009d\u0099\u0001\u0000\u0000"+
		"\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u0017\u0001\u0000\u0000"+
		"\u0000\u009f\u00a9\u0005\n\u0000\u0000\u00a0\u00aa\u0007\u0001\u0000\u0000"+
		"\u00a1\u00a6\u0005Q\u0000\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3"+
		"\u00a5\u0005Q\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a9\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a1"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005P\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\r\u0000\u0000\u00ae\u00b3\u0005Q\u0000\u0000\u00af\u00b0\u0005\u0006"+
		"\u0000\u0000\u00b0\u00b2\u0005Q\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005P\u0000\u0000"+
		"\u00b7\u001b\u0001\u0000\u0000\u0000\u00b8\u00b9\u0007\u0002\u0000\u0000"+
		"\u00b9\u00ba\u0005L\u0000\u0000\u00ba\u00bb\u0005P\u0000\u0000\u00bb\u001d"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0003 \u0010\u0000\u00bd\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003$\u0012\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c4\u0003,\u0016\u0000\u00c3\u00c5\u0003\"\u0011"+
		"\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005P\u0000\u0000"+
		"\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00cd\u0005Q\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0006\u0000\u0000\u00ca\u00cc\u0005Q\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d0"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0007\u0003\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000\u00d2\u00d9\u0005"+
		"J\u0000\u0000\u00d3\u00d5\u0007\u0004\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0005S\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005K\u0000\u0000"+
		"\u00dd#\u0001\u0000\u0000\u0000\u00de\u00e0\u0005H\u0000\u0000\u00df\u00e1"+
		"\u0003&\u0013\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e5\u0001\u0000\u0000\u0000\u00e2\u00e4\u0003"+
		"\u0016\u000b\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005I\u0000\u0000\u00e9%\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0003(\u0014\u0000\u00eb\u00ec\u0005\u0006\u0000\u0000"+
		"\u00ec\u00ee\u0003*\u0015\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005P\u0000\u0000\u00f0\'\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005S\u0000\u0000\u00f2\u00f3\u0005\u0012\u0000\u0000\u00f3\u00f4\u0005"+
		"S\u0000\u0000\u00f4)\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0013\u0000"+
		"\u0000\u00f6\u00f7\u0005S\u0000\u0000\u00f7+\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0006\u0016\uffff\uffff\u0000\u00f9\u00fa\u0007\u0004\u0000\u0000"+
		"\u00fa\u0122\u0003,\u0016\u0010\u00fb\u00fc\u0005\u001d\u0000\u0000\u00fc"+
		"\u0122\u0005Q\u0000\u0000\u00fd\u0122\u0005S\u0000\u0000\u00fe\u0103\u0005"+
		"Q\u0000\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100\u0101\u0003.\u0017"+
		"\u0000\u0101\u0102\u0005\u001f\u0000\u0000\u0102\u0104\u0001\u0000\u0000"+
		"\u0000\u0103\u00ff\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000"+
		"\u0000\u0104\u0122\u0001\u0000\u0000\u0000\u0105\u0106\u0005 \u0000\u0000"+
		"\u0106\u0107\u0003,\u0016\u0000\u0107\u0108\u0005!\u0000\u0000\u0108\u0122"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u001e\u0000\u0000\u010a\u010b"+
		"\u0003,\u0016\u0000\u010b\u010c\u0005\u001f\u0000\u0000\u010c\u0122\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\"\u0000\u0000\u010e\u010f\u00030"+
		"\u0018\u0000\u010f\u0110\u0005#\u0000\u0000\u0110\u0122\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0005$\u0000\u0000\u0112\u0113\u0005\u001e\u0000\u0000"+
		"\u0113\u0114\u0003,\u0016\u0000\u0114\u0115\u0005\u001f\u0000\u0000\u0115"+
		"\u0116\u0003,\u0016\u0000\u0116\u0117\u0005%\u0000\u0000\u0117\u0118\u0003"+
		",\u0016\u0003\u0118\u0122\u0001\u0000\u0000\u0000\u0119\u011a\u0005&\u0000"+
		"\u0000\u011a\u011b\u0005\u001e\u0000\u0000\u011b\u011c\u0003,\u0016\u0000"+
		"\u011c\u011d\u0005\u001f\u0000\u0000\u011d\u011e\u0003,\u0016\u0002\u011e"+
		"\u0122\u0001\u0000\u0000\u0000\u011f\u0120\u0005\'\u0000\u0000\u0120\u0122"+
		"\u0003,\u0016\u0001\u0121\u00f8\u0001\u0000\u0000\u0000\u0121\u00fb\u0001"+
		"\u0000\u0000\u0000\u0121\u00fd\u0001\u0000\u0000\u0000\u0121\u00fe\u0001"+
		"\u0000\u0000\u0000\u0121\u0105\u0001\u0000\u0000\u0000\u0121\u0109\u0001"+
		"\u0000\u0000\u0000\u0121\u010d\u0001\u0000\u0000\u0000\u0121\u0111\u0001"+
		"\u0000\u0000\u0000\u0121\u0119\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0122\u0137\u0001\u0000\u0000\u0000\u0123\u0124\n\u000f"+
		"\u0000\u0000\u0124\u0125\u0007\u0005\u0000\u0000\u0125\u0136\u0003,\u0016"+
		"\u0010\u0126\u0127\n\u000e\u0000\u0000\u0127\u0128\u0007\u0004\u0000\u0000"+
		"\u0128\u0136\u0003,\u0016\u000f\u0129\u012a\n\r\u0000\u0000\u012a\u012b"+
		"\u0005\u0016\u0000\u0000\u012b\u0136\u0003,\u0016\u000e\u012c\u012d\n"+
		"\f\u0000\u0000\u012d\u012e\u0005\u0017\u0000\u0000\u012e\u0136\u0003,"+
		"\u0016\r\u012f\u0130\n\u000b\u0000\u0000\u0130\u0131\u0007\u0006\u0000"+
		"\u0000\u0131\u0136\u0003,\u0016\f\u0132\u0133\n\n\u0000\u0000\u0133\u0134"+
		"\u0005\u001c\u0000\u0000\u0134\u0136\u0003,\u0016\n\u0135\u0123\u0001"+
		"\u0000\u0000\u0000\u0135\u0126\u0001\u0000\u0000\u0000\u0135\u0129\u0001"+
		"\u0000\u0000\u0000\u0135\u012c\u0001\u0000\u0000\u0000\u0135\u012f\u0001"+
		"\u0000\u0000\u0000\u0135\u0132\u0001\u0000\u0000\u0000\u0136\u0139\u0001"+
		"\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001"+
		"\u0000\u0000\u0000\u0138-\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u013f\u0003,\u0016\u0000\u013b\u013c\u0005\u0006\u0000"+
		"\u0000\u013c\u013e\u0003,\u0016\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000"+
		"\u0141\u013f\u0001\u0000\u0000\u0000\u0142\u013a\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143/\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0003,\u0016\u0000\u0145\u0146\u0005P\u0000\u0000\u0146\u0148\u0001"+
		"\u0000\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0148\u014b\u0001"+
		"\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001"+
		"\u0000\u0000\u0000\u014a1\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u0157\u0003:\u001d\u0000\u014d\u0157\u0003<\u001e\u0000"+
		"\u014e\u0157\u0003>\u001f\u0000\u014f\u0157\u0003N\'\u0000\u0150\u0157"+
		"\u0003R)\u0000\u0151\u0157\u0003T*\u0000\u0152\u0157\u0003V+\u0000\u0153"+
		"\u0157\u0003P(\u0000\u0154\u0157\u0003B!\u0000\u0155\u0157\u00034\u001a"+
		"\u0000\u0156\u014c\u0001\u0000\u0000\u0000\u0156\u014d\u0001\u0000\u0000"+
		"\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u014f\u0001\u0000\u0000"+
		"\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0151\u0001\u0000\u0000"+
		"\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005P\u0000\u0000"+
		"\u01593\u0001\u0000\u0000\u0000\u015a\u015c\u0005(\u0000\u0000\u015b\u015d"+
		"\u0005)\u0000\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015c\u015d\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0163\u0003"+
		"6\u001b\u0000\u015f\u0160\u0005\u0006\u0000\u0000\u0160\u0162\u00036\u001b"+
		"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005*\u0000\u0000\u0167\u016b\u0005S\u0000\u0000\u0168"+
		"\u016a\u00038\u001c\u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d"+
		"\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c5\u0001\u0000\u0000\u0000\u016d\u016b\u0001"+
		"\u0000\u0000\u0000\u016e\u0170\u0005+\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0177\u0005R\u0000\u0000\u0172\u0174\u0005,\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0005Q\u0000\u0000\u0176"+
		"\u016f\u0001\u0000\u0000\u0000\u0176\u0173\u0001\u0000\u0000\u0000\u0177"+
		"\u017b\u0001\u0000\u0000\u0000\u0178\u0179\u0005 \u0000\u0000\u0179\u017a"+
		"\u0005S\u0000\u0000\u017a\u017c\u0005!\u0000\u0000\u017b\u0178\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c7\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0007\u0007\u0000\u0000\u017e\u017f\u00050\u0000\u0000"+
		"\u017f\u0180\u0005S\u0000\u0000\u01809\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0007\b\u0000\u0000\u0182\u0184\u0003F#\u0000\u0183\u0185\u0003H$\u0000"+
		"\u0184\u0183\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000"+
		"\u0185;\u0001\u0000\u0000\u0000\u0186\u0187\u0007\t\u0000\u0000\u0187"+
		"\u0188\u00059\u0000\u0000\u0188\u018a\u0003J%\u0000\u0189\u018b\u0003"+
		"L&\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000"+
		"\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0005:\u0000\u0000"+
		"\u018d\u018f\u0003F#\u0000\u018e\u0190\u0003H$\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190=\u0001\u0000"+
		"\u0000\u0000\u0191\u0192\u0005;\u0000\u0000\u0192\u0193\u0003@ \u0000"+
		"\u0193\u0194\u0005<\u0000\u0000\u0194\u0196\u0003@ \u0000\u0195\u0197"+
		"\u0003H$\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197?\u0001\u0000\u0000\u0000\u0198\u019a\u0005Q\u0000\u0000"+
		"\u0199\u019b\u0003L&\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019bA\u0001\u0000\u0000\u0000\u019c\u019d\u0005"+
		"=\u0000\u0000\u019d\u019f\u0005Q\u0000\u0000\u019e\u01a0\u0003L&\u0000"+
		"\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a2\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003H$\u0000\u01a2\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3C\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0005S\u0000\u0000\u01a5E\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0005S\u0000\u0000\u01a7G\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0005>\u0000\u0000\u01a9\u01aa\u0005Q\u0000\u0000\u01aaI\u0001"+
		"\u0000\u0000\u0000\u01ab\u01ac\u0005Q\u0000\u0000\u01acK\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0005?\u0000\u0000\u01ae\u01af\u0005S\u0000\u0000\u01af"+
		"M\u0001\u0000\u0000\u0000\u01b0\u01b1\u0007\n\u0000\u0000\u01b1\u01b6"+
		"\u0005Q\u0000\u0000\u01b2\u01b3\u0005\u0006\u0000\u0000\u01b3\u01b5\u0005"+
		"Q\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bb\u0007\u000b\u0000\u0000\u01ba\u01bc\u0003L&\u0000"+
		"\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bcO\u0001\u0000\u0000\u0000\u01bd\u01be\u0007\f\u0000\u0000\u01be"+
		"Q\u0001\u0000\u0000\u0000\u01bf\u01c1\u0005+\u0000\u0000\u01c0\u01c2\u0003"+
		"X,\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c5\u0003X,\u0000\u01c4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"S\u0001\u0000\u0000\u0000\u01c6\u01c8\u0005D\u0000\u0000\u01c7\u01c9\u0003"+
		"X,\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01cc\u0003X,\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"U\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005E\u0000\u0000\u01ce\u01d0\u0003"+
		"X,\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01d3\u0003X,\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"W\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005S\u0000\u0000\u01d5Y\u0001"+
		"\u0000\u0000\u00003]hosw}\u0083\u008a\u009d\u00a6\u00a9\u00b3\u00bd\u00c0"+
		"\u00c4\u00cd\u00d4\u00d9\u00e0\u00e5\u00ed\u0103\u0121\u0135\u0137\u013f"+
		"\u0142\u0149\u0156\u015c\u0163\u016b\u016f\u0173\u0176\u017b\u0184\u018a"+
		"\u018f\u0196\u019a\u019f\u01a2\u01b6\u01bb\u01c1\u01c4\u01c8\u01cb\u01cf"+
		"\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}