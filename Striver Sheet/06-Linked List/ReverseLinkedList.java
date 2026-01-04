public class ReverseLinkedList {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Reverse linked list method
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev; // new head
    }

    public static void main(String[] args) {

        // Create linked list: 1 -> 2 -> 3
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // Reverse the list
        head = reverseList(head);

        // Print reversed list
        System.out.print("Reversed List: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
