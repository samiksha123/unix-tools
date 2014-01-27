package client;

import samiksha.unixtools.Head;
import samiksha.unixtools.readfile.ReadFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HeadClient {
    public static void main(String[] args) throws IOException {
        int noOfLines;
        ReadFile read = new ReadFile();
        String filename = args[0];
        Head head = new Head();

        try{
            FileReader conFile = new FileReader("config.properties");
            Properties pr = new Properties();
            pr.load(conFile);
            String value = pr.getProperty("headDefaultLines");
            for (int i = 0; i < args.length; i++) {
                if (args[i].startsWith("-")) value = args[i].substring(1);
                else filename = args[i];
            }
            noOfLines = Integer.parseInt(value);
            System.out.println(noOfLines);
        }catch(Exception e){
            noOfLines = 10;
        }

        String input = read.readFile(filename);
        String result = head.printLines(input, noOfLines);
        System.out.println(result);
    }
}
