import java.util.*;
import java.io.*;

public class OverlappingIntervals {
    
    public ArrayList<int[]> mergeOverlap(int[][] arr) {

        ArrayList<int[]> result = new ArrayList<>();
        if (arr.length == 0) return result;

        // Sort by start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int start = arr[0][0];
        int end = arr[0][1];

        for (int i = 1; i < arr.length; i++) {
            // Overlapping
            if (arr[i][0] <= end) {
                end = Math.max(end, arr[i][1]);
            } 
            // Non-overlapping
            else {
                result.add(new int[]{start, end});
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Add last interval
        result.add(new int[]{start, end});

        return result;
    }

    public static void main(String[] args) {
        OverlappingIntervals oi = new OverlappingIntervals();

        int[][] intervals = {
            {1, 3}, {2, 4}, {5, 7}, {6, 8}
        };

        ArrayList<int[]> merged = oi.mergeOverlap(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
    
}