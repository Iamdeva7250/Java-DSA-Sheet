import java.util.*;
import java.io.*;

public class InorderTraversal {
    
    // Your code here
    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

    public ArrayList<Integer> Inorder(Node root){
      ArrayList<Integer> result = new ArrayList<>();

      InOrderHelper(root, result);

      return result;
    }

    void InOrderHelper(Node root, ArrayList<Integer> result){

      if(root == null) return;

      InOrderHelper(root.left, result);
      result.add(root.key);
      InOrderHelper(root.right, result);

    }

    public static void main(String[] args) {
      InorderTraversal tree = new InorderTraversal();
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);  
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      System.out.println("Inorder traversal: " + tree.Inorder(root));

    }
    
}