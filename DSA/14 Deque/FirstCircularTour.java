import java.util.*;
import java.io.*;

public class FirstCircularTour {

    int firstPetrolPump(int petrol[], int distance[], int n) {
        int start = 0, curr_petrol = 0, prev_petrol = 0;

        for (int i = 0; i < n; i++) {
            curr_petrol += petrol[i] - distance[i];

            // If petrol becomes negative, move start
            if (curr_petrol < 0) {
                start = i + 1;
                prev_petrol += curr_petrol;
                curr_petrol = 0;
            }
        }

        return (curr_petrol + prev_petrol >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        FirstCircularTour solution = new FirstCircularTour();
        int petrol[] = {4, 6, 7, 4};
        int distance[] = {6, 5, 3, 5};
        int n = petrol.length;

        int result = solution.firstPetrolPump(petrol, distance, n);
        System.out.println("Starting petrol pump index: " + result);
    }
}
