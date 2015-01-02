package phitest;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import phi.*;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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

