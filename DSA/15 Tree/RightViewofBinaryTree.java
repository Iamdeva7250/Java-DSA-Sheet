import java.util.*;
import java.io.*;

public class RightViewofBinaryTree {
    
    // Your code here

    static class Node{
    int data;
    Node left, right;
    Node(int item){
      data = item;
      left = right = null;
    }
  }

    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) return res;
        
        Queue <Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0; i < size; i++){
                Node curr = q.poll();
                
                if(i == size - 1){
                    res.add(curr.data);
                }
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
      RightViewofBinaryTree tree = new RightViewofBinaryTree();
      Node root = new Node(1);  
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.right = new Node(4);
      root.left.right.right = new Node(5);
      root.left.right.right.right = new Node(6);

      ArrayList<Integer> res = tree.rightView(root);
      for(int val : res){
          System.out.println("Right View Of Binary Tree: " + val + " ");
      }
    }
    
}