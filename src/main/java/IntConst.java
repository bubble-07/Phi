package phi;
import phi.*;

public class IntConst extends Constant {
    Integer val = null;
    public IntConst(Node in) {
        this(in.children.get(0).label);
    }
    public IntConst(String in) {
        val = Integer.parseInt(in);
    }
    public String toString() {
        return val.toString();
    }
}
