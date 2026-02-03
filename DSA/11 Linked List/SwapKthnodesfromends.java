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

public class SwapKthnodesfromends {
    
      public Node swapKth(Node head, int k) {
        // code here
        if(head == null) return head;
        
        int n = 0;
        Node temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        
        if( k > n) return head;
        
        if(2 * k - 1 == n) return head;
        
        Node prevX = null;
        Node currX = head;
        
        for(int i = 1; i < k; i++){
            prevX = currX;
            currX = currX.next;
            
        }
        
        Node prevY = null;
        Node currY = head;
        
        for(int i = 1; i < n - k + 1; i++){
            prevY = currY;
            currY = currY.next;
        }
        
        if(prevX != null)
            prevX.next = currY;
            else
            head = currY;
            
            if(prevY != null)
                prevY.next = currX;
                else
                head = currX;
                
                Node tempNext = currX.next;
                currX.next = currY.next;
                currY.next = tempNext;
                
                return head;
      
    }
    
    public static void main(String[] args) {
        SwapKthnodesfromends solution = new SwapKthnodesfromends();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        int k = 2; // Example value for k
        
        head = solution.swapKth(head, k);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}