package samiksha.unixtools;

public class Unique {
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
}









