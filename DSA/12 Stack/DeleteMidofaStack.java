import java.util.*;
import java.io.*;

public class DeleteMidofaStack {
    
    // Your code here
     public void deleteMid(Stack<Integer> s) {
        // code here
        
        int n = s.size();
        int mid = (n / 2) + 1;
        
        solve(s, mid);
    }
    
    private void solve(Stack<Integer> s, int k){
        if(k == 1){
            s.pop();
            return;
        }
        int temp = s.pop();
        solve(s, k -1);
        s.push(temp);
    }

    public static void main(String[] args) {
        DeleteMidofaStack sol = new DeleteMidofaStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        System.out.println("Original Stack: " + stack);
        sol.deleteMid(stack);
        System.out.println("Stack after deleting middle element: " + stack);
    }
    
}