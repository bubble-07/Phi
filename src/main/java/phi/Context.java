package phi;
//Namespace, Environment pair

public class Context {
    Namespace namespace = null;
    Environment env = null;
    public Context(Namespace ns, Environment env) {
        this.namespace = ns;
        this.env = env;
    }
    //Given an identifier, resolve it into some expression
    //which may be a parameter or a function
    public Expression getExprFromName(String in) {
        //First, try to determine if it is some kind of parameter
        if (this.env.has(in)) {
            //If it is, return it as a new parameter
            return new Parameter(in, this.env);
        }
        //Otherwise, must be a function instead
        return this.namespace.functable.get(in); 
    }
}
