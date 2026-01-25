

import java.util.*;
public class CollectionsReverseOrder {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer> ();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(30);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }
}
