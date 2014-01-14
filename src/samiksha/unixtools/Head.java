package samiksha.unixtools;

import samiksha.unixtools.readfile.ReadFile;

public class Head extends ReadFile {
    public String printLines(String str,int noOfLines){
        String result = "";
        String[] lines = str.split("\n");
        for(int counter=0;counter < noOfLines;counter++) {
            result += lines[counter]+"\n";
        }
        return result;
    }
}