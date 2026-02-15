import java.util.*;
import java.io.*;

public class ShortestRangeInBST {

    // ✅ custom Range class
    static class Range {
        int start, end;
        Range(int s, int e) {
            start = s;
            end = e;
        }
    }

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
        int level;

        Pair(Node n, int l) {
            node = n;
            level = l;
        }
    }

    public Range shortestRange(Node root) {
        if (root == null) return new Range(-1, -1);

        List<int[]> nodes = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        int maxLevel = 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node node = p.node;
            int level = p.level;

            maxLevel = Math.max(maxLevel, level);
            nodes.add(new int[]{node.data, level});

            if (node.left != null)
                q.add(new Pair(node.left, level + 1));

            if (node.right != null)
                q.add(new Pair(node.right, level + 1));
        }

        nodes.sort((a, b) -> a[0] - b[0]);

        int[] freq = new int[maxLevel + 1];
        int covered = 0, left = 0;
        int bestX = 0, bestY = 0, bestGap = Integer.MAX_VALUE;

        for (int right = 0; right < nodes.size(); right++) {
            int lvl = nodes.get(right)[1];
            if (freq[lvl] == 0) covered++;
            freq[lvl]++;

            while (covered == maxLevel + 1) {
                int x = nodes.get(left)[0];
                int y = nodes.get(right)[0];
                int gap = y - x;

                if (gap < bestGap || (gap == bestGap && x < bestX)) {
                    bestGap = gap;
                    bestX = x;
                    bestY = y;
                }

                int lLevel = nodes.get(left)[1];
                freq[lLevel]--;
                if (freq[lLevel] == 0) covered--;
                left++;
            }
        }
        return new Range(bestX, bestY);
    }

    public static void main(String[] args) {
        ShortestRangeInBST solution = new ShortestRangeInBST();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.right = new Node(18);

        Range result = solution.shortestRange(root);
        System.out.println("Shortest Range: [" + result.start + ", " + result.end + "]");
    }
}
