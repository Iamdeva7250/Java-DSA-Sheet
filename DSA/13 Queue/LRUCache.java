import java.util.*;
import java.io.*;

public class LRUCache {
    
    // Your code here

    // Constructor for initializing the cache capacity with the given value.
    
    class Node{
        int key, value;
        Node prev, next;
        
        Node(int k, int v){
            key = k;
            value = v;
        }
    }
    
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;
    
    LRUCache(int cap) {
        // code here
        capacity = cap;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
        
    }
    
    private  void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    // Function to return value corresponding to the key.
    public int get(int key) {
        
        // your code here
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

    // Function for storing key-value pair.
        
    public void set(int key, int value) {
        // your code here
        if(capacity == 0) return;
        
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insert(node);
        }else{
            if(map.size() == capacity){
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node node = new Node(key, value);
            insert(node);
            map.put(key, node);
        }
    }
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.set(1, 10);
        cache.set(2, 20);
        System.out.println("Get key 1: " + cache.get(1)); 
        cache.set(3, 30); // evicts key 2
        System.out.println("Get key 2: " + cache.get(2));
        cache.set(4, 40); // evicts key 1
        System.out.println("Get key 1: " + cache.get(1)); 
        System.out.println("Get key 3: " + cache.get(3));
        System.out.println("Get key 4: " + cache.get(4)); 
    } 
    
}