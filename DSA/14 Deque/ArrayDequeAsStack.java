import java.util.*;
import java.io.*;

public class ArrayDequeAsStack {
    
    // Your code here
    public static void main(String[] args) {
      Deque<Integer> stack = new ArrayDeque<Integer>();

      // Push elements onto the stack
      stack.push(10);
      stack.push(20);
      stack.push(30);

      System.out.println("Stack: " + stack);
      // Pop elements from the stack
      System.out.println("Popped element: " + stack.pop());
      System.out.println("Stack after pop: " + stack);
      System.out.println("Top element: " + stack.peek());

      stack.push(40);
      System.out.println("Stack after pushing 40: " + stack);
      

    }
    
}