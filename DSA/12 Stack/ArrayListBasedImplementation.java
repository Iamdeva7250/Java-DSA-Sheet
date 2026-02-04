import java.util.ArrayList;

public class ArrayListBasedImplementation {

    ArrayList<Integer> al = new ArrayList<>();

    void push(int x) {
        al.add(x);
    }

    int pop() {
        if (al.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int res = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        return res;
    }

    int peek() {
        if (al.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return al.get(al.size() - 1);
    }

    boolean isEmpty() {
        return al.isEmpty();
    }

    int size() {
        return al.size();
    }

    public static void main(String[] args) {
        ArrayListBasedImplementation s = new ArrayListBasedImplementation();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());   // 20
        System.out.println(s.peek());  // 10
        System.out.println(s.size());  // 1
        System.out.println(s.isEmpty()); // false
    }
}
