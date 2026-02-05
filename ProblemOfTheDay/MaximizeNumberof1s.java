import java.util.*;
import java.io.*;

public class MaximizeNumberof1s {
    
    // Your code here

    public int maximizeOnes(int[] arr, int n, int k) {
      int left = 0, right = 0;
      int maxOnes = 0;
      int zeroCount = 0;

      while(right < n){
        if(arr[right] == 0){
          zeroCount++;
        }

        while(zeroCount > k){
          if(arr[left] == 0){
            zeroCount--;
          }
          left++;
        }

        maxOnes = Math.max(maxOnes, right - left + 1);
        right++;
      }

      return maxOnes;
    }   
    public static void main(String[] args) {
      MaximizeNumberof1s solution = new MaximizeNumberof1s();
      int[] arr = {1,0,0,1,1,0,1,0,1,1};
      int n = arr.length;
      int k = 2;
      int result = solution.maximizeOnes(arr, n, k);
      System.out.println("Maximum number of 1s after flipping at most " + k + " zeros: " + result);
    }
    
}