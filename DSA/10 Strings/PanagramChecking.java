import java.util.*;
import java.io.*;

public class PanagramChecking {
    
    // Your code here
     public static boolean checkPangram(String s) {
        // code here
        
        boolean [] seen = new boolean[26];
        
        int count = 0;
        
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                c = Character.toLowerCase(c);
                
                int idx = c - 'a';
                
                if(!seen[idx]){
                    seen[idx] = true;
                    count++;
                }
            }
        }
        return count == 26;
    }

    public static void main(String[] args) {
      String s = "The quick brown fox jumps over the lazy dog";
      System.out.println(checkPangram(s)); // Output: true
      
      
     }
    
}