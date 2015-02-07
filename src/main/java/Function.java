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

    //Just creates an empty function, for the sake of permanent reference
    public Function() {
    }

    //Initialize a function from a definition in a Node
    public void loadFromDef(Node in, Context ctxt) {
        env = new Environment(ctxt.env);
        parentContext = ctxt;
        Node paramAndNamePart = in.children.get(1);
        Node exprPart = in.children.get(2);
        loadParams(paramAndNamePart);
        loadName(paramAndNamePart);
        Context bodyCtxt = new Context(ctxt.namespace, env);
        body = Expression.loadExpression(exprPart, bodyCtxt);
    }

    //Given the parameter and name node, get the name of the function
    public static String getNameFromDef(Node in) {
        Node paramAndNameNode = in.children.get(1);
        Node nameNode = paramAndNameNode.children.get(0);
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
    //TODO: Load stuff into the environment, too
    private void loadParams(Node in) {
        for (int i = 1; i < in.children.size(); i++) {
            Node paramNode = in.children.get(i);
            if (paramNode.children.size() > 1) {
                //Must have a type declaration with it
                String name = Common.getIdentifier(paramNode.children.get(1));
                String type = Common.getIdentifier(paramNode.children.get(0));
                params.add(new Parameter(name, type, env));
                //TODO: expand with type information
                env.add(name, null);
            }
            else {
                //Must be just a name;
                String name = Common.getIdentifier(paramNode);
                params.add(new Parameter(name, env));
                env.add(name, null);
            }
        }
    }
    public String toString() {
        if (name != null) {
            return name;
        }
        return "builtin"; //TODO: Remove me!
    }
    //TODO: also print out arguments
    public String bodyToString() {
        if (body != null) {
            return body.toString();
        }
        return "body empty!"; //TODO: better error handling
    }
}
