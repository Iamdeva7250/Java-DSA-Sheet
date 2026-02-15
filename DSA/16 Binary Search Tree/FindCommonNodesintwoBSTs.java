import java.util.*;
import java.io.*;

public class FindCommonNodesintwoBSTs {
    
    static class Node {
        int data;
        Node left, right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }

    // Function to find common nodes in two BSTs
    public static ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        
        while (true) {
            // Push left children of both trees
            while (r1 != null) {
                s1.push(r1);
                r1 = r1.left;
            }
            while (r2 != null) {
                s2.push(r2);
                r2 = r2.left;
            }
            
            // If either stack is empty, traversal is done
            if (s1.isEmpty() || s2.isEmpty()) break;
            
            Node top1 = s1.peek();
            Node top2 = s2.peek();
            
            if (top1.data == top2.data) {
                result.add(top1.data);
                s1.pop();
                s2.pop();
                r1 = top1.right;
                r2 = top2.right;
            } else if (top1.data < top2.data) {
                s1.pop();
                r1 = top1.right;
            } else {
                s2.pop();
                r2 = top2.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // First BST
        Node root1 = new Node(5);
        root1.left = new Node(1);
        root1.right = new Node(10);
        root1.left.right = new Node(4);
        root1.right.left = new Node(7);
        root1.right.right = new Node(12);

        // Second BST
        Node root2 = new Node(10);
        root2.left = new Node(7);
        root2.right = new Node(20);
        root2.left.left = new Node(4);
        root2.right.left = new Node(15);
        root2.right.right = new Node(25);

        ArrayList<Integer> common = findCommon(root1, root2);
        System.out.println("Common nodes: " + common);
    }
}
