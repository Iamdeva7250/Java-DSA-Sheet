import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class ArrayDewueAsQueue {
    
    // Your code here
    public static void main(String[] args) {
      
      ArrayDeque<Integer> qu = new ArrayDeque<Integer>();

      qu.offer(10);
      qu.offer(20);
      qu.offer(30);

      System.out.println("Queue: " + qu);
      System.out.println("Removed element: " + qu.poll());
      System.out.println("Queue after removal: " + qu);
      System.out.println("Front element: " + qu.peek());
      qu.offer(40);
      System.out.println("Queue after adding 40: " + qu);

      System.out.println("Size of queue: " + qu.size());

      

    }
    
}