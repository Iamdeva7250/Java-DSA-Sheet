import java.util.*;
import java.io.*;

public class TwoStacksinanArray {
    
    // Your code here
     int[] arr;
    int top1, top2;
    int size = 100;


    TwoStacksinanArray() {
        arr = new int[size];
        top1 = -1;
        
        top2 = size;
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        if(top1 < top2 - 1){
            arr[++top1] = x;
        }
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        if(top1 < top2 - 1){
            arr[--top2] = x;
        }
        
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(top1 >= 0){
            return arr[top1--];
        }
        return -1;
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2 < size){
            return arr[top2++];
            
        }
        return -1;
    }

    public static void main(String[] args) {
        TwoStacksinanArray ts = new TwoStacksinanArray();
        
        ts.push1(10);
        ts.push2(20);
        ts.push1(30);
        ts.push2(40);
        
        System.out.println("Popped from stack1: " + ts.pop1());
        System.out.println("Popped from stack2: " + ts.pop2());
    }
    
}