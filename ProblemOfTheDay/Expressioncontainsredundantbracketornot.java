import java.util.*;
import java.io.*;

public class Expressioncontainsredundantbracketornot {
    
    // Your code here
     public static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push everything except closing bracket
            if (ch != ')') {
                st.push(ch);
            } 
            else {
                boolean hasOperator = false;

                // Check inside the brackets
                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        hasOperator = true;
                    }
                }

                // Pop opening bracket '('
                st.pop();

                // No operator found → redundant
                if (!hasOperator) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String expression = "((a+b))";
        if (checkRedundancy(expression)) {
            System.out.println("The expression contains redundant brackets.");
        } else {
            System.out.println("The expression does not contain redundant brackets.");
        }
    }
    
}