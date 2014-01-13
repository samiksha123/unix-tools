package samiksha.unixtools.unique;

import samiksha.unixtools.readfile.ReadFile;

public class Unique extends ReadFile {
    public String  uniqueLine(String content){
        String file_content[],lines = "";
        file_content=content.split("\n");
        for (int count = 0; count < file_content.length-1 ; count++) {
            if(!file_content[count].equals(file_content[count+1])){
                lines += file_content[count]+ "\n";
            }
        }
        return lines;
    }
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String res;
        String input = read.readFile(filename);
        Unique u = new Unique();
        res = u.uniqueLine(input);
        System.out.println(res);
    }
}











