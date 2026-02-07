import java.util.*;
import java.io.*;

public class DequeTraversal {
    
    // Your code here
      public static void printDeque(ArrayDeque<Integer> deq) {
        // code here
        
        for(Integer val : deq){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        
        System.out.println("Traversing Deque:");
        printDeque(deq);
    }
    
}