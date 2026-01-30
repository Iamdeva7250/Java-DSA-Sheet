import java.util.*;
import java.io.*;

public class LongestCommonPrefix {
  
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Take first string as base
        String prefix = strs[0];

        // Compare prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
      LongestCommonPrefix sol = new LongestCommonPrefix();
String[] strs = {"flower", "flow", "flight"};
System.out.println(sol.longestCommonPrefix(strs)); // Output: "fl"

    }
}

    
