import java.util.*;
import java.io.*;

public class GPTerm {
    
    // Your code here
 
    
      public double termOfGP(int A,int B,int N)
    {
        //Your code here
        double r  =  (double) B / A;
        
        return A * Math.pow(r, N - 1);
    }

    public static void main(String[] args) {
        GPTerm obj = new GPTerm();
        int A = 2, B = 4, N = 3;
        double result = obj.termOfGP(A, B, N);
        System.out.println(result);
        
    }
}