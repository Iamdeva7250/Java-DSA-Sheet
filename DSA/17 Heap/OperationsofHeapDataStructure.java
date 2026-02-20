<<<<<<< HEAD
import java.util.*;

public class OperationsofHeapDataStructure {

    static class MinHeap {
        int[] harr;
        int capacity;
        int heapSize;

        // Constructor
        MinHeap(int capacity) {
            this.capacity = capacity;
            this.heapSize = 0;
            harr = new int[capacity];
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        int left(int i) {
            return 2 * i + 1;
        }

        int right(int i) {
            return 2 * i + 2;
        }

        // Insert key
        void insertKey(int k) {
            if (heapSize == capacity) {
                System.out.println("Overflow: Could not insert key");
                return;
            }

            int i = heapSize;
            harr[i] = k;
            heapSize++;

            while (i != 0 && harr[parent(i)] > harr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        // Decrease key
        void decreaseKey(int i, int newVal) {
            harr[i] = newVal;

            while (i != 0 && harr[parent(i)] > harr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        // Extract minimum
        int extractMin() {
            if (heapSize <= 0)
                return Integer.MAX_VALUE;

            if (heapSize == 1) {
                heapSize--;
                return harr[0];
            }

            int root = harr[0];
            harr[0] = harr[heapSize - 1];
            heapSize--;
            minHeapify(0);

            return root;
        }

        // Delete key at index i
        void deleteKey(int i) {
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }

        int getMin() {
            return harr[0];
        }

        // Heapify
        void minHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;

            if (l < heapSize && harr[l] < harr[smallest])
                smallest = l;

            if (r < heapSize && harr[r] < harr[smallest])
                smallest = r;

            if (smallest != i) {
                swap(i, smallest);
                minHeapify(smallest);
            }
        }

        void swap(int i, int j) {
            int temp = harr[i];
            harr[i] = harr[j];
            harr[j] = temp;
        }
    }

    // Driver code
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);

        h.insertKey(3);
        h.insertKey(2);
        h.deleteKey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);

        System.out.print(h.extractMin() + " ");
        System.out.print(h.getMin() + " ");
        h.decreaseKey(2, 1);
        System.out.print(h.getMin());
    }
}
=======
import java.util.*;

public class OperationsofHeapDataStructure {

    static class MinHeap {
        int[] harr;
        int capacity;
        int heapSize;

        // Constructor
        MinHeap(int capacity) {
            this.capacity = capacity;
            this.heapSize = 0;
            harr = new int[capacity];
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        int left(int i) {
            return 2 * i + 1;
        }

        int right(int i) {
            return 2 * i + 2;
        }

        // Insert key
        void insertKey(int k) {
            if (heapSize == capacity) {
                System.out.println("Overflow: Could not insert key");
                return;
            }

            int i = heapSize;
            harr[i] = k;
            heapSize++;

            while (i != 0 && harr[parent(i)] > harr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        // Decrease key
        void decreaseKey(int i, int newVal) {
            harr[i] = newVal;

            while (i != 0 && harr[parent(i)] > harr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        // Extract minimum
        int extractMin() {
            if (heapSize <= 0)
                return Integer.MAX_VALUE;

            if (heapSize == 1) {
                heapSize--;
                return harr[0];
            }

            int root = harr[0];
            harr[0] = harr[heapSize - 1];
            heapSize--;
            minHeapify(0);

            return root;
        }

        // Delete key at index i
        void deleteKey(int i) {
            decreaseKey(i, Integer.MIN_VALUE);
            extractMin();
        }

        int getMin() {
            return harr[0];
        }

        // Heapify
        void minHeapify(int i) {
            int l = left(i);
            int r = right(i);
            int smallest = i;

            if (l < heapSize && harr[l] < harr[smallest])
                smallest = l;

            if (r < heapSize && harr[r] < harr[smallest])
                smallest = r;

            if (smallest != i) {
                swap(i, smallest);
                minHeapify(smallest);
            }
        }

        void swap(int i, int j) {
            int temp = harr[i];
            harr[i] = harr[j];
            harr[j] = temp;
        }
    }

    // Driver code
    public static void main(String[] args) {
        MinHeap h = new MinHeap(11);

        h.insertKey(3);
        h.insertKey(2);
        h.deleteKey(1);
        h.insertKey(15);
        h.insertKey(5);
        h.insertKey(4);
        h.insertKey(45);

        System.out.print(h.extractMin() + " ");
        System.out.print(h.getMin() + " ");
        h.decreaseKey(2, 1);
        System.out.print(h.getMin());
    }
}
>>>>>>> a323358 (Initial commit)
