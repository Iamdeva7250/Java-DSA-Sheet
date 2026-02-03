import java.util.*;
import java.io.*;


  class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
  
public class RemoveDuplicatesfromaSortedLinkedList {
    
    // Your code here
  

    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        Node curr = head;
        while(curr != null && curr.next != null){
            
            if(curr.data == curr.next.data){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromaSortedLinkedList solution = new RemoveDuplicatesfromaSortedLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);
        
        head = solution.removeDuplicates(head);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
}