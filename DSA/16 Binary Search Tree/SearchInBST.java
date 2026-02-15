import java.util.*;
import java.io.*;

public class SearchInBST {
    
    // Your code here
    class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    boolean search(Node root, int key){

      // Recursive Approach

      // if(root == null) return false;
      // else if(root.data == key) return true;
      // else if(root.data < key) return search(root.right, key);
      // else return search(root.left, key);

      // Iterative Approach

      while(root != null){
        if(root.data == key) return true;
        else if(root.data < key) root = root.right;
        else root = root.left;
      }
      return false;
    }

    public static void main(String[] args) {
      
      SearchInBST tree = new SearchInBST();
      Node root = tree.new Node(50);
      root.left = tree.new Node(30);
      root.right = tree.new Node(70);
      root.left.left = tree.new Node(20);
      root.left.right = tree.new Node(40);
      root.right.left = tree.new Node(60);
      root.right.right = tree.new Node(80);

      int key = 60;
      if(tree.search(root, key))
        System.out.println("Key " + key + " found in BST");
      else
        System.out.println("Key " + key + " not found in BST");
    }
}