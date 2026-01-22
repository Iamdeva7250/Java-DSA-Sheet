import java.util.*;
import java.io.*;

public class MinimumWindowSubstring {
    
    // Your code here
      public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] freq = new int[128];   // ASCII frequency
        for (char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, right = 0;
        int count = t.length();      // chars still needed
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char r = s.charAt(right);

            if (freq[r] > 0) {
                count--;
            }
            freq[r]--;
            right++;

            // Valid window
            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                char l = s.charAt(left);
                freq[l]++;
                if (freq[l] > 0) {
                    count++;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" 
                                           : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println("Minimum window substring: " + result);
    }

}

    
