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

public class PrintLinkedList {
    
    // Your code here

     public int[] displayList(Node head) {
        // code here
        
        int count = 0;
        Node temp = head;
         while(temp != null){
             count++;
             temp = temp.next;
         }
         
         int[] arr = new int[count];
         
         temp = head;
         int i = 0;
         while(temp != null){
             arr[i++] = temp.data;
             temp = temp.next;
         }
         return arr;
    }

    public static void main(String[] args) {
        PrintLinkedList solution = new PrintLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        int[] result = solution.displayList(head);
        
        System.out.println("Linked List elements: " + Arrays.toString(result));
    }
    
}