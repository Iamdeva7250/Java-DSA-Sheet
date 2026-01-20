import java.util.*;
import java.io.*;

public class DigitsInFactorial {
    
    // Your code here
     public int digitsInFactorial(int N){
        
        if( N == 0 || N == 1 ) {
            return 1;
        }
        
        double digits = 0;
        for(int i = 2; i<= N; i++){
            digits += Math.log10(i);
        }
        return (int) Math.floor(digits) + 1;
    }


    public static void main(String[] args) {
        DigitsInFactorial obj = new DigitsInFactorial();
        int N = 5;
        int result = obj.digitsInFactorial(N);
        System.out.println(result);
    }
}