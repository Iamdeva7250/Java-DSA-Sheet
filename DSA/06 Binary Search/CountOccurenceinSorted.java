import java.util.*;
public class CountOccurenceinSorted {

    static int firstOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    static int lastOcc(int arr[], int n, int x) {
        int low = 0, high = n - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    static int countOcc(int arr[], int n, int x) {
        int first = firstOcc(arr, n, x);
        if (first == -1) return 0;
        return lastOcc(arr, n, x) - first + 1;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 20, 20, 40, 40};
        int n = arr.length;
        int x = 20;
        System.out.println("Count of " + x + " = " + countOcc(arr, n, x));
    }
}
