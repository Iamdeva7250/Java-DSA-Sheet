import java.util.*;
import java.io.*;

public class LevelOrderTraversalLineByLine {
    
    // Your code here

    static class Node{
      int key;
      Node left, right;
      Node(int item){
        key = item;
        left = right = null;
      }
    }
    
    void printLevelOrderLineByLine(Node root){
      if(root == null){
        return;
      }

      Queue<Node> queue = new LinkedList<Node>();
      queue.add(root);
      while(true){
        int nodeCount = queue.size();
        if(nodeCount == 0){
          break;
        }
        while(nodeCount > 0){
          Node currNode = queue.poll();
          System.out.print(currNode.key + " ");

          if(currNode.left != null){
            queue.add(currNode.left);
          }
          if(currNode.right != null){
            queue.add(currNode.right);
          }
          nodeCount--;
        }
        System.out.println();
      }
    } 

    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      LevelOrderTraversalLineByLine tree = new LevelOrderTraversalLineByLine();
      System.out.println("Level Order Traversal of binary tree line by line is:");
      tree.printLevelOrderLineByLine(root);w
    }
}