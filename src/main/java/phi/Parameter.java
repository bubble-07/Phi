package phi;
public class Parameter extends Expression {
    Environment env = null;
    String name = null;
    Parameter(String name, String type, Environment env) {
        this.name = name;
        this.env = env;
    }
    Parameter(String name, Environment env) {
        this.name = name;
        this.env = env;
    }
    public String toString() {
        return name;
    }
}
