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

public class InsertinSortedwayinaSortedDLL {
    
    // Your code here
      public Node sortedInsert(Node head, int x) {
        // add your code here
        
        Node newNode = new Node(x);
        
        
        if(head == null)
        return newNode;
        
        if(x <= head.data){
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }
        Node curr = head;
        
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
        } 
        
        newNode.next = curr.next;
        newNode.prev = curr;
        
        if(curr.next != null)
        curr.next.prev = newNode;
        
        curr.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        InsertinSortedwayinaSortedDLL solution = new InsertinSortedwayinaSortedDLL();
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        
        int valueToInsert = 25;
        
        head = solution.sortedInsert(head, valueToInsert);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
}