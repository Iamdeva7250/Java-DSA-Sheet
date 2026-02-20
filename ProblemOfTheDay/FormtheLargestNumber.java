import java.util.*;
import java.io.*;

public class FormtheLargestNumber {
    
    // Your code here
      public String findLargest(int[] arr) {
        // Convert integers to strings
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }

        // Custom comparator: decide order by concatenation
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: if the largest number is "0", return "0"
        if (nums[0].equals("0")) return "0";

        // Build the result
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        FormtheLargestNumber solution = new FormtheLargestNumber();
        int[] arr = {3, 30, 34, 5, 9};
        String largestNumber = solution.findLargest(arr);
        System.out.println("The largest number formed is: " + largestNumber);
    }
}