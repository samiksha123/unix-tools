package samiksha.unixtools.tail;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Tail extends ReadFile {

    public void printLines(String str,int value){
        String lines[];
        lines = str.split("\n");
        int noOfLines = lines.length - value;
        for(int counter=noOfLines;counter < lines.length;counter++) {
          System.out.println(lines[counter]);
        }
    }
    public static void main(String[] args) throws IOException {
        int noOfLines;
        String filename = args[0],value = "10";
        Tail tail = new Tail();
        ReadFile read = new ReadFile();
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        tail.printLines(input, noOfLines);
        }
    }

