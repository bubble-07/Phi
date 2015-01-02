package phi;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;


import phi.PHIParser;
import phi.Node;
import java.util.*;

public class PhiParseVisitor extends AbstractParseTreeVisitor<Node>
                    implements PHIVisitor<Node> {
        
    //Helper that takes a list of arguments and a label, and produces
    //(label arg1 arg2 arg3 arg4...), where all arguments are visited
    private <T extends ParserRuleContext> Node topLevelify(List<T> list, String label) {
        Node result = new Node(label);
        for (T item : list) {
            result.add(visit(item));
        }
        return result;
    }

    @Override
    public Node visitStart(PHIParser.StartContext ctxt) {
        return visit(ctxt.blocklines());
    }
    @Override
    public Node visitBlocklines(PHIParser.BlocklinesContext ctxt) {
        return topLevelify(ctxt.getRuleContexts(PHIParser.BlocklineContext.class), "Expr");
    }
    @Override
    public Node visitBlockline(PHIParser.BlocklineContext ctxt) {
        //Blockline just passes right through
        return visit(ctxt.getRuleContext(PHIParser.BlockitemsContext.class, 0));
    }
    @Override
    public Node visitBlockitems(PHIParser.BlockitemsContext ctxt) {
        //Just passes right through, but remove extra parens if there are any
        Node result =  visit(ctxt.getRuleContext(ParserRuleContext.class, 0));
        if (result.children.size() == 1) {
            return result.children.get(0);
        }
        return result;
    }
    @Override
    //TODO: better documentation, error handling
    public Node visitBlockapp(PHIParser.BlockappContext ctxt) {
        Node id = visit(ctxt.dotapp());

        Node result = new Node("Expr").add(id);

        if (ctxt.listitems() != null) {
            Node header = visit(ctxt.listitems());
            //Remove extraneous parens, if there are any
            if (header.children.size() == 1) {
                header = header.children.get(0);
            }
            result = result.add(header);
        }

        Node body = visit(ctxt.blocklines());

        for (Node child : body.children) {
            result.add(child);
        }

        return result;
    }
    @Override
    public Node visitListitems(PHIParser.ListitemsContext ctxt) {
        return topLevelify(ctxt.getRuleContexts(PHIParser.ListitemContext.class), "Expr");
    }
    @Override
    public Node visitListitem(PHIParser.ListitemContext ctxt) {
        //Just passthrough
        return visit(ctxt.getRuleContext(ParserRuleContext.class, 0));
    }
    @Override
    //TODO: Document this, expand error handling
    public Node visitDotapp(PHIParser.DotappContext ctxt) {
        Node in = topLevelify(ctxt.getRuleContexts(PHIParser.DotitemContext.class), "DotApp");
        if (in.children.size() == 1) {
            return in.children.get(0);
        }
        Node result = new Node("Expr").add(in.children.get(1)).add(in.children.get(0));
        for (int i = 2; i < in.children.size(); i++) {
            result = new Node("Expr").add(in.children.get(i)).add(result);
        }
        return result;
    }
    @Override
    public Node visitDotitem(PHIParser.DotitemContext ctxt) {
        return visit(ctxt.getRuleContext(ParserRuleContext.class, 0));
    }
    @Override
    public Node visitItem(PHIParser.ItemContext ctxt) {
        return new Node(ctxt.getText());
    }
    @Override
    //TODO: Document and expand error handling
    public Node visitFunapp(PHIParser.FunappContext ctxt) {
        //TODO: actually implement this!
        Node id = new Node(ctxt.ID().getText());
        Node funitems = visit(ctxt.funitems());
        Node result = new Node("Expr").add(id);
        for (Node arg : funitems.children) {
            result.add(arg);
        }
        return result;
    }
    @Override
    //TODO: Actually implement this!
    public Node visitFunitems(PHIParser.FunitemsContext ctxt) {
        return topLevelify(ctxt.getRuleContexts(PHIParser.ApaddeditemsContext.class), "Expr");
    }
    @Override
    public Node visitApaddeditems(PHIParser.ApaddeditemsContext ctxt) {
        return visit(ctxt.getRuleContext(PHIParser.AlistitemsContext.class, 0));
    }
    @Override
    public Node visitAlistitems(PHIParser.AlistitemsContext ctxt) {
        return topLevelify(ctxt.getRuleContexts(PHIParser.ListitemContext.class), "Expr");
    }
    @Override
    public Node visitSexpr(PHIParser.SexprContext ctxt) {
        return visit(ctxt.getRuleContext(PHIParser.ApaddeditemsContext.class, 0));
    }
    //TODO: elim in some way
    @Override
    public Node visitAspace(PHIParser.AspaceContext ctxt) {
        return null;
    }
    @Override
    public Node visitOptspace(PHIParser.OptspaceContext ctxt) {
        return null;
    }
}
