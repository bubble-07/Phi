// Generated from C:\Users\bubble-07\My Documents\GitHub\Phi\src\main\antlr4\PHI.g4 by ANTLR 4.2.2

    package phi.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PHIParser}.
 */
public interface PHIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PHIParser#stringconst}.
	 * @param ctx the parse tree
	 */
	void enterStringconst(@NotNull PHIParser.StringconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#stringconst}.
	 * @param ctx the parse tree
	 */
	void exitStringconst(@NotNull PHIParser.StringconstContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#funitems}.
	 * @param ctx the parse tree
	 */
	void enterFunitems(@NotNull PHIParser.FunitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#funitems}.
	 * @param ctx the parse tree
	 */
	void exitFunitems(@NotNull PHIParser.FunitemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(@NotNull PHIParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(@NotNull PHIParser.DefContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#subs}.
	 * @param ctx the parse tree
	 */
	void enterSubs(@NotNull PHIParser.SubsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#subs}.
	 * @param ctx the parse tree
	 */
	void exitSubs(@NotNull PHIParser.SubsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#aspace}.
	 * @param ctx the parse tree
	 */
	void enterAspace(@NotNull PHIParser.AspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#aspace}.
	 * @param ctx the parse tree
	 */
	void exitAspace(@NotNull PHIParser.AspaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#blockline}.
	 * @param ctx the parse tree
	 */
	void enterBlockline(@NotNull PHIParser.BlocklineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#blockline}.
	 * @param ctx the parse tree
	 */
	void exitBlockline(@NotNull PHIParser.BlocklineContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#alistitems}.
	 * @param ctx the parse tree
	 */
	void enterAlistitems(@NotNull PHIParser.AlistitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#alistitems}.
	 * @param ctx the parse tree
	 */
	void exitAlistitems(@NotNull PHIParser.AlistitemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull PHIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull PHIParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#listitem}.
	 * @param ctx the parse tree
	 */
	void enterListitem(@NotNull PHIParser.ListitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#listitem}.
	 * @param ctx the parse tree
	 */
	void exitListitem(@NotNull PHIParser.ListitemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#dotapp}.
	 * @param ctx the parse tree
	 */
	void enterDotapp(@NotNull PHIParser.DotappContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#dotapp}.
	 * @param ctx the parse tree
	 */
	void exitDotapp(@NotNull PHIParser.DotappContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull PHIParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull PHIParser.LambdaContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#sups}.
	 * @param ctx the parse tree
	 */
	void enterSups(@NotNull PHIParser.SupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#sups}.
	 * @param ctx the parse tree
	 */
	void exitSups(@NotNull PHIParser.SupsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#blockapp}.
	 * @param ctx the parse tree
	 */
	void enterBlockapp(@NotNull PHIParser.BlockappContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#blockapp}.
	 * @param ctx the parse tree
	 */
	void exitBlockapp(@NotNull PHIParser.BlockappContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(@NotNull PHIParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(@NotNull PHIParser.LetContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#floatconst}.
	 * @param ctx the parse tree
	 */
	void enterFloatconst(@NotNull PHIParser.FloatconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#floatconst}.
	 * @param ctx the parse tree
	 */
	void exitFloatconst(@NotNull PHIParser.FloatconstContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull PHIParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull PHIParser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(@NotNull PHIParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(@NotNull PHIParser.ItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#optspace}.
	 * @param ctx the parse tree
	 */
	void enterOptspace(@NotNull PHIParser.OptspaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#optspace}.
	 * @param ctx the parse tree
	 */
	void exitOptspace(@NotNull PHIParser.OptspaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#blockitems}.
	 * @param ctx the parse tree
	 */
	void enterBlockitems(@NotNull PHIParser.BlockitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#blockitems}.
	 * @param ctx the parse tree
	 */
	void exitBlockitems(@NotNull PHIParser.BlockitemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull PHIParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull PHIParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void enterSexpr(@NotNull PHIParser.SexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#sexpr}.
	 * @param ctx the parse tree
	 */
	void exitSexpr(@NotNull PHIParser.SexprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#funapp}.
	 * @param ctx the parse tree
	 */
	void enterFunapp(@NotNull PHIParser.FunappContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#funapp}.
	 * @param ctx the parse tree
	 */
	void exitFunapp(@NotNull PHIParser.FunappContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#dotitem}.
	 * @param ctx the parse tree
	 */
	void enterDotitem(@NotNull PHIParser.DotitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#dotitem}.
	 * @param ctx the parse tree
	 */
	void exitDotitem(@NotNull PHIParser.DotitemContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#blocklines}.
	 * @param ctx the parse tree
	 */
	void enterBlocklines(@NotNull PHIParser.BlocklinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#blocklines}.
	 * @param ctx the parse tree
	 */
	void exitBlocklines(@NotNull PHIParser.BlocklinesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#listitems}.
	 * @param ctx the parse tree
	 */
	void enterListitems(@NotNull PHIParser.ListitemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#listitems}.
	 * @param ctx the parse tree
	 */
	void exitListitems(@NotNull PHIParser.ListitemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#apaddeditems}.
	 * @param ctx the parse tree
	 */
	void enterApaddeditems(@NotNull PHIParser.ApaddeditemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#apaddeditems}.
	 * @param ctx the parse tree
	 */
	void exitApaddeditems(@NotNull PHIParser.ApaddeditemsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#intconst}.
	 * @param ctx the parse tree
	 */
	void enterIntconst(@NotNull PHIParser.IntconstContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#intconst}.
	 * @param ctx the parse tree
	 */
	void exitIntconst(@NotNull PHIParser.IntconstContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(@NotNull PHIParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(@NotNull PHIParser.NamespaceContext ctx);

	/**
	 * Enter a parse tree produced by {@link PHIParser#reservedword}.
	 * @param ctx the parse tree
	 */
	void enterReservedword(@NotNull PHIParser.ReservedwordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PHIParser#reservedword}.
	 * @param ctx the parse tree
	 */
	void exitReservedword(@NotNull PHIParser.ReservedwordContext ctx);
}