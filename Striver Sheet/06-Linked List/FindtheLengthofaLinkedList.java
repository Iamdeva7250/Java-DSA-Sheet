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
public class FindtheLengthofaLinkedList {

    // Function to find length of linked list
    public int lengthOfLinkedList(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {

        // Creating a sample linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        FindtheLengthofaLinkedList obj =
                new FindtheLengthofaLinkedList();

        System.out.println("Length of Linked List: "
                + obj.lengthOfLinkedList(head));
    }
}
