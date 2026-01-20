class Solution {
    public static boolean isPowerofTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerofTwo(1));   // true (2^0)
        System.out.println(isPowerofTwo(2));   // true (2^1)
        System.out.println(isPowerofTwo(3));   // false
        System.out.println(isPowerofTwo(16));  // true (2^4)
        System.out.println(isPowerofTwo(18));  // false
    }
}
