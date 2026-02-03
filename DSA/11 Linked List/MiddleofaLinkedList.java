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

public class MiddleofaLinkedList {
    
    // Your code here
    int getMiddle(Node head) {
        Node slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        MiddleofaLinkedList solution = new MiddleofaLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int middleValue = solution.getMiddle(head);
        System.out.println("Middle element: " + middleValue);
    }
    
}