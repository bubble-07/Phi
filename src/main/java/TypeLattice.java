package phi;
import phi.*;
import java.util.*;

//Represents a list of type mappings for a given type
public class TypeLattice {
    public TypeLattice(ArrayList<TypeMap> subtypes) {
        this.subtypes = subtypes;
    }
    ArrayList<TypeMap> subtypes = new ArrayList();
    //Returns all of the immediate subtypes of the input type through the lattice
    //TODO: implement this!
    ArrayList<TypeExpression> getImmediateSubtypes(TypeExpression in) {
        ArrayList<TypeExpression> result = new ArrayList();
        for (TypeMap subtype : subtypes) {
            result.add(subtype.apply(in));
        }
        return result;
    }
}
