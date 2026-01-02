import java.util.*;
import java.io.*;

public class Sort0s1sand2s {
    
     public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { 
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Sort0s1sand2s sorter = new Sort0s1sand2s();
        int[] arr = {2, 0, 1, 2, 1, 0};
        
        sorter.sort012(arr);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
}