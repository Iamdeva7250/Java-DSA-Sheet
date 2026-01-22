import java.util.*;
public class SmallestMissingNo {

        public static int missingNumber(int[] arr) {
            int n = arr.length;

            // Step 1: Replace negatives, zeros, and numbers > n with n+1
            for (int i = 0; i < n; i++) {
                if (arr[i] <= 0 || arr[i] > n) {
                    arr[i] = n + 1;
                }
            }

            // Step 2: Use index as a marker
            for (int i = 0; i < n; i++) {
                int val = Math.abs(arr[i]);
                if (val >= 1 && val <= n) {
                    int idx = val - 1;
                    if (arr[idx] > 0) {
                        arr[idx] = -arr[idx]; // mark visited
                    }
                }
            }

            // Step 3: Find first positive index
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    return i + 1;
                }
            }

            // Step 4: If all [1..n] are present, missing is n+1
            return n + 1;
        }


        public static void main(String[] args) {
            int[] arr = {2, -3, 4, 1, 1, 7};
            System.out.println("Smallest Positive Missing Number: " + missingNumber(arr));
        }
    }
