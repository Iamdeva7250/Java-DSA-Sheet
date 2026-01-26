import java.util.*;

public class DeterminantOfMatrix {
  
    static int determinantOfMatrix(int matrix[][], int n) {
        int det = 1;
        int total = 1;
        
        for (int i = 0; i < n; i++) {
            int index = i;
            
            // Find a non-zero pivot row
            while (index < n && matrix[index][i] == 0) {
                index++;
            }

            // If no pivot found → determinant = 0
            if (index == n) {
                return 0;
            }

            // If pivot row is not current row, swap
            if (index != i) {
                for (int j = 0; j < n; j++) {
                    int temp = matrix[index][j];
                    matrix[index][j] = matrix[i][j];
                    matrix[i][j] = temp;
                }
                det *= -1; // swapping row flips sign
            }

            int pivot = matrix[i][i];

            // Eliminate below pivot
            for (int j = i + 1; j < n; j++) {
                int num2 = matrix[j][i];
                for (int k = 0; k < n; k++) {
                    matrix[j][k] = pivot * matrix[j][k] - num2 * matrix[i][k];
                }
                total *= pivot;
            }
        }

        // Multiply diagonal elements
        for (int i = 0; i < n; i++) {
            det *= matrix[i][i];
        }

        return det / total;
    }
    public static void main(String[] args) {
        int matrix[][] =  {
              {1, 0, 2, -1},
              {3, 0, 0, 5},
              {2, 1, 4, -3},
              {1, 0, 5, 0}
            };
        int n = matrix.length;
        int det = determinantOfMatrix(matrix, n);
        System.out.println("Determinant: " + det);
    }
}









// class Solution {
//     // Function for finding determinant of matrix.
//     static int determinantOfMatrix(int matrix[][], int n) {
        
//          double[][] mat = new double[n][n];
         
//          for(int i = 0; i< n ; i++)
//              for(int j = 0; j < n; j++)
//                  mat[i][j] = matrix[i][j];
            
//          double det = 1.0;
        
//         for(int i = 0; i < n; i++){
//             int pivot = i;
            
//             for(int j = i + 1; j < n ; j++)
            
//             if(Math.abs(mat[j][i]) > Math.abs(mat[pivot][i]))
            
//             pivot = j;
            
//             if(Math.abs(mat[pivot][i]) < 1e-9)
//             return 0;
            
            
//             if(pivot != i){
//                     double[] temp = mat[i];
//                     mat[i] = mat[pivot];
//                     mat[pivot] = temp;
                    
//                     det *= - 1;
//                 }
                
//                 det *= mat[i][i];
            
//             for(int j = i + 1; j < n; j++){
//                 double factor = mat[j][i] / mat[i][i];
                
//                 for(int k = i; k < n; k++){
//                     mat[j][k] -=  factor * mat[i][k];
//                 }
               
//             }
//         }
//         return (int) Math.round(det);
        
//     }
// }
