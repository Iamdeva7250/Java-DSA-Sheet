import java.util.*;

class DSubmatrixSumQueries {

    private int[][] prefixSum;

    // Constructor name fixed
    public DSubmatrixSumQueries(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        prefixSum = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1]
                                - prefixSum[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int r1, int c1, int r2, int c2) {
        return prefixSum[r2 + 1][c2 + 1]
             - prefixSum[r1][c2 + 1]
             - prefixSum[r2 + 1][c1]
             + prefixSum[r1][c1];
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };

        // Object creation fixed
        DSubmatrixSumQueries obj = new DSubmatrixSumQueries(matrix);

        System.out.println(obj.sumRegion(2, 1, 4, 3)); // 8
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // 12
    }
}
