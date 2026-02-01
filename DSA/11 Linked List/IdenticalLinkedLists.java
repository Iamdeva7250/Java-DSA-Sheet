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

public class IdenticalLinkedLists {
    
    // Your code here
      public boolean areIdentical(Node head1, Node head2) {
        // code here
        Node curr1 = head1;
        Node curr2 = head2;
        
        while(curr1 != null && curr2 != null){
            
            if(curr1.data != curr2.data){
                return false;
            }
            
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        
        return curr1 == null && curr2 == null;
    }
    

    public static void main(String[] args) {
        IdenticalLinkedLists solution = new IdenticalLinkedLists();
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        
        boolean result = solution.areIdentical(head1, head2);
        System.out.println("Are the two linked lists identical? " + result);    
    }
}