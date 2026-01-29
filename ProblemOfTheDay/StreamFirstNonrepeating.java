import java.util.*;
import java.io.*;

public class StreamFirstNonrepeating {
    
    // Your code here

      public String firstNonRepeating(String s) {
        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }

            if (q.isEmpty())
                result.append('#');
            else
                result.append(q.peek());
        }

        return result.toString();
    }


    public static void main(String[] args) {
        StreamFirstNonrepeating obj = new StreamFirstNonrepeating();
        String input = "aabc";
        String output = obj.firstNonRepeating(input);
        System.out.println("First non-repeating characters in the stream: " + output);
    }
    
}