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

// Solution class
class Solution {

    // Recursive helper to add one
    private int addOneUtil(Node node) {
        if (node == null) return 1;

        int carry = addOneUtil(node.next);
        int sum = node.data + carry;
        node.data = sum % 10;
        return sum / 10;
    }

    // Function to add one
    Node addOne(Node head) {
        int carry = addOneUtil(head);

        if (carry > 0) {
            Node newHead = new Node(carry);
            newHead.next = head;
            head = newHead;
        }
        return head;
    }
}

// Main class
public class Add1toanumberrepresentedbyLL {

    // Append helper
    static Node append(Node head, int data) {
        if (head == null) return new Node(data);
        Node curr = head;
        while (curr.next != null)
            curr = curr.next;
        curr.next = new Node(data);
        return head;
    }

    // Print helper
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = null;

        // Number: 129
        head = append(head, 1);
        head = append(head, 2);
        head = append(head, 9);

        System.out.print("Original Number: ");
        printList(head);

        Solution sol = new Solution();
        head = sol.addOne(head);

        System.out.print("After Adding One: ");
        printList(head);
    }
}
