import java.util.*;
import java.io.*;

public class MaximumnumberofoverlappingIntervals {
    
    // Your code here
     public static int overlapInt(int[][] arr) {
        int n = arr.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0;
        int currOverlap = 0, maxOverlap = 0;

        while (i < n && j < n) {
            if (start[i] <= end[j]) {
                currOverlap++;
                maxOverlap = Math.max(maxOverlap, currOverlap);
                i++;
            } else {
                currOverlap--;
                j++;
            }
        }

        return maxOverlap;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 5}, {4, 6}};
        System.out.println("Maximum number of overlapping intervals: " + overlapInt(intervals));
    }
    
}