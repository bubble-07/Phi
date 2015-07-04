package phi;

public class StringConst extends Constant {
    String val = null;
    public StringConst(Node in) {
        this(in.children.get(0).label);
    }
    public StringConst(String in) {
        val = in;
    }
    public String toString() {
        return val.toString();
    }
}
