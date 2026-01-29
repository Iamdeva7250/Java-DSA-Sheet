import java.util.*;
import java.io.*;

public class FindSubarray {

    public int findSubarray(int[] arr) {
        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int count = 0;
        
        // prefix sum 0 initially occurs once
        map.put(0, 1);

        for (int num : arr) {
            sum += num;

            // If prefix sum already seen → subarray with sum 0 exists
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }

            // Increase frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 5, 5, 0, 0};

        FindSubarray obj = new FindSubarray();
        System.out.println("Subarray is : " + obj.findSubarray(arr));
    }
}
