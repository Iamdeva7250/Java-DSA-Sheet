import java.util.*;
import java.io.*;

public class LowestCommonAncestor {
    
    static class Node{
        int key;
        Node left, right;

        Node(int data){
            key = data;
            left = right = null;
        }
    }

    Node findLca(Node root, int n1, int n2){
        if(root == null) return null;

        if(root.key == n1 || root.key == n2){
            return root;
        }

        Node leftlca = findLca(root.left, n1, n2);
        Node rightlca = findLca(root.right, n1, n2);

        if(leftlca != null && rightlca != null){
            return root;
        }
          

            if(leftlca != null){
                return leftlca;
            }else{
                return rightlca;
            } 
    }
    
    public static void main(String[] args) {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4, n2 = 5;
        Node t = tree.findLca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

        n1 = 4; n2 = 6;
        t = tree.findLca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

        n1 = 3; n2 = 4;
        t = tree.findLca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);

        n1 = 2; n2 = 4;
        t = tree.findLca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
    }
    
}