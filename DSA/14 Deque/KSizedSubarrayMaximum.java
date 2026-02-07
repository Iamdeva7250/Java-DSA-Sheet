import java.util.*;
import java.io.*;

public class KSizedSubarrayMaximum {
    
    // Your code here

    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of this window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements (not useful)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Add max for current window
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        KSizedSubarrayMaximum obj = new KSizedSubarrayMaximum();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        ArrayList<Integer> maxValues = obj.maxOfSubarrays(arr, k);
        System.out.println("Maximums of each subarray of size " + k + ": " + maxValues);
    }
    
}