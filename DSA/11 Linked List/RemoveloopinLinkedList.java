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
public class RemoveloopinLinkedList {
    
    // Your code here

     public static void removeLoop(Node head) {
        // code here
        
        if(head == null || head.next == null)
            return;
            
            Node slow = head;
            Node fast = head;
            boolean loop = false;
            
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                
                if(slow == fast){
                    loop = true;
                    break;
                }
            }
            if(!loop)
            return;
            
            slow = head;
            
            if(slow == fast){
                while(fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
        fast.next = null;
    }

    public static void main(String[] args) {
        RemoveloopinLinkedList solution = new RemoveloopinLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Creating a loop for testing
        head.next.next.next.next.next = head.next; // 5 -> 2 creates a loop
        
        solution.removeLoop(head);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
}