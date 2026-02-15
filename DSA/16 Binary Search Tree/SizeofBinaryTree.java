import java.util.*;
import java.io.*;

public class SizeofBinaryTree {
    
    // Your code here
    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

    static int size(Node root){
      if(root == null){
        return 0;
      }else{
        return size(root.left) + 1 + size(root.right);
      }
    }

    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      System.out.println("Size of the binary tree: " + size(root));
    }
    
}