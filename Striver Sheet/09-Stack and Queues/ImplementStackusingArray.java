import java.util.*;

public class ImplementStackusingArray {

    // Array to hold elements
    private int[] stackArray;
    private int capacity;
    private int topIndex;

    // Constructor with size
    public ImplementStackusingArray(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    // Default constructor
    public ImplementStackusingArray() {
        this(1000);
    }

    // Push element
    public void push(int x) {
        if (topIndex == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topIndex--];
    }

    // Peek top element
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    // Check empty
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        ImplementStackusingArray stack = new ImplementStackusingArray();

        stack.push(5);
        stack.push(10);

        System.out.println(stack.top());     // 10
        System.out.println(stack.pop());     // 10
        System.out.println(stack.isEmpty()); // false
    }
}
