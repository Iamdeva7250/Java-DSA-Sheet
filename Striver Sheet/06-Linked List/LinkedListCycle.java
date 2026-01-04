public class LinkedListCycle {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // Cycle detection method
    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;  // move 2 steps

            if (slow == fast)
                return true;         // cycle found
        }

        return false;                // no cycle
    }

    public static void main(String[] args) {

        // Create nodes
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(-4);

        // Create linked list: 3 -> 2 -> 0 -> -4
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create a cycle: -4 -> 2
        fourth.next = second;

        // Test cycle detection
        boolean result = hasCycle(head);
        System.out.println("Does the linked list have a cycle : " + result);
    }
}
