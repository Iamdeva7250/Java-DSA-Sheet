import java.util.*;
import java.io.*;

public class ArrayImplementationofDeque {

    int[] arr;
    int front, capacity, size;

    ArrayImplementationofDeque(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        front = 0;
        size = 0;
    }

    void insertFront(int x) {
        if (isFull()) return;
        front = (front + capacity - 1) % capacity;
        arr[front] = x;
        size++;
    }

    void insertRear(int x) {
        if (isFull()) return;
        int rear = (front + size) % capacity;
        arr[rear] = x;
        size++;
    }

    void deleteFront() {
        if (isEmpty()) return;
        front = (front + 1) % capacity;
        size--;
    }

    void deleteRear() {
        if (isEmpty()) return;
        size--;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) return -1;
        return arr[(front + size - 1) % capacity];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    int getSize() {
        return size;
    }

    public static void main(String[] args) {
        ArrayImplementationofDeque deque = new ArrayImplementationofDeque(5);
        deque.insertRear(10);
        deque.insertRear(20);
        deque.insertFront(5);

        System.out.println("Front element: " + deque.getFront()); 
        System.out.println("Rear element: " + deque.getRear());   
        System.out.println("Deque size: " + deque.getSize());     

        deque.deleteFront();
        System.out.println("Front element after deletion: " + deque.getFront()); 
    }
}
