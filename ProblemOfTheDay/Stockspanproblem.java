import java.util.*;
import java.io.*;

public class Stockspanproblem {
    
    // Your code here
      public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // Pop elements smaller or equal to current
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack empty, span is i+1 else i - st.peek()
            if (st.isEmpty()) {
                span.add(i + 1);
            } else {
                span.add(i - st.peek());
            }

            // Push current index
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        Stockspanproblem solution = new Stockspanproblem();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        ArrayList<Integer> result = solution.calculateSpan(prices);
        System.out.println("Stock spans: " + result);
    }
}