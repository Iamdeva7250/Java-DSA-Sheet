import java.util.*;
import java.io.*;

public class Nextelementwithgreaterfrequency {
    
    // Your code here

    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        int n = arr.length;

        // Step 1: Frequency Map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        // Step 2: Stack for indices
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        // Step 3: Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            // Pop elements with smaller or equal frequency
            while (!st.isEmpty() &&
                   freq.get(arr[st.peek()]) <= freq.get(arr[i])) {
                st.pop();
            }

            // If stack empty → no greater frequency
            res[i] = st.isEmpty() ? -1 : arr[st.peek()];

            // Push current index
            st.push(i);
        }

        // Convert to ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
        for (int x : res) ans.add(x);

        return ans;
      }


      public static void main(String[] args) {
        Nextelementwithgreaterfrequency obj = new Nextelementwithgreaterfrequency();
        int[] arr = {1, 1, 2, 3, 4, 2, 1};
        ArrayList<Integer> result = obj.nextFreqGreater(arr);
        System.out.println(result); 
      }
    
}