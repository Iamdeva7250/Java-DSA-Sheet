import java.util.*;
import java.io.*;

public class PreorderTraversal {
    
    // Your code here
    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

     public ArrayList<Integer> preOrder(Node root){
      ArrayList<Integer> result = new ArrayList<>();
      preOrderHelper(root, result);
      return result;
     }

     void preOrderHelper(Node root, ArrayList<Integer> result){
      if(root == null){
        return;
      }
      result.add(root.key);
      preOrderHelper(root.left, result);
      preOrderHelper(root.right, result);
     }

     public static void main(String[] args) {
      PreorderTraversal tree = new PreorderTraversal();
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      ArrayList<Integer> preorderList = tree.preOrder(root);
      System.out.println("Preorder Traversal: " + preorderList);  
     }
    
}