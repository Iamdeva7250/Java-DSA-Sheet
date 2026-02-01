import java.util.*;
import java.io.*;


class Node{
   int data;
   Node next;
   Node prev;
   Node(int data){
     this.data = data;
     next = prev = null;
   }
}

class InsertatEndofDDl {

  Node insertAtEnd(Node head, int data){

    Node newNode = new Node (data);

    if(head == null){
      return newNode;
    }
    Node Curr= head;
    while(Curr.next != null){
      Curr = Curr.next;
    }
    Curr.next = newNode;
    newNode.prev = Curr;
    return head;
  }

  public static void main(String[] args) {
    InsertatEndofDDl obj = new InsertatEndofDDl();

    Node head = null;
    head = obj.insertAtEnd(head, 10);
    head = obj.insertAtEnd(head, 20);
    head = obj.insertAtEnd(head, 30);
    head = obj.insertAtEnd(head, 40);

    // Print the list
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
  }
    
    
}