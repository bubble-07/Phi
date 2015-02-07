package phi;
import phi.*;
public abstract class Expression {

    public static Expression loadExpression(Node in, Context ctxt) {
        //TODO: Handle lambdas and other fancy things
        switch (in.label) {
            case "ReorderableExpr":
                return loadExpression(reorderExpression(in, ctxt), ctxt);
            case "Expr":
                return new Apply(in, ctxt);
            case "ID":
                return ctxt.getExprFromName(in.children.get(0).label);
            //TODO: actually flesh out the types of constants n' stuff
            default:
                return new Constant(in.children.get(0).label);
        }
    }

    //Takes a reorderable apply node and reorders it
    public static Node reorderExpression(Node in, Context ctxt) {
        Node result = new Node("Expr");
        //i will hold the index of the found function
        int i = 0;
        for (i = 0; i < in.children.size(); i++) {
            if (in.children.get(i).label.equals("ID")) {
                //Might be a function
                String name = Common.getIdentifier(in.children.get(i));
                //TODO: Overhaul namespace function lookups (abstract it)
                if (ctxt.namespace.functable.containsKey(name)) {
                    //We found the first function!
                    result.add(in.children.get(i));
                    break;
                }
            }
        }
        //Now, fill the rest of the Node with the non-function-elements
        for (int j = 0; j < in.children.size(); j++) {
            //If it's not the function we found earlier
            if (i != j) {
                //add it
                result.add(in.children.get(j));
            }
        }
        return result;
    }

}
