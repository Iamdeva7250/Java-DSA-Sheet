import java.util.*;

public class InfixtoPostfix {

    // Operator precedence
    public static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

    // Convert infix to postfix
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            // Opening bracket
            else if (c == '(') {
                st.push(c);
            }

            // Closing bracket
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop(); // remove '('
            }

            // Operator
            else {
                while (!st.isEmpty() &&
                      (prec(c) < prec(st.peek()) ||
                      (prec(c) == prec(st.peek()) && c != '^'))) {
                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix: " + exp);
        System.out.println("Postfix: " + infixToPostfix(exp));
    }
}
