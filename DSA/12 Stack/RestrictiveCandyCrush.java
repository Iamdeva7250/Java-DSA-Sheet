import java.util.*;
import java.io.*;

public class RestrictiveCandyCrush {

    
    static class Pair {
        char ch;
        int count;
        Pair(char c, int ct) {
            ch = c;
            count = ct;
        }
    }

    public static String reduced_String(int k, String s) {
        if (k == 1) return "";

        Stack<Pair> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek().ch == c) {
                st.peek().count++;
                if (st.peek().count == k)
                    st.pop();
            } else {
                st.push(new Pair(c, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Pair p : st) {
            for (int i = 0; i < p.count; i++)
                sb.append(p.ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "deeedbbcccbdaa";
        int k = 3;
        String result = reduced_String(k, s);
        System.out.println("Reduced String: " + result);
    }
    
}