import java.util.*;
import java.io.*;

public class CountthenodesatdistanceKfromleaf {
    
    // Your code here
    
    static class Node{
      int data;
      Node left, right;

      Node(int item){
        data = item;
        left = right = null;
      }
    }

     int count;
    HashSet<Node> seen;
    
    int kthFromLeaf(Node root, int k) {
       count = 0;
       seen = new HashSet<>();
       
       ArrayList<Node> path = new ArrayList<>();
       dfs(root, k, path);
       return count;
      
       
    }
    void dfs(Node root, int k, ArrayList<Node> path){
        if(root == null) return;
        
        path.add(root);
        
        if(root.left == null && root.right == null){
            int idx = path.size() - k - 1;
            
            if(idx >= 0){
                Node candidate = path.get(idx);
                
                if(!seen.contains(candidate)){
       
                    seen.add(candidate);
                    count++;
                }
            }
        }
        dfs(root.left, k , path);
        dfs(root.right, k, path);
        
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
      CountthenodesatdistanceKfromleaf tree = new CountthenodesatdistanceKfromleaf();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.left.left.left = new Node(7);
      root.left.right.left = new Node(8);
      root.left.right.right = new Node(9);
      root.right.right = new Node(6);

      int k = 2;
      System.out.println("Count of nodes at distance " + k + " from leaf nodes is: " + tree.kthFromLeaf(root, k));
      
    }
}