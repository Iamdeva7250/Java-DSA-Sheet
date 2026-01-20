import java.util.*;
import java.io.*;

public class MultiplicationUnderModulo {
    
    // Your code here
      static final long MOD = 1000000007;
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        return ((a % MOD ) * (b % MOD )) % MOD;
    }

    public static void main(String[] args) {
        MultiplicationUnderModulo obj = new MultiplicationUnderModulo();
        long a = 1000000006;
        long b = 5;
        long result = obj.multiplicationUnderModulo(a, b);
        System.out.println(result);
    }
}