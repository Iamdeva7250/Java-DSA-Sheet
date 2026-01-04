import java.util.*;
import java.io.*;

public class NextGreaterElementI {
    
      public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Process nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Build result for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        NextGreaterElementI obj = new NextGreaterElementI();
        
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        
        int[] result = obj.nextGreaterElement(nums1, nums2);
        
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
    
