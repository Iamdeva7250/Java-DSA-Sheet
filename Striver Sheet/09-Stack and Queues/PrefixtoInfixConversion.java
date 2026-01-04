import java.util.*;

public class PrefixtoInfixConversion {

    public String prefixToInfix(String prefix) {
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

                String expr = "(" + op1 + c + op2 + ")";
                stack.push(expr);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        PrefixtoInfixConversion converter =
                new PrefixtoInfixConversion();

        String prefix = "*-A/BC-/AKL";
        System.out.println("Prefix Expression: " + prefix);
        System.out.println("Infix Expression: "
                + converter.prefixToInfix(prefix));
    }
}
