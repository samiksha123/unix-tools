package samiksha.unixtools.sort;

import samiksha.unixtools.readfile.ReadFile;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String input = read.readFile(filename);
        Sort s = new Sort();
        s.defaultSort(input);
    }
    private void defaultSort(String input) {
        String content[];
        content = input.split("\n");
        Arrays.sort(content);
        for (int i = 0; i < content.length; i++) {
            System.out.println(content[i]);
        }
    }
}
