package client;

import samiksha.unixtools.readfile.ReadFile;
import samiksha.unixtools.Tail;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TailClient {
    public static void main(String[] args) throws IOException {
        int noOfLines;
        String res, value;
        String filename = args[0];
        Tail tail = new Tail();
        ReadFile read = new ReadFile();
        try {
            FileReader conFile = new FileReader("config.properties");
            Properties pr = new Properties();
            pr.load(conFile);
            value = pr.getProperty("tailDefaultLines");
            for (int i = 0; i < args.length; i++) {
                if (args[i].startsWith("-")) value = args[i].substring(1);
                else filename = args[i];
            }
            noOfLines = Integer.parseInt(value);
        } catch (Exception e) {
            noOfLines = 10;
        }
        String input = read.readFile(filename);
        res = tail.printLines(input, noOfLines);
        System.out.println(res);
    }
}
