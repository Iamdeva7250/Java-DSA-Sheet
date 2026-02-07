import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class ArrayDequeAsDeque {
    
    // Your code here
    public static void main(String[] args) {
      
      ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

      ad.offerFirst(10);
      ad.offerLast(20);
      ad.offerFirst(5);
      ad.offerLast(15);

      System.out.println("Deque: " + ad);
      System.out.println("First element: " + ad.peekFirst());
      System.out.println("Last element: " + ad.peekLast());
      System.out.println("Removed first element: " + ad.pollFirst());
      System.out.println("Removed last element: " + ad.pollLast());
      System.out.println("Deque after removals: " + ad);

      System.out.println("Size of deque: " + ad.size());

      


    }
    
}