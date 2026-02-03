import java.util.*;
import java.io.*;

public class NthNodefromendofLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // =========================
    // Method 1: Using Length
    // =========================
    static int getNthFromLastUsingLength(Node head, int n) {
        int length = 0;
        Node curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        if (n > length) return -1;

        curr = head;
        for (int i = 1; i < length - n + 1; i++) {
            curr = curr.next;
        }

        return curr.data;
    }

    // =========================
    // Method 2: Two Pointer
    // =========================
    static int getNthFromLastTwoPointer(Node head, int n) {
        if (head == null) return -1;

        Node first = head;
        for (int i = 0; i < n; i++) {
            if (first == null) return -1;
            first = first.next;
        }

        Node second = head;
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second.data;
    }

    // =========================
    // Driver Code (Optional)
    // =========================
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int n = 2;

        System.out.println(getNthFromLastUsingLength(head, n));   // 40
        System.out.println(getNthFromLastTwoPointer(head, n));    // 40
    }
}
