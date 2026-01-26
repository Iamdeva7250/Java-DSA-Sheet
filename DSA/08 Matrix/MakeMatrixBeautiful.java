public class MakeMatrixBeautiful {
   public static int balanceSums(int[][] mat) {
        // code here
        
        int n = mat.length;
        
        int [] rowsSum = new int [n];
        int [] colsSum = new int [n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rowsSum[i] += mat[i][j];;
                colsSum[j] += mat[i][j];
            }
        }
        
        int maxSum = 0;
        
        for(int i = 0; i < n; i++){
            maxSum = Math.max(maxSum, rowsSum[i]);
            maxSum = Math.max(maxSum, colsSum[i]);
        }
        
        int operations = 0;
        for(int i = 0; i < n; i++){
            operations += (maxSum - rowsSum[i]);
        }
        return operations;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 2, 3},
            {3, 2, 1}
        };
        
        int result = balanceSums(mat);
        System.out.println("Minimum operations to make matrix beautiful: " + result);
    }

  
}
