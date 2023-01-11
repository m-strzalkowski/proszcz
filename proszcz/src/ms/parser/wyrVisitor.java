// Generated from C:/Users/mastr/Documents/MS/STUDIA/Programowanie_genetyczne/Upraszczacz/src/ms\wyr.g4 by ANTLR 4.9.2
package ms.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link wyrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface wyrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link wyrParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(wyrParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieMult}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieMult(wyrParser.WyrazenieMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieNawiasy}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieNawiasy(wyrParser.WyrazenieNawiasyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieZmienna}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZmienna(wyrParser.WyrazenieZmiennaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieAddyt}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieAddyt(wyrParser.WyrazenieAddytContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieWywolanie}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieWywolanie(wyrParser.WyrazenieWywolanieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieStala}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieStala(wyrParser.WyrazenieStalaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wyrazenieZnak}
	 * labeled alternative in {@link wyrParser#wyrazenie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWyrazenieZnak(wyrParser.WyrazenieZnakContext ctx);
	/**
	 * Visit a parse tree produced by {@link wyrParser#wywolanie_funkcji}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWywolanie_funkcji(wyrParser.Wywolanie_funkcjiContext ctx);
	/**
	 * Visit a parse tree produced by {@link wyrParser#lista_parametrow_aktualnych}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametrow_aktualnych(wyrParser.Lista_parametrow_aktualnychContext ctx);
	/**
	 * Visit a parse tree produced by {@link wyrParser#zmienna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZmienna(wyrParser.ZmiennaContext ctx);
	/**
	 * Visit a parse tree produced by {@link wyrParser#stala_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStala_atom(wyrParser.Stala_atomContext ctx);
}