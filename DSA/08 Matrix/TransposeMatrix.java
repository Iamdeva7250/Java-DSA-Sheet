import java.util.*;

public class TransposeMatrix {

    // // Function to transpose a square matrix in-place
    // public static void transpose(int[][] mat) {
    //     int n = mat.length;

    //     for (int i = 0; i < n; i++) {
    //         for (int j = i + 1; j < n; j++) {
    //             // Swap mat[i][j] and mat[j][i]
    //             int temp = mat[i][j];
    //             mat[i][j] = mat[j][i];
    //             mat[j][i] = temp;
    //         }
    //     }
    // }

    // // Utility function to print a matrix
    // public static void printMatrix(int[][] mat) {
    //     for (int i = 0; i < mat.length; i++) {
    //         for (int j = 0; j < mat[i].length; j++) {
    //             System.out.print(mat[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }




    

    // public static void main(String[] args) {
    //     int[][] matrix = {
    //         {1, 2, 3, 4},
    //         {5, 6, 7, 8},
    //         {9, 10, 11, 12},
    //         {13, 14, 15, 16}
    //     };

    //     System.out.println("Original Matrix:");
    //     printMatrix(matrix);

    //     transpose(matrix);

    //     System.out.println("\nTransposed Matrix:");
    //     printMatrix(matrix);
    // }







// Using HashMap to transpose a matrix
     public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
            result.add(row);
        }
        return result;
    }

    // main method to test
    public static void main(String[] args) {
        TransposeMatrix sol = new TransposeMatrix();

        int[][] mat = {
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
        };

        ArrayList<ArrayList<Integer>> transposed = sol.transpose(mat);

        // Print the transposed matrix
        for (ArrayList<Integer> row : transposed) {
            System.out.println(row);
        }
    }
      
}

