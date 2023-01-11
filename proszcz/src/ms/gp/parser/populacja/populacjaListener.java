// Generated from java-escape by ANTLR 4.11.1
package ms.gp.parser.populacja;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link populacjaParser}.
 */
public interface populacjaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link populacjaParser#populacja}.
	 * @param ctx the parse tree
	 */
	void enterPopulacja(populacjaParser.PopulacjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#populacja}.
	 * @param ctx the parse tree
	 */
	void exitPopulacja(populacjaParser.PopulacjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#osobnik}.
	 * @param ctx the parse tree
	 */
	void enterOsobnik(populacjaParser.OsobnikContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#osobnik}.
	 * @param ctx the parse tree
	 */
	void exitOsobnik(populacjaParser.OsobnikContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(populacjaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(populacjaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#proces}.
	 * @param ctx the parse tree
	 */
	void enterProces(populacjaParser.ProcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#proces}.
	 * @param ctx the parse tree
	 */
	void exitProces(populacjaParser.ProcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja(populacjaParser.InstrukcjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#instrukcja}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja(populacjaParser.InstrukcjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_silnika(populacjaParser.Instrukcja_silnikaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_silnika(populacjaParser.Instrukcja_silnikaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie(populacjaParser.WypisanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#wypisanie}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie(populacjaParser.WypisanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie_krotkie(populacjaParser.Wypisanie_krotkieContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie_krotkie(populacjaParser.Wypisanie_krotkieContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 */
	void enterWypisanie_rekursywne(populacjaParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 */
	void exitWypisanie_rekursywne(populacjaParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 */
	void enterPokaz_drzewo(populacjaParser.Pokaz_drzewoContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 */
	void exitPokaz_drzewo(populacjaParser.Pokaz_drzewoContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#uruchomienie}.
	 * @param ctx the parse tree
	 */
	void enterUruchomienie(populacjaParser.UruchomienieContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#uruchomienie}.
	 * @param ctx the parse tree
	 */
	void exitUruchomienie(populacjaParser.UruchomienieContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#reset_silnika}.
	 * @param ctx the parse tree
	 */
	void enterReset_silnika(populacjaParser.Reset_silnikaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#reset_silnika}.
	 * @param ctx the parse tree
	 */
	void exitReset_silnika(populacjaParser.Reset_silnikaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#logi}.
	 * @param ctx the parse tree
	 */
	void enterLogi(populacjaParser.LogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#logi}.
	 * @param ctx the parse tree
	 */
	void exitLogi(populacjaParser.LogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 */
	void enterInstrukcja_procesowa(populacjaParser.Instrukcja_procesowaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 */
	void exitInstrukcja_procesowa(populacjaParser.Instrukcja_procesowaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#import_procesu}.
	 * @param ctx the parse tree
	 */
	void enterImport_procesu(populacjaParser.Import_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#import_procesu}.
	 * @param ctx the parse tree
	 */
	void exitImport_procesu(populacjaParser.Import_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#deport_procesu}.
	 * @param ctx the parse tree
	 */
	void enterDeport_procesu(populacjaParser.Deport_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#deport_procesu}.
	 * @param ctx the parse tree
	 */
	void exitDeport_procesu(populacjaParser.Deport_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 */
	void enterTyp_ewaluacji(populacjaParser.Typ_ewaluacjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 */
	void exitTyp_ewaluacji(populacjaParser.Typ_ewaluacjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 */
	void enterDeklaracja_procesu(populacjaParser.Deklaracja_procesuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 */
	void exitDeklaracja_procesu(populacjaParser.Deklaracja_procesuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#desygnat_celu}.
	 * @param ctx the parse tree
	 */
	void enterDesygnat_celu(populacjaParser.Desygnat_celuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#desygnat_celu}.
	 * @param ctx the parse tree
	 */
	void exitDesygnat_celu(populacjaParser.Desygnat_celuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 */
	void enterZapis_segmentu_anonimowego(populacjaParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 */
	void exitZapis_segmentu_anonimowego(populacjaParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#blok_procesowy}.
	 * @param ctx the parse tree
	 */
	void enterBlok_procesowy(populacjaParser.Blok_procesowyContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#blok_procesowy}.
	 * @param ctx the parse tree
	 */
	void exitBlok_procesowy(populacjaParser.Blok_procesowyContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 */
	void enterNaglowek_bloku_procesowego(populacjaParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 */
	void exitNaglowek_bloku_procesowego(populacjaParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#arnosc}.
	 * @param ctx the parse tree
	 */
	void enterArnosc(populacjaParser.ArnoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#arnosc}.
	 * @param ctx the parse tree
	 */
	void exitArnosc(populacjaParser.ArnoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 */
	void enterZawijanie_pamieci(populacjaParser.Zawijanie_pamieciContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 */
	void exitZawijanie_pamieci(populacjaParser.Zawijanie_pamieciContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieInstrukcjaWarunkowa(populacjaParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieInstrukcjaWarunkowa(populacjaParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieLubLgicz(populacjaParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieLubLgicz(populacjaParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAdresZmiennej(populacjaParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAdresZmiennej(populacjaParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieNawiasy(populacjaParser.WyrazenieNawiasyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieNawiasy(populacjaParser.WyrazenieNawiasyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePorownanie(populacjaParser.WyrazeniePorownanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePorownanie(populacjaParser.WyrazeniePorownanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieDereferencja(populacjaParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieDereferencja(populacjaParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePetelka(populacjaParser.WyrazeniePetelkaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePetelka(populacjaParser.WyrazeniePetelkaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieInstrukcjaZlozona(populacjaParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieInstrukcjaZlozona(populacjaParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieILgicz(populacjaParser.WyrazenieILgiczContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieILgicz(populacjaParser.WyrazenieILgiczContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzerwaniePetelki(populacjaParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzerwaniePetelki(populacjaParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieMult(populacjaParser.WyrazenieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieMult(populacjaParser.WyrazenieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazeniePrzypisanie(populacjaParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazeniePrzypisanie(populacjaParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAddyt(populacjaParser.WyrazenieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAddyt(populacjaParser.WyrazenieAddytContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieStala(populacjaParser.WyrazenieStalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieStala(populacjaParser.WyrazenieStalaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieWywolanie(populacjaParser.WyrazenieWywolanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieWywolanie(populacjaParser.WyrazenieWywolanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieZnak(populacjaParser.WyrazenieZnakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieZnak(populacjaParser.WyrazenieZnakContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 */
	void enterLista_wyrazen(populacjaParser.Lista_wyrazenContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 */
	void exitLista_wyrazen(populacjaParser.Lista_wyrazenContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 */
	void enterNastepstwo_wyrazen(populacjaParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 */
	void exitNastepstwo_wyrazen(populacjaParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#dodatek}.
	 * @param ctx the parse tree
	 */
	void enterDodatek(populacjaParser.DodatekContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#dodatek}.
	 * @param ctx the parse tree
	 */
	void exitDodatek(populacjaParser.DodatekContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#waga}.
	 * @param ctx the parse tree
	 */
	void enterWaga(populacjaParser.WagaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#waga}.
	 * @param ctx the parse tree
	 */
	void exitWaga(populacjaParser.WagaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 */
	void enterDesygnat_wagi(populacjaParser.Desygnat_wagiContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 */
	void exitDesygnat_wagi(populacjaParser.Desygnat_wagiContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 */
	void enterAtrybut_wagi(populacjaParser.Atrybut_wagiContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 */
	void exitAtrybut_wagi(populacjaParser.Atrybut_wagiContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#generacja}.
	 * @param ctx the parse tree
	 */
	void enterGeneracja(populacjaParser.GeneracjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#generacja}.
	 * @param ctx the parse tree
	 */
	void exitGeneracja(populacjaParser.GeneracjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#mutacja}.
	 * @param ctx the parse tree
	 */
	void enterMutacja(populacjaParser.MutacjaContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#mutacja}.
	 * @param ctx the parse tree
	 */
	void exitMutacja(populacjaParser.MutacjaContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#krzyzowanie}.
	 * @param ctx the parse tree
	 */
	void enterKrzyzowanie(populacjaParser.KrzyzowanieContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#krzyzowanie}.
	 * @param ctx the parse tree
	 */
	void exitKrzyzowanie(populacjaParser.KrzyzowanieContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 */
	void enterKrzyzowanie_arg(populacjaParser.Krzyzowanie_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 */
	void exitKrzyzowanie_arg(populacjaParser.Krzyzowanie_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 */
	void enterKopiowanie_dod(populacjaParser.Kopiowanie_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 */
	void exitKopiowanie_dod(populacjaParser.Kopiowanie_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#wartosc}.
	 * @param ctx the parse tree
	 */
	void enterWartosc(populacjaParser.WartoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#wartosc}.
	 * @param ctx the parse tree
	 */
	void exitWartosc(populacjaParser.WartoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#glebokosc}.
	 * @param ctx the parse tree
	 */
	void enterGlebokosc(populacjaParser.GlebokoscContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#glebokosc}.
	 * @param ctx the parse tree
	 */
	void exitGlebokosc(populacjaParser.GlebokoscContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#cel_dodatku}.
	 * @param ctx the parse tree
	 */
	void enterCel_dodatku(populacjaParser.Cel_dodatkuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#cel_dodatku}.
	 * @param ctx the parse tree
	 */
	void exitCel_dodatku(populacjaParser.Cel_dodatkuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 */
	void enterZrodlo_dodatku(populacjaParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 */
	void exitZrodlo_dodatku(populacjaParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#poz_dodatek}.
	 * @param ctx the parse tree
	 */
	void enterPoz_dodatek(populacjaParser.Poz_dodatekContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#poz_dodatek}.
	 * @param ctx the parse tree
	 */
	void exitPoz_dodatek(populacjaParser.Poz_dodatekContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#pokoloruj}.
	 * @param ctx the parse tree
	 */
	void enterPokoloruj(populacjaParser.PokolorujContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#pokoloruj}.
	 * @param ctx the parse tree
	 */
	void exitPokoloruj(populacjaParser.PokolorujContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 */
	void enterPokaz_generatory(populacjaParser.Pokaz_generatoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 */
	void exitPokaz_generatory(populacjaParser.Pokaz_generatoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#wezel_dod}.
	 * @param ctx the parse tree
	 */
	void enterWezel_dod(populacjaParser.Wezel_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#wezel_dod}.
	 * @param ctx the parse tree
	 */
	void exitWezel_dod(populacjaParser.Wezel_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#nieterm_dod}.
	 * @param ctx the parse tree
	 */
	void enterNieterm_dod(populacjaParser.Nieterm_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#nieterm_dod}.
	 * @param ctx the parse tree
	 */
	void exitNieterm_dod(populacjaParser.Nieterm_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#term_dod}.
	 * @param ctx the parse tree
	 */
	void enterTerm_dod(populacjaParser.Term_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#term_dod}.
	 * @param ctx the parse tree
	 */
	void exitTerm_dod(populacjaParser.Term_dodContext ctx);
	/**
	 * Enter a parse tree produced by {@link populacjaParser#par_dod}.
	 * @param ctx the parse tree
	 */
	void enterPar_dod(populacjaParser.Par_dodContext ctx);
	/**
	 * Exit a parse tree produced by {@link populacjaParser#par_dod}.
	 * @param ctx the parse tree
	 */
	void exitPar_dod(populacjaParser.Par_dodContext ctx);
}