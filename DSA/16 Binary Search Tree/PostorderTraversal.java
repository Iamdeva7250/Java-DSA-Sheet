import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class PostorderTraversal {
    
    // Your code here

    static class Node {
       int key;
       Node left, right;

       Node(int item){
        key = item;
        left = right = null;
       }
    }

    public ArrayList<Integer> postorderTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        postorderHelper(root, result);
        return result;
    }
    void postorderHelper(Node root, ArrayList<Integer> result){
      if(root == null){
        return;
      }
      postorderHelper(root.left, result);
      postorderHelper(root.right, result);
      result.add(root.key);
    }
    public static void main(String[] args) {
      PostorderTraversal tree = new PostorderTraversal();
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      ArrayList<Integer> postorderList = tree.postorderTraversal(root);
      System.out.println("Postorder Traversal: " + postorderList);
    }


    
}