import java.util.*;
import java.io.*;

public class ConvertBinaryTreeToDLL {
    
    // Your code here

    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

    Node prev = null;

    Node bToDLL(Node root){
      if(root == null) return root;

      Node head = bToDLL(root.left); 
      if(prev == null){
        head = root;
      } else {
        root.left = prev;
        prev.right = root;
      }
      prev = root;
      bToDLL(root.right);
      return head;
    }
    
    public static void main(String[] args) {
      ConvertBinaryTreeToDLL tree = new ConvertBinaryTreeToDLL();
      Node root = new Node(10);
      root.left = new Node(12);
      root.right = new Node(15);
      root.left.left = new Node(25);
      root.left.right = new Node(30);
      root.right.left = new Node(36);

      Node head = tree.bToDLL(root);
      System.out.println("Doubly Linked List is : ");
      while(head != null){
        System.out.print(head.data + " ");
        head = head.right;
      }
    }
}