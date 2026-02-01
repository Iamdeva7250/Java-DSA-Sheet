import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletenodewithonlypointergiventoit {

    Node head;

    // Function to delete a node when only that node is given
    void deleteNode(Node node) {
        // Cannot delete last node
        if (node == null || node.next == null) {
            System.out.println("Cannot delete the last node using this method");
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
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
        Deletenodewithonlypointergiventoit list =
                new Deletenodewithonlypointergiventoit();

        list.head = new Node(1);
        list.head.next = new Node(12);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(1);

        System.out.println("Before Deleting:");
        list.printList(list.head);

        // Delete node with value 12
        list.deleteNode(list.head.next);

        System.out.println("After Deleting:");
        list.printList(list.head);
    }
}
