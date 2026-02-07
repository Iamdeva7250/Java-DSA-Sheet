import java.util.*;
import java.io.*;

public class DequeueTraversal {
    
    // Your code here
    

    // Function to traverse the Deque and print the elements of it.
    public static void printDeque(ArrayDeque<Integer> deq) {
        // Your code here
        Iterator<Integer> it = deq.iterator();
        
        while(it.hasNext()){
            System.out.print(it.next());
            
            if(it.hasNext()) System.out.print(" ");
        }
       
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        
        System.out.println("Traversing Dequeue:");
        printDeque(deq);
    }
}
