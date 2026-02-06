import java.util.*;
import java.io.*;

public class QueueUsingArray {
    
    // Your code here
     int[] arr;
    
    int front, rear, size, capacity;

    // Constructor
    public QueueUsingArray(int n) {
        // Define Data Structures
        
        capacity = n;
        arr = new int[n];
        front = 0;
        size = 0;
        rear = -1;
        
    }

    public boolean isEmpty() {
        // Check if queue is empty
        
        return size == 0;
    }

    public boolean isFull() {
        // Check if queue is full
        
        return size == capacity;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull()){
            return;
        }
        
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty()){
            return;
        }
        
        front = (front + 1) % capacity;
        size--;
        
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
        
        return arr[front];
    }

    public int getRear() {
        // Get last element
        
        if(isEmpty()) return -1;
        
        return arr[rear];
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        System.out.println("Front element: " + queue.getFront()); 
        System.out.println("Rear element: " + queue.getRear());   
        
        queue.dequeue();
        
        System.out.println("Front element after dequeue: " + queue.getFront()); 
    }
    
}