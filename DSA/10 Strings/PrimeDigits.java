import java.util.*;
import java.io.*;

public class PrimeDigits {
    

    public static int primeDigits(int n) {

        int[] primes = {2, 3, 5, 7};
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--;                     // shift to 0-based
            sb.append(primes[n % 4]);
            n /= 4;
        }

        return Integer.parseInt(sb.reverse().toString());
    }

    public static void main(String[] args) {
        int n = 10;
        int result = primeDigits(n);
        System.out.println("The " + n + "th prime digit number is: " + result);
    }
}
    
