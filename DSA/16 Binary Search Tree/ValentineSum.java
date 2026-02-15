import java.util.*;
import java.io.*;

public class ValentineSum {

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

    static int sum_at_distK(Node root, int target, int k) {
        Map<Node, Node> parent = new HashMap<>();
        Node targetNode = buildParent(root, target, parent);

        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        q.add(targetNode);
        visited.add(targetNode);

        int dist = 0, sum = 0;

        while (!q.isEmpty() && dist <= k) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                sum += curr.data;

                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }

                if (parent.containsKey(curr) && !visited.contains(parent.get(curr))) {
                    visited.add(parent.get(curr));
                    q.add(parent.get(curr));
                }
            }
            dist++;
        }
        return sum;
    }

    static Node buildParent(Node root, int target, Map<Node, Node> parent) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node targetNode = null;

        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.data == target) targetNode = curr;

            if (curr.left != null) {
                parent.put(curr.left, curr);
                q.add(curr.left);
            }

            if (curr.right != null) {
                parent.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        return targetNode;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int target = 2, k = 1;
        int result = sum_at_distK(root, target, k);
        System.out.println("Sum of nodes at distance " + k + " from target " + target + ": " + result);
    }
}
