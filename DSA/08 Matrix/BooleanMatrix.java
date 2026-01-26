public class BooleanMatrix {
    public static void convertToBooleanMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        // Mark rows and columns that have a 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Update matrix based on marked rows and columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 1},
            {0, 0, 0}
        };

        convertToBooleanMatrix(matrix);

        System.out.println("Updated Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
