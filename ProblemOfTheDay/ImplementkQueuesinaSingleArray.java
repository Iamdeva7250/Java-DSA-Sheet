import java.util.*;
import java.io.*;

public class ImplementkQueuesinaSingleArray {
    
       int[] arr;      // actual array to store elements
    int[] front;    // front index for each queue
    int[] rear;     // rear index for each queue
    int[] next;     // next index
    int free;       // beginning of free list
    int n, k;

    // Constructor
    ImplementkQueuesinaSingleArray(int n, int k) {
        this.n = n;
        this.k = k;

        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        next = new int[n];

        // initialize all queues as empty
        for (int i = 0; i < k; i++) {
            front[i] = -1;
            rear[i] = -1;
        }

        // initialize free list
        for (int i = 0; i < n - 1; i++) {
            next[i] = i + 1;
        }
        next[n - 1] = -1;

        free = 0;
    }

    // Check if array is full
    boolean isFull() {
        return free == -1;
    }

    // Check if queue i is empty
    boolean isEmpty(int i) {
        return front[i] == -1;
    }

    // Enqueue element x into queue i (0-based index)
    void enqueue(int x, int i) {
        if (isFull()) return;

        int index = free;        // get free index
        free = next[index];     // update free list

        // if queue is empty
        if (front[i] == -1) {
            front[i] = index;
        } else {
            next[rear[i]] = index;
        }

        next[index] = -1;
        rear[i] = index;
        arr[index] = x;
    }

    // Dequeue element from queue i
    int dequeue(int i) {
        if (isEmpty(i)) return -1;

        int index = front[i];
        front[i] = next[index];

        // if queue becomes empty
        if (front[i] == -1) {
            rear[i] = -1;
        }

        // add this index back to free list
        next[index] = free;
        free = index;

        return arr[index];
      }
      public static void main(String[] args) {
        ImplementkQueuesinaSingleArray kQueues = new ImplementkQueuesinaSingleArray(10, 3);

        kQueues.enqueue(10, 0);
        kQueues.enqueue(20, 0);
        kQueues.enqueue(30, 1);
        kQueues.enqueue(40, 2);

        System.out.println("Dequeued element from queue 0: " + kQueues.dequeue(0)); 
        System.out.println("Dequeued element from queue 1: " + kQueues.dequeue(1)); 
        System.out.println("Dequeued element from queue 2: " + kQueues.dequeue(2)); 
        System.out.println("Dequeued element from queue 0: " + kQueues.dequeue(0)); 
        System.out.println("Dequeued element from queue 0: " + kQueues.dequeue(0)); 
      }
    }

    
