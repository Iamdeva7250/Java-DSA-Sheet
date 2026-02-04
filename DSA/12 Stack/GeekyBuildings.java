import java.util.*;
import java.io.*;

public class GeekyBuildings {
    
    // Your code here
    static boolean recreationalSpot(int[] arr, int n) {
        int min = arr[0];

        for (int j = 1; j < n - 1; j++) {
            if (arr[j] > min) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] < arr[j] && arr[k] > min)
                        return true;
                }
            }
            min = Math.min(min, arr[j]);
        }
        return false;
    }

    public static void main(String[] args) {
        GeekyBuildings obj = new GeekyBuildings();
        int[] arr = {7, 4, 8, 2, 9};
        int n = arr.length;
        boolean result = recreationalSpot(arr, n);
        System.out.println(result); 
    }
    
}