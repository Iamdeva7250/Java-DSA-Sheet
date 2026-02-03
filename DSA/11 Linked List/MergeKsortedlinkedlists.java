import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeKsortedlinkedlists {
    
    // Your code here

     Node mergeKLists(Node[] arr) {
        // code here
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                pq.add(arr[i]);
            }
        }
        
        Node dummy = new Node(0);
        Node tail = dummy;
        while(!pq.isEmpty()){
            Node curr =pq.poll();
            tail.next = curr;
            tail = tail.next;
            
            if(curr.next != null){
                pq.add(curr.next);
            }
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeKsortedlinkedlists solution = new MergeKsortedlinkedlists();
        
        // Example usage:
        Node[] lists = new Node[3];
        
        lists[0] = new Node(1);
        lists[0].next = new Node(4);
        lists[0].next.next = new Node(5);
        
        lists[1] = new Node(1);
        lists[1].next = new Node(3);
        lists[1].next.next = new Node(4);
        
        lists[2] = new Node(2);
        lists[2].next = new Node(6);
        
        Node mergedHead = solution.mergeKLists(lists);
        
        // Print the merged linked list
        Node curr = mergedHead;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } 
    }
    
}