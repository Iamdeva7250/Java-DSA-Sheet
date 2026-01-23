public class PairSum2Pointer {
        public static boolean isPair(int[] arr, int x) {

            int n = arr.length;
            int i = 0, j = n - 1;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == x) {
                    return true; // Pair found
                } else if (sum < x) {
                    i++; // move left pointer forward
                } else {
                    j--; // move right pointer backward
                }
            }
            return false; // No pair found
        }

        public static void main(String[] args) {
            int[] arr = {2, 5, 8, 12, 30};
            int x = 17;

            boolean result = isPair(arr, x);
            if (result) {
                System.out.println("Pair with sum " + x + " exists.");
            } else {
                System.out.println("No such pair exists.");
            }
        }
    }


