import java.util.*;
import java.io.*;

public class SearchinsertpositionofKinasortedarray {
    
  public int searchInsert(int[] nums, int target){

    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;

   }

   public static void main(String[] args) {
    SearchinsertpositionofKinasortedarray obj = new SearchinsertpositionofKinasortedarray();

    int[] nums = {1, 3, 5, 6};
    int target = 5;

    int result = obj.searchInsert(nums, target);
    System.out.println("The target " + target + " should be inserted at index: " + result);
   }
    
}