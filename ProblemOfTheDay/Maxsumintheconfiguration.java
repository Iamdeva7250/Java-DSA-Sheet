import java.util.*;
import java.io.*;
import java.lang.module.Configuration;

public class Maxsumintheconfiguration {
    
    // Your code here
     int maxSum(int[] arr) {
        int n = arr.length;
        
        int arrSum = 0;   // sum of array elements
        int currVal = 0;  // value of i*arr[i] for current rotation
        
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            currVal += i * arr[i];
        }
        
        int maxVal = currVal;
        
        // Compute next rotation values
        for (int i = 1; i < n; i++) {
            currVal = currVal + arrSum - n * arr[n - i];
            maxVal = Math.max(maxVal, currVal);
        }
        
        return maxVal;
    }

    public static void main(String[] args) {
      Maxsumintheconfiguration sol = new Maxsumintheconfiguration();

      int[] arr = {3, 1, 2, 8};

         System.out.println("Max Sum in the Configuration: " + sol.maxSum(arr));
    }
    
}