import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class DeleteHeadofaDoublyLinkedList {

    Node deleteHead(Node head) {

        // Case 1: Empty list
        if (head == null) {
            return null;
        }

        // Case 2: Only one node
        if (head.next == null) {
            return null;
        }

        // Case 3: More than one node
        head = head.next;
        head.prev = null;

        return head;
    }

    // Utility method to print list
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DeleteHeadofaDoublyLinkedList obj = new DeleteHeadofaDoublyLinkedList();

        Node head = null;

        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;

        System.out.print("Before deletion: ");
        obj.printList(head);

        head = obj.deleteHead(head);

        System.out.print("After deletion: ");
        obj.printList(head);
    }
}
