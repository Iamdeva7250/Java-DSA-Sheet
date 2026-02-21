import java.util.*;

public class NumberofStronglyConnectedComponents {
    int V;
    LinkedList<Integer>[] adjListArray;

    // constructor
    NumberofStronglyConnectedComponents(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<Integer>();
        }
    }

    // Adds an edge to an undirected graph
    void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
        adjListArray[dest].add(src); // undirected
    }

    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int x : adjListArray[v]) {
            if (!visited[x])
                DFSUtil(x, visited);
        }
    }

    void connectedComponents() {
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; ++v) {
            if (!visited[v]) {
                DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    // Driver program
    public static void main(String[] args) {
        NumberofStronglyConnectedComponents g = new NumberofStronglyConnectedComponents(5);

        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(3, 4);

        System.out.println("Following are connected components:");
        g.connectedComponents();
    }
}
