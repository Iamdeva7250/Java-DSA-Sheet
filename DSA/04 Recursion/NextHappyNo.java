import java.util.*;

class NextHappyNo {
    static int nextHappy(int N) {
        int num = N + 1;
        while (!isHappy(num)) {
            num++;
        }
        return num;
    }

    private static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    // ✅ Add main method to run in IntelliJ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = sc.nextInt();
        System.out.println("Next happy number after " + N + " is: " + nextHappy(N));
    }
}
