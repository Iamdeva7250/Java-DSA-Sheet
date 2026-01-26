import java.util.*;
import java.io.*;

public class GeneratePermutationsofanarray {
    
    // Your code here
     public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);                 // Step 1: sort
        boolean[] used = new boolean[arr.length];
        backtrack(arr, used, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] arr, boolean[] used,
                                  ArrayList<Integer> temp,
                                  ArrayList<ArrayList<Integer>> result) {

        // If one permutation is complete
        if (temp.size() == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            // Skip used elements
            if (used[i]) continue;

            // Skip duplicates
            if (i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            temp.add(arr[i]);

            backtrack(arr, used, temp, result);

            // Backtrack
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> permutations = permuteDist(arr);
        System.out.println("Unique permutations of the array: " + permutations);
    }
    
}