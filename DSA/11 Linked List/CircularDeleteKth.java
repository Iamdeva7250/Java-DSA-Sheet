import java.util.*;
import java.io.*;

public class CircularDeleteKth {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String args[]) { 
        System.out.println("Delete Kth node from circular linked list :: ..");

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = head;

        head = deleteKthNode(head, 2);
        printlist(head);
    }

    // 🔹 Delete Kth node (1-based index)
    static Node deleteKthNode(Node head, int k) {

        if (head == null) return null;

        // If only one node
        if (head.next == head && k == 1) {
            return null;
        }

        // If deleting head (k = 1)
        if (k == 1) {
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }

        Node curr = head;
        for (int i = 1; i < k - 1; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }

    // 🔹 Print circular linked list
    static void printlist(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}
