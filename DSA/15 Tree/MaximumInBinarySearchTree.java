import java.util.*;

public class MaximumInBinarySearchTree {

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        while (root.right != null) {
            root = root.right;
        }
        return root.key;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(30);

        System.out.println("Maximum value in the BST: " + findMax(root));
    }
}
