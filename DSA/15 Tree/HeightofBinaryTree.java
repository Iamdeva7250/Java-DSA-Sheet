import java.util.*;
import java.io.*;

public class HeightofBinaryTree {
    
    // Your code here
    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

    static int height(Node root){
      if(root == null)
        return -1;
    
        return Math.max(height(root.left), height(root.right)) + 1;
      
    }

    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      System.out.println("Height of the binary tree: " + height(root)); 
    }
    
}