import java.util.*;
import java.io.*;

public class IterativePreorderTraversal {
    
    // Your code here
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { 
          val = x; 
        }
    }

    void preorderTraversal(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public static void main(String[] args) {
        IterativePreorderTraversal tree = new IterativePreorderTraversal();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Preorder Traversal of the tree:");
        tree.preorderTraversal(root);
    }
    
}