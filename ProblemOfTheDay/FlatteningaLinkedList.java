import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.bottom = null;
    }
}

public class FlatteningaLinkedList {

    // Merge two sorted bottom-linked lists
    private Node merge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.data < b.data) {
            a.bottom = merge(a.bottom, b);
            a.next = null;
            return a;
        } else {
            b.bottom = merge(a, b.bottom);
            b.next = null;
            return b;
        }
    }

    // Flatten the linked list
    public Node flatten(Node root) {
        if (root == null || root.next == null)
            return root;

        root.next = flatten(root.next);
        root = merge(root, root.next);

        return root;
    }

    // Print flattened list
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.bottom;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlatteningaLinkedList solution = new FlatteningaLinkedList();

        /*
            Creating this list:
            5 -> 10 -> 19 -> 28
            |    |     |     |
            7    20    22    35
            |          |     |
            8          50    40
            |                |
            30               45
        */

        Node head = new Node(5);
        head.bottom = new Node(7);
        head.bottom.bottom = new Node(8);
        head.bottom.bottom.bottom = new Node(30);

        head.next = new Node(10);
        head.next.bottom = new Node(20);

        head.next.next = new Node(19);
        head.next.next.bottom = new Node(22);
        head.next.next.bottom.bottom = new Node(50);

        head.next.next.next = new Node(28);
        head.next.next.next.bottom = new Node(35);
        head.next.next.next.bottom.bottom = new Node(40);
        head.next.next.next.bottom.bottom.bottom = new Node(45);

        Node flat = solution.flatten(head);
        printList(flat);
    }
}
