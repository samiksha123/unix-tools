package samiksha.unixtools.head;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Head extends ReadFile {

    public String printLines(String str,int noOfLines){
        String result = "";
        String[] lines = str.split("\n");
        for(int counter=0;counter < noOfLines;counter++) {
            result += lines[counter]+"\n";
        }
        return result;
    }

    public static void main(String[] args)throws IOException {
        int noOfLines;
        String filename = args[0],value = "10";
        String result;
        Head head = new Head();
        ReadFile read = new ReadFile();
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        result = head.printLines(input,noOfLines);
        System.out.println(result);

    }
}