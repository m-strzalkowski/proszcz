// Generated from java-escape by ANTLR 4.11.1
package ms.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link proszczParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface proszczVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link proszczParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(proszczParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#proces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProces(proszczParser.ProcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(proszczParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#instrukcja_silnika}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_silnika(proszczParser.Instrukcja_silnikaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#wypisanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie(proszczParser.WypisanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#wypisanie_krotkie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie_krotkie(proszczParser.Wypisanie_krotkieContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#wypisanie_rekursywne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWypisanie_rekursywne(proszczParser.Wypisanie_rekursywneContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#pokaz_drzewo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokaz_drzewo(proszczParser.Pokaz_drzewoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#uruchomienie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUruchomienie(proszczParser.UruchomienieContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#reset_silnika}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_silnika(proszczParser.Reset_silnikaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#logi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogi(proszczParser.LogiContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#instrukcja_procesowa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja_procesowa(proszczParser.Instrukcja_procesowaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#import_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_procesu(proszczParser.Import_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#deport_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeport_procesu(proszczParser.Deport_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#typ_ewaluacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp_ewaluacji(proszczParser.Typ_ewaluacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#deklaracja_procesu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeklaracja_procesu(proszczParser.Deklaracja_procesuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#desygnat_celu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesygnat_celu(proszczParser.Desygnat_celuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#zapis_segmentu_anonimowego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapis_segmentu_anonimowego(proszczParser.Zapis_segmentu_anonimowegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#blok_procesowy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlok_procesowy(proszczParser.Blok_procesowyContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#naglowek_bloku_procesowego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaglowek_bloku_procesowego(proszczParser.Naglowek_bloku_procesowegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#arnosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArnosc(proszczParser.ArnoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#zawijanie_pamieci}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZawijanie_pamieci(proszczParser.Zawijanie_pamieciContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieInstrukcjaWarunkowa}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieInstrukcjaWarunkowa(proszczParser.WyrazenieInstrukcjaWarunkowaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieLubLgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieLubLgicz(proszczParser.WyrazenieLubLgiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAdresZmiennej}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAdresZmiennej(proszczParser.WyrazenieAdresZmiennejContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieNawiasy(proszczParser.WyrazenieNawiasyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePorownanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePorownanie(proszczParser.WyrazeniePorownanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieDereferencja}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieDereferencja(proszczParser.WyrazenieDereferencjaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePetelka}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePetelka(proszczParser.WyrazeniePetelkaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieInstrukcjaZlozona}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieInstrukcjaZlozona(proszczParser.WyrazenieInstrukcjaZlozonaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieILgicz}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieILgicz(proszczParser.WyrazenieILgiczContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzerwaniePetelki}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzerwaniePetelki(proszczParser.WyrazeniePrzerwaniePetelkiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMult(proszczParser.WyrazenieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazeniePrzypisanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazeniePrzypisanie(proszczParser.WyrazeniePrzypisanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAddyt(proszczParser.WyrazenieAddytContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieStala(proszczParser.WyrazenieStalaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieWywolanie(proszczParser.WyrazenieWywolanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link proszczParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZnak(proszczParser.WyrazenieZnakContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#lista_wyrazen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_wyrazen(proszczParser.Lista_wyrazenContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#nastepstwo_wyrazen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNastepstwo_wyrazen(proszczParser.Nastepstwo_wyrazenContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#dodatek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodatek(proszczParser.DodatekContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#waga}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaga(proszczParser.WagaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#desygnat_wagi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesygnat_wagi(proszczParser.Desygnat_wagiContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#atrybut_wagi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrybut_wagi(proszczParser.Atrybut_wagiContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#generacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneracja(proszczParser.GeneracjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#mutacja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMutacja(proszczParser.MutacjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#krzyzowanie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrzyzowanie(proszczParser.KrzyzowanieContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#krzyzowanie_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKrzyzowanie_arg(proszczParser.Krzyzowanie_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#kopiowanie_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKopiowanie_dod(proszczParser.Kopiowanie_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#wartosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWartosc(proszczParser.WartoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#glebokosc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlebokosc(proszczParser.GlebokoscContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#cel_dodatku}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCel_dodatku(proszczParser.Cel_dodatkuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#zrodlo_dodatku}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZrodlo_dodatku(proszczParser.Zrodlo_dodatkuContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#poz_dodatek}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoz_dodatek(proszczParser.Poz_dodatekContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#pokoloruj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokoloruj(proszczParser.PokolorujContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#pokaz_generatory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPokaz_generatory(proszczParser.Pokaz_generatoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#wezel_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWezel_dod(proszczParser.Wezel_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#nieterm_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNieterm_dod(proszczParser.Nieterm_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#term_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_dod(proszczParser.Term_dodContext ctx);
	/**
	 * Visit a parse tree produced by {@link proszczParser#par_dod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_dod(proszczParser.Par_dodContext ctx);
}