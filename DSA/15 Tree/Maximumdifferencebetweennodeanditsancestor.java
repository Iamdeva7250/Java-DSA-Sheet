import java.util.*;
import java.io.*;

public class Maximumdifferencebetweennodeanditsancestor {
    
    // Your code here

    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    int ans;
    
    int maxDiff(Node root) {
        //  code here
        ans = Integer.MIN_VALUE;
        
        helper(root);
        return ans;
        
    }

    
    int helper(Node node){
        if(node == null)
        return Integer.MAX_VALUE;
        
        if(node.left == null && node.right == null)
        return node.data;
        
        int leftMin = helper(node.left);
        int rightMin = helper(node.right);
        
        int currentMin = Math.min(leftMin, rightMin);
        
        ans = Math.max(ans, node.data - currentMin);
        
        return Math.min(node.data, currentMin);
        
     
    }

    public static void main(String[] args) {
      Maximumdifferencebetweennodeanditsancestor solution = new Maximumdifferencebetweennodeanditsancestor();
      
      Node root = new Node(8);
      root.left = new Node(3);
      root.right = new Node(10);
      root.left.left = new Node(1);
      root.left.right = new Node(6);
      root.left.right.left = new Node(4);
      root.left.right.right = new Node(7);
      root.right.right = new Node(14);
      root.right.right.left = new Node(13);
      
      int result = solution.maxDiff(root);
      System.out.println("Maximum difference between node and its ancestor: " + result);
    }
    
}