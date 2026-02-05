import java.util.*;
import java.io.*;

public class Maxofminforeverywindowsize {
    
    // Your code here
      public ArrayList<Integer> maxOfMins(int[] arr) {
        // code here
        
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();
        
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        int[] res = new int[n];
        
        for(int i = 0; i < n; i++){
            int len = right[i] - left[i] - 1;
            res[len - 1] = Math.max(res[len - 1], arr[i]);
        }
        
        for(int i = n - 2; i >= 0; i--){
            res[i] = Math.max(res[i], res[i + 1]);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : res) ans.add(x);
        
        return ans;
    }

    public static void main(String[] args) {
        Maxofminforeverywindowsize obj = new Maxofminforeverywindowsize();
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        ArrayList<Integer> result = obj.maxOfMins(arr);
        System.out.println(result);
    }
}