import java.util.*;

class HashNode {
    int key;
    int value;

    HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class HashMapLinearProbing {
    private final int CAPACITY = 20;
    private HashNode[] table;
    private HashNode dummy;
    private int size;

    public HashMapLinearProbing() {
        table = new HashNode[CAPACITY];
        dummy = new HashNode(-1, -1);
        size = 0;
    }

    // Hash function
    private int hashFunction(int key) {
        return key % CAPACITY;
    }

    // Insert key-value pair
    public void insert(int key, int value) {
        HashNode node = new HashNode(key, value);
        int hashIndex = hashFunction(key);

        // Linear probing to find empty slot
        while (table[hashIndex] != null && table[hashIndex].key != key && table[hashIndex].key != -1) {
            hashIndex = (hashIndex + 1) % CAPACITY;
        }

        if (table[hashIndex] == null || table[hashIndex].key == -1) {
            size++;
        }

        table[hashIndex] = node;
    }

    // Delete key
    public boolean delete(int key) {
        int hashIndex = hashFunction(key);
        int counter = 0;

        while (table[hashIndex] != null && counter < CAPACITY) {
            if (table[hashIndex].key == key) {
                table[hashIndex] = dummy;
                size--;
                return true;
            }
            hashIndex = (hashIndex + 1) % CAPACITY;
            counter++;
        }
        return false; // key not found
    }

    // Search key
    public int find(int key) {
        int hashIndex = hashFunction(key);
        int counter = 0;

        while (table[hashIndex] != null && counter < CAPACITY) {
            if (table[hashIndex].key == key)
                return table[hashIndex].value;
            hashIndex = (hashIndex + 1) % CAPACITY;
            counter++;
        }
        return -1; // key not found
    }

    // Display table (optional)
    public void display() {
        for (int i = 0; i < CAPACITY; i++) {
            if (table[i] != null && table[i].key != -1)
                System.out.println(i + " --> Key: " + table[i].key + ", Value: " + table[i].value);
            else
                System.out.println(i + " --> null");
        }
    }
}

// Driver program
public class OpenAddressingHashing {
    public static void main(String[] args) {
        HashMapLinearProbing map = new HashMapLinearProbing();

        map.insert(1, 5);
        map.insert(2, 15);
        map.insert(3, 20);
        map.insert(4, 7);

        System.out.println("Value of Key 4: " + map.find(4));

        if (map.delete(4))
            System.out.println("Key 4 deleted successfully");
        else
            System.out.println("Key 4 not found");

        System.out.println("Value of Key 4: " + map.find(4));
        
        System.out.println("\nHash Table:");
        map.display();
    }
}
