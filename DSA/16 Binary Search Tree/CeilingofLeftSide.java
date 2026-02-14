import java.util.*;
import java.io.*;

public class CeilingofLeftSide {
    
    static class Node {
        int data;
        Node left, right;
        
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    
    // Find ceiling on left side for each node
    static void ceilingOnLeft(Node root, Stack<Integer> st, ArrayList<Integer> result) {
        if (root == null)
            return;
        
        // Process left subtree first
        ceilingOnLeft(root.left, st, result);
        
        // Remove all smaller elements from stack
        while (!st.isEmpty() && st.peek() < root.data) {
            st.pop();
        }
        
        // If stack is empty, no ceiling on left
        if (st.isEmpty()) {
            result.add(-1);
        } else {
            result.add(st.peek());
        }
        
        // Push current element to stack
        st.push(root.data);
        
        // Process right subtree
        ceilingOnLeft(root.right, st, result);
    }
    
    static void printCeilingOnLeft(Node root) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        ceilingOnLeft(root, st, result);
        
        System.out.print("Ceiling on left side: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.right = new Node(20);
        
        printCeilingOnLeft(root);
    }
}