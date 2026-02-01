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
public class Deletewithoutheadpointer {
    
       public void deleteNode(Node del_node) {
        // code here
        del_node.data = del_node.next.data;
        
        del_node.next = del_node.next.next;
        
    }

    public static void main(String[] args) {
        Deletewithoutheadpointer solution = new Deletewithoutheadpointer();
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        
        // Deleting node with value 3
        Node nodeToDelete = head.next.next; // Node with value 3
        solution.deleteNode(nodeToDelete);
        
        // Print the updated list
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
      
    }
    
}