import java.util.*;

public class KSizedSubarrayMaximum {

    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {

        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            // Add max of window
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        KSizedSubarrayMaximum obj = new KSizedSubarrayMaximum();

        int[] arr = {1, 3, 1, 2, 0, 5};
        int k = 3;

        ArrayList<Integer> ans = obj.maxOfSubarrays(arr, k);

        System.out.println(ans); 
    }
}
