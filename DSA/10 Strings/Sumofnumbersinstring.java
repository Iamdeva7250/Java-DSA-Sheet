import java.util.*;
import java.io.*;

public class Sumofnumbersinstring {

    public int sumOfNumbers(String str) {
        int sum = 0;
        int currentNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            } else {
                sum += currentNumber;
                currentNumber = 0;
            }
        }

        // Add any number left at the end of the string
        sum += currentNumber;

        return sum;
    }

    public static void main(String[] args) {
        Sumofnumbersinstring solver = new Sumofnumbersinstring();
        String str = "abc123xyz45";
        int result = solver.sumOfNumbers(str);
        System.out.println("Sum of numbers in the string: " + result);
    }
    
}