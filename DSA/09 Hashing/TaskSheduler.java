import java.util.*;
import java.io.*;

public class TaskSheduler {

    static int leastInterval(int N, int K, char tasks[]) {
        int[] freq = new int[26];

        // Count frequency of tasks
        for (char c : tasks) {
            freq[c - 'A']++;
        }

        // Find maximum frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count tasks with max frequency
        int countMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                countMax++;
            }
        }

        // Calculate result
        int result = (maxFreq - 1) * (K + 1) + countMax;

        return Math.max(N, result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of tasks:");
        int N = sc.nextInt();

        System.out.println("Enter cooling period (K):");
        int K = sc.nextInt();

        System.out.println("Enter tasks (as a string of uppercase letters):");
        String taskString = sc.next();
        char[] tasks = taskString.toCharArray();

        int result = leastInterval(N, K, tasks);
        System.out.println("Least Interval: " + result);
    }
}
