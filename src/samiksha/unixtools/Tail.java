package samiksha.unixtools;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

public class Tail extends ReadFile {

    public String printLines(String str, int value) {
        String lines[];
        lines = str.split("\n");
        String result = "";
        int noOfLines = 0;
        if (lines.length > value)
            noOfLines = lines.length - value;
        for (; noOfLines < lines.length ; noOfLines++)
            result += lines[noOfLines]+"\n";
        return result;
    }
}
