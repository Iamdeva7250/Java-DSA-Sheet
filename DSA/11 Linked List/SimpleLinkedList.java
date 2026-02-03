import java.util.*;
import java.io.*;

public class SimpleLinkedList {
    
    // Inner class Node
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Create object of outer class
        SimpleLinkedList list = new SimpleLinkedList();

        // Create nodes using outer class instance
        Node head = list.new Node(10);
        Node temp1 = list.new Node(20);
        Node temp2 = list.new Node(30);

        // Link nodes
        head.next = temp1;
        temp1.next = temp2;

        // Traverse and print
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
