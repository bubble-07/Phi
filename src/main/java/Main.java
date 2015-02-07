package phi;

import phi.*;
import java.io.*;
import java.nio.file.*;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

    public static String fileToString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public static void main(String[] argv) throws Exception {
        System.out.println("File to be loaded from is first arg");
        System.out.println(argv[0]);
        Node AST = parse(fileToString(argv[0]));
        System.out.println(AST);
        Namespace defs = new Namespace(AST);
        System.out.println(defs.toString());
    }
    public static Node parse(String in) throws Exception {
        //TODO: add error handling!
        ANTLRInputStream inputStream = new ANTLRInputStream(in);
        PHILexer lexer = new PHILexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PHIParser parser = new PHIParser(tokens);
        ParseTree tree = parser.start();
        PhiParseVisitor parseVisitor = new PhiParseVisitor();
        return parseVisitor.visit(tree);
    }
}

