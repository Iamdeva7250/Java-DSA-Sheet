import java.util.*;

class HelpOldMan {

    // Function to find the Mth move in Tower of Hanoi
    static List<Integer> shiftPile(int N, int M) {
        return solve(N, M, 1, 3, 2);
    }

    private static List<Integer> solve(int N, int M, int from, int to, int aux) {
        if (N == 1) {
            return Arrays.asList(from, to);
        }

        int movesInFirstHalf = (1 << (N - 1)) - 1; // 2^(N-1) - 1

        if (M <= movesInFirstHalf) {
            return solve(N - 1, M, from, aux, to);
        } else if (M == movesInFirstHalf + 1) {
            return Arrays.asList(from, to);
        } else {
            return solve(N - 1, M - movesInFirstHalf - 1, aux, to, from);
        }
    }

    // ✅ Correct main method inside the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: N (disks), M (move number)
        System.out.print("Enter number of disks (N): ");
        int N = sc.nextInt();

        System.out.print("Enter move number (M): ");
        int M = sc.nextInt();

        List<Integer> result = shiftPile(N, M);
        System.out.println("Move " + M + ": " + result.get(0) + " -> " + result.get(1));
    }
}
