import java.util.*;
import java.io.*;

public class Checkifsubtree {
    
    // Your code here

    static class Node{
    int data;
    Node left, right;
    Node(int item){
      data = item;
      left = right = null;
    }
  }

  public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S == null) return true;
        if(T == null) return false;
        
        if(isSameTree(T, S))
        return true;
        
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    
    static boolean isSameTree(Node a, Node b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        
        if(a.data != b.data) return false;
        
        return isSameTree(a.left, b.left) &&
               isSameTree(a.right, b.right);
    }

    public static void main(String[] args) {
      Checkifsubtree tree = new Checkifsubtree();
      
      Node T = new Node(26);  
      T.right = new Node(3);
      T.left = new Node(10);
      T.left.left = new Node(4);
      T.left.right = new Node(6);
      T.left.right.right = new Node(30);

      Node S = new Node(10);  
      S.right = new Node(6);
      S.left = new Node(4);
      S.right.right = new Node(30);

      if(isSubtree(T, S)){
          System.out.println("S is a subtree of T");
      } else {
          System.out.println("S is not a subtree of T");
      }
    }
    
}