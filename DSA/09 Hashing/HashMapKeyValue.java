import java.util.*;
public class HashMapKeyValue {
    public static void main(String[] args)  { 
        
        HashMap<String, Integer> map  = new HashMap<>(); 
        
        map.put("apple", 10); 
        map.put("bannana", 15); 
        map.put("fish", 20); 
       
        System.out.println(map); 
        System.out.println(map.size()); 
    
        for(Map.Entry<String, Integer>e : map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    } 
  
}
