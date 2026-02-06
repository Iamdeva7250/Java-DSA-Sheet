import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    // Two queues
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int curr_size = 0;

    // Constructor
    StackUsingQueue() {
        curr_size = 0;
    }

    // Push operation
    void push(int x) {
        curr_size++;

        // Push into empty q2
        q2.add(x);

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Pop operation
    void pop() {
        if (q1.isEmpty())
            return;

        q1.remove();
        curr_size--;
    }

    // Top element
    int top() {
        if (q1.isEmpty())
            return -1;

        return q1.peek();
    }

    // Size of stack
    int size() {
        return curr_size;
    }

    // Driver code
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println("current size: " + s.size());
    }
}
