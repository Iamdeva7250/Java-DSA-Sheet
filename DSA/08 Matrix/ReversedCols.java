import java.util.*;
public class ReversedCols {
  public void reverseColumn(int matrix[][]){
  int rows = matrix.length;
        int cols = matrix[0].length;
        
        for(int i = 0; i < rows; i++){
            int left = 0;
            int right = cols - 1;
            
            
            while (left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                
                
                left++;
                right--;
            }
            
        }

  }
  public static void main(String[] args) {
    ReversedCols obj = new ReversedCols();
    int matrix[][] = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
    };

    System.out.println("Original Matrix:");
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    obj.reverseColumn(matrix);

    System.out.println("Matrix after reversing each column:");
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
  

