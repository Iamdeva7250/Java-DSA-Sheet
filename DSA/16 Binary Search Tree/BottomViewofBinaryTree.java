import java.util.*;
import java.io.*;

public class BottomViewofBinaryTree {
    
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

    static class Pair{
            Node node;
            int hd;
            
            Pair(Node n, int h){
                node = n;
                hd = h;
            }
        }


        public ArrayList<Integer> bottomView(Node root) {
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
            
            map.put(hd, node.data);
            
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
     public static void main(String[] args) {
        BottomViewofBinaryTree solution = new BottomViewofBinaryTree();
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        ArrayList<Integer> result = solution.bottomView(root);
        System.out.println("Bottom view of the binary tree: " + result);
     }
}