import java.util.*;
import java.io.*;

public class VerticalWidthofaBinaryTree {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    int min = 0;
    int max = 0;

    public int verticalWidth(Node root){
      if(root == null) return 0;

      findWidth(root, 0);
      return max - min + 1;
    }

    private void findWidth(Node root, int hd){
      if(root == null) return;

      min = Math.min(min, hd);
      max = Math.max(max, hd);

      findWidth(root.left, hd - 1);
      findWidth(root.right, hd + 1);
    } 

    public static void main(String[] args) {
      VerticalWidthofaBinaryTree tree = new VerticalWidthofaBinaryTree();

      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.right = new Node(6);
      root.left.left.left = new Node(7);

      System.out.println("Vertical Width of the Binary Tree is: " + tree.verticalWidth(root));
    }
    
}