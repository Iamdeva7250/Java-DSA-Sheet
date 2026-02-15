import java.util.*;
import java.io.*;

public class MergetwoBST {
    
    static class Node {
        int data;
        Node left, right;

        Node(int items) {
            data = items;
            left = right = null;
        }
    }

    public ArrayList<Integer> merge(Node root1, Node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        inorder(root1, list1);
        inorder(root2, list2);
        
        return mergedList(list1, list2);
    }
    
    private void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) return;
        
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    
    private ArrayList<Integer> mergedList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> merged = new ArrayList<>();
        
        int i = 0, j = 0;
        
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                merged.add(list1.get(i++));
            } else {
                merged.add(list2.get(j++));
            }
        }
        
        while (i < list1.size()) merged.add(list1.get(i++));
        while (j < list2.size()) merged.add(list2.get(j++));
        
        return merged;
    }

    public static void main(String[] args) {
        MergetwoBST solver = new MergetwoBST();

        // Build first BST
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);

        // Build second BST
        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);

        // Merge both BSTs
        ArrayList<Integer> result = solver.merge(root1, root2);
        System.out.println("Merged BST elements: " + result);
        
    }
}
