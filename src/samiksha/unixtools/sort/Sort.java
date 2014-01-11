package samiksha.unixtools.sort;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;
import java.util.Arrays;


public class Sort {
    private String[] defaultSort(String input) {
        String content[] = input.split("\n");
        Arrays.sort(content);
        return content;
    }

    public static void main(String[] args) throws IOException{
        ReadFile read = new ReadFile();
        String filename = args[0];
        String sortedData[], reverse[];
        String input = read.readFile(filename);
        Sort s = new Sort();
        sortedData = s.defaultSort(input);
        for (int i = 0; i < sortedData.length; i++) {
            System.out.println(sortedData[i]);
        }
    }
}


