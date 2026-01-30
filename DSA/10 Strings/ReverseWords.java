import java.util.*;
import java.io.*;

public class ReverseWords {
    
    public String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseWords solver = new ReverseWords();
        String str = "Hello World from Java";
        String result = solver.reverseWords(str);
        System.out.println("Reversed words: " + result);
    }
    
}