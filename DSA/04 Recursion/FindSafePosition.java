import java.util.*;

class FindSafePosition {
    // Recursive function to find safe position
    static int safePos(int n, int k) {
        if (n == 1) return 1;  // base case
        return (safePos(n - 1, k) + k - 1) % n + 1;
    }

    // ✅ Main method for IntelliJ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people (n): ");
        int n = sc.nextInt();

        System.out.print("Enter step count (k): ");
        int k = sc.nextInt();

        System.out.println("Safe Position: " + safePos(n, k));
    }
}
