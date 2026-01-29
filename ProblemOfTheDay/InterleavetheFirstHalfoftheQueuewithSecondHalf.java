import java.util.*;
import java.io.*;

public class InterleavetheFirstHalfoftheQueuewithSecondHalf {
    
    // Your code here
     public void rearrangeQueue(Queue<Integer> q) {
        int n = q.size();
        if (n % 2 != 0) return; // only works for even size

        Stack<Integer> st = new Stack<>();
        int half = n / 2;

        // Step 1: push first half into stack
        for (int i = 0; i < half; i++) {
            st.push(q.poll());
        }

        // Step 2: push stack elements back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: move first half to back
        for (int i = 0; i < half; i++) {
            q.add(q.poll());
        }

        // Step 4: again push first half into stack
        for (int i = 0; i < half; i++) {
            st.push(q.poll());
        }

        // Step 5: interleave stack and queue
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.poll());
        }
    }

    public static void main(String[] args) {
        InterleavetheFirstHalfoftheQueuewithSecondHalf obj = new InterleavetheFirstHalfoftheQueuewithSecondHalf();
        Queue<Integer> q = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        
        System.out.println("Original Queue: " + q);
        obj.rearrangeQueue(q);
        System.out.println("Rearranged Queue: " + q);
    }
    
}