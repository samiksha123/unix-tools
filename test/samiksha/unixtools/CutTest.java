package samiksha.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest{
    @Test
    public void testCutCount() throws Exception {
        String input = "samiksha ande\nkavita jadhav\nmanali thorat\nshital mane";
        String expected = "ande\njadhav\nthorat\nmane\n";
        Cut cut = new Cut();
        String actual = cut.cutCount(2,input," ");
        assertEquals(expected, actual);
    }
}
