import java.util.*;
import java.io.*;

public class RepeatingCharacter {
    
    // Your code here
    public char firstRepeatingCharacter(String str) {
        
        int[] freq = new int[256];
        
        // Record frequency of each character
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        
        // Find the first repeating character
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 1) {
                return str.charAt(i);
            }
        }
        
        return '\0'; // No repeating character found
    }

    public static void main(String[] args) {
        RepeatingCharacter solver = new RepeatingCharacter();
        String str = "geeksforgeeks";
        char result = solver.firstRepeatingCharacter(str);
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }
    
}