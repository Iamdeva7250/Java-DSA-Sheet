import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class SumofLeafNodes {
    
    public int SumofLeafNodes(Node root) {
        if (root == null) return 0;
        
        if (root.left == null && root.right == null) return root.data;
        
        return SumofLeafNodes(root.left) + SumofLeafNodes(root.right);
    }

    public static void main(String[] args) {
        // Build a sample tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        SumofLeafNodes obj = new SumofLeafNodes();
        int sum = obj.SumofLeafNodes(root);

        System.out.println("Sum of leaf nodes: " + sum);
    }
}
