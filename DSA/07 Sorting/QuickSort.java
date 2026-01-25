import java.util.*;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low; 

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // swap arr[i] and arr[high] (put pivot in correct place)
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // ✅ pivot index
    }

    
    public static void main(String args[]) {
        QuickSort sol = new QuickSort();
        int[] arr = {4, 1, 5, 2, 45, 6, 9, 87, 10, 11};
    

        System.out.println("Before using Quick Sort: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        sol.quickSort(arr, 0, arr.length - 1);

        System.out.println("\n After using Quick Sort: ");
        for(int num : arr){
            System.out.print( num + " ");
        }
      
    }
}
