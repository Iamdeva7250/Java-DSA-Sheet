import java.util.*;
import java.io.*;

public class LongestSubStringDistinct {

    // Function to find the longest substring with distinct characters
    public static String LongestDistinctSubstring(String str) {
        int n = str.length();
        int[] prev = new int[256];
        Arrays.fill(prev, -1);

        int i = 0, start = 0, maxLen = 0;

        for (int j = 0; j < n; j++) {
            // Update i to skip previously seen characters
            i = Math.max(i, prev[str.charAt(j)] + 1);

            // Update maximum length and starting index if needed
            if (j - i + 1 > maxLen) {
                maxLen = j - i + 1;
                start = i;
            }

            // Update last seen index of the current character
            prev[str.charAt(j)] = j;
        }

        // Return the longest substring
        return str.substring(start, start + maxLen);
    }

    // Main method
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String longest = LongestDistinctSubstring(str);
        System.out.println("Longest substring with distinct characters: " + longest);
        System.out.println("Length: " + longest.length());
    }

    
}