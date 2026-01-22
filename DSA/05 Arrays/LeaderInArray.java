public class LeaderInArray {
        public static void leaders(int[] arr, int n) {
            int currLeader = arr[n - 1];
            System.out.print(currLeader + " "); // last element is always a leader

            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] > currLeader) {
                    currLeader = arr[i];
                    System.out.print(currLeader + " ");
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {16, 17, 4, 3, 5, 2};
            int n = arr.length;
            leaders(arr, n);
        }
    }
