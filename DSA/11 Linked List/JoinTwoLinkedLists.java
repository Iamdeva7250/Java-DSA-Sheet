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

public class JoinTwoLinkedLists {
    
    // Your code here
      public Node joinTheLists(Node head1, Node head2) {
        // code here
        if(head1 == null)
        return head2;
        
        Node temp = head1;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = head2;
        
        return head1;
    }

    public static void main(String[] args) {
        JoinTwoLinkedLists solution = new JoinTwoLinkedLists();
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        
        Node head2 = new Node(4);
        head2.next = new Node(5);
        
        Node mergedHead = solution.joinTheLists(head1, head2);
        
        // Print the merged list
        Node curr = mergedHead;
        while (curr != null) {
          
            System.out.print(  curr.data + " ");
            curr = curr.next;
        }
    }
    
}