public class AdditionMatrix {

    public static void main(String[] args) {
        
        int N = 2, M = 2;
        int[][] m1 = { { 1, 2 }, 
                       { 4, 5 } };
                       
        int[][] m2 = { { 5, 6 }, 
                       { 8, 9 } };
        int[][] ans = new int[N][M];

        // Adding two matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // Printing result matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

}











/*   class Solution {
    // Function to add two matrices
    static int[][] sumMatrix(int A[][], int B[][]) {
        // Check if dimensions match
        if (A.length != B.length || A[0].length != B[0].length) {
            return new int[0][0]; // return empty matrix if not addable
        }

        int n = A.length;
        int m = A[0].length;

        int[][] result = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }
}
    */
