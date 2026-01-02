import java.util.*;

public class SortinSpecificOrder {

    // Method to sort array
    public void sortIt(int[] arr) {

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 != 0)
                odd.add(num);
            else
                even.add(num);
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        int i = 0;
        for (int x : odd) arr[i++] = x;
        for (int x : even) arr[i++] = x;
    }

    // MAIN method
    public static void main(String[] args) {
        SortinSpecificOrder obj = new SortinSpecificOrder();
        int[] arr = {1, 2, 3, 5, 4, 7, 10};
        obj.sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }
}
