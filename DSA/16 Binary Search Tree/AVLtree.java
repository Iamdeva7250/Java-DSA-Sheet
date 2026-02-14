import java.util.*;
import java.io.*;

public class AVLtree {
    
    static class Node {
        int data, height;
        Node left, right;
        
        Node(int key) {
            data = key;
            height = 1;
            left = right = null;
        }
    }
    
    // Get height of node
    static int getHeight(Node node) {
        return (node == null) ? 0 : node.height;
    }
    
    // Get balance factor
    static int getBalance(Node node) {
        return (node == null) ? 0 : getHeight(node.left) - getHeight(node.right);
    }
    
    // Right rotate
    static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        
        x.right = y;
        y.left = T2;
        
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        
        return x;
    }
    
    // Left rotate
    static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        
        y.left = x;
        x.right = T2;
        
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));
        y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
        
        return y;
    }
    
    // Insert a node
    static Node insert(Node node, int key) {
        if (node == null)
            return new Node(key);
        
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node;
        
        // Update height
        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        
        // Get balance factor
        int balance = getBalance(node);
        
        // Left Left Case
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);
        
        // Right Right Case
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);
        
        // Left Right Case
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        
        // Right Left Case
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        
        return node;
    }
    
    // Inorder traversal
    static void inorder(Node node) {
        if (node == null)
            return;
        
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    
    public static void main(String[] args) {
        Node root = null;
        
        // Insert values
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        
        System.out.print("Inorder traversal of AVL tree: ");
        inorder(root);
        System.out.println();
        System.out.println("Height of tree: " + getHeight(root));
    }
}