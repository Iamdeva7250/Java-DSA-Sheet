import java.util.*;
import java.io.*;

public class SubstringWithoutRepeatingCharacters {
    
    // Your code here
      public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
    public static void main(String[] args) {
        SubstringWithoutRepeatingCharacters solution = new SubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
    
}