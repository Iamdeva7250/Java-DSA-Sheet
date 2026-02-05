import java.util.*;

public class OperationsonStack {

    // Function to push an element into the stack.
    static void insert(Stack<Integer> s, int x) {
        s.push(x);
    }

    // Function to remove top element from stack.
    static void remove(Stack<Integer> s) {
        if (!s.isEmpty()) {
            s.pop();
        }
    }

    // Function to print the top element of stack.
    static void headOf_Stack(Stack<Integer> s) {
        if (s.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println(s.peek());
        }
    }

    // Function to search an element in the stack.
    static boolean find(Stack<Integer> s, int val) {
        return s.contains(val);
    }

    // MAIN METHOD (required for VS Code)
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        insert(s, 2);
        insert(s, 4);
        insert(s, 3);
        insert(s, 5);

        headOf_Stack(s);         
        System.out.println(find(s, 8) ? "Yes" : "No"); 
    }
}
