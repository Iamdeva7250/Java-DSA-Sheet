import java.util.*;
import java.io.*;

public class SumofSubarrayRanges {
    
    // Your code here
      public long subArrayRanges(int[] arr) {
        int n=arr.length;
        
        long sum=0;
        
        for(int i=0;i<n;i++){
            int smallest=arr[i];
            int largest=arr[i];
            
            for(int j=i;j<n;j++){
                smallest=Math.min(smallest,arr[j]);
                largest=Math.max(largest,arr[j]);
                
                sum=sum+(largest-smallest);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SumofSubarrayRanges solution = new SumofSubarrayRanges();
        int[] arr = {1, 2, 3};
        long result = solution.subArrayRanges(arr);
        System.out.println("Sum of Subarray Ranges: " + result);
    }
    
}