import java.util.*;
import java.io.*;

public class TraversingaDeque {

    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();

        d.addFirst(10);
        d.addLast(20);
        d.addFirst(5);
        d.addLast(15);

        // Using Iterator
        System.out.print("Using Iterator: ");
        Iterator<Integer> it = d.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Using for-each loop
        System.out.print("Using for-each: ");
        for (int val : d) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
