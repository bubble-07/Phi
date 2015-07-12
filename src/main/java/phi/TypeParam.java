package phi;

public class TypeParam extends TypeExpression {
    ConcreteType upperbound;
    String name = null;
    public TypeParam(String in, TypeApply upperbound) {
        name = in;
        this.upperbound = upperbound;
    }
    public TypeParam(String in) {
        this(in, new TypeApply(Common.Any));
    }
    public TypeParam(TypeApply upperbound) {
        this(null, upperbound);
    }
    //Ensure that this type parameter falls under the given concrete type
    public void refine(ConcreteType in) {
        this.upperbound = this.upperbound.intersect(in);
    }
    public ConcreteType upperBound() {
        return this.upperbound;
    }
}
