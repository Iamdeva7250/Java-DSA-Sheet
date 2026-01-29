import java.util.*;
import java.io.*;

public class AccountMerge {
    
    // Disjoint Set Union (Union-Find)
    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++)
                parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x)
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int x, int y) {
            int px = find(x);
            int py = find(y);
            if (px != py)
                parent[py] = px;
        }
    }

    // Function to merge accounts
    public static ArrayList<ArrayList<String>> accMerge(String[][] arr) {

        int n = arr.length;
        DSU dsu = new DSU(n);

        HashMap<String, Integer> emailMap = new HashMap<>();

        // Step 1: Union accounts with common emails
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                String email = arr[i][j];

                if (!emailMap.containsKey(email)) {
                    emailMap.put(email, i);
                } else {
                    dsu.union(i, emailMap.get(email));
                }
            }
        }

        // Step 2: Group emails by parent
        HashMap<Integer, TreeSet<String>> merged = new HashMap<>();

        for (Map.Entry<String, Integer> entry : emailMap.entrySet()) {
            int parent = dsu.find(entry.getValue());
            merged.putIfAbsent(parent, new TreeSet<>());
            merged.get(parent).add(entry.getKey());
        }

        // Step 3: Build result
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for (Map.Entry<Integer, TreeSet<String>> entry : merged.entrySet()) {
            int index = entry.getKey();
            ArrayList<String> account = new ArrayList<>();

            account.add(arr[index][0]); // Name
            account.addAll(entry.getValue()); // Sorted emails

            result.add(account);
        }

        return result;
    }

    // MAIN METHOD (VS Code execution)
    public static void main(String[] args) {

        String[][] arr = {
            {"John", "johnsmith@mail.com", "john_newyork@mail.com"},
            {"John", "johnsmith@mail.com", "john00@mail.com"},
            {"Mary", "mary@mail.com"},
            {"John", "johnnybravo@mail.com"}
        };

        ArrayList<ArrayList<String>> result = accMerge(arr);

        for (ArrayList<String> account : result) {
            System.out.println(account);
        }
    }

    
}