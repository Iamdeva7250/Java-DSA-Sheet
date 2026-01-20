import java.util.*;
import java.io.*;

public class NumberofSubstringsContainingAllThreeCharacters {
    
    // Your code here

     public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3]; // for a, b, c
        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            // Shrink window while it has all 3 characters
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += (n - right);
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        NumberofSubstringsContainingAllThreeCharacters solution = new NumberofSubstringsContainingAllThreeCharacters();
        String s = "abcabc";
        int result = solution.numberOfSubstrings(s);
        System.out.println("Number of substrings containing all three characters: " + result);
    }
    
}