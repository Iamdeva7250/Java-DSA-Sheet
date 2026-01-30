import java.util.*;
import java.io.*;

public class CheckifaStringisSubsequenceofOther {
    
    public boolean isSubsequence(String s, String t) {

        int m = s.length();
        int n = t.length();

        int i = 0, j = 0;

        while (i < m && j < n) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == m;
    }
    public static void main(String[] args) {
        CheckifaStringisSubsequenceofOther obj = new CheckifaStringisSubsequenceofOther();

        String s = "abc";
        String t = "ahbgdc";

        boolean result = obj.isSubsequence(s, t);
        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? : " + result); 
    }
    
}