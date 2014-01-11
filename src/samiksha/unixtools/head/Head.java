package samiksha.unixtools.head;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Head extends ReadFile {

    public void printLines(String str,int noOfLines){
        String lines[];
        lines = str.split("\n");
        for(int counter=1;counter < noOfLines;counter++) {
            System.out.println(lines[counter]);
        }
    }
    public static void main(String[] args)throws IOException {
        int noOfLines;
        String filename = args[0],value = "10";
        Head head = new Head();
        ReadFile read = new ReadFile();
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        head.printLines(input, noOfLines);
    }
}