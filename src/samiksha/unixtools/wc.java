package samiksha.unixtools;
import java.io.*;
class WC{
    public static void main(String[] args){
        ReadFile read = new ReadFile();
        String input = read.readFile(args[0]);
        wcOperation obj = new wcOperation();
        int line = obj.countLines(input);
        int words = obj.countWords(input);
        int chara = obj.countCharacters(input);
        System.out.print(line+" "+words+" "+chara);
    }
}
class ReadFile {
    String readFile(String file){
        String sCurrentLine,text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((sCurrentLine = br.readLine()) != null) {
                text += sCurrentLine;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return text;
    }
}
class wcOperation{
    public int countLines(String text){
        String lines[];
        lines = text.split("\n");
        return lines.length;
    }
    public int countWords(String text){
        String words[];
        words = text.split(" ");
        return words.length;
    }
    public int countCharacters(String text){
        String chars[];
        chars = text.split("");
        return chars.length;
    }
}