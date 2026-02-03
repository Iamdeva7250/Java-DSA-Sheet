import java.util.*;
import java.io.*;


class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

class InsertionAtBeginningDLL {

    // Function to insert at beginning
    Node insertAtBeginning(Node head, int data) {

        Node newNode = new Node(data);
        
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        return newNode; 
    }

    // Print list
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        InsertionAtBeginningDLL obj = new InsertionAtBeginningDLL();

        Node head = null;
        head = obj.insertAtBeginning(head, 30);
        head = obj.insertAtBeginning(head, 20);
        head = obj.insertAtBeginning(head, 10);

        obj.printList(head);
    }
}
