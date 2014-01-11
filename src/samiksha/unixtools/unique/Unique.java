package samiksha.unixtools.unique;

import samiksha.unixtools.readfile.ReadFile;

public class Unique extends ReadFile {
    public void  uniqueLine(String content){
        String file_content[],lines = "";
        file_content=content.split("\n");
        for (int count = 1; count < file_content.length; count++) {
            if(!file_content[count-1].equals(file_content[count])){
                lines += file_content[count]+ "\n";
            }
        }
        System.out.println(lines);
    }
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String input = read.readFile(filename);
        Unique u = new Unique();
        u.uniqueLine(input);
    }
}











