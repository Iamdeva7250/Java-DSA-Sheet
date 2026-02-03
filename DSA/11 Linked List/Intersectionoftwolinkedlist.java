import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intersectionoftwolinkedlist {

    Node head1, head2;

    // Function to get intersection node
    int getNode() {
        int c1 = getCount(head1);
        int c2 = getCount(head2);

        if (c1 > c2) {
            return getIntersectionNode(c1 - c2, head1, head2);
        } else {
            return getIntersectionNode(c2 - c1, head2, head1);
        }
    }

    // Move longer list by d nodes, then traverse both
    int getIntersectionNode(int d, Node node1, Node node2) {
        Node curr1 = node1;
        Node curr2 = node2;

        for (int i = 0; i < d; i++) {
            if (curr1 == null) return -1;
            curr1 = curr1.next;
        }

        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2) {   // ✅ reference comparison
                return curr1.data;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return -1;
    }

    // Count nodes in a list
    int getCount(Node node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        Intersectionoftwolinkedlist list = new Intersectionoftwolinkedlist();

        // Common nodes
        Node common = new Node(15);
        common.next = new Node(30);

        // First list: 3 → 6 → 9 → 15 → 30
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = common;

        // Second list: 10 → 15 → 30
        list.head2 = new Node(10);
        list.head2.next = common;

        System.out.println("Intersection Node: " + list.getNode());
    }
}
