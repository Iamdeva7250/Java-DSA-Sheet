import java.util.*;
public class HashMapRemoveKey {
    public static void main(String[] args)  { 
        
        HashMap<String, Integer> map  = new HashMap<>(); 
        
        map.put("apple", 10); 
        map.put("bannana", 15); 
        map.put("fish", 20); 
       
        System.out.println("Original Map: " + map); 
        System.out.println("Size: " + map.size()); 
    
        // Removing a key
        map.remove("bannana");
        
        System.out.println("Updated Map: " + map); 
        System.out.println("Updated Size: " + map.size()); 
    
        for(Map.Entry<String, Integer>e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
  
}
