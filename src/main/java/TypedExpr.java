package phi;
import java.util.*;
import phi.*;

//Typed expression. Used for defining types of parameters and their corresponding expressions
public class TypedExpr {
    Type type = null;
    Expression expr = null;
    public TypedExpr(Type t) {
        type = t;
    }
    public TypedExpr(Type t, Expression expr) {
        this.type = t;
        this.expr = expr;
    }
}
