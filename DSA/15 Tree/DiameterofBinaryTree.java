import java.util.*;
import java.io.*;

public class DiameterofBinaryTree {
    
    // Your code here

    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

     int maxDiameter;
    public int diameter(Node root) {
 
        maxDiameter = 0;
        
        height(root);
        return maxDiameter;
    }
        
    private int height(Node root){
        if(root == null) return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        maxDiameter = Math.max(maxDiameter, lh + rh);
        
        return Math.max(lh, rh) + 1;
        
    }

    public static void main(String[] args) {
      DiameterofBinaryTree tree = new DiameterofBinaryTree();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);

      tree.diameter(root);
      System.out.println("Diameter of the binary tree is : " + tree.maxDiameter);
    }
    
}