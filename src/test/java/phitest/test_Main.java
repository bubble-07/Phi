package phitest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import phi.Main;
import phi.Node;

public class test_Main {

    @Test
    public void test_parse() throws Exception {
        for (int i = 1; i < 4; i++) {
            Node parseOne = Main.parse(Main.fileToString("tests/parse/" + i + "-in.phi"));
            Node parseTwo = Main.parse(Main.fileToString("tests/parse/" + i + "-equiv.phi"));
            assertEquals(parseTwo, parseOne);
        }
    }

    @Test
    public void test_hello() {
        assertEquals("hello", "hello");
    }

}

