public class sorted2DMartix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

        public static void main(String[] args) {
            int[][] matrix = {
                    {3, 4, 7, 9},
                    {12, 13, 16, 18},
                    {20, 21, 23, 29}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            // Total elements
            int size = rows * cols;
            int[] flattened = new int[size];

            // Flattening process
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    flattened[index++] = matrix[i][j];
                }
            }

            // Display original 2D matrix
            System.out.println("2D Matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Display flattened 1D array
            System.out.println("\nFlattened 1D Array:");
            for (int num : flattened) {
                System.out.print(num + " ");
            }
        }
    }





