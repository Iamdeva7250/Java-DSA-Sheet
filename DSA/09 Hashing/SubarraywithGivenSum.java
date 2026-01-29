import java.util.*;
class SubarraywithGivenSum {
  boolean hasSubarrayWithGivenSum(int arr[], int targetSum) {
    HashSet<Integer> prefixSums = new HashSet<>();
    int currentSum = 0;

    for (int num : arr) {
      currentSum += num;

      if (currentSum == targetSum || prefixSums.contains(currentSum - targetSum)) {
        return true;
      }
      prefixSums.add(currentSum);
    }
    return false;
  }

  public static void main(String[] args) {
    SubarraywithGivenSum obj = new SubarraywithGivenSum();
    int arr[] = {4, 2, -3, 1, 6};
    int targetSum = 6;
    boolean result = obj.hasSubarrayWithGivenSum(arr, targetSum);
    if (result) {
      System.out.println("Subarray with given sum exists.");
    } else {
      System.out.println("No subarray with given sum exists.");
    }
  }
}