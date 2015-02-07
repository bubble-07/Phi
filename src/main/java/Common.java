package phi;
import phi.*;

public class Common {
    //Given a node representing an identifier, get its name
    public static String getIdentifier(Node in) {
        return in.children.get(0).label;
    }
}
