public class TwoRepeatinElement {
        public int[] twoRepeated(int[] arr) {
            int n = arr.length;
            int[] ans = new int[2];
            int idx = 0;

            for (int i = 0; i < n; i++) {
                int num = Math.abs(arr[i]);  // absolute value in case it's already marked

                if (arr[num] < 0) {
                    ans[idx++] = num; // found a repeated number
                    if (idx == 2) break; // stop after finding 2
                } else {
                    arr[num] = -arr[num]; // mark as visited
                }
            }

            return ans;
        }

        public static void main(String[] args) {
            TwoRepeatinElement sol = new TwoRepeatinElement();
            int[] arr = {1, 2, 1, 3, 4, 3};  // n = 4
            int[] res = sol.twoRepeated(arr);
            System.out.println("Repeated elements: " + res[0] + ", " + res[1]);
        }
    }


