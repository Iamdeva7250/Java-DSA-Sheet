import java.util.Scanner;
public class IshaanInternshipProb {


        // Function to get candidate
        static int getCandidate(int n, int k) {
            int i = 1;
            while (i * k <= n) {
                i = i * k;
            }
            return i;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.print("Enter k: ");
            int k = sc.nextInt();

            int result = getCandidate(n, k);
            System.out.println("Result: " + result);

            sc.close();
        }
    }


