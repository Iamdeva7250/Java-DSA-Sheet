import java.util.*;
import java.io.*;

public class CircularDoublyLinkedListInsertAtBegin {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    // 🔹 Insert at beginning
    static Node insertBegin(Node head, int x) {

        Node temp = new Node(x);

        // If list is empty
        if (head == null) {
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }

        Node last = head.prev;

        temp.next = head;
        temp.prev = last;

        last.next = temp;
        head.prev = temp;

        return temp; // new head
    }

    // 🔹 Print list
    static void printList(Node head) {
        if (head == null) return;

        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
    }

    public static void main(String[] args) {

        Node head = null;

        head = insertBegin(head, 10);
        head = insertBegin(head, 20);
        head = insertBegin(head, 30);

        printList(head);
    }
}
