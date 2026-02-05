import java.util.*;
import java.io.*;

public class ParenthesisChecker {
    
    // Your code here
     public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                
                char peek = st.pop();
                
                if((ch == ')' && peek != '(')||
                (ch == '}' && peek != '{') ||
                (ch == ']' && peek != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        ParenthesisChecker pc = new ParenthesisChecker();
        String expression = "{[()]}";
        if (pc.isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
    }
}