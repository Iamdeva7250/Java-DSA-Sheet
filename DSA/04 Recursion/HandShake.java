import java.util.*;

class HandShake {
    static int count(int N) {
        // If N is odd → not possible
        if ((N & 1) == 1) return 0;
        return catalan(N / 2);
    }

    // Recursive Catalan number
    private static int catalan(int n) {
        if (n <= 1) return 1;

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - 1 - i);
        }
        return res;
    }

    // ✅ Add main() to test in IntelliJ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N (number of people): ");
        int N = sc.nextInt();

        System.out.println("Number of non-crossing handshakes: " + count(N));
    }
}
