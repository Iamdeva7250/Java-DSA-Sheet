import java.util.*;

public class TreeTraversalinSpiralForm {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    void printSpiral(Node node) {
        if (node == null)
            return;

        Stack<Node> s1 = new Stack<>(); // right to left
        Stack<Node> s2 = new Stack<>(); // left to right

        s1.push(node);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.print(temp.data + " ");

                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);
            }

            while (!s2.isEmpty()) {
                Node temp = s2.pop();
                System.out.print(temp.data + " ");

                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeTraversalinSpiralForm tree = new TreeTraversalinSpiralForm();

        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);

        System.out.println("Spiral Order traversal of Binary Tree is:");
        tree.printSpiral(root);
    }
}
