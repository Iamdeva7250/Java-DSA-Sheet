import java.util.*;
import java.io.*;

public class Rowwithmax1s {
    
    // Your code here
     public int rowWithMax1s(int arr[][]) {
        
        int n = arr.length;
        int m = arr[0].length;
        
        int maxRowIndex = -1;
        int j = m - 1;  // start from top-right
        
        for (int i = 0; i < n; i++) {
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                maxRowIndex = i;
            }
        }
        
        return maxRowIndex;
    }

    public static void main(String[] args) {
        Rowwithmax1s solver = new Rowwithmax1s();
        int[][] matrix = {
            {0, 0, 0, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };
        int result = solver.rowWithMax1s(matrix);
        System.out.println("Row with maximum 1s: " + result);
    }
    
}
