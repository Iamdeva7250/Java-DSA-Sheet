import java.util.*;
import java.io.*;

public class CircularDeleteAtHead {
    
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String args[]) { 

      System.out.println("Delete node at head of the circular linked list :: ..");
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        head = deleteHead(head);
        printlist(head);
    } 

    public static void printlist(Node head) {
        if (head == null) return;
        Node r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);
    }

    static Node deleteHead(Node head) {
        if (head == null) return null;

        if (head.next == head) {
            return null; // only one node
        }

        // copy data from next node to head and delete next node
        head.data = head.next.data;
        head.next = head.next.next;

        return head;
    }
    
}