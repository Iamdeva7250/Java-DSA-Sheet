import java.util.*;
import java.io.*;

public class CheckforBalancedBinaryTree {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    public boolean isBalanced(Node root) {
        
        return height(root) != -1;
    }
        
        
        int height(Node root){
        // code here
        if(root == null) return 0;
        
        int leftHeight = height(root.left);
        if(leftHeight == -1) return -1;
        
        int rightHeight = height(root.right);
        if(rightHeight == -1) return -1;
        
        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        
        else return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
      CheckforBalancedBinaryTree tree = new CheckforBalancedBinaryTree();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.left.left.left = new Node(8);

      if(tree.isBalanced(root)){
          System.out.println("The binary tree is balanced.");
      } else {
          System.out.println("The binary tree is not balanced.");
      }
    }
    
}