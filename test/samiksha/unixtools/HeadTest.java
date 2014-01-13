package samiksha.unixtools;

import org.junit.Test;
import samiksha.unixtools.head.Head;

import static junit.framework.Assert.assertEquals;

/**
 * Created by samiksha on 1/13/14.
 */
public class HeadTest {
    @Test
    public void testPrintLines() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali\npallavi\nprajakta";
        String expected = "samiksha\nkavita\nmanali\n";
        Head head = new Head();
        String actual = head.printLines(input,3);
        assertEquals(expected, actual);
    }
}
