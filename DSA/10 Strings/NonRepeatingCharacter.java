import java.util.*;
import java.io.*;

public class NonRepeatingCharacter {
    
    // Your code here
      public int firstNonRepeating(String str) {
          
          int[] freq = new int[256];
          
          // Record frequency of each character
          for (char c : str.toCharArray()) {
              freq[c]++;
          }
          
          // Find the first non-repeating character
          for (int i = 0; i < str.length(); i++) {
              if (freq[str.charAt(i)] == 1) {
                  return i;
              }
          }
          
          return -1; // No non-repeating character found
      }
      
      public static void main(String[] args) {
          NonRepeatingCharacter solver = new NonRepeatingCharacter();
          String str = "geeksforgeeks";
          int result = solver.firstNonRepeating(str);
          System.out.println("First non-repeating character index: " + result); 
      }
}