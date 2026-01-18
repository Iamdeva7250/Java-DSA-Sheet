import java.util.*;
import java.io.*;

public class CountNumberofNiceSubarrays {
    
    // Your code here
     public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);  // base case

        int oddCount = 0;
        int result = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                oddCount++;
            }

            if (map.containsKey(oddCount - k)) {
                result += map.get(oddCount - k);
            }

            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        CountNumberofNiceSubarrays obj = new CountNumberofNiceSubarrays();
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        int result = obj.numberOfSubarrays(nums, k);
        System.out.println(result); 
    }
}