import java.util.*;
import java.io.*;

public class Removingconsecutiveduplicates {
    
    // Your code here
     public static String removeConsecutiveDuplicates(String s) {
        // Your code here
        
        Stack<Character> st = new Stack<>();
        
        
        for(char ch : s.toCharArray()){
            if(st.isEmpty() || st.peek() != ch){
                st.push(ch);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aaabbbccdaa";
        String result = removeConsecutiveDuplicates(s);
        System.out.println("String after removing consecutive duplicates: " + result);
    }
}