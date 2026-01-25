import java.util.*;

public class ChocolateDistribution {

    public int chocolatedist(int arr[], int n, int m) {
        if (m > n) {
            return -1; 
        }

        // Sort the packets
        Arrays.sort(arr);

    
        int res = arr[m - 1] - arr[0];
        for (int i = 1; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            res = Math.min(res, diff);
        }

        return res;
    }

    public static void main(String[] args) {
        ChocolateDistribution sol = new ChocolateDistribution();

        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int n = arr.length;
        int m = 3; // number of students

        System.out.println("Minimum difference is: " + sol.chocolatedist(arr, n, m));
    }
}
