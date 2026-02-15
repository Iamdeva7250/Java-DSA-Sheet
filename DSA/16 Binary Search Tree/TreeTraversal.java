import java.util.*;
import java.io.*;

public class TreeTraversal {
    
    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Preorder Traversal: Root → Left → Right
    static void preorderTraversal(Node root) {
        if (root == null) return;

        System.out.print(root.key + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Inorder Traversal: Left → Root → Right
    static void inorderTraversal(Node root) {
        if (root == null) return;

        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }

    // Postorder Traversal: Left → Right → Root
    static void postorderTraversal(Node root) {
        if (root == null) return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        preorderTraversal(root);

        System.out.println("\nInorder Traversal:");
        inorderTraversal(root);

        System.out.println("\nPostorder Traversal:");
        postorderTraversal(root);
    }
}
