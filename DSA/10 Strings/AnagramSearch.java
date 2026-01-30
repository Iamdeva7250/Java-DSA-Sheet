import java.util.*;
import java.io.*;

public class AnagramSearch {

    static final int CHAR = 256; // number of ASCII characters

    public boolean isPresent(String txt, String pat) {

        int n = txt.length();
        int m = pat.length();

        if (m > n)
            return false;

        int[] CT = new int[CHAR]; // count for text window
        int[] CP = new int[CHAR]; // count for pattern

        // Initialize frequency arrays for the first window
        for (int i = 0; i < m; i++) {
            CT[txt.charAt(i)]++;
            CP[pat.charAt(i)]++;
        }

        // Slide the window one character at a time
        for (int i = m; i < n; i++) {
            if (Arrays.equals(CT, CP))
                return true; // Found an anagram

            // Add next char to window
            CT[txt.charAt(i)]++;

            // Remove first char of previous window
            CT[txt.charAt(i - m)]--;
        }

        // Check the last window
        return Arrays.equals(CT, CP);
    }

    // Optional test
    public static void main(String[] args) {
        AnagramSearch obj = new AnagramSearch();
        String txt = "geeksforgeeks";
        String pat = "frog";

        if (obj.isPresent(txt, pat))
            System.out.println("Anagram exists in text");
        else
            System.out.println("No anagram found");
    }
}
