import java.util.*;
import java.io.*;

public class DesignaDataStructurewithMinandMaxoperations {
    
    // Your code here
    Deque<Integer> dq;

    DesignaDataStructurewithMinandMaxoperations(){
      dq = new LinkedList<Integer>();
    }
    
    void insertFront(int x){
      dq.offerFirst(x);
    }

    void insertLast(int x){
      dq.offerLast(x);
    }

    int getMin() {
      return dq.peekFirst();
    }

    int getMax() {
      return dq.peekLast();
    }

    int getExtractMin(){
      return dq.pollFirst();
    }

    int getExtractMax(){
      return dq.pollLast();
    }

    public static void main(String[] args) {
      DesignaDataStructurewithMinandMaxoperations ds = new DesignaDataStructurewithMinandMaxoperations();

      ds.insertFront(10);
      ds.insertLast(20);
      ds.insertFront(5);
      ds.insertLast(15);

      System.out.println("Min: " + ds.getMin());
      System.out.println("Max: " + ds.getMax());

      System.out.println("Extracted Min: " + ds.getExtractMin());
      System.out.println("Extracted Max: " + ds.getExtractMax());

      System.out.println("Min after extraction: " + ds.getMin());
      System.out.println("Max after extraction: " + ds.getMax());
    }
}
