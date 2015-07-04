package phi;

class BottomType extends TypeExpression {
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
