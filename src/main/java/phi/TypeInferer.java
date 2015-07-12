package phi;

//TODO: Expand this into more than a test
public class TypeInferer {
    Type Float;
    Type Int;
    Type Number;

    public TypeInferer(Namespace in) {
        loadStdlibTypes();
        System.out.println(TypeApply.intersect(new TypeApply(Number), new TypeApply(Common.Any)));
        System.out.println((new TypeApply(Common.Any)).subtypes(new TypeApply(Number)));
        System.out.println(TypeApply.intersect(Common.OptionType(new TypeApply(Number), new TypeApply(Int)),
                                               Common.OptionType(new TypeApply(Int), new TypeApply(Number))));
        for (Function f : in.functable.values()) {
            //inferFunction(f);
        }
    }


    public void loadStdlibTypes() {
        Number = new Type("Number");
        Float = new Type("Float");
        Int = new Type("Int");
        quickSubtype(Number, Common.Any);
        quickSubtype(Float, Number);
        quickSubtype(Int, Number);
        //TODO: Add subtyping for Either type
    }
    public void quickSubtype(Type sub, Type sup) {
        sup.lattice.subtypes.add(new TypeMap(new TypeApply(sup), new TypeApply(sub)));
    }
}
