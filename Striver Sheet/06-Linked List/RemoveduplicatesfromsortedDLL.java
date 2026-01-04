import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class RemoveduplicatesfromsortedDLL {

    static class Solution {
        Node head = null;

        // Insert node at end
        public void insertAtEnd(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
        }

        // Remove duplicates from sorted DLL
        public Node removeDuplicates() {
            if (head == null) return null;

            Node current = head;

            while (current != null && current.next != null) {
                Node nextDistinct = current.next;

                while (nextDistinct != null &&
                       nextDistinct.data == current.data) {
                    nextDistinct = nextDistinct.next;
                }

                current.next = nextDistinct;
                if (nextDistinct != null) {
                    nextDistinct.prev = current;
                }

                current = current.next;
            }

            return head;
        }

        // Print DLL
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] values = {1, 2, 2, 2, 3, 4, 4, 5, 5, 6};

        for (int value : values) {
            sol.insertAtEnd(value);
        }

        System.out.print("Original List: ");
        sol.printList();

        sol.removeDuplicates();

        System.out.print("After Removing Duplicates: ");
        sol.printList();
    }
}
