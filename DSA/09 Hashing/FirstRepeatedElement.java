import java.util.*;
import java.io.*;

public class FirstRepeatedElement {

    public static int firstrepeted(int[] arr) {
        int MAX = 1000000;
        int[] freq = new int[MAX + 1];

        // Step 1: Count frequency of each element
        for (int num : arr) {
            freq[num]++;
        }

        // Step 2: Find first element with freq > 1
        for (int i = 0; i < arr.length; i++) {
            if (freq[arr[i]] > 1) {
                return i + 1; // 1-based index
            }
        }

        // Step 3: If no repeated element found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstrepeted(arr));
    }
}
