import java.util.*;
import java.io.*;

public class BheemWantsLadoos {

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

    static class Pair {
        Node node;
        int dist;
        Pair(Node node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    static class Solution {
        static int ladoos(Node root, int home, int k) {
            Map<Node, Node> parent = new HashMap<>();
            Node target = buildParent(root, parent, home);

            Queue<Pair> q = new LinkedList<>();
            Set<Node> visited = new HashSet<>();

            q.add(new Pair(target, 0));
            visited.add(target);

            int sum = 0;

            while (!q.isEmpty()) {
                Pair p = q.poll();
                Node curr = p.node;
                int dist = p.dist;

                if (dist > k) continue;
                sum += curr.data;

                if (curr.left != null && visited.add(curr.left))
                    q.add(new Pair(curr.left, dist + 1));

                if (curr.right != null && visited.add(curr.right))
                    q.add(new Pair(curr.right, dist + 1));

                if (parent.get(curr) != null && visited.add(parent.get(curr)))
                    q.add(new Pair(parent.get(curr), dist + 1));
            }
            return sum;
        }

        static Node buildParent(Node root, Map<Node, Node> parent, int home) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            Node target = null;

            while (!q.isEmpty()) {
                Node curr = q.poll();

                if (curr.data == home) target = curr;

                if (curr.left != null) {
                    parent.put(curr.left, curr);
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    parent.put(curr.right, curr);
                    q.add(curr.right);
                }
            }
            return target;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int home = 2, k = 1;
        int result = Solution.ladoos(root, home, k);
        System.out.println("Total ladoos Bheem can collect: " + result);
    }
}
