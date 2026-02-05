import java.util.*;
import java.io.*;

public class Removingconsecutiveduplicates2 {
    
    // Your code here
       public static String removePair(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            }else{
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
        String s = "abbaca";
        String result = removePair(s);
        System.out.println("String after removing pairs: " + result);
    }
    
}