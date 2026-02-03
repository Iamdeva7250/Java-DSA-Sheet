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

public class IsLinkedListSorted {
    
  
    public boolean isSorted(Node head) {
        // code here
        if(head == null || head.next == null)
        return true;
        
        boolean asc = true, desc = true;
        Node curr = head;
        
        while(curr.next != null){
            if(curr.data > curr.next.data)
            asc = false;
            if(curr.data < curr.next.data)
            desc = false;
            curr = curr.next;
        }
        return asc || desc;
        
    }
    public static void main(String[] args) {
        IsLinkedListSorted solution = new IsLinkedListSorted();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        boolean result = solution.isSorted(head);
        System.out.println("Is the linked list sorted? " + result);
    }
}