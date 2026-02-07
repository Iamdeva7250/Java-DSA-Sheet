import java.util.*;
import java.io.*;

public class RotateDequeByK {
    
    // Your code here

     public static void rotateDeque(Deque<Integer> dq, int type, int k) {
        // code here
        if(dq == null || dq.isEmpty()) return;
        
        int n = dq.size();
        
         k = k % n;
         
         if(type == 0){
             for(int i = 0; i < k; i++){
                 dq.addLast(dq.removeFirst());
             }
         }else if(type == 1){
             for(int i = 0; i < k; i++){
                 dq.addFirst(dq.removeLast());
             }
         }else if(type == 2){
             for(int i = 0; i < k; i++){
                 dq.addLast(dq.removeFirst());
             }
         }
    }
    
    public static void printDeque(Deque<Integer> dq){
        for(Integer val : dq){
            System.out.print(val + "");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4, 5));
        
        System.out.println("Original Deque:");
        printDeque(dq);
        
        rotateDeque(dq, 0, 2); // Rotate left by 2
        System.out.println("Deque after left rotation by 2:");
        printDeque(dq);
        
        rotateDeque(dq, 1, 3); // Rotate right by 3
        System.out.println("Deque after right rotation by 3:");
        printDeque(dq);
        
        rotateDeque(dq, 2, 1); // Rotate left by 1
        System.out.println("Deque after left rotation by 1:");
        printDeque(dq);
    }
    
}