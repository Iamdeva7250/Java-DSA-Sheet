import java.util.ArrayList;
public class BoundaryPattren {

    // static void bTraversal(int[][] mat) {
    //     int R = mat.length;
    //     int C = mat[0].length;

    //     // If there is only one row
    //     if (R == 1) {
    //         for (int i = 0; i < C; i++) {
    //             System.out.print(mat[0][i] + " ");
    //         }
    //     }

    //     // If there is only one column
    //     else if (C == 1) {
    //         for (int i = 0; i < R; i++) {
    //             System.out.print(mat[i][0] + " ");
    //         }
    //     }

    //     // Otherwise, print boundary in clockwise order
    //     else {
    //         // Top row (left to right)
    //         for (int i = 0; i < C; i++) {
    //             System.out.print(mat[0][i] + " ");
    //         }

    //         // Right column (top to bottom)
    //         for (int i = 1; i < R; i++) {
    //             System.out.print(mat[i][C - 1] + " ");
    //         }

    //         // Bottom row (right to left)
    //         for (int i = C - 2; i >= 0; i--) {
    //             System.out.print(mat[R - 1][i] + " ");
    //         }

    //         // Left column (bottom to top)
    //         for (int i = R - 2; i >= 1; i--) {
    //             System.out.print(mat[i][0] + " ");
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int[][] mat = {
    //         {1, 2, 3, 4},
    //         {5, 6, 7, 8},
    //         {9, 10, 11, 12},
    //         {13, 14, 15, 16}
    //     };

    //     System.out.println("Boundary Traversal of Matrix:");
    //     bTraversal(mat);
    // }


















    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int R = mat.length;
        int C = mat[0].length;
        
        if (R == 1) {
            for (int i = 0; i < C; i++) {
                result.add(mat[0][i]);
            }
        } else if (C == 1) {
            for (int i = 0; i < R; i++) {
                result.add(mat[i][0]);
            }
        } else {
            // top row
            for (int i = 0; i < C; i++) {
                result.add(mat[0][i]);
            }
            // right column (start from 1 to avoid duplicate top-right)
            for (int i = 1; i < R; i++) {
                result.add(mat[i][C - 1]);
            }
            // bottom row (skip bottom-right corner)
            for (int i = C - 2; i >= 0; i--) {
                result.add(mat[R - 1][i]);
            }
            // left column (skip bottom-left and top-left)
            for (int i = R - 2; i >= 1; i--) {
                result.add(mat[i][0]);
            }
        }
        
        return result;
    }

    // main method to test the function
    public static void main(String[] args) {
        BoundaryPattren sol = new BoundaryPattren();

        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        ArrayList<Integer> boundary = sol.boundaryTraversal(mat);

        System.out.println("Boundary Traversal:");
        System.out.println(boundary);
    }

}
