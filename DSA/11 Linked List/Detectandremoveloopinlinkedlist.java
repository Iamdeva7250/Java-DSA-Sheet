import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Detectandremoveloopinlinkedlist {

    Node head;

    // Detects loop and removes it
    int detectAndRemoveLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Detect loop using Floyd's Algorithm
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                removeLoop(slow, head);
                return 1; // Loop found and removed
            }
        }
        return 0; // No loop
    }

    // Removes loop
    void removeLoop(Node meetingPoint, Node head) {
        Node ptr1 = head;
        Node ptr2 = meetingPoint;

        // Find start of loop
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        // Find last node of loop
        Node loopNode = ptr2;
        while (loopNode.next != ptr1) {
            loopNode = loopNode.next;
        }

        // Break loop
        loopNode.next = null;
    }

    // Print linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Detectandremoveloopinlinkedlist list =
                new Detectandremoveloopinlinkedlist();

        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating loop: 10 -> 15
        list.head.next.next.next.next.next = list.head.next.next;

        // Detect & remove loop
        list.detectAndRemoveLoop(list.head);

        System.out.println("Linked List after removing loop:");
        list.printList(list.head);
    }
}
