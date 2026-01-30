import java.util.*;
import java.io.*;

public class PatternSearch {

    // Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt) {

        int m = pat.length();
        int n = txt.length();

        int[] lps = new int[m];
        computeLPS(pat, lps);

        int i = 0, j = 0;

        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                return true;   // pattern found
            } 
            else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return false;
    }

    static void computeLPS(String pat, int[] lps) {

        int len = 0;
        lps[0] = 0;

        int i = 1;
        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0)
                    len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
      String txt = "ABABDABACDABABCABAB";
      String pat = "ABABCABAB";
      System.out.println(search(pat, txt)); 
    }
}
