//Collections.binarySearch()
//The Collections.binarySearch() method is a Collections class
// method in Java that returns position of an object in a sorted list.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//Searching an int key in a list sorted in ascending order:
public class CollectionBinarySearchMethods {
        public static void main(String[] args){
            List<Integer> al = new ArrayList<>();
            System.out.println("Searching an int key in a list sorted in ascending order:");
            al.add(1);
            al.add(2);
            al.add(3);
            al.add(10);
            al.add(20);


            // 10 is present at index 3.
            int index = Collections.binarySearch(al, 10);
            System.out.println(index);

            // 13 is not present. 13 would have been inserted
            // at position 4. So the function returns (-4-1)
            // which is -5.
            index = Collections.binarySearch(al, 15);
            System.out.println(index);


            System.out.println("Searching an int key in a list sorted in descending order.");
            al.add(100);
            al.add(50);
            al.add(30);
            al.add(10);
            al.add(2);

            // The last parameter specifies the comparator method
            // used for sorting.
            int result = Collections.binarySearch(al, 50,
                    Collections.reverseOrder());

            System.out.println("Found at index " + result);
        }
    }

