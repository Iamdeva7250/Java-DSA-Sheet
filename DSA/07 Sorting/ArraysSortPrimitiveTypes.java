import java.util.*;
import java.util.Arrays;
public class ArraysSortPrimitiveTypes {
    public static void main(String[] args) {
        int[] arr1 = { 2, 1, 5, 7, 3, 4, 10, 9, };
        char[] arr2 = {'A', 'C', 'B', 'A', 'B', 'D'};

        Arrays.sort(arr1);
        System.out.println("Arrays is : " + Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println("String Sort is : " + Arrays.toString(arr2));
    }
}
