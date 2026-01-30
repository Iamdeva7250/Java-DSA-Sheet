import java.util.*;
import java.io.*;

public class FirstOccurence {

    public int firstOccurence(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        // Edge case
        if (m > n) return -1;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && txt.charAt(i + j) == pat.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
      FirstOccurence obj = new FirstOccurence();
       String txt = "GeeksForGeeks";
       String pat = "Fr";

       int result = obj.firstOccurence(txt, pat);

       if(result != -1) {
           System.out.println("First occurrence at index: " + result);
       } else {
           System.out.println("Pattern not found");

    }
  } 

}
