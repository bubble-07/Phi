package phi;
import phi.*;
import java.util.*;

public class Function extends Expression {
    Context parentContext = null;
    String name = null;
    ArrayList<Parameter> params = new ArrayList(); 
    Environment env = new Environment();
    Expression body = null;
    Type retType = null;

    public Function(String name, ArrayList<Parameter> params, Expression body, Context parent) {
        this.name = name;
        this.params = params;
        this.body = body;
        parentContext = parent;
    }
    //Initialize a function from a definition in a Node
    public Function(Node in, Context ctxt) {
        parentContext = ctxt;
        Node paramAndNamePart = in.children.get(1);
        Node exprPart = in.children.get(2);
        loadParams(paramAndNamePart);
        loadName(paramAndNamePart);
        body = Expression.loadExpression(exprPart, ctxt);
    }

    //Given the parameter and name node, get the name of the function
    public static String getNameFromDef(Node in) {
        Node nameNode = in.children.get(0);
        if (nameNode.children.size() > 1) {
            return Common.getIdentifier(nameNode.children.get(1));
        }
        //Otherwise, type was not specified
        return Common.getIdentifier(nameNode);
    }

    //Loads the name of the function and its return type
    private void loadName(Node in) {
        name = getNameFromDef(in);
        Node nameNode = in.children.get(0);
        if (nameNode.children.size() > 1) {
            //Must have specified a return type
            String type = Common.getIdentifier(nameNode.children.get(0));
            //TODO: better associate with types
            retType = new Type(type);
        }
    }
    //Loads parameters from the parameter part of the expression
    private void loadParams(Node in) {
        for (int i = 1; i < in.children.size(); i++) {
            Node paramNode = in.children.get(i);
            if (paramNode.children.size() > 1) {
                //Must have a type declaration with it
                String name = Common.getIdentifier(paramNode.children.get(1));
                String type = Common.getIdentifier(paramNode.children.get(0));
                params.add(new Parameter(name, type, env));
            }
            else {
                //Must be just a name;
                //TODO: extend environment, too
                params.add(new Parameter(Common.getIdentifier(paramNode), env));
            }
        }
    }
    public String toString() {
        return name;
    }
    public String bodyToString() {
        return body.toString();
    }
}
