package phi;
import phi.*;
import java.util.*;

public class Common {
    //Given a node representing an identifier, get its name
    public static String getIdentifier(Node in) {
        return in.children.get(0).label;
    }
    static TypeApply OptionType(ArrayList<TypeExpression> options) {
        return new TypeApply(Either, options);
    }
    static Type Either = new Type("Either");
}
