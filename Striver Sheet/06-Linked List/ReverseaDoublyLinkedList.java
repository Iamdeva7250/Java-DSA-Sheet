import java.util.*;

// Node class
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

// Main logic class
public class ReverseaDoublyLinkedList {

    // Convert array to Doubly Linked List
    public Node convertArr2DLL(int[] arr) {

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // Reverse the Doubly Linked List
    public Node reverseDLL(Node head) {

        Node current = head;
        Node last = null;

        while (current != null) {
            // Swap next and prev
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            last = current;
            current = temp;
        }
        return last; // new head
    }

    // Print DLL
    public void printDLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Driver
    public static void main(String[] args) {

        ReverseaDoublyLinkedList dll = new ReverseaDoublyLinkedList();

        int[] arr = {1, 2, 3, 4, 5};

        Node head = dll.convertArr2DLL(arr);
        System.out.print("Original DLL: ");
        dll.printDLL(head);

        head = dll.reverseDLL(head);
        System.out.print("Reversed DLL: ");
        dll.printDLL(head);
    }
}
