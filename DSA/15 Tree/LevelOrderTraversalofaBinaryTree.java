import java.util.*;
import java.io.*;

public class LevelOrderTraversalofaBinaryTree {
    
    // Your code here
    static class Node{
      int key;
      Node left, right;

      Node(int item){
        key = item;
        left = right = null;
      }
    }

    void printLevelOrder(Node root){
      if(root == null){
        return;
      }

      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(queue.isEmpty() == false){
        Node currNode = queue.poll();
        System.out.print(currNode.key + " ");

        if(currNode.left != null){
          queue.add(currNode.left);
        }
        if(currNode.right != null){
          queue.add(currNode.right);
        }
      }
    }


    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      LevelOrderTraversalofaBinaryTree tree = new LevelOrderTraversalofaBinaryTree();
      System.out.println("Level Order Traversal of binary tree is:");
      tree.printLevelOrder(root); 
    }

    
}