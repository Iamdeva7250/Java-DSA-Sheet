import java.util.*;
import java.io.*;

public class Nearlysorted {
    
    // Your code here
    public void nearlySorted(int[] arr, int k) {
        // Min-heap to store k+1 elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int index = 0;
        
        // Step 1: Push first k+1 elements into the heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            pq.add(arr[i]);
        }
        
        // Step 2: Process the rest of the elements
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll(); // extract smallest
            pq.add(arr[i]);           // add next element
        }
        
        // Step 3: Extract remaining elements
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }


    public static void main(String[] args) {
        Nearlysorted ns = new Nearlysorted();
        int[] arr = {3, 2, 1, 5, 4, 6};
        int k = 2;
        
        ns.nearlySorted(arr, k);
        
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    
}