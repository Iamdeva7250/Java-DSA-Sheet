import java.util.Queue;
import java.util.LinkedList;

public class ReversingaQueue {

    void reverseQueue(Queue<Integer> q) {

        if (q.isEmpty()) return;

        // Remove front element
        int front = q.poll();

        // Reverse remaining queue
        reverseQueue(q);

        // Add removed element at rear
        q.add(front);
    }

    // Driver code for testing
    public static void main(String[] args) {
        ReversingaQueue rq = new ReversingaQueue();
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        rq.reverseQueue(q);

        System.out.println(q); 
    }
}
