package phi;
import phi.*;
import java.util.*;

//TODO: Expand this into more than a test
public class TypeInferer {
    Type Any;
    Type Float;
    Type Int;
    Type Number;

    public TypeInferer() {
        loadStdlibTypes();
        System.out.println(TypeApply.intersect(new TypeApply(Number), new TypeApply(Any)));
        System.out.println((new TypeApply(Any)).subtypes(new TypeApply(Number)));
    }
    public void loadStdlibTypes() {
        Any = new Type("Any");
        Number = new Type("Number");
        Float = new Type("Float");
        Int = new Type("Int");
        quickSubtype(Number, Any);
        quickSubtype(Float, Number);
        quickSubtype(Int, Number);
    }
    public void quickSubtype(Type sub, Type sup) {
        sup.lattice.subtypes.add(new TypeMap(new TypeApply(sup), new TypeApply(sub)));
    }
}
