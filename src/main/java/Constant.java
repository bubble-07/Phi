package phi;
import phi.*;
public class Constant extends Expression {
    //TODO: Extend me!
    String val = null;
    public Constant(String in) {
        val = in;
    }
    public String toString() {
        return val;
    }
}
