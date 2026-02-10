import java.util.*;
import java.io.*;

public class CountNumberofSubTrees {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

     int count;
    int countSubtrees(Node root, int x) {
        //  code here.
        count = 0;
        
        dfs(root, x);
        return count;
    }
    
    private int dfs(Node node, int x){
        if(node == null) return 0;
        
        int leftSum = dfs(node.left, x);
        int rightSum = dfs(node.right, x);
        
        int TotalSum = leftSum + rightSum + node.data;
        
        if(TotalSum == x)
        count++;
        
        return TotalSum;
    }

    public static void main(String[] args) {
      CountNumberofSubTrees solution = new CountNumberofSubTrees();
      
      Node root = new Node(5);
      root.left = new Node(-10);
      root.right = new Node(3);
      root.left.left = new Node(9);
      root.left.right = new Node(8);
      root.right.right = new Node(-4);
      root.right.right.left = new Node(7);
      
      int x = 7;
      int result = solution.countSubtrees(root, x);
      System.out.println("Number of subtrees with sum " + x + ": " + result); 
    }
    
}