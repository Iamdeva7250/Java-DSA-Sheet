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

public class SegregateEvenandOddNodesinaLinkedList {
    
    // Your code here
     Node divide(int N, Node head) {
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = curr;
                }
            } else {
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = curr;
                }
            }
            curr = curr.next;
        }
        
        if (evenHead == null) return oddHead;
        evenTail.next = oddHead;
        if (oddTail != null) oddTail.next = null;
        
        return evenHead;
    }

    public static void main(String[] args) {
        SegregateEvenandOddNodesinaLinkedList solution = new SegregateEvenandOddNodesinaLinkedList();
        
        Node head = new Node(17);
        head.next = new Node(15);
        head.next.next = new Node(8);
        head.next.next.next = new Node(12);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(4);
        
        head = solution.divide(7, head);
        
        // Print the modified list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
}