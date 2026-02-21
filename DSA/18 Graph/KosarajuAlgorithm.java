import java.util.*;

public class KosarajuAlgorithm {
    
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; // Adjacency List

    // Constructor
    KosarajuAlgorithm(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // A recursive function to print DFS starting from v
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // Function that returns reverse (or transpose) of this graph
    KosarajuAlgorithm getTranspose() {
        KosarajuAlgorithm g = new KosarajuAlgorithm(V);
        for (int v = 0; v < V; v++) {
            for (int n : adj[v]) {
                g.adj[n].add(v);
            }
        }
        return g;
    }

    void fillOrder(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;
        for (int n : adj[v]) {
            if (!visited[n])
                fillOrder(n, visited, stack);
        }
        stack.push(v);
    }

    // The main function that finds and prints all strongly connected components
    void printSCCs() {
        Stack<Integer> stack = new Stack<>();

        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);

        // Fill vertices in stack according to their finishing times
        for (int i = 0; i < V; i++)
            if (!visited[i])
                fillOrder(i, visited, stack);

        // Create a reversed graph
        KosarajuAlgorithm gr = getTranspose();

        Arrays.fill(visited, false);

        // Process all vertices in order defined by Stack
        while (!stack.isEmpty()) {
            int v = stack.pop();
            if (!visited[v]) {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    // Driver method
    public static void main(String args[]) {
        KosarajuAlgorithm g = new KosarajuAlgorithm(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        System.out.println("Following are strongly connected components in given graph:");
        g.printSCCs();
    }
}
