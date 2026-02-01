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

public class CountPairsWhoseSumIsEqualtoX {
    
 
    public static int countPairs(Node head1, Node head2, int x) {
        if (head1 == null || head2 == null) return 0;

        HashSet<Integer> set = new HashSet<>();

        Node temp2 = head2;
        while (temp2 != null) {
            set.add(temp2.data);
            temp2 = temp2.next;
        }

        int count = 0;
        Node temp1 = head1;
        while (temp1 != null) {
            if (set.contains(x - temp1.data)) {
                count++;
            }
            temp1 = temp1.next;
        }

        return count;
    }
    public static void main(String[] args) {
        CountPairsWhoseSumIsEqualtoX solution = new CountPairsWhoseSumIsEqualtoX();
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        
        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        
        int x = 6;
        int result = countPairs(head1, head2, x);
        System.out.println("Count of pairs whose sum is equal to " + x + ": " + result); 
    }



}