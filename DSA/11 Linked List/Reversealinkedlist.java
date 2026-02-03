import java.util.*;
import java.io.*;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Reversealinkedlist {
    
    // Your code here
      Node reverseList(Node head) {
        // code here
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }
    public static void main(String[] args) {
        Reversealinkedlist solution = new Reversealinkedlist();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        head = solution.reverseList(head);
        
        // Print the reversed list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}