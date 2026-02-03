import java.util.*;

public class SinglyLinkedListTraversing {

    // Node class for singly linked list
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to print linked list elements
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(); // for new line
    }

    public static void main(String[] args) {
        // Create linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Traverse and print list
        printList(head);
    }
}
