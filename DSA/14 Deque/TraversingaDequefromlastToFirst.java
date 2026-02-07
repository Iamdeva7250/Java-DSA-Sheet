import java.util.*;
import java.io.*;

public class TraversingaDequefromlastToFirst {
    
    // Your code here
    public static void main(String[] args) {
      
      Deque<Integer> d = new LinkedList<Integer>();

      d.addFirst(10);
      d.addLast(20);
      d.addFirst(5);
      d.addLast(15);

      // Traversing from last to first

      System.out.print("Traversing from last to first: ");

      Iterator it = d.descendingIterator();

      while(it.hasNext()){
          System.out.print(it.next() + " ");
      }
    }
    
}