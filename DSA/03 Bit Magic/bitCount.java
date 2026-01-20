public class bitCount {
    public static int countSetBits(int n) {
        if (n == 0) return 0;

        int x = largestPowerOf2(n);

        int bitsUpTo2x = x * (1 << (x - 1));   // count of set bits till 2^x - 1
        int msb2xton = n - (1 << x) + 1;       // MSB contribution
        int rest = countSetBits(n - (1 << x)); // recursive part

        return bitsUpTo2x + msb2xton + rest;
    }

    private static int largestPowerOf2(int n) {
        int x = 0;
        while ((1 << x) <= n) {
            x++;
        }
        return x - 1;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(4));   // Expected 5
        System.out.println(countSetBits(17));  // Expected 35
        System.out.println(countSetBits(0));   // Expected 0
        System.out.println(countSetBits(1));   // Expected 1
    }
}
