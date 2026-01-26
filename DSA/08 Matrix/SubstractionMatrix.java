public class SubstractionMatrix {
    public static void main(String[] args) {
        int a[][] = { { 5, 6, 7 }, { 8, 9, 10 }, { 11, 12, 13 } };

        int b[][] = { { 4, 5, 1 }, { 3, 1, 2 }, { 7, 9, 12 } };

        int c[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of two matrices:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
