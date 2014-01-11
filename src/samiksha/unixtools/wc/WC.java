package samiksha.unixtools.wc;

import samiksha.unixtools.readfile.ReadFile;

import java.io.IOException;

class WC{
    public static void main(String[] args) throws IOException {
        ReadFile read = new ReadFile();
        String input = read.readFile(args[0]);
        WcOperation obj = new WcOperation();
        int line = obj.countLines(input);
        int words = obj.countWords(input);
        int chara = obj.countCharacters(input);
        System.out.print(line+" "+words+" "+chara);
    }
}
class WcOperation {
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
        return text.length();
    }
}