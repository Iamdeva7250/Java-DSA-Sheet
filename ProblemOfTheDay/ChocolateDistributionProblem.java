import java.util.*;
import java.io.*;

public class ChocolateDistributionProblem {
    
    // Your code here
     public int findMinDiff(ArrayList<Integer> arr, int m) {
     
        Collections.sort(arr);

      
        int minDiff = Integer.MAX_VALUE;

        // Step 3: Slide a window of size m
        for (int i = 0; i <= arr.size() - m; i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        ChocolateDistributionProblem solution = new ChocolateDistributionProblem();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 3, 2, 4, 9, 12, 56));
        int m = 3;
        int result = solution.findMinDiff(arr, m);
        System.out.println("Minimum difference is: " + result);
    }
    
}