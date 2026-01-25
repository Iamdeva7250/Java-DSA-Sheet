import java.util.*;

public class OptimalArray {  // Fixed typo in class name

    // Function to calculate optimal array operations
    public long[] optimalArray(int n, int a[]) {
        long[] ans = new long[n];
        ans[0] = 0; // For first element, no operation needed

        for (int i = 1; i < n; i++) {
            // The middle element is the median for first (i+1) elements
            ans[i] = ans[i - 1] + (a[i] - a[i / 2]);
        }

        return ans;
    }

    public static void main(String[] args) {
        // Example array (you can change it)
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Create object of OptimalArray class
        OptimalArray sol = new OptimalArray();
        long[] result = sol.optimalArray(n, arr);

        // Print the result
        System.out.println("Optimal array operations:");
        for (long val : result) {
            System.out.print(val + " ");
        }
    }
}
