import java.util.*;
public class ExchangeFirstColToLastCol {
  public void exchangefirstcoltolastcol(int matrix[][]){
    int rows = matrix.length;

    int firstColIndex = 0;
    int lastColIndex = matrix[0].length - 1;

    for(int i=0; i<rows; i++){
      int temp = matrix[i][firstColIndex];
      matrix[i][firstColIndex] = matrix[i][lastColIndex];
      matrix[i][lastColIndex] = temp;
    }
  }
  public static void main(String[] args) {
    ExchangeFirstColToLastCol obj = new ExchangeFirstColToLastCol();
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

    obj.exchangefirstcoltolastcol(matrix);

    System.out.println("Matrix after exchanging first and last columns:");
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
