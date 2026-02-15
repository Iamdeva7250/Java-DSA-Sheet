import java.util.*;
import java.io.*;

public class Levelordertraversal {
    
    // Your code here
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

     public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            ArrayList<Integer> level = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
            Node curr = q.poll();
            level.add(curr.data );
            
            if(curr.left != null)
            q.add(curr.left);
            
            if(curr.right != null)
            q.add(curr.right);
            }
            result.add(level);
        }
        return result;
    }

    public static void main(String[] args) {
      Levelordertraversal tree = new Levelordertraversal();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);
      for(ArrayList<Integer> level : res){
          System.out.println(level);
      }
    }
    
}