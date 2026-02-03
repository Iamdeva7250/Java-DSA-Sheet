import java.util.*;
import java.io.*;

public class Middleoflinkedlist {
    
    static class Node {
      int data;
      Node next;

      Node(int data){
        this.data = data;
        this.next = null;
      }
    }

     public static void main(String args[]) 
    { 

      System.out.println("Find middle of linked list :: ..");
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head.next.next.next=new Node(40);
    	head.next.next.next.next=new Node(50);
    	System.out.println("Middle element is :: "+findMiddle(head));
    	
    } 
    
    static int findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
      }
    
}