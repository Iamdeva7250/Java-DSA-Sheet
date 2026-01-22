public class MaxCircularSubarraySum {

        // Standard Kadane's Algorithm to find max subarray sum
        static int normalMaxSum(int arr[], int n) {
            int res = arr[0];
            int maxEnding = arr[0];

            for (int i = 1; i < n; i++) {
                maxEnding = Math.max(arr[i], maxEnding + arr[i]);
                res = Math.max(res, maxEnding);
            }
            return res;
        }

        // Function to find overall maximum circular subarray sum
        static int overallMaxSum(int arr[], int n) {
            int maxNormal = normalMaxSum(arr, n);

            // If all numbers are negative
            if (maxNormal < 0) {
                return maxNormal;
            }

            // Compute circular sum
            int arrSum = 0;
            for (int i = 0; i < n; i++) {
                arrSum += arr[i];
                arr[i] = -arr[i];  // Invert values for Kadane's on "non-contributing elements"
            }

            int maxCircular = arrSum + normalMaxSum(arr, n);

            return Math.max(maxNormal, maxCircular);
        }

        public static void main(String[] args) {
            int arr[] = {8, -4, 3, -5, 4};
            int n = arr.length;

            System.out.println("Maximum Circular Subarray is :  " + overallMaxSum(arr, n));
        }
    }
