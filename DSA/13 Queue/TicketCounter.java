import java.util.*;
import java.io.*;

public class TicketCounter {

    public static int distributeTicket(int N, int K) {
        int start = 1, end = N;
        boolean front = true;

        while (start <= end) {
            if (front) {
                for (int i = 0; i < K && start <= end; i++) {
                    if (start == end)
                        return start;
                    start++;
                }
            } else {
                for (int i = 0; i < K && start <= end; i++) {
                    if (start == end)
                        return end;
                    end--;
                }
            }
            front = !front;
        }
        return -1;
    }

    // Main method
    public static void main(String[] args) {
        int N = 10; // Total number of people
        int K = 2;  // Tickets distributed per turn

        int lastPerson = distributeTicket(N, K);
        System.out.println("The last person to get a ticket is at position: " + lastPerson);
    }
}