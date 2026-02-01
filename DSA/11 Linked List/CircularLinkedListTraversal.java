import java.util.*;
import java.io.*;

public class CircularLinkedListTraversal {



  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data = data;
      this.next = null;

    }
  }
    // 1 Loop Method to traverse a circular linked list
    public void traverseCircularListLoop(Node head){
      if(head == null) return;

      Node curr = head;

      while(true){
        System.out.print(curr.data + " ");
        curr = curr.next;
        if(curr == head) break;
      }

    }


    // 2 Do-While Loop Method to traverse a circular linked list
    public void traverseCircularList(Node head){
      if(head == null) return;

      Node curr = head;

      // Using do-while loop to ensure at least one iteration
      do{
        System.out.print(curr.data + " ");
        curr = curr.next;
      }while(curr != head);

    }

    public static void main(String[] args) {
      CircularLinkedListTraversal cllt = new CircularLinkedListTraversal();

      // Creating a circular linked list: 1 -> 2 -> 3 -> 4 -> (back to head)
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = head; // Making it circular

      System.out.println("Traversal using Loop Method:");
      cllt.traverseCircularListLoop(head); 

      System.out.println("\nTraversal using Do-While Loop Method:");
      cllt.traverseCircularList(head);
    }




    
}