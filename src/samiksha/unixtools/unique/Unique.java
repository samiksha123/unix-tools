package samiksha.unixtools.unique;

import samiksha.unixtools.readfile.ReadFile;

public class Unique extends ReadFile {
    public void  uniqLine(String content){
        String array_content[],lines = "";
        array_content=content.split("\n");
        for (int count = 1; count < array_content.length; count++) {
            if(!array_content[count-1].equals(array_content[count])){
                lines += array_content[count]+ "\n";
            }
        }
        System.out.println(lines);
    }
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String input = read.readFile(filename);
        Unique u = new Unique();
        u.uniqLine(input);
    }
}











