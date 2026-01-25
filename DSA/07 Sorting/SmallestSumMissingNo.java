import java.util.*;

public class SmallestSumMissingNo {
    // Function to find the smallest positive missing number
    long smallestpositive(long[] array, int n) {

        // Step 1: Replace all numbers <= 0 or > n with n+1
        for (int i = 0; i < n; i++) {
            if (array[i] <= 0 || array[i] > n) {
                array[i] = n + 1;
            }
        }

        // Step 2: Mark indices based on values
        for (int i = 0; i < n; i++) {
            long num = Math.abs(array[i]);
            if (num >= 1 && num <= n) {
                int index = (int) (num - 1);
                if (array[index] > 0) {
                    array[index] = -array[index];
                }
            }
        }

        // Step 3: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (array[i] > 0)
                return i + 1;
        }

        // Step 4: All numbers 1..n present
        return n + 1;
    }

    // Main method inside the same class
    public static void main(String[] args) {
        SmallestSumMissingNo sol = new SmallestSumMissingNo();

        long[] array = {0, -10, 1, 3, -20};
        int n = array.length;

        long result = sol.smallestpositive(array, n);
        System.out.println("Smallest missing positive number: " + result);
    }
}
