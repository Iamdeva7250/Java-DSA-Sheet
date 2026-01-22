public class ThreeEquilibriumSum {
        // Function to check if array can be partitioned into 3 contiguous parts with equal sum
        public boolean canThreePartsEqualSum(int[] arr) {
            long total = 0;
            for (int v : arr) total += v;

            if (total % 3 != 0) return false;
            long target = total / 3;

            int count = 0;
            long curr = 0;
            for (int v : arr) {
                curr += v;
                if (curr == target) {
                    count++;
                    curr = 0;
                }
            }
            return count >= 3;
        }

        // Main method for testing
        public static void main(String[] args) {
            ThreeEquilibriumSum sol = new ThreeEquilibriumSum();

            int[] arr1 = {5, 2, 6, 1, 1, 1, 1, 4};   // Example 1
            int[] arr2 = {3, 2, 5, 1, 1, 1, 5};      // Example 2

            System.out.println(sol.canThreePartsEqualSum(arr1)); // true
            System.out.println(sol.canThreePartsEqualSum(arr2)); // false
        }
    }


