import java.util.*;

public class HashSet2 {
    public static void main(String[] args) {

        // Creating an empty HashSet of string entries
        HashSet<String> hs = new HashSet<String>();

        // Adding elements to the set
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        // Iterating through the HashSet using an iterator
        Iterator<String> itr = hs.iterator();

        // Traversing elements and printing them
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }
        System.out.println();

        // Using enhanced for loop for traversal
        for (String s : hs) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
