import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Making it circular
        head.next.next.next = head;

        // Print first few nodes to verify (avoid infinite loop)
        Node temp = head;
        int count = 0;

        while (count < 6) {   // print limited nodes
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("(back to head)");
    }
}
