import java.util.*;

public class StackwithgetMin {

    Stack<Integer> s;
    Integer minEle;

    // Constructor
    StackwithgetMin() {
        s = new Stack<>();
    }

    // Prints minimum element of stack
    void getMin() {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum Element in the stack is: " + minEle);
    }

    // Prints top element
    void peek() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer t = s.peek();

        System.out.print("Top Most Element is: ");
        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }

    // Removes the top element
    void pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Integer t = s.pop();
        System.out.print("Top Most Element Removed: ");

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        } else {
            System.out.println(t);
        }
    }

    // Insert new number
    void push(Integer x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }

        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }

        System.out.println("Number Inserted: " + x);
    }

    public static void main(String[] args) {

        StackwithgetMin s = new StackwithgetMin();

        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }
}
