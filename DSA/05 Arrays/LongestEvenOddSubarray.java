public class LongestEvenOddSubarray {

        static int maxEvenOdd(int arr[], int n) {
            int res = 1;   // Stores result
            int curr = 1;  // Stores length of current alternating subarray

            for (int i = 1; i < n; i++) {
                if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) ||
                        (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {

                    curr++;
                    res = Math.max(res, curr);
                } else {
                    curr = 1;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int arr[] = {5, 10, 20, 6, 3, 8};
            int n = arr.length;

            System.out.println(maxEvenOdd(arr, n));
        }
    }
