import java.util.*;
import java.io.*;

public class BuildHeap {
    
    // Your code here
      public static void main (String[] args) {
        
        // DECLARING MAX HEAP
        Queue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
            
        // Add elements to the Max Heap
        // in any order
        max_heap.add(10); 
        max_heap.add(30); 
        max_heap.add(20); 
        max_heap.add(5); 
         max_heap.add(1); 
           
         // Print element at top of the heap 
        // every time and remove it until the 
        // heap is not empty
        System.out.print("Element at top of Max Heap at" + " every step:\n");

        while(!max_heap.isEmpty()) { 
            // Print Top Element
            System.out.print(max_heap.peek()+" ");
            
            // Remove Top Element
            max_heap.poll();
        }
        
        // DECLARING MIN HEAP
        Queue<Integer> min_heap = new PriorityQueue<>(); 
          
        // Add elements to the Min Heap
        // in any order
        min_heap.add(10); 
        min_heap.add(30); 
        min_heap.add(20); 
        min_heap.add(5); 
        min_heap.add(1); 
           
        // Print element at top of the heap 
        // every time and remove it until the 
        // heap is not empty
        System.out.print("\n\nElement at top of Min Heap " 
                                    + "at every step:\n");
        while(!min_heap.isEmpty()) { 
           // Print Top Element
           System.out.print(min_heap.peek()+" ");
            
           // Remove Top Element
           min_heap.poll();
        }
    }
    
}