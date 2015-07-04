package phi;
import java.util.*;

public class Node {
    //For now, just contain a string as the name
    public String label = "";
    public ArrayList<Node> children = new ArrayList<Node>();
    public Node(String label) {
        this.label = label;
    }
    public Node add(Node child) {
        this.children.add(child);
        return this;
    }
    public Node addToBegin(Node child) {
        this.children.add(0, child);
        return this;
    }

    //Helper method to convert to the serialization format
    private String serializeRecursive(String in) {
        in += children.size() + ":" + label;

        in += "\n";

        for (int i=0; i < children.size(); i++) {
            if (children.get(i) != null) {
                in = children.get(i).serializeRecursive(in);
            }
        }
        return in;
    }
    
    public String toString() {
        String result = serializeRecursive("");
        if (result.length() == 0) {
            return "";
        }
        //Lop off trailing newline
        return result.substring(0, result.length() - 1);
    }
    
    //Define equality on Nodes for convenience in testing
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return this.equals((Node)obj);
        }
        return false;
    }

    public boolean equals(Node other) {
        if (!this.label.equals(other.label)) {
            if (!((this.label.equals("Expr") && other.label.equals("ReorderableExpr")) ||
                this.label.equals("ReorderableExpr") && other.label.equals("Expr"))) {
                return false;
            }
        }
        if (other.children.size() != this.children.size()) {
            return false;
        }
        for (int i=0; i < this.children.size(); i++) {
            if (!this.children.get(i).equals(other.children.get(i))) {
                return false;
            }
        }
        return true;
    }
}
