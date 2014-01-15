package client;

import samiksha.unixtools.readfile.ReadFile;
import samiksha.unixtools.WC;

import java.io.IOException;

public class WcClient {
    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        String input = read.readFile(args[0]);
        WC obj = new WC();
        int line = obj.countLines(input);
        int words = obj.countWords(input);
        int chara = obj.countCharacters(input);
        System.out.print(line + " " + words + " " + chara);
    }
}

