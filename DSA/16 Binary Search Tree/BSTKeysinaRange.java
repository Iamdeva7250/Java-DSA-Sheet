import java.util.*;
import java.io.*;

public class BSTKeysinaRange {
    
    // Your code here

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
       
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
    ArrayList<Integer> result = new ArrayList<>();
    
    inorder(root, low, high, result );
    return result;
        
    }
    private static void inorder(Node root, int low, int high, ArrayList<Integer> result){
    if(root == null) return;
    
    if(root.data > low){
    inorder(root.left, low, high, result );
     }
     if(root.data >= low && root.data <= high ){
      result.add(root.data);
      }
      if( root.data < high){
      inorder( root.right, low, high, result);
      }
    }


    public static void main(String[] args) {
      BSTKeysinaRange solution = new BSTKeysinaRange();
      Node root = new Node(10);
      root.left = new Node(5);
      root.right = new Node(15);
      root.left.left = new Node(3);
      root.left.right = new Node(7);
      root.right.right = new Node(18);

      int low = 7, high = 15;
      ArrayList<Integer> result = printNearNodes(root, low, high);
      System.out.println("Keys in the range [" + low + ", " + high + "]: " + result); 
    }
    
}