import java.util.*;
import java.io.*;

public class ChildrenSumProperty {
    
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static boolean isChildrenSum(Node root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;

        int sum = 0;
        if (root.left != null) sum += root.left.data;
        if (root.right != null) sum += root.right.data;

        return (root.data == sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.left = new Node(2);
        root.right.right = new Node(3);

        System.out.println(isChildrenSum(root));
    }
}