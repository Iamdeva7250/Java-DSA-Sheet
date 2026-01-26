import java.util.*;
public class SumOfUpperandLowerTriangle {
      public ArrayList<Integer> sumTriangles(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = mat.length;
        
        int uppersum = 0, lowersum = 0;
        
        for(int i = 0; i< n; i++){
            for(int j = 0; j < n; j++){
                if(j >= i){
                    uppersum += mat[i][j];
                }
                if(i >= j){
                    lowersum += mat[i][j];
                }
            }
        }
        result.add(uppersum);
        result.add(lowersum);
        return result;
        
        
    }
    public static void main(String[] args) {
        SumOfUpperandLowerTriangle obj = new SumOfUpperandLowerTriangle();
        int matrix[][] =  {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
            };
        ArrayList<Integer> sums = obj.sumTriangles(matrix);
        System.out.println("Sum of Upper Triangle: " + sums.get(0));
        System.out.println("Sum of Lower Triangle: " + sums.get(1));
    }
  
}
