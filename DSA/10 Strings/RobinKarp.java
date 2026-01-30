import java.util.*;
public class RobinKarp {


    // d is number of characters in input alphabet
    final static int d = 256;

    static void RBSearch(String pat, String txt, int q) {
        int M = pat.length();
        int N = txt.length();

        int p = 0; // hash value for pattern
        int t = 0; // hash value for text
        int h = 1;

        // Step 1: The value of h = pow(d, M-1) % q
        for (int i = 1; i <= M - 1; i++) {
            h = (h * d) % q;
        }

        // Step 2: Calculate hash value of pattern and first window of text
        for (int i = 0; i < M; i++) {
            p = (p * d + pat.charAt(i)) % q;
            t = (t * d + txt.charAt(i)) % q;
        }

        // Step 3: Slide the pattern over text
        for (int i = 0; i <= N - M; i++) {

            // If hash values match, check characters
            if (p == t) {
                boolean match = true;
                for (int j = 0; j < M; j++) {
                    if (txt.charAt(i + j) != pat.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            // Step 4: Calculate next hash (rolling hash)
            if (i < N - M) {
                t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + M)) % q;

                if (t < 0)
                    t = t + q;
            }
        }
    }

    public static void main(String[] args) {
        String txt = "GEEKSFORGEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number
        RBSearch(pat, txt, q);
    }

  
}
