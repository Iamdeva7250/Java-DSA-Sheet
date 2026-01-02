import java.util.*;
import java.io.*;

public class KthMissingPositiveNumberinaSortedArray {
    
    // Your code here

     public int kthMissing(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // k-th missing number
        return left + k;
    }

    public static void main(String[] args) {
      KthMissingPositiveNumberinaSortedArray solver = new KthMissingPositiveNumberinaSortedArray();
      int[] arr = {2, 3, 4, 7, 11};
      int k = 5;
      int result = solver.kthMissing(arr, k);
      System.out.println("The " + k + "-th missing positive number is: " + result);
    }
    
}