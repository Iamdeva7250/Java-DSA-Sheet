import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SegregateEvenandOddNodes {

    Node head;

    // Function to segregate even and odd nodes
    public void segregateEvenOdd() {
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = curr;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = curr;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        // If either even or odd list is empty
        if (evenStart == null || oddStart == null)
            return;

        // Combine even and odd lists
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head = evenStart;
    }

    // Push node at front
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Print linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        SegregateEvenandOddNodes list = new SegregateEvenandOddNodes();

        list.push(11);
        list.push(10);
        list.push(9);
        list.push(6);
        list.push(4);
        list.push(1);
        list.push(0);

        System.out.println("Original Linked List:");
        list.printList();

        list.segregateEvenOdd();

        System.out.println("After Segregation:");
        list.printList();
    }
}
