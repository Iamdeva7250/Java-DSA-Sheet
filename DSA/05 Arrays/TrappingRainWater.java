public class TrappingRainWater {

        public int getWater(int arr[], int n) {
            int res = 0;
            int[] lMax = new int[n];
            int[] rMax = new int[n];

            // Step 1: Fill lMax
            lMax[0] = arr[0];
            for (int i = 1; i < n; i++) {
                lMax[i] = Math.max(arr[i], lMax[i - 1]);
            }

            // Step 2: Fill rMax
            rMax[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rMax[i] = Math.max(arr[i], rMax[i + 1]);
            }

            // Step 3: Calculate trapped water
            for (int i = 1; i < n - 1; i++) {
                res += Math.min(lMax[i], rMax[i]) - arr[i];
            }

            return res;
        }

        // Driver code
        public static void main(String[] args) {
            TrappingRainWater sol = new TrappingRainWater();
            int arr[] = {2, 1, 3, 4, 5, 6};
            int n = arr.length;
            System.out.println("Trapped Water: " + sol.getWater(arr, n));
        }
    }
