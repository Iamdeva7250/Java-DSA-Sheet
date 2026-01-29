import java.util.*;
import java.io.*;

public class WinnerofanElection {

    // Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n) {

        HashMap<String, Integer> map = new HashMap<>();

        // Count votes
        for (String name : arr) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        String winnerName = "";
        int maxVotes = 0;

        // Find winner
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes ||
               (votes == maxVotes && name.compareTo(winnerName) < 0)) {
                maxVotes = votes;
                winnerName = name;
            }
        }

        return new String[]{winnerName, String.valueOf(maxVotes)};
    }

    // MAIN METHOD (required for VS Code)
    public static void main(String[] args) {

        String[] arr = {
            "john","johnny","jackie","johnny","john",
            "jackie","jamie","jamie","john","johnny",
            "jamie","johnny","john"
        };

        int n = arr.length;

        String[] result = winner(arr, n);

        System.out.println(result[0] + " " + result[1]);
    }
}

