import java.util.*;

public class ThreadedBinaryTree {

    static class Node {
        int data;
        Node left, right;
        boolean rightThread;

        Node(int data) {
            this.data = data;
            left = right = null;
            rightThread = false;
        }
    }

    // Find the leftmost node
    static Node leftMost(Node node) {
        if (node == null)
            return null;

        while (node.left != null)
            node = node.left;

        return node;
    }

    // Inorder traversal of a threaded binary tree
    static void inOrder(Node root) {
        Node cur = leftMost(root);

        while (cur != null) {
            System.out.print(cur.data + " ");

            // If right pointer is a thread, move to inorder successor
            if (cur.rightThread)
                cur = cur.right;
            else
                cur = leftMost(cur.right);
        }
    }

    // Driver code
    public static void main(String[] args) {

        /*
                10
               /  \
              5    15
             / \     \
            2   7     20

        Threading:
        2 -> 5
        7 -> 10
        15 -> 20
        */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        root.left.left = new Node(2);
        root.left.right = new Node(7);

        root.right.right = new Node(20);

        // Create threads manually
        root.left.left.right = root.left;
        root.left.left.rightThread = true;

        root.left.right.right = root;
        root.left.right.rightThread = true;

        root.right.rightThread = false;

        System.out.print("Inorder Traversal: ");
        inOrder(root);
    }
}
