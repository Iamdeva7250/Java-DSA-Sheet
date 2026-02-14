import java.util.*;
import java.io.*;

public class CeilInBST {
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    
    // Function to find ceiling of a given key in BST
    static int findCeil(Node root, int key) {
        if (root == null)
            return -1;
        
        int ceil = -1;
        Node current = root;
        
        while (current != null) {
            // If key is equal to root, return root data
            if (current.data == key)
                return current.data;
            
            // If key is smaller, go to left subtree
            // But before that, update ceil
            if (key < current.data) {
                ceil = current.data;
                current = current.left;
            } else {
                // If key is greater, go to right subtree
                current = current.right;
            }
        }
        
        return ceil;
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        
        int key = 6;
        int result = findCeil(root, key);
        
        if (result == -1)
            System.out.println("Ceiling of " + key + " does not exist");
        else
            System.out.println("Ceiling of " + key + " is " + result);
        
        key = 13;
        result = findCeil(root, key);
        
        if (result == -1)
            System.out.println("Ceiling of " + key + " does not exist");
        else
            System.out.println("Ceiling of " + key + " is " + result);
    }
}