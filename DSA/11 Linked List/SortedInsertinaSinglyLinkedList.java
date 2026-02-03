import java.util.*;
import java.io.*;

public class SortedInsertinaSinglyLinkedList {
    
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

      System.out.println("Insert node in sorted singly linked list :: ..");
        Node head=new Node(10);
    	head.next=new Node(20);
    	head.next.next=new Node(30);
    	head=sortedInsert(head,25);
    	printlist(head);
    	
    } 
    
    public static void printlist(Node head){
        Node r=head;
        while(r!=null){
            System.out.print(r.data+" ");
            r=r.next;
        }
    }
    
    static Node sortedInsert(Node head,int x){
        Node temp=new Node(x);
        if(head==null || x<head.data){
            temp.next=head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
      }
    
}