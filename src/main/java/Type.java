package phi;
import phi.*;
import java.util.*;

//TODO: implement .equals method
public class Type {
    String name = null;
    TypeLattice lattice = new TypeLattice(new ArrayList());
    public Type(String in) {
        name = in;
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
    public boolean equals(Type other) {
        //TODO: Expand definition of equality
        return this.name.equals(other.name);
    }
    public int hashCode() {
        return this.name.hashCode();
    }
}
