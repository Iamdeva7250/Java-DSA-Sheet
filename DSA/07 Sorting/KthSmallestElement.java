import java.util.*;

public class KthSmallestElement {

    public int kthSmallest(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int p = partition(arr, low, high);

            if (p == k - 1) {
                return arr[p];  // found the kth smallest
            } else if (p > k - 1) {
                high = p - 1;   // search left part
            } else {
                low = p + 1;    // search right part
            }
        }
        return -1;
    }

    // Lomuto partition scheme
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // place pivot at correct position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    // Quick test
    public static void main(String[] args) {
        KthSmallestElement obj = new KthSmallestElement();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest element is: " + obj.kthSmallest(arr, k));
    }
}
