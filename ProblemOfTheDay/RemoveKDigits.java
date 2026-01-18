import java.util.*;
import java.io.*;

public class RemoveKDigits {
    
    // Your code here
     public String removeKdig(String s, int k) {
        if (k >= s.length()) return "0";

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }

        // If k still > 0, remove from end
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // Build result & remove leading zeros
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();

        // Remove leading zeros
        int idx = 0;
        while (idx < sb.length() && sb.charAt(idx) == '0') {
            idx++;
        }

        String res = sb.substring(idx);
        return res.length() == 0 ? "0" : res;
    }


    public static void main(String[] args) {
        RemoveKDigits obj = new RemoveKDigits();
        String s = "1432219";
        int k = 3;
        String result = obj.removeKdig(s, k);
        System.out.println("Result after removing k digits: " + result);
    }
    
}