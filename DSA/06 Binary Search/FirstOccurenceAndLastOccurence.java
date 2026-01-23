import java.util.Arrays;
import java.util.*;
public class FirstOccurenceAndLastOccurence {

        // Returns index of FIRST occurrence of x in arr, else -1
        static int first(int arr[], int x, int n) {
            int low = 0, high = n - 1, res = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2; // safe midpoint

                if (arr[mid] > x) {
                    high = mid - 1;
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    res = mid;       // possible answer
                    high = mid - 1;  // keep searching left
                }
            }
            return res;
        }

        // Returns index of LAST occurrence of x in arr, else -1
        static int last(int arr[], int x, int n) {
            int low = 0, high = n - 1, res = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2; // safe midpoint

                if (arr[mid] > x) {
                    high = mid - 1;
                } else if (arr[mid] < x) {
                    low = mid + 1;
                } else {
                    res = mid;       // possible answer
                    low = mid + 1;   // keep searching right
                }
            }
            return res;
        }

        // Driver code
        public static void main(String[] args) {
            int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
            int n = arr.length;
            int x = 8;

            System.out.println("First Occurrence = " + first(arr, x, n));
            System.out.println("Last Occurrence = " + last(arr, x, n));
        }
    }




