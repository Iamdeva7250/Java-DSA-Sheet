import java.util.*;
import java.io.*;

public class PrintNonRepeated {

    public static ArrayList<Integer> print(int[] arr, int n) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Collect non-repeated elements
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (freq.get(num) == 1) {
                result.add(num);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};

        System.out.println("Non-Repeated Numbers: " + print(arr, n));
    }
}
