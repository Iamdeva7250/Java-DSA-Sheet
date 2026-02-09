import java.util.*;
import java.io.*;

public class FindKthRotation {
    
    // Your code here
      public int findKRotation(int arr[]) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            // If array is already sorted
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = (low + high) / 2;
            int next = (mid + 1) % n;
            int prev = (mid + n - 1) % n;

            // Check if mid is the minimum element
            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            // Decide which half to search
            if (arr[mid] >= arr[low]) {
                low = mid + 1; // Minimum lies in right half
            } else {
                high = mid - 1; // Minimum lies in left half
            }
        }
        return 0; // Default (shouldn’t reach here for valid rotated array)
    }

    public static void main(String[] args) {
      FindKthRotation sol = new FindKthRotation();

      int arr[] = {5, 1, 2, 3, 4};

      System.out.println( "kth Rotation : "+ sol.findKRotation(arr));
    }
    
}