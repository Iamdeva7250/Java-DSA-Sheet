import java.util.*;

public class StackUsingLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class
    static class MyStack {

        Node top;
        int size;

        public MyStack() {
            top = null;
            size = 0;
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == null;
        }

        // Push element
        public void push(int x) {
            Node newNode = new Node(x);
            newNode.next = top;
            top = newNode;
            size++;
        }

        // Pop element
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int res = top.data;
            top = top.next;
            size--;
            return res;
        }

        // Peek top element
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return top.data;
        }

        // Return size
        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek()); // 30
        System.out.println(stack.pop());  // 30
        System.out.println(stack.size()); // 2
        System.out.println(stack.isEmpty()); // false
    }
}
