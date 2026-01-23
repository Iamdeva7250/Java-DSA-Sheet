import java.util.Arrays;
public class TripletSumArray {

        // Function to check if a pair exists with given sum using two pointers
        public boolean isPair(int[] arr, int n, int x, int si) {
            int i = si, j = n - 1;
            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum == x) {
                    return true;
                } else if (sum < x) {
                    i++;
                } else {
                    j--;
                }
            }
            return false;
        }

        // Function to check if a triplet exists with given sum
        public boolean isTriplet(int[] arr, int n, int x) {
            Arrays.sort(arr); // sort array
            for (int i = 0; i < n - 2; i++) {
                if (isPair(arr, n, x - arr[i], i + 1)) {
                    return true;
                }
            }
            return false;
        }

        // Driver test
        public static void main(String[] args) {
            TripletSumArray sol = new TripletSumArray();
            int[] arr = {2, 5, 8, 6, 6, 30};
            int x = 17;
            int n = arr.length;

            if (sol.isTriplet(arr, n, x)) {
                System.out.println("Triplet exists");
            } else {
                System.out.println("No triplet found");
            }
        }
    }


