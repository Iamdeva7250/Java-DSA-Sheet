import java.util.*;
import java.io.*;

public class LargestOddNumber {
    
    // Your code here

    public String largestOddNumber(String num) {
        int n = num.length();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            // Check if digit is odd
            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
        String num = "35420";
        System.out.println(obj.largestOddNumber(num));
    }

    
}