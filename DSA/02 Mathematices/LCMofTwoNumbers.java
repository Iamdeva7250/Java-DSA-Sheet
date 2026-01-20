import java.util.*;
import java.io.*;

public class LCMofTwoNumbers {
    
    // Your code here.

     public static void main(String[] args) {
        int a = 6, b = 9;
        int x = a, y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println(lcm);
    }
    
}