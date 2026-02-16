import java.util.*;
import java.io.*;

public class Heapimplementation {
    
    static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c) {
            arr = new int[c];
            size = 0;
            capacity = c;
        }

        int left(int i) { return (2 * i + 1); }
        int right(int i) { return (2 * i + 2); }
        int parent(int i) { return (i - 1) / 2; }

        // Insert a new key
        void insert(int key) {
            if (size == capacity) {
                System.out.println("Heap overflow");
                return;
            }
            arr[size] = key;
            int i = size;
            size++;

            // Fix the min heap property
            while (i != 0 && arr[parent(i)] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[parent(i)];
                arr[parent(i)] = temp;
                i = parent(i);
            }
        }

        // Extract minimum element
        int extractMin() {
            if (size <= 0) return Integer.MAX_VALUE;
            if (size == 1) {
                size--;
                return arr[0];
            }

            int root = arr[0];
            arr[0] = arr[size - 1];
            size--;
            minHeapify(0);

            return root;
        }

        // Heapify at index i
        void minHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;

            if (l < size && arr[l] < arr[smallest]) smallest = l;
            if (r < size && arr[r] < arr[smallest]) smallest = r;

            if (smallest != i) {
                int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
                minHeapify(smallest);
            }
        }

        // Print heap elements
        void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        heap.insert(3);
        heap.insert(2);
        heap.insert(15);
        heap.insert(5);
        heap.insert(4);
        heap.insert(45);

        System.out.println("Heap elements:");
        heap.printHeap();

        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.println("Heap after extraction:");
        heap.printHeap();
    }
}
