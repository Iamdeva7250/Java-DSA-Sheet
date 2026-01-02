import java.util.*;
import java.io.*;

public class Swapdiagonals {

    public void swapDiagonal(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            int temp = mat[i][i];
            mat[i][i] = mat[i][n - 1 - i];
            mat[i][n - 1 - i] = temp;
        }
    }

    // Print matrix
    public void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Swapdiagonals obj = new Swapdiagonals();  // ✅ FIXED

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Before swapping diagonals:");
        obj.printMatrix(mat);

        obj.swapDiagonal(mat);

        System.out.println("\nAfter swapping diagonals:");
        obj.printMatrix(mat);
    }
}
