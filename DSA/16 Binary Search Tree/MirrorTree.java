import java.util.*;
import java.io.*;

public class MirrorTree {
    
    // Your code here

    static class Node{
    int data;
    Node left, right;
    Node(int item){
      data = item;
      left = right = null;
    }
  }

   void mirror(Node root) {
        // code here
        if(root == null) return;
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        
        mirror(root.left);
        mirror(root.right);
    }
    public static void main(String[] args) {
      MirrorTree tree = new MirrorTree();
      Node root = new Node(1);  
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);

      tree.mirror(root);
      System.out.println("Root after mirroring: " + root.data);
      System.out.println("Left child of root after mirroring: " + root.left.data);
      System.out.println("Right child of root after mirroring: " + root.right.data);
    }
    
}