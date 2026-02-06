import java.util.*;
import java.io.*;

public class firstNonReatingCharacterStream {
    
 
    public String FirstNonRepeating(String s) {
        // code here
        int[] freq = new int[26];
        
        Queue<Character> q = new LinkedList<>();
        
        StringBuilder ans = new StringBuilder();
        
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
            q.offer(c);
            
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
            q.poll();
            }
            
            ans.append(q.isEmpty() ? '#' : q.peek());
        }
        
        return ans.toString();
    }

    public static void main(String[] args) {
        firstNonReatingCharacterStream solution = new firstNonReatingCharacterStream();
        String s = "aabc";
        String result = solution.FirstNonRepeating(s);
        System.out.println("First non-repeating characters in the stream: " + result);
    }
    
}