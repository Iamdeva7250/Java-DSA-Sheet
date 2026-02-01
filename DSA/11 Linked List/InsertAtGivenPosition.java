import java.util.*;
import java.io.*;

public class InsertAtGivenPosition {

    // Define the Node class
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to insert at a given position
    static Node insertPos(Node head, int pos, int data) {
        Node temp = new Node(data);

        // Case 1: Insert at beginning
        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node curr = head;

        // Move to the (pos - 1)th node
        for (int i = 1; i <= pos - 2 && curr != null; i++) {
            curr = curr.next;
        }

        // If position is invalid
        if (curr == null) {
            System.out.println("Position out of range.");
            return head;
        }

        // Insert the new node
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main function for testing
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Before insertion:");
        printList(head);

        head = insertPos(head, 2, 15);

        System.out.println("After insertion:");
        printList(head);
    }
}
