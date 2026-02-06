import java.util.*;
import java.io.*;

public class ReversefirstKofaQueue {
    
    // Your code here
     public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        
        if(q == null || q.isEmpty() || k <= 0 || k > q.size()){
            return q;
        }
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < k; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.offer(st.pop());
        }
        
        int size = q.size();
        
        for(int i = 0; i < size - k; i++){
            q.offer(q.poll());
        }
        
        return q;
    }

    public static void main(String[] args) {
        ReversefirstKofaQueue solution = new ReversefirstKofaQueue();
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        
        int k = 3;
        
        Queue<Integer> result = solution.reverseFirstK(q, k);
        
        System.out.println("Queue after reversing first " + k + " elements: " + result);
    }
    
}