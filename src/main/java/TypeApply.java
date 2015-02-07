package phi;
import phi.*;
import java.util.*;

public class TypeApply extends TypeExpression {
    boolean variable = false; //TODO: Expand with container variable if can.
    Type constructor = null;
    ArrayList<TypeExpression> args = new ArrayList();
    public TypeApply(Type constructor) {
        this.constructor = constructor;
    }
    public TypeApply(Type constructor, ArrayList<TypeExpression> args) {
        this.constructor = constructor;
        this.args = args;
    }

    public boolean subtypes(TypeExpression otherExpr) { 
        //Check if constructors are equal. If so, then must check args
        TypeApply other = (TypeApply) otherExpr;
        if (this.constructor.equals(other.constructor)) {
            for (int i = 0; i < args.size(); i++) {
                //TODO: Fix this typecasting thing
                TypeApply arg = (TypeApply) args.get(i);
                if (!arg.subtypes(other.args.get(i))) {
                    //If one of the arguments is not a subtype, fail
                    return false;
                }
            }
            //Otherwise, succeed
            return true;
        }
        //If not the same constructor, then must generate the other's immediate subtypes
        ArrayList<TypeExpression> immediateSubtypes = other.constructor.lattice.getImmediateSubtypes(other);
        for (TypeExpression sub : immediateSubtypes) {
            if (subtypes(sub)) {
                //Must subtype some subtype of the other
                return true;
            }
        }
        //Otherwise, it's no subtype of the other type
        return false;
    }

    //Note: This will need to use the either type to intersect them
    public static TypeApply intersect(TypeApply a, TypeApply b) {
        //Represents a mapping from types to the trees they were first
        //found in 0: a, 1: b
        HashMap<TypeApply, Boolean> found = new HashMap();
        found.put(a, false);
        //TODO: Check for collision
        found.put(b, true);
        return Common.OptionType(intersectRecursive(found, a, b, true));
    }
    //Recursive helper
    //TODO: fixme!
    //Note: If expandA is true, A will be expanded and compared against B. Else, the reverse is true
    //TODO: Switch to a queue
    private static ArrayList<TypeExpression> intersectRecursive(HashMap<TypeApply, Boolean> found, TypeApply a, TypeApply b, boolean expandA) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("");

        ArrayList<TypeExpression> result = new ArrayList();

        //Special case: a = b. Then terminate
        if (a.equals(b)) {
            result.add(a);
            found.put(a, true);
            return result;
        }

        ArrayList<TypeExpression> subtypes = null;
        if (expandA) {
            subtypes = a.constructor.lattice.getImmediateSubtypes(a);
        }
        else {
            subtypes = b.constructor.lattice.getImmediateSubtypes(b);
        }
        for (TypeExpression subExpr : subtypes) {
            //TODO: Better types!
            TypeApply sub = (TypeApply) subExpr;

            Boolean foundIn = found.get(sub);
            if (foundIn == null) {
                //If it was not found, explore the child
                if (expandA) {
                    found.put(sub, false);
                    result.addAll(intersectRecursive(found, sub, b, !expandA));
                }
                else {
                    found.put(sub, true);
                    result.addAll(intersectRecursive(found, a, sub, !expandA));
                }
            }
            //If we've already found the type in the other tree
            else if (foundIn.equals(expandA)) {
                //Add it to the result
                result.add(sub); 
            }
            //Otherwise, must've found it in our own tree
            else {
                //Don't do anything
            }
        }
        return result;
    }
    public boolean equals(Object other) {
        if (other instanceof TypeApply) {
            return this.equals((TypeApply) other);
        }
        //TODO: change this to respect type variables
        return false;
    }
    public boolean equals(TypeApply other) {
        //Ensure constructor equality
        if (!constructor.equals(other.constructor)) {
            return false;
        }
        if (args.size() != other.args.size()) {
            return false;
        }
        //Check to see if any of the arguments differ
        for (int i = 0; i < args.size(); i++) {
            TypeApply arg = (TypeApply) args.get(i);
            if (!arg.equals(other.args.get(i))) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return constructor.toString() + args.toString();
    }
}
