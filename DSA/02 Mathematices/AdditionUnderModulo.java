import java.util.*;
import java.io.*;

public class AdditionUnderModulo {
    
    // Your code here

      static final long MOD = 1000000007;
    public static long sumUnderModulo(long a, long b){
        
        return (( a % MOD ) + ( b % MOD )) % MOD;
    }   

    public static void main(String[] args) {
        AdditionUnderModulo obj = new AdditionUnderModulo();
        long a = 1000000006;
        long b = 5;
        long result = obj.sumUnderModulo(a, b);
        System.out.println(result);
    }
    
}