import java.util.*;

public class MaximumProductSubarray {
    
    int maxProduct(int[] arr) {
        int n = arr.length;
        
        int maxprod = arr[0];
        int minprod = arr[0];
        int result = arr[0];
        
        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            
            if (curr < 0) {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;
            }
            
            maxprod = Math.max(curr, maxprod * curr);
            minprod = Math.min(curr, minprod * curr);
            
            result = Math.max(result, maxprod);
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumProductSubarray sol = new MaximumProductSubarray();
        int arr[] = {-2, 6, -3, -10, 0, 2};
        
        System.out.println("Maximum Product of Subarray: " + sol.maxProduct(arr));
    }
}
