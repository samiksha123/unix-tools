package samiksha.unixtools.tail;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Tail extends ReadFile {

    public String printLines(String str,int value){
        String lines[];
        lines = str.split("\n");
        String result="";
        int noOfLines = lines.length - value;
        for(int counter=noOfLines;counter < lines.length;counter++) {
            result += lines[counter]+"\n";
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        int noOfLines;
        String res;
        String filename = args[0],value = "10";
        Tail tail = new Tail();
        ReadFile read = new ReadFile();
        if(args[0].startsWith("-")) {
            value = args[0].substring(1);
            filename = args[1];
        }
        noOfLines = Integer.parseInt(value);
        String input = read.readFile(filename);
        res = tail.printLines(input, noOfLines);
        System.out.println(res);
        }
    }

