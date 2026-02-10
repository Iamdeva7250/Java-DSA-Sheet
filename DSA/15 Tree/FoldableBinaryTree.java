import java.util.*;
import java.io.*;

public class FoldableBinaryTree {
    
    // Your code here

    static class Node{
    int data;   
    Node left, right;
    Node(int item){
      data = item;
      left = right = null;
    }
  }

   boolean IsFoldable(Node node) {
        // your code
        if(node == null) return true;
        
        return isMirror(node.left, node.right);
    }
    
    boolean isMirror(Node a, Node b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        
        return isMirror(a.left, b.right) &&
               isMirror(a.right, b.left);
    }

    public static void main(String[] args) {
      FoldableBinaryTree tree = new FoldableBinaryTree();
      Node root = new Node(1);  
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.right = new Node(4);
      root.right.left = new Node(5);

      if(tree.IsFoldable(root)){
          System.out.println("The binary tree is foldable.");
      } else {
          System.out.println("The binary tree is not foldable.");
      }
    }
    
}