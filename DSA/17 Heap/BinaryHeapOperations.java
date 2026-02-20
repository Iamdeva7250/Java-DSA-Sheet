import java.util.*;


public class BinaryHeapOperations {

    static class MinHeap {
        int[] harr;
        int capacity;
        int heap_size;

        MinHeap(int cap) {
            heap_size = 0;
            capacity = cap;
            harr = new int[cap];
        }

        int parent(int i) { return (i - 1) / 2; }
        int left(int i) { return (2 * i + 1); }
        int right(int i) { return (2 * i + 2); }

        int extractMin() {
            if (heap_size <= 0) return Integer.MAX_VALUE;
            if (heap_size == 1) {
                heap_size--;
                return harr[0];
            }
            int root = harr[0];
            harr[0] = harr[heap_size - 1];
            heap_size--;
            MinHeapify(0);
            return root;
        }

        void insertKey(int k) {
            if (heap_size == capacity) {
                System.out.println("Overflow: Could not insertKey");
                return;
            }
            heap_size++;
            int i = heap_size - 1;
            harr[i] = k;
            while (i != 0 && harr[parent(i)] > harr[i]) {
                int temp = harr[i];
                harr[i] = harr[parent(i)];
                harr[parent(i)] = temp;
                i = parent(i);
            }
        }

        void deleteKey(int i) {
            if (i < 0 || i >= heap_size) {
                System.out.println("Invalid index");
                return;
            }
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }

        void decreaseKey(int i, int new_val) {
            harr[i] = new_val;
            while (i != 0 && harr[parent(i)] > harr[i]) {
                int temp = harr[i];
                harr[i] = harr[parent(i)];
                harr[parent(i)] = temp;
                i = parent(i);
            }
        }

        void MinHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;
            if (l < heap_size && harr[l] < harr[smallest]) smallest = l;
            if (r < heap_size && harr[r] < harr[smallest]) smallest = r;
            if (smallest != i) {
                int temp = harr[i];
                harr[i] = harr[smallest];
                harr[smallest] = temp;
                MinHeapify(smallest);
            }
        }
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);
        h.insertKey(3);
        h.insertKey(2);
        h.deleteKey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);

        System.out.println("Extracted Min: " + h.extractMin()); // 2
        h.decreaseKey(2, 1);
        System.out.println("Extracted Min: " + h.extractMin()); // 1
    }
}
