import java.util.*;
import java.io.*;

public class Keypadtyping {
    
    // Your code here
     public static String printNumber(String s, int n) {
     
      
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            
            if(ch >= 'a' && ch <= 'c') result.append('2');
            else if(ch >= 'd' && ch <= 'f') result.append('3');
            else if(ch >= 'g' && ch <= 'i') result.append('4');
            else if(ch >= 'j' && ch <= 'l') result.append('5');
            else if(ch >= 'm' && ch <= 'o') result.append('6');
            else if(ch >= 'p' && ch <= 's') result.append('7');
            else if(ch >= 'q' && ch <= 'v') result.append('8');
            else if(ch >= 'w' && ch <= 'z') result.append('9');
            
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        String result = printNumber(s, n);
        System.out.println("Keypad representation: " + result); 
    }
    
}