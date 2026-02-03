import java.util.*;

public class SearchInIterativeMethod {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static int search(Node head, int x) {
        int pos = 1;
        Node curr = head;

        while (curr != null) {
            if (curr.data == x) {
                return pos;   // Found
            }
            pos++;
            curr = curr.next;
        }
        return -1;   // Not found
    }

    // Example to test
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int x = 30;

        int result = search(head, x);
        if (result != -1)
            System.out.println("Element found at position: " + result);
        else
            System.out.println("Element not found");
    }
}

