import java.util.*;
import java.io.*;

public class SubarraysWithAtMostKDistinctIntegers {
    
    // Your code here
      public int countAtMostK(int arr[], int k) {
        if (k == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
    public static void main(String[] args) {
        SubarraysWithAtMostKDistinctIntegers solution = new SubarraysWithAtMostKDistinctIntegers();
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        int result = solution.countAtMostK(arr, k);
        System.out.println("Count of subarrays with at most " + k + " distinct integers: " + result);
    }
    
}