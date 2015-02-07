package phi;
import phi.*;
import java.util.*;

public class Apply extends Expression {
    Function f = null;
    ArrayList<Expression> args = new ArrayList();
    public Apply(Function f, ArrayList<Expression> args) {
        this.f = f;
        this.args = args;
    }
    public String toString() {
        return "(" + f.name + " " + args.toString() + ")";
    }
}
