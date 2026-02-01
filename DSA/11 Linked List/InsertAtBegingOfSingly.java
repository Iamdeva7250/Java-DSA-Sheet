public class InsertAtBegingOfSingly {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to insert node at beginning
    static Node insertBeginning(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = null;  // start with empty list

        head = insertBeginning(head, 30);
        head = insertBeginning(head, 20);
        head = insertBeginning(head, 10);

        printList(head);
    }
}
