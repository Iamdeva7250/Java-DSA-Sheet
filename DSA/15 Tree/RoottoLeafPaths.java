import java.util.*;
import java.io.*;

public class RoottoLeafPaths {
    
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        
        dfs(root, path, result);
        return result;
    }
    
    private static void dfs(Node node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> result) {
        if (node == null) return;
        
        path.add(node.data);
        
        if (node.left == null && node.right == null) {
            result.add(new ArrayList<>(path));
        } else {
            dfs(node.left, path, result);
            dfs(node.right, path, result);
        }
        
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // Build a sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> paths = Paths(root);

        System.out.println("Root-to-leaf paths:");
        for (ArrayList<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
