import java.util.*;

public class GenerateNumberwithgivendigits {

    void generatenumber(int x) {
        Queue<String> q = new LinkedList<>();

        // Initial digits
        q.add("5");
        q.add("6");

        for (int count = 0; count < x; count++) {
            String curr = q.peek();
            System.out.println(curr);
            q.poll();

            q.add(curr + "5");
            q.add(curr + "6");
        }
    }

    public static void main(String[] args) {
        GenerateNumberwithgivendigits gnd = new GenerateNumberwithgivendigits();
        int x = 10;
        gnd.generatenumber(x);
    }
}
