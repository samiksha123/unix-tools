package samiksha.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SortTest extends Sort {
    @Test
    public void testDefaultSort() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali";
        String expected[] = {"kavita","manali","samiksha","sayali","shital","tanbir"};
        Sort sort = new Sort();
        String actual[] = sort.defaultSort(input);
        for (int i = 0; i < actual.length ; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
    @Test
    public void testReverseSort() throws Exception {
        String input = "samiksha\nkavita\nmanali\nshital\ntanbir\nsayali";
        String expected[] = {"tanbir","shital","sayali","samiksha","manali","kavita"};
        Sort sort = new Sort();
        String actual[] = sort.reverseSort(input);
        for (int i = 0; i < actual.length ; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }
}
