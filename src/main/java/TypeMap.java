package phi;
import phi.*;
import java.util.*;
//Represents a mapping from a supertype to a subtype
public class TypeMap {
    TypeExpression input = null;
    TypeExpression output = null;
    public TypeMap(TypeExpression in, TypeExpression out) {
        input = in;
        output = out;
    }
    //Pattern matches against the input and determines the output
    //Returns null if the pattern match failed
    public TypeExpression apply(TypeExpression recieved) {
        //Ready a dictionary for type parameters
        HashMap<TypeParam, TypeExpression> paramMap = new HashMap();
        //Match input against expected
        boolean match = matchRecursive(paramMap, input, recieved); 
        if (!match) {
            //Pattern match failed
            return null;
        }
        //Clone output and replace bound type parameters
        return instantiateRecursive(paramMap, output);
    }
    //Helper to perform the matching
    private boolean matchRecursive(HashMap<TypeParam, TypeExpression> mapping
                                                            , TypeExpression expected, TypeExpression recieved) {
        if (expected instanceof TypeParam) {
            //If we're dealing with a parameter, just go ahead
            mapping.put((TypeParam) expected, recieved);
            return true;
        }

        //Otherwise, must be a typeapply
        TypeApply pattern = (TypeApply) expected;
        //TODO: later revise to not use a cast!
        TypeApply in = (TypeApply) recieved;

        if (!pattern.constructor.equals(in.constructor)) {
            return false;
        }
        if (pattern.args.size() != in.args.size()) {
            return false;
        }
        //Otherwise, individually check the arguments
        for (int i = 0; i < pattern.args.size(); i++) {
            boolean success = matchRecursive(mapping, pattern.args.get(i), in.args.get(i));
            if (!success) {
                return false;
            }
        }
        return true;
    }
    //Instantiates the output part of the map with the given bindings
    private TypeExpression instantiateRecursive(HashMap<TypeParam, TypeExpression> mapping, TypeExpression output) {
        if (output instanceof TypeParam) {
            //we must do a replace
            return mapping.get((TypeParam) output);
        }
        //Otherwise, deal with the container
        TypeApply container = (TypeApply) output;

        ArrayList<TypeExpression> resultArgs = new ArrayList();
        //Go through the container arguments, copy, and instantiate
        for (TypeExpression arg : container.args) {
            resultArgs.add(instantiateRecursive(mapping, arg));
        }
        //Return instantiated typeapply as a result
        return new TypeApply(container.constructor, resultArgs);
    }
}
