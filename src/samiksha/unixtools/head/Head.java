package samiksha.unixtools.head;

import samiksha.unixtools.readfile.ReadFile;

public class Head extends ReadFile {

    public void printLines(String str,int value){
        String t[];
        t = str.split("\n");
        System.out.println(t);
        for(int counter=1;counter < value;counter++) {
            System.out.println(t[counter]);
        }
    }
    public static void main(String[] args) {
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