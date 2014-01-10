package samiksha.unixtools.tail;

import samiksha.unixtools.readfile.ReadFile;

public class Tail extends ReadFile {

    public void printLines(String str,int value){
        String t[];
        t = str.split("\n");
        System.out.println(t);
        int noOfLines = t.length - value;
        for(int counter=noOfLines;counter < t.length;counter++) {
          System.out.println(t[counter]);
        }
    }
    public static void main(String[] args) {
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

