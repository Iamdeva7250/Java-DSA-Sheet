import java.util.*;
import java.io.*;

public class SumofSubarrayMinimums {
    
    // Your code here
       public int sumSubarrayMins(int[] arr) {

        int n = arr.length;
        int MOD = 1000000007;

        int[] left = new int[n];
        int[] right = new int[n];

        // Stack for previous smaller element
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        // Calculate left distances
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                count += left[stack.pop()];
            }
            left[i] = count;
            stack.push(i);
        }

        stack.clear();

        // Calculate right distances
        for (int i = n - 1; i >= 0; i--) {
            int count = 1;
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                count += right[stack.pop()];
            }
            right[i] = count;
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        SumofSubarrayMinimums solution = new SumofSubarrayMinimums();
        int[] arr = {3, 1, 2, 4};
        int result = solution.sumSubarrayMins(arr);
        System.out.println("Sum of Subarray Minimums: " + result);
    }
    
}