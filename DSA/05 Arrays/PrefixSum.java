import java.util.*;

class PrefixSum {
    // Prefix sum array
    private int[] ps;

    // Constructor to preprocess prefix sums
    public PrefixSum(int[] arr) {   // ✅ Constructor must match class name
        int n = arr.length;
        ps = new int[n];
        ps[0] = arr[0];

        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + arr[i];
        }
    }

    // Function to get sum of range [l, r]
    public int getSum(int l, int r) {
        if (l == 0) return ps[r];
        return ps[r] - ps[l - 1];
    }

    // Main method for testing
    public static void main(String[] args) {
        int arr[] = {2, 8, 3, 9, 6, 5, 4};

        PrefixSum sol = new PrefixSum(arr);

        // Example queries
        System.out.println(sol.getSum(2, 4)); // 18 (3+9+6)
        System.out.println(sol.getSum(0, 5)); // 33 (2+8+3+9+6+5)
        System.out.println(sol.getSum(1, 3)); // 20 (8+3+9)
    }
}
