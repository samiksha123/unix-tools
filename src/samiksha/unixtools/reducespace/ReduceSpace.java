package samiksha.unixtools.reducespace;

import samiksha.unixtools.readfile.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReduceSpace {
    String reduce(String input) {
        input = input.replaceAll("\\s+", " ");
        return input;
    }

    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String content;
        String filename = args[0];
        String input = read.readFile(filename);
        ReduceSpace rs = new ReduceSpace();
        content = rs.reduce(input);
        try{
            File file = new File(filename);
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     }
}



