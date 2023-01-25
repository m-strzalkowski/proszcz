// Generated from java-escape by ANTLR 4.11.1
package ms.gp.parser.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProszczGPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProszczGPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#plik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlik(ProszczGPParser.PlikContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#instrukcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrukcja(ProszczGPParser.InstrukcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#nazwanapis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwanapis(ProszczGPParser.NazwanapisContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#echo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho(ProszczGPParser.EchoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#ustaw_nazwe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUstaw_nazwe(ProszczGPParser.Ustaw_nazweContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#ustaw_katalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUstaw_katalog(ProszczGPParser.Ustaw_katalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#wykonaj_skrypt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWykonaj_skrypt(ProszczGPParser.Wykonaj_skryptContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#przypadki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrzypadki(ProszczGPParser.PrzypadkiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#opcja_przypadkow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcja_przypadkow(ProszczGPParser.Opcja_przypadkowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#generuj_przypadki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneruj_przypadki(ProszczGPParser.Generuj_przypadkiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#pisz_przypadki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPisz_przypadki(ProszczGPParser.Pisz_przypadkiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#funkcja_przystosowania}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunkcja_przystosowania(ProszczGPParser.Funkcja_przystosowaniaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#fprzyst_klasa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFprzyst_klasa(ProszczGPParser.Fprzyst_klasaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#wczytaj_srodowisko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWczytaj_srodowisko(ProszczGPParser.Wczytaj_srodowiskoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#zapisz_srodowisko}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapisz_srodowisko(ProszczGPParser.Zapisz_srodowiskoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#listuj_srodowiska}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListuj_srodowiska(ProszczGPParser.Listuj_srodowiskaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#rozmiar_populacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRozmiar_populacji(ProszczGPParser.Rozmiar_populacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#inicjalizacja_populacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicjalizacja_populacji(ProszczGPParser.Inicjalizacja_populacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#zapis_populacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapis_populacji(ProszczGPParser.Zapis_populacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#zapis_populacji_gdzie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZapis_populacji_gdzie(ProszczGPParser.Zapis_populacji_gdzieContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#odczyt_populacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdczyt_populacji(ProszczGPParser.Odczyt_populacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#odczyt_populacji_gdzie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdczyt_populacji_gdzie(ProszczGPParser.Odczyt_populacji_gdzieContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#listuj_populacje}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListuj_populacje(ProszczGPParser.Listuj_populacjeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#nastepne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNastepne(ProszczGPParser.NastepneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#statystyki}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatystyki(ProszczGPParser.StatystykiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#nr_obecnej_generacji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNr_obecnej_generacji(ProszczGPParser.Nr_obecnej_generacjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#inspekcja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspekcja(ProszczGPParser.InspekcjaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#koniec_inspekcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKoniec_inspekcji(ProszczGPParser.Koniec_inspekcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#inspekcja_srodowiska}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInspekcja_srodowiska(ProszczGPParser.Inspekcja_srodowiskaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#zakoncz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZakoncz(ProszczGPParser.ZakonczContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#wstrzykniecie_osobnika_do_srodowiska}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWstrzykniecie_osobnika_do_srodowiska(ProszczGPParser.Wstrzykniecie_osobnika_do_srodowiskaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#ustawienie_wejsc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUstawienie_wejsc(ProszczGPParser.Ustawienie_wejscContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#we_stdin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWe_stdin(ProszczGPParser.We_stdinContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#we_tablica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWe_tablica(ProszczGPParser.We_tablicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#waga_operatora_genetycznego}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaga_operatora_genetycznego(ProszczGPParser.Waga_operatora_genetycznegoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#listuj_operatory_genetyczne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListuj_operatory_genetyczne(ProszczGPParser.Listuj_operatory_genetyczneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProszczGPParser#wydanie_programu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWydanie_programu(ProszczGPParser.Wydanie_programuContext ctx);
}