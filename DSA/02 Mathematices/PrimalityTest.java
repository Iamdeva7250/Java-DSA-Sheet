import java.util.*;
import java.io.*;

public class PrimalityTest {
    
    // Your code here
     public boolean isPrime(int N) {
      
      if(N <= 1)
      return false;
      
      if( N == 2 || N == 3)
      return true;
      
      
      if(N % 2 == 0 || N % 3 == 0)
      return false;
      
      for(int i = 5; i<= Math.sqrt(N); i= i+6){
      if(N % i == 0 || N % (i+2) == 0)
      return false;
      }
      
      return true;
    }

    public static void main(String[] args) {
        PrimalityTest obj = new PrimalityTest();
        int N = 29;
        boolean result = obj.isPrime(N);
        System.out.println(result);
    }
}