import java.util.*;
import java.io.*;

public class MaxSumSubarrayofsizeK {
    
    // Your code here
      public int maxSubarraySum(int[] arr, int k) {

        int n = arr.length;
        int windowSum = 0;
        int maxSum = 0;

        // Sum of first k elements
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < n; i++) {
            windowSum += arr[i];        // add next element
            windowSum -= arr[i - k];    // remove previous element
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        MaxSumSubarrayofsizeK solution = new MaxSumSubarrayofsizeK();
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = solution.maxSubarraySum(arr, k);
        System.out.println("Maximum Sum of Subarray of size " + k + ": " + result);
    }
    
}