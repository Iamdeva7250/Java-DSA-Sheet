import java.util.*;
import java.io.*;

public class PatternSearchKMP {
    
    // Function to fill lps[] for given pattern pat[0..M-1]
    void computeLPSArray(String pat, int M, int lps[]) {

        int len = 0;      // length of the previous longest prefix suffix
        lps[0] = 0;       // lps[0] is always 0

        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

    // Function to check if the pattern exists in the string or not
    boolean KMPSearch(String pat, String txt) {

        int M = pat.length();
        int N = txt.length();

        int[] lps = new int[M];
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt
        int j = 0; // index for pat

        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }

            if (j == M) {
                return true;   // Pattern found
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      PatternSearchKMP kmp = new PatternSearchKMP();
      String txt = "ABABDABACDABABCABAB";
      String pat = "ABABCABAB";
      boolean result = kmp.KMPSearch(pat, txt);
      System.out.println("Pattern found: " + result);
    }
}

    
