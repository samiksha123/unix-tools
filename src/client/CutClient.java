package client;

import samiksha.unixtools.Cut;
import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class CutClient {
    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        String delimiter = " ", input = "";
        int field = 0;
        Cut cutObj = new Cut();
        for (int i = 0; i < args.length; i++) {
            if (args[i].startsWith("-d")) delimiter = args[i].substring(2);
            if (args[i].startsWith("-f")) field = Integer.parseInt(args[i].substring(2));
            if (args[i].endsWith(".txt")) input = read.readFile(args[i]);
        }
        System.out.println(cutObj.cut(field, input, delimiter));
    }
}
