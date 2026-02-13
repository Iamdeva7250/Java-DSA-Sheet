import java.util.*;
import java.io.*;

public class PrintNodesatKDistances {
    
    // Your code here
    static class Node{
      int key;
      Node left, right;

      Node(int item){
        key = item;
        left = right = null;
      }
    }

    static void printKDistances(Node root, int k){
      if(root == null){
        return;
      }
      if(k == 0){
        System.out.print(root.key + " ");
      }else{
        printKDistances(root.left, k - 1);
        printKDistances(root.right, k - 1);
      }
    }

    public static void main(String[] args) {
      Node root = new Node(10);
      root.left = new Node(20);
      root.right = new Node(30);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      
      int k = 2;
      System.out.println("Nodes at distance " + k + " from root:");
      printKDistances(root, k);
    }
    
}