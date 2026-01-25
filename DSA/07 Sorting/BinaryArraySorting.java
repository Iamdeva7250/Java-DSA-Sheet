import java.util.*;
public class BinaryArraySorting {

    public void binSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            while (arr[low] == 0 && low < high) {
                low++;
            }
            while (arr[high] == 1 && low < high) {
                high--;
            }
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
    }

    // Test the code
    public static void main(String[] args) {
        BinaryArraySorting sol = new BinaryArraySorting();
        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        sol.binSort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}

  

