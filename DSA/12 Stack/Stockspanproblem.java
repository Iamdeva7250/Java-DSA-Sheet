import java.util.*;

public class Stockspanproblem {

     public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                span.add(i + 1);
            }else{
                span.add(i - st.peek());
            }
            
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {

        Stockspanproblem obj = new Stockspanproblem();

        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int n = arr.length;

        ArrayList<Integer> result = obj.calculateSpan(arr);
        System.out.println(result);
    }
}
