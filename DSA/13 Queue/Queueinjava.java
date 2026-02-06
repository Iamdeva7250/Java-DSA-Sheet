import java.util.*;
import java.io.*;

public class Queueinjava {
    
    // Your code here

    public static void main(String[] args) {
      Queue<Integer> qst = new LinkedList<Integer>();

      Queue<Integer> q = new ArrayDeque<Integer>();

      q.offer(10);
      q.offer(20);
      q.offer(30);
      System.out.println("size of queue : "  + q.size());
      System.out.println(q.isEmpty());
      System.out.println(q);

      System.out.println("head of queue : " + q.peek());

      System.out.println("removed element : " + q.poll());
      System.out.println(q);

      System.out.println("front element : " + q.peek());


    }
 
    
}