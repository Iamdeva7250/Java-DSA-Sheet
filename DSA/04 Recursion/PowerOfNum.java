class PowerOfNum {
    // Reverse digits of n
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Fast modular exponentiation
    private long power(long base, int exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public int reverseExponentiation(int n) {
        int rev = reverse(n);
        int mod = 1000000007;
        return (int) power((long)n, rev, mod);
    }

    // Test main method
    public static void main(String[] args) {
        PowerOfNum sol = new PowerOfNum();   // ✅ Corrected
        System.out.println(sol.reverseExponentiation(2));   // Expected 4
        System.out.println(sol.reverseExponentiation(12));  // Expected 864354781
        System.out.println(sol.reverseExponentiation(7));   // Expected 823543
    }
}
