import java.util.*;
import java.io.*;

public class SerializationAndDeserializationBinaryTree {

    // Make TreeNode static
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) return "";

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        List<String> list = new ArrayList<>();

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node == null) {
                list.add("#");
            } else {
                list.add(String.valueOf(node.val));
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return String.join(",", list);
    }

    

    static int idx;

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.length() == 0) return null;

        String[] arr = data.split(",");
        idx = 0;
        return helper(arr);
    }

    private static TreeNode helper(String[] arr) {
        if (arr[idx].equals("#")) {
            idx++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[idx++]));
        root.left = helper(arr);
        root.right = helper(arr);
        return root;
    }

    // Inorder traversal for testing
    static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Driver code
    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        String serialized = serialize(root);
        System.out.println("Serialized Tree:");
        System.out.println(serialized);

        TreeNode newRoot = deserialize(serialized);

        System.out.println("\nInorder Traversal after Deserialization:");
        inorder(newRoot);
    }
}
