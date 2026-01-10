import java.util.*;
import java.io.*;

public class SubstringswithKDistinct {
    
    // Your code here
     public int countSubstr(String s, int k) {
        return atMostK(s, k) - atMostK(s, k - 1);
    }
    
    private int atMostK(String s, int k) {
        if (k < 0) return 0;
        
        int left = 0, count = 0;
        int[] freq = new int[26];
        int distinct = 0;
        
        for (int right = 0; right < s.length(); right++) {
            if (freq[s.charAt(right) - 'a'] == 0)
                distinct++;
            
            freq[s.charAt(right) - 'a']++;
            
            while (distinct > k) {
                freq[s.charAt(left) - 'a']--;
                if (freq[s.charAt(left) - 'a'] == 0)
                    distinct--;
                left++;
            }
            
            count += right - left + 1;
        }
        
        return count;
    }



    public static void main(String[] args) {
        SubstringswithKDistinct solution = new SubstringswithKDistinct();
        String s = "pqpqs";
        int k = 2;
        int result = solution.countSubstr(s, k);
        System.out.println("Count of substrings with exactly " + k + " distinct characters: " + result);
    }
    
}