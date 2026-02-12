import java.util.*;
import java.io.*;

public class MaximumWidthOfBinaryTrees {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }
    

    int getmaxWidth(Node root){
      if(root == null) return 0;

      Queue<Node> q = new LinkedList<Node>();
      q.add(root);

      int res = 0;

      while(q.isEmpty() == false){
        int count = q.size();
        res = Math.max(res, count);

        for(int i = 0; i < count; i++){
          Node curr = q.poll();

          if(curr.left != null) q.add(curr.left);
          if(curr.right != null) q.add(curr.right);
        }
      }
      return res;
    }

    public static void main(String[] args) {
      MaximumWidthOfBinaryTrees tree = new MaximumWidthOfBinaryTrees();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.right = new Node(8);
      root.right.right.left = new Node(6);
      root.right.right.right = new Node(7);

      System.out.println("Maximum width is " + tree.getmaxWidth(root));
    }
}