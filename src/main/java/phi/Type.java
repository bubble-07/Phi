package phi;
import java.util.*;

//TODO: implement .equals method
public class Type {
    String name = null;
    TypeLattice lattice = new TypeLattice(new ArrayList<TypeMap>());
    final boolean isVirtual;
    public Type(String in, boolean isVirtual) {
        name = in;
        this.isVirtual = isVirtual;
    }
    public Type(String in) {
        this(in, false);
    }
    public String toString() {
        return name;
    }
    public boolean equals(Object other) {
        if (other instanceof Type) {
            return this.equals((Type) other);
        }
        return false;
    }
    public void addSubtype(TypeApply pattern, TypeExpression sub) {
        this.lattice.addSubtype(pattern, sub);
    }

    public boolean equals(Type other) {
        //TODO: Expand definition of equality
        return this.name.equals(other.name);
    }
    public int hashCode() {
        return this.name.hashCode();
    }
}
