import java.util.*;
import java.io.*;

public class RotatedList {
    
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length and last node
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        // Step 2: Make it circular
        curr.next = head;

        // Step 3: Find new tail
        k = k % length;
        int stepsToNewTail = length - k;

        ListNode newTail = curr;
        while (stepsToNewTail-- > 0) {
            newTail = newTail.next;
        }

        // Step 4: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
    public static void main(String[] args) {

      System.out.println("Rotate a linked list to the right by k places :: ..");
        RotatedList outer = new RotatedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode result = outer.rotateRight(head, k);

        // Print rotated list
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

    
