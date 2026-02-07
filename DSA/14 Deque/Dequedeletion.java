import java.util.*;
import java.io.*;

public class Dequedeletion {
    
    // Your code here

     public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // code here
        
        if(X < 0 || X >= deq.size()) return;
        
        Deque<Integer> temp = new ArrayDeque<>();
        
        int i = 0;
        while(!deq.isEmpty()){
            int val = deq.pollFirst();
            
            if(i != X){
                temp.offerLast(val);
            }
            i++;
        }
        
        deq.addAll(temp);
        
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        
        if(start < 0 || end > deq.size() || start >= end ) return;
        
        ArrayDeque<Integer> temp = new ArrayDeque<>();
        
        int i = 0;
        
        while(!deq.isEmpty()){
            int val = deq.pollFirst();
            
            if(i < start || i >= end){
                temp.offerLast(val);
            }
            i++;
        }
        deq.addAll(temp);
        
        // code here
    }

        
    public static void eraseAll(ArrayDeque<Integer> deq) {
        // code here
        
        deq.clear();
    }

    public static void main(String[] args) {
        ArrayDeque<Integer> deq = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        
        System.out.println("Original Deque: " + deq);
        
        eraseAt(deq, 2);
        System.out.println("After erasing at index 2: " + deq);
        
        eraseInRange(deq, 1, 3);
        System.out.println("After erasing from index 1 to 3: " + deq);
        
        eraseAll(deq);
        System.out.println("After erasing all elements: " + deq);
    } 
    
}