import java.util.*;
import java.io.*;

public class MaximumPathSumBetweenTwoSpecialNodes {
    
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    } 

    int maxSum;

    int maxPathSum(Node root) {
        maxSum = Integer.MIN_VALUE;
        int val = dfs(root);
        
        if (maxSum == Integer.MIN_VALUE) {
            return val;
        }
        return maxSum;
    }

    int dfs(Node node) {
        if (node == null) return 0;
        
        if (node.left == null && node.right == null) {
            return node.data;
        }
        
        int left = (node.left != null) ? dfs(node.left) : Integer.MIN_VALUE;
        int right = (node.right != null) ? dfs(node.right) : Integer.MIN_VALUE;
        
        if (node.left != null && node.right != null) {
            maxSum = Math.max(maxSum, left + right + node.data);
            return Math.max(left, right) + node.data;
        }
        
        return (node.left != null ? left : right) + node.data;
    }

    public static void main(String[] args) {
        // Build a sample tree
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        MaximumPathSumBetweenTwoSpecialNodes obj = new MaximumPathSumBetweenTwoSpecialNodes();
        int result = obj.maxPathSum(root);

        System.out.println("Maximum Path Sum Between Two Special Nodes: " + result);
    }
}
