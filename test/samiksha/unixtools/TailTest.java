package samiksha.unixtools;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TailTest {
    @Test
    public void testPrintLines() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali\npallavi\nprajakta";
        String expected = "sayali\npallavi\nprajakta\n";
        Tail tail = new Tail();

        String actual = tail.printLines(input,3);

        assertEquals(expected, actual);
    }
    @Test
    public void test_for_PrintLines() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali\npallavi\nprajakta\npallavi\nshweta";
        String expected = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali\npallavi\nprajakta\npallavi\nshweta\n";
        Tail tail = new Tail();

        String actual = tail.printLines(input,10);

        assertEquals(expected, actual);
    }
    @Test
    public void print_default_Lines_if_specified_noOfLines_are_not_present() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital";
        String expected = "samiksha\nkavita\nmanali\nshital\n";
        Tail tail = new Tail();

        String actual = tail.printLines(input,20);

        assertEquals(expected, actual);
    }
}

