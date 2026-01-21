import java.util.*;
import java.io.*;

public class Sumofsubarrayranges {
    
    // Your code here

      public int subarrayRanges(int[] arr) {
        int n = arr.length;
        long sumMax = 0, sumMin = 0;

        Stack<Integer> st = new Stack<>();

        // ---------- Sum of subarray maximums ----------
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || arr[st.peek()] < (i < n ? arr[i] : Integer.MAX_VALUE))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sumMax += count * arr[mid];
            }
            st.push(i);
        }

        st.clear();

        // ---------- Sum of subarray minimums ----------
        for (int i = 0; i <= n; i++) {
            while (!st.isEmpty() && (i == n || arr[st.peek()] > (i < n ? arr[i] : Integer.MIN_VALUE))) {
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                int right = i;

                long count = (long)(mid - left) * (right - mid);
                sumMin += count * arr[mid];
            }
            st.push(i);
        }

        return (int)(sumMax - sumMin);
    }

    public static void main(String[] args) {
        Sumofsubarrayranges solution = new Sumofsubarrayranges();
        int[] arr = {1, 2, 3};
        int result = solution.subarrayRanges(arr);
        System.out.println("Sum of subarray ranges: " + result);
    }
    
}