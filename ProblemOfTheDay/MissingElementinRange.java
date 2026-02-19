import java.util.*;
import java.io.*;

public class MissingElementinRange {
    
    // Your code here
     public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // Put all array elements into a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        ArrayList<Integer> result = new ArrayList<>();
        
        // Check each number in the range
        for (int num = low; num <= high; num++) {
            if (!set.contains(num)) {
                result.add(num);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        MissingElementinRange solution = new MissingElementinRange();
        int[] arr = {1, 3, 5, 7};
        int low = 1;
        int high = 10;

        ArrayList<Integer> missingNumbers = solution.missingRange(arr, low, high);
        System.out.println(missingNumbers); 
    }
}