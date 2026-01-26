import java.util.*;

public class SpiralPatternMatrix {

    public static List<Integer> getSpiralOrder(int[][] mat, int R, int C) {
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = R - 1;
        int left = 0, right = C - 1;

        while (top <= bottom && left <= right) {
            // 1. Top row
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;

            // 2. Right column
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;

            // 3. Bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }

            // 4. Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] smallMatrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Call the function inside main
        List<Integer> spiral = getSpiralOrder(matrix, matrix.length, matrix[0].length);
        List<Integer> smallSpiral = getSpiralOrder(smallMatrix, smallMatrix.length, smallMatrix[0].length);

        System.out.println("Spiral Order: " + spiral);
        System.out.println("Small Matrix Spiral Order: " + smallSpiral);
    }
}
