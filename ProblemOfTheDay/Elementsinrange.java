import java.util.*;
import java.io.*;

public class Elementsinrange {

    public ArrayList<Integer> cntInRange(int[] arr, int[][] queries) {

        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>(queries.length);

        for (int[] q : queries) {
            int a = q[0];
            int b = q[1];

            int left = lowerBound(arr, a);
            int right = upperBound(arr, b);

            result.add(right - left);
        }

        return result;
    }

    // First index with value >= target
    private int lowerBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] < target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    // First index with value > target
    private int upperBound(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= target)
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        Elementsinrange solver = new Elementsinrange();

        int[] arr = {1, 3, 5, 7, 9};
        int[][] queries = {{4, 8}, {1, 5}, {0, 10}};

        ArrayList<Integer> result = solver.cntInRange(arr, queries);
        System.out.println(result); // [2, 3, 5]
    }
}
