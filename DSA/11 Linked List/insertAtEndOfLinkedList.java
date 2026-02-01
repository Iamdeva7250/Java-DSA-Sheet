public class InsertAtEndOfLinkedList {

    // Define the Node class (make it static so it can be used in static methods)
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    // Function to insert a new node at the end of the list
    public static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);

        // If the list is empty, return the new node as head
        if (head == null)
            return temp;

        Node curr = head;
        // Traverse till the end
        while (curr.next != null)
            curr = curr.next;

        // Link the new node at the end
        curr.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);

        // Printing the list to verify
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
