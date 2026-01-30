import java.util.*;
import java.io.*;

public class BinarySubString {
    
    public int CountBinarySubStrings(String s) {

        int ones = 0;

        // Count number of '1's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

       
        return (ones * (ones - 1)) / 2;
    }
    
    public static void main(String[] args) {
        BinarySubString obj = new BinarySubString();
        String s = "1111";
        int result = obj.CountBinarySubStrings(s);
        System.out.println("Number of binary substrings: " + result);   
    }
}
