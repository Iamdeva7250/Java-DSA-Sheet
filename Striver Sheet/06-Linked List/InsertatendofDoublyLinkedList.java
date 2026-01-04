import java.util.*;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }

    Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }
}

class InsertatendofDoublyLinkedList {

    public static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node insertAtTail(Node head, int k) {
        Node newNode = new Node(k);

        if (head == null) return newNode;

        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        tail.next = newNode;
        newNode.back = tail;

        return head;
    }


    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 7, 4};

        Node head = InsertatendofDoublyLinkedList.convertArr2DLL(arr);

        System.out.println("Doubly Linked List Initially:");
        InsertatendofDoublyLinkedList.print(head);

        System.out.println("\nAfter inserting 10 at tail:");
        head = InsertatendofDoublyLinkedList.insertAtTail(head, 10);
        InsertatendofDoublyLinkedList.print(head);
    }
}
