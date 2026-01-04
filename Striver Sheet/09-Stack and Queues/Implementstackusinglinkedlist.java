import java.util.*;

// Node definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack implementation using Linked List
class LinkedListStack {
    private Node head; // top of stack
    private int size;

    // Constructor
    public LinkedListStack() {
        head = null;
        size = 0;
    }

    // Push operation
    public void push(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Pop operation
    public int pop() {
        if (head == null)
            return -1;

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // Peek / Top operation
    public int top() {
        if (head == null)
            return -1;
        return head.data;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }
}

// Main class (for testing)
public class Implementstackusinglinkedlist {
    public static void main(String[] args) {

        LinkedListStack st = new LinkedListStack();

        String[] commands = {"LinkedListStack", "push", "push", 
                             "pop", "top", "isEmpty"};
        int[][] inputs = {{}, {3}, {7}, {}, {}, {}};

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "push":
                    st.push(inputs[i][0]);
                    System.out.print("null ");
                    break;
                case "pop":
                    System.out.print(st.pop() + " ");
                    break;
                case "top":
                    System.out.print(st.top() + " ");
                    break;
                case "isEmpty":
                    System.out.print(st.isEmpty() + " ");
                    break;
                case "LinkedListStack":
                    System.out.print("null ");
                    break;
            }
        }
    }
}
