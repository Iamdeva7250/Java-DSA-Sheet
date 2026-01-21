import java.util.*;
import java.io.*;

public class SubarrayswithKDifferentIntegers {
    
    // Your code here

      public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, res = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // Shrink window if distinct count > k
            while (freq.size() > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }

            // Number of subarrays ending at right
            res += right - left + 1;
        }

        return res;
    }

    public static void main(String[] args) {
        SubarrayswithKDifferentIntegers solution = new SubarrayswithKDifferentIntegers();
        int[] nums = {1,2,1,2,3};
        int k = 2;
        int result = solution.subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly K different integers: " + result);
    }
    
}