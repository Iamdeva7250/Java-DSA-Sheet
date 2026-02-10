import java.util.*;

public class LevelOrderinSpiral {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Function to return spiral order traversal
    public ArrayList<Integer> levelOrderSpiral(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Deque<Node> dq = new ArrayDeque<>();
        dq.add(root);

        boolean leftToRight = false;

        while (!dq.isEmpty()) {
            int size = dq.size();

            for (int i = 0; i < size; i++) {

                if (leftToRight) {
                    Node curr = dq.pollFirst();
                    result.add(curr.data);

                    if (curr.left != null) dq.addLast(curr.left);
                    if (curr.right != null) dq.addLast(curr.right);

                } else {
                    Node curr = dq.pollLast();
                    result.add(curr.data);

                    if (curr.right != null) dq.addFirst(curr.right);
                    if (curr.left != null) dq.addFirst(curr.left);
                }
            }
            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {

        LevelOrderinSpiral tree = new LevelOrderinSpiral();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> res = tree.levelOrderSpiral(root);
        System.out.println("Level order traversal in spiral form: " + res);
    }
}
