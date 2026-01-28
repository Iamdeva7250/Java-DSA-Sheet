import java.util.*;
import java.io.*;

public class CountSubsetWithTargetSumII {
    
    // Your code here
     public int countSubset(int[] arr, int k) {
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        Map<Integer, Integer> leftMap = new HashMap<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        generateSums(left, 0, 0, leftMap);
        generateSums(right, 0, 0, rightMap);

        int count = 0;

        for (int sum : leftMap.keySet()) {
            int need = k - sum;
            if (rightMap.containsKey(need)) {
                count += leftMap.get(sum) * rightMap.get(need);
            }
        }

        return count;
    }

    private void generateSums(int[] arr, int idx, int sum, Map<Integer, Integer> map) {
        if (idx == arr.length) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            return;
        }

        // Exclude current element
        generateSums(arr, idx + 1, sum, map);

        // Include current element
        generateSums(arr, idx + 1, sum + arr[idx], map);
    }
    public static void main(String[] args) {
        CountSubsetWithTargetSumII counter = new CountSubsetWithTargetSumII();
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 5;
        int result = counter.countSubset(arr, targetSum);
        System.out.println("Number of subsets with target sum " + targetSum + ": " + result);
    }
    
}