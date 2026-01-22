public class MaxConsecutiveOnes {

        public static int maxConsecutiveOnes(int[] arr) {
            int res = 0, curr = 0;
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    curr = 0; // reset streak when 0 appears
                } else {
                    curr++;
                    res = Math.max(res, curr); // update max streak
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1};
            System.out.println("Maximum Consecutive Ones = " + maxConsecutiveOnes(arr));
        }
    }
