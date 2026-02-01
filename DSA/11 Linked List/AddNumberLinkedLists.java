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

public class AddNumberLinkedLists {
    
    private Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node addTwoLists(Node head1, Node head2) {

        // Reverse both lists
        head1 = reverse(head1);
        head2 = reverse(head2);

        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;

        // Add digits
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }

            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }

        // Reverse result
        Node result = reverse(dummy.next);

        // 🔥 REMOVE LEADING ZEROS
        while (result != null && result.data == 0) {
            result = result.next;
        }

        // If all digits were zero
        return (result == null) ? new Node(0) : result;
    }
  
    public static void main(String[] args) {
        AddNumberLinkedLists solution = new AddNumberLinkedLists();

        // Creating first number: 342 (2 -> 4 -> 3)
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        // Creating second number: 465 (5 -> 6 -> 4)
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node result = solution.addTwoLists(head1, head2);

        // Print result
        System.out.print("Resultant Linked List: ");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}