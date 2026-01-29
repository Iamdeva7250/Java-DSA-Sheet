import java.util.*;
import java.io.*;

public class Numberscontaining123 {

    public static ArrayList<Integer> filterByDigits(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {

            int temp = Math.abs(num);

            if (temp == 0) continue;

            boolean valid = true;

            while (temp > 0) {
                int digit = temp % 10;

                if (digit != 1 && digit != 2 && digit != 3) {
                    valid = false;
                    break;
                }

                temp /= 10;
            }
            

            if (valid) {
                result.add(num);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1, 22, 345, 123, 7};

        ArrayList<Integer> ans = filterByDigits(arr);

        System.out.println("Numbers containing only digits 1, 2, or 3: " + ans);
    }
}
