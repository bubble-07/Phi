package phi;
import java.util.*;

public class Environment {
    HashMap<String, TypeExpression> context = new HashMap<String, TypeExpression>();
    Environment parent = null;

    public Environment() {
    }

    public Environment(Environment parent) {
        this.parent = parent;
    }

    public void add(String name, TypeExpression expr) {
        this.context.put(name, expr);
    }

    public Environment(HashMap<String, TypeExpression> ctxt, Environment parent) {
        context = ctxt;
        this.parent = parent;
    }

    //Returns true if there is a mapping for something
    public boolean has(String in) {
        if (context.containsKey(in)) {
            return true;
        }
        if (parent != null) {
            return parent.has(in);
        }
        return false;
    }
    
    public TypeExpression get(String in) {
        if (context.containsKey(in)) {
            return context.get(in);
        }
        //Otherwise, call the method on the parent
        if (parent != null) {
            return parent.get(in);
        }
        //TODO: throw an exception!
        return null;
    }
    public String toString() {
        return context.toString();        
    }
}
