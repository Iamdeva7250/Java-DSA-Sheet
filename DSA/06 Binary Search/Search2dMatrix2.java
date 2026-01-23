public class Search2dMatrix2 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int n = matrix.length;
            int m = matrix[0].length;

            int row = 0;
            int col = m - 1;

            while (row < n && col >= 0) {
                if (matrix[row][col] == target)
                    return true;
                else if (matrix[row][col] > target)
                    col--; // move left
                else
                    row++; // move down
            }

            return false;
        }

        public static void main(String[] args) {
            Search2dMatrix2 sol = new Search2dMatrix2();

            int[][] matrix = {
                    {1, 4},
                    {2, 5}
            };

            int target = 2;

            System.out.println(sol.searchMatrix(matrix, target)); // ✅ should print true
        }
    }


