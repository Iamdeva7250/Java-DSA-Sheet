import java.util.*;

public class Adjacencymatrix {
    public static void main(String[] args) {
        // Example input directly in code
        int n = 4; // number of vertices
        int m = 3; // number of edges

        // adjacency matrix (1-based indexing)
        int[][] adjMat = new int[n + 1][n + 1];

        // edges defined directly in code
        int[][] edges = {
            {1, 2},
            {2, 3},
            {4, 2}
        };

        // fill adjacency matrix
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjMat[u][v] = 1;
            adjMat[v][u] = 1; // remove this line for directed graph
        }

        // print adjacency matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
