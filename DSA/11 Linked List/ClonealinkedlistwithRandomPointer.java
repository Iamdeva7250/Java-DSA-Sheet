import java.util.*;

class Node {
    int data;
    Node next;
    Node random;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}

public class ClonealinkedlistwithRandomPointer {

    Node clone(Node n1) {

        if (n1 == null) return null;

        Node curr = n1;

        // STEP 1: Insert copy nodes
        while (curr != null) {
            Node next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }

        // STEP 2: Assign random pointers
        curr = n1;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        // STEP 3: Separate original and cloned list
        Node dummy = n1.next;
        Node cloneCurr = dummy;
        curr = n1;

        while (curr != null) {
            curr.next = curr.next.next;
            cloneCurr.next = (cloneCurr.next != null) ? cloneCurr.next.next : null;

            curr = curr.next;
            cloneCurr = cloneCurr.next;
        }

        return dummy;
    }

    public static void main(String[] args) {
        ClonealinkedlistwithRandomPointer obj = new ClonealinkedlistwithRandomPointer();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        head.random = head.next.next;     // 1 → 3
        head.next.random = head;          // 2 → 1
        head.next.next.random = head.next; // 3 → 2

        Node clonedHead = obj.clone(head);

        // Print cloned list
        Node temp = clonedHead;
        while (temp != null) {
            System.out.println(
                "Data: " + temp.data +
                ", Random: " + (temp.random != null ? temp.random.data : "null")
            );
            temp = temp.next;
        }
    }
}
