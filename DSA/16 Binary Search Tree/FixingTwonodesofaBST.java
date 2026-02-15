import java.util.*;

public class FixingTwonodesofaBST {
    
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node first, middle, last, prev;

    void correctBST(Node root) {
        first = middle = last = prev = null;
        inorder(root);
        
        if (first != null && last != null) {
            int temp = first.data;
            first.data = last.data;
            last.data = temp;
        } else if (first != null && middle != null) {
            int temp = first.data;
            first.data = middle.data;
            middle.data = temp;
        }
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                middle = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }

    void printInorder(Node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        FixingTwonodesofaBST sol = new FixingTwonodesofaBST();

     
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(8);  // <-- swapped node
        root.left.left = new Node(2);
        root.right.right = new Node(20);

        System.out.println("Inorder before fixing:");
        sol.printInorder(root);

        sol.correctBST(root);

        System.out.println("\nInorder after fixing:");
        sol.printInorder(root);
    }
}
