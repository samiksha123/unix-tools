package samiksha.unixtools;

import org.junit.Test;
import samiksha.unixtools.cut.Cut;

import static junit.framework.Assert.assertEquals;

public class CutTest extends Cut {
    @Test
    public void testCutCount() throws Exception {
        String input = "samiksha ande\nkavita jadhav\nmanali thorat\nshital mane";
        String expected = "ande\njadhav\nthorat\nmane\n";
        Cut cut = new Cut();
        String actual = cut.cutCount(2,input," ");
        assertEquals(expected, actual);
    }
}
