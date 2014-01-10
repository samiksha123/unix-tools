package samiksha.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WcOperationTest {
    @Test
    public void testCountLines() throws Exception {
        WcOperation w = new WcOperation();
        String str = "hello world";
        int expected = 2;

        int actual = w.countLines(str);

        assertEquals(actual,expected);

    }

    @Test
    public void testCountWords() throws Exception {
        WcOperation w = new WcOperation();
        String str = "hello world\n hi";
        int expected = 3;

        int actual = w.countWords(str);

        assertEquals(actual,expected);

    }

    @Test
    public void testCountCharacters() throws Exception {
        WcOperation w = new WcOperation();
        String str = "hello world";
        int expected = 12;

        int actual = w.countCharacters(str);

        assertEquals(actual,expected);

    }
}
