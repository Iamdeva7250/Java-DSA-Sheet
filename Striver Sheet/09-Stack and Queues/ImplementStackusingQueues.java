import java.util.*;

public class ImplementStackusingQueues {

    Queue<Integer> q;

    public ImplementStackusingQueues() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        int size = q.size();
        for (int i = 1; i < size; i++) {
            q.offer(q.poll());
        }
    }
    
    public int pop() {
        if (q.isEmpty()) return -1;
        return q.poll();
    }
    
    public int top() {
        if (q.isEmpty()) return -1;
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }

    
    public static void main(String[] args) {
        ImplementStackusingQueues stack = new ImplementStackusingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());   
        System.out.println(stack.pop());   
        System.out.println(stack.top());   
        System.out.println(stack.empty()); 
    }
}
