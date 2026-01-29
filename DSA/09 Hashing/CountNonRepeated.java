import java.util.*;
import java.io.*;

public class CountNonRepeated  {
    
    public static int countNonRepeat(int[] arr) {
        HashMap<Integer, Integer> result = new HashMap<>();

        // Count frequency of each number
        for (int num : arr) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        // Count numbers that appear only once
        for (int value : result.values()) {
            if (value == 1) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        System.out.println( "Non Repeation No : " + countNonRepeat(arr));
    }
}
