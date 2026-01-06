import java.util.*;
import java.io.*;

public class Countdistinctelementsineverywindow {
    
    // Your code here
      ArrayList<Integer> countDistinct(int arr[], int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        // First window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());

        // Remaining windows
        for (int i = k; i < n; i++) {
            // Remove outgoing element
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            // Add incoming element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            result.add(map.size());
        }

        return result;
    }

    public static void main(String[] args) {
        Countdistinctelementsineverywindow solution = new Countdistinctelementsineverywindow();
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        ArrayList<Integer> result = solution.countDistinct(arr, k);
        System.out.println("Count of Distinct Elements in every window of size " + k + ": " + result);
    }
    
}