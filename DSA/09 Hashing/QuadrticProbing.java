import java.util.*;

public class QuadrticProbing {

    public ArrayList<Integer> quadraticProbing(int[] arr, int m) {

        // initialize hash table with -1
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(m, -1));

        for (int num : arr) {
            int index = num % m;

            for (int i = 0; i < m; i++) {
                int newIndex = (index + i * i) % m;

                // if same value already exists, skip inserting duplicate
                if (result.get(newIndex) == num) {
                    break;
                }

                // empty slot found, place the number
                if (result.get(newIndex) == -1) {
                    result.set(newIndex, num);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        QuadrticProbing qp = new QuadrticProbing();
        int[] arr = {21, 10, 33, 43};
        int m = 5;
        System.out.println(qp.quadraticProbing(arr, m));
    }
}
