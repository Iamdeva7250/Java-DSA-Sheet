import java.util.*;
import java.io.*;

public class RemoveKDigits {
    
    // Your code here
      public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!st.empty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }

        // FIX 1: safe pop
        while (k > 0 && !st.empty()) {
            st.pop();
            k--;
        }

        if (st.empty()) return "0";

        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.pop()); // small cleanup
        }

        // FIX 2: reverse FIRST
        res.reverse();

        // FIX 3: remove leading zeros (not trailing)
        while (res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        RemoveKDigits solution = new RemoveKDigits();
        String num = "1432219";
        int k = 3;
        String result = solution.removeKdigits(num, k);
        System.out.println("Result after removing " + k + " digits: " + result);
    }
    
}