import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue operation
    void enQueue(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push new element into s1
        s1.push(x);

        // Move everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // Dequeue operation
    int deQueue() {
        if (s1.isEmpty()) {
            return -1; // GFG style
        }
        return s1.pop();
    }

    // Main method for testing
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();

        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);

        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
    }
}
