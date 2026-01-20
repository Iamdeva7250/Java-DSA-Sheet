import java.util.*;
import java.io.*;

public class FactorialOfNumber {
    
    // Your code here
       public long factorial(int N) {
        // Your code here
        if(N == 0)
        return 1;
        
        return N * factorial(N - 1);
    }

    public static void main(String[] args) {
        FactorialOfNumber obj = new FactorialOfNumber();
        int N = 5;
        long result = obj.factorial(N);
        System.out.println(result);
    }
    
}