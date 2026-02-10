import java.util.*;

public class ConstructBinarytreeFromInorderandPreorder {

    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    int preIndex = 0;
    HashMap<Integer, Integer> inMap = new HashMap<>();

    Node buildTree(int inorder[], int preorder[], int inStrt, int inEnd) {

        if (inStrt > inEnd) return null;

        // Pick current node from preorder
        Node tNode = new Node(preorder[preIndex++]);

        // If leaf node
        if (inStrt == inEnd) return tNode;

        int inIndex = inMap.get(tNode.data);

        tNode.left = buildTree(inorder, preorder, inStrt, inIndex - 1);
        tNode.right = buildTree(inorder, preorder, inIndex + 1, inEnd);

        return tNode;
    }

    Node buildTree(int inorder[], int preorder[], int n) {
        preIndex = 0;
        inMap.clear();

        for (int i = 0; i < n; i++) {
            inMap.put(inorder[i], i);
        }

        return buildTree(inorder, preorder, 0, n - 1);
    }

    public static void main(String[] args) {
        ConstructBinarytreeFromInorderandPreorder tree =
                new ConstructBinarytreeFromInorderandPreorder();

        int inorder[] = {4, 2, 5, 1, 6, 3, 7};
        int preorder[] = {1, 2, 4, 5, 3, 6, 7};

        Node root = tree.buildTree(inorder, preorder, inorder.length);
        System.out.println("Constructed tree root data: " + root.data); 
    }
}
