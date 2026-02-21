import java.util.*;

public class BellmanFordAlgorithm {
    
    class Edge {
        int src, dest, weight;
        Edge() {
            src = dest = weight = 0;
        }
    }

    int V, E;
    Edge edge[];

    // Constructor
    BellmanFordAlgorithm(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    // Bellman-Ford algorithm
    void BellmanFord(int src) {
        int dist[] = new int[V];

        // Step 1: Initialize distances
        for (int i = 0; i < V; ++i)
            dist[i] = Integer.MAX_VALUE;
        dist[src] = 0;

        // Step 2: Relax edges |V|-1 times
        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = edge[j].src;
                int v = edge[j].dest;
                int weight = edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }

        // Step 3: Check for negative-weight cycles
        for (int j = 0; j < E; ++j) {
            int u = edge[j].src;
            int v = edge[j].dest;
            int weight = edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        printArr(dist);
    }

    // Utility function to print distances
    void printArr(int dist[]) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }

    // Driver method
    public static void main(String[] args) {
        int V = 5;  // Number of vertices
        int E = 8;  // Number of edges

        BellmanFordAlgorithm graph = new BellmanFordAlgorithm(V, E);

        // add edges
        graph.edge[0].src = 0; graph.edge[0].dest = 1; graph.edge[0].weight = -1;
        graph.edge[1].src = 0; graph.edge[1].dest = 2; graph.edge[1].weight = 4;
        graph.edge[2].src = 1; graph.edge[2].dest = 2; graph.edge[2].weight = 3;
        graph.edge[3].src = 1; graph.edge[3].dest = 3; graph.edge[3].weight = 2;
        graph.edge[4].src = 1; graph.edge[4].dest = 4; graph.edge[4].weight = 2;
        graph.edge[5].src = 3; graph.edge[5].dest = 2; graph.edge[5].weight = 5;
        graph.edge[6].src = 3; graph.edge[6].dest = 1; graph.edge[6].weight = 1;
        graph.edge[7].src = 4; graph.edge[7].dest = 3; graph.edge[7].weight = -3;

        graph.BellmanFord(0);
    }
}
