public class RotateMatrixClockwise {

    static void rotateMatrix(int[][] mat) {
        int N = mat.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < N; i++) {
            int left = 0, right = N - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Function to print the matrix
    static void displayMatrix(int[][] mat) {
        int N = mat.length; // define N here
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        int[][] mat = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        System.out.println("Original Matrix:");
        displayMatrix(mat);

        // Rotate the matrix
        rotateMatrix(mat);

        // Print rotated matrix
        System.out.println("Rotated Matrix (90° Clockwise):");
        displayMatrix(mat);
    }
}



//  public void rotateMatrix(int[][] mat) {
//         // code here
//         int n = mat.length;
        
//         for(int i = 0; i < n; i++){
//             for(int j = i; j < n; j++){
//                 int temp = mat[i][j];
//                 mat[i][j] = mat[j][i];
//                 mat[j][i] = temp;
//             }
//         }
//         for(int j = 0; j < n; j++){
//             int left = 0; 
//             int right = n - 1;
//             while(left < right){
                
//                 int temp = mat[left][j];
//                 mat[left][j] = mat[right][j];
//                 mat[right][j]  = temp;
                
//                 left++;
//                 right--;
//             }
//         }
//     }