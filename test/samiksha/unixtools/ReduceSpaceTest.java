package samiksha.unixtools;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReduceSpaceTest extends ReduceSpace {
    @Test
    public void testReduce() throws Exception {
        String input = "samiksha   ande\nkavita   jadhav\nmanali  thorat  \nshital    mane";
        String expected = "samiksha ande kavita jadhav manali thorat shital mane";
        ReduceSpace rs = new ReduceSpace();
        String actual = rs.reduce(input);
        assertEquals(expected, actual);
    }
}
