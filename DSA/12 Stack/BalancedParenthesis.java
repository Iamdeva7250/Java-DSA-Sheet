import java.util.*;

public class BalancedParenthesis {

    // Function to check matching pair
    boolean matching(char a, char b) {
        return (a == '(' && b == ')') ||
               (a == '{' && b == '}') ||
               (a == '[' && b == ']');
    }

    // Function to check if parentheses are balanced
    boolean BalancedParenthesis(String str) {

        Deque<Character> s = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            // If opening bracket, push to stack
            if (x == '(' || x == '{' || x == '[') {
                s.push(x);
            }
            // If closing bracket
            else if (x == ')' || x == '}' || x == ']') {

                // Stack empty → not balanced
                if (s.isEmpty()) {
                    return false;
                }

                // Check matching
                if (!matching(s.pop(), x)) {
                    return false;
                }
            }
        }

        // If stack empty → balanced
        return s.isEmpty();
    }

    // Main method for VS Code testing
    public static void main(String[] args) {
        BalancedParenthesis bp = new BalancedParenthesis();

        System.out.println(bp.BalancedParenthesis("()"));       
        System.out.println(bp.BalancedParenthesis("({[]})"));   
        System.out.println(bp.BalancedParenthesis("([)]"));     
        System.out.println(bp.BalancedParenthesis("("));        
    }
}
