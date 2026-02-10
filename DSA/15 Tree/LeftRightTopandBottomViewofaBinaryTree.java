import java.util.*;

public class LeftRightTopandBottomViewofaBinaryTree {

    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // LEFT VIEW
    static void printLeftView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 1; i <= n; i++) {
                Node temp = q.poll();
                if (i == 1) System.out.print(temp.key + " ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
        System.out.println();
    }

    // RIGHT VIEW
    static void printRightView(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 1; i <= n; i++) {
                Node temp = q.poll();
                if (i == n) System.out.print(temp.key + " ");
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
        }
        System.out.println();
    }

    // TOP VIEW
    static void printTopView(Node root) {
        if (root == null) return;

        class Pair {
            Node node;
            int hd;
            Pair(Node n, int h) {
                node = n;
                hd = h;
            }
        }

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            if (!map.containsKey(p.hd))
                map.put(p.hd, p.node.key);

            if (p.node.left != null) q.add(new Pair(p.node.left, p.hd - 1));
            if (p.node.right != null) q.add(new Pair(p.node.right, p.hd + 1));
        }

        for (int val : map.values())
            System.out.print(val + " ");
        System.out.println();
    }

    // BOTTOM VIEW
    static void printBottomView(Node root) {
        if (root == null) return;

        class Pair {
            Node node;
            int hd;
            Pair(Node n, int h) {
                node = n;
                hd = h;
            }
        }

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            map.put(p.hd, p.node.key);

            if (p.node.left != null) q.add(new Pair(p.node.left, p.hd - 1));
            if (p.node.right != null) q.add(new Pair(p.node.right, p.hd + 1));
        }

        for (int val : map.values())
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Left View:");
        printLeftView(root);

        System.out.println("Right View:");
        printRightView(root);

        System.out.println("Top View:");
        printTopView(root);

        System.out.println("Bottom View:");
        printBottomView(root);
    }
}
