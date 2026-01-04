// Node definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Queue implementation using Linked List
class LinkedListQueue {
    private Node start; // front
    private Node end;   // rear
    private int size;

    public LinkedListQueue() {
        start = end = null;
        size = 0;
    }

    // Push element into queue
    public void push(int x) {
        Node newNode = new Node(x);

        if (start == null) {
            start = end = newNode;
        } else {
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    // Pop element from queue
    public int pop() {
        if (start == null)
            return -1;

        int value = start.data;
        start = start.next;

        if (start == null)
            end = null;

        size--;
        return value;
    }

    // Peek front element
    public int peek() {
        return (start == null) ? -1 : start.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }
}

// Main class
public class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {

        LinkedListQueue q = new LinkedListQueue();

        String[] commands = {
            "LinkedListQueue", "push", "push",
            "peek", "pop", "isEmpty"
        };

        // ✅ FIXED INPUTS
        int[][] inputs = {
            null,       // LinkedListQueue
            {3},        // push 3
            {7},        // push 7
            null,       // peek
            null,       // pop
            null        // isEmpty
        };

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "push":
                    q.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(q.pop() + " ");
                    break;
                case "peek":
                    System.out.print(q.peek() + " ");
                    break;
                case "isEmpty":
                    System.out.print(q.isEmpty() + " ");
                    break;
                case "LinkedListQueue":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
