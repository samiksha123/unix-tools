package samiksha.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WcOperationTest extends WC {
    @Test
    public void testCountLines() throws Exception {
        WC w = new WC();
        String str = "hello world";
        int expected = 1;

        int actual = w.countLines(str);

        assertEquals(actual,expected);
    }

    @Test
    public void testCountWords() throws Exception {
        WC w = new WC();
        String str = "hello world";
        int expected = 2;

        int actual = w.countWords(str);

        assertEquals(actual,expected);
    }

    @Test
    public void testCountCharacters() throws Exception {
        WC w = new WC();
        String str = "hello world";
        int expected = 11;

        int actual = w.countCharacters(str);

        assertEquals(actual,expected);
    }
}
