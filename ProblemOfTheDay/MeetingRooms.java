import java.util.*;
import java.io.*;

public class MeetingRooms {
    
    // Your code here
     static boolean canAttend(int[][] arr) {
        // Sort meetings by start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Check for overlaps
        for (int i = 1; i < arr.length; i++) {
            // If current meeting starts before the previous one ends → overlap
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }
        return true;
    }

    
    public static void main(String[] args) {
        int[][] meetings = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(canAttend(meetings)); 
    }
}