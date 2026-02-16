import java.util.*;
import java.io.*;

public class CountBSTnodesthatlieinagivenrange {
    
    // Your code here

    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
      }


      int getCount(Node root, int l, int h) {
        // Your code here
        if(root == null) return 0;
        
        if(root.data >= l && root.data <= h){
            return 1 + getCount(root.left, l, h) + getCount(root.right, l, h);
        }
        else if(root.data < l){
            return getCount(root.right, l, h);
        }
        else{
            return getCount(root.left, l, h);
        }
    }

    public static void main(String[] args) {
        CountBSTnodesthatlieinagivenrange tree = new CountBSTnodesthatlieinagivenrange();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        int l = 4, h = 12;
        System.out.println("Count of nodes in range [" + l + ", " + h + "]: " + tree.getCount(root, l, h));
    }
}