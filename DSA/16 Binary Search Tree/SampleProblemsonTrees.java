import java.util.*;

public class SampleProblemsonTrees {

    // Basic Node structure
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    /* =========================
       1. Inorder Traversal
       ========================= */
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    /* =========================
       2. Height of Binary Tree
       ========================= */
    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    /* =========================
       3. Count Nodes
       ========================= */
    static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    /* =========================
       4. Level Order Traversal
       ========================= */
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");

            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }

    /* =========================
       5. Mirror Binary Tree
       ========================= */
    static Node mirror(Node root) {
        if (root == null) return null;

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    /* =========================
       6. Check if Tree is Balanced
       ========================= */
    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    static int checkHeight(Node root) {
        if (root == null) return 0;

        int lh = checkHeight(root.left);
        if (lh == -1) return -1;

        int rh = checkHeight(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1) return -1;

        return Math.max(lh, rh) + 1;
    }

    /* =========================
       Driver Code
       ========================= */
    public static void main(String[] args) {

        /*
                1
              /   \
             2     3
            / \
           4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nLevel Order: ");
        levelOrder(root);

        System.out.println("\nHeight: " + height(root));
        System.out.println("Total Nodes: " + countNodes(root));
        System.out.println("Is Balanced: " + isBalanced(root));

        mirror(root);
        System.out.print("Inorder after Mirror: ");
        inorder(root);
    }
}
