import java.util.*;
import java.io.*;

public class DeletetheMiddleNodeofaLinkedList {
    
     public ListNode deleteMiddle(ListNode head) {
        
        // If list has 0 or 1 node
        if (head == null || head.next == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Delete middle node
        prev.next = slow.next;
        
        return head;
    }

    public static void main(String[] args) {
        DeletetheMiddleNodeofaLinkedList solver = new DeletetheMiddleNodeofaLinkedList();
        
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        head = solver.deleteMiddle(head);
        
        // Print the modified list
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}