import java.util.*;

public class InsertInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // ================= RECURSIVE APPROACH =================
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }
        // duplicate keys are ignored

        return root;
    }

    /*
    // ================= ITERATIVE APPROACH =================
    Node insert(Node root, int key) {

        if (root == null)
            return new Node(key);

        Node parent = null;
        Node current = root;

        while (current != null) {
            parent = current;
            if (key < current.data)
                current = current.left;
            else if (key > current.data)
                current = current.right;
            else
                return root; // duplicate key
        }

        if (key < parent.data)
            parent.left = new Node(key);
        else
            parent.right = new Node(key);

        return root;
    }
    */

    public static void main(String[] args) {
        InsertInBST sol = new InsertInBST();
        Node root = null;

        int[] keys = {10, 5, 15, 3, 7};

        for (int key : keys) {
            root = sol.insert(root, key);
        }

        System.out.println("BST created with keys: " + Arrays.toString(keys));
    }
}
