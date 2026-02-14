import java.util.*;

public class DeletionInBST {

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node delNode(Node root, int x) {

        if (root == null)
            return null;

        if (x < root.key) {
            root.left = delNode(root.left, x);
        } 
        else if (x > root.key) {
            root.right = delNode(root.right, x);
        } 
        else {
            // Case 1 & 2: one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: two children
            Node successor = getSuccessor(root);
            root.key = successor.key;
            root.right = delNode(root.right, successor.key);
        }

        return root;
    }

    Node getSuccessor(Node root) {
        Node curr = root.right;
        while (curr != null && curr.left != null)
            curr = curr.left;
        return curr;
    }

    public static void main(String[] args) {
        DeletionInBST solution = new DeletionInBST();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        int keyToDelete = 50;
        root = solution.delNode(root, keyToDelete);

        System.out.println("Node with key " + keyToDelete + " deleted from the BST.");
    }
}
