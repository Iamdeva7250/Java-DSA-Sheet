import java.util.*;
import java.io.*;

public class Getminatpop {
    
    // Your code here
     static int min;
    
    public static Stack<Integer> _push(int arr[], int n) {
        // code here
        Stack <Integer> s = new Stack<>();
         min = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(s.isEmpty()){
                s.push(arr[i]);
                min = arr[i];
            }
            else if(arr[i] > min){
                s.push(arr[i]);
            }
            else{
                s.push(2 * arr[i] - min);
                min = arr[i];
            }
        }
        return s;
    }

    static void _getMinAtPop(Stack<Integer> s) {
        
        // code here
        while(!s.isEmpty()){
            int top = s.pop();
            
            if(top >= min){
                System.out.print(min + " ");
            }
            else{
                System.out.print(min + " ");
                
                min = 2 * min - top;
                
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        int n = arr.length;

        Stack<Integer> stack = _push(arr, n);
        _getMinAtPop(stack);
    }
    
}