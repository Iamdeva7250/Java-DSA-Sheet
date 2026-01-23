import java.util.Scanner;
public class MagnetsProblem {

        // Function to calculate equilibrium points
        public static void points(int n, double magnets[], double getAnswer[]) {
            for (int i = 0; i < n - 1; i++) {
                double low = magnets[i];
                double high = magnets[i + 1];
                double mid = 0.0;

                // Binary search
                for (int iter = 0; iter < 100; iter++) {
                    mid = (low + high) / 2.0;
                    double force = 0.0;

                    for (int j = 0; j < n; j++) {
                        if (j <= i) {
                            force += 1.0 / (mid - magnets[j]); // magnets on left → positive
                        } else {
                            force -= 1.0 / (magnets[j] - mid); // magnets on right → negative
                        }
                    }

                    if (force > 0) {
                        low = mid;
                    } else {
                        high = mid;
                    }
                }

                getAnswer[i] = mid;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of magnets: ");
            int n = sc.nextInt();
            double[] magnets = new double[n];
            System.out.println("Enter positions of magnets (in increasing order):");
            for (int i = 0; i < n; i++) {
                magnets[i] = sc.nextDouble();
            }

            double[] getAnswer = new double[n - 1];
            points(n, magnets, getAnswer);

            System.out.println("Equilibrium points between magnets:");
            for (double ans : getAnswer) {
                System.out.printf("%.10f\n", ans);
            }

            sc.close();
        }
    }



