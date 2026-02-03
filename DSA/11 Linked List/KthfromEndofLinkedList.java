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
public class KthfromEndofLinkedList {
    
    // Your code here
     int getKthFromLast(Node head, int k) {
        // Your code here
        Node first = head;
        Node second = head;
        
        for(int i = 0; i < k; i++){
            if(first == null)
            return -1;
            
            first = first.next;
        }
        
        while(first != null){
            first = first.next;
            second = second.next;
        }
        
        return second.data;
    }

    public static void main(String[] args) {
        KthfromEndofLinkedList solution = new KthfromEndofLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int k = 2; // Example: Find the 2nd node from the end
        
        int result = solution.getKthFromLast(head, k);
        System.out.println("The " + k + "th node from the end is: " + result); 
    }
}