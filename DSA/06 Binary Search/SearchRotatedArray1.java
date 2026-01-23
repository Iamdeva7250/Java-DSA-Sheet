import java.util.ArrayList;
import java.util.Arrays;

public class SearchRotatedArray1 {
    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // safe midpoint

            // If mid points to the target
            if (arr.get(mid) == k)
                return mid;

            // If left half is sorted
            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k <= arr.get(mid)) {
                    high = mid - 1; // Target in left half
                } else {
                    low = mid + 1;  // Target in right half
                }
            }
            // Otherwise, right half is sorted
            else {
                if (arr.get(mid) <= k && k <= arr.get(high)) {
                    low = mid + 1;  // Target in right half
                } else {
                    high = mid - 1; // Target in left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = arr.size();
        int k = 1;

        int ans = search(arr, n, k);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
