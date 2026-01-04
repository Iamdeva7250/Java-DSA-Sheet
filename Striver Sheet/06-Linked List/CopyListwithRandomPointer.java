import java.util.*;
import java.io.*;

public class CopyListwithRandomPointer {

    static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    // Copy list with random pointer (O(1) extra space)
    static Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Insert copy nodes
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the lists
        curr = head;
        Node copyHead = head.next;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }

        return copyHead;
    }

    // Helper to print list
    static void printList(Node head) {
        while (head != null) {
            int randomData = (head.random != null) ? head.random.data : -1;
            System.out.print("(" + head.data + ", random=" + randomData + ") -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Assign random pointers
        head.random = head.next.next;      // 1 -> 3
        head.next.random = head;           // 2 -> 1
        head.next.next.random = head.next; // 3 -> 2

        System.out.println("Original List:");
        printList(head);

        Node copiedHead = copyRandomList(head);

        System.out.println("Copied List:");
        printList(copiedHead);
    }
}
