package phi;
import java.util.*;
import phi.*;

public class Environment {
    HashMap<String, Expression> context = new HashMap();
    Environment parent = null;

    public Environment() {
    }

    public Environment(HashMap<String, Expression> ctxt) {
        context = ctxt;
    }

    public Environment(HashMap<String, Expression> ctxt, Environment parent) {
        context = ctxt;
        this.parent = parent;
    }
    
    public Expression get(String in) {
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
}
