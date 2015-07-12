package phi;

class BottomType extends ConcreteType {

    @Override
    public ConcreteType upperBound() {
        return this;
    }

    @Override
    public boolean subtypes(ConcreteType other) {
        return true;
    }

    @Override
    public ConcreteType intersect(ConcreteType other) {
        return this;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof BottomType) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return 1;
    }
}
