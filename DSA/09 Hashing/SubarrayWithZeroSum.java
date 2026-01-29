import java.util.*;
public class SubarrayWithZeroSum {

  boolean hasZeroSumSubarray(int arr[]) {
    HashSet<Integer> prefixSums = new HashSet<>();
    int currentSum = 0;

    for (int num : arr) {
      currentSum += num;

      if (currentSum == 0 || prefixSums.contains(currentSum)) {
        return true;
      }
      prefixSums.add(currentSum);
    }
    return false;
  }
  public static void main(String[] args) {
    SubarrayWithZeroSum obj = new SubarrayWithZeroSum();
    int arr[] = {4, 2, -3, 1, 6};
    boolean result = obj.hasZeroSumSubarray(arr);
    if (result) {
      System.out.println("Subarray with zero sum exists.");
    } else {
      System.out.println("No subarray with zero sum exists.");
    }
  }
  
}
