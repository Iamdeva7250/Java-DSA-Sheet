import java.util.*;

public class InterChangeRows {
    
    public void interchangerows(int matrix[][]){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;

        while (top < bottom) {
            for (int j = 0; j < cols; j++) {
                int temp = matrix[top][j];
                matrix[top][j] = matrix[bottom][j];
                matrix[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InterChangeRows obj = new InterChangeRows();
        
        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10,11,12}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        obj.interchangerows(matrix);
        
        System.out.println("Matrix after interchanging rows:");
        printMatrix(matrix);  
    }
}
