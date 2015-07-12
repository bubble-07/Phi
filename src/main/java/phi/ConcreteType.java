package phi;

public abstract class ConcreteType extends TypeExpression {
    public abstract boolean subtypes(ConcreteType other);
    public boolean typeEquals(ConcreteType other) {
        return this.subtypes(other) && other.subtypes(this);
    }
    public boolean strictSubtypes(ConcreteType other) {
        return this.subtypes(other) && !other.subtypes(this);
    }
    public abstract ConcreteType intersect(ConcreteType other);
    public ConcreteType union(ConcreteType other) {
        return Common.OptionType(this, other);
    }
}
