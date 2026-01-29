import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
 
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding duplicate element
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not: " + h.contains("India"));

        // Removing items
        h.remove("Australia");
        System.out.println("List after removing Australia: " + h);

        // Iterating over HashSet
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
   