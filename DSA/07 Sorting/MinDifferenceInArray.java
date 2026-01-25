import java.util.*;

public class MinDifferenceInArray {
  
  public int mindifference(int[] arr, int n) {
    Arrays.sort(arr);
    int res = Integer.MAX_VALUE;

  
    for (int i = 1; i < n; i++) {
      res = Math.min(res, arr[i] - arr[i - 1]);
    }

    return res; 
  }

  public static void main(String[] args) {
    MinDifferenceInArray sol = new MinDifferenceInArray();
    int arr[] = {1, 8, 12, 15, 5, 18};
    int n = arr.length;

    System.out.println("Minimum Difference is: " + sol.mindifference(arr, n));
  }
}
