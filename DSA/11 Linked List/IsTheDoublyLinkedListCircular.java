import java.util.*;
import java.io.*;


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class IsTheDoublyLinkedListCircular {
    

    public static boolean isCircular(Node head) {
        // your code here
        if(head == null)
        return true;
        
        Node curr = head.next;
        
        while(curr != null && curr != head){
            curr = curr.next;
        }
        return curr == head;
    }

  

    public static void main(String[] args) {
        IsTheDoublyLinkedListCircular solution = new IsTheDoublyLinkedListCircular();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = head; // Making it circular
        head.prev = head.next.next; // Making it circular
        
        boolean result = isCircular(head);
        System.out.println("Is the doubly linked list circular? " + result);

    }
    
}