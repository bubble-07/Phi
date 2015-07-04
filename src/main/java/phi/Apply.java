package phi;
import java.util.*;

public class Apply extends Expression {
    Expression f = null;
    ArrayList<Expression> args = new ArrayList<Expression>();
    public Apply(Function f, ArrayList<Expression> args) {
        this.f = f;
        this.args = args;
    }
    //Construct an apply node.
    public Apply(Node in, Context ctxt) {
        this.f = Expression.loadExpression(in.children.get(0), ctxt);
        for (int i = 1; i < in.children.size(); i++) {
            args.add(Expression.loadExpression(in.children.get(i), ctxt));
        }
    }
    public String toString() {
        return "(" + f.toString() + " " + args.toString() + ")";
    }
}
