public class LargestFractionTrouble {
    public int[] LargestFraction(int n, int d) {
        int a = 0, b = 1;  // best fraction found

        for (int i = 1; i <= 9999; i++) {  // denominator cannot be 0
            int p = (int) ((long) n * i / d);

            // ensure strictly less
            if ((long) p * d >= (long) n * i) {
                p--;
            }

            if (p > 0) {
                if (gcd(p, i) != 1) continue;

                // check if p/i > a/b
                if ((long) p * b > (long) a * i) {
                    a = p;
                    b = i;
                }
            }
        }

        return new int[]{a, b};
    }

    private int gcd(int e, int f) {
        if (f == 0) return e;
        return gcd(f, e % f);
    }

    // ✅ Add main method for testing
    public static void main(String[] args) {
        LargestFractionTrouble sol = new LargestFractionTrouble();

        int[] res1 = sol.LargestFraction(1, 8);
        System.out.println(res1[0] + " " + res1[1]); // expected 1249 9993

        int[] res2 = sol.LargestFraction(2, 53);
        System.out.println(res2[0] + " " + res2[1]); // expected 377 9991
    }
}
