import java.util.*;
import java.io.*;

public class Minimumindexedcharacter {
    
    // Your code here
     public int minIndexChar(String str, String patt) {
        
        int[] freq = new int[256];
        
        // Record frequency of characters in patt
        for (char c : patt.toCharArray()) {
            freq[c]++;
        }
        
        // Find the minimum indexed character in str that is also in patt
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 0) {
                return i;
            }
        }
        
        return -1; // No character from patt found in str
    }

    public static void main(String[] args) {
        Minimumindexedcharacter solver = new Minimumindexedcharacter();
        String str = "geeksforgeeks";
        String patt = "set";
        int result = solver.minIndexChar(str, patt);
        System.out.println("Minimum indexed character position: " + result);
    } 
}