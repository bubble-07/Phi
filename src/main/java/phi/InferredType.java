package phi;
//Represents a type to be inferred (like a parameter)

public class InferredType extends TypeExpression {
    Parameter param;
    TypeApply type;
    public InferredType(Parameter param) {
        this.param = param;
    }
}
