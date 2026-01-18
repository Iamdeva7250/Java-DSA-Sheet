import java.util.*;
import java.io.*;

public class BinarySubarraysWithSum {
    
    // Your code here

    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - goal, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }



    public static void main(String[] args) {
        BinarySubarraysWithSum obj = new BinarySubarraysWithSum();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = obj.numSubarraysWithSum(nums, goal);
        System.out.println(result); // Output: 4
    }
    
}