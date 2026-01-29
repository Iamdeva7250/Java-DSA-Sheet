import java.util.*;
public class HashMapRetriveKey {

  public static void main(String[] args) {
    HashMap<String, Integer> map  = new HashMap<>(); 
    
    map.put("apple", 10); 
    map.put("bannana", 15); 
    map.put("fish", 20); 
   
    System.out.println("Original Map: " + map); 
    System.out.println("Size: " + map.size()); 

    // Retrieving a value associated with a key
    int value = map.get("bannana");
    System.out.println("Value for key 'bannana': " + value);

    
        if (map.containsValue(15)) 
            System.out.println("Yes");
        else
            System.out.println("No");
        
        System.out.println(map.get("fish"));
        System.out.println(map.get("practice"));
  }
  
}
