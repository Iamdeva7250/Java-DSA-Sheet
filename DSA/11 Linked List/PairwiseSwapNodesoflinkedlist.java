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
public class PairwiseSwapNodesoflinkedlist {
  public static Node pairwiseswap(Node head){
    if(head == null || head.next == null)
      return head;

    Node curr = head.next.next;
    Node prev = head;
    head = head.next;
    head.next = prev;

    while(curr != null && curr.next != null){
      prev.next = curr.next;
      prev = curr;
      Node next = curr.next.next;
      curr.next.next = curr;
      curr = next;
    }
    prev.next = curr;
    return head;
    
  }

  public static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = new Node(6);

    System.out.println("Original Linked List:");
    printList(head);

    head = pairwiseswap(head);

    System.out.println("Linked List after Pairwise Swap:");
    printList(head);
  }
    
   
    
}