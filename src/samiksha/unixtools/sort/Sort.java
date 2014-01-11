package samiksha.unixtools.sort;

import samiksha.unixtools.readfile.ReadFile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    private String[] defaultSort(String input) {
        String content[] = input.split("\n");
        Arrays.sort(content);
        return content;
    }
    public String[] reverseSort(String input){
        String lines[] = defaultSort(input);
        List<String> list = Arrays.asList(lines);
        Collections.reverse(list);
        lines = list.toArray(new String[list.size()]);
        return lines;
    }
    public static void main(String[] args) {
        ReadFile read = new ReadFile();
        String filename = args[0];
        String sortedData[],reverse[];
        String input = read.readFile(filename);
        Sort s = new Sort();
        if(args.length == 2 && (args[1].compareTo("-r") == 0)){
            reverse = s.reverseSort(input);
            for (int i = 0; i <reverse.length ; i++) {
                System.out.println(reverse[i]);
            }
        }else{
            sortedData = s.defaultSort(input);
            for (int i = 0; i <sortedData.length ; i++) {
                System.out.println(sortedData[i]);
            }
        }
    }

}

