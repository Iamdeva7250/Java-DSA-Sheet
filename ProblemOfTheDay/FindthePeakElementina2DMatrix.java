import java.util.*;
import java.io.*;

public class FindthePeakElementina2DMatrix {
    
    // Your code here
      public ArrayList<Integer> findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0, right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            // Find row index of max element in mid column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int leftVal  = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1]
                                             : Integer.MIN_VALUE;
            int rightVal = (midCol + 1 < cols) ? mat[maxRow][midCol + 1]
                                               : Integer.MIN_VALUE;

            // Check peak condition
            if (mat[maxRow][midCol] >= leftVal &&
                mat[maxRow][midCol] >= rightVal) {

                ArrayList<Integer> res = new ArrayList<>();
                res.add(maxRow);
                res.add(midCol);
                return res;
            }
            // Move search space
            else if (leftVal > mat[maxRow][midCol]) {
                right = midCol - 1;
            } else {
                left = midCol + 1;
            }
        }

        return new ArrayList<>();
    }
    public static void main(String[] args) {
      FindthePeakElementina2DMatrix solver = new FindthePeakElementina2DMatrix();
      int[][] mat = {
          {1, 4, 3},
          {6, 5, 2},
          {7, 8, 9}
      };
      ArrayList<Integer> peak = solver.findPeakGrid(mat);
      System.out.println("Peak Element Position: " + peak);
    }
    
}