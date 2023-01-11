// Generated from C:/Users/mastr/Documents/MS/STUDIA/Programowanie_genetyczne/Upraszczacz/src/ms\wyr.g4 by ANTLR 4.9.2
package ms.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link wyrParser}.
 */
public interface wyrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link wyrParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(wyrParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link wyrParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(wyrParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieMult(wyrParser.WyrazenieMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieMult(wyrParser.WyrazenieMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieNawiasy(wyrParser.WyrazenieNawiasyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieNawiasy(wyrParser.WyrazenieNawiasyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieZmienna}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieZmienna(wyrParser.WyrazenieZmiennaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieZmienna}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieZmienna(wyrParser.WyrazenieZmiennaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieAddyt(wyrParser.WyrazenieAddytContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieAddyt(wyrParser.WyrazenieAddytContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieWywolanie(wyrParser.WyrazenieWywolanieContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieWywolanie(wyrParser.WyrazenieWywolanieContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieStala(wyrParser.WyrazenieStalaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieStala(wyrParser.WyrazenieStalaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void enterWyrazenieZnak(wyrParser.WyrazenieZnakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 */
	void exitWyrazenieZnak(wyrParser.WyrazenieZnakContext ctx);
	/**
	 * Enter a parse tree produced by {@link wyrParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void enterWywolanie_funkcji(wyrParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Exit a parse tree produced by {@link wyrParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 */
	void exitWywolanie_funkcji(wyrParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Enter a parse tree produced by {@link wyrParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametrow_aktualnych(wyrParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Exit a parse tree produced by {@link wyrParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametrow_aktualnych(wyrParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Enter a parse tree produced by {@link wyrParser#zmienna}.
	 * @param ctx the parse tree
	 */
	void enterZmienna(wyrParser.ZmiennaContext ctx);
	/**
	 * Exit a parse tree produced by {@link wyrParser#zmienna}.
	 * @param ctx the parse tree
	 */
	void exitZmienna(wyrParser.ZmiennaContext ctx);
	/**
	 * Enter a parse tree produced by {@link wyrParser#stala_atom}.
	 * @param ctx the parse tree
	 */
	void enterStala_atom(wyrParser.Stala_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link wyrParser#stala_atom}.
	 * @param ctx the parse tree
	 */
	void exitStala_atom(wyrParser.Stala_atomContext ctx);
}