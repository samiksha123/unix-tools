package samiksha.unixtools;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class TailTest extends Tail {
    @Test
    public void testPrintLines() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali\npallavi\nprajakta";
        String expected = "sayali\npallavi\nprajakta\n";
        Tail tail = new Tail();
        String actual = tail.printLines(input,3);
        assertEquals(expected, actual);
    }
}

