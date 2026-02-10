import java.util.*;

public class ConstructBinaryTreefromParentArray {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to construct tree from parent array
    Node createTree(int[] parent) {
        int n = parent.length;

        Node[] nodes = new Node[n];

        // Step 1: Create all nodes
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }

        Node root = null;

        // Step 2: Assign children
        for (int i = 0; i < n; i++) {
            if (parent[i] == -1) {
                root = nodes[i];
            } else {
                Node p = nodes[parent[i]];

                if (p.left == null) {
                    p.left = nodes[i];
                } else {
                    p.right = nodes[i];
                }
            }
        }
        return root;
    }

    // Inorder traversal to verify tree
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        ConstructBinaryTreefromParentArray tree =
                new ConstructBinaryTreefromParentArray();

        int[] parent = {-1, 0, 0, 1, 1, 2, 2};

        Node root = tree.createTree(parent);

        System.out.print("Inorder Traversal: ");
        tree.inorder(root);
    }
}
