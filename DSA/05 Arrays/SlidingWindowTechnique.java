public class SlidingWindowTechnique {
        int maxSum(int arr[], int n, int k) {
            int curr = 0;

            // Calculate sum of first k elements
            for (int i = 0; i < k; i++) {
                curr += arr[i];
            }

            int res = curr;

            // Sliding window
            for (int i = k; i < n; i++) {
                curr = curr + arr[i] - arr[i - k];
                res = Math.max(res, curr);
            }

            return res;
        }

        public static void main(String[] args) {
            SlidingWindowTechnique sol = new SlidingWindowTechnique();
            int arr[] = {1, 8, 30, -5, 20, 7};
            int n = arr.length;
            int k = 3;

            System.out.println("Maximum sum of " + k + " consecutive elements: " + sol.maxSum(arr, n, k));
        }
    }

