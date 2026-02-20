<<<<<<< HEAD
import java.util.*;
import java.io.*;

public class MergeK_SortedArrays {
    
    private static class HeapNode implements Comparable<HeapNode> {
        int x;     // which array
        int y;     // index in that array
        int value; // actual value

        HeapNode(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public int compareTo(HeapNode hn) {
            return Integer.compare(this.value, hn.value);
        }
    }

    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<HeapNode> heap = new PriorityQueue<>();

        // Initially add the first element of every array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 0) {
                heap.add(new HeapNode(i, 0, arr[i][0]));
            }
        }

        while (!heap.isEmpty()) {
            HeapNode curr = heap.poll();
            result.add(curr.value);

            // Add next element from the same array
            if (curr.y < arr[curr.x].length - 1) {
                heap.add(new HeapNode(curr.x, curr.y + 1, arr[curr.x][curr.y + 1]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 6, 12},
            {1, 9},
            {23, 34, 90, 2000}
        };

        ArrayList<Integer> merged = mergeKArrays(arr, arr.length);
        System.out.println("Merged array: " + merged);
       
    }
}
=======
import java.util.*;
import java.io.*;

public class MergeK_SortedArrays {
    
    private static class HeapNode implements Comparable<HeapNode> {
        int x;     // which array
        int y;     // index in that array
        int value; // actual value

        HeapNode(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public int compareTo(HeapNode hn) {
            return Integer.compare(this.value, hn.value);
        }
    }

    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<HeapNode> heap = new PriorityQueue<>();

        // Initially add the first element of every array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > 0) {
                heap.add(new HeapNode(i, 0, arr[i][0]));
            }
        }

        while (!heap.isEmpty()) {
            HeapNode curr = heap.poll();
            result.add(curr.value);

            // Add next element from the same array
            if (curr.y < arr[curr.x].length - 1) {
                heap.add(new HeapNode(curr.x, curr.y + 1, arr[curr.x][curr.y + 1]));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 6, 12},
            {1, 9},
            {23, 34, 90, 2000}
        };

        ArrayList<Integer> merged = mergeKArrays(arr, arr.length);
        System.out.println("Merged array: " + merged);
       
    }
}
>>>>>>> a323358 (Initial commit)
