import java.util.*;
import java.io.*;

public class PairSumwithgivenBST {
    
    static class Node {
        int data;
        Node left, right;

        Node(int key){
            data = key;
            left = right = null;
        }
    }

    boolean isPairSum(Node root, int sum){
        HashSet<Integer> set = new HashSet<>();
        return isPairSum(root, sum, set);
    }

    boolean isPairSum(Node root, int sum, HashSet<Integer> set){
        if(root == null) return false;

        // Traverse left subtree
        if(isPairSum(root.left, sum, set)) return true;

        // Check current node
        if(set.contains(sum - root.data)) return true;
        set.add(root.data);

        // Traverse right subtree
        return isPairSum(root.right, sum, set);
    }

    public static void main(String[] args) {
        PairSumwithgivenBST sol = new PairSumwithgivenBST();
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(sol.isPairSum(root, 9));  
        System.out.println(sol.isPairSum(root, 14)); 
        System.out.println(sol.isPairSum(root, 1));  
    }
}
