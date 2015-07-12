package phi;

public class FunctionType extends ConcreteType {
    public TypeExpression input;
    public TypeExpression output;
    
    public FunctionType(TypeExpression input, TypeExpression output) {
        this.input = input;
        this.output = output;
    }

    @Override
    public ConcreteType upperBound() {
        return new FunctionType(input.upperBound(), output.upperBound());
    }

    //TODO: Handle edge cases where declare subtype of function
    @Override
    public boolean subtypes(ConcreteType other) {
       if (!(other instanceof FunctionType)) {
           if (other instanceof TypeApply) {
               if (((TypeApply) other).constructor.equals(Common.Any)) {
                   return true;
               }
            }
           return false;
       }
       FunctionType f = (FunctionType) other;
       //Return type must be more specific, arg type must be more general
       return this.output.upperBound().subtypes(f.output.upperBound()) &&
              f.input.upperBound().subtypes(this.input.upperBound());
    }

    @Override
    public ConcreteType intersect(ConcreteType o) {
        if (o instanceof FunctionType) {
            FunctionType other = (FunctionType) o;
            ConcreteType newInput = other.input.upperBound().intersect(this.input.upperBound());
            ConcreteType newOutput = other.output.upperBound().union(this.output.upperBound());
            return new FunctionType(newInput, newOutput);
        }
        return new BottomType();
    }
}
