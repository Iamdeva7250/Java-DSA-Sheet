import java.util.*;

public class LinkedListtoBinaryTree {

    // Make classes static
    static class NodeLL {
        int data;
        NodeLL next;

        NodeLL(int x) {
            data = x;
            next = null;
        }
    }

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    // Convert Linked List to Binary Tree
    public Node linkedListToBinaryTree(NodeLL head) {
        if (head == null) return null;

        Queue<Node> q = new LinkedList<>();

        Node root = new Node(head.data);
        q.add(root);
        head = head.next;

        while (head != null) {
            Node parent = q.poll();

            Node leftChild = new Node(head.data);
            parent.left = leftChild;
            q.add(leftChild);
            head = head.next;

            if (head != null) {
                Node rightChild = new Node(head.data);
                parent.right = rightChild;
                q.add(rightChild);
                head = head.next;
            }
        }
        return root;
    }

    // Level order traversal
    static void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.data + " ");

            if (cur.left != null) q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }

    public static void main(String[] args) {

        LinkedListtoBinaryTree tree = new LinkedListtoBinaryTree();

        NodeLL head = new NodeLL(1);
        head.next = new NodeLL(2);
        head.next.next = new NodeLL(3);
        head.next.next.next = new NodeLL(4);
        head.next.next.next.next = new NodeLL(5);
        head.next.next.next.next.next = new NodeLL(6);
        head.next.next.next.next.next.next = new NodeLL(7);

        Node root = tree.linkedListToBinaryTree(head);

        System.out.print("Level Order Traversal: ");
        levelOrder(root);
    }
}
