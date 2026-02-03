import java.util.*;
import java.io.*;

public class LRUCache {
    
    // Your code here
     static class Node{
        int key, value;
        Node prev, next;
        
        
        Node(int k, int v){
            key = k;
            value = v;
        }
    }
    
    static int capacity;
    static HashMap<Integer, Node> map;
    static Node head, tail;

    LRUCache(int cap) {
        // code here
        capacity = cap;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    static void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    static void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public static int get(int key) {
        
        if(!map.containsKey(key))
        return -1;
        
        Node node = map.get(key);
        remove(node);
        insert(node);
        return node.value;
    }

        
    public static void put(int key, int value) {
        //  code here
        
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
            Node newNode = new Node(key, value);
            insert(newNode);
            map.put(key, newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1)); // returns 1
        lruCache.put(3, 3);                  // evicts key 2
        System.out.println(lruCache.get(2)); // returns -1 (not found)
        lruCache.put(4, 4);                  // evicts key 1
        System.out.println(lruCache.get(1)); // returns -1 (not found)
        System.out.println(lruCache.get(3)); // returns 3
        System.out.println(lruCache.get(4)); // returns 4
    }
    
}