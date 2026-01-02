import java.util.*;
import java.io.*;

public class Constructanarrayfromitspair {
    
    public ArrayList<Integer> constructArr(int[] arr) {
        int m = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        if (m == 0) return res;

        // compute n from pair-sum size: n*(n-1)/2 = m
        int n = (int)((1 + Math.sqrt(1 + 8L * m)) / 2);

        // Special case: original array has size 2
        if (n == 2) {
            res.add(1);          // any number
            res.add(arr[0] - 1); // sum must match arr[0]
            return res;
        }

        // Regular case: n >= 3
        res = new ArrayList<>(Collections.nCopies(n, 0));
        res.set(0, (arr[0] + arr[1] - arr[n - 1]) / 2);

        for (int i = 1; i < n; i++) {
            res.set(i, arr[i - 1] - res.get(0));
        }

        return res;
    }

    // Test driver
    public static void main(String[] args) {
        Constructanarrayfromitspair sol = new Constructanarrayfromitspair();

        int[] arr1 = {4, 5, 3};
        int[] arr2 = {10};      
        int[] arr3 = {6, 4, 4, 8, 8, 6};

        System.out.println(sol.constructArr(arr1)); // [3,1,2]
        System.out.println(sol.constructArr(arr2)); // [1,9]
        System.out.println(sol.constructArr(arr3)); // [2,4,2,4]
    }
}
