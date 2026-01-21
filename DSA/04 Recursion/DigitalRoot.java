class DigitalRoot {
    public static int digitalRoot(int n) {
//        if (n == 0) return 0;
//        if (n % 9 == 0) return 9;
//        return n % 9;
//    }

        // Recursive form
        if (n < 10) return n; // already a single digit
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return digitalRoot(sum);
    }

    public static void main (String[] args) {
        int n = 9875;
        System.out.println("Digital Root of " + n + " is: " + digitalRoot(n));
    }
}