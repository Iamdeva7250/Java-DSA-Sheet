import java.util.*;

public class LFUCache {

    class Node {
        int key, value, freq;
        Node prev, next;

        Node(int k, int v) {
            key = k;
            value = v;
            freq = 1;
        }
    }

    class DLL {
        Node head, tail;
        int size;

        DLL() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }

        void add(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size == 0) return null;
            Node node = tail.prev;
            remove(node);
            return node;
        }
    }

    private int capacity, minFreq;
    private Map<Integer, Node> keyMap;
    private Map<Integer, DLL> freqMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        minFreq = 0;
        keyMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!keyMap.containsKey(key)) return -1;

        Node node = keyMap.get(key);
        updateFreq(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (keyMap.containsKey(key)) {
            Node node = keyMap.get(key);
            node.value = value;
            updateFreq(node);
            return;
        }

        if (keyMap.size() == capacity) {
            DLL minList = freqMap.get(minFreq);
            Node evict = minList.removeLast();
            keyMap.remove(evict.key);
        }

        Node newNode = new Node(key, value);
        keyMap.put(key, newNode);
        freqMap.computeIfAbsent(1, k -> new DLL()).add(newNode);
        minFreq = 1;
    }

    private void updateFreq(Node node) {
        int freq = node.freq;
        DLL oldList = freqMap.get(freq);
        oldList.remove(node);

        if (freq == minFreq && oldList.size == 0) {
            minFreq++;
        }

        node.freq++;
        freqMap.computeIfAbsent(node.freq, k -> new DLL()).add(node);
    }
    public static void main(String[] args) {
        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);
        lfu.put(2, 2);
        System.out.println(lfu.get(1)); // returns 1
        lfu.put(3, 3);                  // evicts key 2
        System.out.println(lfu.get(2)); // returns -1 (not found)
        lfu.put(4, 4);                  // evicts key 1
        System.out.println(lfu.get(1)); // returns -1 (not found)
        System.out.println(lfu.get(3)); // returns 3
        System.out.println(lfu.get(4)); // returns 4
    }
}
