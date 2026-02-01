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
public class FindLengthofLinkedList {
    
    public int getCount(Node head) {
        int count = 0;
        Node Current = head;
        
        while(Current != null){
            count++;
            Current = Current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        FindLengthofLinkedList solution = new FindLengthofLinkedList();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        int length = solution.getCount(head);
        System.out.println("Length of Linked List: " + length); 
    }
    
}