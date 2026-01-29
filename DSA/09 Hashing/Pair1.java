import java.util.*;
import java.io.*;

public class Pair1 {
    
    public static int pairone(int arr[], int sum, int N) {

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int complement = sum - arr[i];

            if (result.contains(complement)) {
                return 1; // Found the pair
            }
            result.add(arr[i]);
        }
        return 0; // No pair found
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 14;

        System.out.println("Pair exists: " + pairone(arr, sum, arr.length));
    }
}
