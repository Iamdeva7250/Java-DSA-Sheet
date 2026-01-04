import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

// Only ONE public class
public class InsertAtTheHeadOfLinkedList {

    // Insert at head function
    public Node insertAtHead(Node head, int newData) {
        Node newNode = new Node(newData, head);
        return newNode;
    }

    // Print linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        InsertAtTheHeadOfLinkedList sol = new InsertAtTheHeadOfLinkedList();

        // Creating list: 2 -> 3
        Node head = new Node(2);
        head.next = new Node(3);

        System.out.print("Original List: ");
        sol.printList(head);

        // Insert at head
        head = sol.insertAtHead(head, 1);

        System.out.print("After Insertion at Head: ");
        sol.printList(head);
    }
}
