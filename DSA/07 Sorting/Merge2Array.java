import java.util.*;

public class Merge2Array {
    static void mergetwoArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        // Sort both arrays first
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        System.out.println("Merged and Sorted Array:");
        
        // Merge process
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        // Print remaining elements of arr1
        while (i < n) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        // Print remaining elements of arr2
        while (j < m) {
            System.out.print(arr2[j] + " ");
            j++;
        }

        System.out.println(); // new line at end
    }

    public static void main(String[] args) {
        int[] arr1 = {20, 30, 40, 6, 40};
        int[] arr2 = {10, 15, 20, 30, 40, 50};

        // Call the function
        mergetwoArray(arr1, arr2);
    }
}
