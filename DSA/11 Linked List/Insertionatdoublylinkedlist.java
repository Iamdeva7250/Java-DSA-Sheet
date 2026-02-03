import java.util.*;
import java.io.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Insertionatdoublylinkedlist {

    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node newNode = new Node(x);

        Node curr = head;
        
        for(int i = 0; i < p; i++){
            curr = curr.next;
        }
        
        newNode.next = curr.next;
        newNode.prev = curr;
        
        if(curr.next != null){
            curr.next.prev = newNode;
        }
        
        curr.next = newNode;
        
        return head;
        
    }

    public static void main(String[] args) {
        Insertionatdoublylinkedlist solution = new Insertionatdoublylinkedlist();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(4);
        head.next.next.prev = head.next;
        
        int position = 1; // Position to insert after
        int value = 3;    // Value to insert
        
        head = solution.insertAtPos(head, position, value);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
   
}