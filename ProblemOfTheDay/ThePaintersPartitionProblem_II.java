import java.util.*;
import java.io.*;

public class ThePaintersPartitionProblem_II {
    
    // Your code here
      public int minTime(int[] arr, int k) {
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.max(low, num); // largest board
            high += num;              // sum of all boards
        }
        
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPaint(arr, k, mid)) {
                result = mid;
                high = mid - 1; // try smaller max time
            } else {
                low = mid + 1;  // need larger max time
            }
        }
        return result;
    }
    
    private boolean canPaint(int[] arr, int k, int maxTime) {
        int painters = 1;
        int currSum = 0;
        
        for (int num : arr) {
            if (currSum + num <= maxTime) {
                currSum += num;
            } else {
                painters++;
                currSum = num;
                if (painters > k) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ThePaintersPartitionProblem_II solution = new ThePaintersPartitionProblem_II();
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        int result = solution.minTime(arr, k);
        System.out.println("Minimum time to paint all boards: " + result);
    }
}