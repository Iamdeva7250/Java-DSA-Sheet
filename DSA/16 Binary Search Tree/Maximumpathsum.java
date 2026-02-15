import java.util.*;
import java.io.*;

public class Maximumpathsum {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    int maxSum = Integer.MIN_VALUE;

    int findMaxPathSum(Node root){

      helper(root);

      return maxSum;
    }

    int helper(Node node){

      if(node == null) return 0;

      int leftSum = Math.max(0, helper(node.left));
      int rightSum = Math.max(0, helper(node.right));

     int currentPathSum = node.data + leftSum + rightSum;

      maxSum = Math.max(maxSum, currentPathSum);

      return node.data + Math.max(leftSum, rightSum);


    }
    public static void main(String[] args) {
      Maximumpathsum solution = new Maximumpathsum();

      Node root = new Node(-10);
      root.left = new Node(9);
      root.right = new Node(20);
      root.right.left = new Node(15);
      root.right.right = new Node(7);

      int result = solution.findMaxPathSum(root);
      System.out.println("Maximum Path Sum: " + result);
    }
    
}