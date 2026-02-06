import java.util.*;
import java.io.*;


class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class QueueusingLinkedList {
    
    // Your code here

      Node front, rear;
    int size;
    

    public QueueusingLinkedList() {
        // Initialize your data members
        
        front = rear = null;
        size = 0;
        
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return size == 0;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        
        if(rear == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        
        if(isEmpty()) return;
        
        front = front.next;
        size--;
        
        if(front == null){
            rear = null;
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        
        if(isEmpty()) return -1;
        
        return front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        
        return size;
    }

    public static void main(String[] args) {
        QueueusingLinkedList queue = new QueueusingLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Front element: " + queue.getFront()); 
        System.out.println("Queue size: " + queue.size());      
        queue.dequeue();
        System.out.println("Front element after dequeue: " + queue.getFront()); 
        System.out.println("Queue size after dequeue: " + queue.size());  
    }
    
}