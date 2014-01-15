package client;

import samiksha.unixtools.Head;
import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class HeadClient {
    public static void main(String[] args) throws IOException {
        int noOfLines;
        String filename = args[0], value = "10";
        String result;
        Head head = new Head();
        ReadFile read = new ReadFile();
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) value = args[i].substring(1);
            else filename = args[i];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        result = head.printLines(input, noOfLines);
        System.out.println(result);
    }
}
