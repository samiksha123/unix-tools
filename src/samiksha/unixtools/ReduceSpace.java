package samiksha.unixtools;

public class ReduceSpace {
    public String reduce(String input) {
        input = input.replaceAll("\\s+", " ");
        return input;
    }
}



