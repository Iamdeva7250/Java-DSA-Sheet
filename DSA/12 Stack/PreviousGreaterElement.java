import java.util.*;

public class PreviousGreaterElement {

    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            
           res.add(st.isEmpty() ? -1 : st.peek());
           st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        PreviousGreaterElement obj = new PreviousGreaterElement();

        int[] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        int n = arr.length;

        ArrayList<Integer> result = preGreaterEle(arr);
        System.out.println(result);
    }
}
