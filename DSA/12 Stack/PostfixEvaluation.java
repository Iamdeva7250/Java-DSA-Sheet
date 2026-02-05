import java.util.*;
import java.io.*;

public class PostfixEvaluation {
    
    // Your code here
  public int evaluatePostfix(String[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(String token : arr){
            
            if(!isOperator(token)){
                st.push(Integer.parseInt(token));
            }
            
            else{
            
            int b = st.pop();
            int a = st.pop();
            int res = 0;
            
            switch(token){
                case "+" :
                    res = a + b;
                    break;
                case "-" :
                    res = a - b;
                    break;
                case "*" :
                    res = a * b;
                    break;
                case "/" : 
                    res = Math.floorDiv(a, b);
                    break;
                case "^" :
                    res = (int) Math.pow(a, b);
            }
            st.push(res);
            }
       }
    
    return st.pop();
    }

    
    private boolean isOperator(String s){
        return s.equals("+") || s.equals("-") ||
               s.equals("*") || s.equals("/") ||
               s.equals("^");
    }
    
    

    public static void main(String[] args) {
        PostfixEvaluation obj = new PostfixEvaluation();
        String[] postfix = {"2", "3", "1", "*", "+", "9", "-"};
        int result = obj.evaluatePostfix(postfix);
        System.out.println("Result of Postfix Evaluation: " + result); 
    }
}