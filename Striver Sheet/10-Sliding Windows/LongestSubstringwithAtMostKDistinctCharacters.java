import java.util.*;
import java.io.*;

public class LongestSubstringwithAtMostKDistinctCharacters {
    
    // Your code here
      public int lengthOfLongestSubstringKDistinct(String s, int k) {
        // Edge case
        if (k == 0 || s.length() == 0) return 0;

        // Frequency map to track characters
        Map<Character, Integer> freq = new HashMap<>();

        // Initialize sliding window pointers
        int left = 0;
        int maxLen = 0;

        // Loop through string
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // Shrink window if more than k distinct chars
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            // Update maxLen
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstringwithAtMostKDistinctCharacters sol = new LongestSubstringwithAtMostKDistinctCharacters();
        String s = "eceba";
        int k = 2;
        System.out.println(sol.lengthOfLongestSubstringKDistinct(s, k));
    }
}
    
