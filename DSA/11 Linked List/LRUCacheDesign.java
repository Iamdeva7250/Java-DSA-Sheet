import java.util.*;

class Node {
    int key;
    int value;
    Node pre;
    Node next;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCacheDesign {

    private HashMap<Integer, Node> map;
    private int capacity, count;
    private Node head, tail;

    // ✅ CONSTRUCTOR
    public LRUCacheDesign(int capacity) {
        this.capacity = capacity;
        this.count = 0;
        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.pre = head;
    }

    // Remove a node from DLL
    private void deleteNode(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    // Add node right after head
    private void addToHead(Node node) {
        node.next = head.next;
        node.pre = head;
        head.next.pre = node;
        head.next = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);
        deleteNode(node);
        addToHead(node);
        return node.value;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            deleteNode(node);
            addToHead(node);
        } else {
            Node node = new Node(key, value);
            map.put(key, node);

            if (count < capacity) {
                count++;
                addToHead(node);
            } else {
                // Remove LRU node
                map.remove(tail.pre.key);
                deleteNode(tail.pre);
                addToHead(node);
            }
        }
    }

    public static void main(String[] args) {

        LRUCacheDesign cache = new LRUCacheDesign(2);

        cache.set(1, 10);
        cache.set(2, 20);

        System.out.println(cache.get(1)); // 10

        cache.set(3, 30); // evicts key 2
        System.out.println(cache.get(2)); // -1

        cache.set(4, 40); // evicts key 1
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}
