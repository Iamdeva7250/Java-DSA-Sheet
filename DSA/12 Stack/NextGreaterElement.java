import java.util.*;

public class NextGreaterElement {

   public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
            res.add(-1);
            }else{
                res.add(st.peek());
            }
            st.push(arr[i]);
            
        }
        
        Collections.reverse(res);
        return res;
        
    }

    public static void main(String[] args) {

        NextGreaterElement obj = new NextGreaterElement();

        int[] arr = {5, 15, 10, 8, 6, 12, 9, 18};
        int n = arr.length;

        ArrayList<Integer> result = obj.nextLargerElement(arr);
        System.out.println(result);
    }
}
