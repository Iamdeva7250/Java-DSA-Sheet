import java.util.*;

public class SinglyLinkedListRecursive {

    // Node class
    static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Recursive print function
    static void rprint(Node head) {
        if (head == null)
            return; // base case to stop recursion

        System.out.print(head.data + " ");
        rprint(head.next); // recursive call
    }

    public static void main(String[] args) {
        // Create linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Print list recursively
        rprint(head);
    }
}
