import java.util.*;
import java.io.*;

public class StringRotatedby2Places {
    
  public static boolean isRotated(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        
        if(s1.length() < 2 ) return s1.equals(s2);
        
        int n = s1.length();
        
        
        String clockwise = s1.substring(n - 2) + s1.substring(0, n - 2);
        
        String anticlockwise = s1.substring(2) + s1.substring(0, 2);
        
        
        return s2.equals(clockwise) || s2.equals(anticlockwise);
     } 

     public static void main(String[] args) {
      String s1 = "amazon";
      String s2 = "azonam";
      System.out.println(isRotated(s1, s2)); // Output: true
      
      
     }
    
}