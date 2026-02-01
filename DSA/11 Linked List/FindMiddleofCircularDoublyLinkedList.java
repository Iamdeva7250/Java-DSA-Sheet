import java.util.*;
import java.io.*;

public class FindMiddleofCircularDoublyLinkedList {
    
    // Your code here
     public static int findMiddle(Node head) {
        // code here
        
        if(head == null)
        return -1;
      
        Node slow = head;
        Node fast = head;
        
        
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }

    public static void main(String[] args) {
        FindMiddleofCircularDoublyLinkedList solution = new FindMiddleofCircularDoublyLinkedList();
        
        // Creating a circular doubly linked list for testing
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        third.next = fourth;
        fourth.prev = third;
        fourth.next = fifth;
        fifth.prev = fourth;
        fifth.next = head; // Making it circular
        head.prev = fifth; // Making it circular
        
        int middleValue = solution.findMiddle(head);
        System.out.println("Middle element: " + middleValue);
    }
    
}