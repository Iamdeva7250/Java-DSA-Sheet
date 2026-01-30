import java.util.*;
import java.io.*;

public class TheModifiedString {
    
        public int modified(String s) {

        int count = 1;   // count of current character
        int ans = 0;     // number of insertions

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans += count / 3;
                count = 1;
            }
        }

        // for last group
        ans += count / 3;

        return ans;
    }
        
    public static void main(String[] args) {
        TheModifiedString solver = new TheModifiedString();
        String str = "aabbbcc";
        int result = solver.modified(str);
        System.out.println("Number of modifications needed: " + result);
    }
}
    
