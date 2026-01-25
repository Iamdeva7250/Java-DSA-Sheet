import java.util.*;
import java.io.*;

public class NumberofValidParentheses {
    
    // Your code here
      int findWays(int n) {
        int MOD = 1000000007;

        // Odd length can't form valid parentheses
        if (n % 2 != 0) return 0;

        int k = n / 2;
        long[] dp = new long[k + 1];

        dp[0] = 1;

        for (int i = 1; i <= k; i++) {
            dp[i] = 0;
            for (int j = 0; j < i; j++) {
                dp[i] = (dp[i] + dp[j] * dp[i - 1 - j]) % MOD;
            }
        }

        return (int) dp[k];
    }

    public static void main(String[] args) {
        NumberofValidParentheses nvp = new NumberofValidParentheses();
        int n = 6; // Example input
        int result = nvp.findWays(n);
        System.out.println("Number of valid parentheses combinations for " + n + " parentheses: " + result);
    }
    
}