// Generated from java-escape by ANTLR 4.11.1
package ms.gp.parser.populacja;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link populacjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface populacjaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link populacjaParser#populacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopulacja(populacjaParser.PopulacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#osobnik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOsobnik(populacjaParser.OsobnikContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(populacjaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#proces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProces(populacjaParser.ProcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(populacjaParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_silnika(populacjaParser.Instrukcja_silnikaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#wypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie(populacjaParser.WypisanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie_krotkie(populacjaParser.Wypisanie_krotkieContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie_rekursywne(populacjaParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokaz_drzewo(populacjaParser.Pokaz_drzewoContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#uruchomienie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUruchomienie(populacjaParser.UruchomienieContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#reset_silnika}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_silnika(populacjaParser.Reset_silnikaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#logi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogi(populacjaParser.LogiContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_procesowa(populacjaParser.Instrukcja_procesowaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#import_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_procesu(populacjaParser.Import_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#deport_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeport_procesu(populacjaParser.Deport_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp_ewaluacji(populacjaParser.Typ_ewaluacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_procesu(populacjaParser.Deklaracja_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#desygnat_celu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesygnat_celu(populacjaParser.Desygnat_celuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapis_segmentu_anonimowego(populacjaParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#blok_procesowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlok_procesowy(populacjaParser.Blok_procesowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaglowek_bloku_procesowego(populacjaParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#arnosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnosc(populacjaParser.ArnoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZawijanie_pamieci(populacjaParser.Zawijanie_pamieciContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieInstrukcjaWarunkowa(populacjaParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieLubLgicz(populacjaParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAdresZmiennej(populacjaParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieNawiasy(populacjaParser.WyrazenieNawiasyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePorownanie(populacjaParser.WyrazeniePorownanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieDereferencja(populacjaParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePetelka(populacjaParser.WyrazeniePetelkaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieInstrukcjaZlozona(populacjaParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieILgicz(populacjaParser.WyrazenieILgiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzerwaniePetelki(populacjaParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMult(populacjaParser.WyrazenieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanie(populacjaParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAddyt(populacjaParser.WyrazenieAddytContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieStala(populacjaParser.WyrazenieStalaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieWywolanie(populacjaParser.WyrazenieWywolanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link populacjaParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZnak(populacjaParser.WyrazenieZnakContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_wyrazen(populacjaParser.Lista_wyrazenContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNastepstwo_wyrazen(populacjaParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#dodatek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodatek(populacjaParser.DodatekContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#waga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaga(populacjaParser.WagaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesygnat_wagi(populacjaParser.Desygnat_wagiContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrybut_wagi(populacjaParser.Atrybut_wagiContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#generacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneracja(populacjaParser.GeneracjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#mutacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutacja(populacjaParser.MutacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#krzyzowanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrzyzowanie(populacjaParser.KrzyzowanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrzyzowanie_arg(populacjaParser.Krzyzowanie_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopiowanie_dod(populacjaParser.Kopiowanie_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#wartosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWartosc(populacjaParser.WartoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#glebokosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlebokosc(populacjaParser.GlebokoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#cel_dodatku}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCel_dodatku(populacjaParser.Cel_dodatkuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZrodlo_dodatku(populacjaParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#poz_dodatek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoz_dodatek(populacjaParser.Poz_dodatekContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#pokoloruj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokoloruj(populacjaParser.PokolorujContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokaz_generatory(populacjaParser.Pokaz_generatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#wezel_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWezel_dod(populacjaParser.Wezel_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#nieterm_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNieterm_dod(populacjaParser.Nieterm_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#term_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_dod(populacjaParser.Term_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link populacjaParser#par_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_dod(populacjaParser.Par_dodContext ctx);
}