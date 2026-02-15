import java.util.*;
import java.io.*;

public class LevelordertraversalofaBST {
    
  static class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
    // Your code here
      static ArrayList<Integer> levelOrder(Node node) {
    ArrayList<Integer> result = new ArrayList<>();
    if(node == null) return result;
    
    Queue<Node> q = new LinkedList<>();
    
    q.add(node);
    while(!q.isEmpty()){
    Node curr = q.poll();
    result.add(curr.data);
    
    if(curr.left != null) q.add(curr.left);
    if(curr.right != null) q.add(curr.right);
      }
      return result;
    }

    public static void main(String[] args) {
      LevelordertraversalofaBST solution = new LevelordertraversalofaBST();
      Node root = new Node(1);
      root.left = new Node(2);

      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      ArrayList<Integer> result = levelOrder(root);
      System.out.println("Level Order Traversal of the BST: " + result);
      
    }
    
}