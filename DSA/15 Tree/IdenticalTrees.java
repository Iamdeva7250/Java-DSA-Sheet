import java.util.*;
import java.io.*;

public class IdenticalTrees {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

     public boolean isIdentical(Node r1, Node r2) {
        // code here
        if(r1 == null && r2 == null) return true;
        
        if(r1 == null || r2 == null) return false;
        
        return (r1.data == r2.data)
              && isIdentical(r1.left, r2.left)
              && isIdentical(r1.right, r2.right);
              
        
    }

    public static void main(String[] args) {
      IdenticalTrees solution = new IdenticalTrees();
      
      Node root1 = new Node(1);
      root1.left = new Node(2);
      root1.right = new Node(3);
      
      Node root2 = new Node(1);
      root2.left = new Node(2);
      root2.right = new Node(3);
      
      boolean result = solution.isIdentical(root1, root2);
      System.out.println("The two trees are identical: " + result);
    }
    
}