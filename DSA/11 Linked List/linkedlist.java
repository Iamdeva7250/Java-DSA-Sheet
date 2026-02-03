import java.util.*;
import java.io.*;

public class linkedlist {

    Node head; // head of list

    // Linked list Node (static inner class)
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the beginning
    public void insertAtBeginning(int newData) {
        // Create a new node
        Node newNode = new Node(newData);
        // Make next of new node as head
        newNode.next = head;
        // Move the head to point to new node
        head = newNode;
    }

    // Method to insert a new node at the end
    public void insertAtEnd(int newData) {
        // Create a new node
        Node newNode = new Node(newData);

        // If the Linked List is empty, then make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }

        // Else traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Change the next of last node
        last.next = newNode;
    }

    // This function prints the contents of the linked list
    public void printList() {
        Node n = head;
        System.out.print("Linked List: ");
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        // Start with an empty list
        linkedlist llist = new linkedlist(); // ✅ fixed class name

        // Insert at end
        llist.insertAtEnd(1);
        llist.insertAtEnd(2);
        llist.insertAtEnd(3);

        // Print list
        llist.printList();

        // Insert at beginning
        llist.insertAtBeginning(0);
        llist.printList();

        // Insert another at end
        llist.insertAtEnd(4);
        llist.printList();
    }
}
