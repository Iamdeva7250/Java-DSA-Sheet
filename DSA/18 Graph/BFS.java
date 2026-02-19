import java.util.*;

public class BFS {
    
    // Function to add an edge into the graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this line for directed graph
    }
    
    // Function to perform BFS traversal of a Graph
    static void BFS(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean visited[] = new boolean[V + 1]; // visited array
        
        // Queue for BFS
        LinkedList<Integer> queue = new LinkedList<>();
        
        // Start BFS from vertex 1
        int s = 1;
        visited[s] = true;
        queue.add(s);
        
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " ");
            
            // Traverse all adjacent vertices
            for (int newNode : adj.get(s)) {
                if (!visited[newNode]) {
                    visited[newNode] = true;
                    queue.add(newNode);
                }
            }
        }
    }
    
    // Driver Code
    public static void main(String[] args) {
        int V = 6; // number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V + 1);
        
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Adding edges
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 2, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 5, 6);
        
        System.out.println("Breadth First Traversal starting from vertex 1:");
        BFS(adj, V);
    }
}
