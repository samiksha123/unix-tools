package samiksha.unixtools;

public class WC {
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