package client;

import samiksha.unixtools.readfile.ReadFile;
import samiksha.unixtools.Unique;

public class UniqueClient{
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String res;
        String input = read.readFile(filename);
        Unique u = new Unique();
        res = u.uniqueLine(input);
        System.out.println(res);
    }
}
