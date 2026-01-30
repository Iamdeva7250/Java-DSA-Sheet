import java.util.*;
import java.io.*;

public class LexicographicRank {

    // Function to find lexicographic rank
    static int findRank(String s) {

        int n = s.length();

        // Check for duplicate characters
        boolean[] seen = new boolean[26];
        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';
            if (seen[idx]) {
                return 0;   // invalid (duplicate characters)
            }
            seen[idx] = true;
        }

        int rank = 1;
        int fact = factorial(n);

        for (int i = 0; i < n; i++) {
            fact = fact / (n - i);

            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) {
                    count++;
                }
            }

            rank += count * fact;
        }
        return rank;
    }

    // Factorial helper
    static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int rank = findRank(str);
        System.out.println(
            "Lexicographic rank of the string \"" + str + "\" is: " + rank
        );

        sc.close();
    }
}
