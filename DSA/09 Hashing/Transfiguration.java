import java.util.*;
import java.io.*;

public class Transfiguration {

    int transfigure(String A, String B) {
        int n = A.length();
        if (n != B.length())
            return -1;

        // Check if both strings have same character frequency
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return -1;
        }

        // Count minimum operations
        int i = n - 1, j = n - 1;
        int operations = 0;

        while (i >= 0) {
            if (A.charAt(i) == B.charAt(j)) {
                i--;
                j--;
            } else {
                operations++;
                i--;
            }
        }

        return operations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string A:");
        String A = sc.nextLine();

        System.out.println("Enter string B:");
        String B = sc.nextLine();

        Transfiguration obj = new Transfiguration();
        int result = obj.transfigure(A, B);
        System.out.println("Minimum operations required: " + result); 
    }
}

    
