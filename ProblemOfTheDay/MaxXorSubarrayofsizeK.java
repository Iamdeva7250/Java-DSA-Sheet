import java.util.*;
import java.io.*;

public class MaxXorSubarrayofsizeK {
   public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        
        // Edge case
        if (k > n) return 0;

        int xor = 0;
        
        // XOR of first window
        for (int i = 0; i < k; i++) {
            xor ^= arr[i];
        }

        int maxXor = xor;

        // Sliding window
        for (int i = k; i < n; i++) {
            xor ^= arr[i - k]; // remove left element
            xor ^= arr[i];     // add right element
            maxXor = Math.max(maxXor, xor);
        }

        return maxXor;
    }

    public static void main(String[] args) {
        MaxXorSubarrayofsizeK solution = new MaxXorSubarrayofsizeK();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int result = solution.maxSubarrayXOR(arr, k);
        System.out.println("Maximum XOR of Subarray of size " + k + ": " + result);
    }
    
}