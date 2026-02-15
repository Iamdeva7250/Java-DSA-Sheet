import java.util.*;
import java.io.*;

public class MaximumWinningScore {
    
    // Your code here
    // User function Template for Java

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static Long findMaxScore(Node root) {
        // code here
        return dfs(root, 1L);
    }
    
    private static long dfs(Node node, long product){
        if(node == null) return Long.MIN_VALUE;
        product *= node.data;
        if(node.left == null && node.right == null) return product;
        
        return Math.max(dfs(node.left, product), dfs(node.right, product));
    }

    public static void main(String[] args) {
        MaximumWinningScore solution = new MaximumWinningScore();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        root.right.right = new Node(10);

        Long result = findMaxScore(root);
        System.out.println("Maximum Winning Score: " + result);
    }
}
    
