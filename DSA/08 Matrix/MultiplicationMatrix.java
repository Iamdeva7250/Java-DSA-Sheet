public class MultiplicationMatrix {

    public static void main(String[] args) {
        
        int M = 2, N = 2, P = 2;
        int[][] m1 = { { 5, 6 }, 
                       { 8, 9 } };
        int[][] m2 = { { 1, 2 }, 
                       { 4, 5 } };
        int[][] ans = new int[M][P];

        // Matrix multiplication
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                ans[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        // Printing result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}


