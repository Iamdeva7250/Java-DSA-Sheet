import java.util.*;
import java.io.*;

public class VerticalTreeTraversal {
    
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    static class Pair{
        Node node;
        int hd;
        
        Pair(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;
        
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;
            
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(curr.data);
            
            if(curr.left != null)
            q.add(new Pair(curr.left, hd - 1));
            
            if(curr.right != null)
            q.add(new Pair(curr.right, hd + 1));
        }
        for(ArrayList<Integer> col : map.values()){
            result.add(col);
        }
        return result;
    }
}

public static void main(String[] args) {
    VerticalTreeTraversal solution = new VerticalTreeTraversal();
    Solution sol = solution.new Solution();
    
    Node root = solution.new Node(1);
    root.left = solution.new Node(2);
    root.right = solution.new Node(3);
    root.left.left = solution.new Node(4);
    root.left.right = solution.new Node(5);
    root.right.left = solution.new Node(6);
    root.right.right = solution.new Node(7);
    
    ArrayList<ArrayList<Integer>> verticalOrder = sol.verticalOrder(root);
    
    System.out.println("Vertical Order Traversal:");
    for (ArrayList<Integer> col : verticalOrder) {
        System.out.println(col);
    }
}
    
}