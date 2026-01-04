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

public class LengthOfLoopInLinkedList {

    // Function to return the length of loop using Floyd's Algorithm
    public static int lengthOfLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        // No loop
        return 0;
    }

    // Count loop length
    private static int countLoopLength(Node meetingPoint) {
        Node temp = meetingPoint;
        int length = 1;

        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }

    // Main method
    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Create loop (5 → 2)
        fifth.next = second;

        int loopLength = lengthOfLoop(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
