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

public class PalindromeLinkedList {
    
    public boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare both halves
        Node first = head;
        Node second = secondHalf;
        while (second != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Reverse linked list
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

    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();

        // Creating a palindrome linked list: 1 -> 2 -> 3 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println(pll.isPalindrome(head)); // true

        // Creating a non-palindrome linked list: 1 -> 2 -> 3
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);

        System.out.println(pll.isPalindrome(head2)); // false
    }
    
}