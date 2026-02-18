import java.util.*;
import java.io.*;

public class TopViewofBinaryTree {
    
    // Your code here

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
      }

        public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        if(root == null) return result;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
        Pair curr = q.poll();
        Node node = curr.node;
        int hd = curr.hd;
        
        map.putIfAbsent(hd, node.data);
        
        if(node.left != null)
         q.add(new Pair(node.left, hd - 1));
         
         if(node.right != null)
          q.add(new Pair(node.right, hd + 1));
        }
        
        for(int val : map.values()){
            result.add(val);
        }
          return result;
         
    }
    
    static class Pair{
        Node node;
        int hd;
        
        Pair(Node n , int h){
            node = n;
            hd = h;
        }
    }

    public static void main(String[] args) {
        TopViewofBinaryTree tree = new TopViewofBinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        ArrayList<Integer> topView = tree.topView(root);
        System.out.println("Top view of the binary tree: " + topView);
    }
    
}