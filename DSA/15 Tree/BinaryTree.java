import java.util.*;
import java.io.*;

public class BinaryTree {
    
    // Your code here
    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      System.out.println("Root Node: " + root.key);
      System.out.println("Left Child of Root: " + root.left.key);
      System.out.println("Right Child of Root: " + root.right.key);
      System.out.println("Left Grandchild of Root: " + root.left.left.key);
      System.out.println("Right Grandchild of Root: " + root.left.right.key);
      System.out.println("Left Grandchild of Root: " + root.left.left.key);
      System.out.println("Right Grandchild of Root: " + root.left.right.key); 
      
    }
    
}