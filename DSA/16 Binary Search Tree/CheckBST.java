import java.util.*;
import java.io.*;

public class CheckBST {
    
    // Your code here
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    int prev = Integer.MIN_VALUE;

    boolean isBST(Node root){
      if(root == null) return true;

      if(isBST(root.left) == false) return false;

      if(root.data <= prev) return false;
      prev = root.data;
      return isBST(root.right);

    }


    //  public boolean isBST(Node root) {
    // return isBSTUtil(root, Long.MIN_VALUE,  Long.MAX_VALUE);
    // }
    // private boolean isBSTUtil(Node node, long min, long max){
    // if( node == null) return true;
    
    // if(node.data <= min || node.data >= max ) return false;
    
    // return isBSTUtil(node.left, min, node.data ) && isBSTUtil(node.right, node.data, max );

    public static void main(String[] args) {
      CheckBST solution = new CheckBST();
      
      Node root = new Node(8);
      root.left = new Node(3);
      root.right = new Node(10);
      root.left.left = new Node(1);
      root.left.right = new Node(6);
      root.left.right.left = new Node(4);
      root.left.right.right = new Node(7);
      root.right.right = new Node(14);
      root.right.right.left = new Node(13);
      
      boolean result = solution.isBST(root);
      System.out.println("The tree is a BST: " + result);
    }
    
}