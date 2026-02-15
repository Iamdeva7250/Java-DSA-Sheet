import java.util.*;
import java.io.*;

public class VerticalSuminaBinaryTree {
    
    static class Node{
      int data;
      Node left, right;

      Node(int key){
        data = key;
        left = right = null;
      }
    }

    void verticalSum(Node root, int hd, TreeMap<Integer, Integer> map){
      if(root == null) return;
      
      verticalSum(root.left, hd - 1, map);
      
      int pSum = (map.get(hd) == null) ? 0 : map.get(hd);
      map.put(hd, pSum + root.data);
      
      verticalSum(root.right, hd + 1, map);
    }

    void VSum(Node root){
      TreeMap<Integer, Integer> map = new TreeMap<>();
      verticalSum(root, 0, map);

      for(Map.Entry<Integer, Integer> sum : map.entrySet()){
        System.out.print(sum.getValue() + " ");
      }
    }

    public static void main(String[] args) {
      VerticalSuminaBinaryTree sol = new VerticalSuminaBinaryTree();
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      sol.VSum(root);
    }
}