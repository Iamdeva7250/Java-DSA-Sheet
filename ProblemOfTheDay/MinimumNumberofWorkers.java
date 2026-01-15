import java.util.*;
import java.io.*;

public class MinimumNumberofWorkers {
    
    // Your code here
      public int minMen(int arr[]) {
        int n = arr.length;
        List<int[]> intervals = new ArrayList<>();

        // Build valid intervals
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                int l = Math.max(0, i - arr[i]);
                int r = Math.min(n - 1, i + arr[i]);
                intervals.add(new int[]{l, r});
            }
        }

        // Sort by start, then by end descending
        intervals.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return b[1] - a[1];
        });

        int count = 0;
        int idx = 0;
        int currEnd = 0;

        while (currEnd < n) {
            int farthest = currEnd;

            // Extend coverage
            while (idx < intervals.size() && intervals.get(idx)[0] <= currEnd) {
                farthest = Math.max(farthest, intervals.get(idx)[1] + 1);
                idx++;
            }

            // Gap found
            if (farthest == currEnd) return -1;

            count++;
            currEnd = farthest;
        }

        return count;
    }



    public static void main(String[] args) {
        MinimumNumberofWorkers solution = new MinimumNumberofWorkers();
        int[] arr = {1, 2, -1, 1, 0};
        int result = solution.minMen(arr);
        System.out.println("Minimum number of workers needed: " + result);
    }
    
}