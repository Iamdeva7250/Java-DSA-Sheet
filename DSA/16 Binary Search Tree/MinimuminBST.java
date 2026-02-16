import java.util.*;
import java.io.*;

public class MinimuminBST {
    
    // Your code here
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
      }

     public int minValue(Node root) {
        // code here
        if(root == null){
            return -1;
        }
        
        Node current = root;
        
        while(current.left != null){
            current = current.left;
        }
        return current.data;
    }

    public static void main(String[] args) {
        MinimuminBST tree = new MinimuminBST();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        System.out.println("Minimum value in the BST: " + tree.minValue(root)); 
    }
    
}