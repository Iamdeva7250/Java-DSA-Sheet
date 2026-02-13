import java.util.*;
import java.io.*;

public class VerticalTreeTraversal {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    // User function Template for Java
    static class Solution {
        // Function to find the vertical order traversal of Binary Tree.
        static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();

            if (root == null) return result;

            TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(root, 0));

            while (!q.isEmpty()) {
                Pair p = q.poll();
                Node node = p.node;
                int hd = p.hd;

                map.putIfAbsent(hd, new ArrayList<>());
                map.get(hd).add(node.data);

                if (node.left != null)
                    q.add(new Pair(node.left, hd - 1));

                if (node.right != null)
                    q.add(new Pair(node.right, hd + 1));
            }

            result.addAll(map.values());
            return result;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<ArrayList<Integer>> res = Solution.verticalOrder(root);

        System.out.println("Vertical Order Traversal:");
        for (ArrayList<Integer> col : res) {
            System.out.println(col);
        }
    }
}
