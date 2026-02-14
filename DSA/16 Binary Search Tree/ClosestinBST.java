import java.util.*;
import java.io.*;

public class ClosestinBST {
    

    static class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static class Solution {
  
        static int minDiff(Node root, int K) {
            int minDiff = Integer.MAX_VALUE;
            
            while (root != null) {
                minDiff = Math.min(minDiff, Math.abs(root.data - K));
                
                if (K < root.data) {
                    root = root.left;
                } else if (K > root.data) {
                    root = root.right;
                } else {
                    return 0; // exact match
                }
            }
            return minDiff;
        }
    }

    public static void main(String[] args) {
        // Build a sample BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        // Test the function
        int K = 13;
        int result = Solution.minDiff(root, K);
        System.out.println("Minimum difference with " + K + " is: " + result);
        
    }
}
