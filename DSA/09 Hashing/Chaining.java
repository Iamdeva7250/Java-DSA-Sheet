import java.util.*;

public class Chaining {  // Make sure the file is named Chaining.java
    int BUCKET;    // Number of buckets
    LinkedList<Integer>[] table;  // Array of buckets

    Chaining(int b) {
        this.BUCKET = b;
        table = new LinkedList[BUCKET]; // generic array creation
        for (int i = 0; i < BUCKET; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    int hashFunction(int x) {
        return x % BUCKET;
    }

    // Insert key
    void insertItem(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    // Delete key
    void deleteItem(int key) {
        int index = hashFunction(key);
        table[index].remove(Integer.valueOf(key)); // remove by object, not index
    }

    // Search key
    boolean searchItem(int key) {
        int index = hashFunction(key);
        return table[index].contains(key);
    }

    // Display hash table
    void displayHash() {
        for (int i = 0; i < BUCKET; i++) {
            System.out.print(i + " --> ");
            if (table[i].isEmpty()) {
                System.out.println("null");
            } else {
                for (Integer x : table[i]) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] a = {15, 11, 27, 8, 12};
        Chaining h = new Chaining(7);

        // Insert keys
        for (int key : a) {
            h.insertItem(key);
        }

        // Delete a key
        h.deleteItem(12);

        // Display table
        h.displayHash();

        // Search keys
        System.out.println("Search 11: " + h.searchItem(11)); // true
        System.out.println("Search 12: " + h.searchItem(12)); // false
    }
}
