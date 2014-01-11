package samiksha.unixtools.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public String readFile(String file){
        String sCurrentLine,text = "";
        try {
            BufferedReader br;
            br = new BufferedReader(new FileReader(file));
            while ((sCurrentLine = br.readLine()) != null) {
                text += sCurrentLine + "\n";
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return text;
    }
}

