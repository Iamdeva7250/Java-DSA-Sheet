import java.util.*;

public class PrintFrequencies {
    public static void main(String[] args) {

        String str = "geeksforgeeks";

        int[] count = new int[26];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        // Print frequency
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + count[i]);
            }
        }
    }
}
