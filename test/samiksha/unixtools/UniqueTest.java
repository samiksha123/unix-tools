package samiksha.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UniqueTest extends Unique {
    @Test
    public void testUniqueLine() throws Exception {
        String input = "samiksha\nmanali\nmanali\nshital\nshital\ntanbir";
        String expected = "samiksha\nmanali\nshital\ntanbir";
        Unique unique = new Unique();
        String actual = unique.uniqueLine(input);
        assertEquals(expected, actual);
    }
}







