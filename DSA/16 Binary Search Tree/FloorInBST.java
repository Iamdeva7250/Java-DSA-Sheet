import java.util.*;
import java.io.*;

public class FloorInBST {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    Node floor(Node root, int x){
      Node res = null;

      while(root != null){
          if(root.data == x){
              return root;
          }
          else if(root.data > x){
              root = root.left;
          }
          else{
              res = root;
              root = root.right;
          }
      }
      return res;
    }

    public static void main(String[] args) {
      FloorInBST solution = new FloorInBST();
      
      Node root = new Node(8);
      root.left = new Node(3);
      root.right = new Node(10);
      root.left.left = new Node(1);
      root.left.right = new Node(6);
      root.left.right.left = new Node(4);
      root.left.right.right = new Node(7);
      root.right.right = new Node(14);
      root.right.right.left = new Node(13);
      
      int x = 5;
      Node result = solution.floor(root, x);
      if(result != null){
          System.out.println("Floor of " + x + " is: " + result.data);
      } else {
          System.out.println("No floor found for " + x);
      }
    }
    
}