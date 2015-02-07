package phi;
import phi.*;

import java.util.*;


//TODO: allow to have parent namespaces
public class Namespace {
    HashMap<String, Function> functable = new HashMap();
    HashMap<String, Type> typetable = new HashMap(); 
    
    public Namespace(Node in) {
        //First, load in all of the names of the functions (so reordering can occur)
        for (Node def : in.children) {
            loadFuncName(def);
        }
        //TODO: REMOVE THIS
        loadStdLib();
        for (Node def : in.children) {
            loadTopDef(def);
        }
    }

    //TODO: REMOVE ME!
    public void loadStdLib() {
        functable.put("+int32", new Function());
    }

    public void loadFuncName(Node in) {
        if (in.children.get(0).label.equals("Def")) {
            //Just load the function table with an empty function
            functable.put(Function.getNameFromDef(in), new Function());
        }
    }
    //Discriminates between top level definition cases
    private void loadTopDef(Node in) {
        switch (in.children.get(0).label) {
            case "Def":
                loadFuncDef(in);
                return;
            case "Type":
                loadTypeDef(in);
                return;
            //TODO: ensure that all typing relations are SUBTYPES after parsing
            default: 
                //TODO: implement this!
                //loadSubDef(in);
                return;
        }
    }
    private void loadFuncDef(Node in) {
        Function f = functable.get(Function.getNameFromDef(in));
        f.loadFromDef(in, new Context(this, null));
    }
    private void loadTypeDef(Node in) {
        Type t = new Type(in.label);
        typetable.put(t.name, t);
    }

    //TODO: implement loadSubDef
    public String toString() {
        String result = "Functions: \n";
        for (String funcname : functable.keySet()) {
           result = result + funcname + ":\n" + functable.get(funcname).bodyToString() + "\n"; 
        }
        return result;
    }
}
