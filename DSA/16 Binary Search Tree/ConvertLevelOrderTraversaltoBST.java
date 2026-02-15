import java.util.*;
import java.io.*;

public class ConvertLevelOrderTraversaltoBST {
    
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
      public Node constructBST(int[] arr) {
        // Write your code here
        if(arr == null || arr.length == 0) return null;
        
        Node root = new Node(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            insertIntoBST(root, arr[i]);
        }
        return root;
    }
    
    private Node insertIntoBST(Node root, int val){
        if(root == null){
            return new Node(val);
        }
        if(val < root.data){
            root.left = insertIntoBST(root.left, val);
        }else{
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
    public static void main(String[] args) {
        ConvertLevelOrderTraversaltoBST solution = new ConvertLevelOrderTraversaltoBST();
        int[] arr = {10, 5, 15, 3, 7, 12, 18};
        Node root = solution.constructBST(arr);
        
        System.out.println("Root of the constructed BST: " + root.data);
    }
}