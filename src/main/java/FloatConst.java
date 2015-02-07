package phi;
import phi.*;

public class FloatConst extends Constant {
    Float val = null;
    public FloatConst(Node in) {
        this(in.children.get(0).label);
    }
    public FloatConst(String in) {
        val = Float.parseFloat(in);
    }
    public String toString() {
        return val.toString();
    }
}
