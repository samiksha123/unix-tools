package samiksha.unixtools;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Tail extends ReadFile {

    public String printLines(String str, int value) {
        String lines[];
        lines = str.split("\n");
        String result = "";
        int noOfLines = lines.length - value;
        for (int counter = noOfLines; counter < lines.length; counter++) {
            result += lines[counter] + "\n";
        }
        return result;
    }

}

