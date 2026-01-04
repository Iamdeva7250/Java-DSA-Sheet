import java.util.*;
import java.io.*;

public class ReverseNodesink {

  class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;

        while (true) {
            // Check if there are k nodes ahead
            ListNode kth = prevGroup;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;

            ListNode groupNext = kth.next;
            ListNode prev = groupNext;
            ListNode curr = prevGroup.next;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Connect with previous part
            ListNode temp = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }

        return dummy.next;
    }
}
  public static void main(String[] args) {
    
    ReverseNodesink outer = new ReverseNodesink();
    Solution solver = outer.new Solution();
  
    // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
  
    int k = 2; // Group size for reversal
  
    ListNode result = solver.reverseKGroup(head, k);
  
    // Printing the reversed list
    while (result != null) {
        System.out.print(result.data + " ");
        result = result.next;
    }
  }
    
   
    
}