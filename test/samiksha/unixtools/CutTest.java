package samiksha.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CutTest{
    @Test
    public void testCutCount() throws Exception {
        String input = "samiksha ande\nkavita jadhav\nmanali thorat\nshital mane";
        String expected = "ande\njadhav\nthorat\nmane\n";
        Cut c = new Cut();
        String actual = c.cut(2,input," ");
        assertEquals(expected, actual);
    }
    @Test
    public void test_for_CutCount() throws Exception {
        String input = "samiksha ande\nkavita jadhav\nmanali thorat\nshital mane";
        String expected = "samiksha\nkavita\nmanali\nshital\n";
        Cut c = new Cut();
        String actual = c.cut(1,input," ");
        assertEquals(expected, actual);
    }
}
