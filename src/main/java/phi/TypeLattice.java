package phi;
import java.util.*;

//Represents a list of type mappings for a given type
public class TypeLattice {
    public TypeLattice(ArrayList<TypeMap> subtypes) {
        this.subtypes = subtypes;
    }

    public void addSubtype(TypeApply pattern, TypeExpression sub) {
        this.subtypes.add(new TypeMap(pattern, sub));
    }

    ArrayList<TypeMap> subtypes = new ArrayList<TypeMap>();
    //Returns all of the immediate subtypes of the input type through the lattice
    ArrayList<TypeExpression> getImmediateSubtypes(TypeExpression in) {
        ArrayList<TypeExpression> result = new ArrayList<TypeExpression>();
        for (TypeMap subtype : subtypes) {
            result.add(subtype.apply(in));
        }
        return result;
    }
}
