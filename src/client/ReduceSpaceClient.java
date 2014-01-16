package client;

import samiksha.unixtools.readfile.ReadFile;
import samiksha.unixtools.ReduceSpace;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReduceSpaceClient {
    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        String input = read.readFile(args[0]);
        ReduceSpace rs = new ReduceSpace();
        String content = rs.reduce(input);
        try {
            FileWriter fw = new FileWriter(args[1]);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("extra spaces removed");
    }
}
