import java.util.*;
import java.io.*;

public class RemoveOuterParanthesis {
    
    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) ans.append(c);
                balance++;
            } else {  // ')'
                balance--;
                if (balance > 0) ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
}
