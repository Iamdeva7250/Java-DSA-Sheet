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
public class FindlengthofLoop {

   public int lengthOfLoop(Node head) {
        // code here
        if(head == null) return 0;
        
        Node slow = head;
        Node fast = head;
        
        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                return countLoopLength(slow);
            }
        }
        return 0;
        
    }
    
    private int countLoopLength(Node metingNode){
        int count = 1;
        Node temp = metingNode.next;
        
        
        while(temp != metingNode) {
            count++;
            temp = temp.next;
        }
        return count;

    }

    public static void main(String[] args) {
        FindlengthofLoop solution = new FindlengthofLoop();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        // Creating a loop for testing
        head.next.next.next.next.next = head.next; // 5 -> 2 creates a loop
        
        int loopLength = solution.lengthOfLoop(head);
        System.out.println("Length of Loop: " + loopLength);
    }
}

