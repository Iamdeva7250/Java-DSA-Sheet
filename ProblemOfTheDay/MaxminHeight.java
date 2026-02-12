import java.util.*;
import java.io.*;

public class MaxminHeight {
    
    // Your code here
       public int maxMinHeight(int[] arr, int k, int w) {
        int n = arr.length;
        int low = Arrays.stream(arr).min().getAsInt();
        int high = low + k;
        int ans = low;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canAchieve(arr, k, w, mid)) {
                ans = mid;
                low = mid + 1; // try for higher minimum
            } else {
                high = mid - 1; // reduce target
            }
        }
        return ans;
    }

    private boolean canAchieve(int[] arr, int k, int w, int target) {
        int n = arr.length;
        int[] diff = new int[n + 1];
        int used = 0, currAdd = 0;

        for (int i = 0; i < n; i++) {
            currAdd += diff[i];
            int effective = arr[i] + currAdd;
            if (effective < target) {
                int need = target - effective;
                used += need;
                if (used > k) return false;
                currAdd += need;
                if (i + w < n) diff[i + w] -= need;
            }
        }
        return true;
    }

    public static void main(String[] args) {
      MaxminHeight sol = new MaxminHeight();

      int arr[] =  {2, 3, 4, 5, 1}, k = 2, w = 2;

      int result = sol.maxMinHeight(arr, k, w); 
      System.out.println("Maximum minimum height achievable: " + result);


    }
    
}