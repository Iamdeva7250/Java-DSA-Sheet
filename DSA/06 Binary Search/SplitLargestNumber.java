public class SplitLargestNumber {
        public int splitArray(int[] nums, int k) {
            int low = 0, high = 0;
            for (int num : nums) {
                low = Math.max(low, num); // max element
                high += num;              // total sum
            }

            int ans = high;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (canSplit(nums, k, mid)) {
                    ans = mid;
                    high = mid - 1; // try smaller
                } else {
                    low = mid + 1;  // need bigger sum
                }
            }
            return ans;
        }

        // Check if we can split into <= k subarrays with max sum <= maxAllowed
        private boolean canSplit(int[] nums, int k, int maxAllowed) {
            int count = 1; // at least one subarray
            int currSum = 0;
            for (int num : nums) {
                if (currSum + num > maxAllowed) {
                    count++;
                    currSum = num;
                    if (count > k) return false;
                } else {
                    currSum += num;
                }
            }
            return true;
        }

        // Test
        public static void main(String[] args) {
            SplitLargestNumber sol = new SplitLargestNumber();
            int[] nums = {7, 2, 5, 10, 8};
            int k = 2;
            System.out.println( " THe Largest Split number is : " + sol.splitArray(nums, k)); // Output: 18
        }
    }


