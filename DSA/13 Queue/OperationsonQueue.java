import java.util.*;
import java.io.*;

public class OperationsonQueue {
    
    // Your code here
 
     LinkedList<Integer> q;

    public OperationsonQueue() {
        // initialize your queue
        q = new LinkedList<>();
    }

    public void enqueue(int x) {
        // insert x into queue
        q.addLast(x);
    }

    public void dequeue() {
        // remove front element from queue
        if(!q.isEmpty()){
            q.removeFirst();
        }
    }

    public int getFront() {
        // return the front element of the queue
        
        if(q.isEmpty()) return -1;
        
        return q.getFirst();
    }

    public int getRear() {
        // return the rear element of the queue
        
        if(q.isEmpty()) return -1;
        
        return q.getLast();
    }

    public boolean isEmpty() {
        // check whether the queue is empty
        
        return q.isEmpty();
    }

    public int size() {
        // return the size of the queue
        
        return q.size();
    }

    public static void main(String[] args) {
        OperationsonQueue queue = new OperationsonQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Front element: " + queue.getFront()); 
        System.out.println("Rear element: " + queue.getRear());   
        System.out.println("Queue size: " + queue.size());      
        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.getFront()); 
    }
}