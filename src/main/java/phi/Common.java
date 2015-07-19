package phi;
import java.util.*;

public class Common {
    //Given a node representing an identifier, get its name
    public static String getIdentifier(Node in) {
        return in.children.get(0).label;
    }
    static TypeExpression OptionType(ArrayList<TypeExpression> options) {
        if (options.size() == 0) {
            return new BottomType();
        }
        if (options.size() == 1) {
            return options.get(0);
        }
        TypeExpression result = options.get(0);
        for (int i = 1; i < options.size(); i++) {
            result = OptionType(result, options.get(i));
        }
        return result;
    }
    static TypeApply OptionType(TypeExpression a, TypeExpression b) {
        //First, if both are typeapplys, try to simplify
        if (a instanceof TypeApply && b instanceof TypeApply) {
            TypeApply aApply = (TypeApply)a;
            TypeApply bApply = (TypeApply)b;
            if (aApply.subtypes(bApply)) {
                return bApply;
            }
            if (bApply.subtypes(aApply)) {
                return aApply;
            }
        }

        ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
        args.add(a);
        args.add(b);
        return new TypeApply(Either, args);
    }
    static Type Either = initEither();
    private static Type initEither() {

        Type Either = new Type("Either", true);
        TypeParam a = new TypeParam("A");
        TypeParam b = new TypeParam("B");
        ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
        args.add(a);
        args.add(b);

        TypeApply EitherApply = new TypeApply(Either, a, b);
        Either.addSubtype(EitherApply, a);
        Either.addSubtype(EitherApply, b);
        return Either;
    }
    static Type Any = new Type("Any");

    public class TypingEnvironment {
        public Map<String, TypeParam> params = new HashMap<String, TypeParam>();
        public TypeParam newParam(String in) {
            //TODO: Add support for upper bounds!
            TypeParam result = new TypeParam(in);
            params.put(in, result);
            return result;
        }
        public TypeParam get(String in) {
            if (params.containsKey(in)) {
                return params.get(in);
            }
            return newParam(in);
        }
    }

    public TypeExpression parseType(Node in, TypingEnvironment env) {
        //TODO: Reordering a thing?
        if (in.label.equals("Expr") || in.label.equals("ReorderableExpr")) {
            //TODO: error handling!
            Type constructor = typetable.get(in.get(0).label);
            ArrayList<TypeExpression> args = new ArrayList<TypeExpression>();
            for (int i = 1; i < in.children.size(); i++) {
                args.add(parseType(in.get(i), env));
            }
            return new TypeApply(constructor, args);
        }
        else {
            if (typetable.containsKey(in.label)) {
                //Must be a unary type
                return new TypeApply(typetable.get(in.label));
            }
            else {
                //Must be a type variable
                return env.get(in.label);
            }
        }
    }
}
