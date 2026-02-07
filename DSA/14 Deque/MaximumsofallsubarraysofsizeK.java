import java.util.*;
import java.io.*;

public class MaximumsofallsubarraysofsizeK {

    public static void printmaximum(int[] arr, int k) {
        int n = arr.length;

        Deque<Integer> dq = new LinkedList<>();

        // Process first k elements
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        // Process remaining elements
        for (int i = k; i < n; i++) {

            // Print maximum of previous window
            System.out.println(arr[dq.peekFirst()]);

            // Remove elements out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }

        // Print max of last window
        System.out.println(arr[dq.peekFirst()]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        printmaximum(arr, k);
    }
}
