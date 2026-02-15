import java.util.*;
import java.io.*;

public class RedBlackTree {
    
    public static class Node {
        public int data;
        public Node left, right;
        
        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    
    static Node prev;
    
    static Boolean isBSTUtil(Node root) {
        // traverse the tree in inorder fashion and 
        // keep track of prev node
        if (root != null) {
            if (!isBSTUtil(root.left))
                return false;
    
            // Allows only distinct valued nodes 
            if (prev != null && root.data <= prev.data)
                return false;
    
            prev = root;
    
            return isBSTUtil(root.right);
        }
        return true;
    }
    
    static Boolean isBST(Node root) {
        prev = null;
        return isBSTUtil(root);
    }
    
    // Driver Code
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
    
        if (isBST(root))
            System.out.println("Is BST");
        else
            System.out.println("Not a BST");
    }
}