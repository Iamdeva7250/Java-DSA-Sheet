import java.util.*;
import java.io.*;

public class MaxCircularSubarraySum {
    
    // Your code here
    public static int maxCircular(int[] arr){

     int n = arr.length;
        
        int CurrMax = arr[0], maxSum = arr[0];
        int CurrMin = arr[0], minSum = arr[0];
        int TotalSum = arr[0];
        
        
        for(int i = 1; i<n; i++){
            int num = arr[i];
            
            CurrMax = Math.max(num,  CurrMax + num);
            maxSum = Math.max(maxSum, CurrMax);
            
            CurrMin = Math.min(num, CurrMin + num);
            minSum = Math.min(minSum, CurrMin);
            
            TotalSum += num;
        }
        if(maxSum < 0) 
        return maxSum;
        
        return Math.max(maxSum, TotalSum - minSum);
    }
    public static void main(String[] args) {
        int[] arr = {8, -4, 3, -5, 4};
        System.out.println("Maximum Circular Subarray Sum is: " + maxCircular(arr));
    }
}