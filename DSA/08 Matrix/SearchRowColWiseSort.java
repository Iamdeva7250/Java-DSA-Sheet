public class SearchRowColWiseSort {

    public void search(int[][] mat, int R, int C, int n) {
        int i = 0;       // start from top-right corner
        int j = C - 1;

        while (i < R && j >= 0) {
            if (mat[i][j] == n) {
                System.out.println("Found at (" + i + ", " + j + ")");
                return;
            }
            if (mat[i][j] > n) {
                j--; // move left
            } else {
                i++; // move down
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[][] mat = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int n = 29;

        SearchRowColWiseSort obj = new SearchRowColWiseSort();
        obj.search(mat, 4, 4, n);
    }
}
