import java.util.*;
import java.io.*;

public class MaxConsecutiveOnesIII {
    
    // Your code here
      public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = solution.longestOnes(nums, k);
        System.out.println("Longest consecutive ones with at most " + k + " flips: " + result);
    }
    
}