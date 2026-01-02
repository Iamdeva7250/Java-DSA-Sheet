import java.util.*;
import java.io.*;

public class CountIndicestoBalanceEvenandOddSums {

    // Function to count balanced indices
    public int cntWays(int[] arr) {

        int n = arr.length;

        int rightEven = 0, rightOdd = 0;

        // Calculate total even and odd index sums
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                rightEven += arr[i];
            else
                rightOdd += arr[i];
        }

        int leftEven = 0, leftOdd = 0;
        int count = 0;

        // Check for each index removal
        for (int i = 0; i < n; i++) {

            // Remove current element from right side
            if (i % 2 == 0)
                rightEven -= arr[i];
            else
                rightOdd -= arr[i];

            // After removal, parity of right side flips
            int newEvenSum = leftEven + rightOdd;
            int newOddSum = leftOdd + rightEven;

            if (newEvenSum == newOddSum)
                count++;

            // Add current element to left side
            if (i % 2 == 0)
                leftEven += arr[i];
            else
                leftOdd += arr[i];
        }

        return count;
    }

    // MAIN METHOD (for VS Code execution)
    public static void main(String[] args) {

        CountIndicestoBalanceEvenandOddSums obj =
                new CountIndicestoBalanceEvenandOddSums();

        int[] arr = {2, 1, 6, 4};

        int result = obj.cntWays(arr);

        System.out.println(result); // Expected output: 1
    }
}
