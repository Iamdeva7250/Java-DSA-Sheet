import java.util.*;

public class ConnectNodesofLevels {

    static class Node {
        int data;
        Node left, right, nextRight;

        Node(int item) {
            data = item;
            left = right = nextRight = null;
        }
    }

    // Function to connect nodes at same level
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                if (prev != null) {
                    prev.nextRight = curr;
                }
                prev = curr;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            // Last node of each level
            prev.nextRight = null;
        }
        return root;
    }

    // Helper function to print nextRight connections
    public void printConnections(Node root) {
        Node levelStart = root;

        while (levelStart != null) {
            Node curr = levelStart;
            levelStart = null;

            while (curr != null) {
                System.out.print(curr.data + " -> ");
                if (levelStart == null) {
                    if (curr.left != null)
                        levelStart = curr.left;
                    else if (curr.right != null)
                        levelStart = curr.right;
                }
                curr = curr.nextRight;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        ConnectNodesofLevels tree = new ConnectNodesofLevels();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        tree.connect(root);

        System.out.println("NextRight connections:");
        tree.printConnections(root);
    }
}
