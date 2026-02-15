import java.util.*;
import java.io.*;

public class IterativeInOrderTraversal {
    
    // Your code here

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { 
          val = x; 
        }
    }

    void inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.val + " ");
            curr = curr.right;
        }
    }

    public static void main(String[] args) {
        IterativeInOrderTraversal tree = new IterativeInOrderTraversal();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Inorder Traversal of the tree:");
        tree.inorderTraversal(root);
    }
    
}