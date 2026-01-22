import java.util.*;

class MaximumIndex {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int[] LMin = new int[n];
        int[] RMax = new int[n];

        // Fill LMin[] (smallest element from left)
        LMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LMin[i] = Math.min(arr[i], LMin[i - 1]);
        }

        // Fill RMax[] (largest element from right)
        RMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            RMax[j] = Math.max(arr[j], RMax[j + 1]);
        }

        // Traverse both arrays to find max j - i
        int i = 0, j = 0, maxDiff = -1;
        while (i < n && j < n) {
            if (LMin[i] <= RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }


    public static void main(String[] args) {
        MaximumIndex sol = new MaximumIndex(); // ✅ FIXED

        int[] arr1 = {1, 10};
        int[] arr2 = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int[] arr3 = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};

        System.out.println("Result 1: " + sol.maxIndexDiff(arr1)); // 1
        System.out.println("Result 2: " + sol.maxIndexDiff(arr2)); // 6
        System.out.println("Result 3: " + sol.maxIndexDiff(arr3)); // 8
    }
}
