import java.util.*;
import java.io.*;

public class Kthsmallestelement {
    
    // Your code here
        public int kthSmallest(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : arr){
            maxHeap.add(num);
            
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Kthsmallestelement solution = new Kthsmallestelement();
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int result = solution.kthSmallest(arr, k);
        System.out.println("The " + k + "-th smallest element is: " + result);
    }
    
}