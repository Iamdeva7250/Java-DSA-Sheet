public class WineSelling {
        public long wineSelling(int[] arr, int n) {
            long cost = 0;
            int balance = 0; // running balance of wines (positive = extra to sell, negative = need to buy)

            for (int i = 0; i < n; i++) {
                balance += arr[i];   // accumulate sellers (+) and buyers (-)
                cost += Math.abs(balance); // distance cost is accumulated imbalance
            }

            return cost;
        }

        public static void main(String[] args) {
            WineSelling sol = new WineSelling();

            int[] arr1 = {5, -4, 1, -3, 1};
            System.out.println(sol.wineSelling(arr1, arr1.length)); // 9

            int[] arr2 = {5, -2, -3};
            System.out.println(sol.wineSelling(arr2, arr2.length)); // 8
        }
    }
