import java.util.*;
import java.io.*;

public class NextGreaterElementII {
    
    // Your code here
     public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); // store indices

        // Traverse the array twice (circular)
        for (int i = 0; i < 2 * n; i++) {
            int idx = i % n;

            while (!st.isEmpty() && nums[st.peek()] < nums[idx]) {
                ans[st.pop()] = nums[idx];
            }

            // Only push indices in first pass
            if (i < n) {
                st.push(idx);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        NextGreaterElementII solution = new NextGreaterElementII();
        int[] nums = {1, 2, 1};
        int[] result = solution.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); 
    }
    
}