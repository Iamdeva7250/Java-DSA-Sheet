class RecursivePower {
    static int mod = 1000000007;

    // Recursive power function (fast exponentiation)
    static int RecursivePower1(int n, int p) {
        if (p == 0) return 1;  // base case

        long half = RecursivePower1(n, p / 2);   // recursive call
        long result = (half * half) % mod;      // combine results

        if (p % 2 == 1) {                       // if p is odd
            result = (result * n) % mod;
        }

        return (int) result;
    }

    // Main function to test in VS Code
    public static void main(String[] args) {
        System.out.println(RecursivePower1(2, 3));   // Expected: 8
        System.out.println(RecursivePower1(7, 4));   // Expected: 2401
        System.out.println(RecursivePower1(12, 21)); // Expected: 864354781
    }
}
