// ...existing code...
import java.util.*;
import java.io.*;

public class FixBSTwithTwoNodeSwapped {
    
    // Your code here
    static class Node{
        int data;
        Node left, right;

        Node(int key){
            data = key;
            left = right = null;
        }
    }
    
    Node prev = null, first = null, second = null;

    // ...existing code...
    void FixBst(Node root){
        if(root == null) return;

        // inorder traversal
        FixBst(root.left);

        if(prev != null && root.data < prev.data){
            if(first == null)
                first = prev;
            second = root;
        }
        prev = root;

        FixBst(root.right);
    }

    void recover(Node root){
        prev = first = second = null;
        FixBst(root);
        if(first != null && second != null){
            int tmp = first.data;
            first.data = second.data;
            second.data = tmp;
        }
    }

    void printInorder(Node root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        FixBSTwithTwoNodeSwapped sol = new FixBSTwithTwoNodeSwapped();

        // build tree with two nodes swapped: example [3,1,4,null,null,2]
        Node root = new Node(3);
        root.left = new Node(1);
        root.right = new Node(4);
        root.right.left = new Node(2);

        System.out.print("Before: ");
        sol.printInorder(root);
        System.out.println();

        sol.recover(root);

        System.out.print("After: ");
        sol.printInorder(root);
        System.out.println();
    }
}
