import java.util.*;
import java.io.*;

public class DetectcycleinUndirectedgraph {

    // Function to add an edge between two vertices
    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph
    }

    // Utility function for DFS
    private static boolean dfsCycle(int v, boolean[] visited, int parent,
                                    ArrayList<ArrayList<Integer>> adj) {
        visited[v] = true;

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                if (dfsCycle(neighbor, visited, v, adj))
                    return true;
            } else if (neighbor != parent) {
                // If visited and not parent → cycle detected
                return true;
            }
        }
        return false;
    }

    // Function to check if graph contains cycle
    private static boolean isCyclic(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfsCycle(i, visited, -1, adj))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Number of vertices
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Creating a sample graph
        addEdge(adj, 0, 1);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 1); // This edge creates a cycle

        if (isCyclic(adj, V))
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph does not contain cycle");
    }
}
