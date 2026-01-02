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

public class IntersectioninYShapedLists {
    
     public Node intersectPoint(Node head1, Node head2) {

        if (head1 == null || head2 == null)
            return null;

        Node p1 = head1;
        Node p2 = head2;

        while (p1 != p2) {
            p1 = (p1 == null) ? head2 : p1.next;
            p2 = (p2 == null) ? head1 : p2.next;
        }

        return p1; 
    }

    public static void main(String[] args) {
        // Example usage:
        Node common = new Node(15);
        common.next = new Node(30);

        Node head1 = new Node(3);
        head1.next = new Node(6);
        head1.next.next = new Node(9);
        head1.next.next.next = common;

        Node head2 = new Node(10);
        head2.next = common;

        IntersectioninYShapedLists obj = new IntersectioninYShapedLists();
        Node intersection = obj.intersectPoint(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection");
        }
    }
}