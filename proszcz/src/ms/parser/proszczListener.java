// Generated from java-escape by ANTLR 4.11.1
package ms.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link proszczParser}.
 */
public interface proszczListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link proszczParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(proszczParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(proszczParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#proces}.
	 * @param ctx the parse tree
	 */
	void enterProces(proszczParser.ProcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#proces}.
	 * @param ctx the parse tree
	 */
	void exitProces(proszczParser.ProcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja(proszczParser.InstrukcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja(proszczParser.InstrukcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_silnika(proszczParser.Instrukcja_silnikaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_silnika(proszczParser.Instrukcja_silnikaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie(proszczParser.WypisanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie(proszczParser.WypisanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie_krotkie(proszczParser.Wypisanie_krotkieContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie_krotkie(proszczParser.Wypisanie_krotkieContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie_rekursywne(proszczParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie_rekursywne(proszczParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 */
	void enterPokaz_drzewo(proszczParser.Pokaz_drzewoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 */
	void exitPokaz_drzewo(proszczParser.Pokaz_drzewoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#uruchomienie}.
	 * @param ctx the parse tree
	 */
	void enterUruchomienie(proszczParser.UruchomienieContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#uruchomienie}.
	 * @param ctx the parse tree
	 */
	void exitUruchomienie(proszczParser.UruchomienieContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#reset_silnika}.
	 * @param ctx the parse tree
	 */
	void enterReset_silnika(proszczParser.Reset_silnikaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#reset_silnika}.
	 * @param ctx the parse tree
	 */
	void exitReset_silnika(proszczParser.Reset_silnikaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#logi}.
	 * @param ctx the parse tree
	 */
	void enterLogi(proszczParser.LogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#logi}.
	 * @param ctx the parse tree
	 */
	void exitLogi(proszczParser.LogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_procesowa(proszczParser.Instrukcja_procesowaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_procesowa(proszczParser.Instrukcja_procesowaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#import_procesu}.
	 * @param ctx the parse tree
	 */
	void enterImport_procesu(proszczParser.Import_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#import_procesu}.
	 * @param ctx the parse tree
	 */
	void exitImport_procesu(proszczParser.Import_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#deport_procesu}.
	 * @param ctx the parse tree
	 */
	void enterDeport_procesu(proszczParser.Deport_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#deport_procesu}.
	 * @param ctx the parse tree
	 */
	void exitDeport_procesu(proszczParser.Deport_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 */
	void enterTyp_ewaluacji(proszczParser.Typ_ewaluacjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 */
	void exitTyp_ewaluacji(proszczParser.Typ_ewaluacjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_procesu(proszczParser.Deklaracja_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_procesu(proszczParser.Deklaracja_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#desygnat_celu}.
	 * @param ctx the parse tree
	 */
	void enterDesygnat_celu(proszczParser.Desygnat_celuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#desygnat_celu}.
	 * @param ctx the parse tree
	 */
	void exitDesygnat_celu(proszczParser.Desygnat_celuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 */
	void enterZapis_segmentu_anonimowego(proszczParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 */
	void exitZapis_segmentu_anonimowego(proszczParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#blok_procesowy}.
	 * @param ctx the parse tree
	 */
	void enterBlok_procesowy(proszczParser.Blok_procesowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#blok_procesowy}.
	 * @param ctx the parse tree
	 */
	void exitBlok_procesowy(proszczParser.Blok_procesowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 */
	void enterNaglowek_bloku_procesowego(proszczParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 */
	void exitNaglowek_bloku_procesowego(proszczParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#arnosc}.
	 * @param ctx the parse tree
	 */
	void enterArnosc(proszczParser.ArnoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#arnosc}.
	 * @param ctx the parse tree
	 */
	void exitArnosc(proszczParser.ArnoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 */
	void enterZawijanie_pamieci(proszczParser.Zawijanie_pamieciContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 */
	void exitZawijanie_pamieci(proszczParser.Zawijanie_pamieciContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieInstrukcjaWarunkowa(proszczParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieInstrukcjaWarunkowa(proszczParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieLubLgicz(proszczParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieLubLgicz(proszczParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAdresZmiennej(proszczParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAdresZmiennej(proszczParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieNawiasy(proszczParser.WyrazenieNawiasyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieNawiasy(proszczParser.WyrazenieNawiasyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePorownanie(proszczParser.WyrazeniePorownanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePorownanie(proszczParser.WyrazeniePorownanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieDereferencja(proszczParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieDereferencja(proszczParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePetelka(proszczParser.WyrazeniePetelkaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePetelka(proszczParser.WyrazeniePetelkaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieInstrukcjaZlozona(proszczParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieInstrukcjaZlozona(proszczParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieILgicz(proszczParser.WyrazenieILgiczContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieILgicz(proszczParser.WyrazenieILgiczContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzerwaniePetelki(proszczParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzerwaniePetelki(proszczParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieMult(proszczParser.WyrazenieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieMult(proszczParser.WyrazenieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanie(proszczParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanie(proszczParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAddyt(proszczParser.WyrazenieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAddyt(proszczParser.WyrazenieAddytContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieStala(proszczParser.WyrazenieStalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieStala(proszczParser.WyrazenieStalaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieWywolanie(proszczParser.WyrazenieWywolanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieWywolanie(proszczParser.WyrazenieWywolanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieZnak(proszczParser.WyrazenieZnakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieZnak(proszczParser.WyrazenieZnakContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 */
	void enterLista_wyrazen(proszczParser.Lista_wyrazenContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 */
	void exitLista_wyrazen(proszczParser.Lista_wyrazenContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 */
	void enterNastepstwo_wyrazen(proszczParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 */
	void exitNastepstwo_wyrazen(proszczParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#dodatek}.
	 * @param ctx the parse tree
	 */
	void enterDodatek(proszczParser.DodatekContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#dodatek}.
	 * @param ctx the parse tree
	 */
	void exitDodatek(proszczParser.DodatekContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#waga}.
	 * @param ctx the parse tree
	 */
	void enterWaga(proszczParser.WagaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#waga}.
	 * @param ctx the parse tree
	 */
	void exitWaga(proszczParser.WagaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 */
	void enterDesygnat_wagi(proszczParser.Desygnat_wagiContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 */
	void exitDesygnat_wagi(proszczParser.Desygnat_wagiContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 */
	void enterAtrybut_wagi(proszczParser.Atrybut_wagiContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 */
	void exitAtrybut_wagi(proszczParser.Atrybut_wagiContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#generacja}.
	 * @param ctx the parse tree
	 */
	void enterGeneracja(proszczParser.GeneracjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#generacja}.
	 * @param ctx the parse tree
	 */
	void exitGeneracja(proszczParser.GeneracjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#mutacja}.
	 * @param ctx the parse tree
	 */
	void enterMutacja(proszczParser.MutacjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#mutacja}.
	 * @param ctx the parse tree
	 */
	void exitMutacja(proszczParser.MutacjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#krzyzowanie}.
	 * @param ctx the parse tree
	 */
	void enterKrzyzowanie(proszczParser.KrzyzowanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#krzyzowanie}.
	 * @param ctx the parse tree
	 */
	void exitKrzyzowanie(proszczParser.KrzyzowanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 */
	void enterKrzyzowanie_arg(proszczParser.Krzyzowanie_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 */
	void exitKrzyzowanie_arg(proszczParser.Krzyzowanie_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 */
	void enterKopiowanie_dod(proszczParser.Kopiowanie_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 */
	void exitKopiowanie_dod(proszczParser.Kopiowanie_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#wartosc}.
	 * @param ctx the parse tree
	 */
	void enterWartosc(proszczParser.WartoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#wartosc}.
	 * @param ctx the parse tree
	 */
	void exitWartosc(proszczParser.WartoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#glebokosc}.
	 * @param ctx the parse tree
	 */
	void enterGlebokosc(proszczParser.GlebokoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#glebokosc}.
	 * @param ctx the parse tree
	 */
	void exitGlebokosc(proszczParser.GlebokoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#cel_dodatku}.
	 * @param ctx the parse tree
	 */
	void enterCel_dodatku(proszczParser.Cel_dodatkuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#cel_dodatku}.
	 * @param ctx the parse tree
	 */
	void exitCel_dodatku(proszczParser.Cel_dodatkuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 */
	void enterZrodlo_dodatku(proszczParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 */
	void exitZrodlo_dodatku(proszczParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#poz_dodatek}.
	 * @param ctx the parse tree
	 */
	void enterPoz_dodatek(proszczParser.Poz_dodatekContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#poz_dodatek}.
	 * @param ctx the parse tree
	 */
	void exitPoz_dodatek(proszczParser.Poz_dodatekContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#pokoloruj}.
	 * @param ctx the parse tree
	 */
	void enterPokoloruj(proszczParser.PokolorujContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#pokoloruj}.
	 * @param ctx the parse tree
	 */
	void exitPokoloruj(proszczParser.PokolorujContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 */
	void enterPokaz_generatory(proszczParser.Pokaz_generatoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 */
	void exitPokaz_generatory(proszczParser.Pokaz_generatoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#wezel_dod}.
	 * @param ctx the parse tree
	 */
	void enterWezel_dod(proszczParser.Wezel_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#wezel_dod}.
	 * @param ctx the parse tree
	 */
	void exitWezel_dod(proszczParser.Wezel_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#nieterm_dod}.
	 * @param ctx the parse tree
	 */
	void enterNieterm_dod(proszczParser.Nieterm_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#nieterm_dod}.
	 * @param ctx the parse tree
	 */
	void exitNieterm_dod(proszczParser.Nieterm_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#term_dod}.
	 * @param ctx the parse tree
	 */
	void enterTerm_dod(proszczParser.Term_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#term_dod}.
	 * @param ctx the parse tree
	 */
	void exitTerm_dod(proszczParser.Term_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link proszczParser#par_dod}.
	 * @param ctx the parse tree
	 */
	void enterPar_dod(proszczParser.Par_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link proszczParser#par_dod}.
	 * @param ctx the parse tree
	 */
	void exitPar_dod(proszczParser.Par_dodContext ctx);
}