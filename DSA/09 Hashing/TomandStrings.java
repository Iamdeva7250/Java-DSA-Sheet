import java.util.*;
import java.io.*;

public class TomandStrings {
    
  
    static long hashString(String s) {

        String X = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String[] words = s.split(" ");
        int n = words.length;

        long sum = 0;

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int indexInX = X.indexOf(ch);
                sum += i + indexInX;
            }
        }

        return sum * n;
    }

    // main method to test in VS Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String s = sc.nextLine();

        System.out.println("Hash Value: " + hashString(s));
    }
    
}