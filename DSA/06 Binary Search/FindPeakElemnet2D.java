import java.util.Arrays;
import java.util.Scanner;

public class FindPeakElemnet2D {

    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0, right = cols - 1;

        // Binary search on columns
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Find the row with maximum element in current column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][mid] > mat[maxRow][mid]) {
                    maxRow = i;
                }
            }

            boolean leftIsGreater = mid - 1 >= 0 && mat[maxRow][mid - 1] > mat[maxRow][mid];
            boolean rightIsGreater = mid + 1 < cols && mat[maxRow][mid + 1] > mat[maxRow][mid];

            if (!leftIsGreater && !rightIsGreater) {
                return new int[]{maxRow, mid};
            }

            if (rightIsGreater) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int[] result = findPeakGrid(mat);
        System.out.println("\nPeak element found at position: " + Arrays.toString(result));

        sc.close();
    }
}

  

