// Generated from C:\Users\bubble-07\My Documents\GitHub\Phi\src\main\antlr4\PHI.g4 by ANTLR 4.2.2

    package phi.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PHIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PHIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PHIParser#stringconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringconst(@NotNull PHIParser.StringconstContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#funitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunitems(@NotNull PHIParser.FunitemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull PHIParser.DefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#subs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubs(@NotNull PHIParser.SubsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#aspace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAspace(@NotNull PHIParser.AspaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#blockline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockline(@NotNull PHIParser.BlocklineContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#alistitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlistitems(@NotNull PHIParser.AlistitemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull PHIParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#listitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitem(@NotNull PHIParser.ListitemContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#dotapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotapp(@NotNull PHIParser.DotappContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(@NotNull PHIParser.LambdaContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#sups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSups(@NotNull PHIParser.SupsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#blockapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockapp(@NotNull PHIParser.BlockappContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(@NotNull PHIParser.LetContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#floatconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatconst(@NotNull PHIParser.FloatconstContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull PHIParser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(@NotNull PHIParser.ItemContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#optspace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptspace(@NotNull PHIParser.OptspaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#blockitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockitems(@NotNull PHIParser.BlockitemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull PHIParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#sexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSexpr(@NotNull PHIParser.SexprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#funapp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunapp(@NotNull PHIParser.FunappContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#dotitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotitem(@NotNull PHIParser.DotitemContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#blocklines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocklines(@NotNull PHIParser.BlocklinesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#listitems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListitems(@NotNull PHIParser.ListitemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#apaddeditems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApaddeditems(@NotNull PHIParser.ApaddeditemsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#intconst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntconst(@NotNull PHIParser.IntconstContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(@NotNull PHIParser.NamespaceContext ctx);

	/**
	 * Visit a parse tree produced by {@link PHIParser#reservedword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedword(@NotNull PHIParser.ReservedwordContext ctx);
}