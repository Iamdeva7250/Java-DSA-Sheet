import java.util.*;

public class LargestRectanglewithall1s {

    // Helper function: Largest Rectangle in Histogram
    static int largestHist(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int res = 0;

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                int tp = s.pop();
                int curr = arr[tp] * (s.isEmpty() ? i : (i - s.peek() - 1));
                res = Math.max(res, curr);
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            int tp = s.pop();
            int curr = arr[tp] * (s.isEmpty() ? n : (n - s.peek() - 1));
            res = Math.max(res, curr);
        }

        return res;
    }

    // Main logic
    public static int maxRectangle(int[][] mat, int R, int C) {

        int res = largestHist(mat[0], C);

        for (int i = 1; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1)
                    mat[i][j] += mat[i - 1][j];
            }
            res = Math.max(res, largestHist(mat[i], C));
        }

        return res;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0}
        };

        int R = mat.length;
        int C = mat[0].length;

        System.out.println(maxRectangle(mat, R, C)); 
    }
}
