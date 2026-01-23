import java.util.Scanner;
public class FacingTheSum {

        // Function to count visible buildings
        static int countBuilding(int h[], int n) {
            int count = 1;           // First building is always visible
            int maxHeight = h[0];

            for (int i = 1; i < n; i++) {
                if (h[i] > maxHeight) {
                    count++;
                    maxHeight = h[i];
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input number of buildings
            System.out.print("Enter number of buildings: ");
            int n = sc.nextInt();

            int[] heights = new int[n];

            // Input building heights
            System.out.println("Enter building heights:");
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }

            // Call function and print result
            int visibleCount = countBuilding(heights, n);
            System.out.println("Number of visible buildings: " + visibleCount);

            sc.close();
        }
    }

