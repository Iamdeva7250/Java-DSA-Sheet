import java.util.*;
import java.io.*;

public class PreordertoBST {
    
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

     int index = 0;
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
        // code here
        return construct(pre, Integer.MIN_VALUE, Integer.MAX_VALUE, size);
        
    }
    
    private Node construct(int[] pre, int min, int max, int size){
        if(index >= size) return null;
        
        int val = pre[index];
        
        if(val < min || val > max) return null;
        
        Node root = new Node(val);
        index++;
        
        root.left = construct(pre, min, val, size);
        
        root.right = construct(pre, val, max, size);
        
        return root;
    }

    public static void main(String[] args) {
          PreordertoBST solution = new PreordertoBST();
          int[] pre = {10, 5, 1, 7, 40, 50};
          int size = pre.length;
          Node root = solution.Bst(pre, size);
      
          System.out.println("Root of the constructed BST: " + root.data);
    }
    
}