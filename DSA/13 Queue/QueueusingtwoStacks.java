import java.util.*;
import java.io.*;

public class QueueusingtwoStacks {
    
    // Your code here

       Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    public void push(int B) {
        // code here
        stack1.push(B);
        
    }

    public int pop() {
        
        if(stack1.isEmpty() && stack2.isEmpty()){
            return -1;
        }

        
        // code here
        
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueusingtwoStacks q = new QueueusingtwoStacks();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }
    
}