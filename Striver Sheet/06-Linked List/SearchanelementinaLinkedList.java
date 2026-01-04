import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Only ONE public class
public class SearchanelementinaLinkedList {

    // Function to search an element in linked list
    public boolean searchValue(Node head, int key) {

        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {

        // Creating linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        SearchanelementinaLinkedList obj =
                new SearchanelementinaLinkedList();

        if (obj.searchValue(head, 20))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}
