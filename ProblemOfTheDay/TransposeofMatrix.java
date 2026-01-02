import java.util.*;

public class TransposeofMatrix {

    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        
        int n = mat.length;
        int m = mat[0].length;
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(mat[j][i]);
            }
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {

        // Sample matrix for testing in VS Code
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        TransposeofMatrix obj = new TransposeofMatrix();
        ArrayList<ArrayList<Integer>> transposed = obj.transpose(matrix);

        // Print result
        System.out.println("Transposed Matrix:");
        for (ArrayList<Integer> row : transposed) {
            System.out.println(row);
        }
    }
}
