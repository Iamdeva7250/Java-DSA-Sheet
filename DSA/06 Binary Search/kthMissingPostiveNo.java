public class kthMissingPostiveNo {
        public int findKthPositive(int[] arr, int k) {
            int n = arr.length;
            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int missing = arr[mid] - (mid + 1);

                if (missing < k) {
                    low = mid + 1; // kth missing is further right
                } else {
                    high = mid - 1; // kth missing is to the left
                }
            }

            // After binary search, answer is (high+1 + k)
            return high + 1 + k;
        }

        public static void main(String[] args) {
            kthMissingPostiveNo sol = new kthMissingPostiveNo();
            int[] arr = {2, 3, 4, 7, 11};
            int k = 5;
            System.out.println("Kth Missing Number is : " + sol.findKthPositive(arr, k)); // Output: 9
        }
    }


