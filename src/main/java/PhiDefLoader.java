package phi;
import phi.*;

import java.util.*;


public class PhiDefLoader {
    HashMap<String, Function> functable = new HashMap();
    HashMap<String, Type> typetable = new HashMap(); 
    
    public PhiDefLoader(Node in) {
        for (Node def : in.children) {
            loadTopDef(def);
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
        Function f = new Function(in);
        functable.put(f.name, f);
    }
    private void loadTypeDef(Node in) {
        Type t = new Type(in.label);
        typetable.put(t.name, t);
    }
    //TODO: implement loadSubDef
    public String toString() {
        String result = "Functions: \n";
        for (String funcname : functable.keySet()) {
           result = result + funcname + ":\n" + functable.get(funcname).toString() + "\n"; 
        }
        return result;
    }
}
