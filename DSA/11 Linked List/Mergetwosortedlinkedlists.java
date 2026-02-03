import java.util.*;
import java.io.*;

class Node{
  int data;
  Node next;

  Node (int data){
    this.data = data;
    this.next = null;
  }
}

public class Mergetwosortedlinkedlists {

  Node mergetwoList(Node a, Node b){
    if(a == null) return b;
    if(b == null) return a;

    Node head = null, tail = null;

    if(a.data <= b.data){
      head = a;
      tail = a;
      a = a.next;
    } else {
      head = b;
      tail = b;
      b = b.next;
    }

    while(a != null && b != null){
      if(a.data <= b.data){
        tail.next = a;
        tail = a;
        a = a.next;
      } else {
        tail.next = b;
        tail = b;
        b = b.next;
      }
    }
    if(a == null) tail.next = b;
    tail.next = a;
    return head;
  }

  public static void main(String[] args) {
    Mergetwosortedlinkedlists obj = new Mergetwosortedlinkedlists();

    Node head1 = new Node(1);
    head1.next = new Node(3);
    head1.next.next = new Node(5);

    Node head2 = new Node(2);
    head2.next = new Node(4);
    head2.next.next = new Node(6);

    Node mergedHead = obj.mergetwoList(head1, head2);

    // Print merged linked list
    Node curr = mergedHead;
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
  }   
}