package client;

import samiksha.unixtools.readfile.ReadFile;
import samiksha.unixtools.Tail;

import java.io.IOException;

public class TailClient {
    public static void main(String[] args) throws IOException {
        int noOfLines;
        String res;
        String filename = args[0], value = "10";
        Tail tail = new Tail();
        ReadFile read = new ReadFile();
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-")) value = args[i].substring(1);
            else filename = args[i];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        res = tail.printLines(input, noOfLines);
        System.out.println(res);
    }
}
