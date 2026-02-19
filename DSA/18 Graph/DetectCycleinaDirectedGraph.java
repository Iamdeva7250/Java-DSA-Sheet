import java.util.*;

public class DetectCycleinaDirectedGraph {

    private final int V;
    private final List<List<Integer>> adj;

    // Constructor
    public DetectCycleinaDirectedGraph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++)
            adj.add(new LinkedList<>());
    }

    // Add edge to directed graph
    public void addEdge(int source, int dest) {
        adj.get(source).add(dest);
    }

    // DFS utility
    private boolean isCyclicUtil(int i, boolean[] visited, boolean[] recStack) {
        if (recStack[i]) return true;
        if (visited[i]) return false;

        visited[i] = true;
        recStack[i] = true;

        for (Integer c : adj.get(i)) {
            if (isCyclicUtil(c, visited, recStack))
                return true;
        }

        recStack[i] = false;
        return false;
    }

    // Detect cycle using DFS + recursion stack
    public boolean isCyclicDFS() {
        boolean[] visited = new boolean[V];
        boolean[] recStack = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (isCyclicUtil(i, visited, recStack))
                return true;
        }
        return false;
    }

    // Detect cycle using Kahn’s Algorithm (BFS/topological sort)
    public boolean isCyclicKahn() {
        int[] indegree = new int[V];
        for (int u = 0; u < V; u++) {
            for (int v : adj.get(u))
                indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (indegree[i] == 0)
                q.add(i);

        int cnt = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj.get(u)) {
                if (--indegree[v] == 0)
                    q.add(v);
            }
            cnt++;
        }

        // If count != V, cycle exists
        return (cnt != V);
    }

    // Driver code
    public static void main(String[] args) {
        DetectCycleinaDirectedGraph graph = new DetectCycleinaDirectedGraph(6);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0); // cycle here
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        System.out.println("Using DFS + Recursion Stack:");
        if (graph.isCyclicDFS())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");

        System.out.println("\nUsing Kahn’s Algorithm (BFS):");
        if (graph.isCyclicKahn())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contain cycle");
    }
}
