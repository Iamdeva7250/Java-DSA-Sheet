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

public class DeleteinaDoublyLinkedList {
    
    // Your code here
     public Node delPos(Node head, int x) {
        // code here
        if(head == null) return null;
        
        if(x == 1){
            head = head.next;
            
            if(head != null){
                head.prev = null;
            }
            return head;
        }
        
        Node curr = head;
        
        for(int i = 1; i < x && curr != null; i++){
            curr = curr.next;
        }
        
        if(curr == null) return head;
        
        if(curr.prev != null){
            curr.prev.next = curr.next;
        }
        
        if(curr.next != null){
            curr.next.prev = curr.prev;
        }
        
        return head;
    }

    public static void main(String[] args) {
        DeleteinaDoublyLinkedList solution = new DeleteinaDoublyLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;
        
        int positionToDelete = 3; // Position to delete
        
        head = solution.delPos(head, positionToDelete);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
      
    }
    
}