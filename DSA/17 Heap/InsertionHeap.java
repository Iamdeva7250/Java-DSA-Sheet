import java.util.*;
import java.io.*;

public class InsertionHeap {

    static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c) {
            capacity = c;
            size = 0;
            arr = new int[c];
        }

        // Insert into Min Heap
        void insert(int x) {
            if (size == capacity) return;

            size++;
            int i = size - 1;
            arr[i] = x;

            // Fix the min heap property
            while (i != 0 && arr[parent(i)] > arr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);
        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        h.printHeap(); 
    }
}
