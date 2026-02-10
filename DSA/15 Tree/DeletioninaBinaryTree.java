import java.util.*;

public class DeletioninaBinaryTree {

    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = right = null;
        }
    }

    // Inorder traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    // Delete deepest node
    static void deleteDeepest(Node root, Node dNode) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();

            if (temp.left != null) {
                if (temp.left == dNode) {
                    temp.left = null;
                    return;
                }
                q.add(temp.left);
            }

            if (temp.right != null) {
                if (temp.right == dNode) {
                    temp.right = null;
                    return;
                }
                q.add(temp.right);
            }
        }
    }

    // Delete node with given key
    static void deletion(Node root, int key) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        Node temp = null;
        Node keyNode = null;

        while (!q.isEmpty()) {
            temp = q.poll();

            if (temp.key == key)
                keyNode = temp;

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }

        if (keyNode != null) {
            int x = temp.key;          // deepest node value
            deleteDeepest(root, temp); // delete deepest node
            keyNode.key = x;           // replace value
        }
    }

    public static void main(String[] args) {

        /*
                 10
               /    \
             11      9
            /  \    / \
           7   12  15  8
        */

        Node root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.print("Inorder before deletion: ");
        inorder(root);

        int key = 11;
        deletion(root, key);

        System.out.print("\nInorder after deletion: ");
        inorder(root);
    }
}
