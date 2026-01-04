import java.util.*;

public class PrefixtoPostfixConversion {

    public String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();

        // Traverse from right to left
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            // Operand
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }
            // Operator
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();

                // Postfix = op1 op2 operator
                stack.push(op1 + op2 + c);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        PrefixtoPostfixConversion converter =
                new PrefixtoPostfixConversion();

        String prefix = "*-A/BC-/AKL";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Postfix Expression: "
                + converter.prefixToPostfix(prefix));
    }
}
