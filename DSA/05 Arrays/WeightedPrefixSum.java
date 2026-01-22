
    import java.util.*;

    class WeightedPrefixSum {
        private int[] ps;   // prefix sum
        private int[] wps;  // weighted prefix sum

        // Constructor to preprocess prefix sums
        public WeightedPrefixSum(int[] arr) {
            int n = arr.length;
            ps = new int[n];
            wps = new int[n];

            ps[0] = arr[0];
            wps[0] = arr[0]; // 1 * arr[0]

            for (int i = 1; i < n; i++) {
                ps[i] = ps[i - 1] + arr[i];
                wps[i] = wps[i - 1] + (i + 1) * arr[i];
            }
        }

        // Function to get weighted sum in range [l, r]
        public int getWSum(int l, int r) {
            if (l == 0) return wps[r];
            return (wps[r] - wps[l - 1]) - l * (ps[r] - ps[l - 1]);
        }

        // Main method
        public static void main(String[] args) {
            int arr[] = {2, 3, 5, 4, 6, 1};

            WeightedPrefixSum sol = new WeightedPrefixSum(arr);

            System.out.println(sol.getWSum(0, 2)); // 23
            System.out.println(sol.getWSum(2, 4)); // 38  (1*5 + 2*4 + 3*6)
            System.out.println(sol.getWSum(1, 3)); // 25  (1*3 + 2*5 + 3*4)
        }
    }

