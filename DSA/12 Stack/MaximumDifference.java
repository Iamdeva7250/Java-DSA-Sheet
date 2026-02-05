import java.util.*;
import java.io.*;

public class MaximumDifference {
    
    int findMaxDiff(int[] arr, int n) {
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();

        // Nearest smaller on left
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        st.clear();

        // Nearest smaller on right
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? 0 : st.peek();
            st.push(arr[i]);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.abs(left[i] - right[i]));
        }

        return max;
    }

    public static void main(String[] args) {
        MaximumDifference obj = new MaximumDifference();
        int[] arr = {2, 1, 8};
        int n = arr.length;
        int result = obj.findMaxDiff(arr, n);
        System.out.println("Maximum Difference: " + result);
    }
    
}