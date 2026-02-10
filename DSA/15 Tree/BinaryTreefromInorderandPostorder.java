import java.util.*;

public class BinaryTreefromInorderandPostorder {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    int postIndex;

    Node buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private Node build(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        Node root = new Node(postorder[postIndex--]);

        if (inStart == inEnd)
            return root;

        int inIndex = search(inorder, inStart, inEnd, root.data);

        // Build right first (important for postorder)
        root.right = build(inorder, postorder, inIndex + 1, inEnd);
        root.left  = build(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    private int search(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }

    // ✅ Missing method added
    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTreefromInorderandPostorder tree =
                new BinaryTreefromInorderandPostorder();

        int inorder[]   = {4, 2, 5, 1, 6, 3, 7};
        int postorder[] = {4, 5, 2, 6, 7, 3, 1};

        Node root = tree.buildTree(inorder, postorder);

        System.out.println("Inorder traversal of the constructed tree:");
        tree.inorder(root);
    }
}
