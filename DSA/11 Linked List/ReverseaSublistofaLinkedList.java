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

public class ReverseaSublistofaLinkedList {
  
    public static Node reverseBetween(int a, int b, Node head) {
        if (head == null || a == b) return head;

        // Step 1: find length
        int len = 0;
        Node temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: clamp b
        if (a > len) return head;
        b = Math.min(b, len);

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Step 3: move prev to (a-1)th node
        for (int i = 1; i < a; i++) {
            prev = prev.next;
        }

        // Step 4: reverse from a to b
        Node curr = prev.next;
        Node prevRev = null;

        for (int i = 0; i <= b - a; i++) {
            Node next = curr.next;
            curr.next = prevRev;
            prevRev = curr;
            curr = next;
        }

        // Step 5: reconnect
        Node tail = prev.next;
        prev.next = prevRev;
        tail.next = curr;

        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseaSublistofaLinkedList solution = new ReverseaSublistofaLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int a = 2, b = 4;
        head = reverseBetween(a, b, head);
        
        // Print the modified list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
}