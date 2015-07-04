package phi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TypeApply extends TypeExpression {
    final Type constructor;
    ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
    public TypeApply(Type constructor) {
        this.constructor = constructor;
    }
    public TypeApply(Type constructor, ArrayList<TypeExpression> args) {
        this.constructor = constructor;
        this.args = args;
    }
    public TypeApply(Type constructor, TypeExpression... args) {
        this(constructor, new ArrayList<TypeExpression>(Arrays.asList(args)));
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

    private static class FlaggedNode {
        public enum Flag {
            LEFT,
            RIGHT
        }
        final TypeApply val;
        final Flag flag;
        FlaggedNode(TypeApply val, Flag flag) {
            this.val = val;
            this.flag = flag;
        }
    }

    private static ArrayList<TypeApply> coerce(ArrayList<TypeExpression> in) {
        return (ArrayList<TypeApply>) ((ArrayList<?>) in);
    }

    public static TypeExpression intersect(TypeApply a, TypeApply b) {
        ArrayList<TypeApply> aList = new ArrayList<TypeApply>();
        aList.add(a);

        ArrayList<TypeApply> bList = new ArrayList<TypeApply>();
        bList.add(b);
        return intersect(aList, bList);
    }

    //Note: This will need to use the either type to intersect them
    //The idea is to search breadth-first, and only add upon the first time
    public static TypeExpression intersect(ArrayList<TypeApply> aList, ArrayList<TypeApply> bList) {

        ArrayList<TypeExpression> result = new ArrayList<TypeExpression>();
        Queue<FlaggedNode> Q = new LinkedList<FlaggedNode>();
        HashMap<Type, FlaggedNode.Flag> loc = new HashMap<Type, FlaggedNode.Flag>();
        HashMap<Type, TypeApply> primary = new HashMap<Type, TypeApply>();
        HashMap<Type, TypeApply> secondary = new HashMap<Type, TypeApply>();

        for (TypeApply a : aList) {
            Q.add(new FlaggedNode(a, FlaggedNode.Flag.LEFT));
        }
        for (TypeApply b : bList) {
            Q.add(new FlaggedNode(b, FlaggedNode.Flag.RIGHT));
        }

        //While there are things in the queue
        while (Q.peek() != null) {
            FlaggedNode current = Q.remove();
            if (loc.containsKey(current.val.constructor)) {
                //If we've seen it before
                FlaggedNode.Flag otherFlag = loc.get(current.val.constructor);
                if (current.flag != otherFlag) {
                    //Great, we have something in the intersection that's not in the primary index
                    updateIndex(secondary, current);
                }
                else {
                    //Otherwise, we are refining information on the primary index
                    updateIndex(primary, current);
                }
            }
            else {
                //Must not have seen it before. Log it
                loc.put(current.val.constructor, current.flag);
                updateIndex(primary, current);
                addAllSubtypes(Q, current); 
            }
        }
        //Iterate through the secondary index and intersect with the primary
        for (Type key : secondary.keySet()) {
            result.add(argIntersect(primary.get(key), secondary.get(key)));
        }
        return Common.OptionType(result);
    }

    //For concrete types, intersect the arguments. For virtual types,
    //this will instead perform an intersect on all subtypes
    private static TypeExpression argIntersect(TypeApply a, TypeApply b) {

        if (a.constructor.isVirtual) {
            //TODO: Add equality check first, for niceness
            ////SHHH, everything will be fine...
            return intersect(coerce(a.getImmediateSubtypes()), coerce(b.getImmediateSubtypes()));
        }

        ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
        for (int i = 0; i < a.args.size(); i++) {
            TypeApply aArg = (TypeApply) a.args.get(i);
            TypeApply bArg = (TypeApply) b.args.get(i);
            args.add(intersect(aArg, bArg));
        }
        return new TypeApply(a.constructor, args);
    }

    //Union each of the arguments of the two typeapplys
    private static TypeApply argUnion(TypeApply a, TypeApply b) {
        ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
        for (int i = 0; i < a.args.size(); i++) {
            args.add(Common.OptionType(a.args.get(i), b.args.get(i)));
        }
        return new TypeApply(a.constructor, args);
    }

    //Updates current knowledge of the use of a type constructor
    private static void updateIndex(HashMap<Type, TypeApply> index, FlaggedNode current) {
        if (index.containsKey(current.val.constructor)) {
            //Need to update the information
            TypeApply prior = index.get(current.val.constructor); 
            index.put(current.val.constructor, argUnion(prior, current.val));
        }
        else {
            //Otherwise, should just add it anew
            index.put(current.val.constructor, current.val);
        }
    }

    private static void addAllSubtypes(Queue<FlaggedNode> Q, FlaggedNode current) {
        //Then, add all of its children to the queue
        ArrayList<TypeExpression> immediateSubtypes = current.val.getImmediateSubtypes();
        for (TypeExpression subExpr : immediateSubtypes) {
            TypeApply sub = (TypeApply) subExpr;
            Q.add(new FlaggedNode(sub, current.flag));
        }
    }

    public ArrayList<TypeExpression> getImmediateSubtypes() {
        return this.constructor.lattice.getImmediateSubtypes(this);
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

    public int hashCode() {
        int result = constructor.hashCode();
        for (TypeExpression arg : args) {
            TypeApply argApply = (TypeApply) arg;
            result += argApply.hashCode();
        }
        return result;
    }

    public String toString() {
        return constructor.toString() + args.toString();
    }
}
