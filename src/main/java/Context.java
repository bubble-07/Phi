package phi;
import phi.*;
//Namespace, Environment pair

public class Context {
    Namespace namespace;
    Environment env;
    public Context(Namespace ns, Environment env) {
        this.namespace = ns;
        this.env = env;
    }
}
