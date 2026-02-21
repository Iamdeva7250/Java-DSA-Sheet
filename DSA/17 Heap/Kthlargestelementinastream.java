import java.util.*;
import java.io.*;

public class Kthlargestelementinastream {
    
    // Your code here
    public void kthLargest(int arr[], int n, int k) {
        // Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i = 0; i < n; i++){
            minHeap.add(arr[i]);
            
            if(minHeap.size() > k){
                minHeap.poll();
            }
            
            if(minHeap.size() < k){
                System.out.print("-1 ");
            }else{
                System.out.print(minHeap.peek()  + " ");
            }
        }
    }

    public static void main(String[] args) {
        Kthlargestelementinastream solution = new Kthlargestelementinastream();
        int[] arr = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;
        int n = arr.length;
        solution.kthLargest(arr, n, k);
    }
    
}