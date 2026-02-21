<<<<<<< HEAD
import java.util.*;
import java.io.*;

public class TopologicalSortingKahnBFSBasedAlgortihm {
    
    int V;
    List<Integer> adj[];

    // Constructor
    public TopologicalSortingKahnBFSBasedAlgortihm(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<Integer>();
    }

    // Function to add an edge to graph
    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    // Function to perform topological sort
    public void topologicalSort() {
        int indegree[] = new int[V];

        // Compute indegree of each vertex
        for (int i = 0; i < V; i++) {
            for (int node : adj[i]) {
                indegree[node]++;
            }
        }

        // Queue for vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int cnt = 0;
        Vector<Integer> topOrder = new Vector<>();

        while (!q.isEmpty()) {
            int u = q.poll();
            topOrder.add(u);

            for (int node : adj[u]) {
                if (--indegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }

        // If count != V, cycle exists
        if (cnt != V) {
            System.out.println("There exists a cycle in the graph");
            return;
        }

        // Print topological order
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
    }

    // Driver code
    public static void main(String args[]) {
        TopologicalSortingKahnBFSBasedAlgortihm g = new TopologicalSortingKahnBFSBasedAlgortihm(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological Sort:");
        g.topologicalSort();
    }
}
=======
import java.util.*;
import java.io.*;

public class TopologicalSortingKahnBFSBasedAlgortihm {
    
    int V;
    List<Integer> adj[];

    // Constructor
    public TopologicalSortingKahnBFSBasedAlgortihm(int V) {
        this.V = V;
        adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<Integer>();
    }

    // Function to add an edge to graph
    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    // Function to perform topological sort
    public void topologicalSort() {
        int indegree[] = new int[V];

        // Compute indegree of each vertex
        for (int i = 0; i < V; i++) {
            for (int node : adj[i]) {
                indegree[node]++;
            }
        }

        // Queue for vertices with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }

        int cnt = 0;
        Vector<Integer> topOrder = new Vector<>();

        while (!q.isEmpty()) {
            int u = q.poll();
            topOrder.add(u);

            for (int node : adj[u]) {
                if (--indegree[node] == 0)
                    q.add(node);
            }
            cnt++;
        }

        // If count != V, cycle exists
        if (cnt != V) {
            System.out.println("There exists a cycle in the graph");
            return;
        }

        // Print topological order
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
    }

    // Driver code
    public static void main(String args[]) {
        TopologicalSortingKahnBFSBasedAlgortihm g = new TopologicalSortingKahnBFSBasedAlgortihm(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Following is a Topological Sort:");
        g.topologicalSort();
    }
}
>>>>>>> a323358 (Initial commit)
