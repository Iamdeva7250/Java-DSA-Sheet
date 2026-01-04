import java.util.*;

public class ImplementQueueUsingArray {

    // Array-based Queue implementation
    static class ArrayQueue {
        int[] arr;
        int start, end, currSize, maxSize;

        // Constructor
        public ArrayQueue() {
            maxSize = 10;
            arr = new int[maxSize];
            start = -1;
            end = -1;
            currSize = 0;
        }

        // Push element into queue
        public void push(int x) {
            if (currSize == maxSize) {
                System.out.println("Queue is Full");
                return;
            }

            if (start == -1) {
                start = 0;
                end = 0;
            } else {
                end = (end + 1) % maxSize;
            }

            arr[end] = x;
            currSize++;
        }

        // Pop element from queue
        public int pop() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int popped = arr[start];

            if (currSize == 1) {
                start = -1;
                end = -1;
            } else {
                start = (start + 1) % maxSize;
            }

            currSize--;
            return popped;
        }

        // Peek front element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[start];
        }

        // Check if empty
        public boolean isEmpty() {
            return currSize == 0;
        }
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        queue.push(5);
        queue.push(10);

        System.out.println(queue.peek());    // 5
        System.out.println(queue.pop());     // 5
        System.out.println(queue.isEmpty()); // false
    }
}
