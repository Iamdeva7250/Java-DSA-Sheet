import java.util.*;
import java.io.*;

public class Removecommoncharactersandconcatenate {
    
    public String removeCommonAndConcatenate(String str1, String str2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : str1.toCharArray()) {
            set1.add(c);
        }

        for (char c : str2.toCharArray()) {
            set2.add(c);
        }

        StringBuilder result = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if (!set2.contains(c)) {
                result.append(c);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!set1.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Removecommoncharactersandconcatenate solver = new Removecommoncharactersandconcatenate();
        String str1 = "abcdef";
        String str2 = "defghij";
        String result = solver.removeCommonAndConcatenate(str1, str2);
        System.out.println("Resulting string: " + result);
    }
    
}