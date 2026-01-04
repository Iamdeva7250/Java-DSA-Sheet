import java.util.*;

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

public class DeleteLastNodeofaDoublyLinkedList {
    
    public Node deleteTail(Node head) {
        // If list is empty or has only one node
        if (head == null || head.next == null) {
            return null;
        }

        // Traverse to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.prev.next = null;
        temp.prev = null; // optional cleanup

        return head;
    }

    public static void main(String[] args) {

        // Create DLL: 1 <-> 2 <-> 3
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        DeleteLastNodeofaDoublyLinkedList obj =
                new DeleteLastNodeofaDoublyLinkedList();

        head = obj.deleteTail(head);

        // Print DLL after deletion
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
