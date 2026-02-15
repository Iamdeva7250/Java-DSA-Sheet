import java.util.*;

public class InordertraversalofaBST {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        InorderHelper(root, result);
        return result;
    }

    private void InorderHelper(Node node, ArrayList<Integer> list) {
        if (node == null) return;
        InorderHelper(node.left, list);
        list.add(node.data);
        InorderHelper(node.right, list);
    }

    public static void main(String[] args) {
        InordertraversalofaBST sol = new InordertraversalofaBST();

        // Build a sample BST
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        // Run inorder traversal
        ArrayList<Integer> result = sol.inOrder(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
