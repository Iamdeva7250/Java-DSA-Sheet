import java.util.*;
import java.io.*;

class Node{
   int data;
   Node next;
   Node prev;

   Node (int data){
     this.data = data;
     next = prev = null;

   }
}

 class ReverseaDoublyLinkedList {

  Node reverseDll (Node head){
    if(head == null || head.next == null){
      return head;
    }

    Node prev = null;
    Node curr = head;

    while(curr != null){
      prev = curr.prev;
      curr.prev = curr.next;
      curr.next = prev;
      curr = curr.prev;
    }
    return prev.prev;
  }

  public static void main(String[] args) {
    ReverseaDoublyLinkedList obj = new ReverseaDoublyLinkedList();

    Node head = new Node(10);
    head.next = new Node(20);
    head.next.prev = head;
    head.next.next = new Node(30);
    head.next.next.prev = head.next;
    head.next.next.next = new Node(40);
    head.next.next.next.prev = head.next.next;

    head = obj.reverseDll(head);

    // Print the reversed list
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
  }
  
}