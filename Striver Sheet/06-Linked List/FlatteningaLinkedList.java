import java.util.*;
import java.io.*;

class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.child = null;
    }
}

public class FlatteningaLinkedList {

    // Merge two sorted linked lists using child pointers
    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.child = list1;
                list1 = list1.child;
            } else {
                curr.child = list2;
                list2 = list2.child;
            }
            curr = curr.child;
            curr.next = null; // remove next pointers
        }

        if (list1 != null) curr.child = list1;
        else curr.child = list2;

        return dummy.child;
    }

    // Flatten a multi-level linked list
    public static ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        head.next = flattenLinkedList(head.next);
        head = merge(head, head.next);
        return head;
    }

    // Print flattened list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.child;
        }
        System.out.println();
    }

    // Print original list structure
    public static void printOriginalLinkedList(ListNode head, int depth) {
        while (head != null) {
            System.out.print(head.val);
            if (head.child != null) {
                System.out.print(" -> ");
                printOriginalLinkedList(head.child, depth + 1);
            }

            if (head.next != null) {
                System.out.println();
                for (int i = 0; i < depth; i++) {
                    System.out.print("| ");
                }
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {

        // Create linked list
        ListNode head = new ListNode(5);
        head.child = new ListNode(14);

        head.next = new ListNode(10);
        head.next.child = new ListNode(4);

        head.next.next = new ListNode(12);
        head.next.next.child = new ListNode(20);
        head.next.next.child.child = new ListNode(13);

        head.next.next.next = new ListNode(7);
        head.next.next.next.child = new ListNode(17);

        // Print original list
        System.out.println("Original linked list:");
        printOriginalLinkedList(head, 0);

        // Flatten list
        ListNode flattened = flattenLinkedList(head);

        // Print flattened list
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}
