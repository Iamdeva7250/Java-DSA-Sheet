import java.util.Stack;

public class ImplementQueuesUsingStack {

    Stack<Integer> inStack;
    Stack<Integer> outStack;

    // Constructor (FIXED)
    public ImplementQueuesUsingStack() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    // Push element to queue
    public void push(int x) {
        inStack.push(x);
    }

    // Remove element from queue
    public int pop() {
        peek(); // ensure outStack has elements
        return outStack.pop();
    }

    // Get front element
    public int peek() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Main method
    public static void main(String[] args) {
        ImplementQueuesUsingStack queue =
                new ImplementQueuesUsingStack();

        queue.push(1);
        queue.push(2);

        System.out.println(queue.peek());  // 1
        System.out.println(queue.pop());   // 1
        System.out.println(queue.empty()); // false
    }
}
